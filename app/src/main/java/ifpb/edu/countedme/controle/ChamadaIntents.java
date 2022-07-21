package ifpb.edu.countedme.controle;

import android.content.Intent;
import android.net.Uri;

public class ChamadaIntents {

    public Intent chamadaIntent(Boolean email, String envio) {
        Intent callIntent = null;

        if (email == false){
            Uri number = Uri.parse(envio);
            callIntent = new Intent(Intent.ACTION_DIAL, number);

        } else {
            callIntent = new Intent(Intent.ACTION_SEND);
            // The intent does not have a URI, so declare the "text/plain" MIME type

            //emailIntent.setType(HTTP.PLAIN_TEXT_TYPE);
            callIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"eliel.bento@gmail.com"});
            callIntent.putExtra(Intent.EXTRA_SUBJECT, "Email de teste");
            callIntent.putExtra(Intent.EXTRA_TEXT, envio);
            callIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("content://path/to/email/attachment"));

        }

        return callIntent;

    }
}
