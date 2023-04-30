public class Calculadora {

    public void calculaMedia(Float n1, Float n2, Float n3, Float n4){
        Float media = (n1+n2+n3+n4)/4;

        if (media >= 7){
            System.out.println("Sua média é: " + media +" e você foi aprovado!");
        } else if (media>=5 && media<7){
            System.out.println("Sua média é: " + media +" e você está de recuperação!");
        } else if (media<5){
            System.out.println("Sua média é: " + media +" e você foi reprovado!");
        } else {
            System.out.println(media+ " Não foi possível tirar conclusões sobre sua nota.");
        }
    }


}
