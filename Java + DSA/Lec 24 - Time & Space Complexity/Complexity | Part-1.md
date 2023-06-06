# *What is Complexity* 

It refers to the measure of the efficiency of an algorithm or computational problem in terms of amount of resourses requires. Especially it tells about two main resources - TIME & SPACE

## Time Complexity 
It's a function that shows the relationship b/w Time takes by an algorithm and the size of the input given to it. Shows how the time taken will grow along with the size of the input data.

                Time Complexity != Time Taken

## Space Complexity 

It refers to the relationship b/w memory/space required and input data size of an algorithm.


---
<br>

#  Why do we care abuot these Complexities ?

    Because a Good Complexity uses less amount of resources as input size grows,
    the efficiency of computation is great as we care to have less Complexities (Analysing These Complexities)



#  Things to consider when thinking about Complexities.
  
        
    1.  Always give more importance to Wrost case Complexity cause it has much adverse effects on output as compared to other cases.

    2. Always look and calculate Complexity for Large data as smaller data has limits and won't affect much, but 
        Large size of input data can cause problems to the efficiency of the algorithm.

    3. The actual values of the same Complexities may vary but there nature will always be same.
        In Complexities, we actually calculate the overall nature of the algorithm, we see things at bigger scales.

**"We don't worry About the Constants."**
        
    4. Always ignore less dominating terms i.e. if (O(n-cube + log(n))) to any dummy value, log(n) is not much significance.
        So, in Complexity analysis we tend to Ignore less dominating terms.



# Types of Complexities (Different natures of Complexities) :
       
        * Constant     |    O(1)
        * Logarithmic  |    O(log(n))
        * Linear       |    O(n)
        * Polynomial   |    O(n^x)  i.e. n^2, n^3 etc.
        * Exponential  |    O(2^n)
        * Factorial    |    O(n!)

    There are many more types of Complexities i.e. O(nlog(n)) etc.

# Types of Complexities

| ![Image 1](https://miro.medium.com/v2/resize:fit:1400/0*DsXCtz2xH0Ow6Uch.png)  | ![Image 2](https://storage.googleapis.com/algodailyrandomassets/curriculum/fundamentals/space1.png)  |
|:---:|:---:|
| Image 1 | Image 2 |

# Big-oh Notation

* It refers to the UpperBound/UpperLimit of the Complexity
* Provides Wrost possible case of an algorithm.
* Provides the Complexity that can't be exceeded by any input size.
* Gives max possible complexity of resources an algorithm can have.

       It's mathematically represented as Limits, hence limit shows a function behaviour approaching a particular value as output, when the input value approaches to a certain value. (Hence it  shows max output of a function | UpperBound)
        [This limit is UpperBound hence (lim < Infinity)].


# Big-Omega -> 

* refers to the LowerBound/LowerLimit of the Complexity.
* provide Best possible case of an algorithm.
* Provides the complexity that can't be greater than any other possible complexity. 
* Gives min. possible complexity of resources by an algorithm. 

        Mathematical representation is same in terms of limit just it is always greater than zero.
        i.e. [limit(Big-Omega) > 0].


# Big-theta 

* refers to the average case.
* gives a complexity in between the big-Oh and big-Omega.
* Average Complexity based on all the possible input values.

      * Mathematical representation : 
       [0 < limit[Big-theta] < infinity]

**These different notations are also termed as Asymptotic Notations.**

---

## There are two more : 

 **1. Little-Oh ->** It also refers to Upper bound but losely upper bound, and is a strict statement (notation).

 **2. Little-Omega ->** refers to losely lower bound, but says strict faster relation.
 
 ---

 ## Space Complexity & Auxiliary Space
 Space Complexity defined above.
 
 * Auxiliary Space is the extra space taken by an algorithm other than the input data space itself.

 * Done few mathematical questions about space complexity

 * **Recaping all the Sorting algorithms to calculate and compare their space complexities.**
  

<img alt="Alt text" src="images/Complexity.png">
            
***Complexities of sorting algorithms***