package prova;
public class Testa {

    public static void exemploPolimorfismo(Veiculo camaleao){

        System.out.println(camaleao.toString());


    }   
    
    public static void main(String args[]){

        Motorizado  mt = new Motorizado(2019, 40000, "Carro popular", 1.3f, "Flex");
        NaoMotorizada nmt = new NaoMotorizada(2020, 400, "Patinete", "Pernas e pés");

        exemploPolimorfismo(mt);

        exemploPolimorfismo(nmt);

    }
}


// 4. B
