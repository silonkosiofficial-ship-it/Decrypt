package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3373cS implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2730Po f34496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2435Ho f34497b;

    C3373cS(com.google.android.gms.internal.ads.BinderC3812gS binderC3812gS, com.google.android.gms.internal.ads.C2730Po c2730Po, com.google.android.gms.internal.ads.InterfaceC2435Ho interfaceC2435Ho) {
        this.f34496a = c2730Po;
        this.f34497b = interfaceC2435Ho;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        try {
            this.f34497b.C3(p214v3.D.f(th));
        } catch (android.os.RemoteException e6) {
            p214v3.AbstractC7265q0.l("Service can't call client", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle;
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) obj;
        try {
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue()) {
                this.f34497b.H3(parcelFileDescriptor);
                return;
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25614l2)).booleanValue() && (bundle = this.f34496a.f30805O) != null) {
                bundle.putLong(com.google.android.gms.internal.ads.MN.BINDER_CALL_START.e(), p174r3.v.c().a());
            }
            this.f34497b.C5(parcelFileDescriptor, this.f34496a);
        } catch (android.os.RemoteException e6) {
            p214v3.AbstractC7265q0.l("Service can't call client", e6);
        }
    }
}
