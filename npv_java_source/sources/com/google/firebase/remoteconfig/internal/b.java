package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f44088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.net.HttpURLConnection f44089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.m f44090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f44091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final N5.c f44092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f44093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.Random f44094g = new java.util.Random();

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f44095C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f44096D;

        a(int i6, long j6) {
            this.f44095C = i6;
            this.f44096D = j6;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.firebase.remoteconfig.internal.b.this.d(this.f44095C, this.f44096D);
        }
    }

    public b(java.net.HttpURLConnection httpURLConnection, com.google.firebase.remoteconfig.internal.m mVar, com.google.firebase.remoteconfig.internal.f fVar, java.util.Set set, N5.c cVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f44089b = httpURLConnection;
        this.f44090c = mVar;
        this.f44091d = fVar;
        this.f44088a = set;
        this.f44092e = cVar;
        this.f44093f = scheduledExecutorService;
    }

    private void b(int i6, long j6) {
        if (i6 == 0) {
            k(new N5.m("Unable to fetch the latest version of the template.", N5.k.a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f44093f.schedule(new com.google.firebase.remoteconfig.internal.b.a(i6, j6), this.f44094g.nextInt(4), java.util.concurrent.TimeUnit.SECONDS);
        }
    }

    private synchronized void c(N5.b bVar) {
        java.util.Iterator it = this.f44088a.iterator();
        while (it.hasNext()) {
            ((N5.c) it.next()).a(bVar);
        }
    }

    private static java.lang.Boolean e(com.google.firebase.remoteconfig.internal.m.a aVar, long j6) {
        if (aVar.d() != null) {
            return java.lang.Boolean.valueOf(aVar.d().k() >= j6);
        }
        return java.lang.Boolean.valueOf(aVar.f() == 1);
    }

    private void f(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, "utf-8"));
        loop0: while (true) {
            java.lang.String strJ = "";
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                strJ = strJ + line;
                if (line.contains("}")) {
                    strJ = j(strJ);
                    if (strJ.isEmpty()) {
                    }
                }
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(strJ);
                if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                    this.f44092e.b(new N5.m("The server is temporarily unavailable. Try again in a few minutes.", N5.k.a.CONFIG_UPDATE_UNAVAILABLE));
                    break;
                } else {
                    if (g()) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long jR = this.f44090c.r();
                        long j6 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j6 > jR) {
                            b(3, j6);
                        }
                    }
                }
            } catch (org.json.JSONException e6) {
                k(new N5.j("Unable to parse config update message.", e6.getCause(), N5.k.a.CONFIG_UPDATE_MESSAGE_INVALID));
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    private synchronized boolean g() {
        return this.f44088a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p115l4.AbstractC6931l h(p115l4.AbstractC6931l abstractC6931l, p115l4.AbstractC6931l abstractC6931l2, long j6, int i6, p115l4.AbstractC6931l abstractC6931l3) throws org.json.JSONException {
        if (!abstractC6931l.o()) {
            return p115l4.AbstractC6934o.d(new N5.j("Failed to auto-fetch config update.", abstractC6931l.k()));
        }
        if (!abstractC6931l2.o()) {
            return p115l4.AbstractC6934o.d(new N5.j("Failed to get activated config for auto-fetch", abstractC6931l2.k()));
        }
        com.google.firebase.remoteconfig.internal.m.a aVar = (com.google.firebase.remoteconfig.internal.m.a) abstractC6931l.l();
        com.google.firebase.remoteconfig.internal.g gVarA = (com.google.firebase.remoteconfig.internal.g) abstractC6931l2.l();
        if (!e(aVar, j6).booleanValue()) {
            b(i6, j6);
            return p115l4.AbstractC6934o.e(null);
        }
        if (aVar.d() == null) {
            return p115l4.AbstractC6934o.e(null);
        }
        if (gVarA == null) {
            gVarA = com.google.firebase.remoteconfig.internal.g.l().a();
        }
        java.util.Set setF = gVarA.f(aVar.d());
        if (setF.isEmpty()) {
            return p115l4.AbstractC6934o.e(null);
        }
        c(N5.b.a(setF));
        return p115l4.AbstractC6934o.e(null);
    }

    private java.lang.String j(java.lang.String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    private synchronized void k(N5.k kVar) {
        java.util.Iterator it = this.f44088a.iterator();
        while (it.hasNext()) {
            ((N5.c) it.next()).b(kVar);
        }
    }

    public synchronized p115l4.AbstractC6931l d(int i6, final long j6) {
        final int i10;
        final p115l4.AbstractC6931l abstractC6931lN;
        final p115l4.AbstractC6931l abstractC6931lE;
        i10 = i6 - 1;
        abstractC6931lN = this.f44090c.n(com.google.firebase.remoteconfig.internal.m.b.REALTIME, 3 - i10);
        abstractC6931lE = this.f44091d.e();
        return p115l4.AbstractC6934o.j(abstractC6931lN, abstractC6931lE).i(this.f44093f, new p115l4.InterfaceC6922c() { // from class: com.google.firebase.remoteconfig.internal.a
            @Override // p115l4.InterfaceC6922c
            public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
                return this.f44083a.h(abstractC6931lN, abstractC6931lE, j6, i10, abstractC6931l);
            }
        });
    }

    public void i() {
        java.net.HttpURLConnection httpURLConnection = this.f44089b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            f(inputStream);
            inputStream.close();
        } catch (java.io.IOException e6) {
        } finally {
            this.f44089b.disconnect();
        }
    }
}
