object Basics extends App {
  /*
  - I am considering a school management application as the contexts
  - Semicolons are optional here
  * */

  // Data types
  val numberOfStudentsInClassNine: Int = 50 // integer type, var: variable, val: constant
  val areAllOfClassNineArePresentToday = true // boolean type, type is optional, so both (:boolean) or no interference is ok

  val numberOfStudentsInClassTen: Int = 40 // integer type, var: variable, val: constant
  val areAllOfClassTenArePresentToday = false // boolean type, type is optional, so both (:boolean) or no interference is ok
  val totalStudentPresentTodayOfClassTen = 30
  // Strings
  val morningShift = "Morning"
  val dayShift = "Day"
  val schoolName = "Monipur" + " " + "Uccha" + " " + "Biddaloy" //composed string
  val className = "Six"
  val classDescription = s"Class $className of $schoolName has two shifts. They are $morningShift and $dayShift." // interpolated string

  // Expressions
  val totalNumberOfStudents = numberOfStudentsInClassTen + numberOfStudentsInClassNine
  val totalAttendanceToday = numberOfStudentsInClassNine + totalStudentPresentTodayOfClassTen
  // If..else
  val attendanceEvaluationForToday = if (totalAttendanceToday > totalNumberOfStudents * .80) "Excellent" else "Poor" // ternary operation work
  val attendanceEvaluationForYear = {
    if (totalAttendanceToday * 240 >= totalNumberOfStudents * 240 * .80) "Excellent throughout the year"
    else if (totalAttendanceToday * 240 >= totalNumberOfStudents * 240 * .70) "Very Good throughout the year"
    else if (totalAttendanceToday * 240 >= totalNumberOfStudents * 240 * .65) "Good throughout the year"
    else "Average throughout the year"
  }

  // Code Blocks: is also an Expression
  /*
  Background:
    - We consider two students from class 10 as samples who are named as jhon and david.
   */
  val obtainedMarksOfDavidInMath = 90
  val obtainedMarksOfJhonInMath = 75

  //Function
  def calculatedGPA(mark: Int): String = {
    var obtainedGPA = "F"
    if (mark >= 80) obtainedGPA = "A+"
    else if (mark >= 70) obtainedGPA = "A"
    else if (mark >= 60) obtainedGPA = "A-"
    else if (mark >= 50) obtainedGPA = "B"
    else if (mark >= 40) obtainedGPA = "C"
    else if (mark >= 33) obtainedGPA = "D"
    else obtainedGPA = "F"
    obtainedGPA
  }

  // Recursive function
  def factorial(n: Int): Int = {
    if (n<=1) 1
    else n*factorial(n-1)
  }

  // In Scala we use Recursion instead of loops or iterations
  // The Unit type == no meaningful value == "void" in other languages
  println("This is a great school")

  def printStudentGPA(gpa: String): Unit = {
    println(s"This student's GPA is: $gpa")
  }
  printStudentGPA(calculatedGPA(45))

}
