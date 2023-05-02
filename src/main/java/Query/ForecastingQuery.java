package Query;

/**
 * Class for forecasting queries for forecasting algorithms.
 */
public class ForecastingQuery implements QueryInterface {
	private Query query;
	
	/**
	 * Constructor to set all instance variables.
	 * @param Query object created by user with correct parameters
	 */
	public ForecastingQuery(Query query) {
		this.query = query;
	}
	
	/**
	 * Creates the query using the instance variables, and returns it.
	 * @return the query with all instance variables
	 */
	public String getQuery() {
		return "SELECT REF_DATE, VALUE FROM echodata.echodata WHERE (GEO LIKE \"%" + query.getArg1() + "%\"" + ")" + " AND (REF_DATE <= " + "\"" + 
		query.getEndDate() + "\" AND REF_DATE >= " + "\"" + query.getStartDate() + "\");";
	}
}
