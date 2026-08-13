package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5523w10 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Boolean f39499a;

    public C5523w10(java.lang.Boolean bool) {
        this.f39499a = bool;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        int i6;
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        java.lang.Boolean bool = this.f39499a;
        if (bool == null) {
            i6 = -1;
        } else {
            i6 = bool.booleanValue() ? 1 : 0;
        }
        bundle.putInt("lft", i6);
    }
}
