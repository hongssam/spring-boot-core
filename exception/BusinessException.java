package com.spring_boot_core.exception;

import com.spring_boot_core.enums.ErrorCode;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
public class BusinessException extends RuntimeException {

    private final String message;
    @Getter
    private final ErrorCode errorCode;

    public BusinessException(String message, ErrorCode errorCode) {
        super(message);

        this.message = message;
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode) {
        this(null, errorCode);
    }

}
