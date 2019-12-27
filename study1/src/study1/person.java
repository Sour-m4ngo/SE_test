package study1;
import java.util.Arrays;
public class person {
		public static void main (String[] args) {
			int[] scores= {89,-23,64,91,119,52,73};
			person p =new person();
			p.getMax(scores);
			
			
		}
		public void getMax(int[] score) {
			Arrays.sort(score);
			int right=0;
			for(int a=score.length-1;a>0;a--) {
				if(score[a]<0||score[a]>100)
					continue;

				
				if(right==3)
					break;
			System.out.println(score[a]);
			right++;
			}
		}
	}


