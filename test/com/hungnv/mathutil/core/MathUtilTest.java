/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hungnv.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;


/**
 *
 * @author LENOVO
 */
public class MathUtilTest {
    
    //Ta đi test ngoại lệ, tức là so sánh/ đo lường xem ngoại lệ có xuất hiện hay ko ta đưa data sai
    // thay vì so sánh expected vs actual
    // LÚC NÀY TA SẼ ĐI ƯỚC LƯỢNG XEM NGOẠI LỆ CÓ XUẤT HIỆN NHƯ KÌ VỌNG HAY KO/ NẾU XH NHƯ KÌ
    // VỌNG, SURE -> HÀM THIẾT KẾ NGON
    // NẾU NGOẠI LỆ XH NHƯ KÌ VỌNG, THÌ MÀU XÀNH
    @Test(expected = Exception.class)
    public void TestFactorialGivenWrongArgumentThrowsException(){
        //Test case #3: đưa data cà chớn n âm, n quá lớn hàm đc thiết kế ném về ngoại lệ
        // thấy ngoại lệ xuất hiện như kỳ vọng thì lúc đó pass
        System.out.println("Hope to see the Exception | Illegal Argument Exception");
        MathUtil.getFactorial(-5);
        
    }
    
    
    @Test
        public void testFactorialGivenRightArgumentReturnsWell2(){

        //Test case 4: n = 3 hy vọng trả về 6
        
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case 5: n = 4 hy vọng trả về 24
        
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
         //Test case 6: n = 5 hy vọng trả về 120
        
        Assert.assertEquals(120, MathUtil.getFactorial(5));
                
    }

    
    
    
    
    
    @Test   //coding convention - quy tắc viết code
            // Tên hàm kiểm thử/ tên hàm của test script
            // tình huống này, ta muốn test hàm getF() tham số tử tế
            // n = 0..20!!!
    public void testFactorialGivenRightArgumentReturnsWell(){
        
        //Test case số 1: n=0, hy vọng hàm trả về 1
        // thực tế hàm trả về mấy th
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        // so sánh giữa expected vs actual, máy tự so, ko cần sout khổ cực
        Assert.assertEquals(expected, actual);
        
        //Test case2: n=1 hy vọng trả về 1
        
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        
        //Test case3: n=2 hy vọng trả về 2
        
        Assert.assertEquals(2, MathUtil.getFactorial(2));
                
    }
    
    //@Test ra lệnh cho thư viện JUnit mình đã add/import 
    // tự động generate ra cái hàm public static void main()
    //biến hàm tryJUnitComparison() thành hàm main()
    // và gửi main() này cho JVM chạy - Java Virtual Machine
    //@Test ~~ main()
   // ko @Test thì class ko có main(), lấy gì mà chạy no runable method
    
    
    
    
    
        @Test
    public void tryJUnitComparison(){
        // hàm này thử việc so sánh expected vs actual
        // coi sai đúng, ra màu như thế nào
        // ta đang xài hàm của thư viện JUnit nhưng ko xài bừa bãi mà viết có quy tắc định trc
        // quy tắc định trc nằm ở @ - annotation       
        Assert.assertEquals(100, 100);
                
                
                
    }
   
    
}
// CLASS NÀY DEV SẼ VIẾT NHỮNG CÂU LỆNH DÙNG ĐỂ TEST HÀM CỦA CODE CHÍNH, TEST CÁC HÀM CỦA CLASS MATHUTIL
// Trong class này sẽ có những lời gọi hàm getFactorial()
// giống giống mình đã àm test ở bên MAIN()
// nhưng khác ở chỗ, SAI -> ĐỎ, ĐÚNG -> MÀU XANH
// mắt ko cần nhìn các dòng output từ hàm System.out cho mất sức
// mắt giờ chỉ nhìn 2 màu XANH ĐỎ
// Muốn có đc điều này ta sẽ dùng thêm các UNIT TESTING FRAMEWORK
// VD: JUnit, TestNG (Java)
//      xUnit, MSTest, NUit (C#)
//      PHPUnit (PHP)

// VIỆC VIẾT CODE ĐỂ TEST CODE ĐƯỢC GỌI LÀ UNIT TESTING
// ĐOẠN CODE TRONG CLASS NÀY DÙNG JUNIT/UNIT TESTING FRAMEWORK
// ĐỂ KIỂM THỬ HÀM CỦA CODE CHÍNH
// ĐOẠN CODE KIỂM THỬ NÀY ĐƯỢC GỌI LÀ: TEST SCRIPT
// Code dùng để test cide (chính) gọi là test script
// Test Script là các đoạn code đc viết ra để test code chính (DAO)
// DTO, Controller, API...
// Muốn test thì cần phải phác thảo các TEST CASE
// Test script sẽ sử dụng các Test Case
// VD: Viết code để test hàm getFactorial() với các case
// n = -5. 0, 1...


//QUY TẮC XANH ĐỎ
// MÀU XANH KHI TẤT CẢ CÁC TEST CASE CÙNG XANH,tức là expected == actual cho tất cả các case

// MÀU ĐỎ: CHỈ CẦN 1 TRONG NHỮNG TEST CASE, CHỈ VẦN 1 CÁI EXPECTED != ACTUAL -> KẾT LUẬN HÀM SAI
//Ý nghĩa các quy tắc: nếu đã test, nếu đã liệt kê các test case thì chúng phải đúng hết, chỉ cần
// 1 thằng sai, ko ổn định về việc return -> hàm sai
// ĐÚNG ĐÚNG HẾT, SAI CHỈ CẦN 1 THẰNG

// EXPECTED == ACTUAL -> CASE ĐÚNG, TEST CASE PASSED
// EXPECTED != ACTUAL -> CASE FAILED
    // NẾU EXPECTED LÀ CHÍNH XÁC, HÀM ĐÃ XỬ LÍ SAI, BUG
    // CŨNG CÓ KHI EXPECTED, CÁI RA KÌ VỌNG BỊ SAI! LỖI DO DÂN QC TÍNH TOÁN BẰNG TAY BỊ SA














