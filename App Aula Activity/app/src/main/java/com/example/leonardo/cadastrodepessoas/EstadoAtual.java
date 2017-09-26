package com.example.leonardo.cadastrodepessoas;

/**
 * Created by leonardo on 26/09/17.
 */

public enum EstadoAtual {
    ATIVO {
        @Override
        public String toString() {
            return "Ativo";
        }
    }, INATIVO {
        @Override
        public String toString() {
            return "Inativo";
        }
    }
}
