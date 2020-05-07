package com.didigo.mall.vo;

/**
 * viewObject
 */
public class BaseResponseVo<T> {
    T data;
    String errmsg;
    int errno;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    //提取的方法
    public static BaseResponseVo checkSuccess(Object data){
        BaseResponseVo baseResponseVo = new BaseResponseVo();
        baseResponseVo.setErrmsg("Success");
        baseResponseVo.setErrno(0);
        baseResponseVo.setData(data);
        return baseResponseVo;
    }

}
