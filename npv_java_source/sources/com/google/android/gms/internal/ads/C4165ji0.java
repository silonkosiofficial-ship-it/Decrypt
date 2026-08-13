package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ji0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4165ji0 extends com.google.android.gms.internal.ads.AbstractC3287bh0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ java.util.Iterator f36718E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2201Bg0 f36719F;

    C4165ji0(java.util.Iterator it, com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0) {
        this.f36718E = it;
        this.f36719F = interfaceC2201Bg0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287bh0
    protected final java.lang.Object a() {
        while (this.f36718E.hasNext()) {
            java.util.Iterator it = this.f36718E;
            com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0 = this.f36719F;
            java.lang.Object next = it.next();
            if (interfaceC2201Bg0.b(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
