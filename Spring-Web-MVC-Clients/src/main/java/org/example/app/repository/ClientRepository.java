package org.example.app.repository;

import org.example.app.entities.Client;

import java.util.List;

public interface ClientRepository {

    List<Client> getClients();
    void saveClient(Client client);
    Client getClient(int id);
    void deleteClient(int id);
}
