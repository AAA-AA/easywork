package com.github.base.json;


/**
 * @Author lgs
 * @Date 15-5-11 上午11:06
 */
public class JsonResponse{

    //状态
    protected String status = JsonResponseStatus.成功.code;
    //编码
    protected String code;
    //返回数据
    protected Object data;
    //信息
    protected String msg;

    public JsonResponse() {
    }

    public JsonResponse(Object data, String msg){

    }
    public JsonResponse(String status, Object data, String msg){

    }
    public static JsonResponse success(Object data, String msg) {
        return new JsonResponse(data,msg);
    }

    public static JsonResponse success(Object data) {
        return new JsonResponse(data,"");
    }

    public static JsonResponse success() {
        return new JsonResponse();
    }
    public static JsonResponse failure(String msg) {
        return new JsonResponse(JsonResponseStatus.失败.code,null,msg);
    }
    public static JsonResponse failure(Object data,String msg) {
        return new JsonResponse(JsonResponseStatus.失败.code,data,msg);
    }
/*    public static JsonResponse fail(String... msgs) {
        JsonResponse rst = new JsonResponse();
        rst.setStatus(Status.失败.code);
        injectErrorMsgs(rst,msgs);
        return rst;
    }
    private static void injectErrorMsgs(JsonResponse rst ,String... msgs){
        if (msgs == null || msgs.length == 0){
            return;
        }
        rst.setMsg(msgs[0]);
        for (String msg : msgs) {
            ErrorMessage errorMessage = new ErrorMessage("", msg);
            rst.errMsg.add(errorMessage);
        }
    }*/

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
