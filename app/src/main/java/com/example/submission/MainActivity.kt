package com.example.submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvTanks: RecyclerView
    private var list: ArrayList<Tank> = arrayListOf()
    private val title = "World War II Tanks"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = title
        rvTanks = findViewById(R.id.rv_tanks)
        rvTanks.setHasFixedSize(true)

        list.addAll(TanksData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvTanks.layoutManager = LinearLayoutManager(this)
        val listTankAdapter = ListTankAdapter(list)
        rvTanks.adapter = listTankAdapter
        listTankAdapter.setOnItemClickCallback(object : ListTankAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Tank) {
                showSelectedHero(data)
            }
        })
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_aboutme -> {
                val moveIntent = Intent(this@MainActivity, Aboutme::class.java)
                startActivity(moveIntent)
            }
        }
    }

    private fun showSelectedHero(tank: Tank) { //gunakan tank.atribut untuk disend
        val moveWithDataIntent = Intent(this@MainActivity, Detailtank::class.java)
        moveWithDataIntent.putExtra(Detailtank.EXTRA_NAME, tank.name_tank)
        moveWithDataIntent.putExtra(Detailtank.EXTRA_ORIGIN,tank.negara_tank)
        moveWithDataIntent.putExtra(Detailtank.EXTRA_TYPE, tank.jenis_tank)
        moveWithDataIntent.putExtra(Detailtank.EXTRA_MASS, tank.berat_tank)
        moveWithDataIntent.putExtra(Detailtank.EXTRA_LENGTH, tank.panjang_tank)
        moveWithDataIntent.putExtra(Detailtank.EXTRA_WIDTH, tank.lebar_tank)
        moveWithDataIntent.putExtra(Detailtank.EXTRA_HEIGTH, tank.tinggi_tank)
        moveWithDataIntent.putExtra(Detailtank.EXTRA_PHOTO, tank.gambar_tank)
        moveWithDataIntent.putExtra(Detailtank.EXTRA_DETAIL, tank.detail_tank)
        startActivity(moveWithDataIntent)
        }
}