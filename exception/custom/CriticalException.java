package com.spring_boot_core.exception.custom;

import com.spring_boot_core.enums.ErrorCode;
import lombok.Getter;

/**
 * packageName    : com.spring_boot_core.exception.custom
 * fileName       : CriticalException
 * author         : jinpyo
 * date           : 2024/04/05
 * description    :
 */
@Getter
public class CriticalException  extends RuntimeException {
    private final String message;
    private final ErrorCode errorCode;

    public CriticalException(String message) {
        super(message);

        this.message = message;
        this.errorCode = ErrorCode.INTERNAL_SERVER_ERROR;
    }
}
