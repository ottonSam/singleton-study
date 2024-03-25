package dao;

import gof.SingletonLazyHolder;
import model.Purchase;

import java.util.ArrayList;

public class PurchaseList {
    private ArrayList<Purchase> list;

    private static class Holder {
        public static PurchaseList instance = new PurchaseList();
    }

    private PurchaseList() {
        this.list = new ArrayList<>();
    }
    public static PurchaseList getInstance() {
        return PurchaseList.Holder.instance;
    }

    public void addPurchase(Purchase purchase) {
        if(list.contains(purchase)) {
           System.out.println("Esse item já foi adicionado a lista!");
           return;
        }
        list.add(purchase);
        System.out.println("Item adicionado a lista de compras" + purchase);
    }

    public void removePurchase(Purchase purchase) {
        if(!list.contains(purchase)) {
            System.out.println("Esse item não existe dentro da lista!");
            return;
        }
        list.remove(purchase);
        System.out.println("O item foi removido da lista de compras" + purchase);
    }

    public void getNoStock() {
        System.out.println("Item | Quantidade");
        for (Purchase purchase : list)
            if (purchase.isNoStock())
                System.out.println(purchase.getItem() + " | " + purchase.getAmount());
    }

    public void  getAllList() {
        System.out.println("Item | Quantidade");
        for (Purchase purchase : list)
            System.out.println(purchase.getItem() + " | " + purchase.getAmount());
    }
}
