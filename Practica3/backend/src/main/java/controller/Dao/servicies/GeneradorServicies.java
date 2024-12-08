package controller.Dao.servicies;

import controller.tda.list.LinkedList;
import models.Generador;
import controller.Dao.GeneradorDao;

public class GeneradorServicies {
    private GeneradorDao obj;

    public GeneradorServicies() {
        obj = new GeneradorDao();
    }

    public Boolean save() throws Exception {
        return obj.save();
    }

    public Boolean update() throws Exception {
        return obj.update();
    }

    public Boolean delete(Integer id) throws Exception {
        return obj.delete(id);
    }

    public LinkedList<Generador> listAll() {
        return obj.getlistAll();
    }

    public Generador getGenerador() {
        return obj.getGenerador();
    }

    public void setGenerador(Generador generador) {
        obj.setGenerador(generador);
    }

    public Generador get(Integer id) throws Exception {
        return obj.get(id);
    }

    public LinkedList<Generador> ordenar(String algoritmo, LinkedList<Generador> lista, Integer type_order,
            String atributo)
            throws Exception {
        switch (algoritmo) {
            case "QuickSort":
                return obj.quickSort(lista, type_order, atributo);
            case "MergeSort":
                return obj.mergeSort(type_order, atributo);
            case "ShellSort":
                return obj.shellSort(type_order, atributo);
            default:
                return obj.quickSort(lista, type_order, atributo);
        }
    }

    public LinkedList<Generador> buscar(String algoritmo, String atributo, String value) throws Exception {
        switch (algoritmo) {
            case "Binaria":
                Generador generador = obj.binaria(atributo, value);
                LinkedList<Generador> list = new LinkedList<>();
                list.add(generador);
                return list;
            case "LinealBinaria":
                return obj.linealBinaria(atributo, value);
            default:
                return obj.linealBinaria(atributo, value);
        }
    }

}
