package animais;

public interface Animal {
	
	default void respirar() {
		System.out.println("está respirando oxigenio");
	}
	
	void mover();
	
	void comer();
	
}
