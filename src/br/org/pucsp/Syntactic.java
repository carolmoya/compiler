package br.org.pucsp;

import sun.reflect.generics.tree.Tree;

public class Syntactic {
	
	private Lexic lexic;
	
	public Syntactic(Lexic lexic) {
		this.lexic = lexic;
	}
	
	public void constructTree(BinaryTree tree, String sentence) {
		this.command(sentence);
		
	}
	
	private void command(String sentence) {
		switch (lexic.identifyCommand(sentence)) {
			case "ADD" : 
				this.twoRegisters(sentence);
				tree.add("ADD");
				break;
		}
	}
	
	private void oneRegister(String sentence) {
		tree.add(lexic.identifyRegister(sentence, 1));
	}
	
	private void twoRegisters(String sentence) {
		tree.add(lexic.identifyRegister(sentence, 1));
		tree.add(lexic.identifyRegister(sentence, 2));
	}
}
