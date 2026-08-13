package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5615wt extends com.google.android.gms.internal.ads.AbstractC2987Wr implements com.google.android.gms.internal.ads.Pv0, com.google.android.gms.internal.ads.NB0 {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ int f39692Y = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.content.Context f39693E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3748ft f39694F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.GJ0 f39695G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3636es f39696H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.lang.ref.WeakReference f39697I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5227tI0 f39698J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3236bA0 f39699K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.nio.ByteBuffer f39700L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f39701M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2951Vr f39702N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f39703O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f39704P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private long f39705Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final java.lang.String f39706R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final int f39707S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private java.lang.Integer f39709U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final java.util.ArrayList f39710V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private volatile com.google.android.gms.internal.ads.C3968ht f39711W;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final java.lang.Object f39708T = new java.lang.Object();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final java.util.Set f39712X = new java.util.HashSet();

    /* JADX WARN: Code duplicated, block: B:22:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e8  */
    public C5615wt(android.content.Context context, com.google.android.gms.internal.ads.C3636es c3636es, com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs, java.lang.Integer num) {
        final boolean z6;
        final com.google.android.gms.internal.ads.InterfaceC2683Oh0 interfaceC2683Oh0;
        this.f39693E = context;
        this.f39696H = c3636es;
        this.f39709U = num;
        this.f39697I = new java.lang.ref.WeakReference(interfaceC3746fs);
        com.google.android.gms.internal.ads.C3748ft c3748ft = new com.google.android.gms.internal.ads.C3748ft();
        this.f39694F = c3748ft;
        com.google.android.gms.internal.ads.GJ0 gj0 = new com.google.android.gms.internal.ads.GJ0(context);
        this.f39695G = gj0;
        if (p214v3.AbstractC7265q0.m()) {
            p214v3.AbstractC7265q0.k("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        com.google.android.gms.internal.ads.AbstractC2987Wr.u().incrementAndGet();
        com.google.android.gms.internal.ads.HB0 hb0 = new com.google.android.gms.internal.ads.HB0(context, new com.google.android.gms.internal.ads.C5395ut(this));
        hb0.b(gj0);
        hb0.a(c3748ft);
        com.google.android.gms.internal.ads.IB0 ib0C = hb0.c();
        this.f39699K = ib0C;
        ib0C.K(this);
        this.f39703O = 0;
        this.f39705Q = 0L;
        this.f39704P = 0;
        this.f39710V = new java.util.ArrayList();
        this.f39711W = null;
        this.f39706R = (java.lang.String) com.google.android.gms.internal.ads.AbstractC5810yg0.d(interfaceC3746fs != null ? interfaceC3746fs.t() : null).b("");
        this.f39707S = interfaceC3746fs != null ? interfaceC3746fs.e() : 0;
        final java.lang.String strH = p174r3.v.t().H(context, interfaceC3746fs.n().f56217C);
        if (!this.f39701M || this.f39700L.limit() <= 0) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25560g2)).booleanValue()) {
                if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue()) {
                    z6 = c3636es.f35081i ? false : true;
                }
            } else if (c3636es.f35081i) {
            }
            final com.google.android.gms.internal.ads.InterfaceC2683Oh0 interfaceC2683Oh1 = c3636es.f35084l ? new com.google.android.gms.internal.ads.InterfaceC2683Oh0() { // from class: com.google.android.gms.internal.ads.mt
                @Override // com.google.android.gms.internal.ads.InterfaceC2683Oh0
                public final com.google.android.gms.internal.ads.InterfaceC4825pi0 a() {
                    return this.f37426a.W(strH, z6);
                }
            } : c3636es.f35080h > 0 ? new com.google.android.gms.internal.ads.InterfaceC2683Oh0() { // from class: com.google.android.gms.internal.ads.nt
                @Override // com.google.android.gms.internal.ads.InterfaceC2683Oh0
                public final com.google.android.gms.internal.ads.InterfaceC4825pi0 a() {
                    return this.f37688a.X(strH, z6);
                }
            } : new com.google.android.gms.internal.ads.InterfaceC2683Oh0() { // from class: com.google.android.gms.internal.ads.ot
                @Override // com.google.android.gms.internal.ads.InterfaceC2683Oh0
                public final com.google.android.gms.internal.ads.InterfaceC4825pi0 a() {
                    return this.f37881a.Y(strH, z6);
                }
            };
            interfaceC2683Oh0 = c3636es.f35081i ? new com.google.android.gms.internal.ads.InterfaceC2683Oh0() { // from class: com.google.android.gms.internal.ads.pt
                @Override // com.google.android.gms.internal.ads.InterfaceC2683Oh0
                public final com.google.android.gms.internal.ads.InterfaceC4825pi0 a() {
                    return this.f38095a.Z(interfaceC2683Oh1);
                }
            } : interfaceC2683Oh1;
            java.nio.ByteBuffer byteBuffer = this.f39700L;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.f39700L.limit()];
                this.f39700L.get(bArr);
                interfaceC2683Oh0 = new com.google.android.gms.internal.ads.InterfaceC2683Oh0() { // from class: com.google.android.gms.internal.ads.rt
                    @Override // com.google.android.gms.internal.ads.InterfaceC2683Oh0
                    public final com.google.android.gms.internal.ads.InterfaceC4825pi0 a() {
                        int i6 = com.google.android.gms.internal.ads.C5615wt.f39692Y;
                        com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0A = interfaceC2683Oh0.a();
                        byte[] bArr2 = bArr;
                        return new com.google.android.gms.internal.ads.C4186jt(new com.google.android.gms.internal.ads.C2569Lf0(bArr2), bArr2.length, interfaceC4825pi0A);
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.f39700L.limit()];
            this.f39700L.get(bArr2);
            interfaceC2683Oh0 = new com.google.android.gms.internal.ads.InterfaceC2683Oh0() { // from class: com.google.android.gms.internal.ads.kt
                @Override // com.google.android.gms.internal.ads.InterfaceC2683Oh0
                public final com.google.android.gms.internal.ads.InterfaceC4825pi0 a() {
                    return new com.google.android.gms.internal.ads.C2569Lf0(bArr2);
                }
            };
        }
        this.f39698J = new com.google.android.gms.internal.ads.C5227tI0(interfaceC2683Oh0, new com.google.android.gms.internal.ads.C5117sI0(((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25611l)).booleanValue() ? new com.google.android.gms.internal.ads.InterfaceC5740y0() { // from class: com.google.android.gms.internal.ads.vt
            @Override // com.google.android.gms.internal.ads.InterfaceC5740y0
            public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0[] a(android.net.Uri uri, java.util.Map map) {
                int i6 = com.google.android.gms.internal.ads.C5615wt.f39692Y;
                return new com.google.android.gms.internal.ads.InterfaceC5190t0[]{new com.google.android.gms.internal.ads.G3(), new com.google.android.gms.internal.ads.X2(), new com.google.android.gms.internal.ads.B3(com.google.android.gms.internal.ads.InterfaceC4869q4.f38162a, 32, null, null, com.google.android.gms.internal.ads.AbstractC3398ci0.O(), null)};
            }
        } : new com.google.android.gms.internal.ads.InterfaceC5740y0() { // from class: com.google.android.gms.internal.ads.lt
            @Override // com.google.android.gms.internal.ads.InterfaceC5740y0
            public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0[] a(android.net.Uri uri, java.util.Map map) {
                int i6 = com.google.android.gms.internal.ads.C5615wt.f39692Y;
                return new com.google.android.gms.internal.ads.InterfaceC5190t0[]{new com.google.android.gms.internal.ads.G3(), new com.google.android.gms.internal.ads.X2()};
            }
        }));
    }

    private final boolean d0() {
        return this.f39711W != null && this.f39711W.q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void A(int i6) {
        this.f39694F.l(i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void B(int i6) {
        this.f39694F.m(i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void C(com.google.android.gms.internal.ads.InterfaceC2951Vr interfaceC2951Vr) {
        this.f39702N = interfaceC2951Vr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void D(int i6) {
        this.f39694F.n(i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void E(int i6) {
        this.f39694F.o(i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void F(boolean z6) {
        this.f39699K.o(z6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void G(java.lang.Integer num) {
        this.f39709U = num;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void H(boolean z6) {
        if (this.f39699K == null) {
            return;
        }
        int i6 = 0;
        while (true) {
            this.f39699K.C();
            if (i6 >= 2) {
                return;
            }
            com.google.android.gms.internal.ads.GJ0 gj0 = this.f39695G;
            com.google.android.gms.internal.ads.C4460mJ0 c4460mJ0C = gj0.n().c();
            c4460mJ0C.q(i6, !z6);
            gj0.r(c4460mJ0C);
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void I(int i6) {
        java.util.Iterator it = this.f39712X.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.C3638et c3638et = (com.google.android.gms.internal.ads.C3638et) ((java.lang.ref.WeakReference) it.next()).get();
            if (c3638et != null) {
                c3638et.m(i6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void J(android.view.Surface surface, boolean z6) {
        com.google.android.gms.internal.ads.InterfaceC3236bA0 interfaceC3236bA0 = this.f39699K;
        if (interfaceC3236bA0 != null) {
            interfaceC3236bA0.a(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void K(float f6, boolean z6) {
        com.google.android.gms.internal.ads.InterfaceC3236bA0 interfaceC3236bA0 = this.f39699K;
        if (interfaceC3236bA0 != null) {
            interfaceC3236bA0.R(f6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void L() {
        this.f39699K.w();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final boolean M() {
        return this.f39699K != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final int N() {
        return this.f39704P;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final int P() {
        return this.f39699K.e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final long R() {
        return this.f39699K.h();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final long S() {
        return this.f39703O;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final long T() {
        if (d0() && this.f39711W.p()) {
            return java.lang.Math.min(this.f39703O, this.f39711W.k());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final long U() {
        return this.f39699K.k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final long V() {
        return this.f39699K.l();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC4825pi0 W(java.lang.String str, boolean z6) {
        com.google.android.gms.internal.ads.C5615wt c5615wt = true != z6 ? null : this;
        com.google.android.gms.internal.ads.C3636es c3636es = this.f39696H;
        return new com.google.android.gms.internal.ads.C5945zt(str, c5615wt, c3636es.f35076d, c3636es.f35077e, c3636es.f35085m, c3636es.f35086n);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC4825pi0 X(java.lang.String str, boolean z6) {
        com.google.android.gms.internal.ads.C5615wt c5615wt = true != z6 ? null : this;
        com.google.android.gms.internal.ads.C3636es c3636es = this.f39696H;
        com.google.android.gms.internal.ads.C3638et c3638et = new com.google.android.gms.internal.ads.C3638et(str, c5615wt, c3636es.f35076d, c3636es.f35077e, c3636es.f35080h);
        this.f39712X.add(new java.lang.ref.WeakReference(c3638et));
        return c3638et;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC4825pi0 Y(java.lang.String str, boolean z6) {
        com.google.android.gms.internal.ads.Jm0 jm0 = new com.google.android.gms.internal.ads.Jm0();
        jm0.f(str);
        jm0.e(true != z6 ? null : this);
        jm0.c(this.f39696H.f35076d);
        jm0.d(this.f39696H.f35077e);
        jm0.b(true);
        return jm0.a();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC4825pi0 Z(com.google.android.gms.internal.ads.InterfaceC2683Oh0 interfaceC2683Oh0) {
        com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0A = interfaceC2683Oh0.a();
        com.google.android.gms.internal.ads.C5285tt c5285tt = new com.google.android.gms.internal.ads.C5285tt(this);
        return new com.google.android.gms.internal.ads.C3968ht(this.f39693E, interfaceC4825pi0A, this.f39706R, this.f39707S, this, c5285tt);
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final /* synthetic */ void a(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.HH0 hh0) {
    }

    final com.google.android.gms.internal.ads.NH0 a0(android.net.Uri uri) {
        com.google.android.gms.internal.ads.I1 i6 = new com.google.android.gms.internal.ads.I1();
        i6.b(uri);
        com.google.android.gms.internal.ads.Q7 q7C = i6.c();
        com.google.android.gms.internal.ads.C5227tI0 c5227tI0 = this.f39698J;
        c5227tI0.a(this.f39696H.f35078f);
        return c5227tI0.b(q7C);
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void b(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.Hz0 hz0) {
        com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = (com.google.android.gms.internal.ads.InterfaceC3746fs) this.f39697I.get();
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue() || interfaceC3746fs == null) {
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("frameRate", java.lang.String.valueOf(d6.f26583x));
        map.put("bitRate", java.lang.String.valueOf(d6.f26569j));
        map.put("resolution", d6.f26581v + "x" + d6.f26582w);
        java.lang.String str = d6.f26573n;
        if (str != null) {
            map.put("videoMime", str);
        }
        java.lang.String str2 = d6.f26574o;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        java.lang.String str3 = d6.f26570k;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        interfaceC3746fs.O("onMetadataEvent", map);
    }

    final /* synthetic */ void b0(boolean z6, long j6) {
        com.google.android.gms.internal.ads.InterfaceC2951Vr interfaceC2951Vr = this.f39702N;
        if (interfaceC2951Vr != null) {
            interfaceC2951Vr.A(z6, j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void c(com.google.android.gms.internal.ads.LB0 lb0, java.lang.Object obj, long j6) {
        com.google.android.gms.internal.ads.InterfaceC2951Vr interfaceC2951Vr = this.f39702N;
        if (interfaceC2951Vr != null) {
            interfaceC2951Vr.v();
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.AB0[] c0(android.os.Handler handler, com.google.android.gms.internal.ads.G g6, com.google.android.gms.internal.ads.KE0 ke0, com.google.android.gms.internal.ads.SI0 si0, com.google.android.gms.internal.ads.InterfaceC4126jH0 interfaceC4126jH0) {
        com.google.android.gms.internal.ads.PG0 pg0 = com.google.android.gms.internal.ads.PG0.f30680a;
        android.content.Context context = this.f39693E;
        com.google.android.gms.internal.ads.KF0 kf0 = new com.google.android.gms.internal.ads.KF0(context, new com.google.android.gms.internal.ads.C4674oG0(context), pg0, false, handler, ke0, new com.google.android.gms.internal.ads.C4014iF0(context).d());
        android.content.Context context2 = this.f39693E;
        return new com.google.android.gms.internal.ads.AB0[]{kf0, new com.google.android.gms.internal.ads.HK0(context2, new com.google.android.gms.internal.ads.C4674oG0(context2), pg0, 0L, false, handler, g6, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final /* synthetic */ void d(com.google.android.gms.internal.ads.InterfaceC5045rj interfaceC5045rj, com.google.android.gms.internal.ads.MB0 mb0) {
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void e(com.google.android.gms.internal.ads.LB0 lb0, int i6, long j6) {
        this.f39704P += i6;
    }

    @Override // com.google.android.gms.internal.ads.Pv0
    public final void f(com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, boolean z6) {
    }

    public final void finalize() {
        com.google.android.gms.internal.ads.AbstractC2987Wr.u().decrementAndGet();
        if (p214v3.AbstractC7265q0.m()) {
            p214v3.AbstractC7265q0.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void g(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.C2697Os c2697Os) {
        com.google.android.gms.internal.ads.InterfaceC2951Vr interfaceC2951Vr = this.f39702N;
        if (interfaceC2951Vr != null) {
            interfaceC2951Vr.x(c2697Os.f30583a, c2697Os.f30584b);
        }
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void h(com.google.android.gms.internal.ads.LB0 lb0, int i6) {
        com.google.android.gms.internal.ads.InterfaceC2951Vr interfaceC2951Vr = this.f39702N;
        if (interfaceC2951Vr != null) {
            interfaceC2951Vr.y(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.Pv0
    public final void i(com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, boolean z6, int i6) {
        this.f39703O += i6;
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void j(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.AbstractC2715Pf abstractC2715Pf) {
        com.google.android.gms.internal.ads.InterfaceC2951Vr interfaceC2951Vr = this.f39702N;
        if (interfaceC2951Vr != null) {
            interfaceC2951Vr.B("onPlayerError", abstractC2715Pf);
        }
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final /* synthetic */ void k(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.C5043ri c5043ri, com.google.android.gms.internal.ads.C5043ri c5043ri2, int i6) {
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final /* synthetic */ void l(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.Gz0 gz0) {
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void m(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.BH0 bh0, com.google.android.gms.internal.ads.HH0 hh0, java.io.IOException iOException, boolean z6) {
        com.google.android.gms.internal.ads.InterfaceC2951Vr interfaceC2951Vr = this.f39702N;
        if (interfaceC2951Vr != null) {
            if (this.f39696H.f35082j) {
                interfaceC2951Vr.z("onLoadException", iOException);
            } else {
                interfaceC2951Vr.B("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void n(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.Hz0 hz0) {
        com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = (com.google.android.gms.internal.ads.InterfaceC3746fs) this.f39697I.get();
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue() || interfaceC3746fs == null) {
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String str = d6.f26573n;
        if (str != null) {
            map.put("audioMime", str);
        }
        java.lang.String str2 = d6.f26574o;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        java.lang.String str3 = d6.f26570k;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        interfaceC3746fs.O("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.Pv0
    public final void o(com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final /* synthetic */ void p(com.google.android.gms.internal.ads.LB0 lb0, int i6, long j6, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.Pv0
    public final void q(com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, boolean z6) {
        if (interfaceC4825pi0 instanceof com.google.android.gms.internal.ads.InterfaceC5396ut0) {
            synchronized (this.f39708T) {
                this.f39710V.add((com.google.android.gms.internal.ads.InterfaceC5396ut0) interfaceC4825pi0);
            }
        } else if (interfaceC4825pi0 instanceof com.google.android.gms.internal.ads.C3968ht) {
            this.f39711W = (com.google.android.gms.internal.ads.C3968ht) interfaceC4825pi0;
            final com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = (com.google.android.gms.internal.ads.InterfaceC3746fs) this.f39697I.get();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue() && interfaceC3746fs != null && this.f39711W.n()) {
                final java.util.HashMap map = new java.util.HashMap();
                map.put("gcacheHit", java.lang.String.valueOf(this.f39711W.p()));
                map.put("gcacheDownloaded", java.lang.String.valueOf(this.f39711W.o()));
                p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.st
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = com.google.android.gms.internal.ads.C5615wt.f39692Y;
                        interfaceC3746fs.O("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final long r() {
        if (d0()) {
            return 0L;
        }
        return this.f39703O;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final long s() {
        if (d0()) {
            return this.f39711W.l();
        }
        synchronized (this.f39708T) {
            while (!this.f39710V.isEmpty()) {
                long j6 = this.f39705Q;
                java.util.Map mapD = ((com.google.android.gms.internal.ads.InterfaceC5396ut0) this.f39710V.remove(0)).d();
                long j10 = 0;
                if (mapD != null) {
                    for (java.util.Map.Entry entry : mapD.entrySet()) {
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && com.google.android.gms.internal.ads.AbstractC3723fg0.c("content-length", (java.lang.CharSequence) entry.getKey()) && entry.getValue() != null && ((java.util.List) entry.getValue()).get(0) != null) {
                                    j10 = java.lang.Long.parseLong((java.lang.String) ((java.util.List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (java.lang.NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f39705Q = j6 + j10;
            }
        }
        return this.f39705Q;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final java.lang.Integer t() {
        return this.f39709U;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void w(android.net.Uri[] uriArr, java.lang.String str) {
        x(uriArr, str, java.nio.ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void x(android.net.Uri[] uriArr, java.lang.String str, java.nio.ByteBuffer byteBuffer, boolean z6) {
        com.google.android.gms.internal.ads.NH0 c3471dI0;
        if (this.f39699K != null) {
            this.f39700L = byteBuffer;
            this.f39701M = z6;
            int length = uriArr.length;
            if (length == 1) {
                c3471dI0 = a0(uriArr[0]);
            } else {
                com.google.android.gms.internal.ads.NH0[] nh0Arr = new com.google.android.gms.internal.ads.NH0[length];
                for (int i6 = 0; i6 < uriArr.length; i6++) {
                    nh0Arr[i6] = a0(uriArr[i6]);
                }
                c3471dI0 = new com.google.android.gms.internal.ads.C3471dI0(false, false, new com.google.android.gms.internal.ads.C5445vH0(), nh0Arr);
            }
            this.f39699K.M(c3471dI0);
            this.f39699K.q();
            com.google.android.gms.internal.ads.AbstractC2987Wr.v().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void y() {
        com.google.android.gms.internal.ads.InterfaceC3236bA0 interfaceC3236bA0 = this.f39699K;
        if (interfaceC3236bA0 != null) {
            interfaceC3236bA0.L(this);
            this.f39699K.J();
            this.f39699K = null;
            com.google.android.gms.internal.ads.AbstractC2987Wr.v().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2987Wr
    public final void z(long j6) {
        com.google.android.gms.internal.ads.AbstractC4937qj0 abstractC4937qj0 = (com.google.android.gms.internal.ads.AbstractC4937qj0) this.f39699K;
        abstractC4937qj0.r(abstractC4937qj0.f(), j6, 5, false);
    }
}
