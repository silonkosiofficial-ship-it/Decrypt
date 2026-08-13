package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2222Bx implements com.google.android.gms.internal.ads.InterfaceC3131aD {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.M70 f26103C;

    public C2222Bx(com.google.android.gms.internal.ads.M70 m70) {
        this.f26103C = m70;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final void g(android.content.Context context) {
        try {
            this.f26103C.l();
        } catch (com.google.android.gms.internal.ads.C5315u70 e6) {
            p224w3.p.h("Cannot invoke onDestroy for the mediation adapter.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final void k(android.content.Context context) {
        try {
            this.f26103C.y();
        } catch (com.google.android.gms.internal.ads.C5315u70 e6) {
            p224w3.p.h("Cannot invoke onPause for the mediation adapter.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final void r(android.content.Context context) {
        try {
            this.f26103C.z();
            if (context != null) {
                this.f26103C.x(context);
            }
        } catch (com.google.android.gms.internal.ads.C5315u70 e6) {
            p224w3.p.h("Cannot invoke onResume for the mediation adapter.", e6);
        }
    }
}
