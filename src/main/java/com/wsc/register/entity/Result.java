package com.wsc.register.entity;

import java.io.Serializable;

/**
 * @ClassName: Result
 * @author: wsc
 * @date: 2020/5/6  20:06
 */
public class Result implements Serializable {

    private static final long serialVersionUID = -1462160863296821413L;
    public static final String SUCCESS_MESSAGE = "操作成功";
    public static final String FAIL_MESSAGE = "操作失败";


    /***操作失败**/
    public static final String FAIL = "0001";
    public static final String SUCCESS = "0000";
    /*****状态****/
    /**
     * 0000 成功
     * 0001 操作失败
     */
    private String status = SUCCESS;
    private String message = SUCCESS_MESSAGE;

    public Result() {

    }

    /*****数据内容****/
    private Object content;


    public static Result success() {
        Result result = new Result();
        result.setStatus(SUCCESS);
        return result;
    }
    public static Result success(Object data) {
        Result result = new Result();
        result.setStatus(SUCCESS);
        result.setContent(data);
        return result;
    }

    public static Result fail() {
        Result result = new Result();
        result.setStatus(FAIL);
        return result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
