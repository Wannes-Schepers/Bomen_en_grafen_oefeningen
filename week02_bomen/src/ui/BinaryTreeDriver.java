package ui;

import domain.BinaryTree;

public class BinaryTreeDriver {

	public static void main(String[] args) {
		// -------------------- Boom ----------------------------- //
		// Leafs
		BinaryTree<String> nodeA = new BinaryTree<>("A");
		BinaryTree<String> nodeC = new BinaryTree<>("C");
		BinaryTree<String> nodeE = new BinaryTree<>("E");
		BinaryTree<String> nodeH = new BinaryTree<>("H");
		
		// knoop D heeft links C en rechts E
		BinaryTree<String> nodeD = new BinaryTree<>("D", nodeC, nodeE);
		// knoop I heeft links H
		BinaryTree<String> nodeI = new BinaryTree<>("I", nodeH,null);

		// knoop B heeft links A en rechts D
		BinaryTree<String> nodeB = new BinaryTree<>("B", nodeA, nodeD);
		// knoop G heeft rechts I
		BinaryTree<String> nodeG = new BinaryTree<>("G", null, nodeI);

		// boom heeft root F en heeft links B en rechts G
		BinaryTree<String> boom = new BinaryTree<>("F",nodeB, nodeG);

		//------------------------- Functies -------------------------- //

		//boom.printPreorder();

		//2.3
		//boom.printINorder();

		//2.4
		//boom.printPostorder();

		//2.5
		//System.out.println("Aantal Knopen: " + boom.countNodes());

		//2.6
		//System.out.println("Diepte: " + boom.getDepth());

		//2.7
		//System.out.println(nodeC.isLeaf());

		//2.8
		//System.out.println("Number of leafs: " + boom.countLeaves());

		//2.9
		//boom.getDataLeaves();

		//2.10
		System.out.println(boom.contains("A"));
	}

}
