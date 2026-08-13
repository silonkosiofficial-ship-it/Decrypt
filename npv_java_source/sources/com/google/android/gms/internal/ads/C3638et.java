package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3638et extends com.google.android.gms.internal.ads.AbstractC2493Je0 implements com.google.android.gms.internal.ads.InterfaceC5396ut0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final java.util.regex.Pattern f35087u = java.util.regex.Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReference f35088v = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final javax.net.ssl.SSLSocketFactory f35089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f35090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f35091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f35092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Ts0 f35093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3843gl0 f35094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private java.net.HttpURLConnection f35095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private java.io.InputStream f35096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f35099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f35100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f35101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f35102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f35103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final java.util.Set f35104t;

    C3638et(java.lang.String str, com.google.android.gms.internal.ads.Pv0 pv0, int i6, int i10, int i11) {
        super(true);
        this.f35089e = new com.google.android.gms.internal.ads.C3528dt(this);
        this.f35104t = new java.util.HashSet();
        com.google.android.gms.internal.ads.LC.c(str);
        this.f35092h = str;
        this.f35093i = new com.google.android.gms.internal.ads.Ts0();
        this.f35090f = i6;
        this.f35091g = i10;
        this.f35103s = i11;
        if (pv0 != null) {
            b(pv0);
        }
    }

    private final void n() {
        java.net.HttpURLConnection httpURLConnection = this.f35095k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e6) {
                p224w3.p.e("Unexpected error while disconnecting", e6);
            }
            this.f35095k = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[Catch: IOException -> 0x001b, TRY_LEAVE, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.ads.C5062rr0 {
        int i11;
        try {
            if (this.f35101q != this.f35099o) {
                byte[] bArr2 = (byte[]) f35088v.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j6 = this.f35101q;
                    long j10 = this.f35099o;
                    if (j6 == j10) {
                        f35088v.set(bArr2);
                        break;
                    }
                    int i12 = this.f35096l.read(bArr2, 0, (int) java.lang.Math.min(j10 - j6, bArr2.length));
                    if (java.lang.Thread.interrupted()) {
                        throw new java.io.InterruptedIOException();
                    }
                    if (i12 == -1) {
                        throw new java.io.EOFException();
                    }
                    this.f35101q += (long) i12;
                    D(i12);
                }
            }
            if (i10 == 0) {
                return 0;
            }
            long j11 = this.f35100p;
            if (j11 != -1) {
                long j12 = j11 - this.f35102r;
                if (j12 != 0) {
                    i10 = (int) java.lang.Math.min(i10, j12);
                    i11 = this.f35096l.read(bArr, i6, i10);
                    if (i11 == -1) {
                        this.f35102r += (long) i11;
                        D(i11);
                        return i11;
                    }
                    if (this.f35100p == -1) {
                        throw new java.io.EOFException();
                    }
                }
            } else {
                i11 = this.f35096l.read(bArr, i6, i10);
                if (i11 == -1) {
                    this.f35102r += (long) i11;
                    D(i11);
                    return i11;
                }
                if (this.f35100p == -1) {
                    throw new java.io.EOFException();
                }
            }
            return -1;
        } catch (java.io.IOException e6) {
            throw new com.google.android.gms.internal.ads.C5062rr0(e6, this.f35094j, 2000, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bc A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:11:0x0040, B:12:0x0058, B:14:0x005e, B:21:0x0082, B:23:0x009c, B:24:0x00ae, B:25:0x00b3, B:27:0x00bc, B:28:0x00c3, B:41:0x00ee, B:93:0x0234, B:95:0x023f, B:97:0x0250, B:100:0x0259, B:101:0x0268, B:103:0x0270, B:104:0x0277, B:105:0x0278, B:106:0x028e), top: B:117:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:95:0x023f A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:11:0x0040, B:12:0x0058, B:14:0x005e, B:21:0x0082, B:23:0x009c, B:24:0x00ae, B:25:0x00b3, B:27:0x00bc, B:28:0x00c3, B:41:0x00ee, B:93:0x0234, B:95:0x023f, B:97:0x0250, B:100:0x0259, B:101:0x0268, B:103:0x0270, B:104:0x0277, B:105:0x0278, B:106:0x028e), top: B:117:0x000e }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) throws com.google.android.gms.internal.ads.C5062rr0 {
        int responseCode;
        java.lang.String headerField;
        java.lang.String protocol;
        long j6;
        long jMax;
        this.f35094j = c3843gl0;
        long j10 = 0;
        this.f35102r = 0L;
        this.f35101q = 0L;
        try {
            java.net.URL url = new java.net.URL(c3843gl0.f35675a.toString());
            long j11 = c3843gl0.f35679e;
            long j12 = c3843gl0.f35680f;
            boolean zB = c3843gl0.b(1);
            int i6 = 0;
            while (true) {
                int i10 = i6 + 1;
                if (i6 > 20) {
                    throw new java.net.NoRouteToHostException("Too many redirects: " + i10);
                }
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof javax.net.ssl.HttpsURLConnection) {
                    ((javax.net.ssl.HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f35089e);
                }
                httpURLConnection.setConnectTimeout(this.f35090f);
                httpURLConnection.setReadTimeout(this.f35091g);
                for (java.util.Map.Entry entry : this.f35093i.a().entrySet()) {
                    httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
                if (j11 == j10) {
                    if (j12 != -1) {
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.f35092h);
                    if (!zB) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f35095k = httpURLConnection;
                        try {
                            int responseCode2 = httpURLConnection.getResponseCode();
                            this.f35098n = responseCode2;
                            if (responseCode2 < 200 || responseCode2 > 299) {
                                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = this.f35095k.getHeaderFields();
                                n();
                                com.google.android.gms.internal.ads.C5174ss0 c5174ss0 = new com.google.android.gms.internal.ads.C5174ss0(this.f35098n, null, null, headerFields, c3843gl0, com.google.android.gms.internal.ads.EW.f27066f);
                                if (this.f35098n != 416) {
                                    throw c5174ss0;
                                }
                                c5174ss0.initCause(new com.google.android.gms.internal.ads.C2722Pi0(2008));
                                throw c5174ss0;
                            }
                            if (responseCode2 == 200) {
                                j6 = c3843gl0.f35679e;
                                if (j6 == 0) {
                                    j6 = 0;
                                }
                            } else {
                                j6 = 0;
                            }
                            this.f35099o = j6;
                            boolean zB2 = c3843gl0.b(1);
                            long j13 = c3843gl0.f35680f;
                            if (!zB2 && j13 == -1) {
                                java.net.HttpURLConnection httpURLConnection2 = this.f35095k;
                                java.lang.String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                if (android.text.TextUtils.isEmpty(headerField2)) {
                                    jMax = -1;
                                } else {
                                    try {
                                        jMax = java.lang.Long.parseLong(headerField2);
                                    } catch (java.lang.NumberFormatException unused) {
                                        p224w3.p.d("Unexpected Content-Length [" + headerField2 + "]");
                                        jMax = -1;
                                    }
                                }
                                java.lang.String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!android.text.TextUtils.isEmpty(headerField3)) {
                                    java.util.regex.Matcher matcher = f35087u.matcher(headerField3);
                                    if (matcher.find()) {
                                        try {
                                            long j14 = (java.lang.Long.parseLong(matcher.group(2)) - java.lang.Long.parseLong(matcher.group(1))) + 1;
                                            if (jMax < 0) {
                                                jMax = j14;
                                            } else if (jMax != j14) {
                                                p224w3.p.g("Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                                jMax = java.lang.Math.max(jMax, j14);
                                            }
                                        } catch (java.lang.NumberFormatException unused2) {
                                            p224w3.p.d("Unexpected Content-Range [" + headerField3 + "]");
                                        }
                                    }
                                }
                                j13 = jMax != -1 ? jMax - this.f35099o : -1L;
                            }
                            this.f35100p = j13;
                            try {
                                this.f35096l = this.f35095k.getInputStream();
                                this.f35097m = true;
                                i(c3843gl0);
                                return this.f35100p;
                            } catch (java.io.IOException e6) {
                                n();
                                throw new com.google.android.gms.internal.ads.C5062rr0(e6, c3843gl0, 2000, 1);
                            }
                        } catch (java.io.IOException e10) {
                            n();
                            throw new com.google.android.gms.internal.ads.C5062rr0("Unable to connect to ".concat(java.lang.String.valueOf(c3843gl0.f35675a.toString())), e10, c3843gl0, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new java.net.ProtocolException("Null location redirect");
                    }
                    java.net.URL url2 = new java.net.URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new java.net.ProtocolException("Unsupported protocol redirect: ".concat(java.lang.String.valueOf(protocol)));
                    }
                    url = url2;
                    i6 = i10;
                    j10 = 0;
                } else {
                    j10 = j11;
                }
                java.lang.String string = "bytes=" + j10 + "-";
                if (j12 != -1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(string);
                    sb.append((j10 + j12) - 1);
                    string = sb.toString();
                }
                httpURLConnection.setRequestProperty("Range", string);
                httpURLConnection.setRequestProperty("User-Agent", this.f35092h);
                if (!zB) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 300) {
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new java.net.ProtocolException("Null location redirect");
                }
                java.net.URL url3 = new java.net.URL(url, headerField);
                protocol = url3.getProtocol();
                if (!"https".equals(protocol)) {
                    throw new java.net.ProtocolException("Unsupported protocol redirect: ".concat(java.lang.String.valueOf(protocol)));
                }
                url = url3;
                i6 = i10;
                j10 = 0;
            }
        } catch (java.io.IOException e11) {
            throw new com.google.android.gms.internal.ads.C5062rr0("Unable to connect to ".concat(java.lang.String.valueOf(c3843gl0.f35675a.toString())), e11, c3843gl0, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        java.net.HttpURLConnection httpURLConnection = this.f35095k;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2493Je0, com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final java.util.Map d() {
        java.net.HttpURLConnection httpURLConnection = this.f35095k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        try {
            java.io.InputStream inputStream = this.f35096l;
            if (inputStream != null) {
                int i6 = com.google.android.gms.internal.ads.EW.f27061a;
                try {
                    inputStream.close();
                } catch (java.io.IOException e6) {
                    throw new com.google.android.gms.internal.ads.C5062rr0(e6, this.f35094j, 2000, 3);
                }
            }
            this.f35096l = null;
            n();
            if (this.f35097m) {
                this.f35097m = false;
                g();
            }
            this.f35104t.clear();
        } catch (java.lang.Throwable th) {
            this.f35096l = null;
            n();
            if (this.f35097m) {
                this.f35097m = false;
                g();
            }
            this.f35104t.clear();
            throw th;
        }
    }

    final void m(int i6) {
        this.f35103s = i6;
        for (java.net.Socket socket : this.f35104t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f35103s);
                } catch (java.net.SocketException e6) {
                    p224w3.p.h("Failed to update receive buffer size.", e6);
                }
            }
        }
    }
}
