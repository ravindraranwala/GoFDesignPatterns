package gof.design.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Application {
	private final List<Document> documents = new ArrayList<>();

	public void add(Document doc) {
		this.documents.add(doc);
	}

	public List<Document> getDocuments() {
		return documents;
	}

}
