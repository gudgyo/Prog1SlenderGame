package SlenderGame;
/**
 * @author Gudmon György
 *
 */
public class Field {
	public boolean visible,note,block,canNote,used;
	public String picName;
	
	
	public Field() {

		this.note=false;
		this.visible = false;
		this.canNote=false;
		this.block=false;
		this.used=false;
		this.picName="Grass";
		
	}
	
	public String getPicName() {
		return this.picName;
	}
	
	public void setPicName(String picName) {
		this.picName = picName;
	}


	public boolean isVisible() {
		return visible;
	}


	public void setVisible(boolean visible) {
		this.visible = visible;
	}


	public boolean isNote() {
		return note;
	}


	public void setNote(boolean note) {
		this.note = note;
	}


	public boolean isBlock() {
		return block;
	}


	public void setBlock(boolean block) {
		this.block = block;
	}


	public boolean isCanNote() {
		return canNote;
	}


	public void setCanNote(boolean canNote) {
		this.canNote = canNote;
	}
	
	public boolean isUsed() {
		return used;
	}


	public void setUsed(boolean used) {
		this.used = used;
	}

	


}
