/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Y545
 */
//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP CÁI TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KO CẦN NHỚ CÁI GÌ 
//CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {
    
    
    //n! = 1.2.3.4.5....n
    //Quy ước: 0! = 1! = 1
    //ko tính giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! là lố kiểu long
    //nếu đưa vào số âm, hoặc 21 giai thừa thì ta k tính, ta đập vào mặt ai xài
    //hàm. Một cái ngoại lệ, chửi éo tính được
    public static long getFactorial(int n) {
        if (n < 0 || n > 21)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20"); 
        //hàm dừng liền éo cần return
        
        if (n == 0 || n ==1 )
            return 1; //dừng ngay khi n đặc biệt
        
        //xuống đến đây n = 2...20 rồi
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con heo đất, ốc bu dồn thịt
        //i = 2, i = 3, i = 4, i = 5, ... i = n
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product = product * i;
        }
        return product;
        
    }
}
