package es.esy.contacontes.kontakontes.Contes;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import es.esy.contacontes.kontakontes.R;

public class VisualitzacioConte extends AppCompatActivity {
    String VideoURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualitzacio_conte);

        Bundle InfoURL = this.getIntent().getExtras();
        int numconte = InfoURL.getInt("numboto");
        Toast.makeText(this, numconte, Toast.LENGTH_SHORT).show();

        switch (numconte){
            case 1:
                VideoURL = "rtsp://r7---sn-4g57kner.googlevideo.com/Cj0LENy73wIaNAnjZ_3lf6LLaxMYDSANFC36FMNYMOCoAUIASARg05yFlZK_1vBXigELV3ZWSUJsYzNmX0EM/3971F497B3D8F4182869B458F8A0ECF3E70BB823.87E8CF701B11A862E780BB96B7FBF3D76F5DFE69/yt6/1/video.3gp";
                return;
            case 2:
                VideoURL = "rtsp://r6---sn-4g5e6nl6.googlevideo.com/Cj0LENy73wIaNAl2dJrck22iyhMYDSANFC2vHMNYMOCoAUIASARg05yFlZK_1vBXigELV3ZWSUJsYzNmX0EM/2B199FD3E44958BA7E1E11351D77EB2437F142BE.BA457D7AC0D46C546C194186031FE9A1820EE41B/yt6/1/video.3gp";
                return;
            case 3:
                VideoURL = "rtsp://r5---sn-4g5edn7e.googlevideo.com/Cj0LENy73wIaNAkwMvzg3HOxKRMYDSANFC0iHsNYMOCoAUIASARg05yFlZK_1vBXigELV3ZWSUJsYzNmX0EM/088E0B79FA03CC7C462B6D03A3A55B87D54275DB.A88C6B25327A535ECFCAB745952D2C647643D95D/yt6/1/video.3gp";
                return;
            case 4:
                VideoURL = "rtsp://r6---sn-4g5e6nl7.googlevideo.com/Cj0LENy73wIaNAlhXf1AspwrJBMYDSANFC0UIcNYMOCoAUIASARg05yFlZK_1vBXigELV3ZWSUJsYzNmX0EM/CBEF10724A697CB8932EDF69052987C4CFD224CB.DC791219C5B81A867DD28F2E956ED57EAD94A36D/yt6/1/video.3gp";
                return;
            case 5:
                VideoURL = "rtsp://r5---sn-4g5edney.googlevideo.com/Cj0LENy73wIaNAmtjKZ8ntF9SBMYDSANFC1mIsNYMOCoAUIASARg05yFlZK_1vBXigELV3ZWSUJsYzNmX0EM/C0C572CBE103CFC5D4537FD957080E19CDCD4A92.863D82D411F752CC0AF27511B933E0FCAD5E0EDB/yt6/1/video.3gp";
                return;
            case 6:
                VideoURL = "rtsp://r5---sn-4g5e6nl7.googlevideo.com/Cj0LENy73wIaNAkRLInXVKl2khMYDSANFC3cI8NYMOCoAUIASARg05yFlZK_1vBXigELV3ZWSUJsYzNmX0EM/7BFFF54CE7AADF2F3A1820A4FFCB777D3F89200A.3692E0AA424EDBA4C8F49BE5A624D979238549B2/yt6/1/video.3gp";
                return;
        }


        VideoView videoView =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse("rtsp://r7---sn-4g57kner.googlevideo.com/Cj0LENy73wIaNAnjZ_3lf6LLaxMYDSANFC36FMNYMOCoAUIASARg05yFlZK_1vBXigELV3ZWSUJsYzNmX0EM/3971F497B3D8F4182869B458F8A0ECF3E70BB823.87E8CF701B11A862E780BB96B7FBF3D76F5DFE69/yt6/1/video.3g");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}
