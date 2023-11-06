package com.example.widgetdasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun onRbClicked(view: View) {
            if (view is RadioButton) {
                val checked = view.isChecked
                when (view.getId()) {
                    R.id.radioPria ->
                        if (checked) {
                            Toast.makeText(applicationContext,

                                "Anda bernama ${latihan.editNama.text} seorang

                                ${latihan.radioPria.text}",
                            Toast.LENGTH_LONG).show()
    }

}