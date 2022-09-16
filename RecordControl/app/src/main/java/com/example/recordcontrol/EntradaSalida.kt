package com.example.recordcontrol

import java.util.*

class EntradaSalida (
    val idPersonal: String,
    val dia: Date ,
    val horaEntrada: String,
    val horaSalida: String

 ){
    override fun toString(): String {
        return "HORA ENTRADA: $horaEntrada HORA SALIDA: $horaSalida"
    }
}