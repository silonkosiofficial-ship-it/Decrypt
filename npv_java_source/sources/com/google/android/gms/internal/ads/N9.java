package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class N9 implements com.google.android.gms.internal.ads.InterfaceC5914zd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2929Vc0 f30184a;

    N9(com.google.android.gms.internal.ads.C2929Vc0 c2929Vc0) {
        this.f30184a = c2929Vc0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5914zd0
    public final void a(int i6, long j6, java.lang.String str) {
        this.f30184a.e(i6, java.lang.System.currentTimeMillis() - j6, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5914zd0
    public final void e(int i6, long j6) {
        this.f30184a.d(i6, java.lang.System.currentTimeMillis() - j6);
    }
}
