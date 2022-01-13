package jp.ac.uryukyu.ie.e205754;

/**
 * Numenumeronを実装する
 */
public class Numenumeron{
    /**
     * 変数の初期化
     * strikeはstrikeのカウント用、ballもballのカウント用。
     * countは何回目のチャレンジかを数えている。
     */
    int[] answer = new int[3];// 答えが入る
    int[] input = new int[3];// 入力した答えが入る
    static int strike = 0;
    static int ball = 0;
    static int count = 0;

    /**
     * ゲーム説明を出力するメソッド
     */
    public void direction(){
        String title = "Numenumeron";
        String rule = "ランダムに指定された3つの数字をあてます。\n"
                    + "1つの数字は1から9の間です。\n"
                    + "答えの数字は3つとも異なる数字です。\n"
                    + "位置と数字が当たってたらストライク、\n"
                    + "数字だけあってたらボールとカウントします。\n"
                    + "全部当てたら(3つともストライクになったら)"
                    + "終了です\n\n";

        //タイトルとルールの表示
        System.out.println(title);
        System.out.println(rule);
    }
}