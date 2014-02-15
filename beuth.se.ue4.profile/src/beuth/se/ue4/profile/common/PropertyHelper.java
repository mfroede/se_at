package beuth.se.ue4.profile.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

public class PropertyHelper {
	public List<Object> getTaggedValue(Element element, String stereotypeName, String property){
		Stereotype stereotype = getStereotype(element, stereotypeName);
		System.out.println("=0=> " + element.toString());
		System.out.println("=1=> " + stereotype.getQualifiedName());
		List<Object> result = new ArrayList<Object>();
		Object values = element.getValue(stereotype, property);
		System.out.println("=2=> " + property);
		if( values instanceof Collection){
			System.out.println("=3=> " + ((Collection<List>)values).size());
			for(Object object : (Collection<List>) values) {
				System.out.println("=4=> " + ((Collection<List>)values).toString());
				if(object instanceof DynamicEObjectImpl) {
					System.out.println("=5=> " + ((Collection<List>)values).toString());
					final DynamicEObjectImpl objectImpl = (DynamicEObjectImpl) object;
					final EClass c = objectImpl.eClass();
					final EStructuralFeature sf = c.getEStructuralFeature("base_Class");
					System.out.println("=6=> " + sf);
					result.add(objectImpl);//.eDynamicGet(sf, true));
					if( sf !=null ){
					}
				}
			}
		} else {
			result.add(values);
		}
		System.out.println("==> " + result.toString());
		return result;
	}

	private Stereotype getStereotype(Element element, String stereotypeName) {
		for (Stereotype stereotype : element.getAppliedStereotypes()) {
			if (stereotype.getName().equalsIgnoreCase(stereotypeName)) {
				return stereotype;
			}
		}
		return null;
	}
}
