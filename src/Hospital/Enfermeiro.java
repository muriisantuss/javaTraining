package Hospital;

public class Enfermeiro extends Pessoa {
  private String areaAtuacao;
  private String coren;

  public Enfermeiro(String nome, int idade, String sexo, String areaAtuacao, String coren) {
      super(nome, idade, sexo);
      this.areaAtuacao = areaAtuacao;
      this.coren = coren;
  }

  // Getters and Setters
  public String getAreaAtuacao() {
      return areaAtuacao;
  }

  public void setAreaAtuacao(String areaAtuacao) {
      this.areaAtuacao = areaAtuacao;
  }

  public String getCoren() {
      return coren;
  }

  public void setCoren(String coren) {
      this.coren = coren;
  }

  @Override
  public void exibirInformacoes() {
      System.out.println("Enfermeiro:");
      System.out.println("Nome: " + getNome());
      System.out.println("Idade: " + getIdade());
      System.out.println("Sexo: " + getSexo());
      System.out.println("Área de Atuação: " + areaAtuacao);
      System.out.println("COREN: " + coren);
  }
}
