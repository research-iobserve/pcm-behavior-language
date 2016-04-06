package data;

import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;


@Entity
public class MyClass  {
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
}
