package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3154aS implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5825yo f34077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2472Io f34078b;

    C3154aS(com.google.android.gms.internal.ads.BinderC3812gS binderC3812gS, com.google.android.gms.internal.ads.C2472Io c2472Io, com.google.android.gms.internal.ads.C5825yo c5825yo) {
        this.f34078b = c2472Io;
        this.f34077a = c5825yo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        try {
            this.f34078b.C3(p214v3.D.f(th));
        } catch (android.os.RemoteException e6) {
            p214v3.AbstractC7265q0.l("Service can't call client", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        try {
            this.f34078b.d2((java.lang.String) obj, this.f34077a);
        } catch (android.os.RemoteException e6) {
            p214v3.AbstractC7265q0.l("Service can't call client", e6);
        }
    }
}
