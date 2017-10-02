package projeto1;

public class Padroes {
    
//Números de CPF: cadeias de 3 dígitos, seguidos de ponto, mais 3 dígitos, ponto, 3 dígitos, hífen, 2 dígitos.
    public boolean cpfValido(String padrao){
        return padrao.matches("[\\d]{3}" + "." + "[\\d]{3}" + "." + "[\\d]{3}"
        + "-" + "[\\d]{2}");
    }

//Número de telefone:Um padrão que possa reconhecer a primeira parte com 4 ou 5 dígitos(celular
    public boolean telefoneValido(String padrao){
        return padrao.matches("[\\d]?[\\d]{4}" + "-" + "[\\d]{4}");
    }
    
//Placa de carro: 3 letrar maiusculas, hífen, 4 digitos
    public boolean carroValido(String padrao){
        return padrao.matches("[A-Z]{3}" + "-" + "[\\d]{4}");
    }
}

