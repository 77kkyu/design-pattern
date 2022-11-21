package ex3;

import java.util.ArrayList;

public class Directory extends Entry {
	private String name;
	// 디렉토리는 자식 디렉토리, 자식 파일들을 가질 수 있다.
	private ArrayList<Entry> children = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		for (Entry entry : children) {
			size += entry.getSize();
		}
		return size;
	}

	@Override
	public Entry add(Entry entry) {
		children.add(entry);
		return this;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		for (final Entry entry : children) {
			entry.printList(prefix + "/" + name);
		}
	}
}
