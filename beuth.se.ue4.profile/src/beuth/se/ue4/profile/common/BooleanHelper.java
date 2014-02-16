package beuth.se.ue4.profile.common;

import org.eclipse.uml2.uml.util.UMLSwitch;

public class BooleanHelper extends UMLSwitch<String>{
	
	private Boolean isExisting = false;
	private static BooleanHelper bHelper;
	
	private BooleanHelper() {
	}
	
	public static BooleanHelper getInstance() {
		if (bHelper == null) {
			bHelper = new BooleanHelper();
		}
		return bHelper;
	}

	public Boolean setter(Boolean isExisting) {
		this.isExisting = isExisting;
		return this.isExisting;
	}

	public Boolean setIsExisting(Boolean isExisting) {
		this.isExisting = isExisting;
		return this.isExisting;
	}

}
