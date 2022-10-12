/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnv.mathutil.main;

import com.hungnv.mathutil.core.MathUtil;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //   tryTDDFirst();
     TestFactorialGivenWrongArgumentThrowsException();
    }
    public static void TestFactorialGivenWrongArgumentThrowsException(){
        //Test case #3: đưa data cà chớn n âm, n quá lớn hàm đc thiết kế ném về ngoại lệ
        // thấy ngoại lệ xuất hiện như kỳ vọng thì lúc đó pass
        System.out.println("Hope to see the Exception | Illegal Argument Exception");
        MathUtil.getFactorial(-5);
    }
    
    
    // hàm này viết ra để dùng thử kĩ thuật viết code kiểu TDD
    // gọi thử hàm chính bên core xem nó sai đúng thành công
    public static void tryTDDFirst(){
        
        
        //Test case 1(kiểm thử hàm số 1)
        //Input: n=1;
        //gọi hàm getFactorial(1)
        //Hy vọng hàm trả về 1, vì 1!=1
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        // so sánh expected vs actual coi chúng nó giống nahu ko
        // giống -> hàm đúng với case đang test
        //sai -> bug ! với case đang test
        System.out.println("Test 1! status: " + 
                            "Expected: " + expected +
                            " | Actual: " + actual);
        
        //Test case 2(kiểm thử hàm số 2)
        //Input: n=2;
        //gọi hàm getFactorial(2)
        //Hy vọng hàm trả về 2, vì 2!=2
        
        
        System.out.println("Test 2! status: " + 
                            "Expected: 2" +
                            " | Actual: " + MathUtil.getFactorial(2));
    }
    
}

//TEST CASE LÀ GÌ
// Là 1 tình huống xài app. kiểm thử app/ kiểm thử tính năng/màn hình chức năng/ xử lí của app
//test case là tính huống kiểm thử app/ chức năng mà khi đó ta phải đưa vào data giả/mãu/test
// ta phải đưa ra giả trị kì vọng ta mong chờ app trả ra
// sau đó chờ hàm/ tính năng xử lí xong trả ra kết quả
// và ta nhìn KQ và to so sánh với kì vọng trc đó
// để kết luận hàm ổn/tính năng ổn, TEST CASE PASSED
//                             ko ổn TEST CASE FAILED





