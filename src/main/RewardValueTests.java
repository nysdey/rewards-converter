package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RewardValueTests {

    @Test
    public void create_with_cash_value() {
        double cashValue = 100;
        var RewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, RewardValue.getCashValue());
    }

    @Test
    public void create_with_miles_value() {
        int milesValue = 10000;
        var RewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, RewardValue.getMilesValue());
    }

    @Test
    public void convert_from_cash_to_miles() {
        assert false;
    }

    @Test
    public void convert_from_miles_to_cash() {
        assert false;
    }
}