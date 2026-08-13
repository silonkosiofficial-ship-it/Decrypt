package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5153si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p134n3.m f38789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p134n3.l f38790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2461Ih f38791c;

    public C5153si(p134n3.m mVar, p134n3.l lVar) {
        this.f38789a = mVar;
        this.f38790b = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized com.google.android.gms.internal.ads.C2461Ih f(com.google.android.gms.internal.ads.InterfaceC2424Hh interfaceC2424Hh) {
        com.google.android.gms.internal.ads.C2461Ih c2461Ih = this.f38791c;
        if (c2461Ih != null) {
            return c2461Ih;
        }
        com.google.android.gms.internal.ads.C2461Ih c2461Ih2 = new com.google.android.gms.internal.ads.C2461Ih(interfaceC2424Hh);
        this.f38791c = c2461Ih2;
        return c2461Ih2;
    }

    public final com.google.android.gms.internal.ads.InterfaceC2830Sh c() {
        com.google.android.gms.internal.ads.AbstractC4934qi abstractC4934qi = null;
        if (this.f38790b == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.BinderC4714oi(this, abstractC4934qi);
    }

    public final com.google.android.gms.internal.ads.InterfaceC2938Vh d() {
        return new com.google.android.gms.internal.ads.BinderC4824pi(this, null);
    }
}
