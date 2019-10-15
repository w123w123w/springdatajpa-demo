package com.wulianfa.springdatajpademo.repository;

import com.wulianfa.springdatajpademo.model.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findUserByName(String name);

    @Query(value = "select * from t_b_user", nativeQuery = true)
    List<User> getList(Pageable pageable);

    @Query(value = "select t from User t where t.name = ?1")
    List<User> getListByName(String name);

    @Query(value = "select t from User t where t.name like %?1%")
    List<User> getListLikeName(String name);

    @Transactional
    @Modifying
    @Query(value = "update User t set t.name = ?1 where t.id = ?2")
    int modifyUserById(String name, String id);
}
