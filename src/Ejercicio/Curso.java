package Ejercicio;

public class Curso {
    //Atributos de instancia
    public String nomCur;
    public double costo;
    public String tipo;
    public String modali;
    public int ciclo;
    //atributo statico
    public static int totaMatri;
    //constructor
    public Curso(String nom, double cos,
           String tip,String mod, int cic){
        nomCur = nom;
        costo = cos;
        tipo = tip;
        modali = mod;
        ciclo = cic;
        totaMatri++;//contador
    }
    //sobrecarga de metodos instancia
    public double calPago(){
        return costo;
    }
    public double calPago(double desc){
        return costo-desc;
    }
    //metodos estatico     
    public static int obtenerToReg(){
        return totaMatri;
    }
    //clase anidada
    public static class Alumno{
        public String nomAlum;
        public Alumno(String alum){
            nomAlum = alum;
        }
    }
    //registrar en la table
    public Object[]Registrar(int num,String alumno,
                            double total){
        Object[] fila={num,nomCur,tipo,modali,ciclo,
                       alumno,costo,total};
        return fila;
    }
}
