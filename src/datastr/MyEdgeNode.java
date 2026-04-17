package datastr;

public class MyEdgeNode {
private int indexOfVerticeTO;
private int weight;
private MyEdgeNode nextEdgeNode;
public int getIndexOfVerticeTO() {
	return indexOfVerticeTO;
}
public int getWeight() {
	return weight;
}
public MyEdgeNode getNextEdgeNode() {
	return nextEdgeNode;
}
public void setIndexOfVerticeTO(int indexOfVerticeTO) {
	this.indexOfVerticeTO = indexOfVerticeTO;
}
public void setWeight(int weight) {
	if (weight>0) {
	this.weight = weight;
	}
	else {
		this.weight=1;
	}
}
public void setNextEdgeNode(MyEdgeNode nextEdgeNode) {
	this.nextEdgeNode = nextEdgeNode;
}
public MyEdgeNode(int indexOfVerticeTo, int weight) {
	setIndexOfVerticeTO(indexOfVerticeTo);
	setWeight(weight);
}
public String toString() {
	return "index: "+indexOfVerticeTO+ " ["+weight+"]";
}
}
