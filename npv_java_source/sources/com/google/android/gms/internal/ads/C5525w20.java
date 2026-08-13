package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5525w20 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f39505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f39506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f39507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f39508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Long f39509e;

    public C5525w20(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l6) {
        this.f39505a = str;
        this.f39506b = str2;
        this.f39507c = str3;
        this.f39508d = str4;
        this.f39509e = l6;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        com.google.android.gms.internal.ads.B70.c(((com.google.android.gms.internal.ads.C3677fC) obj).f35302b, "fbs_aeid", this.f39507c);
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        com.google.android.gms.internal.ads.B70.c(bundle, "gmp_app_id", this.f39505a);
        com.google.android.gms.internal.ads.B70.c(bundle, "fbs_aiid", this.f39506b);
        com.google.android.gms.internal.ads.B70.c(bundle, "fbs_aeid", this.f39507c);
        com.google.android.gms.internal.ads.B70.c(bundle, "apm_id_origin", this.f39508d);
        java.lang.Long l6 = this.f39509e;
        if (l6 != null) {
            bundle.putLong("sai_timeout", l6.longValue());
        }
    }
}
