package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes3.dex */
public class t {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int[] f44191q = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final java.util.regex.Pattern f44192r = java.util.regex.Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f44193a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44195c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f44199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.m f44200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q4.f f44201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final G5.e f44202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    com.google.firebase.remoteconfig.internal.f f44203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final android.content.Context f44204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.lang.String f44205m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.p f44208p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f44198f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44194b = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final java.util.Random f44206n = new java.util.Random();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final V3.f f44207o = V3.i.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44196d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f44197e = false;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.firebase.remoteconfig.internal.t.this.e();
        }
    }

    class b implements N5.c {
        b() {
        }

        @Override // N5.c
        public void a(N5.b bVar) {
        }

        @Override // N5.c
        public void b(N5.k kVar) {
            com.google.firebase.remoteconfig.internal.t.this.j();
            com.google.firebase.remoteconfig.internal.t.this.u(kVar);
        }
    }

    public t(Q4.f fVar, G5.e eVar, com.google.firebase.remoteconfig.internal.m mVar, com.google.firebase.remoteconfig.internal.f fVar2, android.content.Context context, java.lang.String str, java.util.Set set, com.google.firebase.remoteconfig.internal.p pVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f44193a = set;
        this.f44199g = scheduledExecutorService;
        this.f44195c = java.lang.Math.max(8 - pVar.g().b(), 1);
        this.f44201i = fVar;
        this.f44200h = mVar;
        this.f44202j = eVar;
        this.f44203k = fVar2;
        this.f44204l = context;
        this.f44205m = str;
        this.f44208p = pVar;
    }

    private void D(java.util.Date date) {
        int iB = this.f44208p.g().b() + 1;
        this.f44208p.n(iB, new java.util.Date(date.getTime() + m(iB)));
    }

    private synchronized boolean f() {
        return (this.f44193a.isEmpty() || this.f44194b || this.f44196d || this.f44197e) ? false : true;
    }

    private org.json.JSONObject i(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("project", k(this.f44201i.n().c()));
        map.put("namespace", this.f44205m);
        map.put("lastKnownVersionNumber", java.lang.Long.toString(this.f44200h.r()));
        map.put("appId", this.f44201i.n().c());
        map.put("sdkVersion", "22.0.1");
        map.put("appInstanceId", str);
        return new org.json.JSONObject(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        this.f44196d = true;
    }

    private static java.lang.String k(java.lang.String str) {
        java.util.regex.Matcher matcher = f44192r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private java.lang.String l() {
        try {
            android.content.Context context = this.f44204l;
            byte[] bArrA = V3.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return V3.k.b(bArrA, false);
            }
            java.lang.String str = "Could not get fingerprint hash for package: " + this.f44204l.getPackageName();
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            java.lang.String str2 = "No such package: " + this.f44204l.getPackageName();
            return null;
        }
    }

    private long m(int i6) {
        int[] iArr = f44191q;
        int length = iArr.length;
        if (i6 >= length) {
            i6 = length;
        }
        long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(iArr[i6 - 1]);
        return (millis / 2) + ((long) this.f44206n.nextInt((int) millis));
    }

    private java.lang.String n(java.lang.String str) {
        return java.lang.String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", k(this.f44201i.n().c()), str);
    }

    private java.net.URL o() {
        try {
            return new java.net.URL(n(this.f44205m));
        } catch (java.net.MalformedURLException unused) {
            return null;
        }
    }

    private boolean p(int i6) {
        return i6 == 408 || i6 == 429 || i6 == 502 || i6 == 503 || i6 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    public /* synthetic */ p115l4.AbstractC6931l q(p115l4.AbstractC6931l abstractC6931l, p115l4.AbstractC6931l abstractC6931l2) throws java.lang.Throwable {
        java.lang.Integer numValueOf;
        java.lang.Throwable th;
        java.net.HttpURLConnection httpURLConnection;
        N5.m mVar;
        try {
            if (!abstractC6931l.o()) {
                throw new java.io.IOException(abstractC6931l.k());
            }
            y(true);
            httpURLConnection = (java.net.HttpURLConnection) abstractC6931l.l();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                numValueOf = java.lang.Integer.valueOf(responseCode);
                if (responseCode == 200) {
                    try {
                        v();
                        this.f44208p.i();
                        B(httpURLConnection).i();
                    } catch (java.io.IOException e6) {
                        g(httpURLConnection);
                        y(false);
                        boolean z6 = numValueOf == null || p(numValueOf.intValue());
                        if (z6) {
                            D(new java.util.Date(this.f44207o.a()));
                        }
                        if (z6 || numValueOf.intValue() == 200) {
                            w();
                        } else {
                            java.lang.String strT = java.lang.String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                            if (numValueOf.intValue() == 403) {
                                strT = t(httpURLConnection.getErrorStream());
                            }
                            mVar = new N5.m(numValueOf.intValue(), strT, N5.k.a.CONFIG_UPDATE_STREAM_ERROR);
                        }
                        return p115l4.AbstractC6934o.e(null);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        g(httpURLConnection);
                        y(false);
                        boolean z10 = numValueOf == null || p(numValueOf.intValue());
                        if (z10) {
                            D(new java.util.Date(this.f44207o.a()));
                        }
                        if (z10 || numValueOf.intValue() == 200) {
                            w();
                        } else {
                            java.lang.String strT2 = java.lang.String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                            if (numValueOf.intValue() == 403) {
                                strT2 = t(httpURLConnection.getErrorStream());
                            }
                            u(new N5.m(numValueOf.intValue(), strT2, N5.k.a.CONFIG_UPDATE_STREAM_ERROR));
                        }
                        throw th;
                    }
                }
                g(httpURLConnection);
                y(false);
                boolean zP = p(responseCode);
                if (zP) {
                    D(new java.util.Date(this.f44207o.a()));
                }
                if (zP || responseCode == 200) {
                    w();
                } else {
                    java.lang.String strT3 = java.lang.String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                    if (responseCode == 403) {
                        strT3 = t(httpURLConnection.getErrorStream());
                    }
                    mVar = new N5.m(responseCode, strT3, N5.k.a.CONFIG_UPDATE_STREAM_ERROR);
                    u(mVar);
                }
            } catch (java.io.IOException e10) {
                numValueOf = null;
            } catch (java.lang.Throwable th3) {
                numValueOf = null;
                th = th3;
            }
            return p115l4.AbstractC6934o.e(null);
        } catch (java.io.IOException e11) {
            httpURLConnection = null;
            numValueOf = null;
        } catch (java.lang.Throwable th4) {
            numValueOf = null;
            th = th4;
            httpURLConnection = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p115l4.AbstractC6931l r(p115l4.AbstractC6931l abstractC6931l, p115l4.AbstractC6931l abstractC6931l2, p115l4.AbstractC6931l abstractC6931l3) {
        if (!abstractC6931l.o()) {
            return p115l4.AbstractC6934o.d(new N5.j("Firebase Installations failed to get installation auth token for config update listener connection.", abstractC6931l.k()));
        }
        if (!abstractC6931l2.o()) {
            return p115l4.AbstractC6934o.d(new N5.j("Firebase Installations failed to get installation ID for config update listener connection.", abstractC6931l2.k()));
        }
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) o().openConnection();
            A(httpURLConnection, (java.lang.String) abstractC6931l2.l(), ((com.google.firebase.installations.g) abstractC6931l.l()).b());
            return p115l4.AbstractC6934o.e(httpURLConnection);
        } catch (java.io.IOException e6) {
            return p115l4.AbstractC6934o.d(new N5.j("Failed to open HTTP stream connection", e6));
        }
    }

    private synchronized void s(long j6) {
        try {
            if (f()) {
                int i6 = this.f44195c;
                if (i6 > 0) {
                    this.f44195c = i6 - 1;
                    this.f44199g.schedule(new com.google.firebase.remoteconfig.internal.t.a(), j6, java.util.concurrent.TimeUnit.MILLISECONDS);
                } else if (!this.f44197e) {
                    u(new N5.j("Unable to connect to the server. Check your connection and try again.", N5.k.a.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private java.lang.String t(java.io.InputStream inputStream) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (java.io.IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u(N5.k kVar) {
        java.util.Iterator it = this.f44193a.iterator();
        while (it.hasNext()) {
            ((N5.c) it.next()).b(kVar);
        }
    }

    private synchronized void v() {
        this.f44195c = 8;
    }

    private void x(java.net.HttpURLConnection httpURLConnection, java.lang.String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f44201i.n().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f44204l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private synchronized void y(boolean z6) {
        this.f44194b = z6;
    }

    public void A(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        httpURLConnection.setRequestMethod("POST");
        x(httpURLConnection, str2);
        byte[] bytes = i(str).toString().getBytes("utf-8");
        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public synchronized com.google.firebase.remoteconfig.internal.b B(java.net.HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.b(httpURLConnection, this.f44200h, this.f44203k, this.f44193a, new com.google.firebase.remoteconfig.internal.t.b(), this.f44199g);
    }

    public void C() {
        s(0L);
    }

    public void e() {
        if (f()) {
            if (new java.util.Date(this.f44207o.a()).before(this.f44208p.g().a())) {
                w();
            } else {
                final p115l4.AbstractC6931l abstractC6931lH = h();
                p115l4.AbstractC6934o.j(abstractC6931lH).h(this.f44199g, new p115l4.InterfaceC6922c() { // from class: com.google.firebase.remoteconfig.internal.r
                    @Override // p115l4.InterfaceC6922c
                    public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
                        return this.f44186a.q(abstractC6931lH, abstractC6931l);
                    }
                });
            }
        }
    }

    public void g(java.net.HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (java.io.IOException unused) {
            }
        }
    }

    public p115l4.AbstractC6931l h() {
        final p115l4.AbstractC6931l abstractC6931lB = this.f44202j.b(false);
        final p115l4.AbstractC6931l abstractC6931lA = this.f44202j.a();
        return p115l4.AbstractC6934o.j(abstractC6931lB, abstractC6931lA).i(this.f44199g, new p115l4.InterfaceC6922c() { // from class: com.google.firebase.remoteconfig.internal.s
            @Override // p115l4.InterfaceC6922c
            public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
                return this.f44188a.r(abstractC6931lB, abstractC6931lA, abstractC6931l);
            }
        });
    }

    public synchronized void w() {
        s(java.lang.Math.max(0L, this.f44208p.g().a().getTime() - new java.util.Date(this.f44207o.a()).getTime()));
    }

    void z(boolean z6) {
        this.f44197e = z6;
    }
}
