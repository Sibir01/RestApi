package service;

import Model.Client;
import java.util.List;


public interface ClientService {

    void create(Client client); //создаем нового клиента

    List<Client> readAll(); //Возвращаем список всех имеющихся клиентов

    Client read(int id);

    boolean update(Client client, int id);

    boolean delate(int id);
}
