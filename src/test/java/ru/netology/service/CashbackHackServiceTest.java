package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shoudlBuy100From900() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void shoudlBuy900From1100() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;
        int actual = cashbackHackService.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    void shoudlNotBuy1000From1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }



}