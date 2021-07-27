package br.com.alura.rh.model;

public enum Cargo {

    ANALISTA {
        @Override
        public Cargo getProximoCargo() {
            return ESPECIALISTA;
        }
    },
    ASSISTENTE {
        @Override
        public Cargo getProximoCargo() {
            return ANALISTA;
        }
    },
    ESPECIALISTA {
        @Override
        public Cargo getProximoCargo() {
            return GERENTE;
        }
    },
    GERENTE {
        @Override
        public Cargo getProximoCargo() {
            return GERENTE;
        }
    };


    public abstract Cargo getProximoCargo();

}
