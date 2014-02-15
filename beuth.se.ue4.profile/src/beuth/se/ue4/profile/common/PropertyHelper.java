package beuth.se.ue4.profile.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class PropertyHelper extends UMLSwitch<String>{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Object> getTaggedValue(Element element, String stereotypeName, String property, Boolean isClass){
		Stereotype stereotype = getStereotype(element, stereotypeName);
		List<Object> result = new ArrayList<Object>();
		Object values = element.getValue(stereotype, property);
		if( values instanceof Collection){
			for(Object object : (Collection<List>) values) {
				addToResult(property, isClass, result, object);
			}
		} else {
			addToResult(property, isClass, result, values);
		}
		return result;
	}

	private void addToResult(String property, Boolean isClass,
			List<Object> result, Object values) {
		if(values instanceof DynamicEObjectImpl) {
			final DynamicEObjectImpl objectImpl = (DynamicEObjectImpl) values;
			final EClass c = objectImpl.eClass();
			EStructuralFeature sf = null;
			if( isClass ){
				sf = c.getEStructuralFeature("base_Class");
			} else {
				sf = c.getEStructuralFeature("base_Property");
			}
			if( sf !=null ){
				result.add(objectImpl.eDynamicGet(sf, true));
			}
		}
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
