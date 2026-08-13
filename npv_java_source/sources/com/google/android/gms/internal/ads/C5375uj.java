package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5375uj implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC4030iQ f39210a;

    public C5375uj(com.google.android.gms.internal.ads.BinderC4030iQ binderC4030iQ) {
        this.f39210a = binderC4030iQ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25630m9)).booleanValue()) {
            java.lang.String str = (java.lang.String) map.get("action");
            java.lang.String str2 = (java.lang.String) map.get("adUnitId");
            java.lang.String str3 = (java.lang.String) map.get("redirectUrl");
            if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
                return;
            }
            java.lang.String str4 = (java.lang.String) map.get("format");
            if (str.equals("load") && !android.text.TextUtils.isEmpty(str4)) {
                this.f39210a.t6(str2, str4, str3);
            } else if (str.equals("show")) {
                this.f39210a.u6(str2, str3);
            }
        }
    }
}
