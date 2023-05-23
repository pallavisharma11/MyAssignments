package StreamAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;
    News(int newsId,String postedByUser,String commentByUser,String comment){
        this.newsId=newsId;
        this.postedByUser=postedByUser;
        this.commentByUser=commentByUser;
        this.comment=comment;
    }
}
public class Question2 {
//    public static int maxComments(List<News> news) {}
//
//    public static int budgetCount (List < News > news) {}
//    public static String maxCommentsByUser (List < News > news) {}
//
//    public static Map<String, Integer> sortMaxCommentsByUser (List < News > news) {}

    public static void main(String[] args) {
        List<News> list = new ArrayList<>();
        list.add(new News(123,"Pallavi","Kashish","Awesome News"));
        list.add(new News(13,"Kashi","Pakhi","Awesome"));
        list.add(new News(1356,"Parth","Ashish","Not Good"));
    }
}
