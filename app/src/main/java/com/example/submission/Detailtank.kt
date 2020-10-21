package com.example.submission

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detailtank : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_ORIGIN = "extra_origin"
        const val EXTRA_TYPE = "extra_type"
        const val EXTRA_MASS = "extra_mass"
        const val EXTRA_LENGTH = "extra_length"
        const val EXTRA_WIDTH = "extra_width"
        const val EXTRA_HEIGTH = "extra_height"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailtank)

        val imgProfile: ImageView= findViewById(R.id.img_detail_tank);
        val tankDataReceived: TextView = findViewById(R.id.tank_data_recieved)
        val tankDetaildetail: TextView = findViewById(R.id.tank_data_detail)


        val name = intent.getStringExtra(EXTRA_NAME)
        val origin = intent.getStringExtra(EXTRA_ORIGIN)
        val type = intent.getStringExtra(EXTRA_TYPE)
        val mass = intent.getStringExtra(EXTRA_MASS)
        val length = intent.getStringExtra(EXTRA_LENGTH)
        val width = intent.getStringExtra(EXTRA_WIDTH)
        val height= intent.getStringExtra(EXTRA_HEIGTH)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        imgProfile.setImageResource(intent.getIntExtra(EXTRA_PHOTO, 0));
        val text = "Nama Tank : $name " +
                "\nAsal Tank : $origin " +
                "\nJenis Tank : $type " +
                "\nBerat Tank : $mass " +
                "\nPanjang Tank : $length " +
                "\nLebar Tank : $width " +
                "\nTinggi Tank : $height"

        val textdetail = "$detail"
        tankDataReceived.text = text
        tankDetaildetail.text = textdetail


    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}