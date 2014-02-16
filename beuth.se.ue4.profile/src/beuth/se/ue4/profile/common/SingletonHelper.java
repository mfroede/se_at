package beuth.se.ue4.profile.common;

public class SingletonHelper {

	public Boolean setter(Boolean isExisting) {
////		System.out.println("getIsExisting " +  BooleanHelper.getInstance().getIsExisting(isExisting));
//		this.exists = isExisting;
////		isExisting = BooleanHelper.getInstance().getIsExisting(isExisting);
		return BooleanHelper.getInstance().setter(isExisting);
	}

	public Boolean setIsExisting(Boolean isExisting) {
		System.out.println("setIsExisting " +  BooleanHelper.getInstance().setIsExisting(isExisting));
		return BooleanHelper.getInstance().setIsExisting(isExisting);
	}
}
