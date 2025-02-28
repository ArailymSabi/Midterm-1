package DungeonBuilder;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Темная пещера")
                .addRoom(new Room("Вход", "Темный и зловещий вход."))
                .addRoom(new Room("Комната сокровищ", "Комната, полная сверкающего золота."))
                .addNPC(new NPC("Гоблин", "Хитрый маленький гоблин."))
                .build();

        dungeon.showDungeon();
    }
}

