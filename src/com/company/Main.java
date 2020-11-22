package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(670);
        boss.setDamage(45);
        boss.setAttackType("Magical");

        System.out.println("Здоровье: " + boss.getHealth() + "," + " Урон: " + boss.getDamage() + "," + " Способность: " + boss.getAttackType());

        Hero hero = new Hero(500, 60, "Mental");

        System.out.println(boss.toString());
        System.out.println(hero.toString());


        createHeroes();
        // триКота

        for (Hero Карамелька:createHeroes()) {
            System.out.println(Карамелька);
        }


    }


    public static Hero[] createHeroes() {
        Hero Коржик = new Hero(400, 50, "Physics");
        Hero Компот = new Hero(450, 55);
        Hero Карамелька = new Hero(500, 40);
        Hero[] триКота = {Коржик, Компот, Карамелька};

        return триКота;

    }

}

/*
1.Создать метод в классе Main, который называется createHeroes(); - сделано!!! Айдана ты лучше всех!!! люблю!!!

2.В теле метода создать 3 героев с помощью класса Hero,используя при этом разные варианты конструкторов Спасибо большое, Азиз! Ты лучше всех приводишь аналогии!!

3.Затем поместить эти экземпляры геороев в массив и вернуть его с помощью return как возвращаемый результат метода createHeroes Я молодец. я такая красотка вааще капец

4.Вызвать этот метод в методе main и распечатать инфу и всех геороях массива через цикл
 */
