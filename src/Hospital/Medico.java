package Hospital;

public class Medico extends Pessoa {
  private String especialidade;
  private String crm;

  public Medico(String nome, int idade, String sexo, String especialidade, String crm) {
      super(nome, idade, sexo);
      this.especialidade = especialidade;
      this.crm = crm;
  }

  // Getters and Setters
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

  @Override
  public void exibirInformacoes() {
      System.out.println("Médico:");
      System.out.println("Nome: " + getNome());
      System.out.println("Idade: " + getIdade());
      System.out.println("Sexo: " + getSexo());
      System.out.println("Especialidade: " + especialidade);
      System.out.println("CRM: " + crm);
  }
}
