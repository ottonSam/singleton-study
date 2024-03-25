import dao.PurchaseList;
import gof.SingletonEager;
import gof.SingletonLazy;
import gof.SingletonLazyHolder;
import model.Purchase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton design pattern example...");

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        System.out.println(lazy.toString() + ' ' + eager.toString() + ' ' + lazyHolder.toString());


        System.out.println("Exemplo de uso em uma lista de compras");
        PurchaseList purchaseList = PurchaseList.getInstance();

        purchaseList.addPurchase(new Purchase("Arroz", 2, true));
        purchaseList.addPurchase(new Purchase("Macarrão", 3, true));
        purchaseList.addPurchase(new Purchase("Feijão preto", 1, false));

        purchaseList.getAllList();

        // reaproveitando a instância
        PurchaseList list = PurchaseList.getInstance();
        list.getNoStock();
    }
}