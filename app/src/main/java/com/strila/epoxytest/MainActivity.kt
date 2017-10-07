package com.strila.epoxytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val controller = ValueController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvEpoxy.adapter = controller.adapter
        generateData()
        btnShowErrors.setOnClickListener { generateData(true) }
    }

    private fun generateData(withErrors: Boolean = false) {
        val data = (0..40)
                .map { Data(it, "Text $it", if (withErrors) R.string.error else null) }
                .toList()
        controller.setItems(data)
    }
}
