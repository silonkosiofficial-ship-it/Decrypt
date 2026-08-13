package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S5.w f12573a = new S5.w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String f12574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.String f12575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String f12576d;

    static {
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(S8.r.F(S5.v.f12572a.e()), 10);
        f12574b = strEncodeToString;
        f12575c = "firebase_session_" + strEncodeToString + "_data";
        f12576d = "firebase_session_" + strEncodeToString + "_settings";
    }

    private w() {
    }

    public final java.lang.String a() {
        return f12575c;
    }

    public final java.lang.String b() {
        return f12576d;
    }
}
