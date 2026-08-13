package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2913Up implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ P4.d f32269a;

    C2913Up(com.google.android.gms.internal.ads.C2949Vp c2949Vp, P4.d dVar) {
        this.f32269a = dVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.C2949Vp.f32574l.remove(this.f32269a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C2949Vp.f32574l.remove(this.f32269a);
    }
}
