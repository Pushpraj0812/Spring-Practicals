package in.co.rays.form;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class UserForm {

	protected long id = 0;

	private Long[] ids;

	@NotEmpty(message = "first name is required")
	private String firstName;

	@NotEmpty(message = "last name is required")
	private String lastName;

	@NotEmpty(message = "login is required")
	private String login;

	@NotEmpty(message = "password is required")
	@Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,12}", message = "Password must contain 8–12 chars, 1 uppercase, 1 lowercase, 1 digit, and 1 special character")
	private String password;

	@NotEmpty(message = "address is required")
	private String address;

	private int pageNo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long[] getIds() {
		return ids;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
}