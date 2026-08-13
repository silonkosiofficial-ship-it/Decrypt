package p224w3;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static android.content.Context a(android.content.Context context) {
        return c(context).b();
    }

    public static java.lang.Object b(android.content.Context context, java.lang.String str, p224w3.r rVar) throws p224w3.s {
        try {
            return rVar.b(c(context).d(str));
        } catch (java.lang.Exception e6) {
            throw new p224w3.s(e6);
        }
    }

    private static com.google.android.gms.dynamite.DynamiteModule c(android.content.Context context) throws p224w3.s {
        try {
            return com.google.android.gms.dynamite.DynamiteModule.e(context, com.google.android.gms.dynamite.DynamiteModule.f24967b, "com.google.android.gms.ads.dynamite");
        } catch (java.lang.Exception e6) {
            throw new p224w3.s(e6);
        }
    }
}
