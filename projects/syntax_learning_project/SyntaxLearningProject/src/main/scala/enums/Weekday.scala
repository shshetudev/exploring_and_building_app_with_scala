package enums

object Weekday extends Enumeration {
  val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
}

object WeekdayWithStringValues extends Enumeration {
  val Monday = Value("Mo.")
  val Tuesday = Value("Tu.")
  val Wednesday = Value("We.")
  val Thursday = Value("Th.")
  val Friday = Value("Fr.")
  val Saturday = Value("Sa.")
  val Sunday = Value("Su.")
}

object WeekdayWithIntValues extends Enumeration {
  val Monday = Value(1)
  val Tuesday = Value(2)
  val Wednesday = Value(3)
  val Thursday = Value(4)
  val Friday = Value(5)
  val Saturday = Value(6)
  val Sunday = Value(0)
}