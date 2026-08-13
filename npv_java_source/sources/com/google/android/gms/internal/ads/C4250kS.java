package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4250kS implements com.google.android.gms.internal.ads.Y80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final android.content.Context f36968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final java.lang.String f36969b;

    public C4250kS(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.C3020Xo c3020Xo, int i6) {
        this.f36968a = context;
        this.f36969b = str;
    }

    @Override // com.google.android.gms.internal.ads.Y80
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.C4140jS b(com.google.android.gms.internal.ads.C4032iS c4032iS) {
        return c(c4032iS.f36286a, c4032iS.f36287b, c4032iS.f36288c, c4032iS.f36289d, c4032iS.f36290e, p174r3.v.c().c());
    }

    protected final com.google.android.gms.internal.ads.C4140jS c(java.lang.String str, int i6, java.util.Map map, byte[] bArr, java.lang.String str2, long j6) throws java.net.MalformedURLException, com.google.android.gms.internal.ads.C4688oQ {
        java.net.HttpURLConnection httpURLConnection;
        java.net.URL url;
        java.io.InputStreamReader inputStreamReader;
        try {
            com.google.android.gms.internal.ads.C4140jS c4140jS = new com.google.android.gms.internal.ads.C4140jS();
            p224w3.p.f("SDK version: " + this.f36969b);
            p224w3.p.b("AdRequestServiceImpl: Sending request: " + str);
            java.net.URL url2 = new java.net.URL(str);
            java.util.HashMap map2 = new java.util.HashMap();
            int i10 = 0;
            while (true) {
                httpURLConnection = (java.net.HttpURLConnection) url2.openConnection();
                try {
                    try {
                        p174r3.v.t().K(this.f36968a, this.f36969b, false, httpURLConnection, false, i6);
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                        }
                        if (!android.text.TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        java.io.BufferedOutputStream bufferedOutputStream = null;
                        p224w3.m mVar = new p224w3.m(null);
                        try {
                            mVar.c(httpURLConnection, bArr);
                        } catch (java.lang.Throwable th) {
                            p224w3.p.e("Network request logging failed.", th);
                            p174r3.v.s().w(th, "HttpRequestFunction.logAdRequest");
                        }
                        int length = bArr.length;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                java.io.BufferedOutputStream bufferedOutputStream2 = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    V3.l.a(bufferedOutputStream2);
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    V3.l.a(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            java.lang.String key = entry2.getKey();
                            java.util.List<java.lang.String> value = entry2.getValue();
                            if (map2.containsKey(key)) {
                                ((java.util.List) map2.get(key)).addAll(value);
                            } else {
                                map2.put(key, new java.util.ArrayList(value));
                            }
                        }
                        mVar.e(httpURLConnection, responseCode);
                        c4140jS.f36675a = responseCode;
                        c4140jS.f36676b = map2;
                        c4140jS.f36677c = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                java.io.InputStreamReader inputStreamReader2 = new java.io.InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    p174r3.v.t();
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder(8192);
                                    char[] cArr = new char[2048];
                                    while (true) {
                                        int i11 = inputStreamReader2.read(cArr);
                                        if (i11 == -1) {
                                            break;
                                        }
                                        sb.append(cArr, 0, i11);
                                    }
                                    java.lang.String string = sb.toString();
                                    V3.l.a(inputStreamReader2);
                                    mVar.g(string);
                                    c4140jS.f36677c = string;
                                    if (android.text.TextUtils.isEmpty(string)) {
                                        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25717v5)).booleanValue()) {
                                            throw new com.google.android.gms.internal.ads.C4688oQ(3);
                                        }
                                    }
                                    c4140jS.f36678d = p174r3.v.c().c() - j6;
                                    break;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    inputStreamReader = inputStreamReader2;
                                    V3.l.a(inputStreamReader);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                inputStreamReader = null;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                p224w3.p.g("Received error HTTP response code: " + responseCode);
                                throw new com.google.android.gms.internal.ads.C4688oQ(1, "Received error HTTP response code: " + responseCode);
                            }
                            java.lang.String headerField = httpURLConnection.getHeaderField("Location");
                            if (android.text.TextUtils.isEmpty(headerField)) {
                                p224w3.p.g("No location header to follow redirect.");
                                throw new com.google.android.gms.internal.ads.C4688oQ(1, "No location header to follow redirect");
                            }
                            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25291H7)).booleanValue()) {
                                try {
                                    url = new java.net.URI(headerField).toURL();
                                } catch (java.net.URISyntaxException e6) {
                                    throw new com.google.android.gms.internal.ads.C4688oQ(1, e6.getMessage(), e6);
                                }
                            } else {
                                url = new java.net.URL(headerField);
                            }
                            i10++;
                            if (i10 > ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25508b5)).intValue()) {
                                p224w3.p.g("Too many redirects.");
                                throw new com.google.android.gms.internal.ads.C4688oQ(1, "Too many redirects");
                            }
                            httpURLConnection.disconnect();
                            url2 = url;
                        }
                    } catch (com.google.android.gms.internal.ads.C4688oQ e10) {
                        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25587i8)).booleanValue()) {
                            throw e10;
                        }
                        c4140jS.f36678d = p174r3.v.c().c() - j6;
                    }
                } catch (java.lang.Throwable th6) {
                    httpURLConnection.disconnect();
                    throw th6;
                }
            }
            httpURLConnection.disconnect();
            return c4140jS;
        } catch (java.io.IOException e11) {
            java.lang.String strConcat = "Error while connecting to ad server: ".concat(java.lang.String.valueOf(e11.getMessage()));
            p224w3.p.g(strConcat);
            throw new com.google.android.gms.internal.ads.C4688oQ(1, strConcat, e11);
        }
    }
}
