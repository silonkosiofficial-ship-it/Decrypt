package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.np0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4619np0 extends com.google.android.gms.internal.ads.AbstractC2493Je0 implements com.google.android.gms.internal.ads.InterfaceC5396ut0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f37667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f37668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f37669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f37670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Ts0 f37671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Ts0 f37672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3843gl0 f37673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private java.net.HttpURLConnection f37674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private java.io.InputStream f37675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f37676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f37677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f37678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f37679q;

    /* synthetic */ C4619np0(java.lang.String str, int i6, int i10, boolean z6, boolean z10, com.google.android.gms.internal.ads.Ts0 ts0, com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0, boolean z11, com.google.android.gms.internal.ads.Mo0 mo0) {
        super(true);
        this.f37670h = str;
        this.f37668f = i6;
        this.f37669g = i10;
        this.f37667e = z6;
        this.f37671i = ts0;
        this.f37672j = new com.google.android.gms.internal.ads.Ts0();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    private final java.net.HttpURLConnection k(java.net.URL url, int i6, byte[] bArr, long j6, long j10, boolean z6, boolean z10, java.util.Map map) throws java.io.IOException {
        java.lang.StringBuilder sb;
        java.lang.String string;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f37668f);
        httpURLConnection.setReadTimeout(this.f37669g);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.putAll(this.f37671i.a());
        map2.putAll(this.f37672j.a());
        map2.putAll(map);
        for (java.util.Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        if (j6 != 0) {
            sb = new java.lang.StringBuilder();
            sb.append("bytes=");
            sb.append(j6);
            sb.append("-");
            if (j10 != -1) {
                sb.append((j6 + j10) - 1);
            }
            string = sb.toString();
        } else if (j10 == -1) {
            string = null;
        } else {
            j6 = 0;
            sb = new java.lang.StringBuilder();
            sb.append("bytes=");
            sb.append(j6);
            sb.append("-");
            if (j10 != -1) {
                sb.append((j6 + j10) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        java.lang.String str = this.f37670h;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z6 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z10);
        httpURLConnection.setDoOutput(false);
        int i10 = com.google.android.gms.internal.ads.C3843gl0.f35674h;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final java.net.URL l(java.net.URL url, java.lang.String str, com.google.android.gms.internal.ads.C3843gl0 c3843gl0) throws com.google.android.gms.internal.ads.C5062rr0 {
        if (str == null) {
            throw new com.google.android.gms.internal.ads.C5062rr0("Null location redirect", c3843gl0, 2001, 1);
        }
        try {
            java.net.URL url2 = new java.net.URL(url, str);
            java.lang.String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new com.google.android.gms.internal.ads.C5062rr0("Unsupported protocol redirect: ".concat(java.lang.String.valueOf(protocol)), c3843gl0, 2001, 1);
            }
            if (this.f37667e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new com.google.android.gms.internal.ads.C5062rr0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c3843gl0, 2001, 1);
        } catch (java.net.MalformedURLException e6) {
            throw new com.google.android.gms.internal.ads.C5062rr0(e6, c3843gl0, 2001, 1);
        }
    }

    private final void m() {
        java.net.HttpURLConnection httpURLConnection = this.f37674l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e6) {
                com.google.android.gms.internal.ads.AbstractC3586eM.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e6);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x002c A[Catch: IOException -> 0x001f, TRY_LEAVE, TryCatch #0 {IOException -> 0x001f, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:12:0x0021, B:15:0x002c), top: B:19:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.ads.C5062rr0 {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        try {
            long j6 = this.f37678p;
            if (j6 != -1) {
                long j10 = j6 - this.f37679q;
                if (j10 != 0) {
                    i10 = (int) java.lang.Math.min(i10, j10);
                    java.io.InputStream inputStream = this.f37675m;
                    int i12 = com.google.android.gms.internal.ads.EW.f27061a;
                    i11 = inputStream.read(bArr, i6, i10);
                    if (i11 == -1) {
                        this.f37679q += (long) i11;
                        D(i11);
                        return i11;
                    }
                }
            } else {
                java.io.InputStream inputStream2 = this.f37675m;
                int i13 = com.google.android.gms.internal.ads.EW.f27061a;
                i11 = inputStream2.read(bArr, i6, i10);
                if (i11 == -1) {
                    this.f37679q += (long) i11;
                    D(i11);
                    return i11;
                }
            }
            return -1;
        } catch (java.io.IOException e6) {
            com.google.android.gms.internal.ads.C3843gl0 c3843gl0 = this.f37673k;
            int i14 = com.google.android.gms.internal.ads.EW.f27061a;
            throw com.google.android.gms.internal.ads.C5062rr0.a(e6, c3843gl0, 2);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r10v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v7 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v18 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v0 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 r27) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4619np0.a(com.google.android.gms.internal.ads.gl0):long");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        java.net.HttpURLConnection httpURLConnection = this.f37674l;
        if (httpURLConnection != null) {
            return android.net.Uri.parse(httpURLConnection.getURL().toString());
        }
        com.google.android.gms.internal.ads.C3843gl0 c3843gl0 = this.f37673k;
        if (c3843gl0 != null) {
            return c3843gl0.f35675a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2493Je0, com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final java.util.Map d() {
        java.net.HttpURLConnection httpURLConnection = this.f37674l;
        return httpURLConnection == null ? com.google.android.gms.internal.ads.AbstractC3727fi0.d() : new com.google.android.gms.internal.ads.C4397lo0(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        try {
            java.io.InputStream inputStream = this.f37675m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e6) {
                    com.google.android.gms.internal.ads.C3843gl0 c3843gl0 = this.f37673k;
                    int i6 = com.google.android.gms.internal.ads.EW.f27061a;
                    throw new com.google.android.gms.internal.ads.C5062rr0(e6, c3843gl0, 2000, 3);
                }
            }
            this.f37675m = null;
            m();
            if (this.f37676n) {
                this.f37676n = false;
                g();
            }
            this.f37674l = null;
            this.f37673k = null;
        } catch (java.lang.Throwable th) {
            this.f37675m = null;
            m();
            if (this.f37676n) {
                this.f37676n = false;
                g();
            }
            this.f37674l = null;
            this.f37673k = null;
            throw th;
        }
    }
}
