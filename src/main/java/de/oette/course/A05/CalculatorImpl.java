package de.oette.course.A05;

import de.oette.course.A04.LuckyNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {

    @Autowired
    private Calculator calculator;

    @Override
    public int sum(int value1, int value2) {
        return value1 + value2;
    }
}
