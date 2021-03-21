package controlador;


// desacompla la relacion entre vista y controlador, por si vista quiere interactuar con otro modelo por ej
public interface ControllerInterface {

	void start();

	void stop();

	void incrementarBPM();

	void disminuirBPM();

	void setBPM(int bpm);

}
