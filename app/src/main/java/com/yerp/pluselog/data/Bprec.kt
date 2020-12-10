package com.yerp.pluselog.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Timestamp

@Entity

data class Bprec (
    @PrimaryKey(autoGenerate = true)  var id:Int,
    @ColumnInfo (name = "highpluse") var highp:Int,
    @ColumnInfo(name = "lowpluse") var lowp:Int,
    @ColumnInfo(name = "rectime") var rectime:Timestamp

)