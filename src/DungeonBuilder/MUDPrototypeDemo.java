package DungeonBuilder;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room originalRoom = new Room("Коридор", "Длинный и пустой коридор.");
        Room clonedRoom = originalRoom.cloneEntity();

        System.out.println("Оригинал: " + originalRoom.getName() + " - " + originalRoom.getDescription());
        System.out.println("Клон: " + clonedRoom.getName() + " - " + clonedRoom.getDescription());
    }
}
