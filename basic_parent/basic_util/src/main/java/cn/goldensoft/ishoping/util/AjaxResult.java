package cn.goldensoft.ishoping.util;
/**
 * 请求响应对象的类
 * */
public class AjaxResult {

    private boolean success =true;
    private String message="操作正常";

    //返回到前台对象
    private Object resultObj;


    public static AjaxResult me(){
        return new AjaxResult();
    }

    public boolean isSuccess() {
        return success;
    }
    //使请求响应对象信息更加灵活
    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }
    //使请求响应对象信息更加灵活
    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultObj() {
        return resultObj;
    }
    //使请求响应对象中返回的对象数据更加灵活
    public AjaxResult setResultObj(Object resultObj) {
        this.resultObj = resultObj;
        return this;
    }
}
