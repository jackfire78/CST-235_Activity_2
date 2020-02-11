package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;


@ManagedBean
@ViewScoped

public class User {
	
	@NotNull(message = "Please enter a first name, it is a needed field")
	@Size(min = 4, max = 15)
	private String firstName;
	@NotNull(message = "Please enter a last name, it is a needed field")
	@Size(min = 4, max = 15)
	private String lastName;
	
	public User() {
		
		this.firstName = "";
		this.lastName = "";
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
