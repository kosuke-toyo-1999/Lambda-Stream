import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chapter10 {

	public static void main(String[] args) throws Exception {
        List<Task> list = new ArrayList<>();
        list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
        list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接", false));
        list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う", true));
        list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く", false));
        list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));

        // 以下記述
        
        list.stream()
        .filter(FalseList -> FalseList.isDone ==  flase)
        .sorted((FalseList1,FalseList2) -> FalseList1.getDate() - FalseList2.getDate())
        .forEach(System.out::println);

        
//        
//        List<Task> FalseList = new ArrayList<>();
//        
//        for (Task List : list) {
//        	// if文でFalseに絞る
//        	  if (List.isDone()) {
//          	    // 絞り込まれたリストに追加
//        		  FalseList.add(List);
//        	  }
//        	  }
        
        
        
        
    }

}
