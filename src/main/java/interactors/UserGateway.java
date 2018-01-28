package interactors;

import entities.User;

import java.util.List;

public interface UserGateway {
    List<User> findAll();
}
