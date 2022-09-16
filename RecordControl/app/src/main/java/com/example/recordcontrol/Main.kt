package com.example.recordcontrol

import java.util.*

fun main () {
    val horarioAmadeo1Al15 = Horario("1", horaEntrada = "7:00", horaSalida = "15:00",fechaInicial = Date(), fechaFinal =  Date())
    val horarioAmadeo16Al30 = Horario("1", horaEntrada = "7:00", horaSalida = "15:00",fechaInicial = Date(), fechaFinal =  Date())


    val amadeo = Personal("1", "MAMADEO VARGAS", "MOGK", fechaIngreso = Date(), "H", "CLAVE")


    val entradasSalidas = listOf(

        EntradaSalida("1", dia =  Date(1662033603000), "7:00", "15:00"),
        EntradaSalida("1", dia =  Date(1662120003000), "7:00", "15:00"),
        EntradaSalida("1", dia =  Date(), "7:00", "15:00"),
        EntradaSalida("1", dia =  Date(), "7:00", "15:00"),
        EntradaSalida("1", dia =  Date(), "7:11", "15:00"),
        EntradaSalida("1", dia =  Date(), "7:00", "15:00"),
        EntradaSalida("1", dia =  Date(), "7:00", "15:00"),
        EntradaSalida("1", dia =  Date(), "7:00", "15:00"),
        EntradaSalida("1", dia =  Date(), "7:00", "15:00"),
        EntradaSalida("1", dia =  Date(), "7:00", "15:00"),
        EntradaSalida("1", dia =  Date(), "7:00", "15:00"),
        EntradaSalida("1", dia =  Date(), "7:00", "15:00"),
        EntradaSalida("1", dia =  Date(), "7:00", "15:00"),
        EntradaSalida("1", dia =  Date(), "7:00", "15:00"),
        EntradaSalida("1", dia =  Date(), "7:01", "15:00")

    )
var contadorRetardos= 0
    var contador=0
    entradasSalidas.forEach {
       if(horarioAmadeo1Al15.horaEntrada == it.horaEntrada){
           println("BIEN")
           contador++
       }else {
           println("NO COINCIDE")
           contadorRetardos++
       }
    }

    println("retarods $contadorRetardos")
    println("retarods $contador")



}