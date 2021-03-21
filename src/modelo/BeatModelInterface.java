package modelo;

import vista.BPMObserver;
import vista.BeatObserver;

public interface BeatModelInterface {
	
	void inicializar();
	void on();
	void off();
	void setBPM(int bpm);
	int getBPM();
	
	// ADD
	
        void registrarObserver(BeatObserver o);
        void removerObserver(BeatObserver o);

        void registrarObserver(BPMObserver o);
        void removerObserver(BPMObserver o);
        
}
