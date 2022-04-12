https://blog.penjee.com/passing-by-value-vs-by-reference-java-graphical/
https://www.infoworld.com/article/3512039/does-java-pass-by-reference-or-pass-by-value.html

Java variables are passed by value, meaning that a copy of the value is passed.

Just remember that the copied value points to a real object in the Java memory heap. Passing by value still changes the value of the real
object.

What to remember about object references

# Java always passes parameter variables by value.

Object variables in Java always point to the real object in the memory heap.

A mutable object’s value can be changed when it is passed to a method.

An immutable object’s value cannot be changed, even if it is passed a new value.

"Passing by value" refers to passing a copy of the value.

"Passing by reference" refers to passing the real reference of the variable in memory.
