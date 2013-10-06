package br.org.pucsp;

public class Translator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lexic lexic = new Lexic();
		Syntactic syntactic = new Syntactic(lexic);
		BinaryTree tree = new BinaryTree();
		
		syntactic.constructTree(tree, args[0]);

	}

}
