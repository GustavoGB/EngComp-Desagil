package br.pro.hashi.ensino.desagil.android.camera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;


public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_EXAMPLE = 0;

    private File imageFile;
    private ImageView cameraImage;


    private void replaceImage() {
        String path = imageFile.getAbsolutePath();
        Bitmap bitmap = BitmapFactory.decodeFile(path);

        if(bitmap != null) {
            cameraImage.setImageBitmap(bitmap);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File directory = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        imageFile = new File(directory, "camera.jpg");
        cameraImage = (ImageView) findViewById(R.id.cameraImage);

        replaceImage();
    }


    public void tryToReplaceImage(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if(intent.resolveActivity(getPackageManager()) == null) {
            Toast toast = Toast.makeText(this, "Cannot use this application without access to a camera!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            Uri uri = FileProvider.getUriForFile(this, "br.pro.hashi.ensino.desagil.android.camera.fileprovider", imageFile);
            intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
            startActivityForResult(intent, REQUEST_EXAMPLE);
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQUEST_EXAMPLE && resultCode == RESULT_OK) {
            replaceImage();
        }
    }
}
