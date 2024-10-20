package org.ignacioScript.co.dao;

import org.ignacioScript.co.interfaces.DataTransferObject;
import org.ignacioScript.co.util.DButil;

import java.util.List;

public abstract class  DataAccessObject <T extends DataTransferObject> {




    //CRUD METHODS
    public abstract void create (T t);
    public abstract void update (T t);
    public abstract void delete (int id);
    public abstract T getOne (int id);
    public abstract List<T> getAll ( );

    //TODO create Entities DAOs

}





