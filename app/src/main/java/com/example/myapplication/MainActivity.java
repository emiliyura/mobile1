package com.example.mirea_prac_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Объявление метода отправки сообщения, вызываемого при нажатии на кнопку или другой View.
    public void sendMessage(View v) {
        // Создание нового объекта Intent для перехода от текущей активности к SecondActivity.
        Intent intent = new Intent(this, SecondActivity.class);

        // Получение ссылки на элемент EditText с идентификатором R.id.edittext.
        EditText editText = findViewById(R.id.edittext);

        // Извлечение текста из EditText и преобразование в строку.
        String message = editText.getText().toString();

        // Добавление строки сообщения в Intent с ключом "extra_message".
        intent.putExtra("extra_message", message);

        // Запуск активности SecondActivity с использованием Intent для передачи данных.
        startActivity(intent);
    }

}


