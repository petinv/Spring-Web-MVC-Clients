package org.example.app.services;

import org.example.app.repository.ClientRepository;
import org.example.app.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository repository;

    @Override
    @Transactional
    public List<Client> getClients() {
        return repository.getClients();
    }

    @Override
    @Transactional
    public void saveClient(Client client) {
        repository.saveClient(client);
    }

    @Override
    @Transactional
    public Client getClient(int id) {
        return repository.getClient(id);
    }

    @Override
    @Transactional
    public void deleteClient(int id) {
        repository.deleteClient(id);
    }
}
