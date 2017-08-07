package com.online.yojna.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "yojna")
@Component
public class AppSetting {
    public String application;

    public DbConnection dbConnection;

    public Hibernate hibernate;

    public DbConnection getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public String getApplication() {
        return application;
    }

    public Hibernate getHibernate() {
        return hibernate;
    }

    public void setHibernate(Hibernate hibernate) {
        this.hibernate = hibernate;
    }

    public void setApplication(String application) {
        this.application = application;
    }
}
