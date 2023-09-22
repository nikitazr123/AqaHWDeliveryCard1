package ru.netology;
import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator() {}
    public static class Registration {
        private Registration() {}
        public static TestUser generateByFaker(String locale) {
            Faker faker = new Faker(new Locale(locale));
            String[] cities = { "Уфа", "Москва","Санкт-Петербург","Омск", "Махачкала", "Воронеж", "Нальчик", "Элиста",
                    "Черкесск", "Петрозаводск", "Сыктывкар", "Симферополь", "Йошкар-Ола", "Саранск", "Якутск",
                    "Владикавказ", "Казань", "Ижевск", "Грозный", "Чебоксары", "Барнаул", "Чита",
                    "Петропавловск-Камчатский", "Краснодар", "Красноярск", "Пермь", "Владивосток", "Ставрополь",
                    "Хабаровск",};
            Random rand = new Random();

            return new TestUser(faker.name().name(),
                    faker.phoneNumber().phoneNumber(),
                    cities[rand.nextInt(cities.length)]
            );
        }
    }
}
