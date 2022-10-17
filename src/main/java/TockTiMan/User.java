package TockTiMan;

public class User {
    private String password;

    public String getPassword() {
        return password;
    }

    public void initPassword(PasswordGenerator passwordGenerator) { //낮은 결합을 위해 상위의 인터페이스를 둠
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
// 내부에서 생성하게 되면 강한 결합을 가지게 됨
// import 하지 않아도 됨

        String password = passwordGenerator.generatePassword();
        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if(password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }


    }
}
