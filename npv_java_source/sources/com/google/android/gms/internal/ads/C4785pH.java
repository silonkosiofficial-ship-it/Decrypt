package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4785pH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.ZH f37954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f37955b;

    public C4785pH(com.google.android.gms.internal.ads.ZH zh, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        this.f37954a = zh;
        this.f37955b = interfaceC2698Ot;
    }

    public final android.view.View a() {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f37955b;
        if (interfaceC2698Ot == null) {
            return null;
        }
        return interfaceC2698Ot.i0();
    }

    public final android.view.View b() {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f37955b;
        if (interfaceC2698Ot != null) {
            return interfaceC2698Ot.i0();
        }
        return null;
    }

    public final com.google.android.gms.internal.ads.InterfaceC2698Ot c() {
        return this.f37955b;
    }

    public final com.google.android.gms.internal.ads.EG d(java.util.concurrent.Executor executor) {
        final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f37955b;
        return new com.google.android.gms.internal.ads.EG(new com.google.android.gms.internal.ads.ZE() { // from class: com.google.android.gms.internal.ads.oH
            @Override // com.google.android.gms.internal.ads.ZE
            public final void a() {
                p204u3.x xVarP;
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = interfaceC2698Ot;
                if (interfaceC2698Ot2 == null || (xVarP = interfaceC2698Ot2.P()) == null) {
                    return;
                }
                xVarP.b();
            }
        }, executor);
    }

    public final com.google.android.gms.internal.ads.ZH e() {
        return this.f37954a;
    }

    public java.util.Set f(com.google.android.gms.internal.ads.YB yb) {
        return java.util.Collections.singleton(new com.google.android.gms.internal.ads.EG(yb, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g));
    }

    public java.util.Set g(com.google.android.gms.internal.ads.YB yb) {
        return java.util.Collections.singleton(new com.google.android.gms.internal.ads.EG(yb, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g));
    }
}
