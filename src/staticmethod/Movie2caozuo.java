package staticmethod;
import java.util.Scanner;
//电影操作类
public class Movie2caozuo {
  private Movie2[] movies;
  //记住一个电影对象的数组
    public Movie2caozuo(Movie2[] movies) {
        this.movies = movies;
    }
    //打印所有电影
    public void printAllMovies() {
        for (int i = 0; i < movies.length; i++) {
             Movie2 m=movies[i];
            System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getActor()+"\t"+m.getPrice());
        }
    }

    public void searchMovieById() {
        System.out.println("请输入要查询电影的id");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie2 m = movies[i];
            if (m.getId() == id) {
                System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getActor() + "\t" + m.getPrice());
                return;
            }
        }
    }
}
