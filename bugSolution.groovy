```groovy
def myMethod(List<String> list) {
  // Solution 1: Create a copy to iterate
  //List<String> copyList = new ArrayList<>(list)
  //copyList.eachWithIndex { element, index ->
  //  if (index == 1) {
  //    list.remove(element)
  //  }
  //}

  //Solution 2: Iterate in reverse
  for (int i = list.size() -1; i >=0; i--) {
    if (i == 1) {
      list.remove(i)
    }
  }

  list.eachWithIndex { element, index ->
    println "Element at index $index: $element"
  }
}

List<String> myList = ['a', 'b', 'c', 'd']
myMethod(myList)
```