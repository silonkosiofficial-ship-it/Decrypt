package p106k5;

/* JADX INFO: loaded from: classes3.dex */
public class H implements p106k5.I {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.regex.Pattern f49570g = java.util.regex.Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.lang.String f49571h = java.util.regex.Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p106k5.J f49572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f49573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f49574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G5.e f49575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p106k5.C f49576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k5.I.a f49577f;

    public H(android.content.Context context, java.lang.String str, G5.e eVar, p106k5.C c6) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new java.lang.IllegalArgumentException("appIdentifier must not be null");
        }
        this.f49573b = context;
        this.f49574c = str;
        this.f49575d = eVar;
        this.f49576e = c6;
        this.f49572a = new p106k5.J();
    }

    private synchronized java.lang.String b(java.lang.String str, android.content.SharedPreferences sharedPreferences) {
        java.lang.String strE;
        strE = e(java.util.UUID.randomUUID().toString());
        p076h5.g.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    static java.lang.String c() {
        return "SYN_" + java.util.UUID.randomUUID().toString();
    }

    private static java.lang.String e(java.lang.String str) {
        return f49570g.matcher(str).replaceAll("").toLowerCase(java.util.Locale.US);
    }

    static boolean k(java.lang.String str) {
        return str != null && str.startsWith("SYN_");
    }

    private java.lang.String l(android.content.SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private java.lang.String m(java.lang.String str) {
        return str.replaceAll(f49571h, "");
    }

    private boolean n() {
        k5.I.a aVar = this.f49577f;
        return aVar == null || (aVar.e() == null && this.f49576e.d());
    }

    @Override // p106k5.I
    public synchronized k5.I.a a() {
        k5.I.a aVarB;
        if (!n()) {
            return this.f49577f;
        }
        p076h5.g.f().i("Determining Crashlytics installation ID...");
        android.content.SharedPreferences sharedPreferencesQ = p106k5.AbstractC6898i.q(this.f49573b);
        java.lang.String string = sharedPreferencesQ.getString("firebase.installation.id", null);
        p076h5.g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f49576e.d()) {
            p106k5.G gD = d(false);
            p076h5.g.f().i("Fetched Firebase Installation ID: " + gD.b());
            if (gD.b() == null) {
                gD = new p106k5.G(string == null ? c() : string, null);
            }
            aVarB = j$.util.Objects.equals(gD.b(), string) ? k5.I.a.a(l(sharedPreferencesQ), gD) : k5.I.a.a(b(gD.b(), sharedPreferencesQ), gD);
        } else {
            aVarB = k(string) ? k5.I.a.b(l(sharedPreferencesQ)) : k5.I.a.b(b(c(), sharedPreferencesQ));
        }
        this.f49577f = aVarB;
        p076h5.g.f().i("Install IDs: " + this.f49577f);
        return this.f49577f;
    }

    public p106k5.G d(boolean z6) {
        java.lang.String strB;
        p116l5.f.e();
        java.lang.String str = null;
        if (z6) {
            try {
                strB = ((com.google.firebase.installations.g) p115l4.AbstractC6934o.b(this.f49575d.b(false), 10000L, java.util.concurrent.TimeUnit.MILLISECONDS)).b();
            } catch (java.lang.Exception e6) {
                p076h5.g.f().l("Error getting Firebase authentication token.", e6);
                strB = null;
            }
        } else {
            strB = null;
        }
        try {
            str = (java.lang.String) p115l4.AbstractC6934o.b(this.f49575d.a(), 10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception e10) {
            p076h5.g.f().l("Error getting Firebase installation id.", e10);
        }
        return new p106k5.G(str, strB);
    }

    public java.lang.String f() {
        return this.f49574c;
    }

    public java.lang.String g() {
        return this.f49572a.a(this.f49573b);
    }

    public java.lang.String h() {
        return java.lang.String.format(java.util.Locale.US, "%s/%s", m(android.os.Build.MANUFACTURER), m(android.os.Build.MODEL));
    }

    public java.lang.String i() {
        return m(android.os.Build.VERSION.INCREMENTAL);
    }

    public java.lang.String j() {
        return m(android.os.Build.VERSION.RELEASE);
    }
}
