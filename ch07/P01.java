package ch07;

public class P01 {
}
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck() {

        for(int i=0; i<CARD_NUM;i++){
            if(i==0 || i ==2 || i==7){
                cards[i]=new SutdaCard(i+1,true);
            }else{
                cards[i]=new SutdaCard(i%10+1,false);
            }
        }

    }

    void shuffle(){
        int idx = 0;
        SutdaCard tmp;

        for (int i = 0; i < CARD_NUM; i++) {
            idx = (int) Math.random() % CARD_NUM;
            tmp = cards[idx];
            cards[idx] = cards[i];
            cards[i] = tmp;
        }
    }

    public SutdaCard pick(int index) {
        if(index < 0 || index >= CARD_NUM)
            return null;
        return cards[index];
    }

    SutdaCard pick() {
        int idx = (int) Math.random() % CARD_NUM;
        return cards[idx];
    }
}

class SutdaCard {
    final int num;
    final boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    // info() Object toString() . 대신 클래스의 을 오버라이딩했다
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}
class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
    }
}
