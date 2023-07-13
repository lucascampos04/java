package POO.introducaoMetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(1+1);
    }
    public void subtraiDoisNumeros(){
        System.out.println(1-1);
    }
    public void mutiplicaDoisNumeros(){
        System.out.println(1*1);
    }
    public void dividiDoisNumeros(){
        System.out.println(1/1);
    }

    // Parametros
    public void soma(int n1, int n2){
        System.out.println(n1 + n2);
    }

    // Retorno pt1
    public double dividiDoisNumeros(double n1, double n2){
        return (int) (n1 / n2);
    }

    // retorn pt2
    public double dividiDoisNumeros1(double n1, double n2){
        if (n2 == 0 ){
            return 0;
        }
        return n1 / n2;
    }

    public double dividiDoisNumeros2(double n1, double n2){
        if (n2 == 0){
            return 0;
        } else {
            return n1 / n2;
        }
    }

    public double dividiDoisNumeros3(double n1, double n2){
        boolean isResub = n2 == 0;

        if (n2 == 0){
            return 0;
        }

        if (!isResub){
            return n1 / n2;
        }
    return 0;
    }

    public double dividiDoisNumeros4(double n1, double n2){
        if (n2 != 0){
            return n1 / n2;
        }
        return 0;
    }
    public void impriDivisaoDoisNumeros(double n1, double n2){
        if (n2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(n1/n2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    // VarArgs
    public void somaVarargs(double... numeros){
        double soma = 0;
        for (double num: numeros){
            soma+=num;
        }
        System.out.println(soma);
    }

}



