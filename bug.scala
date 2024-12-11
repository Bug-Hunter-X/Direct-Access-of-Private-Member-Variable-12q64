```scala
class MyClass {
  private var internalValue: Int = 0

  def updateValue(newValue: Int): Unit = {
    internalValue = newValue
  }

  def getValue: Int = internalValue
}

object Main extends App {
  val myObject = new MyClass
  myObject.updateValue(10)
  println(myObject.getValue) // Output: 10

  //Trying to access internalValue directly
  println(myObject.internalValue) //Compile time error
}
```