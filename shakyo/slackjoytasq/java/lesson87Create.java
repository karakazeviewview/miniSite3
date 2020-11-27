public class lesson87Create {
    //作成したカードの一覧を表示して確認する
    public static void main(String[] args) {
        //山札クラスの作成
        Deck deck = new Deck();
        //作成したカードの一覧を表示するメソッド
        deck.DisplayCardist();
    }


    //カードのマークプロパティ（スペード・クローバー・ハート・ダイヤ）
    private String suit;
    //カードの数字（１～１３）
    private int num;
    //コンストラクタ
    public Card(String suit, int num){
        this.suit = suit;
        this.num = num;
    }
    //getter,setter
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }



    //カードクラスを格納する配列
    private Card card[];

    //コンストラクタ（山札の作成）
    public Deck() {
        //５２枚のカードを格納する配列を宣言する
        card = new Card[51];
        //山札の枚数をカウントする変数
        int rand = 0;

        //カードのマークの種類分ループを回す
        for (int i = 1; i <= 4; i++) {
            //ループの1回目
            if (i == 1) {
                //ハートの１～１３を作成
                for (int j = 1; j <= 13; j++) {
                    this.card[rand] = new Card("ハート", j);
                    rand++;
            }
            //ループの２回目
            } else if (i == 2) {
                //ダイヤの１～１３を作成
                for (int j = 1; j <= 13; j++) {
                    this.card[rand] = new Card("ダイヤ", j);
                    rand++;
                }
            //ループの３回目
            } else if (i == 3) {
                //スペードの１～１３を作成
                for (int j = 1; j <= 13; j++) {
                    this.card[rand] = new Card("スペード", j);
                    rand++;
                }
            //ループの４回目
            } else if (i == 4) {
                //クローバーの１～１３を作成
                for (int j = 1; j <= 13; j++) {
                    this.card[rand] = new Card("クローバー", j);
                    rand++;
                }
            }
        }
    }
    //作成したカードの一覧を表示するメソッド
    public void DisplayCardist() {
        for (Card s : this.card) {
           System.out.println(s.getSuit() + s.getNum());
        }
    }

}
