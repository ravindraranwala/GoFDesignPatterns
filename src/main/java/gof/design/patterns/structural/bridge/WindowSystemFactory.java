package gof.design.patterns.structural.bridge;

/**
 * Abstract Factory that creates a {@link WindowImp} based off of the
 * environment.
 * 
 * @author URANWRA
 *
 */
public class WindowSystemFactory {
	private static WindowSystemFactory instance;

	private WindowSystemFactory() {

	}

	public WindowImp makeWindowImp() {
		WindowImp windowImp = null;
		// Create a WindowImpl based on the environment.
		switch (getEnvt()) {
		case XWINDOW:
			windowImp = new XWindowImp();
			break;
		case PM:
			windowImp = new PMWindowImp();
		default:
			break;
		}

		return windowImp;
	}

	private Environment getEnvt() {
		return Environment.XWINDOW;
	}

	public static final WindowSystemFactory getInstance() {
		if (instance == null) {
			instance = new WindowSystemFactory();
		}
		return instance;
	}
}
