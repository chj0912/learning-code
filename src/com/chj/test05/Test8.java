package com.chj.test05;

public class Test8 {

    public static void main(String[] args) {
        char [] t1={'A','D','B','A','D'};
        char [] t2={'A','D','B','C','D'};
        char [] t3={'A','D','B','C','A'};
        char [] t4={'A','B','C','D','D'};

        grade("小明",t1);
        grade("小红",t2);
        grade("小黄",t3);
        grade("小强",t4);
    }
    public static void grade(String name,char[]t){
        char [] answer={'A','D','B','C','D'};
        int count=0;
        for (int i=0;i<t.length;i++){
            if(answer[i]==t[i]){
                count+=1;
            }

        }
        System.out.println("满分是10分"+name+"：得分"+count*2+"分");
    }


}
