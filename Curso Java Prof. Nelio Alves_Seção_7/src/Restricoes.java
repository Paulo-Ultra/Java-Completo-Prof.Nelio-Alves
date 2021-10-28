public class Restricoes {
    /* Jeito errado de colocar nome das variáveis
      int 5minutes;
      int salário;
      int salario do funcionario;

       Jeito correto
      int _5minutes;
      int salario;
      int salarioDoFuncionario

      Convenções:

     #Camel Case: lastName
        # pacotes
        # atributos
        # métodos
        # variáveis e parâmetros

    # Pascal Case: ProductService
        # classes */
        private String holder;
        private Double balance;

//        public Account(String holder, Double balance){
//            this.holder = holder;
//            this.balance = balance;
//
//        }

        public String getHolder(){
            return holder;
        }

        public void deposit(double amount){
            balance += amount;
        }
        public void withdraw(double amount){
            balance -= amount;
        }

    }
