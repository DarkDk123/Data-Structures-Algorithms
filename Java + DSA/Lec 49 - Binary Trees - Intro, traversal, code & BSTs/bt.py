from typing import TypeVar, Optional, Generic, Callable

T = TypeVar("T", int, str, float)  # generic type for binary tree node value
T_func = TypeVar(
    "T_func", bound=Callable[[str], T]
)  # generic type for function that takes str and returns T


class BT(Generic[T]):
    """Simple binary tree implementation, that takes direct inputs and shows the tree afterwards!"""

    class Node:
        def __init__(self, val: T) -> None:
            """Node constructor, takes a value of type T"""
            self.val: T = val
            self.left: Optional[BT.Node] = None  # left child of the node
            self.right: Optional[BT.Node] = None  # right child of the node

    def __init__(self, t_func: T_func) -> None:
        """Binary tree constructor, takes a function that takes a string and returns a value of type T"""
        self.root: Optional[BT.Node] = None  # root of the binary tree
        self.t_func = t_func  # function to convert string to type T

    def populate(self, node: Optional[Node] = None) -> None:
        """Function to populate the tree using user input. It recursively prompts the user to enter the left and right child of the current node."""
        if node is None:
            val = self.t_func(input("Enter value of root node: "))
            self.root = self.Node(val)
            node = self.root  # Update node for recursion

        if node:
            left_val = input(
                "Enter left child of " + str(node.val) + " (blank if none): "
            )
            if left_val:
                node.left = self.Node(self.t_func(left_val))
                self.populate(node.left)

            right_val = input(
                "Enter right child of " + str(node.val) + " (blank if none): "
            )
            if right_val:
                node.right = self.Node(self.t_func(right_val))
                self.populate(node.right)

    def display(self, root: Node = None, level: int = 0) -> None:
        """Function to display the binary tree in a nice format."""
        if root is None:
            root = self.root

        if root.right:
            self.display(root.right, level + 1)

        if level != 0:
            for i in range(level):
                print("|\t", end="")

            print("|---> ", root.val)

        else:
            print("| ", root.val)

        if root.left:
            self.display((root.left), level + 1)


if __name__ == "__main__":
    bt = BT[str](str)
    bt.populate()
    bt.display()
