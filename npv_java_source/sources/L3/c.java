package L3;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.concurrent.locks.Lock f6195c = new java.util.concurrent.locks.ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static L3.c f6196d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.locks.Lock f6197a = new java.util.concurrent.locks.ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.SharedPreferences f6198b;

    c(android.content.Context context) {
        this.f6198b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static L3.c b(android.content.Context context) {
        Q3.AbstractC1477p.l(context);
        f6195c.lock();
        try {
            if (f6196d == null) {
                f6196d = new L3.c(context.getApplicationContext());
            }
            return f6196d;
        } finally {
            f6195c.unlock();
        }
    }

    private static final java.lang.String i(java.lang.String str, java.lang.String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f6197a.lock();
        try {
            this.f6198b.edit().clear().apply();
        } finally {
            this.f6197a.unlock();
        }
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount c() {
        java.lang.String strG;
        java.lang.String strG2 = g("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(strG2) || (strG = g(i("googleSignInAccount", strG2))) == null) {
            return null;
        }
        try {
            return com.google.android.gms.auth.api.signin.GoogleSignInAccount.P(strG);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions d() {
        java.lang.String strG;
        java.lang.String strG2 = g("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(strG2) || (strG = g(i("googleSignInOptions", strG2))) == null) {
            return null;
        }
        try {
            return com.google.android.gms.auth.api.signin.GoogleSignInOptions.O(strG);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public java.lang.String e() {
        return g("refreshToken");
    }

    public void f(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        Q3.AbstractC1477p.l(googleSignInAccount);
        Q3.AbstractC1477p.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.Q());
        Q3.AbstractC1477p.l(googleSignInAccount);
        Q3.AbstractC1477p.l(googleSignInOptions);
        java.lang.String strQ = googleSignInAccount.Q();
        h(i("googleSignInAccount", strQ), googleSignInAccount.R());
        h(i("googleSignInOptions", strQ), googleSignInOptions.S());
    }

    protected final java.lang.String g(java.lang.String str) {
        this.f6197a.lock();
        try {
            return this.f6198b.getString(str, null);
        } finally {
            this.f6197a.unlock();
        }
    }

    protected final void h(java.lang.String str, java.lang.String str2) {
        this.f6197a.lock();
        try {
            this.f6198b.edit().putString(str, str2).apply();
        } finally {
            this.f6197a.unlock();
        }
    }
}
