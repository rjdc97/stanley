package edu.itesm.stanley

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class Movie(val picture:Int,
                 val titulo:String,
                 val anio:String,
                 val plot: String) :Parcelable


