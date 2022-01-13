package jp.ac.uryukyu.ie.e205754;

/**
 * Numenumeronを動かすためのMainクラス
 */
public class Main{
    public static void main(String[] args){  
        Numenumeron nume = new Numenumeron();
        nume.direction();
        int[] answer;
        //answerが作成されているか確認用コード
        answer = nume.answer();       
        System.out.println(answer);       
    }
}