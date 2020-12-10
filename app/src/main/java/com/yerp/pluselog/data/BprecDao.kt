package com.yerp.pluselog.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BprecDao {
    @Query("SELECT * from bprec ORDER BY rectime DESC")
    fun getrecs():LiveData<List<Bprec>>
    @Insert
    fun insert(bprec:Bprec)


}