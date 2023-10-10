package ramoscode.main;


public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, Java World!");
        // Segunda implementação de código
        // declarando variaveis
        String titulo;
        String nomePessoa;
        int idade;
        float salario;
        boolean ativo;

        // Usando as variáveis declaradas acima.
        titulo = "Segunda aula - Mão no código";

        nomePessoa = "Ademario Ramos";

        idade = 44;

        salario = 3000.55F;

        ativo = true;

        System.out.println("Título: " + titulo);
        System.out.println("Nome da Pessoa: " + nomePessoa);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Ativo: " + ativo);

        // Terceira implementação de código

        titulo = "Instanciando uma classe";
        System.out.println("Título: " + titulo);
        // Criando uma classe e instanciando uma classe
        Person p = new Person();
        p.setFirstName("nomePessoa");
        p.getFirstName();
    }
}
