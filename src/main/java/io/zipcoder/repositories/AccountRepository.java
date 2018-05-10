package io.zipcoder.repositories;

import io.zipcoder.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
