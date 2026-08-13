package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3968ht extends com.google.android.gms.internal.ads.AbstractC2493Je0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.content.Context f36144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4825pi0 f36145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f36146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f36147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f36148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.io.InputStream f36149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private android.net.Uri f36151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile com.google.android.gms.internal.ads.C3072Zc f36152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f36155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f36156q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f36157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private P4.d f36158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f36159t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5285tt f36160u;

    public C3968ht(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, java.lang.String str, int i6, com.google.android.gms.internal.ads.Pv0 pv0, com.google.android.gms.internal.ads.C5285tt c5285tt) {
        super(false);
        this.f36144e = context;
        this.f36145f = interfaceC4825pi0;
        this.f36160u = c5285tt;
        this.f36146g = str;
        this.f36147h = i6;
        this.f36153n = false;
        this.f36154o = false;
        this.f36155p = false;
        this.f36156q = false;
        this.f36157r = 0L;
        this.f36159t = new java.util.concurrent.atomic.AtomicLong(-1L);
        this.f36158s = null;
        this.f36148i = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue();
        b(pv0);
    }

    private final boolean r() {
        if (!this.f36148i) {
            return false;
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25696t4)).booleanValue() || this.f36155p) {
            return ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25706u4)).booleanValue() && !this.f36156q;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) throws java.io.IOException {
        if (!this.f36150k) {
            throw new java.io.IOException("Attempt to read closed GcacheDataSource.");
        }
        java.io.InputStream inputStream = this.f36149j;
        int iH = inputStream != null ? inputStream.read(bArr, i6, i10) : this.f36145f.H(bArr, i6, i10);
        if (!this.f36148i || this.f36149j != null) {
            D(iH);
        }
        return iH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.wt] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) throws java.lang.Throwable {
        com.google.android.gms.internal.ads.C2964Wc c2964WcB;
        boolean z6;
        boolean z10;
        long jC;
        java.lang.String string = "ms";
        if (this.f36150k) {
            throw new java.io.IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r6 = 1;
        this.f36150k = true;
        this.f36151l = c3843gl0.f35675a;
        if (!this.f36148i) {
            i(c3843gl0);
        }
        this.f36152m = com.google.android.gms.internal.ads.C3072Zc.e(c3843gl0.f35675a);
        ?? sb = -1;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25666q4)).booleanValue()) {
            if (this.f36152m != null) {
                this.f36152m.f33623J = c3843gl0.f35679e;
                this.f36152m.f33624K = com.google.android.gms.internal.ads.AbstractC2829Sg0.c(this.f36146g);
                this.f36152m.f33625L = this.f36147h;
                c2964WcB = p174r3.v.f().b(this.f36152m);
            } else {
                c2964WcB = null;
            }
            if (c2964WcB != null && c2964WcB.C()) {
                this.f36153n = c2964WcB.w();
                this.f36155p = c2964WcB.E();
                this.f36156q = c2964WcB.D();
                this.f36157r = c2964WcB.e();
                this.f36154o = true;
                if (!r()) {
                    this.f36149j = c2964WcB.s();
                    if (this.f36148i) {
                        i(c3843gl0);
                    }
                    return -1L;
                }
            }
        } else if (this.f36152m != null) {
            this.f36152m.f33623J = c3843gl0.f35679e;
            this.f36152m.f33624K = com.google.android.gms.internal.ads.AbstractC2829Sg0.c(this.f36146g);
            this.f36152m.f33625L = this.f36147h;
            long jLongValue = ((java.lang.Long) p184s3.A.c().a(this.f36152m.f33622I ? com.google.android.gms.internal.ads.AbstractC2161Af.f25686s4 : com.google.android.gms.internal.ads.AbstractC2161Af.f25676r4)).longValue();
            long jC2 = p174r3.v.c().c();
            p174r3.v.g();
            java.util.concurrent.Future futureA = com.google.android.gms.internal.ads.C4374ld.a(this.f36144e, this.f36152m);
            try {
                try {
                    com.google.android.gms.internal.ads.C4484md c4484md = (com.google.android.gms.internal.ads.C4484md) futureA.get(jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS);
                    try {
                        this.f36153n = c4484md.d();
                        this.f36155p = c4484md.f();
                        this.f36156q = c4484md.e();
                        this.f36157r = c4484md.a();
                        if (!r()) {
                            this.f36149j = c4484md.c();
                            if (this.f36148i) {
                                i(c3843gl0);
                            }
                            long jC3 = p174r3.v.c().c() - jC2;
                            this.f36160u.f39043a.b0(true, jC3);
                            this.f36154o = true;
                            p214v3.AbstractC7265q0.k("Cache connection took " + jC3 + "ms");
                            return -1L;
                        }
                        long jC4 = p174r3.v.c().c() - jC2;
                        this.f36160u.f39043a.b0(true, jC4);
                        this.f36154o = true;
                        string = "Cache connection took " + jC4 + "ms";
                    } catch (java.lang.InterruptedException unused) {
                        z10 = true;
                        futureA.cancel(true);
                        java.lang.Thread.currentThread().interrupt();
                        jC = p174r3.v.c().c() - jC2;
                        this.f36160u.f39043a.b0(z10, jC);
                        this.f36154o = z10;
                        sb = new java.lang.StringBuilder();
                        sb.append("Cache connection took ");
                        sb.append(jC);
                        sb.append("ms");
                        string = sb.toString();
                    } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused2) {
                        z6 = true;
                        futureA.cancel(true);
                        jC = p174r3.v.c().c() - jC2;
                        this.f36160u.f39043a.b0(z6, jC);
                        this.f36154o = z6;
                        sb = new java.lang.StringBuilder();
                        sb.append("Cache connection took ");
                        sb.append(jC);
                        sb.append("ms");
                        string = sb.toString();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        long jC5 = p174r3.v.c().c() - jC2;
                        this.f36160u.f39043a.b0(r6, jC5);
                        this.f36154o = r6;
                        p214v3.AbstractC7265q0.k("Cache connection took " + jC5 + string);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r6 = sb;
                }
            } catch (java.lang.InterruptedException unused3) {
                z10 = false;
            } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused4) {
                z6 = false;
            } catch (java.lang.Throwable th3) {
                th = th3;
                r6 = 0;
            }
            p214v3.AbstractC7265q0.k(string);
        }
        this.f36154o = false;
        if (this.f36152m != null) {
            com.google.android.gms.internal.ads.C3621ek0 c3621ek0A = c3843gl0.a();
            c3621ek0A.d(android.net.Uri.parse(this.f36152m.f33616C));
            c3843gl0 = c3621ek0A.e();
        }
        return this.f36145f.a(c3843gl0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        return this.f36151l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() throws java.io.IOException {
        if (!this.f36150k) {
            throw new java.io.IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f36150k = false;
        this.f36151l = null;
        boolean z6 = (this.f36148i && this.f36149j == null) ? false : true;
        java.io.InputStream inputStream = this.f36149j;
        if (inputStream != null) {
            V3.l.a(inputStream);
            this.f36149j = null;
        } else {
            this.f36145f.f();
        }
        if (z6) {
            g();
        }
    }

    public final long k() {
        return this.f36157r;
    }

    public final long l() {
        if (this.f36152m != null) {
            if (this.f36159t.get() == -1) {
                synchronized (this) {
                    try {
                        if (this.f36158s == null) {
                            this.f36158s = com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.gt
                                @Override // java.util.concurrent.Callable
                                public final java.lang.Object call() {
                                    return this.f35711a.m();
                                }
                            });
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                if (this.f36158s.isDone()) {
                    try {
                        this.f36159t.compareAndSet(-1L, ((java.lang.Long) this.f36158s.get()).longValue());
                    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                    }
                }
            }
            return this.f36159t.get();
        }
        return -1L;
    }

    final /* synthetic */ java.lang.Long m() {
        return java.lang.Long.valueOf(p174r3.v.f().a(this.f36152m));
    }

    public final boolean n() {
        return this.f36153n;
    }

    public final boolean o() {
        return this.f36156q;
    }

    public final boolean p() {
        return this.f36155p;
    }

    public final boolean q() {
        return this.f36154o;
    }
}
