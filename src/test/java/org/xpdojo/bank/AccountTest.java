package org.xpdojo.bank;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        assertThat(account.balance()).isCloseTo(0.0, Offset.offset(0.001));
    }

    @Test
    void deposidShouldIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(10.);
        assertThat(account.balance()).isCloseTo(10., Offset.offset(0.001));
    }
}
