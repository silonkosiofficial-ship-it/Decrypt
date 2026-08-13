package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5945zt extends com.google.android.gms.internal.ads.AbstractC2493Je0 implements com.google.android.gms.internal.ads.InterfaceC5396ut0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final java.util.regex.Pattern f40405v = java.util.regex.Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f40406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f40407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f40408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Ts0 f40409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3843gl0 f40410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.net.HttpURLConnection f40411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.Queue f40412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private java.io.InputStream f40413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f40414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f40415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f40416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f40417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f40418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f40419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f40420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f40421t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f40422u;

    C5945zt(java.lang.String str, com.google.android.gms.internal.ads.Pv0 pv0, int i6, int i10, long j6, long j10) {
        super(true);
        com.google.android.gms.internal.ads.LC.c(str);
        this.f40408g = str;
        this.f40409h = new com.google.android.gms.internal.ads.Ts0();
        this.f40406e = i6;
        this.f40407f = i10;
        this.f40412k = new java.util.ArrayDeque();
        this.f40421t = j6;
        this.f40422u = j10;
        if (pv0 != null) {
            b(pv0);
        }
    }

    private final void l() {
        while (!this.f40412k.isEmpty()) {
            try {
                ((java.net.HttpURLConnection) this.f40412k.remove()).disconnect();
            } catch (java.lang.Exception e6) {
                p224w3.p.e("Unexpected error while disconnecting", e6);
            }
        }
        this.f40411j = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.ads.C5062rr0 {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j6 = this.f40416o;
            long j10 = this.f40417p;
            if (j6 - j10 == 0) {
                return -1;
            }
            long j11 = this.f40418q + j10;
            long j12 = i10;
            long j13 = this.f40422u;
            long j14 = j11 + j12 + j13;
            long j15 = this.f40420s;
            long j16 = j15 + 1;
            if (j14 > j16) {
                long j17 = this.f40419r;
                if (j15 < j17) {
                    long jMin = java.lang.Math.min(j17, java.lang.Math.max(((this.f40421t + j16) - j13) - 1, (-1) + j16 + j12));
                    k(j16, jMin, 2);
                    this.f40420s = jMin;
                    j15 = jMin;
                }
            }
            int i11 = this.f40413l.read(bArr, i6, (int) java.lang.Math.min(j12, ((j15 + 1) - this.f40418q) - this.f40417p));
            if (i11 == -1) {
                throw new java.io.EOFException();
            }
            this.f40417p += (long) i11;
            D(i11);
            return i11;
        } catch (java.io.IOException e6) {
            throw new com.google.android.gms.internal.ads.C5062rr0(e6, this.f40410i, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) throws com.google.android.gms.internal.ads.C5062rr0 {
        long jMax;
        this.f40410i = c3843gl0;
        this.f40417p = 0L;
        long j6 = c3843gl0.f35679e;
        long j10 = c3843gl0.f35680f;
        long jMin = j10 == -1 ? this.f40421t : java.lang.Math.min(this.f40421t, j10);
        this.f40418q = j6;
        java.net.HttpURLConnection httpURLConnectionK = k(j6, (jMin + j6) - 1, 1);
        this.f40411j = httpURLConnectionK;
        java.lang.String headerField = httpURLConnectionK.getHeaderField("Content-Range");
        if (!android.text.TextUtils.isEmpty(headerField)) {
            java.util.regex.Matcher matcher = f40405v.matcher(headerField);
            if (matcher.find()) {
                try {
                    java.lang.Long.parseLong(matcher.group(1));
                    long j11 = java.lang.Long.parseLong(matcher.group(2));
                    long j12 = java.lang.Long.parseLong(matcher.group(3));
                    long j13 = c3843gl0.f35680f;
                    if (j13 != -1) {
                        this.f40416o = j13;
                        jMax = java.lang.Math.max(j11, (this.f40418q + j13) - 1);
                    } else {
                        this.f40416o = j12 - this.f40418q;
                        jMax = j12 - 1;
                    }
                    this.f40419r = jMax;
                    this.f40420s = j11;
                    this.f40414m = true;
                    i(c3843gl0);
                    return this.f40416o;
                } catch (java.lang.NumberFormatException unused) {
                    p224w3.p.d("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new com.google.android.gms.internal.ads.C5725xt(headerField, c3843gl0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        java.net.HttpURLConnection httpURLConnection = this.f40411j;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2493Je0, com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final java.util.Map d() {
        java.net.HttpURLConnection httpURLConnection = this.f40411j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        try {
            java.io.InputStream inputStream = this.f40413l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e6) {
                    throw new com.google.android.gms.internal.ads.C5062rr0(e6, this.f40410i, 2000, 3);
                }
            }
            this.f40413l = null;
            l();
            if (this.f40414m) {
                this.f40414m = false;
                g();
            }
        } catch (java.lang.Throwable th) {
            this.f40413l = null;
            l();
            if (this.f40414m) {
                this.f40414m = false;
                g();
            }
            throw th;
        }
    }

    final java.net.HttpURLConnection k(long j6, long j10, int i6) throws com.google.android.gms.internal.ads.C5062rr0 {
        java.lang.String string = this.f40410i.f35675a.toString();
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f40406e);
            httpURLConnection.setReadTimeout(this.f40407f);
            for (java.util.Map.Entry entry : this.f40409h.a().entrySet()) {
                httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j6 + "-" + j10);
            httpURLConnection.setRequestProperty("User-Agent", this.f40408g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f40412k.add(httpURLConnection);
            java.lang.String string2 = this.f40410i.f35675a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f40415n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
                    l();
                    throw new com.google.android.gms.internal.ads.C5835yt(this.f40415n, headerFields, this.f40410i, i6);
                }
                try {
                    java.io.InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f40413l != null) {
                        inputStream = new java.io.SequenceInputStream(this.f40413l, inputStream);
                    }
                    this.f40413l = inputStream;
                    return httpURLConnection;
                } catch (java.io.IOException e6) {
                    l();
                    throw new com.google.android.gms.internal.ads.C5062rr0(e6, this.f40410i, 2000, i6);
                }
            } catch (java.io.IOException e10) {
                l();
                throw new com.google.android.gms.internal.ads.C5062rr0("Unable to connect to ".concat(java.lang.String.valueOf(string2)), e10, this.f40410i, 2000, i6);
            }
        } catch (java.io.IOException e11) {
            throw new com.google.android.gms.internal.ads.C5062rr0("Unable to connect to ".concat(java.lang.String.valueOf(string)), e11, this.f40410i, 2000, i6);
        }
    }
}
