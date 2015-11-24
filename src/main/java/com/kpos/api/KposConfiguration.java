package com.kpos.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by kameldabwan on 11/22/15.
 */
public class KposConfiguration extends Configuration {

    private DataSourceFactory _dataSourceFactory;

    @Valid
    @NotNull
    public DataSourceFactory getDataSourceFactory() {
        return _dataSourceFactory;
    }

    @JsonProperty("database")
    public void setDataSourceFactory(DataSourceFactory dataSourceFactory) {
        _dataSourceFactory = dataSourceFactory;
    }
}
