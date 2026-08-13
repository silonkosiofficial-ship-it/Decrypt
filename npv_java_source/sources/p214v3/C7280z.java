package p214v3;

/* JADX INFO: renamed from: v3.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7280z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f55992a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f55993b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f55994c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f55995d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55996e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected java.lang.String f55997f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.KP f55998g;

    protected static final java.lang.String o(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String strValueOf;
        java.lang.String str3;
        java.util.HashMap map = new java.util.HashMap();
        map.put("User-Agent", p174r3.v.t().H(context, str2));
        P4.d dVarB = new p214v3.Q(context).b(0, str, map, null);
        try {
            return (java.lang.String) dVarB.get(((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25365O4)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e6) {
            e = e6;
            strValueOf = java.lang.String.valueOf(str);
            str3 = "Interrupted while retrieving a response from: ";
            p224w3.p.e(str3.concat(strValueOf), e);
            dVarB.cancel(true);
            return null;
        } catch (java.util.concurrent.TimeoutException e10) {
            e = e10;
            strValueOf = java.lang.String.valueOf(str);
            str3 = "Timeout while retrieving a response from: ";
            p224w3.p.e(str3.concat(strValueOf), e);
            dVarB.cancel(true);
            return null;
        } catch (java.lang.Exception e11) {
            p224w3.p.e("Error retrieving a response from: ".concat(java.lang.String.valueOf(str)), e11);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[Catch: all -> 0x0029, TryCatch #1 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:12:0x0032, B:14:0x003a, B:16:0x004f, B:19:0x0061, B:11:0x002b, B:20:0x0066, B:21:0x0068), top: B:28:0x000b, inners: #0, #2 }] */
    private final android.net.Uri p(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.String str5;
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(str).buildUpon();
        synchronized (this.f55992a) {
            if (android.text.TextUtils.isEmpty(this.f55993b)) {
                p174r3.v.t();
                try {
                    str5 = new java.lang.String(V3.l.d(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (java.io.IOException unused) {
                    p224w3.p.b("Error reading from internal storage.");
                    str5 = "";
                }
                this.f55993b = str5;
                if (android.text.TextUtils.isEmpty(str5)) {
                    p174r3.v.t();
                    this.f55993b = java.util.UUID.randomUUID().toString();
                    p174r3.v.t();
                    java.lang.String str6 = this.f55993b;
                    try {
                        java.io.FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(str6.getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (java.lang.Exception e6) {
                        p224w3.p.e("Error writing to file in internal storage.", e6);
                    }
                    str4 = this.f55993b;
                } else {
                    str4 = this.f55993b;
                }
            } else {
                str4 = this.f55993b;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    public final com.google.android.gms.internal.ads.KP a() {
        return this.f55998g;
    }

    public final java.lang.String b() {
        java.lang.String str;
        synchronized (this.f55992a) {
            str = this.f55994c;
        }
        return str;
    }

    public final void c(android.content.Context context) {
        com.google.android.gms.internal.ads.KP kp;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25533d9)).booleanValue() || (kp = this.f55998g) == null) {
            return;
        }
        kp.i(new p214v3.BinderC7275w(this, context), com.google.android.gms.internal.ads.JP.DEBUG_MENU);
    }

    public final void d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        p174r3.v.t();
        p214v3.E0.u(context, p(context, (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25321K4), str, str2));
    }

    public final void e(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.net.Uri.Builder builderBuildUpon = p(context, (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25354N4), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        p174r3.v.t();
        p214v3.E0.m(context, str, builderBuildUpon.build().toString());
    }

    public final void f(boolean z6) {
        synchronized (this.f55992a) {
            try {
                this.f55996e = z6;
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25533d9)).booleanValue()) {
                    p174r3.v.s().j().G0(z6);
                    com.google.android.gms.internal.ads.KP kp = this.f55998g;
                    if (kp != null) {
                        kp.m(z6);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void g(com.google.android.gms.internal.ads.KP kp) {
        this.f55998g = kp;
    }

    public final void h(boolean z6) {
        synchronized (this.f55992a) {
            this.f55995d = z6;
        }
    }

    protected final void i(android.content.Context context, java.lang.String str, boolean z6, boolean z10) {
        if (context instanceof android.app.Activity) {
            p214v3.E0.f55826l.post(new p214v3.RunnableC7279y(this, context, str, z6, z10));
        } else {
            p224w3.p.f("Can not create dialog without Activity Context");
        }
    }

    public final boolean j(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String strO = o(context, p(context, (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25343M4), str, str2).toString(), str2);
        if (android.text.TextUtils.isEmpty(strO)) {
            p224w3.p.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new org.json.JSONObject(strO.trim()).optString("debug_mode"));
            f(zEquals);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25533d9)).booleanValue()) {
                p214v3.InterfaceC7268s0 interfaceC7268s0J = p174r3.v.s().j();
                if (true != zEquals) {
                    str = "";
                }
                interfaceC7268s0J.x(str);
            }
            return zEquals;
        } catch (org.json.JSONException e6) {
            p224w3.p.h("Fail to get debug mode response json.", e6);
            return false;
        }
    }

    final boolean k(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String strO = o(context, p(context, (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25332L4), str, str2).toString(), str2);
        if (android.text.TextUtils.isEmpty(strO)) {
            p224w3.p.b("Not linked for in app preview.");
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(strO.trim());
            java.lang.String strOptString = jSONObject.optString("gct");
            this.f55997f = jSONObject.optString("status");
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25533d9)).booleanValue()) {
                boolean z6 = "0".equals(this.f55997f) || "2".equals(this.f55997f);
                f(z6);
                p214v3.InterfaceC7268s0 interfaceC7268s0J = p174r3.v.s().j();
                if (!z6) {
                    str = "";
                }
                interfaceC7268s0J.x(str);
            }
            synchronized (this.f55992a) {
                this.f55994c = strOptString;
            }
            return true;
        } catch (org.json.JSONException e6) {
            p224w3.p.h("Fail to get in app preview response json.", e6);
            return false;
        }
    }

    public final boolean l() {
        boolean z6;
        synchronized (this.f55992a) {
            z6 = this.f55996e;
        }
        return z6;
    }

    public final boolean m() {
        boolean z6;
        synchronized (this.f55992a) {
            z6 = this.f55995d;
        }
        return z6;
    }

    public final boolean n(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str2) || !m()) {
            return false;
        }
        p224w3.p.b("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }
}
