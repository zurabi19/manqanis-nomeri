package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var idnumber=findViewById<EditText>(R.id.idnumber)
        var mobileNum=findViewById<EditText>(R.id.mobilenumber)
        var text1=findViewById<EditText>(R.id.text1)
        var text2=findViewById<EditText>(R.id.text2)
        var carNum=findViewById<EditText>(R.id.number)
        var button=findViewById<Button>(R.id.button)


        button.setOnClickListener{


            var text1CHK=text1.text.toString().length==2&&chariDu(text1)
            var text2CHK=text2.text.toString().length==2&&chariDu(text2)
            var carNumCHK=carNum.text.toString().isDigitsOnly()&&carNum.text.toString().length==3

            var idnumberCHK=idnumber.text.toString().length==11&&idnumber.text.toString().isDigitsOnly()

            var mobileNumCHK=mobileNum.text.toString().length==9&&mobileNum.text.toString().isDigitsOnly()&&mobileNum.text.toString().substring(0,3)=="598"





            if (text1CHK&&text2CHK&&carNumCHK&&idnumberCHK&&mobileNumCHK){

                Toast.makeText(this, "gilocav", Toast.LENGTH_LONG).show()



            }else{
                Toast.makeText(this, "aba shen ici debilo", Toast.LENGTH_LONG).show()
            }



        }






    }


    fun chariDu(qva:EditText):Boolean{
        var state=true
        for (i in qva.text.toString()){
            if(!i.isLetter()){
                state=false
            }
        }
        return state

    }


}