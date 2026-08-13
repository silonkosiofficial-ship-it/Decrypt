package com.google.android.datatransport.cct;

/* JADX INFO: loaded from: classes.dex */
final class d implements Z2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z5.a f24691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.net.ConnectivityManager f24692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f24693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final java.net.URL f24694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p084i3.a f24695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p084i3.a f24696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f24697g;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.net.URL f24698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final X2.n f24699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final java.lang.String f24700c;

        a(java.net.URL url, X2.n nVar, java.lang.String str) {
            this.f24698a = url;
            this.f24699b = nVar;
            this.f24700c = str;
        }

        com.google.android.datatransport.cct.d.a a(java.net.URL url) {
            return new com.google.android.datatransport.cct.d.a(url, this.f24699b, this.f24700c);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f24701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.net.URL f24702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f24703c;

        b(int i6, java.net.URL url, long j6) {
            this.f24701a = i6;
            this.f24702b = url;
            this.f24703c = j6;
        }
    }

    d(android.content.Context context, p084i3.a aVar, p084i3.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }

    d(android.content.Context context, p084i3.a aVar, p084i3.a aVar2, int i6) {
        this.f24691a = X2.n.b();
        this.f24693c = context;
        this.f24692b = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        this.f24694d = o(com.google.android.datatransport.cct.a.f24682c);
        this.f24695e = aVar2;
        this.f24696f = aVar;
        this.f24697g = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.datatransport.cct.d.b e(com.google.android.datatransport.cct.d.a aVar) throws java.io.IOException {
        p024c3.a.f("CctTransportBackend", "Making request to: %s", aVar.f24698a);
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) aVar.f24698a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f24697g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", java.lang.String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        java.lang.String str = aVar.f24700c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(outputStream);
                try {
                    this.f24691a.a(aVar.f24699b, new java.io.BufferedWriter(new java.io.OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    p024c3.a.f("CctTransportBackend", "Status Code: %d", java.lang.Integer.valueOf(responseCode));
                    p024c3.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    p024c3.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new com.google.android.datatransport.cct.d.b(responseCode, new java.net.URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new com.google.android.datatransport.cct.d.b(responseCode, null, 0L);
                    }
                    java.io.InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        java.io.InputStream inputStreamN = n(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            com.google.android.datatransport.cct.d.b bVar = new com.google.android.datatransport.cct.d.b(responseCode, null, X2.v.b(new java.io.BufferedReader(new java.io.InputStreamReader(inputStreamN))).c());
                            if (inputStreamN != null) {
                                inputStreamN.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (java.lang.Throwable th) {
                            if (inputStreamN != null) {
                                try {
                                    inputStreamN.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (java.lang.Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (java.lang.Throwable th7) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.lang.Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        } catch (java.net.ConnectException e6) {
            e = e6;
            p024c3.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new com.google.android.datatransport.cct.d.b(500, null, 0L);
        } catch (java.net.UnknownHostException e10) {
            e = e10;
            p024c3.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new com.google.android.datatransport.cct.d.b(500, null, 0L);
        } catch (java.io.IOException e11) {
            e = e11;
            p024c3.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new com.google.android.datatransport.cct.d.b(400, null, 0L);
        } catch (z5.b e12) {
            e = e12;
            p024c3.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new com.google.android.datatransport.cct.d.b(400, null, 0L);
        }
    }

    private static java.lang.String f(android.content.Context context) {
        java.lang.String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int g(android.net.NetworkInfo networkInfo) {
        X2.w.b bVar;
        if (networkInfo == null) {
            bVar = X2.w.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (X2.w.b.e(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            bVar = X2.w.b.COMBINED;
        }
        return bVar.g();
    }

    private static int h(android.net.NetworkInfo networkInfo) {
        return networkInfo == null ? X2.w.c.NONE.g() : networkInfo.getType();
    }

    private static int i(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            p024c3.a.d("CctTransportBackend", "Unable to find version code for package", e6);
            return -1;
        }
    }

    private X2.n j(Z2.f fVar) {
        X2.t.a aVarL;
        java.util.HashMap map = new java.util.HashMap();
        for (Y2.i iVar : fVar.b()) {
            java.lang.String strN = iVar.n();
            if (map.containsKey(strN)) {
                ((java.util.List) map.get(strN)).add(iVar);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(iVar);
                map.put(strN, arrayList);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            Y2.i iVar2 = (Y2.i) ((java.util.List) entry.getValue()).get(0);
            X2.u.a aVarB = X2.u.a().f(X2.x.DEFAULT).g(this.f24696f.a()).h(this.f24695e.a()).b(X2.o.a().c(X2.o.b.ANDROID_FIREBASE).b(X2.a.a().m(java.lang.Integer.valueOf(iVar2.i("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(java.lang.Integer.parseInt((java.lang.String) entry.getKey()));
            } catch (java.lang.NumberFormatException unused) {
                aVarB.j((java.lang.String) entry.getKey());
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (Y2.i iVar3 : (java.util.List) entry.getValue()) {
                Y2.h hVarE = iVar3.e();
                W2.b bVarB = hVarE.b();
                if (bVarB.equals(W2.b.b("proto"))) {
                    aVarL = X2.t.l(hVarE.a());
                } else if (bVarB.equals(W2.b.b("json"))) {
                    aVarL = X2.t.k(new java.lang.String(hVarE.a(), java.nio.charset.Charset.forName("UTF-8")));
                } else {
                    p024c3.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", bVarB);
                }
                aVarL.d(iVar3.f()).e(iVar3.o()).j(iVar3.j("tz-offset")).g(X2.w.a().c(X2.w.c.e(iVar3.i("net-type"))).b(X2.w.b.e(iVar3.i("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarL.c(iVar3.d());
                }
                if (iVar3.l() != null) {
                    aVarL.b(X2.p.a().b(X2.s.a().b(X2.r.a().b(iVar3.l()).a()).a()).c(X2.p.b.EVENT_OVERRIDE).a());
                }
                if (iVar3.g() != null || iVar3.h() != null) {
                    X2.q.a aVarA = X2.q.a();
                    if (iVar3.g() != null) {
                        aVarA.b(iVar3.g());
                    }
                    if (iVar3.h() != null) {
                        aVarA.c(iVar3.h());
                    }
                    aVarL.f(aVarA.a());
                }
                arrayList3.add(aVarL.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return X2.n.a(arrayList2);
    }

    private static android.telephony.TelephonyManager k(android.content.Context context) {
        return (android.telephony.TelephonyManager) context.getSystemService("phone");
    }

    static long l() {
        java.util.Calendar.getInstance();
        return java.util.TimeZone.getDefault().getOffset(java.util.Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.datatransport.cct.d.a m(com.google.android.datatransport.cct.d.a aVar, com.google.android.datatransport.cct.d.b bVar) {
        java.net.URL url = bVar.f24702b;
        if (url == null) {
            return null;
        }
        p024c3.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f24702b);
    }

    private static java.io.InputStream n(java.io.InputStream inputStream, java.lang.String str) {
        return "gzip".equals(str) ? new java.util.zip.GZIPInputStream(inputStream) : inputStream;
    }

    private static java.net.URL o(java.lang.String str) {
        try {
            return new java.net.URL(str);
        } catch (java.net.MalformedURLException e6) {
            throw new java.lang.IllegalArgumentException("Invalid url: " + str, e6);
        }
    }

    @Override // Z2.m
    public Y2.i a(Y2.i iVar) {
        android.net.NetworkInfo activeNetworkInfo = this.f24692b.getActiveNetworkInfo();
        return iVar.p().a("sdk-version", android.os.Build.VERSION.SDK_INT).c("model", android.os.Build.MODEL).c("hardware", android.os.Build.HARDWARE).c("device", android.os.Build.DEVICE).c("product", android.os.Build.PRODUCT).c("os-uild", android.os.Build.ID).c("manufacturer", android.os.Build.MANUFACTURER).c("fingerprint", android.os.Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c("country", java.util.Locale.getDefault().getCountry()).c("locale", java.util.Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f24693c)).c("application_build", java.lang.Integer.toString(i(this.f24693c))).d();
    }

    @Override // Z2.m
    public Z2.g b(Z2.f fVar) {
        X2.n nVarJ = j(fVar);
        java.net.URL urlO = this.f24694d;
        java.lang.String strD = null;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlO = o(aVarC.e());
                }
            } catch (java.lang.IllegalArgumentException unused) {
                return Z2.g.a();
            }
        }
        try {
            com.google.android.datatransport.cct.d.b bVar = (com.google.android.datatransport.cct.d.b) p034d3.b.a(5, new com.google.android.datatransport.cct.d.a(urlO, nVarJ, strD), new p034d3.a() { // from class: com.google.android.datatransport.cct.b
                @Override // p034d3.a
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f24690a.e((com.google.android.datatransport.cct.d.a) obj);
                }
            }, new p034d3.c() { // from class: com.google.android.datatransport.cct.c
                @Override // p034d3.c
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    return com.google.android.datatransport.cct.d.m((com.google.android.datatransport.cct.d.a) obj, (com.google.android.datatransport.cct.d.b) obj2);
                }
            });
            int i6 = bVar.f24701a;
            if (i6 == 200) {
                return Z2.g.e(bVar.f24703c);
            }
            if (i6 < 500 && i6 != 404) {
                return i6 == 400 ? Z2.g.d() : Z2.g.a();
            }
            return Z2.g.f();
        } catch (java.io.IOException e6) {
            p024c3.a.d("CctTransportBackend", "Could not make request to the backend", e6);
            return Z2.g.f();
        }
    }
}
