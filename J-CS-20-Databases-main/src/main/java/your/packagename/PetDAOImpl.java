package main.java.your.packagename;

import java.sql.SQLException;
import java.util.List;

public class PetDAOImpl  implements PetDAO {
    @Override
    public Pet get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Pet> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public int save(Pet pet) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Pet pet) throws SQLException {
        return 0;
    }

    @Override
    public int update(Pet pet) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Pet pet) {
        return 0;
    }
}
