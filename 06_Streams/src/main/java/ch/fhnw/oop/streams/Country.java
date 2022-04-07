package ch.fhnw.oop.streams;

/**
 * This class models a country with properties like name and area.
 *
 */
public final class Country {
	private final String code;
	private final String name;
	private final double area;
	private final int population;

	/**
	 * Creates a new Country instance.
	 * @param name the name of the country
	 * @param area the area of the country
	 */
	public Country(String code, String name, double area, int population) {
		this.code = code;
		this.name = name;
		this.area = area;
		this.population = population;
	}

	/**
	 * Returns the code of the country.
	 * @return the code of the country
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Returns the name of the country.
	 * @return the name of the country
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the area in square kilometers.
	 * @return the area in square kilometers
	 */
	public double getArea() {
		return area;
	}

	/**
	 * Returns the population in square kilometers.
	 * @return the population in square kilometers
	 */
	public int getPopulation() {
		return population;
	}

	@Override
	public String toString() {
		return String.format("%s (%.2f km2, %d Einwohner)", name, area, population);
	}
}