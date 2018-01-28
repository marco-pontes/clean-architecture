package presenters;

import interactors.UserData;

import java.util.List;

public interface ListUserPresenterBoundary {

    void present(List<UserData> userData);
}
