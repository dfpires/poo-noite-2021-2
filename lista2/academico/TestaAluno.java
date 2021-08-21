package lista2.academico;
import javax.swing.JOptionPane;
public class TestaAluno {
    
    public static void main(String args[]){
        Aluno obj1 = new Aluno();
        // JOptionPane.showInputDialog("Informe sua idade") retorna uma String
        // Integer.parseInt converte String em int
        obj1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade")));
    }
}
