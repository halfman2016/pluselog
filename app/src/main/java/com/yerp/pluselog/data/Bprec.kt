package com.yerp.pluselog.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class Bprec (
@PrimaryKey(autoGenerate = true)  var id:Int,
var highp:Int,
var lowp:Int

)