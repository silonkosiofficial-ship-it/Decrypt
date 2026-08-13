package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4147jZ implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p184s3.i2 f36693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36694b;

    public C4147jZ(p184s3.i2 i2Var, boolean z6) {
        this.f36693a = i2Var;
        this.f36694b = z6;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        java.lang.String str;
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25657p5)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f36694b);
        }
        p184s3.i2 i2Var = this.f36693a;
        if (i2Var != null) {
            int i6 = i2Var.f54278C;
            if (i6 == 1) {
                str = "p";
            } else if (i6 != 2) {
                return;
            } else {
                str = "l";
            }
            bundle.putString("avo", str);
        }
    }
}
