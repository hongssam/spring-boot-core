package com.spring_boot_core.enums;

import com.spring_boot_core.exception.custom.EntityNotFoundException;
import lombok.Getter;

import java.util.Map;

import static java.util.Arrays.stream;
import static java.util.Collections.unmodifiableMap;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

/**
 * packageName    : com.spring_boot_core.enums
 * fileName       : ErrorCode
 * author         : jinpyo
 * date           : 2024/04/05
 * description    :
 */
@Getter
public enum ErrorCode implements BaseEnum{
    INVALID_INPUT_VALUE("INVALID_INPUT_VALUE", "유효하지 않은 파라미터", 400),
    INVALID_TYPE_VALUE("INVALID_TYPE_VALUE", "유효하지 않은 파라미터 타입", 400),
    HANDLE_ACCESS_DENIED("HANDLE_ACCESS_DENIED", "API 인증 실패", 403),
    NOT_SUPPORTED_API("NOT_SUPPORTED_API", "제공하지 않는 API 입니다.", 403),
    METHOD_NOT_ALLOWED("METHOD_NOT_ALLOWED", "허용되지 않은 메소드 입니다.", 405),
    API_SERVER_ERROR("API_SERVER_ERROR", "골프장 API 통신 오류", 406),
    ENTITY_NOT_FOUND("ENTITY_NOT_FOUND", "데이터 조회 실패", 400),
    LOGGING_FAIL("LOGGING_FAIL", "로그 기록 실패", 400),
    API_DB_ERROR("API_DB_ERROR", "골프장 DB 연결 오류", 406),
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR", "서버 에러", 500);


    private final String value;
    private final String desc;
    private final Integer status;

    private static final Map<String, ErrorCode> TYPES = unmodifiableMap(
            stream(values()).collect(toMap(ErrorCode::getValue, identity()))
    );

    ErrorCode(String value, String desc, int status) {
        this.value  = value;
        this.desc   = desc;
        this.status = status;
    }

    public static ErrorCode find(String value) {
        if(TYPES.containsKey(value)){
            return TYPES.get(value);
        }

        throw new EntityNotFoundException(value, ErrorCode.ENTITY_NOT_FOUND);
    }

    public int getStatus() {
        return this.status;
    }
}
