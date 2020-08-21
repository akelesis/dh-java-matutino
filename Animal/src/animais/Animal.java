package animais;

public interface Animal {
	
	default void respirar() {
		System.out.println("est� respirando oxigenio");
	}
	
	void mover();
	
	void comer();
	
}
