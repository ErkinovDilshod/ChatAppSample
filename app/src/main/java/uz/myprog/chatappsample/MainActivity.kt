package uz.myprog.chatappsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.myprog.chatappsample.fragments.LoginFragment
import uz.myprog.chatappsample.fragments.SignInFragment

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentLogin = LoginFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragmentLogin).commit()
    }

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle();
        bundle.putString("message", editTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentChat = SignInFragment()
        fragmentChat.arguments = bundle

        transaction.replace(R.id.fragment_container, fragmentChat)
        transaction.commit()
    }
}