# Makefile by Jessiely Oliveira

# $@ nome do alvo
# $^ lista com os nomes de todos os pré-requisitos
# $< nome do primeiro pré-requisito da lista

# Remoção
RM = rm -rf 

# Compilador
CC=g++ 

# Variáveis para os subdiretórios
INC_DIR=./include
SRC_DIR=./src
OBJ_DIR=./build
BIN_DIR=./bin
DOC_DIR=./doc
DAT_DIR=./data

# Opções de Compilação
CFLAGS=-Wall -pedantic -ansi -std=c++11 -I. -I$(INC_DIR)

# Garante que os alvos desta lista não sejam confundidos com arquivos de mesmo nome
.PHONY: all init clean doxy debug doc


all: init arvoreBinaria
debug: CFLAGS += -g -O0
debug: arvoreBinaria

init:
	@mkdir -p $(BIN_DIR)/
	@mkdir -p $(OBJ_DIR)/

arvoreBinaria: $(OBJ_DIR)/main.o 
	$(CC) $(CFLAGS) -o $(BIN_DIR)/$@ $^
	@echo "Compilação concluída!"

$(OBJ_DIR)/main.o: $(SRC_DIR)/main.cpp $(INC_DIR)/node.h $(INC_DIR)/binaryTree.h
	$(CC) -c $(CFLAGS) -o $@ $<


doxy:
	$(RM) $(DOC_DIR)/*
	doxygen -g

doc:
	doxygen

clean:
	$(RM) $(BIN_DIR)/* 
	$(RM) $(OBJ_DIR)/*	
	$(RM) $(DOC_DIR)/*
	$(RM) $(DAT_DIR)/output/*
