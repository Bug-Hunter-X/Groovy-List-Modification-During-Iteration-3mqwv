# Groovy List Modification During Iteration

This repository demonstrates a common error in Groovy: modifying a list while iterating over it using `eachWithIndex`.  The `bug.groovy` file contains code that exhibits this problem. The solution is provided in `bugSolution.groovy`.

The issue arises because removing an element shifts the indices of subsequent elements.  This causes the loop to skip elements unexpectedly.

The solution illustrates safer ways to iterate and modify a list.