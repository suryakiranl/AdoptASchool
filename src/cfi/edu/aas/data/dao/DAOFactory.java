package cfi.edu.aas.data.dao;

public class DAOFactory {
	private static final DAOFactory DAO_FACTORY = new DAOFactory();
	
	public static final DAOFactory get() {
		return DAO_FACTORY;
	}
	
}
