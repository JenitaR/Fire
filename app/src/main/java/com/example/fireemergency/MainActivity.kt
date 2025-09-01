package com.example.fireemergency

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This line links the logic to the layout file you just created.
        setContentView(R.layout.activity_main)

        // Find the SOS button by its ID from the XML layout.
        val sosButton: Button = findViewById(R.id.btn_sos)

        // Set an OnClickListener to the SOS button to handle clicks.
        sosButton.setOnClickListener {
            // This is where you would add the logic to alert emergency services.
            // For now, it will display a temporary message.
            Toast.makeText(this, "Emergency Alert Sent!", Toast.LENGTH_SHORT).show()
        }
    }
}