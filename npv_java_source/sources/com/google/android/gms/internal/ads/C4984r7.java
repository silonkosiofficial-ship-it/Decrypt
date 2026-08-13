package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4984r7 implements com.google.android.gms.internal.ads.W6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4875q7 f38436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.C5204t7 f38437b;

    public C4984r7(com.google.android.gms.internal.ads.AbstractC4875q7 abstractC4875q7) {
        com.google.android.gms.internal.ads.C5204t7 c5204t7 = new com.google.android.gms.internal.ads.C5204t7(4096);
        this.f38436a = abstractC4875q7;
        this.f38437b = c5204t7;
    }

    @Override // com.google.android.gms.internal.ads.W6
    public com.google.android.gms.internal.ads.Z6 a(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7) throws java.lang.Throwable {
        com.google.android.gms.internal.ads.A7 a7A;
        byte[] bArr;
        com.google.android.gms.internal.ads.E7 e10;
        java.util.Map mapEmptyMap;
        byte[] byteArray;
        byte[] bArrB;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        while (true) {
            java.util.Collections.emptyList();
            try {
                com.google.android.gms.internal.ads.M6 m6I = abstractC3448d7.i();
                if (m6I == null) {
                    mapEmptyMap = java.util.Collections.emptyMap();
                } else {
                    java.util.HashMap map = new java.util.HashMap();
                    java.lang.String str = m6I.f29657b;
                    if (str != null) {
                        map.put("If-None-Match", str);
                    }
                    long j6 = m6I.f29659d;
                    if (j6 > 0) {
                        map.put("If-Modified-Since", com.google.android.gms.internal.ads.AbstractC5864z7.c(j6));
                    }
                    mapEmptyMap = map;
                }
                a7A = this.f38436a.a(abstractC3448d7, mapEmptyMap);
                try {
                    int iB = a7A.b();
                    java.util.List listD = a7A.d();
                    if (iB == 304) {
                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
                        com.google.android.gms.internal.ads.M6 m6I2 = abstractC3448d7.i();
                        if (m6I2 == null) {
                            return new com.google.android.gms.internal.ads.Z6(304, (byte[]) null, true, jElapsedRealtime2, listD);
                        }
                        java.util.TreeSet treeSet = new java.util.TreeSet(java.lang.String.CASE_INSENSITIVE_ORDER);
                        if (!listD.isEmpty()) {
                            java.util.Iterator it = listD.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((com.google.android.gms.internal.ads.V6) it.next()).a());
                            }
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList(listD);
                        java.util.List list = m6I2.f29663h;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (com.google.android.gms.internal.ads.V6 v6 : m6I2.f29663h) {
                                    if (!treeSet.contains(v6.a())) {
                                        arrayList.add(v6);
                                    }
                                }
                            }
                        } else if (!m6I2.f29662g.isEmpty()) {
                            for (java.util.Map.Entry entry : m6I2.f29662g.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new com.google.android.gms.internal.ads.V6((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue()));
                                }
                            }
                        }
                        return new com.google.android.gms.internal.ads.Z6(304, m6I2.f29656a, true, jElapsedRealtime2, (java.util.List) arrayList);
                    }
                    java.io.InputStream inputStreamC = a7A.c();
                    if (inputStreamC != null) {
                        int iA = a7A.a();
                        com.google.android.gms.internal.ads.C5204t7 c5204t7 = this.f38437b;
                        com.google.android.gms.internal.ads.G7 g10 = new com.google.android.gms.internal.ads.G7(c5204t7, iA);
                        try {
                            bArrB = c5204t7.b(1024);
                            while (true) {
                                try {
                                    int i6 = inputStreamC.read(bArrB);
                                    if (i6 == -1) {
                                        break;
                                    }
                                    g10.write(bArrB, 0, i6);
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    try {
                                        inputStreamC.close();
                                    } catch (java.io.IOException unused) {
                                        com.google.android.gms.internal.ads.AbstractC4545n7.d("Error occurred when closing InputStream", new java.lang.Object[0]);
                                    }
                                    c5204t7.a(bArrB);
                                    g10.close();
                                    throw th;
                                }
                            }
                            byteArray = g10.toByteArray();
                            try {
                                inputStreamC.close();
                            } catch (java.io.IOException unused2) {
                                com.google.android.gms.internal.ads.AbstractC4545n7.d("Error occurred when closing InputStream", new java.lang.Object[0]);
                            }
                            c5204t7.a(bArrB);
                            g10.close();
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            bArrB = null;
                        }
                    } else {
                        byteArray = new byte[0];
                    }
                    try {
                        long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (com.google.android.gms.internal.ads.AbstractC4545n7.f37506b || jElapsedRealtime3 > 3000) {
                            com.google.android.gms.internal.ads.AbstractC4545n7.a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", abstractC3448d7, java.lang.Long.valueOf(jElapsedRealtime3), byteArray != null ? java.lang.Integer.valueOf(byteArray.length) : "null", java.lang.Integer.valueOf(iB), java.lang.Integer.valueOf(abstractC3448d7.H().a()));
                        }
                        if (iB < 200 || iB > 299) {
                            throw new java.io.IOException();
                        }
                        return new com.google.android.gms.internal.ads.Z6(iB, byteArray, false, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, listD);
                    } catch (java.io.IOException e6) {
                        e = e6;
                        bArr = byteArray;
                    }
                } catch (java.io.IOException e11) {
                    e = e11;
                    bArr = null;
                }
            } catch (java.io.IOException e12) {
                e = e12;
                a7A = null;
            }
            if (e instanceof java.net.SocketTimeoutException) {
                e10 = new com.google.android.gms.internal.ads.E7("socket", new com.google.android.gms.internal.ads.C4105j7(), null);
            } else {
                if (e instanceof java.net.MalformedURLException) {
                    throw new java.lang.RuntimeException("Bad URL ".concat(java.lang.String.valueOf(abstractC3448d7.t())), e);
                }
                if (a7A == null) {
                    throw new com.google.android.gms.internal.ads.C3119a7(e);
                }
                int iB2 = a7A.b();
                com.google.android.gms.internal.ads.AbstractC4545n7.b("Unexpected response code %d for %s", java.lang.Integer.valueOf(iB2), abstractC3448d7.t());
                if (bArr != null) {
                    com.google.android.gms.internal.ads.Z6 z6 = new com.google.android.gms.internal.ads.Z6(iB2, bArr, false, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, a7A.d());
                    if (iB2 != 401 && iB2 != 403) {
                        if (iB2 < 400 || iB2 > 499) {
                            throw new com.google.android.gms.internal.ads.C3997i7(z6);
                        }
                        throw new com.google.android.gms.internal.ads.Q6(z6);
                    }
                    e10 = new com.google.android.gms.internal.ads.E7("auth", new com.google.android.gms.internal.ads.L6(z6), null);
                } else {
                    e10 = new com.google.android.gms.internal.ads.E7("network", new com.google.android.gms.internal.ads.Y6(), null);
                }
            }
            com.google.android.gms.internal.ads.E7 e13 = e10;
            com.google.android.gms.internal.ads.R6 r6H = abstractC3448d7.H();
            int iE = abstractC3448d7.e();
            try {
                r6H.c(e13.f26912b);
                abstractC3448d7.v(java.lang.String.format("%s-retry [timeout=%s]", e13.f26911a, java.lang.Integer.valueOf(iE)));
            } catch (com.google.android.gms.internal.ads.C4215k7 e14) {
                abstractC3448d7.v(java.lang.String.format("%s-timeout-giveup [timeout=%s]", e13.f26911a, java.lang.Integer.valueOf(iE)));
                throw e14;
            }
        }
    }
}
