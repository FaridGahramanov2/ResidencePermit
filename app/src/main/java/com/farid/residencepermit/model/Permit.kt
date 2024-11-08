package com.farid.residencepermit.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Permit(
    val firstName: String = "",
    val lastName: String = "",
    val permitNumber: Long = 0L,
    val issueDate: String = "",
    val expirationDate: String = "",
    val residenceType: String = "",
    val countryOfOrigin: String = ""
) : Parcelable
