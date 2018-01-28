package interactors;

import entities.User;

import java.util.ArrayList;
import java.util.List;

public class ListUserUseCase implements ListUserUseCaseBoundary {
    UserGateway userGateway;
    @Override
    public List<UserData> execute() {
        List<User> user = userGateway.findAll();
        return new ArrayList<UserData>();
    }
}
