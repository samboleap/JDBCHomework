package JDBChomework;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public class ImplJDBC {
    public DataSource dataSource(){
        PGSimpleDataSource pgSimpleDataSource = new PGSimpleDataSource();
        pgSimpleDataSource.setUser("postgres");
        pgSimpleDataSource.setPassword("2002");
        pgSimpleDataSource.setDatabaseName("JDBCHomework");
        return pgSimpleDataSource;
    }
}
