package staticmethod;

public class zongheshizhan2 {
    static void main(String[] args) {


    //目标：完成面对对象的综合小案列
    //1.设计电影类Movie2,以便创建电影对象，封装电影数据
    //2.封装系统中的全部电影数据
    Movie2[] movies = new Movie2[6];
     movies[0]=new Movie2(01,"追龙","刘德华",50.0);
     movies[1]=new Movie2(02,"战狼","吴京",60.0);
     movies[2]=new Movie2(03,"暗战","渣渣辉",60.0);
     movies[3]=new Movie2(04,"让子弹飞","姜文",60.0);
     movies[4]=new Movie2(05,"夏洛特烦恼","沈腾",60.0);
     movies[5]=new Movie2(06,"唐顿庄园","王宝强",60.0);

     //3.创建电影操作对象出来，专门负责电影对象数据的业务处理
        Movie2caozuo mo=new Movie2caozuo(movies);
        mo.printAllMovies();
        mo.searchMovieById();

    }}

