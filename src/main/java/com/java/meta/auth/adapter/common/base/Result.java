package com.java.meta.auth.adapter.common.base;

import com.java.meta.auth.adapter.common.util.TraceIDUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kscs
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {

    private T data;

    private int code;

    private String message;

    private String traceId;

    private String dateTime;

    public static Result<?> success() {
        return Result.builder().data(null).code(200).message("success").traceId(TraceIDUtil.getTraceId())
            .dateTime(String.valueOf(System.currentTimeMillis())).build();
    }
}
