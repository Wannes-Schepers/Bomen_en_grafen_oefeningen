package domain;

public class BinaryTree<E> {
	private E data;
	private BinaryTree<E> leftTree, rightTree;
	
	public BinaryTree(E data){
		this(data,null,null);
	}
	
	public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree){
		if (data == null) {
			throw new IllegalArgumentException();
		}
		this.data= data;
		this.leftTree= leftTree;
		this.rightTree= rightTree;
	}
	
	public void printPreorder(){
			System.out.print(this.data + " ");
			if (this.leftTree != null) this.leftTree.printPreorder();
			if (this.rightTree != null) this.rightTree.printPreorder();
	}

	// 2.3
	public void printINorder() {
		if (this.leftTree != null) {
			this.leftTree.printINorder();
		}
		System.out.print(this.data + " ");
		if (this.rightTree != null) {
			this.rightTree.printINorder();
		}
	}

	//2.4
	public void printPostorder() {
		if (this.leftTree != null) {
			this.leftTree.printPostorder();
		}
		if (this.rightTree != null) {
			this.rightTree.printPostorder();
		}
		System.out.print(this.data + " ");
	}

	//2.5
	public int countNodes() {
		return 1 + (this.leftTree == null ? 0 : this.leftTree.countNodes()) + (this.rightTree ==null ? 0 : this.rightTree.countNodes());
	}

	//2.6
	public int getDepth() {
		return 1 + (Math.max((this.leftTree == null) ? 0 : this.leftTree.getDepth(), (this.rightTree == null) ? 0 : this.rightTree.getDepth()));
	}

	//2.7
	public boolean isLeaf() {
		return (this.leftTree == null && this.rightTree == null);
	}

	//2.8
	public int countLeaves() {
		if(this.isLeaf()){
			return 1;
		}
		else {
			return ((this.leftTree == null) ? 0 : this.leftTree.countLeaves()) + ((this.rightTree == null) ? 0 : this.rightTree.countLeaves());
		}
	}

	//2.9
	public void getDataLeaves() {
		if(this.leftTree != null) this.leftTree.getDataLeaves();
		if(this.rightTree != null) this.rightTree.getDataLeaves();
		if(this.leftTree == null && this.rightTree == null) System.out.print(this.data);
	}

	//2.10
	public boolean contains(E d){
		if (d == null) {
			return false;
		}
		if (d.equals(this.data)) {
			return true;
		} else {
			return (this.leftTree == null ? false : this.leftTree.contains(d)) ||
					(this.rightTree == null ? false : this.rightTree.contains(d));
		}
	}
}
