package demo;

import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;

public class Hello {

    public static void main(String[] args) throws RocksDBException {

        try (final RocksDB db = RocksDB.open("./data/data.db")) {
            db.put("hello".getBytes(), "world".getBytes());
            String value = new String(db.get("hello".getBytes()));
            System.out.println("Value: " + value);
        }
    }

}
