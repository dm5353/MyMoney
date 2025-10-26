package com.example.mymoney.data

import androidx.room.*
import com.example.mymoney.data.model.Cost
import com.example.mymoney.data.model.CostType

@Dao
interface MoneyDAO {
    @Query("SELECT * from $TYPES_TABLE")
    fun getAllTypes(): List<CostType>
    @Query("SELECT * from $COSTS_TABLE")
    fun getAllCosts(): List<Cost>
    @Query("SELECT * from $COSTS_TABLE WHERE _id=:id")
    fun getCost(id: Int): Cost
    @Insert
    fun addCost(cost: Cost)
    @Update
    fun saveCost(cost: Cost)
    @Delete
    fun killCost(cost: Cost)
    @Query("SELECT * FROM $COSTS_TABLE WHERE cost BETWEEN :minCost and :maxCost")
    fun getCostsByDate(minCost: Float, maxCost: Float): List<Cost>
}
