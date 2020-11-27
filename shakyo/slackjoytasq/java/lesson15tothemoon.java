Q.厚さ１mmの紙がある。これを２つに折り曲げると2mmになる。もう一度折り曲げると4mm….
この作業を繰り返すと何回折り曲げると月に届くか計算せよ。なお月までの距離は384,400 kmである。
[実行例]
1回折り曲げた(2mm)
2回折り曲げた(4mm)
3回折り曲げた(8mm)
4回折り曲げた(16mm)
5回折り曲げた(32mm)
以下略
?回折り曲げたら月に到達します。

public class Jn16{
  public static void main(String[] args){
    final long DIST=384400000000L;
    int count=0;
    long thick=1L;
    while(thick<DIST){
      count++;
      thick *=2;
      System.out.println(count+"回折り曲げた("+thick+"mm)");
    }
    System.out.println(count+"回折り曲げたら月に到達します。");
  }
}