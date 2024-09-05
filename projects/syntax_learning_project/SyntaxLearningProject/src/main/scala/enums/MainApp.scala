package enums

object MainApp extends App {
  /*
  * With Enums we can not go for run time pattern matching, because Enums are not case classes.
  * */
// printing Weekday
  println("Printing Weekday Enum:")
  println(Weekday.Monday)
  println(Weekday.values)
  println(Weekday.withName("Monday"))
  println(Weekday.Monday.id + "\n")

  // printing WeekdayWithStringValues
  println("Printing WeekdayWithStringValues Enum:")
  println(WeekdayWithStringValues.Monday)
  println(WeekdayWithStringValues.values)
  println(WeekdayWithStringValues.withName("Mo."))
  println(WeekdayWithStringValues.Monday.id + "\n")

  // printing WeekdayWithIntValues
  println("Printing WeekdayWithIntValues Enum:")
  println(WeekdayWithIntValues.Monday)
  println(WeekdayWithIntValues.values)
  println(WeekdayWithIntValues.Monday.id + "\n")
}
