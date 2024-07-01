## String Buffer Object

StringBuffer is a mutable sequence of characters.



### Advantages over String

- **Mutable** - can be modified inplace!
- **Efficient** - space efficient!

- **Thread safe** - safety for data access and modification over multiple threads!

### Compare with StringBuilder

- StringBuilder is not **ThreadSafe** making it faster!

- StringBuffer is slower due to Thread Safety!

- Use StringBuilder when working without Threads, else StringBuffer!

Exploring StringBuffer - it's methods are just same as a normal String! See [Here](LearnStringBuffer.java).

Also, generating *random strings* with java *random module* efficiently with StringBuffer! [Here](./RandomString.java).

Also for data formatting intro [Here](./LearnStringBuffer.java#L55).

There are a lot of these formatting classes, exploring documentation can be beneficial when learning them!!