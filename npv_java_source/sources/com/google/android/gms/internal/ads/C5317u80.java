package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5317u80 implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5647x80 f39122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5757y80 f39123b;

    C5317u80(com.google.android.gms.internal.ads.C5757y80 c5757y80, com.google.android.gms.internal.ads.InterfaceC5647x80 interfaceC5647x80) {
        this.f39122a = interfaceC5647x80;
        this.f39123b = c5757y80;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        synchronized (this.f39123b) {
            this.f39123b.f39999e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        synchronized (this.f39123b) {
            try {
                this.f39123b.f39999e = null;
                this.f39123b.f39998d.addFirst(this.f39122a);
                com.google.android.gms.internal.ads.C5757y80 c5757y80 = this.f39123b;
                if (c5757y80.f40000f == 1) {
                    c5757y80.h();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
