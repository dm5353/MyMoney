package com.example.mymoney.data

import android.content.Context
import androidx.room.Room
import com.example.mymoney.data.model.Cost
import java.util.concurrent.Executors

class MoneyRepository private constructor(context: Context) {
    private val executor = Executors.newSingleThreadExecutor()
    private val database : MoneyDatabase = Room.databaseBuilder( context.applicationContext,
        MoneyDatabase::class.java,
        DATABASE_NAME).build()

    private val moneyDAO = database.moneyDAO()
    fun getAllCosts() = moneyDAO.getAllCosts()
    fun getAllTypes() = moneyDAO.getAllTypes()
    fun addCost(cost: Cost) = executor.execute {
        moneyDAO.addCost(cost)
    }
    fun killCost(cost: Cost) = executor.execute {
        moneyDAO.killCost(cost)
    }
    fun saveCost(cost: Cost) = executor.execute {
        moneyDAO.saveCost(cost)
    }

    companion object {
        private var INSTANCE: MoneyRepository? = null
        fun initialize(context: Context) {
            if (INSTANCE==null) {
                INSTANCE = MoneyRepository(context)
            }
        }
        fun get(): MoneyRepository {
            return INSTANCE ?: throw IllegalStateException("Repository should be initialized!")
        }
    }
}
