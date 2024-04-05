package com.spring_boot_core.exception.custom;

import com.spring_boot_core.enums.ErrorCode;
import com.spring_boot_core.exception.BusinessException;

public class EntityNotFoundException extends BusinessException {

    public EntityNotFoundException(String value) {
        super(value, ErrorCode.ENTITY_NOT_FOUND);
    }

    public EntityNotFoundException(String value, ErrorCode errorCode) {
        super(value, errorCode);
    }
}
