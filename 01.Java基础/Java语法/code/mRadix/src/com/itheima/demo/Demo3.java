package com.itheima.demo;

public class Demo3 {
    /*
       位移运算符:

               << 有符号左移运算，二进制位向左移动, 左边符号位丢弃, 右边补齐0
                        运算规律: 向左移动几位, 就是乘以2的几次幂

                                12 << 2

                                (0)0000000 00000000 00000000 000011000  // 12的二进制

       -----------------------------------------------------------------------------
               >> 有符号右移运算，二进制位向右移动, 使用符号位进行补位
                        运算规律: 向右移动几位, 就是除以2的几次幂

                                000000000 00000000 00000000 0000001(1)  // 3的二进制

       -----------------------------------------------------------------------------

                >>> 无符号右移运算符,  无论符号位是0还是1，都补0

                                010000000 00000000 00000000 00000110  // -6的二进制

     */
    public static void main(String[] args) {
        System.out.println(12 << 1);  // 24
        System.out.println(12 << 2);  // 48

    }
}
