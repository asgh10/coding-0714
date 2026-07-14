//복습 
//printf로 출력하는 방법 
//문제 풀기 
//1. 짝수 번호 학생 출력    2. 학생 이름 역순 출력    3. 이름 앞에 ★출력    4. 번호를 두 자리로 출력    5. 3번 문제를 printf로 출력





public class code8{
    public static void main(String[] args){
        String[] students = {"철수", "영희", "민수", "수진"}; 
        // 1번 문제
        for(int i = 0; i <= students.length-1; i++){
                if((i+1) % 2 == 0 ){
                    System.out.println((i+1)+"."+students[i]);
                }
            }
            /* 
            for(int i = 1; i < students.length; i+=2){
                System.out.println((i+1)+"."+ students[i]);             위 if 코드와 같은 값이 출력 되는 코드
            }
            */
        // 2번 문제
            for(int i = students.length-1; i >= 0; i--){
                System.out.println(students[i]);
            }
        // 3번 문제
            for(int i = 0; i<students.length; i++){
                System.out.println("★ " + students[i]);        //이모지는 window + . 누르면 된다   /   ㅁ + 한자 도 된다 
            }
        
        //print 예시 = System.out.printf("서식" , 값);
        //%d = 정수     %f = 실수     %c = 문자     %s = 문자열     %n = 줄바꿈 

        /* 
        System.out.printf("%s %s %n","성일","정보고");

        String name = "김철수";
        int age = 17;
        System.out.printf("이름 : %s%n",name);
        System.out.printf("나이 : %d%n", age);
        //형식지정자가 두개지만 값이 1개인 이유는 %n은 줄바꿈이기에 값이 1개여도 상관이 없다

        System.out.printf("%d%n", 7);
        System.out.printf("%02d%n", 7); 
        //%02d 정수형이지만 02가 붙어 0은 앞에 0을 붙여라 2는 2자리 까지 나타내라 해서 07이 뜬다

        for(int i = 0; i<=10; i++){
            System.out.printf("%02d%n",i);
        }

        double score = 95.12345;
        System.out.printf("%.2f",score);
        //%f 실수지만 소수점 몇자리 까지 나타내고 싶은지 %f 안에 .숫자 를 적는다 .2라서 2자리 까지 밖에 안보인다 (기본으로 보여주는 소수점은 6자리이다)
        */
       
        // 4번 문제
        for(int i = 0; i < students.length; i++){
            System.out.printf("%02d.%s%n" , i+1, students[i]); // 형식지정자 순서에 맞게 값을 적어야 한다
        }
       
       
       
        // 5번 문제
        for(int i = 0; i<students.length; i++){
                System.out.printf("★ %s%n",students[i]);  
            }



    }
}