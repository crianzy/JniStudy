package com.czy.jni;

/**
 * Created by chenzhiyong on 2017/3/18.
 * 参考文章 https://segmentfault.com/a/1190000004610577
 * <p/>
 * <p/>
 * 主要命令:
 * 在 src 目录下:
 * 1. 生成头文件  javah com.czy.jni.Sample1
 * 2. 编写 cpp 文件
 * 3. 编译 cpp 生成 .o 文件
 * 4. 生成动态链接库 gcc -I/System/Library/Frameworks/JavaVM.framework/Headers -c sample1.cpp
 * 5. 把动态链接库放到 项目目录下(src 的上一层)
 */
public class Sample1 {

    public native int intMethod(int n);

    public native boolean booleanMethod(boolean bool);

    public native String stringMethod(String text);

    public native int intArrayMethod(int[] intArray);

    public static void main(String[] args) {
        System.loadLibrary("Sample1");

        Sample1 sample = new Sample1();

        int square = sample.intMethod(5);
        boolean bool = sample.booleanMethod(true);
        String text = sample.stringMethod("Java");
        int sum = sample.intArrayMethod(new int[]{1, 2, 3, 4, 5, 8, 13});

        System.out.println("intMethod: " + square);
        System.out.println("booleanMethod: " + bool);
        System.out.println("stringMethod: " + text);
        System.out.println("intArrayMethod: " + sum);


    }
}
