package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val dropdownlist1 = arrayOf("Red", "Blue", "Yellow")
    val dropdownlist2 = arrayOf("Red", "Blue", "Yellow")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adapter= ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist1)
        val adapter2= ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist2)



        val b1=findViewById<Button>(R.id.button)



        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)



        colors1.adapter=adapter
        colors1.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
                if(colors1.selectedItemPosition==0)
                {
                    textView.setText(" " + colors1.selectedItem)

                }
                if(colors1.selectedItemPosition==1)
                {
                    textView.setText(" " + colors1.selectedItem)

                }
                if(colors1.selectedItemPosition==2)
                {
                    textView.setText(" " + colors1.selectedItem)

                }
            }
        }


        colors2.adapter=adapter2
        colors2.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
                if(colors2.selectedItemPosition==0)
                {
                    textView2.setText(" " + colors2.selectedItem)

                }
                if(colors2.selectedItemPosition==1)
                {
                    textView2.setText(" " + colors2.selectedItem)

                }
                if(colors2.selectedItemPosition==2)
                {
                    textView2.setText(" " + colors2.selectedItem)

                }
            }
        }


        b1.setOnClickListener{
            if(colors1.selectedItemPosition==0 && colors2.selectedItemPosition==0)
            {
                textView3.setText("The color is: Red")
            }
            if(colors1.selectedItemPosition==0 && colors2.selectedItemPosition==1)
            {
                textView3.setText("The color is: Purple")
            }

            if(colors1.selectedItemPosition==0 && colors2.selectedItemPosition==2)
            {
                textView3.setText("The color is: Orange")
            }

            if(colors1.selectedItemPosition==1 && colors2.selectedItemPosition==0)
            {
                textView3.setText("The color is: Purple")
            }

            if(colors1.selectedItemPosition==1 && colors2.selectedItemPosition==1)
            {
                textView3.setText("The color is: Blue")
            }

            if(colors1.selectedItemPosition==1 && colors2.selectedItemPosition==2)
            {
                textView3.setText("The color is: Green")
            }

            if(colors1.selectedItemPosition==2 && colors2.selectedItemPosition==0)
            {
                textView3.setText("The color is: Orange")
            }

            if(colors1.selectedItemPosition==2 && colors2.selectedItemPosition==1)
            {
                textView3.setText("The color is: Green")
            }

            if(colors1.selectedItemPosition==2 && colors2.selectedItemPosition==2)
            {
                textView3.setText("The color is: Yellow")
            }

        }
    }
}
