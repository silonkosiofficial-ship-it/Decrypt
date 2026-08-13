package p186s5;

/* JADX INFO: loaded from: classes3.dex */
class c implements p186s5.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f54358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p156p5.b f54359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p076h5.g f54360c;

    public c(java.lang.String str, p156p5.b bVar) {
        this(str, bVar, p076h5.g.f());
    }

    c(java.lang.String str, p156p5.b bVar, p076h5.g gVar) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("url must not be null.");
        }
        this.f54360c = gVar;
        this.f54359b = bVar;
        this.f54358a = str;
    }

    private p156p5.a b(p156p5.a aVar, p186s5.k kVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f54391a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", p106k5.C6911w.k());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f54392b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f54393c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f54394d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f54395e.a().c());
        return aVar;
    }

    private void c(p156p5.a aVar, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private org.json.JSONObject e(java.lang.String str) {
        try {
            return new org.json.JSONObject(str);
        } catch (java.lang.Exception e6) {
            this.f54360c.l("Failed to parse settings JSON from " + this.f54358a, e6);
            this.f54360c.k("Settings response " + str);
            return null;
        }
    }

    private java.util.Map f(p186s5.k kVar) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("build_version", kVar.f54398h);
        map.put("display_version", kVar.f54397g);
        map.put("source", java.lang.Integer.toString(kVar.f54399i));
        java.lang.String str = kVar.f54396f;
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // p186s5.l
    public org.json.JSONObject a(p186s5.k kVar, boolean z6) {
        p116l5.f.d();
        if (!z6) {
            throw new java.lang.RuntimeException("An invalid data collection token was used.");
        }
        try {
            java.util.Map mapF = f(kVar);
            p156p5.a aVarB = b(d(mapF), kVar);
            this.f54360c.b("Requesting settings from " + this.f54358a);
            this.f54360c.i("Settings query params were: " + mapF);
            return g(aVarB.c());
        } catch (java.io.IOException e6) {
            this.f54360c.e("Settings request failed.", e6);
            return null;
        }
    }

    protected p156p5.a d(java.util.Map map) {
        return this.f54359b.a(this.f54358a, map).d("User-Agent", "Crashlytics Android SDK/" + p106k5.C6911w.k()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    org.json.JSONObject g(p156p5.c cVar) {
        int iB = cVar.b();
        this.f54360c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(cVar.a());
        }
        this.f54360c.d("Settings request failed; (status: " + iB + ") from " + this.f54358a);
        return null;
    }

    boolean h(int i6) {
        return i6 == 200 || i6 == 201 || i6 == 202 || i6 == 203;
    }
}
