package test;

import controlador.BeatController;
import controlador.ControllerInterface;
import modelo.BeatModel;
import modelo.BeatModelInterface;

public class DJTestDrive {

	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}

}
