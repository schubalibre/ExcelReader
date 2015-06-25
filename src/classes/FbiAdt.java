package classes;

public class FbiAdt {
	
	public FbiAdt() {
		// TODO Auto-generated constructor stub
	}
	
	public FbiAdt(String[] s) {
		for (String str : s) System.out.println(str);
		/*setCity(s[0]);
		setPopulation(s[1]);
		setViolentCrime(Integer.parseInt(s[2]));
		setPropertyCrime(Integer.parseInt(s[3]));*/
	}
	
	private String city, population;
	private int violentCrime, propertyCrime;
	
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPopulation() {
		return population;
	}


	public void setPopulation(String population) {
		this.population = population;
	}


	public int getViolentCrime() {
		return violentCrime;
	}


	public void setViolentCrime(int violentCrime) {
		this.violentCrime = violentCrime;
	}


	public int getPropertyCrime() {
		return propertyCrime;
	}


	public void setPropertyCrime(int propertyCrime) {
		this.propertyCrime = propertyCrime;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		str.append("FBI[");
		str.append(getCity() + ",");
		str.append(getPopulation() + ",");
		str.append(getViolentCrime() + ", ");
		str.append(getPropertyCrime());
		str.append("]");
		
		return str.toString();
	}

}
