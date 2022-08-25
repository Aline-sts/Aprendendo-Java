
public class Japan {
    public static void main(String[] args) {
        //Aqui fiz uma inicialização já com o valor da String
        String palavra= "arvore";

        switch (palavra){
            case "arvore":
                System.out.println(" 木");
                break;
            case "casa":
                System.out.println(" ホ");
                break;
            case "gato":
                System.out.println("猫");
                break;
            case "amor":
                System.out.println("愛");
                break;
                 case "paz":
                System.out.println("平和");
                break;
                 case "uniao":
                System.out.println("団結");
                break;
                 case "familia":
                System.out.println("家族");
                break;
                 case "Japao":
                System.out.println("日本");
                break;
            default:
                System.out.println("Palavra invalida");
        }
    }
}
