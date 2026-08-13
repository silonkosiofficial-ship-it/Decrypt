package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2953Vt implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.util.List f32601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.lang.String f32602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ android.net.Uri f32603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC3097Zt f32604d;

    C2953Vt(com.google.android.gms.internal.ads.AbstractC3097Zt abstractC3097Zt, java.util.List list, java.lang.String str, android.net.Uri uri) {
        this.f32601a = list;
        this.f32602b = str;
        this.f32603c = uri;
        this.f32604d = abstractC3097Zt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        p224w3.p.g("Failed to parse gmsg params for: ".concat(java.lang.String.valueOf(this.f32603c)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        java.util.List list = this.f32601a;
        java.lang.String str = this.f32602b;
        this.f32604d.t((java.util.Map) obj, list, str);
    }
}
