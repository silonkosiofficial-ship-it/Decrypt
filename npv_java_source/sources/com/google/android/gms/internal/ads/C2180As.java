package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.As, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2180As implements com.google.android.gms.internal.ads.InterfaceC4825pi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f25795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4825pi0 f25796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f25797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f25799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.io.InputStream f25800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private android.net.Uri f25802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile com.google.android.gms.internal.ads.C3072Zc f25803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25804j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25805k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3843gl0 f25806l;

    public C2180As(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, java.lang.String str, int i6, com.google.android.gms.internal.ads.Pv0 pv0, com.google.android.gms.internal.ads.InterfaceC5943zs interfaceC5943zs) {
        this.f25795a = context;
        this.f25796b = interfaceC4825pi0;
        this.f25797c = str;
        this.f25798d = i6;
        new java.util.concurrent.atomic.AtomicLong(-1L);
        this.f25799e = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue();
    }

    private final boolean g() {
        if (!this.f25799e) {
            return false;
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25696t4)).booleanValue() || this.f25804j) {
            return ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25706u4)).booleanValue() && !this.f25805k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) throws java.io.IOException {
        if (!this.f25801g) {
            throw new java.io.IOException("Attempt to read closed CacheDataSource.");
        }
        java.io.InputStream inputStream = this.f25800f;
        return inputStream != null ? inputStream.read(bArr, i6, i10) : this.f25796b.H(bArr, i6, i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) throws java.io.IOException {
        if (this.f25801g) {
            throw new java.io.IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f25801g = true;
        android.net.Uri uri = c3843gl0.f35675a;
        this.f25802h = uri;
        this.f25806l = c3843gl0;
        this.f25803i = com.google.android.gms.internal.ads.C3072Zc.e(uri);
        com.google.android.gms.internal.ads.C2964Wc c2964WcB = null;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25666q4)).booleanValue()) {
            if (this.f25803i != null) {
                this.f25803i.f33623J = c3843gl0.f35679e;
                this.f25803i.f33624K = com.google.android.gms.internal.ads.AbstractC2829Sg0.c(this.f25797c);
                this.f25803i.f33625L = this.f25798d;
                c2964WcB = p174r3.v.f().b(this.f25803i);
            }
            if (c2964WcB != null && c2964WcB.C()) {
                this.f25804j = c2964WcB.E();
                this.f25805k = c2964WcB.D();
                if (!g()) {
                    this.f25800f = c2964WcB.s();
                    return -1L;
                }
            }
        } else if (this.f25803i != null) {
            this.f25803i.f33623J = c3843gl0.f35679e;
            this.f25803i.f33624K = com.google.android.gms.internal.ads.AbstractC2829Sg0.c(this.f25797c);
            this.f25803i.f33625L = this.f25798d;
            long jLongValue = ((java.lang.Long) p184s3.A.c().a(this.f25803i.f33622I ? com.google.android.gms.internal.ads.AbstractC2161Af.f25686s4 : com.google.android.gms.internal.ads.AbstractC2161Af.f25676r4)).longValue();
            p174r3.v.c().c();
            p174r3.v.g();
            java.util.concurrent.Future futureA = com.google.android.gms.internal.ads.C4374ld.a(this.f25795a, this.f25803i);
            try {
                try {
                    try {
                        com.google.android.gms.internal.ads.C4484md c4484md = (com.google.android.gms.internal.ads.C4484md) futureA.get(jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS);
                        c4484md.d();
                        this.f25804j = c4484md.f();
                        this.f25805k = c4484md.e();
                        c4484md.a();
                        if (!g()) {
                            this.f25800f = c4484md.c();
                        }
                    } catch (java.lang.InterruptedException unused) {
                        futureA.cancel(false);
                        java.lang.Thread.currentThread().interrupt();
                    }
                } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused2) {
                    futureA.cancel(false);
                }
            } catch (java.lang.Throwable unused3) {
            }
            p174r3.v.c().c();
            throw null;
        }
        if (this.f25803i != null) {
            com.google.android.gms.internal.ads.C3621ek0 c3621ek0A = c3843gl0.a();
            c3621ek0A.d(android.net.Uri.parse(this.f25803i.f33616C));
            this.f25806l = c3621ek0A.e();
        }
        return this.f25796b.a(this.f25806l);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void b(com.google.android.gms.internal.ads.Pv0 pv0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        return this.f25802h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final /* synthetic */ java.util.Map d() {
        return java.util.Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() throws java.io.IOException {
        if (!this.f25801g) {
            throw new java.io.IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f25801g = false;
        this.f25802h = null;
        java.io.InputStream inputStream = this.f25800f;
        if (inputStream == null) {
            this.f25796b.f();
        } else {
            V3.l.a(inputStream);
            this.f25800f = null;
        }
    }
}
