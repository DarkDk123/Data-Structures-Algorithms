"""
This is a `python` implementation of Queue using stacks (lists).
With amortized complexity!
"""
class MyQueue:
    def __init__(self) -> None:
        self.main_stack = []
        self.helper_stack = []

    def push(self, x: int) -> None:
        while self.helper_stack:
            self.main_stack.append(self.helper_stack.pop())

        self.main_stack.append(x)

    def pop(self) -> int:
        while self.main_stack:
            self.helper_stack.append(self.main_stack.pop())

        return self.helper_stack.pop()

    def peek(self) -> int:
        while self.main_stack:
            self.helper_stack.append(self.main_stack.pop())

        return self.helper_stack[-1]

    def empty(self) -> bool:
        return not (self.main_stack or self.helper_stack)


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()