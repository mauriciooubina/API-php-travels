package api.config;

import services.UserService;

public enum EntityConfiguration {

    TOTALS {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    };
    public abstract Class<?> getEntityService();
}
