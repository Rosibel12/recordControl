package com.example.recordcontrol



import android.os.Build
import androidx.annotation.RequiresApi
import edu.itvo.checkinout.Employee
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime

@RequiresApi(Build.VERSION_CODES.O)
fun main(){
    val period = Period(initialDate = LocalDate.parse("2022-08-16"),
        finalDate = LocalDate.parse("2022-12-31"),
        description = "Agosto - Diciembre 2022")

    val employee =
        Employee(id = 1,
            fullName = "Rosibel Lopez Sanchez",
            academicLevel = AcademicLevel.ASSOCIATE,
            curp = "lOSR010124MOCRMMRA4",
            dateOfAdmission = LocalDate.parse("2000-05-16"),
            budgetKey = "000123456789"
        )

    val scheduleDetails =  ArrayList<Schedule.Detail> ()

    scheduleDetails.add(Schedule.Detail(dayOfWeek= DayOfWeek.MONDAY,
        checkIn= LocalTime.parse("08:00:00"),
        checkOut= LocalTime.parse("16:00:00")))
    scheduleDetails.add(Schedule.Detail(dayOfWeek= DayOfWeek.TUESDAY,
        checkIn= LocalTime.parse("08:00:00"),
        checkOut= LocalTime.parse("16:00:00")))
    scheduleDetails.add(Schedule.Detail(dayOfWeek= DayOfWeek.WEDNESDAY,
        checkIn= LocalTime.parse("08:00:00"),
        checkOut= LocalTime.parse("16:00:00")))
    scheduleDetails.add(Schedule.Detail(dayOfWeek= DayOfWeek.THURSDAY,
        checkIn= LocalTime.parse("08:00:00"),
        checkOut= LocalTime.parse("17:00:00")))


    val schedule = Schedule.Builder(employee = employee, period=period)
        .addOne(Schedule.Detail(dayOfWeek = DayOfWeek.FRIDAY,
            checkIn = LocalTime.parse("10:00:00"),
            checkOut = LocalTime.parse("16:00:00")))
        .addMany(scheduleDetails)
        .build()

    val permissions = listOf(
        Permission(employee = employee,LocalDate.parse("2022-09-07"),
            justification = "Dolor de muela")
    )

    val checksInOut= ArrayList<CheckInOut>()
    checksInOut.add(
        CheckInOut(employee = employee,date=LocalDate.parse("2022-09-01"),
            checkIn = LocalTime.parse("08:25:00"),
            checkOut = LocalTime.parse("17:00:00")))
    checksInOut.add(
        CheckInOut(employee = employee,date=LocalDate.parse("2022-09-02"),
            checkIn = LocalTime.parse("10:05:00"),
            checkOut = LocalTime.parse("16:00:00")))
    checksInOut.add(
        CheckInOut(employee = employee,date=LocalDate.parse("2022-09-05"),
            checkIn = LocalTime.parse("08:50:00"),
            checkOut = LocalTime.parse("16:05:00")))
    checksInOut.add(
        CheckInOut(employee = employee,date=LocalDate.parse("2022-09-06"),
            checkIn = LocalTime.parse("08:00:00"),
            checkOut = LocalTime.parse("16:00:00")))
    checksInOut.add(
        CheckInOut(employee = employee,date=LocalDate.parse("2022-09-07"),
            checkIn = LocalTime.parse("08:00:00"),
            checkOut = LocalTime.parse("15:00:00")))
    checksInOut.add(
        CheckInOut(employee = employee,date=LocalDate.parse("2022-09-08"),
            checkIn = LocalTime.parse("08:10:00"),
            checkOut = LocalTime.parse("18:10:00")))
    checksInOut.add(
        CheckInOut(employee = employee,date=LocalDate.parse("2022-09-09"),
            checkIn = LocalTime.parse("10:10:00"),
            checkOut = LocalTime.parse("16:00:00")))
    checksInOut.add(
        CheckInOut(employee = employee,date=LocalDate.parse("2022-09-12"),
            checkIn = LocalTime.parse("08:05:00"),
            checkOut = LocalTime.parse("16:10:00")))
    checksInOut.add(
        CheckInOut(employee = employee,date=LocalDate.parse("2022-09-13"),
            checkIn = LocalTime.parse("08:00:00"),
            checkOut = LocalTime.parse("16:05:00")))
    checksInOut.add(
        CheckInOut(employee = employee,date=LocalDate.parse("2022-09-14"),
            checkIn = LocalTime.parse("08:00:00"),
            checkOut = LocalTime.parse("17:00:00")))
    checksInOut.add(
        CheckInOut(employee = employee,date=LocalDate.parse("2022-09-15"),
            checkIn = LocalTime.parse("08:00:00"),
            checkOut = LocalTime.parse("17:00:00")))


    val incident = Incident(employee = employee, currentSchedule = schedule,
        checksInOut = checksInOut, permissions= permissions,
        initialDate =LocalDate.parse("2022-09-01"),
        finalDate = LocalDate.parse("2022-09-15"))

    println("Employee ${employee.fullName} has ${incident.getAbsences()} absences " )


}
