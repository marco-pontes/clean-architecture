package database;

import entities.User;
import interactors.UserGateway;

import java.util.ArrayList;
import java.util.List;

public class UserGatewayImpl implements UserGateway {
    @Override
    public List<User> findAll() {
        return new ArrayList<User>();
    }
}
