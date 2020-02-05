package cmrit.gayathri;

public class Chocolate2 extends NewYearGifts{
	static int mywt=0;
	 @Override
	 public int weightOfGift(int wt) {
		 totalweight+=wt;
		 mywt+=wt;
		 return totalweight;
	 }

}
