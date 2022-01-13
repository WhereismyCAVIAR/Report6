package jp.ac.uryukyu.ie.e205754;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

        /**
     * ランダムな答えを作成
     * 数字が重複しないようにする
     * 前の要素にかぶるやつがないか確かめ，あればもう一度random
     * @return answer
     */
    public int[] answer(){
        for (int i = 0; i < answer.length; i++) {
            boolean flag = false;
            answer[i] = (int) (Math.random() * 9 + 1);
            do {
                flag = false;
                for (int j = i - 1; j >= 0; j--) {
                    if (answer[i] == answer[j]) {
                        flag = true;
                        answer[i] = (int) (Math.random() * 9 + 1);
                    }
                }

            } while (flag == true);
        }
        return answer;
    }

    /**
     * ゲーム実行
     * ループ処理の実装
     * inputで文字入力
     */
    public void execution(int[] answer){
        while(true){
            BufferedReader br 
                = new BufferedReader(new InputStreamReader(System.in));
            count++;
            System.out.println("*** "+count + "回目 ***");
            for (int i = 0; i < answer.length; i++) {
                System.out.print( (i + 1) + "個目 : ");
                try {
                    input[i] = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    System.err.println("数値を入力してください");
                    i--;
                } catch (IOException e) {
                    System.err.println("もう一度入力してください");
                    i--;
                }
            }
        }
    }
}