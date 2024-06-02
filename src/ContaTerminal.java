import java.util.Scanner;


        public class ContaTerminal {
           

           

            public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Por favor, digite o número da Agência: ");
                String agencia = scanner.next("067-8");
                scanner.nextLine(); // Consumir a quebra de linha

                System.out.print("Por favor, digite o nome do cliente: ");
                String nomeCliente = scanner.next("MARIOANDRADE");
        
                System.out.print("Por favor, digite o número da conta: ");
                String numeroConta = scanner.next("1021");
        
                System.out.print("Por favor, digite o saldo da conta: ");
                String saldo = scanner.next("237.48");
        
                // Mensagem final
                String mensagem ="Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";

        
                System.out.println(mensagem);
        
                scanner.close();
            }
        }
        



    



       