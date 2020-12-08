package Part3.ex4.UI코드분리하기;

public class Exam {
	int kor;
	int eng;
	int math;
	
	public Exam() {
		this(0,0,0);
	}
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getKor() {		
		return kor;
	}
	public int getEng() {		
		return eng;
	}
	public int getmath() {		
		return math;
	}
	public void setKor(int kor) {
		this.kor = kor;		
	}
	public void setEng(int eng) {
		this.eng = eng;		
	}
	public void setMath(int math) {
		this.math = math;		
	}
	public int total() {		
		return kor+eng+math;
	}
	public float avg() {		
		return total()/3.0f;
	}
}
