package com.baekho.design.pattern.solid.ocp;

import javax.xml.crypto.Data;

public class ZippedResponseSender extends ResponseSender {


    public ZippedResponseSender(Data data) {
        super(data);
    }

    @Override
    protected void sendBody() {
        //데이터 압축 처리
    }
}
