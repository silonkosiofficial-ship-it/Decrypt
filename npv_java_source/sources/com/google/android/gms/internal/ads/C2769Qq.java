package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2769Qq extends p214v3.B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2914Uq f31062c;

    C2769Qq(com.google.android.gms.internal.ads.C2914Uq c2914Uq) {
        this.f31062c = c2914Uq;
    }

    @Override // p214v3.B
    public final void a() {
        com.google.android.gms.internal.ads.C2914Uq c2914Uq = this.f31062c;
        com.google.android.gms.internal.ads.C2272Df c2272Df = new com.google.android.gms.internal.ads.C2272Df(c2914Uq.f32277e, c2914Uq.f32278f.f56217C);
        synchronized (this.f31062c.f32273a) {
            try {
                p174r3.v.h();
                com.google.android.gms.internal.ads.C2383Gf.a(this.f31062c.f32280h, c2272Df);
            } catch (java.lang.IllegalArgumentException e6) {
                p224w3.p.h("Cannot config CSI reporter.", e6);
            }
        }
    }
}
