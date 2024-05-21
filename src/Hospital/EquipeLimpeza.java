package Hospital;

public class EquipeLimpeza extends Pessoa {
  private String setor;
  private String funcao;

  public EquipeLimpeza(String nome, int idade, String sexo, String setor, String funcao) {
      super(nome, idade, sexo);
      this.setor = setor;
      this.funcao = funcao;
  }

  // Getters and Setters
  public String getSetor() {
      return setor;
  }

  public void setSetor(String setor) {
      this.setor = setor;
  }

  public String getFuncao() {
      return funcao;
  }

  public void setFuncao(String funcao) {
      this.funcao = funcao;
  }

  @Override
  public void exibirInformacoes() {
      System.out.println("Equipe de Limpeza:");
      System.out.println("Nome: " + getNome());
      System.out.println("Idade: " + getIdade());
      System.out.println("Sexo: " + getSexo());
      System.out.println("Setor: " + setor);
      System.out.println("Função: " + funcao);
  }
}
