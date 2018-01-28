package app;

import app.factories.ServiceFactory;
import app.factories.ServiceFactoryImpl;
import app.services.Service;

public class Application {

    ServiceFactory serviceFactory = new ServiceFactoryImpl();
    Service service = serviceFactory.makeSvc();
}
