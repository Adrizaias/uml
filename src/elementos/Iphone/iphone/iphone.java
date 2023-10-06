package elementos.Iphone.iphone;
import elementos.Iphone.componentesIphone.navegadorInternet.navegadorInternet;
import elementos.Iphone.componentesIphone.navegadorInternet.navegadorInternet1;
import elementos.Iphone.componentesIphone.aparelhoTelefonico.aparelhoTelefonico;
import elementos.Iphone.componentesIphone.reprodutorMusical.reprodutorMusical;
import elementos.Iphone.componentesIphone.reprodutorMusical.reprodutorMusical1;
import elementos.Iphone.componentesIphone.aparelhoTelefonico.aparelhoTelefonico1;
public class iphone{
    public static void main(String[] args) {
        aparelhoTelefonico aparelhoTelefonico1 = new aparelhoTelefonico1();
        navegadorInternet navegadorInternet1 = new navegadorInternet1();
        reprodutorMusical reprodutorMusical1 = new reprodutorMusical1();
            reprodutorMusical.tocar();
            reprodutorMusical.selecionarMusica();
            reprodutorMusical.pausar();
            navegadorInternet.exibirPagina();
            navegadorInternet.atualizarPagina();
            navegadorInternet.adicionarNovaAba();
            aparelhoTelefonico.atende();
            aparelhoTelefonico.liga();
            aparelhoTelefonico.iniciarCorreioVoz();
            };
        };





