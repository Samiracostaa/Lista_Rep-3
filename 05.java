/*5. Criar a estrutura de dados para armazenar os médicos cadastrados no sistema. (Array List)*/


public class teste {
	 public static void main(String[] args) {
	        SistemaMedico sistema = new SistemaMedico();
	      
	        sistema.cadastrarMedico("Dr. João Silva", "Cardiologia", "12345");
	        sistema.cadastrarMedico("Dra. Ana Souza", "Pediatria", "67890");

	        sistema.listarMedicos();
	    }
	}

-------------------------------------------------------------------------------------------

class Medico {
    private String nome;
    private String especialidade;
    private String crm;

  
    public Medico(String nome, String especialidade, String crm) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

   
    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Especialidade: " + especialidade + ", CRM: " + crm);
    }
}
--------------------------------------------------------------------------------------------

  import java.util.ArrayList;

public class SistemaMedico {
    private ArrayList<Medico> medicos;
  
    public SistemaMedico() {
        medicos = new ArrayList<>();
    }

    
    public void cadastrarMedico(String nome, String especialidade, String crm) {
        Medico novoMedico = new Medico(nome, especialidade, crm);
        medicos.add(novoMedico);
        System.out.println("Médico cadastrado com sucesso!");
    }
 	 public void listarMedicos() {
        if (medicos.isEmpty()) {
            System.out.println("Nenhum médico cadastrado.");
        } else {
            System.out.println("Médicos cadastrados:");
            for (Medico medico : medicos) {
                medico.exibirDados();
            }
        }
 }
}
