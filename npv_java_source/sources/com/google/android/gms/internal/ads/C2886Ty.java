package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2886Ty extends com.google.android.gms.internal.ads.AbstractC2777Qy {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final android.content.Context f32048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final android.view.View f32049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f32050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.S60 f32051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3454dA f32052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4789pJ f32053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.OG f32054p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Uy0 f32055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final java.util.concurrent.Executor f32056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p184s3.c2 f32057s;

    C2886Ty(com.google.android.gms.internal.ads.C3563eA c3563eA, android.content.Context context, com.google.android.gms.internal.ads.S60 s60, android.view.View view, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC3454dA interfaceC3454dA, com.google.android.gms.internal.ads.C4789pJ c4789pJ, com.google.android.gms.internal.ads.OG og, com.google.android.gms.internal.ads.Uy0 uy0, java.util.concurrent.Executor executor) {
        super(c3563eA);
        this.f32048j = context;
        this.f32049k = view;
        this.f32050l = interfaceC2698Ot;
        this.f32051m = s60;
        this.f32052n = interfaceC3454dA;
        this.f32053o = c4789pJ;
        this.f32054p = og;
        this.f32055q = uy0;
        this.f32056r = executor;
    }

    public static /* synthetic */ void q(com.google.android.gms.internal.ads.C2886Ty c2886Ty) {
        com.google.android.gms.internal.ads.InterfaceC3082Zh interfaceC3082ZhE = c2886Ty.f32053o.e();
        if (interfaceC3082ZhE == null) {
            return;
        }
        try {
            interfaceC3082ZhE.R1((p184s3.V) c2886Ty.f32055q.b(), X3.b.c2(c2886Ty.f32048j));
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("RemoteException when notifyAdLoad is called", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3673fA
    public final void b() {
        this.f32056r.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Sy
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.C2886Ty.q(this.f31818C);
            }
        });
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final int i() {
        return this.f35290a.f34899b.f34448b.f32116d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final int j() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25313J7)).booleanValue() && this.f35291b.f31173g0) {
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25324K7)).booleanValue()) {
                return 0;
            }
        }
        return this.f35290a.f34899b.f34448b.f32115c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final android.view.View k() {
        return this.f32049k;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final p184s3.Y0 l() {
        try {
            return this.f32052n.a();
        } catch (com.google.android.gms.internal.ads.C5315u70 unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final com.google.android.gms.internal.ads.S60 m() {
        p184s3.c2 c2Var = this.f32057s;
        if (c2Var != null) {
            return com.google.android.gms.internal.ads.AbstractC5205t70.b(c2Var);
        }
        com.google.android.gms.internal.ads.R60 r60 = this.f35291b;
        if (r60.f31165c0) {
            for (java.lang.String str : r60.f31160a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            android.view.View view = this.f32049k;
            return new com.google.android.gms.internal.ads.S60(view.getWidth(), view.getHeight(), false);
        }
        return (com.google.android.gms.internal.ads.S60) this.f35291b.f31194r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final com.google.android.gms.internal.ads.S60 n() {
        return this.f32051m;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final void o() {
        this.f32054p.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final void p(android.view.ViewGroup viewGroup, p184s3.c2 c2Var) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot;
        if (viewGroup == null || (interfaceC2698Ot = this.f32050l) == null) {
            return;
        }
        interfaceC2698Ot.l1(com.google.android.gms.internal.ads.C2625Mu.c(c2Var));
        viewGroup.setMinimumHeight(c2Var.f54200E);
        viewGroup.setMinimumWidth(c2Var.f54203H);
        this.f32057s = c2Var;
    }
}
