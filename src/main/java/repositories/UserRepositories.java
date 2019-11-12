package repositories;

import entities.User;
import exceptions.DbException;
import exceptions.DuplicateEntryException;
import utils.DB;

import java.util.List;

public class UserRepositories {
    public static void add(User user) throws DbException, DuplicateEntryException {
        // Find duplicates and throw DuplicateEntryException if found
        // Add new entry otherwise
        // throw new DuplicateEntryException();
        System.out.println("NAME" + user.getName());
        DB.addEntry("users",
                new String[]
                        {
                                user.getName(),
                                user.getEmail(),
                                user.getPassword(),
                                user.getAge(),
                                user.getGender(),
                                user.getCountry(),
                                user.getBio()
                        }
                                );
    }
    public static List<UserRepositories> getAll(){

        return null;
    }
}