public class Calculadora {
     int operando1;
     int operando2;

    public void sumar(int division){
        System.out.println("La suma es: "+(operando1+operando2)/division);
    }
    public int resta(){
        if(operando1>operando2) {
            return operando1-operando2;
        }
        return 0;
    }
    public Calculadora(int operando1,int operando2){
        if(operando1>operando2){
            this.operando1=operando1;
            this.operando2=operando2;
        }else{
            this.operando1=operando2;
            this.operando2=operando1;
        }
    }
}
