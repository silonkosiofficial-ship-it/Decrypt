package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4204k10 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Integer f36885a;

    public C4204k10(java.lang.Integer num) {
        this.f36885a = num;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        java.lang.Integer num = this.f36885a;
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (num != null) {
            c3677fC.f35301a.putInt("dspct", java.lang.Math.min(num.intValue(), 20));
        }
    }
}
