package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3803gK implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3913hK f35583a;

    C3803gK(com.google.android.gms.internal.ads.C3913hK c3913hK) {
        this.f35583a = c3913hK;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25627m5)).booleanValue()) {
            p174r3.v.s().x(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(java.util.List list) {
        try {
            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) list.get(0);
            if (interfaceC2698Ot != null) {
                this.f35583a.b(interfaceC2698Ot);
            }
        } catch (java.lang.ClassCastException | java.lang.IndexOutOfBoundsException e6) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25627m5)).booleanValue()) {
                p174r3.v.s().x(e6, "omid native display exp");
            }
        }
    }
}
