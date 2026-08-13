package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class QY implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p184s3.c2 f31005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f31006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f31008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f31009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f31012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f31013i;

    public QY(p184s3.c2 c2Var, java.lang.String str, boolean z6, java.lang.String str2, float f6, int i6, int i10, java.lang.String str3, boolean z10) {
        Q3.AbstractC1477p.m(c2Var, "the adSize must not be null");
        this.f31005a = c2Var;
        this.f31006b = str;
        this.f31007c = z6;
        this.f31008d = str2;
        this.f31009e = f6;
        this.f31010f = i6;
        this.f31011g = i10;
        this.f31012h = str3;
        this.f31013i = z10;
    }

    private final void a(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.B70.f(bundle, "smart_w", "full", this.f31005a.f54202G == -1);
        com.google.android.gms.internal.ads.B70.f(bundle, "smart_h", "auto", this.f31005a.f54199D == -2);
        com.google.android.gms.internal.ads.B70.g(bundle, "ene", true, this.f31005a.f54207L);
        com.google.android.gms.internal.ads.B70.f(bundle, "rafmt", "102", this.f31005a.f54210O);
        com.google.android.gms.internal.ads.B70.f(bundle, "rafmt", "103", this.f31005a.f54211P);
        com.google.android.gms.internal.ads.B70.f(bundle, "rafmt", "105", this.f31005a.f54212Q);
        com.google.android.gms.internal.ads.B70.g(bundle, "inline_adaptive_slot", true, this.f31013i);
        com.google.android.gms.internal.ads.B70.g(bundle, "interscroller_slot", true, this.f31005a.f54212Q);
        com.google.android.gms.internal.ads.B70.c(bundle, "format", this.f31006b);
        com.google.android.gms.internal.ads.B70.f(bundle, "fluid", "height", this.f31007c);
        com.google.android.gms.internal.ads.B70.f(bundle, "sz", this.f31008d, !android.text.TextUtils.isEmpty(this.f31008d));
        bundle.putFloat("u_sd", this.f31009e);
        bundle.putInt("sw", this.f31010f);
        bundle.putInt("sh", this.f31011g);
        com.google.android.gms.internal.ads.B70.f(bundle, "sc", this.f31012h, !android.text.TextUtils.isEmpty(this.f31012h));
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        p184s3.c2[] c2VarArr = this.f31005a.f54204I;
        if (c2VarArr == null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("height", this.f31005a.f54199D);
            bundle2.putInt("width", this.f31005a.f54202G);
            bundle2.putBoolean("is_fluid_height", this.f31005a.f54206K);
            arrayList.add(bundle2);
        } else {
            for (p184s3.c2 c2Var : c2VarArr) {
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putBoolean("is_fluid_height", c2Var.f54206K);
                bundle3.putInt("height", c2Var.f54199D);
                bundle3.putInt("width", c2Var.f54202G);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
        a(((com.google.android.gms.internal.ads.C3677fC) obj).f35302b);
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void c(java.lang.Object obj) {
        a(((com.google.android.gms.internal.ads.C3677fC) obj).f35301a);
    }
}
