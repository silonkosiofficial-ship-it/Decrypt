package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Y10 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f33255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Integer f33256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f33257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f33258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f33259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f33260f;

    public Y10(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f33255a = str;
        this.f33256b = num;
        this.f33257c = str2;
        this.f33258d = str3;
        this.f33259e = str4;
        this.f33260f = str5;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35302b;
        com.google.android.gms.internal.ads.B70.c(bundle, "pn", this.f33255a);
        com.google.android.gms.internal.ads.B70.c(bundle, "dl", this.f33258d);
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        com.google.android.gms.internal.ads.B70.c(bundle, "pn", this.f33255a);
        java.lang.Integer num = this.f33256b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        com.google.android.gms.internal.ads.B70.c(bundle, "vnm", this.f33257c);
        com.google.android.gms.internal.ads.B70.c(bundle, "dl", this.f33258d);
        com.google.android.gms.internal.ads.B70.c(bundle, "ins_pn", this.f33259e);
        com.google.android.gms.internal.ads.B70.c(bundle, "ini_pn", this.f33260f);
    }
}
