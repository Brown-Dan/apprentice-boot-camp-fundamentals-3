package tax

class DefaultTaxCalculator : TaxCalculator() {

    override fun calculateTax(vehicle: Vehicle?): Int {
        val co2Emissions = vehicle?.co2Emissions ?: throw NullPointerException()

        return when (co2Emissions) {
            0 -> 0
            in 1..50 -> 10
            in 51..75 -> 25
            in 76..90 -> 105
            in 91..100 -> 125
            in 101..110 -> 145
            in 111..130 -> 165
            in 131..150 -> 205
            in 151..170 -> 515
            in 171..190 -> 830
            in 191..225 -> 1240
            in 226..255 -> 1760
            else -> 2070
        }
    }
}