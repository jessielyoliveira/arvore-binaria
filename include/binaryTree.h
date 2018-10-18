#ifndef BINARYTREE_H
#define BINARYTREE_H

#include "node.h"

typedef Node * Tree;

class BinaryTree {
private:
	Tree * root;

public:
	BinaryTree();
	~BinaryTree();
};

#endif
