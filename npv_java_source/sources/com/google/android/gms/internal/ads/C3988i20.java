package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3988i20 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f36219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36220b;

    public C3988i20(java.lang.String str, int i6) {
        this.f36219a = str;
        this.f36220b = i6;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.C3677fC) obj).f35302b.putString("request_id", this.f36219a);
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        c3677fC.f35301a.putString("request_id", this.f36219a);
        if (this.f36220b == 2) {
            c3677fC.f35301a.putInt("sod", 1);
        }
    }
}
