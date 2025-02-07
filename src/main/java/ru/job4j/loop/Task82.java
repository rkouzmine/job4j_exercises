package ru.job4j.loop;

public class Task82 {
    public static void loop(int[] promo, int[] concert) {
        int allTickets = 0;
        int freeTickets = 0;
        for (int promoTicket : promo) {
            if (promoTicket >= 10) {
                freeTickets += promoTicket / 10;
            }
            allTickets += promoTicket;
        }
        for (int concertTicket : concert) {
            allTickets += concertTicket;
        }
        System.out.printf("Продано билетов: %d, выдано бесплатно: %d%n", allTickets, freeTickets);
    }

    public static void main(String[] args) {
        int[] promo = {21, 10, 2, 2};
        int[] concert = {1, 2, 5, 22};
        loop(promo, concert);
    }
}