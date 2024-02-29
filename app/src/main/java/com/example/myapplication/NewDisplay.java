package com.example.mirea_prac_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // Переопределение метода onCreate, который вызывается при создании активности.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Вызов родительского метода onCreate для правильной инициализации активности.
        super.onCreate(savedInstanceState);

        // Установка макета для текущей активности из файла ресурсов R.layout.activity_second.
        setContentView(R.layout.activity_second);

        // Получение Intent, который вызвал текущую активность.
        Intent i = getIntent();

        // Извлечение строки сообщения из Intent с ключом "extra_message".
        String input_message = i.getStringExtra("extra_message");

        // Установка размера текста в 40 единиц для TextView с идентификатором R.id.textView.
        ((TextView) findViewById(R.id.textView)).setTextSize(40);

        // Установка текста в TextView с идентификатором R.id.textView равным извлеченному сообщению.
        ((TextView) findViewById(R.id.textView)).setText(input_message);
    }
}
