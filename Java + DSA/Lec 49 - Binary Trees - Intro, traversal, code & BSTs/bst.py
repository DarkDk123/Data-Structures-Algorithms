"""Implementing a binary search tree (not auto self-balancing) in Python for revision of concepts!!"""

from typing import Literal, Optional, Sequence, TypeVar, Generic

T = TypeVar("T")


class BST(Generic[T]):
    class Node:
        def __init__(self, val: T) -> None:
            self.left: Optional[BST.Node] = None
            self.right: Optional[BST.Node] = None
            self.val = val
            self.__height = 0

        def get_height(self):
            return self.__height

        def set_height(self, val):
            self.__height = val

    def __init__(self) -> None:
        self.root: Optional[BST[T].Node] = None

    def get_height(self):
        """Get height of the Entire Tree"""
        return self._get_height(self.root)

    def _get_height(
        self, node: Optional["BST[T].Node"] = None
    ) -> int:  # Forward reference BST.Node, so quoted in String!!
        """Get height of the subtree rooted at node"""
        return -1 if node is None else node.get_height()

    def is_balanced(self) -> bool:

        def _is_bal(node: Optional[BST[T].Node] = None) -> bool:
            if node is None:
                return True

            if abs(self._get_height(node.left) - self._get_height(node.right)) <= 1:
                return _is_bal(node.left) and _is_bal(node.right)

            return False

        return _is_bal(self.root)

    def insert(self, val: T) -> "BST[T].Node":

        def _insert(val: T, node: Optional[BST[T].Node] = None):
            if node is None:
                return BST.Node(val)

            if val > node.val:  # type: ignore
                node.right = _insert(val, node.right)

            else:
                node.left = _insert(val, node.left)

            node.set_height(
                max(self._get_height(node.left), self._get_height(node.right)) + 1
            )

            return node

        self.root = _insert(val, self.root)
        return self.root

    def __str__(self) -> str:
        self.__display(self.root)
        return "\nDONE!" if self.root else "\nNo Tree to Show!!"

    def __display(self, node: Optional["BST[T].Node"], level: int = 0) -> None:
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
        self, node: Optional["BST[T].Node"], traverse: Literal["pre", "in", "post"]
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
    bst = BST[int]()
    bst.insert_sorted(
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 20, 20, 20, 1, 1, 1,1]
    )

    print("Pre-order Traversal")
    bst.pre_order()

    print("In-order Traversal")
    bst.in_order()

    print("Post-order Traversal")
    bst.post_order()

    print(bst)
    print("Is balanced? : ", bst.is_balanced())
    print("Height of the Tree", bst.get_height())
