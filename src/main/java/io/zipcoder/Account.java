package io.zipcoder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    private Long id; //auto generated assigned by the database
    private AccountType  type;
    private String nickName;//assigned at creation of account
    private Integer rewards;//rewards points assigned to account
    private Double balance;
   private  Customer customer;
   public Account (){

    }

    public Account(Long id, AccountType type, String nickName, Integer rewards, Double balance, Customer customer) {
       super();
        this.id = id;
        this.type = type;
        this.nickName = nickName;
        this.rewards = rewards;
        this.balance = balance;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public AccountType getType() {
        return type;
    }

    public String getNickName() {
        return nickName;
    }

    public Integer getRewards() {
        return rewards;
    }

    public Double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setRewards(Integer rewards) {
        this.rewards = rewards;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
