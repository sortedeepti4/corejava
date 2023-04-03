package userdefinedException;

public class EmployeeRegister {
	
	public String register(String name) throws DeeptiException{
		if (name=="antony") {
			throw new DeeptiException();
		}
		return name;
	}

}
