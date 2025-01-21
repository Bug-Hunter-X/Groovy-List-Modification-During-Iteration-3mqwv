```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { element, index ->
    println "Element at index $index: $element"
    if (index == 1) {
      list.remove(element) // Modifying the list while iterating
    }
  }
}

List<String> myList = ['a', 'b', 'c', 'd']
myMethod(myList)
```