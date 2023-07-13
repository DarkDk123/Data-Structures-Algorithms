## Recursive Algorithm's Complexities.

* Analysed Recursive fibonacci program's space complexity.

* Points to remember during recursive algo. analysis.
                
        * No Function calls that are at the same level in recursion tree can be in the STACK at the same TIME.

        * Only the func. calls that are inter-linked can be in the STACK at the same TIME.

* Above points concludes that recursive fibonacci has a SPACE COMPLEXITY of O(n) | n = height of the recursive tree.

## Types of Recursion (Recurrence Relations)

**1. Linear Recurrence Relation. :** Relation in which recursion is solved in smaller chunks. i.e. Fibonacci sequence using recursion.

**2. Divide & Conquer Recurrence Relation. :** Relation in which Problem is divided into multiple halfs i.e. Binary search using recursion.


## Divide & Conquer methods:
 There are many different methods to solve it.

1. **Plug & Chug**
2. **Master's Theorem**
3. **Akra Bazzi :** It was developed in 1996, we'll learn this to solve any **divide & conquer recurrence relation**.

**Form of divide and conquer recursions:** T(n) = a1 * T(b1n + f1(n)) + ... + g(x).
   
## Akra-bazzi Method :
The general form of the Akra-Bazzi formula is as follows:

**we have:** T(n) = ∑[k=1 to r] a(k) * T(b(k) * n + h(k)) (recurrence relation)

**Here:**

* T(n) represents the time complexity of the algorithm for an input size of n.
  
* a(k), b(k), and h(k) are coefficients associated with each term in the sum.
* r is the number of terms in the sum.
   
---
  
**Formula :** 

<img title="a title" alt="Alt text" src="images/formula.png">

### Here:

* we have to find ***p*** by the formulae : 
  
  <img title="a title" alt="Alt text" src="images/p-formula.png">

* There are many intuitions to find ***p*** that i'm unable to share here.
* ***g(u)*** is the last function at the recurrence form (After all the Recursion expressions).

### Benefits

1. Easier with many of the recurrence relations.
2. It can solve much complex recurrences with complex coefficients.
3. Easier over ***master's theorem & drawing tree***.
---

### **Method to Solve 'Homogeneous' Linear Recurrences :**

**Form of Linear recursions:** 

<img title="a title" alt="Alt text" src="images/quadratic.png">
(eq. (1) put your equation here)

---

**Step 1 :**

* put f(x)= β<sup>x</sup> (beta<sup>x</sup>), f(x-1)=β<sup>x-1</sup> and so on.
* The simplified eq. is called ***Characteristic eq. of recurrence***.
* Solve the simplified equation and get all the roots.

**Step 2 :**

* Build a equation by substituting this roots as '*x1, x2 ... xn*' in : 

<img title="a title" alt="Alt text" src="images/step-2.png"> **where all *n* lie in the power**.

* Consider it as eq. (2)
  
**Step 3 :** 

* **Fact :** No. of roots == no. of solutions we have.
* *For Example:* **f(0)=0** is a slution we have, solve this using eq.(2), do the same for all the roots.

* You may have found the constants now i.e. C1, C2 ... etc.

* Now put this constants into eq.(2).

* The resulted formula can be used to solve the corresponding recurrence relations.

* Further Simplify this by the rules of Complexity, to get the actual **Time Complexity**.

---

### **Exception :** Duplicate Roots 
<br>

If we got multiple duplicate roots  from the **Characteristics Equation** from **Step 1**, then use missing roots from the form below : 

<br>

<img title="a title" alt="Alt text" src="images/IfRepeatedRoots.jpg">



---
## **Non-Homogeneous Linear Reccurrences:**

* A Non-Homogeneous Linear Reccurrence is just have an extra function **'g(x)'** at the end of the given form:
  
  <img title="a title" alt="Alt text" src="images/quadratic.png"> + **g(x)**


* A Little Different approach is used to solve these Linear Reccurrences.

 ---

**Step 1 :**

* Just Put **g(x) =0** in the given equation.

The Below Steps are Same as Homogeneous Linear Reccurrence : 
* put f(x)= β<sup>x</sup> (beta<sup>x</sup>), f(x-1)=β<sup>x-1</sup> and so on.
  
* The simplified eq. is called ***Characteristic eq. of recurrence***.

* Solve the Characteristic equation and get all the roots.

* Build a equation by substituting this roots as '*x1, x2 ... xn*' in : 

  <img title="a title" alt="Alt text" src="images/step-2.png"> **where all *n* lie in the power**.

* It's Called **General/Homogeneous Solution**. Consider it as eq. (1)

**Step 2 :** 

Find Particular Solution:

* Put given **g(x)** equal to the **Characteristic Equation** | *Consider it **Eq. (2)***.
  
* Now guess something similar to **g(x), [Guessing Method is at the bottom.](#guess-method)** You'll have Something like: **f(x)=C*g(x)**. | *Consider it **Eq.(3)***
  
  *i.e. if g(n) = n <sup>2</sup>, guess a degree 2 polynomial.*

* Put f(x) = guessed, in **eq. (2)**, then Find the **Value of all 'C'.**
* Now Put all the **'C'**  in **eq. (3).**
* You'll have the **Particular Solution**. 

**Step 3 :**
* Add Both 'Homogeneous' & 'particular' solutions together. | **eq. (4)**
  
* Now use given solutions like: **f(0) = 0** etc. to find value of Constants i.e. **C1, C2** etc.
  
* Put these **C** values in eq. (4). **| It's Your Answer**.

---
## **Guess Method:**
### How to Guess For Particular Solution at Step 2.

1. If **g(x)** is a **Exponential** like **2<sup>n</sup>**, then:
          
        Add Constants as Coefficients.
        i.e. a*2^n etc.

2. If **g(x)** is a Polynomial like **n <sup>2</sup> - 1**, then:
   
        Guess Polynomial of same degree
        i.e. a*x^2 + b*x * c

3. If **g(x)** is a Combination (Exponential + Polynomial).

        Then Do the same as above two steps, just apply them distinctly. 

* If with above steps, you fail to get the correct Particular solution.
  
  1.  For Example you guessed **f(x)=a*2<sup>n<sup>** & it fails.
   
  2.  Then Guess **f(x)=(a*n+b)\*2<sup>n</sup>**.
  3.  If Fails again then increase polynomial power | guess **f(x)=(a*n+b)\*2<sup>n</sup>**.
  4.  Keep Trying untill it works.