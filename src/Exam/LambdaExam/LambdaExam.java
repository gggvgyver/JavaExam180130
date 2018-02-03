package Exam.LambdaExam;

public class LambdaExam {
    public static void main(String[] args) {
/*        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++) {
                    System.out.println("안녕 별이야!");
                }
            }
        }).start();*/
/*위 식을 람다표현식으로 변환*/
    new Thread(()->{
        for(int i=0; i<10; i++) {
            System.out.println("안녕 별이야!");
        }
    }).start();
    }
}//End of class
