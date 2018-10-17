#ifndef NODE_H

/* Fazer com int, depois generalizar para T */

class Node {
	private:
		int content;
		int * left;
		int * right;
	public:
		Node();
		~Node();
};

#define NODE_H
#endif