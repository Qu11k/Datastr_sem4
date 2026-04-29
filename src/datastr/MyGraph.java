package datastr;

public class MyGraph<Ttype> {
private MyVerticeNode<Ttype>[] vertices;
private final int DEFAULT_SIZE = 5 ;
private int size = DEFAULT_SIZE;
private int howManyElements = 0;

public int getHowManyElements() {
	return howManyElements;
}
public MyGraph() {
	vertices=new MyVerticeNode[size];
}
public MyGraph(int inputSize) {
	if (inputSize>0 && inputSize < 500) {
		size=inputSize;
	}
	vertices = new MyVerticeNode[size];
}
public boolean isEmpty() {
	return (howManyElements==0);
}
public boolean isFull() {
	return (howManyElements==size);
}
private void resize() {
	int newSize = (size <= 100) ? (size*2): ((int)(size*1.5));
	MyVerticeNode<Ttype>[] newVertices = new MyVerticeNode[newSize];
	for (int i = 0; i<howManyElements;i++) {
		newVertices[i] = vertices[i];
		
	}
	size=newSize;
	vertices=newVertices;
	System.gc();
}
}
