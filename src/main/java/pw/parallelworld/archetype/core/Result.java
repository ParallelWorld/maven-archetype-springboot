package pw.parallelworld.archetype.core;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(0, "success", data);
    }

    public static <T> Result<T> error(int code, String msg, T data) {
        return new Result<>(code, msg, data);
    }

    public static <T> Result<T> error(String msg, T data) {
        return error(-1, msg, data);
    }

    public static <T> Result<T> error(int code, T data) {
        return error(code, "error", data);
    }

    public static <T> Result<T> error(int code, String msg) {
        return error(code, msg, null);
    }

    public static <T> Result<T> error(int code) {
        return error(code, "error", null);
    }

    public static <T> Result<T> error(String msg) {
        return error(-1, "error", null);
    }

    public static <T> Result<T> error(T data) {
        return error(-1, "error", data);
    }

    public static <T> Result<T> error() {
        return error(-1, "error", null);
    }
}
