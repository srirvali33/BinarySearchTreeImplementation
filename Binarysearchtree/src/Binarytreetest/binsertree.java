package Binarytreetest;

public class binsertree {

	Node root;

	void insert(int key) {
		root = insertkey(root, key);
	}

	/* function to insert a new key */
	Node insertkey(Node tmp, int key) {

		/* If the tree is empty, return a new node */
		if (tmp == null) {
			tmp = new Node(key);
			return tmp;
		}

		/* or recur down the tree */
		if (key < tmp.key )
			tmp.leftnode = insertkey(tmp.leftnode, key);
		else if (key > root.key)
			tmp.rightnode = insertkey(tmp.rightnode, key);

		return tmp;
	}

	// method calls InorderRec()
	void inorder() {
		inorderRec(root);

	}

	// Inorder traversal of BST
	void inorderRec(Node root) {

		if (root != null) {
			inorderRec(root.leftnode);
			System.out.print(root.key + " ");
			inorderRec(root.rightnode);

		}

	}

	// This method mainly calls delete()
	void deleteKey(int key) {
		root = delete(root, key);
	}

	/* A recursive function to insert a new key in BST */
	Node delete(Node root, int key) {
		/* If the tree is empty */
		if (root == null)
			return root;

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.leftnode = delete(root.leftnode, key);
		else if (key > root.key)
			root.rightnode = delete(root.rightnode, key);

		// if key is same as root's key, then This is the node
		// to be deleted
		else {
			// node with only one child or no child
			if (root.leftnode == null)
				return root.rightnode;
			else if (root.rightnode == null)
				return root.leftnode;

			// node with 2 children
			// root.key = minValue(root.rightnode);
			root.key = maxValue(root.leftnode);

			// Delete the inorder successor
			// root.rightnode = deleteRec(root.rightnode, root.key);

			// Delete the inorder predecessor
			root.leftnode = delete(root.leftnode, root.key);
		}

		return root;
	}

	// inorder successor
	int minValue(Node root) {
		int minv = root.key;
		while (root.leftnode != null) {
			minv = root.leftnode.key;
			root = root.leftnode;
		}
		return minv;
	}

	// inorder predecessor
	int maxValue(Node root) {
		int maxpredec = root.key;
		while (root.rightnode != null) {
			maxpredec = root.rightnode.key;
			root = root.rightnode;
		}
		return maxpredec;
	}

}
