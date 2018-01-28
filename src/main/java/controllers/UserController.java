package controllers;

import interactors.ListUserUseCaseBoundary;
import interactors.UserData;
import presenters.ListUserPresenterBoundary;

import java.util.List;

public class UserController {
    private ListUserUseCaseBoundary listUserUseCase;
    private ListUserPresenterBoundary listUserPresenterBoundary;

    public void list(){

        List<UserData> userData = listUserUseCase.execute();
        listUserPresenterBoundary.present(userData);
    }

}
