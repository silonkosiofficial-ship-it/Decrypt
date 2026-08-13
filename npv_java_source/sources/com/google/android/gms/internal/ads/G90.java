package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class G90 implements com.google.android.gms.internal.ads.E90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f27687a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f27702p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f27688b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27689c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27690d = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27703q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27704r = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27691e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f27692f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.String f27693g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.lang.String f27694h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.lang.String f27695i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.V90 f27696j = com.google.android.gms.internal.ads.V90.SCAR_REQUEST_TYPE_UNSPECIFIED;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private java.lang.String f27697k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private java.lang.String f27698l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private java.lang.String f27699m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f27700n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f27701o = false;

    G90(android.content.Context context, int i6) {
        this.f27687a = context;
        this.f27702p = i6;
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.E90 A(int i6) {
        u(i6);
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.G90 C(p184s3.W0 w6) {
        try {
            android.os.IBinder iBinder = w6.f54149G;
            if (iBinder != null) {
                com.google.android.gms.internal.ads.BinderC5654xC binderC5654xC = (com.google.android.gms.internal.ads.BinderC5654xC) iBinder;
                java.lang.String strK = binderC5654xC.k();
                if (!android.text.TextUtils.isEmpty(strK)) {
                    this.f27692f = strK;
                }
                java.lang.String strH = binderC5654xC.h();
                if (!android.text.TextUtils.isEmpty(strH)) {
                    this.f27693g = strH;
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.G90 D(com.google.android.gms.internal.ads.C3339c70 c3339c70) {
        try {
            if (!android.text.TextUtils.isEmpty(c3339c70.f34448b.f32114b)) {
                this.f27692f = c3339c70.f34448b.f32114b;
            }
            for (com.google.android.gms.internal.ads.R60 r60 : c3339c70.f34447a) {
                if (!android.text.TextUtils.isEmpty(r60.f31163b0)) {
                    this.f27693g = r60.f31163b0;
                    break;
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.E90 E(java.lang.String str) {
        F(str);
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.G90 F(java.lang.String str) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25314J8)).booleanValue()) {
            this.f27699m = str;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.G90 G(java.lang.String str) {
        this.f27694h = str;
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.G90 H(java.lang.String str) {
        this.f27695i = str;
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.G90 I(com.google.android.gms.internal.ads.V90 v90) {
        this.f27696j = v90;
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.G90 J(boolean z6) {
        this.f27690d = z6;
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.G90 K(java.lang.Throwable th) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25314J8)).booleanValue()) {
            this.f27698l = com.google.android.gms.internal.ads.C4396lo.h(th);
            this.f27697k = (java.lang.String) com.google.android.gms.internal.ads.C2755Qg0.b(com.google.android.gms.internal.ads.AbstractC4271kg0.c('\n')).d(com.google.android.gms.internal.ads.C4396lo.g(th)).iterator().next();
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.E90 K0(boolean z6) {
        J(z6);
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.G90 L() {
        android.content.res.Configuration configuration;
        this.f27691e = p174r3.v.u().k(this.f27687a);
        android.content.res.Resources resources = this.f27687a.getResources();
        int i6 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i6 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f27704r = i6;
        this.f27688b = p174r3.v.c().c();
        this.f27701o = true;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.E90 Z(java.lang.String str) {
        G(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.E90 a(com.google.android.gms.internal.ads.C3339c70 c3339c70) {
        D(c3339c70);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.E90 b(com.google.android.gms.internal.ads.V90 v90) {
        I(v90);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.E90 c(java.lang.Throwable th) {
        K(th);
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.G90 d() {
        this.f27689c = p174r3.v.c().c();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.E90 h() {
        L();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.E90 j() {
        d();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final synchronized boolean k() {
        return this.f27701o;
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final boolean l() {
        return !android.text.TextUtils.isEmpty(this.f27694h);
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final synchronized com.google.android.gms.internal.ads.J90 m() {
        try {
            com.google.android.gms.internal.ads.H90 h90 = null;
            if (this.f27700n) {
                return null;
            }
            this.f27700n = true;
            if (!this.f27701o) {
                L();
            }
            if (this.f27689c < 0) {
                d();
            }
            return new com.google.android.gms.internal.ads.J90(this, h90);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.E90 o(java.lang.String str) {
        H(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.E90
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.E90 p(p184s3.W0 w6) {
        C(w6);
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.G90 u(int i6) {
        this.f27703q = i6;
        return this;
    }
}
