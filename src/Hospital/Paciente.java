package Hospital;

public class Paciente extends Pessoa {
  private String numeroProntuario;
  private String diagnostico;

  public Paciente(String nome, int idade, String sexo, String numeroProntuario, String diagnostico) {
      super(nome, idade, sexo);
      this.numeroProntuario = numeroProntuario;
      this.diagnostico = diagnostico;
  }

  // Getters and Setters
  public String getNumeroProntuario() {
      return numeroProntuario;
  }

  public void setNumeroProntuario(String numeroProntuario) {
      this.numeroProntuario = numeroProntuario;
  }

  public String getDiagnostico() {
      return diagnostico;
  }

  public void setDiagnostico(String diagnostico) {
      this.diagnostico = diagnostico;
  }

  @Override
  public void exibirInformacoes() {
      System.out.println("Paciente:");
      System.out.println("Nome: " + getNome());
      System.out.println("Idade: " + getIdade());
      System.out.println("Sexo: " + getSexo());
      System.out.println("Número do Prontuário: " + numeroProntuario);
      System.out.println("Diagnóstico: " + diagnostico);
  }
}
