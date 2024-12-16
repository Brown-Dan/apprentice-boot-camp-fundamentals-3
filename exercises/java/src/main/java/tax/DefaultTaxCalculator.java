package tax;

public class DefaultTaxCalculator extends TaxCalculator {

    @Override
    int calculateTax(Vehicle vehicle) {
        int co2Emissions = vehicle.getCo2Emissions();
        if (co2Emissions == 0) {
            return 0;
        }
        if (isBetweenBounds(co2Emissions, 1, 50)) {
            return 10;
        }
        if (isBetweenBounds(co2Emissions, 51, 75)) {
            return 25;
        }
        if (isBetweenBounds(co2Emissions, 76, 90)) {
            return 105;
        }
        if (isBetweenBounds(co2Emissions, 91, 100)) {
            return 125;
        }
        if (isBetweenBounds(co2Emissions, 101, 110)) {
            return 145;
        }
        if (isBetweenBounds(co2Emissions, 111, 130)) {
            return 165;
        }
        if (isBetweenBounds(co2Emissions, 131, 150)) {
            return 205;
        }
        if (isBetweenBounds(co2Emissions, 151, 170)) {
            return 515;
        }
        if (isBetweenBounds(co2Emissions, 171, 190)) {
            return 830;
        }
        if (isBetweenBounds(co2Emissions, 191, 225)) {
            return 1240;
        }
        if (isBetweenBounds(co2Emissions, 226, 255)) {
            return 1760;
        }
        return 2070;
    }

    private boolean isBetweenBounds(int value, int lowerBound, int upperBound) {
        return value >= lowerBound && value <= upperBound;
    }
}
