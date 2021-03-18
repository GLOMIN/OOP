import javax.swing.JOptionPane;
public class Calg {

	public static void main(String[] args) {
		
		String output = " ";
		int score[]=new int[40];
		int homework[]=new int[40];
		int Quiz[]=new int[40];
		int Mid[]=new int[40];
		int Final[]=new int[40];
		int TotalScore[]=new int[40];

		for(int i=0;i<score.length;i++){
				score[i] = 1+(int)(Math.random()*5);
				homework[i] = 1+(int)(Math.random()*15);
				Quiz[i] = 1+(int)(Math.random()*10);
				Mid[i] = 10+(int)(Math.random()*25);
				Final[i] = 15+(int)(Math.random()*20);
				TotalScore[i] = score[i] + homework[i]+Quiz[i]+Mid[i]+Final[i];
				output +=" Student " + (i + 1) + " : "  + "Score "+score[i]+"     HW "+homework[i]+"     Quiz "+Quiz[i]+"     Mid "+Mid[i]+
				"     Final "+Final[i]+"   Total"+TotalScore[i]+"     GPA = "+(calGrade(TotalScore[i]))+"\n ";
		}

		JOptionPane.showMessageDialog(null,output,"Result",JOptionPane.INFORMATION_MESSAGE);

		}
	public static String calGrade(int TotalScore) {
		String gradeall = new String();
			if(TotalScore>=80){
				gradeall="A";
			}
			else if(TotalScore>=50 && TotalScore <= 54){
				gradeall="D";
			}
			else if(TotalScore>=55 && TotalScore <= 59){
				gradeall="D+";
			}
			else if(TotalScore>=60 && TotalScore <= 64){
				gradeall="C";
			}
			else if(TotalScore>=65 && TotalScore <= 69){
				gradeall="C+";
			}
			else if(TotalScore>=70 && TotalScore <= 74){
				gradeall="B";
			}
			else if(TotalScore>=75 && TotalScore <= 79){
				gradeall="B+";
			}
			else{
				gradeall = "F";
			}
			return(gradeall);
	}

}