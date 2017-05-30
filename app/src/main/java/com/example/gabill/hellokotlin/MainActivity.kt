package com.example.gabill.hellokotlin
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null
    private var flag = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById(R.id.button);
        textView =  findViewById(R.id.text_view) as TextView

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if (flag) {
                    textView?.text = "Hello"
                    flag = false
                } else {
                    textView?.text = "World"
                    flag = true
                }
            }
        })
    }
}
