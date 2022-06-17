package com.luismorales17106494.radiogroupyradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        4 - Controles RadioGroup y RadioButton
        Problema:
        Realizar la carga de dos números en controles de tipo EditText.
        Mostrar mensajes que soliciten la carga de los valores dentro de los
        mismos EditText (propiedad hint). Disponer dos controles de tipo
        RadioButton para seleccionar si queremos sumar o restar dichos valores.
        Finalmente mediante un control de tipo Button efectuamos la operación
         respectiva. Mostramos el resultado en un TextView.
        El problema es similar al anterior. Disponemos dos controles EditText (Number)
        y configuramos sus propiedades id y hint. Para disponer los controles de
        tipo RadioButton debemos en realidad primero insertar un control de tipo
        RadioGroup (este control se encuentra en la paleta de componentes en la
        pestaña Buttons de la "Palette"):
         */

    }
}