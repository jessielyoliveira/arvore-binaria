#ifndef NODE_H
#define NODE_H

#include <memory>
using std::unique_ptr;

class Node {
private:
	int content;
	Node * leftChild;
	Node * rightChild;

public:
	Node();
	~Node();

};


// Inserção


// Remoção
// Busca (pré, pós, em) ordem

#endif