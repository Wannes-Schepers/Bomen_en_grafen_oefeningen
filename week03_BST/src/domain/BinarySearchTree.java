package domain;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {

	public BinarySearchTree(E data, BinarySearchTree<E> leftTree, BinarySearchTree<E> rightTree) {
		super(data, leftTree, rightTree);
	}
			
	public BinarySearchTree(E data) {
		super(data);
	}

	public boolean lookup(E data) {
		if (this.data == data) {
			return true;
		} else if (this.data.compareTo(data) > 0) {
			if (this.leftTree == null) {
				return false;
			} else {
				return this.leftTree.lookup(data);
			}
		} else {
			if (this.rightTree == null) {
				return false;
			} else {
				return this.rightTree.lookup(data);
			}
		}
	}

	public boolean addNode(E data) {
		if (data == null) {
			throw new IllegalArgumentException();
		}
		if (this.data.compareTo(data) == 0) {
			return false; //geen twee keer zelfde data in BST
		} else if (this.data.compareTo(data) > 0) {//ga naar linkersubboom
			if (this.leftTree == null) {
				this.leftTree = new BinarySearchTree<>(data);
				return true;
			} else return (this.leftTree.addNode(data));
		} else if (this.rightTree == null) {
			this.rightTree = new BinarySearchTree<>(data);
			return true;
		} else return (this.rightTree.addNode(data));
	}

	public boolean removeNode(E data){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public E searchSmallest(){
		if(this.leftTree == null) {
			return this.data;
		}
		else {
			return this.leftTree.searchSmallest();
		}
	}

	public E searchGreatest(){
		if(this.rightTree == null) {
			return this.data;
		}
		else {
			return this.rightTree.searchGreatest();
		}
	}
}


