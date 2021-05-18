package homework1;

import java.util.Random;

public class Run {
    public Run() {
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Actions[] actions = new Actions[3];
        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        actions[0] = new Human("Дмитрий", distance, heigth);
        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[1] = new Robot("Robot_01", distance, heigth);
        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[2] = new Cat("Барсик", distance, heigth);
        Obstacles[] barriers = new Obstacles[6];

        int i;
        for(i = 0; i < barriers.length; ++i) {
            distance = rand.nextInt(10);
            boolean isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Treadmill("Treadmill " + i, distance);
            } else {
                barriers[i] = new Wall("Wall " + i, distance);
            }
        }

        for(i = 0; i < actions.length; ++i) {
            boolean result = true;

            for(int j = 0; j < barriers.length; ++j) {
                if (Human.class == actions[i].getClass()) {
                    result = barriers[j].moving((Human)actions[i]);
                }

                if (Robot.class == actions[i].getClass()) {
                    result = barriers[j].moving((Robot)actions[i]);
                }

                if (Cat.class == actions[i].getClass()) {
                    result = barriers[j].moving((Cat)actions[i]);
                }

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Успешно");
            } else {
                System.out.println("Неудача");
            }
        }

    }
}