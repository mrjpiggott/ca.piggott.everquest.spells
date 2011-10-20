package ca.piggott.everquest.spells.model;


import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Spell {

	public static final String ID = "id";
	
	public static final String NAME = "name";

	public static final int INDEX_ID = 0;
	
	public static final int INDEX_NAME = 1;

	@PrimaryKey
	private String id;

	@Persistent
	private String description;

	@Persistent
	private String[] fields;

	@Persistent
	private String[] slots;
	
	public Spell() {
		
	}
	
	public Spell(String[] slots, String description, String[] fields) {
		setFields(fields);
		setSlots(slots);
		setDescription(description);
	}

	public String getField(int index) {
		return fields[index];
	}

	public double getDoubleField(int index) {
		return Double.valueOf(fields[index]);
	}

	public int getIntField(int index) {
		return fields[index].equals("") ? 0 : fields[index].indexOf('.') != -1 ? (int) getDoubleField(index) : Integer.valueOf(fields[index]);
	}

	public long getId() {
		return Long.valueOf(id);
	}
	
	public String[] getFields() {
		return fields;
	}
	
	public String getDescriptions() {
		return description;
	}
	
	public String[] getSlots() {
		return slots;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setFields(String[] fields) {
		this.id = fields[0];
		this.fields = fields;
	}

	public void setSlots(String[] slots) {
		this.slots = slots;
	}
	
	public void copy(Spell spell) {
		this.description = spell.description;
		this.fields = spell.fields;
		this.slots = spell.slots;
	}
}
