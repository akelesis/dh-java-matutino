package mvc;

public class Programa {
	public static void main(String[] args) {
		Student model = serveDoBanco();
		
		StudentView view = new StudentView();
		
		StudentController studentController = new StudentController(model, view);
		
		studentController.updateView();
		
		studentController.setStudentName("Angelo Eduardo");
		
		studentController.updateView();

	}
	
	private static Student serveDoBanco() {
		Student student = new Student();
		student.setNome("Rayssa Ferreira");
		student.setMatricula("2020021543");
		return student;
	}
}
