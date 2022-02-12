package electrodomestico;

public class Electrodomestico {
    private final int precioBase;
    private final String color;
    private final char consumoDeEnergia;
    private final int peso;

    public  Electrodomestico(){
        this.precioBase = 100;
        this.peso = 5;
        this.color = "BLANCO";
        this.consumoDeEnergia = 'F';
    }

    public Electrodomestico(int precioBase, int peso){
        this.precioBase = precioBase ;
        this.peso = peso;
        this.color = "BLANCO";
        this.consumoDeEnergia = 'F';
    }

    public Electrodomestico(int precioBase, int peso, String color, char consumoDeEnergia){
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoDeEnergia = comprobarConsumoEnergetico(consumoDeEnergia);
    }

    public char comprobarConsumoEnergetico(char letra){
        if(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F'){
            return letra;
        }
            return 'F';
    }

    public String comprobarColor(String color){
        if(color == "BLANCO" || color == "NEGRO" || color == "ROJO" || color == "AZUL" || color == "GRIS"){
            return color;
        }
            return "BLANCO";
    }

    public int precioFinal(){
        int precio = 0;

        while(consumoDeEnergia == 'A'){
            if (peso >= 0 && peso <= 19){
                precio = (precioBase + 10);
                return precio;
            }else if(peso >= 20 && peso <= 49){
                precio = (precioBase + 50);
                return precio;
            }else if(peso >= 50 && peso <= 79){
                precio = (precioBase + 80);
                return precio;
            }else if(peso >= 80){
                precio = (precioBase + 100);
                return  precio;
            }
        }
        while(consumoDeEnergia == 'B'){
            if (peso >= 0 && peso <= 19){
                precio = ((precioBase - 20) + 10);
                return precio;
            }else if(peso >= 20 && peso <= 49){
                precio = ((precioBase - 20) + 50);
                return precio;
            }else if(peso >= 50 && peso <= 79){
                precio = ((precioBase - 20) + 80);
                return precio;
            }else if(peso >= 80){
                precio = ((precioBase - 20) + 100);
                return  precio;
            }
        }
        while(consumoDeEnergia == 'C'){
            if (peso >= 0 && peso <= 19){
                precio = ((precioBase - 40) + 10);
                return precio;
            }else if(peso >= 20 && peso <= 49){
                precio = ((precioBase - 40) + 50);
                return precio;
            }else if(peso >= 50 && peso <= 79){
                precio = ((precioBase - 40) + 80);
                return precio;
            }else if(peso >= 80){
                precio = ((precioBase - 40) + 100);
                return  precio;
            }
        }
        while(consumoDeEnergia == 'D'){
            if (peso >= 0 && peso <= 19){
                precio = ((precioBase - 50) + 10);
                return precio;
            }else if(peso >= 20 && peso <= 49){
                precio = ((precioBase - 50) + 50);
                return precio;
            }else if(peso >= 50 && peso <= 79){
                precio = ((precioBase - 50) + 80);
                return precio;
            }else if(peso >= 80){
                precio = ((precioBase - 50) + 100);
                return  precio;
            }
        }
        while(consumoDeEnergia == 'E'){
            if (peso >= 0 && peso <= 19){
                precio = ((precioBase - 70) + 10);
                return precio;
            }else if(peso >= 20 && peso <= 49){
                precio = ((precioBase - 70) + 50);
                return precio;
            }else if(peso >= 50 && peso <= 79){
                precio = ((precioBase - 70) + 80);
                return precio;
            }else if(peso >= 80){
                precio = ((precioBase - 70) + 100);
                return  precio;
            }
        }
        while(consumoDeEnergia == 'F'){
            if (peso >= 0 && peso <= 19){
                precio = ((precioBase - 90) + 10);
                return precio;
            }else if(peso >= 20 && peso <= 49){
                precio = ((precioBase - 90) + 50);
                return precio;
            }else if(peso >= 50 && peso <= 79){
                precio = ((precioBase - 90) + 80);
                return precio;
            }else if(peso >= 80){
                precio = ((precioBase - 90) + 100);
                return  precio;
            }
        }
        return 0;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoDeEnergia() {
        return consumoDeEnergia;
    }

    public int getPeso() {
        return peso;
    }
}
