package com.designpattern.singleton;

import java.util.Objects;

public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {

    }

    /**
     *
     * @return
     */
//    public synchronized static LazySingleton getLazySingleton() {
//        if (Objects.isNull(lazySingleton)) {
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

    /**
     * @return
     */
//    public static LazySingleton getLazySingleton() {
//        if (Objects.isNull(lazySingleton)) {
//            synchronized (LazySingleton.class) {
//                lazySingleton = new LazySingleton();
//            }
//        }
//        return lazySingleton;
//    }

    /**
     * 双重检查锁
     * 1. 防止指令重排
     *  1.1. 通过命令 javap -c xx.class
     * 2. 锁占用。
     * @return
     */
    public static LazySingleton getLazySingleton() {
        if (Objects.isNull(lazySingleton)) {
            synchronized (LazySingleton.class) {
                if (Objects.isNull(lazySingleton)) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
