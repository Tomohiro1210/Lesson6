package com.greeting.helloworld;

import java.time.LocalDateTime;

public class Time {
    private LocalDateTime nowTime;
    private String greeting;

    public Time(LocalDateTime nowTime, String greeting) {
        this.nowTime = nowTime;
        this.greeting = greeting;
    }

    public LocalDateTime getNowTime() {
        return nowTime;
    }

    public void setNowTime(LocalDateTime nowTime) {
        this.nowTime = nowTime;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

}

