package ee.iati.ewes.web.beans.tree;

import java.io.Serializable;

public class NamedNodeWithKey implements Serializable {
	private static final long serialVersionUID = 1L;
	
	protected String type;
	protected String name;
	protected Integer key;

	public String getName()				{ return name; }
	public void setName(String name)	{ this.name = name; }

	public String getType()				{ return type; }
	public void setType(String type)	{ this.type = type; }
	
	public Integer getKey()				{ return key; }
	public void setKey(Integer key)		{ this.key = key; }

	@Override
	public String toString() {
		return this.name;
	}
}