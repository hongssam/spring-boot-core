package com.spring_boot_core.filters;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogbackFilter extends Filter<ILoggingEvent> {

    @Override
    public FilterReply decide(ILoggingEvent e) {
        return FilterReply.ACCEPT;
    }
}
