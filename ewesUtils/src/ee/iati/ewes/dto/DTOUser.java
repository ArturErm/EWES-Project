package ee.iati.ewes.dto;

/**
 *
 * @author Artur
 */
public class DTOUser extends DTOBase {
	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	private String fname;
	private String lname;
	private String pwd;
	private String email;
	private String ik;

	public Integer getUserId()				{ return userId; }
	public void setUserId(Integer userId)	{ this.userId = userId; }

	public String getFname()				{ return fname; }
	public void setFname(String fname)		{ this.fname = fname; }

	public String getLname()				{ return lname; }
	public void setLname(String lname)		{ this.lname = lname; }

	public String getPwd()					{ return pwd; }
	public void setPwd(String pwd)			{ this.pwd = pwd; }

	public String getEmail()				{ return email; }
	public void setEmail(String email)		{ this.email = email; }

	public String getIk()					{ return ik; }
	public void setIk(String ik)			{ this.ik = ik; }
	
	public DTOUser() { }
	
	public DTOUser(Integer userId, String fname, String lname, String email, String ik) {
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.ik = ik;
	}
	
	@Override
	public String toString() {
		return "DTOUser [userId=" + userId + ", fname=" + fname + ", lname="
				+ lname + ", pwd=" + pwd + ", email=" + email + ", ik=" + ik
				+ "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((ik == null) ? 0 : ik.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		DTOUser other = (DTOUser) obj;
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (fname == null) {
			if (other.fname != null) {
				return false;
			}
		} else if (!fname.equals(other.fname)) {
			return false;
		}
		if (ik == null) {
			if (other.ik != null) {
				return false;
			}
		} else if (!ik.equals(other.ik)) {
			return false;
		}
		if (lname == null) {
			if (other.lname != null) {
				return false;
			}
		} else if (!lname.equals(other.lname)) {
			return false;
		}
		if (pwd == null) {
			if (other.pwd != null) {
				return false;
			}
		} else if (!pwd.equals(other.pwd)) {
			return false;
		}
		if (userId == null) {
			if (other.userId != null) {
				return false;
			}
		} else if (!userId.equals(other.userId)) {
			return false;
		}
		return true;
	}
}
