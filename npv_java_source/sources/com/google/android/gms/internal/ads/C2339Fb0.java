package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2339Fb0 extends com.google.android.gms.internal.ads.AbstractC2191Bb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2265Db0 f27411a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2673Oc0 f27413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC4593nc0 f27414d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f27417g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3167ac0 f27412b = new com.google.android.gms.internal.ads.C3167ac0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27415e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27416f = false;

    C2339Fb0(com.google.android.gms.internal.ads.C2228Cb0 c2228Cb0, com.google.android.gms.internal.ads.C2265Db0 c2265Db0, java.lang.String str) {
        this.f27411a = c2265Db0;
        this.f27417g = str;
        k(null);
        if (c2265Db0.d() == com.google.android.gms.internal.ads.EnumC2302Eb0.HTML || c2265Db0.d() == com.google.android.gms.internal.ads.EnumC2302Eb0.JAVASCRIPT) {
            this.f27414d = new com.google.android.gms.internal.ads.C4703oc0(str, c2265Db0.a());
        } else {
            this.f27414d = new com.google.android.gms.internal.ads.C5032rc0(str, c2265Db0.i(), null);
        }
        this.f27414d.o();
        com.google.android.gms.internal.ads.C2963Wb0.a().d(this);
        this.f27414d.f(c2228Cb0);
    }

    private final void k(android.view.View view) {
        this.f27413c = new com.google.android.gms.internal.ads.C2673Oc0(view);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2191Bb0
    public final void b(android.view.View view, com.google.android.gms.internal.ads.EnumC2450Ib0 enumC2450Ib0, java.lang.String str) {
        if (this.f27416f) {
            return;
        }
        this.f27412b.b(view, enumC2450Ib0, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2191Bb0
    public final void c() {
        if (this.f27416f) {
            return;
        }
        this.f27413c.clear();
        if (!this.f27416f) {
            this.f27412b.c();
        }
        this.f27416f = true;
        this.f27414d.e();
        com.google.android.gms.internal.ads.C2963Wb0.a().e(this);
        this.f27414d.c();
        this.f27414d = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2191Bb0
    public final void d(android.view.View view) {
        if (this.f27416f || f() == view) {
            return;
        }
        k(view);
        this.f27414d.b();
        java.util.Collection<com.google.android.gms.internal.ads.C2339Fb0> collectionC = com.google.android.gms.internal.ads.C2963Wb0.a().c();
        if (collectionC == null || collectionC.isEmpty()) {
            return;
        }
        for (com.google.android.gms.internal.ads.C2339Fb0 c2339Fb0 : collectionC) {
            if (c2339Fb0 != this && c2339Fb0.f() == view) {
                c2339Fb0.f27413c.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2191Bb0
    public final void e() {
        if (this.f27415e || this.f27414d == null) {
            return;
        }
        this.f27415e = true;
        com.google.android.gms.internal.ads.C2963Wb0.a().f(this);
        this.f27414d.l(com.google.android.gms.internal.ads.C3605ec0.c().b());
        this.f27414d.g(com.google.android.gms.internal.ads.C2891Ub0.b().c());
        this.f27414d.i(this, this.f27411a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View f() {
        return (android.view.View) this.f27413c.get();
    }

    public final com.google.android.gms.internal.ads.AbstractC4593nc0 g() {
        return this.f27414d;
    }

    public final java.lang.String h() {
        return this.f27417g;
    }

    public final java.util.List i() {
        return this.f27412b.a();
    }

    public final boolean j() {
        return this.f27415e && !this.f27416f;
    }
}
