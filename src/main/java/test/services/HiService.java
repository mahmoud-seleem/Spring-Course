package test.services;

import test.interfaces.Service;

public class HiService implements Service {
    @Override
    public String getService() {
        return "Hi from Hi service";
    }
}
