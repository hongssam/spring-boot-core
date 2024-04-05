package com.spring_boot_core.config.i18n;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

/**
 * packageName    : com.spring_boot_core.config.i18n
 * fileName       : I18nConfig
 * author         : jinpyo
 * date           : 2024/04/05
 * description    :
 */
public class I18nConfig {
    @Bean
    public LocaleResolver localResolver() {
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.KOREA);

        return sessionLocaleResolver;
    }
}
