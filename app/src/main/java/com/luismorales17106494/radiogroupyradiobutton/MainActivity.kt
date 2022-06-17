package com.luismorales17106494.radiogroupyradiobutton

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isNotEmpty
import com.luismorales17106494.radiogroupyradiobutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
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

        binding.btOperar.setOnClickListener() {
            if (binding.etNumero1.text.isNotBlank() && binding.etNumero2.text.isNotBlank()) {


                Toast.makeText(
                    this,
                    binding.rgbGrop.isClickable.toString(),
                    Toast.LENGTH_LONG
                ).show()
                when {
                    binding.rbRestar.isChecked -> {
                        binding.tvResultado.text = "" +
                                "${
                                    binding.etNumero1.text.toString()
                                        .toDouble() - binding.etNumero2.text.toString().toDouble()
                                }"
                    }
                    binding.rbSumar.isChecked -> {
                        binding.tvResultado.text = "" +
                                "${
                                    binding.etNumero1.text.toString()
                                        .toDouble() + binding.etNumero2.text.toString().toDouble()
                                }"
                    }
                    binding.rbMulti.isChecked -> {
                        binding.tvResultado.text = "" +
                                "${
                                    binding.etNumero1.text.toString()
                                        .toDouble() * binding.etNumero2.text.toString().toDouble()
                                }"
                    }
                    binding.rbDividir.isChecked -> {
                        binding.tvResultado.text = "" +
                                "${
                                    binding.etNumero1.text.toString()
                                        .toDouble() / binding.etNumero2.text.toString().toDouble()
                                }"
                    }
                }


            } else {
                Toast.makeText(
                    this, "Rellene los dos campos", Toast.LENGTH_SHORT
                ).show()
            }


        }


    }
}