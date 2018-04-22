package gof.design.patterns.behavioral.command;

// Receiver.
public class Document {
	private final String name;

	public Document(String name) {
		super();
		this.name = name;
	}

	public void open() {
		System.out.println("Opening the document: " + this.name);
	}

	public void close() {
		System.out.println("Closing the document: " + this.name);
	}

	public void paste() {
		System.out.println("Pasting the content...");
	}

	public void copy() {
		System.out.println("Copying the document content to the Clip board.");
	}
}
