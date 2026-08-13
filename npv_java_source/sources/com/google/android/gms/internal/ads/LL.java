package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class LL {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.CC f29473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4557nD f29474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AD f29475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.MD f29476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3793gF f29477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f29478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.U60 f29479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2591Lx f29480h;

    public LL(com.google.android.gms.internal.ads.CC cc, com.google.android.gms.internal.ads.C4557nD c4557nD, com.google.android.gms.internal.ads.AD ad, com.google.android.gms.internal.ads.MD md, com.google.android.gms.internal.ads.C3793gF c3793gF, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.U60 u60, com.google.android.gms.internal.ads.C2591Lx c2591Lx) {
        this.f29473a = cc;
        this.f29474b = c4557nD;
        this.f29475c = ad;
        this.f29476d = md;
        this.f29477e = c3793gF;
        this.f29478f = r60;
        this.f29479g = u60;
        this.f29480h = c2591Lx;
    }

    public final void a(com.google.android.gms.internal.ads.PL pl) {
        final com.google.android.gms.internal.ads.C4557nD c4557nD = this.f29474b;
        com.google.android.gms.internal.ads.BL bl = pl.f30695a;
        j$.util.Objects.requireNonNull(c4557nD);
        bl.a(this.f29473a, this.f29475c, this.f29476d, this.f29477e, new p204u3.InterfaceC7202d() { // from class: com.google.android.gms.internal.ads.KL
            @Override // p204u3.InterfaceC7202d
            public final void i() {
                c4557nD.b();
            }
        });
        pl.h(this.f29478f, this.f29479g, this.f29480h);
    }
}
