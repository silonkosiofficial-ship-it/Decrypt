package p255z4;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public float a(android.content.ContentResolver contentResolver) {
        return android.provider.Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
