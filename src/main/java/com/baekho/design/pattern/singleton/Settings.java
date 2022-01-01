package com.baekho.design.pattern.singleton;

public class Settings {

    private Settings() {

    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    //thread-safe 방법: synchronized로 한번에 하나의 스레드만 출입
    //동기화 lock 특징 때문에 성능저하 일으킬 수 있음
    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
//        return INSTANCE;
    }

}
