package controllers;

import interactors.ListUserUseCaseBoundary;
import interactors.UserData;

import java.util.List;

public class UserController {
    private ListUserUseCaseBoundary listUserUseCase;
    private ListUserPresenter listUserPresenter;

    public void list(){
        List<UserData> userData = listUserUseCase.execute();
    }

}
