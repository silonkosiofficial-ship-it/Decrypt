package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3096Zs extends com.google.android.gms.internal.ads.AbstractC2880Ts implements com.google.android.gms.internal.ads.Pv0 {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f33665Q = new java.util.concurrent.atomic.AtomicInteger(0);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.String f33666F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3636es f33667G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f33668H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3060Ys f33669I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2254Cs f33670J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.nio.ByteBuffer f33671K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f33672L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final java.lang.Object f33673M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final java.lang.String f33674N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f33675O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f33676P;

    public C3096Zs(com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs, com.google.android.gms.internal.ads.C3636es c3636es) {
        super(interfaceC3746fs);
        this.f33667G = c3636es;
        this.f33669I = new com.google.android.gms.internal.ads.C3060Ys();
        this.f33670J = new com.google.android.gms.internal.ads.C2254Cs();
        this.f33673M = new java.lang.Object();
        this.f33674N = (java.lang.String) com.google.android.gms.internal.ads.AbstractC5810yg0.d(interfaceC3746fs != null ? interfaceC3746fs.t() : null).b("");
        this.f33675O = interfaceC3746fs != null ? interfaceC3746fs.e() : 0;
        f33665Q.incrementAndGet();
    }

    protected static final java.lang.String D(java.lang.String str) {
        return "cache:".concat(java.lang.String.valueOf(p224w3.g.h(str)));
    }

    private final void E() {
        int iA = (int) this.f33669I.a();
        int iA2 = (int) this.f33670J.a(this.f33671K);
        int iPosition = this.f33671K.position();
        int iRound = java.lang.Math.round(iA2 * (iPosition / iA));
        int iO = com.google.android.gms.internal.ads.AbstractC2987Wr.O();
        int iQ = com.google.android.gms.internal.ads.AbstractC2987Wr.Q();
        java.lang.String str = this.f33666F;
        h(str, D(str), iPosition, iA, iRound, iA2, iRound > 0, iO, iQ);
    }

    public static int t() {
        return f33665Q.get();
    }

    public final boolean C() {
        return this.f33676P;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts, O3.i
    public final void a() {
        f33665Q.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final void c() {
        this.f33668H = true;
    }

    @Override // com.google.android.gms.internal.ads.Pv0
    public final void f(com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.Pv0
    public final void i(com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, boolean z6, int i6) {
    }

    @Override // com.google.android.gms.internal.ads.Pv0
    public final void o(com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, boolean z6) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:? -> B:23:0x00d6). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final boolean p(java.lang.String str) throws java.lang.Throwable {
        java.lang.String str2;
        this.f33666F = str;
        java.lang.String str3 = "error";
        java.lang.String strD = D(str);
        int i6 = 0;
        try {
            com.google.android.gms.internal.ads.Jm0 jm0 = new com.google.android.gms.internal.ads.Jm0();
            jm0.f(this.f32024D);
            jm0.c(this.f33667G.f35076d);
            jm0.d(this.f33667G.f35077e);
            jm0.b(true);
            jm0.e(this);
            com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0A = jm0.a();
            if (this.f33667G.f35081i) {
                interfaceC4825pi0A = new com.google.android.gms.internal.ads.C2180As(this.f32023C, interfaceC4825pi0A, this.f33674N, this.f33675O, null, null);
            }
            interfaceC4825pi0A.a(new com.google.android.gms.internal.ads.C3843gl0(android.net.Uri.parse(str), 0L, -1L, null));
            com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = (com.google.android.gms.internal.ads.InterfaceC3746fs) this.f32025E.get();
            if (interfaceC3746fs != null) {
                interfaceC3746fs.y(strD, this);
            }
            V3.f fVarC = p174r3.v.c();
            long jA = fVarC.a();
            long jLongValue = ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25327L)).longValue();
            long jLongValue2 = ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25316K)).longValue();
            this.f33671K = java.nio.ByteBuffer.allocate(this.f33667G.f35075c);
            int i10 = 8192;
            byte[] bArr = new byte[8192];
            long j6 = jA;
            while (true) {
                int iH = interfaceC4825pi0A.H(bArr, i6, java.lang.Math.min(this.f33671K.remaining(), i10));
                if (iH == -1) {
                    this.f33676P = true;
                    g(str, strD, (int) this.f33670J.a(this.f33671K));
                    break;
                }
                synchronized (this.f33673M) {
                    try {
                        if (!this.f33668H) {
                            try {
                                this.f33671K.put(bArr, 0, iH);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.f33671K.remaining() <= 0) {
                                E();
                                break;
                            }
                            str2 = 1;
                            try {
                                if (this.f33668H) {
                                    throw new java.io.IOException("Precache abort at " + this.f33671K.limit() + " bytes");
                                }
                                long jA2 = fVarC.a();
                                if (jA2 - j6 >= jLongValue) {
                                    E();
                                    j6 = jA2;
                                }
                                if (jA2 - jA > 1000 * jLongValue2) {
                                    throw new java.io.IOException("Timeout exceeded. Limit: " + jLongValue2 + " sec");
                                }
                                str3 = str3;
                                i6 = 0;
                                i10 = 8192;
                            } catch (java.lang.Exception e6) {
                                e = e6;
                                java.lang.String str4 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                                p224w3.p.g("Failed to preload url " + str + " Exception: " + str4);
                                d(str, strD, str2, str4);
                                return false;
                            }
                        } catch (java.lang.Exception e10) {
                            e = e10;
                            str2 = str3;
                            java.lang.String str5 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                            p224w3.p.g("Failed to preload url " + str + " Exception: " + str5);
                            d(str, strD, str2, str5);
                            return false;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
            return true;
        } catch (java.lang.Exception e11) {
            e = e11;
            str3 = str3;
        }
    }

    @Override // com.google.android.gms.internal.ads.Pv0
    public final void q(com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, boolean z6) {
        if (interfaceC4825pi0 instanceof com.google.android.gms.internal.ads.C4619np0) {
            this.f33669I.b((com.google.android.gms.internal.ads.C4619np0) interfaceC4825pi0);
        }
    }

    public final java.lang.String u() {
        return this.f33666F;
    }

    public final java.nio.ByteBuffer w() {
        synchronized (this.f33673M) {
            try {
                java.nio.ByteBuffer byteBuffer = this.f33671K;
                if (byteBuffer != null && !this.f33672L) {
                    byteBuffer.flip();
                    this.f33672L = true;
                }
                this.f33668H = true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return this.f33671K;
    }
}
