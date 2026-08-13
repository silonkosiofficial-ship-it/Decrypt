package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5171sr implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC4952qr f38806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC4732or f38807b;

    C5171sr(com.google.android.gms.internal.ads.AbstractC5281tr abstractC5281tr, com.google.android.gms.internal.ads.InterfaceC4952qr interfaceC4952qr, com.google.android.gms.internal.ads.InterfaceC4732or interfaceC4732or) {
        this.f38806a = interfaceC4952qr;
        this.f38807b = interfaceC4732or;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        this.f38807b.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void c(java.lang.Object obj) {
        this.f38806a.b(obj);
    }
}
