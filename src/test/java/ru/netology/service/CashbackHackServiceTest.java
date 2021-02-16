package ru.netology.service;


import org.junit.Test; //старое
import static org.junit.Assert.*; //старое

import org.junit.jupiter.api.Assertions; //новое


public class CashbackHackServiceTest {

    @Test
    public void shoudlBuy100From900() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(900);
        int expected = 100;
        assertEquals (expected, actual);
    }

    @Test
    public void shoudlBuy900From1100() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;
        int actual = cashbackHackService.remain(amount);
        int expected = 900;
        assertEquals (expected, actual);
    }

    @Test
    public void shoudlNotBuy1000From1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals (expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shoudlBuy200From800() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;
        int actual = cashbackHackService.remain(amount);
        int expected = 200;
        Assertions.assertEquals (expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shoudlBuy800From1200() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1200;
        int actual = cashbackHackService.remain(amount);
        int expected = 800;
        Assertions.assertEquals (expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shoudlNotBuy1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        Assertions.assertEquals (expected, actual);
    }



}