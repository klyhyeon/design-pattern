package com.baekho.design.pattern.solid.ocp;

import javax.xml.crypto.Data;

public class ResponseSender {

    private Data data;

    public ResponseSender(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void send() {
        sendHeader();
        sendBody();
    }

    protected void sendHeader() {
        //헤더 데이터 전송
    }

    protected void sendBody() {
        //텍스트로 데이터 전송
    }
}
