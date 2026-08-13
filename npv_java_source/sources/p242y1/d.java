package p242y1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static y1.e.a a(android.content.Context context, android.net.Uri uri) {
        return android.os.Build.VERSION.SDK_INT < 24 ? new y1.e.b(context, uri) : new y1.e.c(context, uri);
    }
}
