/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnv.mathutil.core;

/**
 *
 * @author LENOVO
 */
//đây là class mô phỏng lại các hàm tiện ích/dùng chung cho mọi class khac, mô phỏng lại class tiện ích java.Math của JDK
//Phàm cái gì là đồ dùng chung, thường đc thiết kế static
public class MathUtil {

    public static final double PI = 3.141592653589793;

    //hàm tiện ích tính n!
    //lưu ý/quy ước: 
    // - ko tính giai thừa của số âm
    // 0! = 1! = 1
    // Vì giai thừa tăng cực nhanh, nên 21! đã vượt 18 số 0 -> ko tính giai thừa 21 trở lên
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be betwwen 0..20");
        
        if (n == 0 || n == 1) 
            return 1;
        
        // sống sót tới đây n=2..20!
        // cấm xài ko ELSE khi hàm đã có return phía trc 

        long product = 1; // biến cộng dồn, nhân dồn
                          // acc/ accmulation
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
            return product;       
    }
}

//CODING CONVENTION: QUY TẮC VIẾT CODE CTY BẮT PHẢI THEO
//ALT SHIFT F ko lạm dụng


//TA SẼ HỌC SƠ VỀ KHÁI NIỆM TTD - TEST DRIVEN DEVELOPMENT
// LÀ KỸ THUẬT LẬP TRÌNH/ ÁP DỤNG CHO DÂN DEV ĐỂ GIA TĂNG CHẤT LƯỢNG CODE/ GIẢM THIỂU CÔNG SỨC TÌM BUG
// TDD yêu cầu dev khi viết code/viết hàm/class phải viết luôn các bộ kiểm thử, viết luôn các test case/ viết luôn các đoạn code dùng thử hàm
// để kiểm tra tính đúng đắn của hàm
// viết code kèm với viết test cases
// viết code có ý thức viết luôn phần kiểm thử code/hàm/class
//   dev        driven                    test                 
// SAU KHI CÓ ĐC TÊN HÀM(CHỈ TÊN HÀM), VIẾT LUÔN CÁC TÍNH HUỐNG XÀI HÀM 
// CHẤP NHẬN KHI HÀM CHẠY SAI - DO CODE CHƯA XONG
// SAU ĐÓ TA TỐI ƯU/ CHỈNH SỬA CODE ĐỂ ĐẢM BẢO CODE CHẠY ĐÚNG
// QUÁ TRÌNH SAI - ĐÚNG - SAI - ĐÚNG DIỄN RA LIÊN TUC (CYCLE)

