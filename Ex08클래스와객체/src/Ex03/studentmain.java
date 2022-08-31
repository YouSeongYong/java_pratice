package Ex03;

public class studentmain {

	public static void main(String[] args) {
		
		Student stu=new Student("홍길동","20150675",22,50,89,77); // <<객체 만드는거임
		
//		stu.name="홍길동";
//		stu.number="20150675";
//		stu.age=22;
//		stu.scoreJava=50;
//		stu.scoreWeb=89;
//		stu.scoreAndroid=77;
		Student stu2=new Student(); // <<객체 만드는거임
		
		stu2.name="김영희";
		stu2.number="20090541";
		stu2.age=29;
		stu2.scoreJava=90;
		stu2.scoreWeb=25;
		stu2.scoreAndroid=30;
		stu.show();
		stu2.show();
		
		
		
	}

}
