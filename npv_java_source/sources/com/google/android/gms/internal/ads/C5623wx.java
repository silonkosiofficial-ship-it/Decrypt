package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5623wx implements com.google.android.gms.internal.ads.InterfaceC3208ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.webkit.CookieManager f39744a;

    public C5623wx(android.content.Context context) {
        this.f39744a = p174r3.v.u().a(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208ax
    public final void a(java.util.Map map) {
        java.lang.String cookie;
        if (this.f39744a == null) {
            return;
        }
        if (((java.lang.String) map.get("clear")) == null) {
            java.lang.String str = (java.lang.String) map.get("cookie");
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            this.f39744a.setCookie((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25471Y0), str);
            return;
        }
        java.lang.String str2 = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25471Y0);
        android.webkit.CookieManager cookieManager = this.f39744a;
        if (cookieManager == null || (cookie = cookieManager.getCookie(str2)) == null) {
            return;
        }
        java.util.List listF = com.google.android.gms.internal.ads.C2755Qg0.b(com.google.android.gms.internal.ads.AbstractC4271kg0.c(';')).f(cookie);
        for (int i6 = 0; i6 < listF.size(); i6++) {
            android.webkit.CookieManager cookieManager2 = this.f39744a;
            java.util.Iterator it = com.google.android.gms.internal.ads.C2755Qg0.b(com.google.android.gms.internal.ads.AbstractC4271kg0.c('=')).d((java.lang.String) listF.get(i6)).iterator();
            it.getClass();
            if (!it.hasNext()) {
                throw new java.lang.IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
            }
            cookieManager2.setCookie(str2, java.lang.String.valueOf((java.lang.String) it.next()).concat(java.lang.String.valueOf((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25317K0))));
        }
    }
}
