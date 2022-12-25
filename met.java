package met;
import java.util.*;


public class met {
	public static void shortpath(ArrayList<ArrayList<Integer>> res, int x, int temp) {
		int[] nums = new int[x];
		for(int i=0;i<x;i++) {
			nums[i]=10000000;
		}
		Queue<Integer> q = new LinkedList<>();
		nums[temp]=0;
		q.add(temp);
		while(!q.isEmpty()) {
			int node = q.poll();
			for(int it:res.get(node)) {
				if(nums[node]+1<nums[it]) {
					nums[it]=nums[node]+1;
					q.add(it);
				}
			}
		}
		
		 String[] stations={"LBnagar","Victoria_memorial","chaitanyapuri","Dilshukhnagar","moosrambagh","NewMarket","malakpet","MGbusstation","Osmania_medical","Gandhibhavan","Nampally","Assembly","Lakdikapool","Khairtabad","Irrummanzil","Panjagutta","Ameerpet","SRnagar","ESIhospital","Erragadda","Bharatnagar","Moosapet","DR_BRambedkar","Kukatpally","KPHBcolony","JNTUcollege","Miyapur","Sultanbazar","Narayanguda","Chikkadpali","RTCxroads","Musheerabad","Gandhihospital","Secbadwest","Paradeground","Nagole","Uppal","stadium","NGRI","Habsiguda","Tarnaka","Mettuguda","Secbadeast","Paradise","Rasoolpura","PrakashNagar","Begumpet","MathuraNagar","Yusufguda","Jubliehills","JH-checkpost","Peddamagudi","Madhapur","Dugamcheruvu","Hitechcity","raidurg"};
		 
		 
		 for(int i=0;i<=55;i++) {
			 System.out.println("Distance from the source  "  +stations[temp]+  "  to  "  +stations[i]+  "  is :  "  +nums[i]);
		 }
	}
    
	public static void main(String args[]) {
		Scanner ch = new Scanner(System.in);
		int n=56;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
			
		}
		adj.get(0).add(1);
		for(int i=1;i<=7;i++) {
			adj.get(i).add(i-1);
			adj.get(i).add(i+1);
		}
		adj.get(8).add(7);
		adj.get(8).add(9);
		adj.get(8).add(27);
		for(int i=9;i<=15;i++) {
			adj.get(i).add(i-1);
			adj.get(i).add(i+1);
		}
		adj.get(16).add(15);
		adj.get(16).add(17);
		adj.get(16).add(46);
		adj.get(16).add(47);
		for(int i=17;i<=25;i++) {
			adj.get(i).add(i-1);
			adj.get(i).add(i+1);
		}
		adj.get(26).add(25);
		adj.get(27).add(8);
		adj.get(27).add(28);
		for(int i=28;i<=33;i++) {
			adj.get(i).add(i-1);
			adj.get(i).add(i+1);
		}
		adj.get(34).add(33);
		adj.get(34).add(42);
		adj.get(34).add(43);
		adj.get(35).add(36);
		for(int i=36;i<=41;i++) {
			adj.get(i).add(i-1);
			adj.get(i).add(i+1);
		}
		adj.get(42).add(41);
		adj.get(42).add(34);
		adj.get(43).add(34);
		adj.get(43).add(44);
		for(int i=44;i<=45;i++) {
			adj.get(i).add(i-1);
			adj.get(i).add(i+1);
		}
		adj.get(46).add(16);
		adj.get(46).add(45);
		adj.get(47).add(16);
		adj.get(47).add(48);
		for(int i=48;i<=54;i++) {
			adj.get(i).add(i-1);
			adj.get(i).add(i+1);
		}
		adj.get(55).add(54);
		
		String[] stations={"LBnagar","Victoria_memorial","chaitanyapuri","Dilshukhnagar","moosrambagh","NewMarket","malakpet","MGbusstation","Osmania_medical","Gandhibhavan","Nampally","Assembly","Lakdikapool","Khairtabad","Irrummanzil","Panjagutta","Ameerpet","SRnagar","ESIhospital","Erragadda","Bharatnagar","Moosapet","DR_BRambedkar","Kukatpally","KPHBcolony","JNTUcollege","Miyapur","Sultanbazar","Narayanguda","Chikkadpali","RTCxroads","Musheerabad","Gandhihospital","Secbadwest","Paradeground","Nagole","Uppal","stadium","NGRI","Habsiguda","Tarnaka","Mettuguda","Secbadeast","Paradise","Rasoolpura","PrakashNagar","Begumpet","MathuraNagar","Yusufguda","Jubliehills","JH-checkpost","Peddamagudi","Madhapur","Dugamcheruvu","Hitechcity","raidurg"};
		//enter the source station by a number from the above list numbering starts with 0-based indexing
		System.out.println("Enter the Source Station Number from below options");
		for(int i=0;i<56;i++) {
			System.out.println("Station Number   "  +i+ "  "  +stations[i]);
		}
		System.out.println("Enter the Source Station");
		int src=ch.nextInt();
		System.out.println("shortest path from source to all stations :");
		shortpath(adj,n,src);
		
		
		
	}
}
