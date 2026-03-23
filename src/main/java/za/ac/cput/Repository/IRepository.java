package za.ac.cput.Repository;

import za.ac.cput.domain.Customer;

import java.util.List;

public interface IRepository <T,ID>{
    T create(T t);

    T read (ID Id );

    T update (T t);

    List<T> getAll();

    T delete(ID id);


}
