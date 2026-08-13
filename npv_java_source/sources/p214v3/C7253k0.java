package p214v3;

/* JADX INFO: renamed from: v3.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7253k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p214v3.C7253k0 f55894b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.lang.String f55895a;

    private C7253k0() {
    }

    public static p214v3.C7253k0 a() {
        if (f55894b == null) {
            f55894b = new p214v3.C7253k0();
        }
        return f55894b;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    public final void b(android.content.Context context) {
        android.content.SharedPreferences.Editor editorPutString;
        p214v3.AbstractC7265q0.k("Updating user agent.");
        java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f55895a)) {
            android.content.Context contextC = N3.AbstractC1398k.c(context);
            if (V3.e.a()) {
                editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", android.webkit.WebSettings.getDefaultUserAgent(context));
                if (contextC == null) {
                    editorPutString.apply();
                } else {
                    V3.q.a(context, editorPutString, "admob_user_agent");
                }
            } else if (contextC == null) {
                contextC = null;
                editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", android.webkit.WebSettings.getDefaultUserAgent(context));
                if (contextC == null) {
                    editorPutString.apply();
                } else {
                    V3.q.a(context, editorPutString, "admob_user_agent");
                }
            }
            this.f55895a = defaultUserAgent;
        }
        p214v3.AbstractC7265q0.k("User agent is updated.");
    }
}
