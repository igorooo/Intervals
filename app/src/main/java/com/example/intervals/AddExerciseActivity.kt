package com.example.intervals

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class AddExerciseActivity : AppCompatActivity() {
    private lateinit var mEdidText_exercise_name : EditText
    private lateinit var mRadioButton_chest: RadioButton
    private lateinit var mRadioButton_back: RadioButton
    private lateinit var mRadioButton_legs: RadioButton
    private lateinit var mRadioButton_abs: RadioButton
    private lateinit var mRadioButton_biceps: RadioButton
    private lateinit var mRadioButton_triceps: RadioButton
    private lateinit var mRadioButton_shoulders: RadioButton
    private lateinit var mRadioButton_cardio: RadioButton
    private lateinit var mImageView_color: ImageView
    private lateinit var mSeekBar_color: SeekBar
    private lateinit var mImageButton_save: ImageButton

    private var mHSV_COLOR = floatArrayOf(0f, 1f, 1f)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_exercise)
        initView()
        initListeners()


    }

    fun initView(){
        mEdidText_exercise_name = findViewById(R.id.EditText_exercise_name);
        mRadioButton_chest = findViewById(R.id.RadioButton_chest)
        mRadioButton_back = findViewById(R.id.RadioButton_back)
        mRadioButton_legs = findViewById(R.id.RadioButton_legs)
        mRadioButton_abs = findViewById(R.id.RadioButton_abs)
        mRadioButton_triceps = findViewById(R.id.RadioButton_triceps)
        mRadioButton_biceps = findViewById(R.id.RadioButton_biceps)
        mRadioButton_shoulders = findViewById(R.id.RadioButton_shoulders)
        mRadioButton_cardio = findViewById(R.id.RadioButton_cardio)
        mImageView_color = findViewById(R.id.ImageView_color)
        mSeekBar_color = findViewById(R.id.SeekBar_color)
        mImageButton_save = findViewById(R.id.Button_save_exercise)
    }

    fun initListeners(){

        mImageButton_save?.setOnClickListener { v -> sendExerciseAndFinish() }

        mSeekBar_color?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }


        })

    }

    fun changeColor(progres : Int){
        val hsv = 360f * progres / 100f
        mHSV_COLOR[0] = hsv
        mImageView_color.setColorFilter(Color.HSVToColor(mHSV_COLOR))
    }
}
