package tn.esprit.esprit_space.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

data class Classe ( @SerializedName("_id") val id : String,
@SerializedName("classe") val clas : String,
@SerializedName("iduser") var iduser : String,
@SerializedName("createdAt") val createdAt : Date,
@SerializedName("updatedAt") val updatedAt : Date,
) : Serializable