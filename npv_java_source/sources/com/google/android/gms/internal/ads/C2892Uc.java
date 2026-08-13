package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2892Uc implements Q3.AbstractC1464c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2928Vc f32243a;

    C2892Uc(com.google.android.gms.internal.ads.C2928Vc c2928Vc) {
        this.f32243a = c2928Vc;
    }

    @Override // Q3.AbstractC1464c.b
    public final void q0(N3.C1389b c1389b) {
        synchronized (this.f32243a.f32526c) {
            try {
                this.f32243a.f32529f = null;
                com.google.android.gms.internal.ads.C2928Vc c2928Vc = this.f32243a;
                if (c2928Vc.f32527d != null) {
                    c2928Vc.f32527d = null;
                }
                this.f32243a.f32526c.notifyAll();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
