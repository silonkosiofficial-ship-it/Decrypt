package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2883Tv implements com.google.android.gms.internal.ads.IO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Long f32037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f32038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2331Ev f32039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2955Vv f32040d;

    /* synthetic */ C2883Tv(com.google.android.gms.internal.ads.C2331Ev c2331Ev, com.google.android.gms.internal.ads.C2955Vv c2955Vv, java.lang.Long l6, java.lang.String str, com.google.android.gms.internal.ads.AbstractC4302kw abstractC4302kw) {
        this.f32039c = c2331Ev;
        this.f32040d = c2955Vv;
        this.f32037a = l6;
        this.f32038b = str;
    }

    @Override // com.google.android.gms.internal.ads.IO
    public final com.google.android.gms.internal.ads.UO a() {
        com.google.android.gms.internal.ads.C2955Vv c2955Vv = this.f32040d;
        return com.google.android.gms.internal.ads.VO.a(this.f32037a.longValue(), c2955Vv.f32614a, com.google.android.gms.internal.ads.OO.c(c2955Vv.f32615b), this.f32039c, this.f32038b);
    }

    @Override // com.google.android.gms.internal.ads.IO
    public final com.google.android.gms.internal.ads.YO b() {
        com.google.android.gms.internal.ads.C2955Vv c2955Vv = this.f32040d;
        return com.google.android.gms.internal.ads.ZO.a(this.f32037a.longValue(), c2955Vv.f32614a, com.google.android.gms.internal.ads.OO.c(c2955Vv.f32615b), this.f32039c, this.f32038b);
    }
}
