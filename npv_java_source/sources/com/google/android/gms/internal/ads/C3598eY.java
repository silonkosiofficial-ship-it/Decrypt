package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3598eY implements com.google.android.gms.internal.ads.InterfaceC4256kY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3708fY f35002a;

    C3598eY(com.google.android.gms.internal.ads.C3708fY c3708fY) {
        this.f35002a = c3708fY;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4256kY
    public final void a() {
        synchronized (this.f35002a) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4256kY
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.AbstractC3673fA abstractC3673fA = (com.google.android.gms.internal.ads.AbstractC3673fA) obj;
        synchronized (this.f35002a) {
            this.f35002a.f35358c = abstractC3673fA.c();
            abstractC3673fA.b();
        }
    }
}
