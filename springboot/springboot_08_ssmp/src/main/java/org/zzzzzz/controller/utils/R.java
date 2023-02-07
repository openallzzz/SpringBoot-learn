package org.zzzzzz.controller.utils;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, Object data, String msg) {
        this.flag = flag;
        this.data = data;
        this.msg = msg;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg) {
        this.flag = false;
        this.msg = msg;
    }

    public R() {

    }
}
