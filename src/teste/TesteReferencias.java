package teste;

import com.company.ControleBonificacao;
import com.company.EditorDeVideo;
import com.company.Gerente;

public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Alexandre");
        g1.setSalario(5000);
        ControleBonificacao boni = new ControleBonificacao();
      //  Funcionario f1 = new Funcionario();
      //  f1.setSalario(1500);
      //  f1.setNome("Teste");
        ControleBonificacao bonificacao = new ControleBonificacao();
       // bonificacao.registro(f1);
        System.out.println(bonificacao.getSoma());
        EditorDeVideo ev = new EditorDeVideo();
        ev.setNome("test2");
        ev.setSalario(2000);
        ControleBonificacao controle = new ControleBonificacao();
        controle.registro(ev);
        System.out.println(controle.getSoma());
// nao eh possivel instanciar classes abstratas, somente as concretas
        boni.registro(g1);
        String nome = g1.getNome();
        System.out.println(nome);
        System.out.println(boni.getSoma());
    }
}
