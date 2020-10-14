import java.text.DecimalFormat;

class TransitCalculator {

    // ReadMe found at https://www.codecademy.com/practice/projects/best-fare-calculator
    
    // All prices cut in half for handicapped users
    double perRideCost = 2.75;
    double sevenDayPass = 33.00;
    double thirtyDayPass = 127.00;
    boolean handicapped = false;

    int days;
    int rides;

    private static DecimalFormat df = new DecimalFormat("0.00");

    TransitCalculator(int numDays, int numRides, boolean ishandicapped) {
        this.days = numDays;
        this.rides = numRides;
        this.handicapped = ishandicapped;
    }

    public double unlimited7Price(int numDays, int numRides) {
        double totalCost;
        double perRide;

        if (numDays % 7 == 0) {
            totalCost = numDays/7 * sevenDayPass;
            perRide = totalCost / numRides;
        } else {
            totalCost = numDays/7 * sevenDayPass;
            
            // Accounts for overage during the last partial week
            totalCost += sevenDayPass;
            perRide = totalCost / numRides;
        }

        return perRide;
    }

    public double unlimited30Price(int numDays, int numRides) {
        double totalCost;
        double perRide;

        if (numDays % 30 == 0) {
            totalCost = numDays/30 * thirtyDayPass;
            perRide = totalCost / numRides;
        } else {
            totalCost = numDays/30 * thirtyDayPass;
            
            // Accounts for overage during the last partial week
            totalCost += thirtyDayPass;
            perRide = totalCost / numRides;
        }

        return perRide;
    }


    public double bestPrice(int numDays, int numRides, boolean handicapped) {
        double perRide7Day;
        double perRide30Day;

        boolean sevenVsThirty;
        boolean perDayCheck;
        // Calculate Cost for 7 day pass
        perRide7Day = unlimited7Price(numDays, numRides);

        // Calculate Cost for 30 day pass
        perRide30Day = unlimited30Price(numDays, numRides);

        if (handicapped) {
            perRide7Day /= 2;
            perRide30Day /= 2;
            perRideCost  = 1.35;
        }

        // Check for cheapest
        // Sets variable to true if 30 day option is cheaper than 7 day option
        if (perRide7Day > perRide30Day) {
            sevenVsThirty = true;
        } else {
            sevenVsThirty = false;
        }

        // perDayCheck will be True if the per day is more expensive than the day pass in each row
        if (sevenVsThirty) {
            perDayCheck = perRideCost > perRide30Day;

            if (perDayCheck) {
                System.out.println("You should buy the 30 day pass for a cost of:");
                return perRide30Day;
            } else {
                System.out.println("You should buy passes per ride at a cost of:");
                return perRideCost;
            }

        } else {
            perDayCheck = perRideCost > perRide7Day;

            if (perDayCheck) {
                System.out.println("You should buy the 7 day pass for a cost of:");
                return perRide7Day;
            } else {
                System.out.println("You should buy passes per ride at a cost of:");
                return perRideCost;
            }

        }
    }

    public static void main(String[] args) {
        TransitCalculator springBreak = new TransitCalculator(5, 12, true);
        System.out.println("$" + df.format(springBreak.bestPrice(springBreak.days, springBreak.rides, springBreak.handicapped)) + " per ride.");
    }
}