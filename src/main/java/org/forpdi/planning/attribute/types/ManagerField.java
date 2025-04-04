package org.forpdi.planning.attribute.types;

import org.forpdi.planning.attribute.AttributeType;
import org.forpdi.planning.attribute.AttributeTypeWrapper;

public class ManagerField extends AttributeType {

	private AttributeTypeWrapper wrapper = new Wrapper();

	public final String WIDGET_NAME = "ManagerField";
	@Override
	public String getWidget() {
		return WIDGET_NAME;
	}
	
	@Override
	public AttributeTypeWrapper getWrapper() {
		return wrapper;
	}

	@Override
	public String getDisplayName() {
		return "Campo de seleção do gestor";
	}

	public static class Wrapper extends TextField.Wrapper {
		
		@Override
		public String fromDatabase(String databaseValue) {
			return databaseValue;
		}
		
		@Override
		public String toDatabase(String viewValue) {
			return viewValue;
		}
		
	}
	
}