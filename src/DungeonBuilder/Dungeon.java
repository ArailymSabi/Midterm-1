package DungeonBuilder;

import java.util.ArrayList;
import java.util.List;

class Dungeon {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();

    public Dungeon(String name) {
        this.name = name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addNPC(NPC npc) {
        npcs.add(npc);
    }

    public void showDungeon() {
        System.out.println("Подземелье: " + name);
        System.out.println("Комнаты:");
        for (Room room : rooms) {
            System.out.println("  " + room.getName() + " - " + room.getDescription());
        }
        System.out.println("NPC:");
        for (NPC npc : npcs) {
            System.out.println("  " + npc.getName() + " - " + npc.getDescription());
        }
    }
}
