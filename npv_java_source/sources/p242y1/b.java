package p242y1;

/* JADX INFO: loaded from: classes.dex */
abstract class b {
    static android.os.Handler a() {
        return android.os.Looper.myLooper() == null ? new android.os.Handler(android.os.Looper.getMainLooper()) : new android.os.Handler();
    }
}
