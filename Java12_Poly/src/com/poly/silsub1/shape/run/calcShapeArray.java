package com.poly.silsub1.shape.run;

public class calcShapeArray {
	public void calcShapeArray() {
        IShape[] iarr = new IShape[5];
        
        // 삼각형 객체 생성 (임의의 값 사용)
        iarr[0] = new Triangle(3, 4); // 빗변: 5, 넓이: 6, 둘레: 12
        iarr[1] = new Triangle(5, 12); // 빗변: 13, 넓이: 30, 둘레: 30

        // 각 도형의 넓이와 둘레를 출력
        for (IShape shape : iarr) {
            if (shape != null) {
                System.out.println(shape);
                System.out.println("Area: " + shape.area());
                System.out.println("Perimeter: " + shape.perimeter());
                System.out.println();
            }
        }
    }
}
