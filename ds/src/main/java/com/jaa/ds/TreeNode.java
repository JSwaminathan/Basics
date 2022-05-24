package com.jaa.ds;


public class TreeNode<T extends Comparable<T>> {
	protected T value;
	TreeNode<T> left;
	TreeNode<T> right;

	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public TreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}
	public TreeNode<T> getRight() {
		return right;
	}
	public void setRight(TreeNode<T> right) {
		this.right = right;
	}
	public String toString() {
		return (value.toString());
	}

}
