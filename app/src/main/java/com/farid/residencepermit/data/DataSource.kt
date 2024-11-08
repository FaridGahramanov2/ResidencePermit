package com.farid.residencepermit.data

import android.content.Context
import com.farid.residencepermit.R
import com.farid.residencepermit.model.Permit

class DataSource(val context: Context) {

    private fun getFirstNames(): Array<String> = context.resources.getStringArray(R.array.first_names)
    private fun getLastNames(): Array<String> = context.resources.getStringArray(R.array.last_names)
    private fun getPermitNumbers(): Array<String> = context.resources.getStringArray(R.array.permit_numbers)
    private fun getIssueDates(): Array<String> = context.resources.getStringArray(R.array.issue_dates)
    private fun getExpirationDates(): Array<String> = context.resources.getStringArray(R.array.expiration_dates)
    private fun getResidenceTypes(): Array<String> = context.resources.getStringArray(R.array.residence_types)
    private fun getCountriesOfOrigin(): Array<String> = context.resources.getStringArray(R.array.countries_of_origin)

    fun loadPermits(): List<Permit> {
        val firstNames = getFirstNames()
        val lastNames = getLastNames()
        val permitNumbers = getPermitNumbers()
        val issueDates = getIssueDates()
        val expirationDates = getExpirationDates()
        val residenceTypes = getResidenceTypes()
        val countriesOfOrigin = getCountriesOfOrigin()

        return List(firstNames.size) { i ->
            Permit(
                firstName = firstNames[i],
                lastName = lastNames[i],
                permitNumber = permitNumbers[i].toLong(),  // Assuming permit number should be a Long
                issueDate = issueDates[i],
                expirationDate = expirationDates[i],
                residenceType = residenceTypes[i],
                countryOfOrigin = countriesOfOrigin[i]
            )
        }
    }
}
