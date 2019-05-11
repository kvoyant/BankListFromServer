package com.tjeit.banklistfromserver.utils;

import android.content.Context;

import org.json.JSONObject;

public class ConnectServer {
    //서버의 근본 주소
    private final static String BASE_URL = "http://delivery-dev-389146667.ap-northeast-2.elb.amazonaws.com/";

    //    서버의 응답을 처리하는 역할을 담당하는 인터페이스
    public interface JsonResponsHandler {
        void onResponse(JSONObject json);
    }

    public static void getRequestInfoBank(Context context, /* 필요한 파라미터 변수들*/ final JsonResponsHandler handler) {

    }

}
