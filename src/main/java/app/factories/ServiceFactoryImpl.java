package app.factories;

import app.services.ConcreteServiceImpl;
import app.services.Service;

public class ServiceFactoryImpl implements ServiceFactory {
    @Override
    public Service makeSvc() {
        return new ConcreteServiceImpl();
    }
}
