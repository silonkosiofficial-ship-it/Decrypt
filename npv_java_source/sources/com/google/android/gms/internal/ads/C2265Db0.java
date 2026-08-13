package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Db0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2265Db0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2708Pb0 f26744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.webkit.WebView f26745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f26746c = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f26747d = new java.util.HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f26748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f26749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EnumC2302Eb0 f26750g;

    private C2265Db0(com.google.android.gms.internal.ads.C2708Pb0 c2708Pb0, android.webkit.WebView webView, java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.EnumC2302Eb0 enumC2302Eb0) {
        this.f26744a = c2708Pb0;
        this.f26745b = webView;
        this.f26750g = enumC2302Eb0;
        this.f26749f = str2;
        this.f26748e = str3;
    }

    public static com.google.android.gms.internal.ads.C2265Db0 b(com.google.android.gms.internal.ads.C2708Pb0 c2708Pb0, android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            com.google.android.gms.internal.ads.AbstractC5692xc0.d(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new com.google.android.gms.internal.ads.C2265Db0(c2708Pb0, webView, null, null, str, str2, com.google.android.gms.internal.ads.EnumC2302Eb0.HTML);
    }

    public static com.google.android.gms.internal.ads.C2265Db0 c(com.google.android.gms.internal.ads.C2708Pb0 c2708Pb0, android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.AbstractC5692xc0.d("", 256, "CustomReferenceData is greater than 256 characters");
        return new com.google.android.gms.internal.ads.C2265Db0(c2708Pb0, webView, null, null, str, "", com.google.android.gms.internal.ads.EnumC2302Eb0.JAVASCRIPT);
    }

    public final android.webkit.WebView a() {
        return this.f26745b;
    }

    public final com.google.android.gms.internal.ads.EnumC2302Eb0 d() {
        return this.f26750g;
    }

    public final com.google.android.gms.internal.ads.C2708Pb0 e() {
        return this.f26744a;
    }

    public final java.lang.String f() {
        return this.f26749f;
    }

    public final java.lang.String g() {
        return this.f26748e;
    }

    public final java.util.List h() {
        return j$.util.DesugarCollections.unmodifiableList(this.f26746c);
    }

    public final java.util.Map i() {
        return j$.util.DesugarCollections.unmodifiableMap(this.f26747d);
    }
}
