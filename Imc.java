void main(){

    String nome = IO.readln("Insira o seu nome: ");
    char genero = IO.readln("Informe seu gênero (M: masculino, F: feminino, N: prefiro não informar): ").charAt(0);
    String alturaStr = IO.readln("Insira sua altura: ");
    String pesoStr = IO.readln("Insira sua peso: ");
     
    double altura = Double.parseDouble(alturaStr);
    double peso = Double.parseDouble(pesoStr);

    double imc = peso/(altura*altura);

    String classImc;

    switch (genero){
        case 'M','m' -> {
            if (imc < 20){
                classImc = "Abaixo do Normal";
            } else if (imc < 25) {
                classImc = "Normal";
            } else if (imc < 30) {
                classImc = "Obesidade Leve";
            } else if (imc < 40){
                classImc = "Obesidade Moderada";
            } else {
                classImc = "Obesidade Mórbida";
            }

            System.out.println("Nome: " + nome);
            System.out.println("Gênero: " + genero);
            System.out.println("IMC: " + imc);
            System.out.println("Classificação: " + classImc);
        } 
        case 'F','f','N','n' -> {
            if (imc < 19){
                classImc = "Abaixo do Normal";
            } else if (imc < 24) {
                classImc = "Normal";
            } else if (imc < 29) {
                classImc = "Obesidade Leve";
            } else if (imc < 39){
                classImc = "Obesidade Moderada";
            } else {
                classImc = "Obesidade Mórbida";
            }

            System.out.println("Nome: " + nome);
            System.out.println("Gênero: " + genero);
            System.out.println("IMC: " + imc);
            System.out.println("Classificação: " + classImc);
        }

        
    }


}

// '' -> char