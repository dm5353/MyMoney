package com.example.mymoney.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.mymoney.data.model.Cost
import com.example.mymoney.data.model.CostType

@Database(entities = [ CostType::class, Cost::class ], version = 1)
@TypeConverters(DatesTypeConverter::class)
abstract class MoneyDatabase : RoomDatabase() {
    abstract fun moneyDAO(): MoneyDAO
}
