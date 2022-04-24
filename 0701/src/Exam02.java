
public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Student s = new Student("ȫ�浿",1,1,100,60,76);
	     System.out.println(s.info());
	}
}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal() {
		return kor + eng + math;
	}

	public float getAverage(){
		return getTotal()/3;
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
}

