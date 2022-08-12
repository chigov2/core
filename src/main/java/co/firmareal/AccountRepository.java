package co.firmareal;

import co.firmareal.entity.AccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.UUID;

@Repository
public interface AccountRepository extends CrudRepository <AccountEntity, BigInteger>{
    AccountEntity findAccountEntityByName(String name);
    AccountEntity findAccountEntityByUuid(UUID uuid);//ask how it works5
}
