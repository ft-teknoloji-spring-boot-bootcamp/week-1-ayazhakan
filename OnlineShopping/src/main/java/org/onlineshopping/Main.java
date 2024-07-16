package org.onlineshopping;

import org.onlineshopping.models.Bill;
import org.onlineshopping.models.Customer;
import org.onlineshopping.models.Order;
import org.onlineshopping.models.Product;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Hakan", "hkn@mail.com","123456",25);
        Customer customer2 = new Customer("Cem", "cem@mail.com","123456",29);
        Customer customer3 = new Customer("Cem", "cemmm@mail.com","123456",26);

        // Ürünleri oluşturma
        Product product1 = new Product("Elektronik", 4500.00, "Laptop", 10);
        Product product2 = new Product("Elektronik", 2500.0,"Telefon",  15);
        Product product3 = new Product("Eğitim", 50.0, "Kitap",  30);

        // Siparişleri oluşturma
        Order order1 = new Order(1, LocalDate.of(2024, 7, 1), customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(2, LocalDate.of(2024, 7, 2), customer2);
        order2.addProduct(product2);
        order2.addProduct(product3);

        Order order3 = new Order(3, LocalDate.of(2024, 7, 3), customer3);
        order3.addProduct(product1);
        order3.addProduct(product3);

        // Faturaları oluşturma
        Bill bill1 = new Bill( LocalDate.of(2024, 7, 1), 7000.0, true);
        Bill bill2 = new Bill( LocalDate.of(2024, 7, 2), 2550.0, false);
        Bill bill3 = new Bill(LocalDate.of(2024, 7, 3), 5000.0, true);

        order1.setBill(bill1);
        order2.setBill(bill2);
        order3.setBill(bill3);

        customer1.addOrder(order1);
        customer2.addOrder(order2);
        customer3.addOrder(order3);


        int customerCount = List.of(customer1, customer2, customer3).size();
        System.out.println("Sistemdeki bütün müşteri sayısı: " + customerCount);


        List<Order> cemOrders = List.of(order2, order3);
        long cemProductCount = cemOrders.stream()
                .flatMap(order -> order.getProducts().stream())
                .count();
        System.out.println("İsmi Cem olan müşterilerin aldıkları ürün sayısı: " + cemProductCount);

        double totalAmountForYoungCems = List.of(customer2)
                .stream()
                .filter(customer -> customer.getAge() < 30 && customer.getAge() > 25)
                .flatMap(customer -> customer.getOrders().stream())
                .mapToDouble(order -> order.getBill().getAmount())
                .sum();
        System.out.println("İsmi Cem olup yaşı 30’dan küçük 25’ten büyük müşterilerin toplam alışveriş tutarı: " + totalAmountForYoungCems);


        List<Bill> highAmountInvoices = List.of(bill1, bill3)
                .stream()
                .filter(bill -> bill.getAmount() > 1500.0)
                .collect(Collectors.toList());
        System.out.println("Sistemdeki 1500 TL üzerindeki faturalar:");
        highAmountInvoices.forEach(System.out::println);
    }
}