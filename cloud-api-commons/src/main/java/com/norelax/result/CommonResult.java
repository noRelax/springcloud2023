package com.norelax.result;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wusong
 * @date 2023年02月07日 17:01
 */
@Data
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult(T data) {
        this(200, "success", data);
    }
}
