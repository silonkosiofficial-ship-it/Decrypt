package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Te0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2861Te0 {
    public static P4.d a(p115l4.AbstractC6931l abstractC6931l, p115l4.C6921b c6921b) {
        final com.google.android.gms.internal.ads.C2825Se0 c2825Se0 = new com.google.android.gms.internal.ads.C2825Se0(abstractC6931l, null);
        abstractC6931l.b(com.google.android.gms.internal.ads.AbstractC3733fl0.c(), new p115l4.InterfaceC6925f() { // from class: com.google.android.gms.internal.ads.Re0
            @Override // p115l4.InterfaceC6925f
            public final void a(p115l4.AbstractC6931l abstractC6931l2) {
                com.google.android.gms.internal.ads.C2825Se0 c2825Se1 = c2825Se0;
                if (abstractC6931l2.m()) {
                    c2825Se1.cancel(false);
                    return;
                }
                if (abstractC6931l2.o()) {
                    c2825Se1.f(abstractC6931l2.l());
                    return;
                }
                java.lang.Exception excK = abstractC6931l2.k();
                if (excK == null) {
                    throw new java.lang.IllegalStateException();
                }
                c2825Se1.h(excK);
            }
        });
        return c2825Se0;
    }
}
