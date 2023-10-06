package elementos.Iphone.componentesIphone.aparelhoTelefonico;


public interface aparelhoTelefonico  {
    public static void liga(){
        System.out.println("Ligando");
    }
    public static void atende(){
        System.out.println("Atendendo chamada");

    }
    public static void iniciarCorreioVoz(){
        System.out.println("Correio de voz: deixe sua mensagem");
    }

}
