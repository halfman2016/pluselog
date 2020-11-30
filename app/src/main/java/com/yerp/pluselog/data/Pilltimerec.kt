package com.yerp.pluselog.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Time

@Entity
data class Pilltimerec (
    @PrimaryKey(autoGenerate = true) var id:Int,
    var time:Time

)