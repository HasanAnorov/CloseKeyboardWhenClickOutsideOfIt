package com.example.closekeyboardwhenout

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn.setOnClickListener{
            val intent = Intent(this,SecondActivity2::class.java)
            startActivity(intent)

        }

    }
//this only works for button whenever you click outside of edit text it does not work
//    private fun hideKeyboard() {
//        val view=this.currentFocus
//        if(view!=null){
//            val imm =getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager?
//            imm?.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
//
//        }
//    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        if (currentFocus != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
            }
        return super.dispatchTouchEvent(ev)
    }
}