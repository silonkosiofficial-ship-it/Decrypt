package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3990i30 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.String f36221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f36222b;

    /* synthetic */ C3990i30(java.lang.String str, int i6, com.google.android.gms.internal.ads.AbstractC3880h30 abstractC3880h30) {
        this.f36221a = str;
        this.f36222b = i6;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.na)).booleanValue()) {
            if (!android.text.TextUtils.isEmpty(this.f36221a)) {
                c3677fC.f35301a.putString("topics", this.f36221a);
            }
            int i6 = this.f36222b;
            if (i6 != -1) {
                c3677fC.f35301a.putInt("atps", i6);
            }
        }
    }
}
