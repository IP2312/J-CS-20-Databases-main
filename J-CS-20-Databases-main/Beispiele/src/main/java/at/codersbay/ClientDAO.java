package at.codersbay;

import java.sql.SQLException;
import java.util.List;

public interface ClientDAO{
    public List<Client> getClientsByLastname(String lastname);

    public List<Client> getAllClients();

    public void deactivateClient(Client client);

    public int addClient(Client client);

    public void deleteClient(int id);

}
