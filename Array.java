class Array{
    public static void main(String[] args){
        int[] score = new int[3];

        score[0]=80;
        score[1]=100;
        score[2]=75;

        //初期化されるため0,1,2の順番で数字振られている
        String[] name ={"菅原","山村","寺島"};
        System.out.println(name[0]+"さん："+score[0]+"点");
        System.out.println(name[1]+"さん："+score[1]+"点");
        System.out.println(name[2]+"さん："+score[2]+"点");
        System.out.println("受験者数："+score.length+"名");
    }
}
