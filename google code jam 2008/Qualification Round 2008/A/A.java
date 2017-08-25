import java.util.*;
import java.lang.*;
import java.io.*;


/**
* @author Eroui Abdelaziz
* 25/08/2017
* verdic AC (small and large)
*/
public class A
{
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		int tcase = 1;
		while(t-->0) {
			int s = Integer.parseInt(in.nextLine());
			for(int i = 0; i < s; ++i) {
				String name = in.nextLine();
			}

			int ans = 0;
			int q = Integer.parseInt(in.nextLine());
			HashSet<String> hs = new HashSet<>();
			for(int i = 0; i < q; ++i) {
				String name = in.nextLine();
				hs.add(name);
				if(hs.size() == s) {
					++ans;
					hs.clear();
					hs.add(name);
				}
			}

			System.out.print("Case #"+(tcase++) +": ");
			System.out.println(ans);

		}
	}
	
}