import { Link } from "react-router-dom";

function Login(){
    return(
        <div class="container">
        <div class="center">
            <h1>Login</h1>
            <form action="" method="POST">
                <div class="txt_field">
                    <input type="text" name="text" required />
                    <span></span>
                    <label>Username</label>
                </div>
                <div class="txt_field">
                    <input type="password" name="password" required />
                    <span></span>
                    <label>Password</label>
                </div>
                <div class="pass">Forget Password?</div>
                <input name="submit" type="Submit" value="Login" />
                <div class="signup_link">
                    Not a Member ? <Link to="/register">Signup</Link>
                </div>
            </form>
        </div>
      </div>
    );
}

export default Login;
