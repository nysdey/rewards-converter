package main;

public class RewardValue {
    private double cashValue;
    private int milesValue;
    public static final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / conversionRate);
    }
    private static double convertToCash(int milesValue) {
        return milesValue * conversionRate;
    }
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}