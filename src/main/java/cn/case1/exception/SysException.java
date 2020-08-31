package cn.case1.exception;

public class SysException extends Exception {
    private String message;

    public SysException(String message) {
        //super();//父类有空参的构造方法时，可不写
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "SysException{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
