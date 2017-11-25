
public class SearchRankingService {
	public static void main(String[] args){
		SearchData searchData = new SearchData();
		
		AppleDisplay appleDisplay = new AppleDisplay(searchData);
		SamsungDisplay samsungDisplay = new SamsungDisplay(searchData);
		LGDisplay lgDisplay = new LGDisplay(searchData);
		
		String[] searchWord = {"전지현", "임창정", "지진", "일본지진", "경주지진", "슈퍼스타k", "박해진", "뮤직뱅크", "한경대", "디패턴"};
		searchData.setMeasurements(searchWord);
	}
}
