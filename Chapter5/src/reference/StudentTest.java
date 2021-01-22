package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("±¹¾î", 100);
		studentLee.setMathSubject("¼öÇÐ", 95);
		
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubject("±¹¾î", 80);
		studentKim.setMathSubject("¼öÇÐ", 99);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		
	}

}
