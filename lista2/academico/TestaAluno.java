package lista2.academico;
import javax.swing.JOptionPane;
public class TestaAluno {
    
    public static void main(String args[]){
        Aluno obj1 = new Aluno();
        // JOptionPane.showInputDialog("Informe sua idade") retorna uma String
        // Integer.parseInt converte String em int
        obj1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade")));
        obj1.setNumeroAluno(Integer.parseInt(JOptionPane.showInputDialog("Informe número do aluno")));
        obj1.setNome(JOptionPane.showInputDialog("Informe seu nome"));
         // Float.parseFloat converte String em float
        obj1.setP1(Float.parseFloat(JOptionPane.showInputDialog("Informe nota 1")));
        obj1.setP2(Float.parseFloat(JOptionPane.showInputDialog("Informe nota 2")));
        // null indica que a caixa de diálogo não tem pai
        JOptionPane.showMessageDialog(null, obj1.toString());
    }
}
