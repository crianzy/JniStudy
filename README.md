# JniStudy
Jni 基础教程


 主要命令:
 在 src 目录下:
 1. 生成头文件  javah com.czy.jni.Sample1
 2. 编写 cpp 文件
 3. 编译 cpp 生成 .o 文件
 4. 生成动态链接库 gcc -I/System/Library/Frameworks/JavaVM.framework/Headers -c sample1.cpp
 5. 把动态链接库放到 项目目录下(src 的上一层)
