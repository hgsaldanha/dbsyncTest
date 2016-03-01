package dbsyncTest;

import dbsync.DBSync;
import dbsync.exception.DBSyncDatabaseException;
import dbsync.loader.MySQLDatabase;

public class Test1 {

	public static void main(String[] args) {
		try {
			DBSync dbs = new DBSync("root", new MySQLDatabase("localhost", "origem","root", "root"), new MySQLDatabase("localhost", "destino","root", "root"));
			dbs.load();
			dbs.preview();
			System.out.println(dbs.getInstructions());
			System.out.println(dbs.syncronize());
		} catch (DBSyncDatabaseException e) {
			e.printStackTrace();
		}

	}

}
