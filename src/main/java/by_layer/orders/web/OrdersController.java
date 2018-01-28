package by_layer.orders.web;

import by_layer.orders.business.OrdersService;

public class OrdersController {
    public void listOrders(){
        OrdersService ordersService = new OrdersService();
        ordersService.list();

    }
}
