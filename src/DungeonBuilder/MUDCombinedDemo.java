package DungeonBuilder;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Мистическая крепость")
                .addRoom(new Room("Вход", "Величественный мраморный вход."))
                .addNPC(new NPC("Страж", "Огромный каменный голем."))
                .build();

        
        Room originalRoom = new Room("Библиотека", "Старинные книги покрывают стены.");
        Room clonedRoom1 = originalRoom.cloneEntity();
        Room clonedRoom2 = originalRoom.cloneEntity();

        dungeon.addRoom(clonedRoom1);
        dungeon.addRoom(clonedRoom2);

        dungeon.showDungeon();
    }
}