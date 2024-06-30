# Segment Trees & Range Queries

Segment trees are used to efficiently manage and query large ranges, intervals of data.

In short they:

- Divide a large array into smaller segments ( intervals )
- Store aggregate information (e.g., sum, min, max) for each segment
- Allow fast queries for:
    - Range sum (e.g., sum of elements in a range)
    - Range minimum/maximum
    - Updates (e.g., increment a range)

By using segment trees, we can reduce the time complexity of range queries from $O(n)$ to $O(log \ n)$ or even $O(1)$, depending on the specific use case!


### Used when?

- Whenever we need to perform some *queries on a range or interval* in efficient time i.e. $O(log \ n)$, then we use **Segment Trees**.
  
- They leads to efficient operations like search, update, query!

- But they require extra $O(n)$ storage!

|A Segment Tree from input array    |
|:-|
|![alt](https://media.geeksforgeeks.org/wp-content/cdn-uploads/segment-tree1.png)|


Segment Trees help reduce the time complexity for operations on it! like - 

- Update values in $O(log \ n)$ Time!
- Query in range in $O(log \ n)$ Time!
- Just takes $O(n)$ extra space!


### Code for Segment Trees are available [here](./SegmentTree.java).