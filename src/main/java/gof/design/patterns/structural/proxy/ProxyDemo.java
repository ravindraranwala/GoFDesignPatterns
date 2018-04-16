package gof.design.patterns.structural.proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		TextDocument text = new TextDocument();
		text.insert(new ImageProxy("anImageFileName"));
	}

}
