import java.time.LocalDate;

import br.com.atacado.dominio.*;

public class App {
        public static void main(String[] args) throws Exception {

                Frota frota1 = new Frota(067, "frota1", LocalDate.now());
                System.out.println("\n\tFROTA");

                System.out.println("Código: " + frota1.getCodigo());
                System.out.println("Descrição: " + frota1.getDescricao());
                System.out.println("Data de inserção: " + frota1.getDataInsert());

                Veiculo veiculo1 = new Veiculo(1, "Carro de passeio", LocalDate.now(), frota1.getCodigo());
                veiculo1.placa = "HGA-4291";
                System.out.println("\n\tVEICULO");
                System.out.println("Código: " + veiculo1.getCodigo());
                System.out.println("Descrição: " + veiculo1.getDescricao());
                System.out.println("Data de Inserção: " + veiculo1.getDataInsert());
                System.out.println("Código da Frota: " + veiculo1.codigoFrota);
                System.out.println("Placa: " + veiculo1.placa);

                Funcionario funcionario1 = new Funcionario(1, "Joao Jonas Jacinto", "jj@gmail.com",
                                "www.JoaoSilva.com",
                                LocalDate.now(), "345.781.942-67", "2205314", "Masculino", "Branca", "Brasileira",
                                "São Paulo",
                                "José Jeremias Jacinto", "Jéssica Julina Jacinto");

                System.out.println("\n\tFUNCIONARIO");
                System.out.println("Código: " + funcionario1.getCodigoPessoa());
                System.out.println("Nome: " + funcionario1.getNome());
                System.out.println("Email: " + funcionario1.getEmail());
                System.out.println("Site: " + funcionario1.getSite());
                System.out.println("Data de Inclusão: " + funcionario1.getDataInclusao());
                System.out.println("CPF: " + funcionario1.getCpf());
                System.out.println("RG: " + funcionario1.getRg());
                System.out.println("Sexo: " + funcionario1.getSexo());
                System.out.println("Raça: " + funcionario1.getRaca());
                System.out.println("Nacionalidade: " + funcionario1.getNacionalidade());
                System.out.println("Naturalidade: " + funcionario1.getNaturalidade());
                System.out.println("Nome do Pai: " + funcionario1.getNomePai());
                System.out.println("Nome da Mãe: " + funcionario1.getNomeMae());
                System.in.read();
        }
}