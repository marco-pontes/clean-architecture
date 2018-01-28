package by_feature.orders;

public class OrdersController {
    public void listOrders(){
        OrdersService ordersService = new OrdersService();
        ordersService.list();

    }
}
