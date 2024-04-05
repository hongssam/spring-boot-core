package com.spring_boot_core.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.spring_boot_core.response
 * fileName       : BaseResponse
 * author         : jinpyo
 * date           : 2024/04/05
 * description    :
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class BaseResponse<T> {
    private static final String OK_STATUS = "OK";
    private String status;
    private T data;

    public BaseResponse(String status) {
        this.status = status;
    }

    private BaseResponse(String status, T data) {
        this.status = status;
        this.data = data;
    }

    public static <T> BaseResponse<T> successWithNoData() {
        return new BaseResponse<>(OK_STATUS);
    }

    public static <T> BaseResponse<T> successWithData(T data) {
        return new BaseResponse<>(OK_STATUS, data);
    }
}
