package Hospital;

public class Main {
  public static void main(String[] args) {
      Medico medico = new Medico("Dr. João", 45, "Masculino", "Cardiologia", "123456");
      Enfermeiro enfermeiro = new Enfermeiro("Ana", 30, "Feminino", "UTI", "789012");
      Paciente paciente = new Paciente("Carlos", 65, "Masculino", "PR1234", "Hipertensão");
      EquipeLimpeza equipeLimpeza = new EquipeLimpeza("Maria", 40, "Feminino", "Andar 3", "Faxineira");

      medico.exibirInformacoes();
      System.out.println();
      enfermeiro.exibirInformacoes();
      System.out.println();
      paciente.exibirInformacoes();
      System.out.println();
      equipeLimpeza.exibirInformacoes();
  }
}
