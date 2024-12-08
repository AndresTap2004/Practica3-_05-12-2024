package controller.Dao.servicies;

import controller.tda.list.LinkedList;
import models.Familia;
import models.Generador;
import controller.Dao.FamiliaDao;

public class FamiliaServicies {
    private FamiliaDao obj;

    public FamiliaServicies() {
        obj = new FamiliaDao();
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

    public LinkedList listAll() {
        return obj.getlistAll();
    }

    public Familia getFamilia() {
        return obj.getFamilia();
    }

    public void setFamilia(Familia Familia) {
        obj.setFamilia(Familia);
    }

    public Familia get(Integer id) throws Exception {
        return obj.get(id);
    }

    public LinkedList<Familia> ordenar(String algoritmo, LinkedList<Familia> lista, Integer type_order, String atributo)
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

    public LinkedList<Familia> buscar(String algoritmo, String atributo, String value) throws Exception {
        switch (algoritmo) {
            case "Binaria":
                Familia Familia = obj.binaria(atributo, value);
                LinkedList<Familia> lista = new LinkedList<>();
                lista.add(Familia);
                return lista;
            case "LinealBinaria":
                return obj.linealBinaria(atributo, value);
            default:
                return obj.linealBinaria(atributo, value);
        }
    }

}