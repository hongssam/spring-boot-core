package com.spring_boot_core.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * packageName    : com.spring_boot_core.enums
 * fileName       : BaseEnum
 * author         : jinpyo
 * date           : 2024/04/05
 * description    :
 */
public interface BaseEnum {
    @JsonValue
    String getValue();
    String getDesc();
}
