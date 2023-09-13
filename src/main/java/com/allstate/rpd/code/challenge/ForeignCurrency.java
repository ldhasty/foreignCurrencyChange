package com.allstate.rpd.code.challenge;

public class ForeignCurrency {

    boolean canGetExactChange(int targetMoney, int[] denominations) {

        int tmpMoney = targetMoney;
        for (int i = denominations.length - 1; i >= 0; i--) {

            if (denominations[i] >= targetMoney) {
                continue;
            }

            tmpMoney %= denominations[i];

            if (tmpMoney == 0) {
                break;
            }
        }

        return tmpMoney == 0;
    }
}
