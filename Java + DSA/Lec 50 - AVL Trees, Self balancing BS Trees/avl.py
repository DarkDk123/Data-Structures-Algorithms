"""Implementing an AVL Tree (self-balancing binary search tree) in Python for revision of concepts!!"""

from typing import Literal, Optional, Sequence, TypeVar, Generic

T = TypeVar("T")


class AVL(Generic[T]):
    class Node:
        def __init__(self, val: T) -> None:
            self.left: Optional[AVL.Node] = None
            self.right: Optional[AVL.Node] = None
            self.val = val
            self.__height = 0

        def get_height(self):
            return self.__height

        def set_height(self, val):
            self.__height = val

    def __init__(self) -> None:
        self.root: Optional[AVL[T].Node] = None

    def get_height(self):
        """Get height of the Entire Tree"""
        return self._get_height(self.root)

    def _get_height(
        self, node: Optional["AVL[T].Node"] = None
    ) -> int:  # Forward reference BST.Node, so quoted in String!!
        """Get height of the subtree rooted at node"""
        return -1 if node is None else node.get_height()

    def is_balanced(self, node: Optional["AVL.Node"] = None) -> bool:

        def _is_bal(node: Optional[AVL[T].Node] = None) -> bool:
            if node is None:
                return True

            if abs(self._get_height(node.left) - self._get_height(node.right)) <= 1:
                return _is_bal(node.left) and _is_bal(node.right)

            return False

        return _is_bal(node if node else self.root)

    def insert(self, val: T) -> "AVL[T].Node":

        def _insert(val: T, node: Optional[AVL[T].Node] = None):
            if node is None:
                return AVL.Node(val)

            if val > node.val:  # type: ignore
                node.right = _insert(val, node.right)

            else:
                node.left = _insert(val, node.left)

            node.set_height(
                max(self._get_height(node.left), self._get_height(node.right)) + 1
            )

            # Check if needs balancing!
            if not self.is_balanced(node):
                node = self.rotate(node)

            return node

        self.root = _insert(val, self.root)
        return self.root

    def rotate(self, node: "AVL.Node") -> "AVL.Node":
        """Rotate an unbalanced node we're sure about."""

        def right_rotate(node: AVL.Node) -> AVL.Node:
            """Right rotate a left-left heavy tree"""

            temp: AVL.Node = node.left
            temp2: AVL.Node = temp.right

            temp.right = node
            node.left = temp2

            # Update the heights
            node.set_height(
                max(self._get_height(node.left), self._get_height(node.right)) + 1
            )
            temp.set_height(
                max(self._get_height(temp.left), self._get_height(temp.right)) + 1
            )

            return temp

        def left_rotate(node: AVL.Node) -> AVL.Node:
            """Left rotate a right-right heavy tree"""

            temp: AVL.Node = node.right  # type: ignore
            temp2: AVL.Node = temp.left  # type: ignore

            temp.left = node
            node.right = temp2

            # Update the heights
            node.set_height(
                max(self._get_height(node.left), self._get_height(node.right)) + 1
            )
            temp.set_height(
                max(self._get_height(temp.left), self._get_height(temp.right)) + 1
            )

            return temp

        if (self._get_height(node.left) - self._get_height(node.right)) > 1:
            # Left-heavy
            if (self._get_height(node.left.left) - self._get_height(node.left.right)) > 0:  # type: ignore
                # Left-Left
                node = right_rotate(node)
            else:
                # Left-Right
                node.left = left_rotate(node.left)  # type: ignore
                node = right_rotate(node)

        else:
            # Right-Heavy
            if (self._get_height(node.right.left) - self._get_height(node.right.right)) < 0:  # type: ignore
                # Right-Right
                node = left_rotate(node)

            else:
                # Right-Left
                node.right = right_rotate(node.right)  # type: ignore
                node = left_rotate(node)

        return node

    def __str__(self) -> str:
        self.__display(self.root)
        return "\nDONE!" if self.root else "\nNo Tree to Show!!"

    def __display(self, node: Optional["AVL[T].Node"], level: int = 0) -> None:
        if node is None:
            return

        self.__display(node.right, level + 1)

        if level != 0:
            print(*("|\t" for _ in range(level - 1)), end="")
            print(f"|----> {node.val}")

        else:
            print(f"|{node.val}|")

        self.__display(node.left, level + 1)

    def insert_all(self, items: Sequence[T]) -> bool:
        try:
            for item in items:
                self.insert(item)

            return True
        except (TypeError, ValueError):
            return False

    def insert_sorted(self, items: Sequence[T]) -> bool:
        if not items:
            return True
        try:
            start, end = 0, len(items) - 1
            mid = (start + end) // 2
            self.insert(items[mid])

            # Insert left & right half
            self.insert_sorted(items[:mid])
            self.insert_sorted(items[mid + 1 :])

            return True

        except (TypeError, ValueError):
            return False

    # All 3 DFS traversals

    def __dfs_traverse(
        self, node: Optional["AVL[T].Node"], traverse: Literal["pre", "in", "post"]
    ):
        if node is None:
            return

        if traverse == "pre":
            print(f"--> {node.val}", end="")

        self.__dfs_traverse(node.left, traverse)

        if traverse == "in":
            print(f"--> {node.val}", end="")

        self.__dfs_traverse(node.right, traverse)

        if traverse == "post":
            print(f"--> {node.val}", end="")

    # Pre-Order
    def pre_order(self):
        print("| start ", end="")
        self.__dfs_traverse(self.root, "pre")
        print(" ---> END |")

    # In-Order
    def in_order(self):
        print("| start ", end="")
        self.__dfs_traverse(self.root, "in")
        print(" ---> END |")

    def post_order(self):
        print("| start ", end="")
        self.__dfs_traverse(self.root, "post")
        print(" ---> END |")


if __name__ == "__main__":
    avlTree = AVL[int]()

    avlTree.insert_all(
        # Upon being unbalanced it balances itself automatically!
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
    )

    print("Pre-order Traversal")
    avlTree.pre_order()

    print("In-order Traversal")
    avlTree.in_order()

    print("Post-order Traversal")
    avlTree.post_order()

    print(avlTree)
    print("Is balanced? : ", avlTree.is_balanced())
    print("Height of the Tree", avlTree.get_height())
