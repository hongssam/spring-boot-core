package com.spring_boot_core.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.spring_boot_core.enums.ErrorCode;
import lombok.Getter;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

/**
 * packageName    : com.spring_boot_core.response
 * fileName       : ErrorResponse
 * author         : jinpyo
 * date           : 2024/04/05
 * description    :
 */
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {
    private final String status;
    private final String errorMessage;

    public ErrorResponse(ErrorCode errorCode, MessageSource messageSource){
        this.status = errorCode.getValue();
        this.errorMessage = messageSource.getMessage(
                errorCode.getValue(),
                new String[]{},
                LocaleContextHolder.getLocale());
    }

    public ErrorResponse(ErrorCode errorCode, String errorMessage){
        this.status = errorCode.getValue();
        this.errorMessage = errorMessage;
    }
}

