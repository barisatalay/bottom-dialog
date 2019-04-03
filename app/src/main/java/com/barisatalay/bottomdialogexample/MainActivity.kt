package com.barisatalay.bottomdialogexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.barisatalay.bottomdialog.BottomDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_test.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val view = LayoutInflater.from(applicationContext).inflate(R.layout.item_test, null)

            val bottomDialog = BottomDialog(this)
                .setView(view as ViewGroup)
                .setCancelable(true)//if you set 'false', then you can access background views. Try it :)
                .show()

            view.close.setOnClickListener {
                bottomDialog.dismiss()
            }

            view.item2.setOnClickListener {
                bottomDialog.autoTransition()
                if (view.hiddenLayout.visibility == View.GONE)
                    view.hiddenLayout.visibility = View.VISIBLE
                else
                    view.hiddenLayout.visibility = View.GONE
            }
        }
    }
}
