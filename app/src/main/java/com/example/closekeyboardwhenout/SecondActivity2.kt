package com.example.closekeyboardwhenout

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_second2.*

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        btn.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
     //       hideKeyboard()
            finish()
        }

    }

    //    private fun hideKeyboard() {
//        val view=this.currentFocus
//        if(view!=null){
//            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//            imm.hideSoftInputFromWindow(view.windowToken,0)
//
//        }
//    }
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        val view=this.currentFocus
        if(currentFocus!=null){
            val imm=getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view?.windowToken,0)
        }


        return super.dispatchTouchEvent(ev)
    }
}
