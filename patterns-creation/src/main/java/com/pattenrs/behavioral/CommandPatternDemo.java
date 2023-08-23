package com.pattenrs.behavioral;

import com.pattenrs.behavioral.command.Broker;
import com.pattenrs.behavioral.command.BuyStock;
import com.pattenrs.behavioral.command.SellStock;
import com.pattenrs.behavioral.command.Stock;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
