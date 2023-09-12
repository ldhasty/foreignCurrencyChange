package com.allstate.rpd.code.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForeignCurrencyTest {

    ForeignCurrency foreignCurrency;

    @BeforeEach
    public void setup(){

        foreignCurrency = new ForeignCurrency();

    }

    @Test
    void canGetExactChangeExample1() {

       int [] denominations = {5, 10, 25, 100, 200};

       assertFalse(foreignCurrency.canGetExactChange(94, denominations));
    }

    @Test
    void canGetExactChangeExample2() {

        int [] denominations = {4, 17, 29};

        assertTrue(foreignCurrency.canGetExactChange(75, denominations));
    }
}