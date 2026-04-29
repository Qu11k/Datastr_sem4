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
public void addVertice(Ttype element) throws Exception {
	if (element == null) {
		throw new Exception("elements nevar but bez references");
	}
	for (int i = 0; i<howManyElements;i++) {
		if(vertices[i].getElement().equals(element)) {
			throw new Exception("tads elements eksiste to nevar pievienot atkartoti");
		}
	}
	if (isFull()) {
		resize();
	}
	MyVerticeNode newVerticeNode= new MyVerticeNode<Ttype>(element);
	vertices[howManyElements]=newVerticeNode;
	howManyElements++;
}
public void addEdge(Ttype elementFrom,Ttype elementTo, int weight) throws Exception {
	//ienakosie mainigie
	if (elementFrom==null || elementTo==null||weight<=0){
		throw new Exception("Kads no ievades parametriem nav pareizs");
	}
	int indexOfElementFrom=findVertice(elementFrom);
	int indexOfElementTo=findVertice(elementTo);
	MyEdgeNode newEdge= new MyEdgeNode(indexOfElementTo, weight);
	MyVerticeNode verticeNodeFrom = vertices[indexOfElementFrom];
	if(verticeNodeFrom.getFirstEdgeNode()==null) {
		verticeNodeFrom.setFirstEdgeNode(newEdge);
	}
	else {
		MyEdgeNode currentNode = verticeNodeFrom.getFirstEdgeNode();
		while(currentNode.getNextEdgeNode()!= null) {
			currentNode.setNextEdgeNode(newEdge);
		}
	}
	//parbaudit vai abi elementi ir izveidoti
	//izveidot myedgenode objektu
	
}
private int findVertice(Ttype element) throws Exception {
	if(element==null) {
		throw new Exception("elements bez references");
	}
	for(int i=0; i<howManyElements;i++) {
		if(vertices[i].getElement().equals(element)) {
			return i;
		}
	}
	throw new Exception("Mekleta virsotne nav atrasta");
}
public void print() throws Exception {
	if(isEmpty()) {
		throw new Exception("grafs ir tukss un to nevar izprintet");
	}
	for (int i =0;i<howManyElements;i++) {
		System.out.println(vertices[i].toString());
		MyEdgeNode currentNode=vertices[i].getFirstEdgeNode();
		while (currentNode!=null) {
			int indexVerticleTo = currentNode.getIndexOfVerticeTO();
			System.out.println("-->"+vertices[indexVerticleTo].getElement()+", distance: "+currentNode.getWeight()+"km ---");
			currentNode = currentNode.getNextEdgeNode();
		}
		System.out.println();
	}
}
}
