package lista3.streaming;

public class Testa {
    
    public static void main(String args[]){

        Filme fil1 = new Filme(1, "Vingadores", " 12 anos");
        Filme fil2 = new Filme(2, "Rio", " Livre");
        Filme fil3 = new Filme(3, "007", " 18 anos");

        Streaming str1 = new Streaming(100, "Netflix", "netflix.com.br");

        str1.addFilme(fil1);
        str1.addFilme(fil2);
        str1.addFilme(fil3);

        System.out.println(str1.toString());
    }
}
