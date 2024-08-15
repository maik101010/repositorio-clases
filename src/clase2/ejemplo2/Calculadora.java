package src.clase2.ejemplo2;

class Calculadora
{
    int sumar(int a, int b)
    {
        return a + b;
    }

    double sumar(double a, double b)
    {
        return a + b;
    }

    int sumar(float a, float b)
    {
        return (int) (a + b);
    }

    public static void main(String[] args)
    {
        Calculadora instancia = new Calculadora();
        int respuesta = instancia.sumar(2,3);
        int respuesta1 = instancia.sumar(2F,3F);
        System.out.println(respuesta);
        System.out.println(respuesta1);
    }
}

