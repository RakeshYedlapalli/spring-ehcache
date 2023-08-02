package com.techprimers.cache.resource;

import com.techprimers.cache.cache.UsersCache;
import com.techprimers.cache.model.Users;
import com.techprimers.cache.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersResource {

    @Autowired
    UsersCache usersCache;

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/{name}")
    public Users getUser(@PathVariable final String name) {
        return usersCache.getUser(name);
    }

    @PostMapping(value = "/save")
    public Users saveUser(@RequestBody Users users) {
        return usersRepository.save(users);
    }
}
