
public class LoginController{
    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }

    public LoginView getView() {
        return view;
    }

    public void setView(LoginView view) {
        this.view = view;
    }
    private boolean checkLogin(LoginModel user){
        if((user.getUserName().equals("admin"))&& (user.getPassWord().equals("admin"))){
            return true;
        }
        return false;
    }
    public void Login(){
        while (true){
            LoginModel user = view.getUserInfo();
            if(checkLogin(user)){
                view.showMessage("success");
                break;
            }else{
                view.showMessage("wrong username or password!");
            }
        }
    }


}

