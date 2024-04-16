package com.spring_boot_core.filters;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

import static ch.qos.logback.core.spi.FilterReply.DENY;
import static ch.qos.logback.core.spi.FilterReply.NEUTRAL;

@Slf4j
@Setter
public class LogRuleFilter extends Filter<ILoggingEvent> {
    private Level level;

    @Override
    public FilterReply decide(ILoggingEvent event) {
        if (!isStarted()) {
            return NEUTRAL;
        }

        if (!event.getLevel().isGreaterOrEqual(level)) {
            return DENY;
        }

        return NEUTRAL;
    }

    @Override
    public void start() {
        if (Objects.isNull(this.level)) {
            return;
        }
        super.start();
    }
}