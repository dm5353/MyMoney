package com.example.mymoney

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.mymoney.data.MoneyRepository
import com.example.mymoney.data.model.Cost
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val repo = MoneyRepository.get()
        repo.addCost(Cost(0,0,10.0F,"test-1", Date()))
        repo.addCost(Cost(0,0,20.0F,"test-2", Date()))
        val costsLiveData = repo.getAllCosts()
        costsLiveData.observe(this, androidx.lifecycle.Observer { costList ->
            costList.forEach { cost ->
                Log.d("DB out",cost.description)
            }
        })*/
    }
}