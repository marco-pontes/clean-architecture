package app.factories;

import app.services.Service;

public interface ServiceFactory {
    public Service makeSvc();
}
