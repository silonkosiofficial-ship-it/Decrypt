package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2856Tc implements Q3.AbstractC1464c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2928Vc f31963a;

    C2856Tc(com.google.android.gms.internal.ads.C2928Vc c2928Vc) {
        this.f31963a = c2928Vc;
    }

    @Override // Q3.AbstractC1464c.a
    public final void L0(android.os.Bundle bundle) {
        synchronized (this.f31963a.f32526c) {
            try {
                com.google.android.gms.internal.ads.C2928Vc c2928Vc = this.f31963a;
                if (c2928Vc.f32527d != null) {
                    c2928Vc.f32529f = c2928Vc.f32527d.k0();
                }
            } catch (android.os.DeadObjectException e6) {
                p224w3.p.e("Unable to obtain a cache service instance.", e6);
                com.google.android.gms.internal.ads.C2928Vc.h(this.f31963a);
            }
            this.f31963a.f32526c.notifyAll();
        }
    }

    @Override // Q3.AbstractC1464c.a
    public final void y0(int i6) {
        synchronized (this.f31963a.f32526c) {
            this.f31963a.f32529f = null;
            this.f31963a.f32526c.notifyAll();
        }
    }
}
