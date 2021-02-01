package com.gogorabbit.datastruct;

import java.math.BigDecimal;

public class CreditRecord {

    private String outUserId;

    private String inUserId;

    private long time;

    private long paybackTime;

    private BigDecimal amount;

    public String getOutUserId() {
        return outUserId;
    }

    public void setOutUserId(String outUserId) {
        this.outUserId = outUserId;
    }

    public String getInUserId() {
        return inUserId;
    }

    public void setInUserId(String inUserId) {
        this.inUserId = inUserId;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getPaybackTime() {
        return paybackTime;
    }

    public void setPaybackTime(long paybackTime) {
        this.paybackTime = paybackTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
