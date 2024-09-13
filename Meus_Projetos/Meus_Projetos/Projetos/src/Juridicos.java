import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
abstract class Cliente 
{
 protected String nome;
 private String enderico;
 public Cliente(String nome, String endereco)
 {
  this.nome = nome ;
  this.enderico = endereco;

 }
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getEnderico() {
    return enderico;
}
public void setEnderico(String enderico) {
    this.enderico = enderico;
}   
}
 class ClienteFisico  extends Cliente 
 {
 private String cpf;
  public ClienteFisico(String nome, String endereco, String cpf)
  { 
    super(nome, endereco);
    this.cpf= cpf ;
  }
public String getCpf() {
    return cpf;
}
public void setCpf(String cpf) {
    this.cpf = cpf;
}
} 
class ClienteJuridico extends Cliente
{
    private String cnpj;
    public ClienteJuridico(String nome, String endereco,String cnpj)
    {
        
        super(endereco, endereco);
        this.cnpj = cnpj;
 
    }
  
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    } 
}
 class Advogados
 {
    private String nomeAd;
    public String atumacao;
    public Advogados(String nomeAd, String atumacao){
        this.nomeAd = nomeAd;
        this.atumacao = atumacao;
    }
    public String getNomeAd() {
        return nomeAd;
    }
    public String getAtumacao() {
        return atumacao;
    }
 }
  class Tribunal
  {
    public String nomeTribu;
    public Tribunal(String nomeTribu)
    {
      this.nomeTribu = nomeTribu;

    }
    public String getNomeTribu() {
        return nomeTribu;
    }
    public void setNomeTribu(String nomeTribu) {
        this.nomeTribu = nomeTribu;
    }
    
  }
  class Processo 
  {
    private Cliente cliente;
    private Advogados advogados;
    private Tribunal tribunal;
    private  double honorarios;
    public Processo(Cliente cliente, Advogados advogados, Tribunal tribunal, double honoraarios)
    {
        this.cliente = cliente;
        this.advogados = advogados;
        this.tribunal = tribunal;
        this.honorarios = honorarios;
    } 
    public String getDetalhesProcesso() {
        return "Processo do Cliente: " + cliente.nome + " | Advogado: " + advogados.getNomeAd() +
                " | Tribunal: " + tribunal.getNomeTribu() + " | Honorários: R$ " + honorarios;
    }
  }
public class Juridicos {
    public static void main(String[] args) {
        String escolha ="";
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Advogados>advogad0s= new ArrayList<>();
        ArrayList<Tribunal> tribus= new ArrayList<>();
        ArrayList<Processo> processos= new ArrayList<>();

        Processo processo1 = new Processo(clientes.get(0), advogad0s.get(0), tribus.get(0), 5000.00);
        processos.add(processo1);
        System.out.println("Olá você está na Advogados_Pressos: ");
      do 
      {
        System.out.println("Digite o nome de você");
        String nome = sc.nextLine();
         Cliente clientew = new Cliente(nome);
        
      }while(escolha == "S");
                  
           
        }
}
