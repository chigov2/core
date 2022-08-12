package co.firmareal.model.request.account;

public class NewAccountRequest{
    private String accountName;
    private InitialUser initialUser;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public InitialUser getInitialUser() {
        return initialUser;
    }

    public void setInitialUser(InitialUser initialUser) {
        this.initialUser = initialUser;
    }
}
