package L02_0930;

public class school {

		// TODO Auto-generated method stub
		String school_name;
		int grade;
		
		//기본 생성자
		public school() {
			school_name = "jejuelementary";
			grade = 6;
			System.out.println(grade + " grade in " + school_name + " school ");
		}
		
		//매개변수 생성자
		public school(String school_name,int grade){
		    this.school_name = school_name;
		    this.grade = grade;
		    System.out.println(grade+" grade in "+school_name+" school");
		    
		 }

	}

