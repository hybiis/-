package ch06;

public class Practice9 {
    public static void main(String[] args) {

    }
}
class Marine {

    int x=0, y=0; //Marine의 위치좌표 (x,y)
    int hp = 60; //현재 체력
    int weapon = 6; //공격력 => Static
    int armor = 0; //방어력 => Static 모든 병사의 공격력과 방어력이 같아야 하기때문에

    void weaponUp() {
        weapon++;
    }

    void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}