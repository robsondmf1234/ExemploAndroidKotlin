package com.example.exemplosandroidkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    var numeroDeCafe = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val btnOrder = btn_order
        btnOrder.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Teste",Toast.LENGTH_LONG).show()
        })*/
    }

    fun submitOrder(view: View) {
        var numero = 10
        display(numeroDeCafe)
        //displayPrice(numeroDeCafe * 5)
        displayMessage(mensagem = "Total do pedido é R$"+(numeroDeCafe*5))
        // Toast.makeText(this,"Valor do pedido R$${numeroDeCafe*5}", Toast.LENGTH_LONG).show()
    }


    fun display(number: Int) {
        text_number.setText("" + number)
    }

    fun adicionarCafe(view: View) {
        numeroDeCafe++
        display(numeroDeCafe)
        displayPrice(numeroDeCafe * 5)
    }

    fun retirarCafe(view: View) {
        if (numeroDeCafe != 0) {
            numeroDeCafe--
        }
        display(numeroDeCafe)
        displayPrice(numeroDeCafe * 5)
    }

    fun displayPrice(valor: Int) {
        text_valorPedido.setText(NumberFormat.getCurrencyInstance().format(valor))
    }

    fun displayMessage(mensagem: String) {
        if (numeroDeCafe>0){
            text_valorPedido.setText(mensagem + "\nObrigado!")
        }else
            text_valorPedido.setText("É necessario adicionar café para fazer o pedido")
    }
}