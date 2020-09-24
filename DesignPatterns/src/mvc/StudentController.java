package mvc;

public class StudentController {
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setStudentName(String name){
	      model.setNome(name);		
	}

	public String getStudentName(){
	    return model.getNome();		
	}

	public void setStudentRollNo(String rollNo){
	    model.setMatricula(rollNo);		
	}

	public String getStudentRollNo(){
	    return model.getMatricula();		
	}
	
	public void updateView(){				
	    view.printStudentDetails(model.getNome(), model.getMatricula());
	}
}
