package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4716oj implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.util.Map f37853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p184s3.InterfaceC7076a f37854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ java.lang.String f37855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5265tj f37856d;

    C4716oj(com.google.android.gms.internal.ads.C5265tj c5265tj, java.util.Map map, p184s3.InterfaceC7076a interfaceC7076a, java.lang.String str) {
        this.f37853a = map;
        this.f37854b = interfaceC7076a;
        this.f37855c = str;
        this.f37856d = c5265tj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        p174r3.v.s().x(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25447V9)).booleanValue()) {
            this.f37853a.put("u", str);
        }
        this.f37856d.h(str, this.f37854b, this.f37853a, this.f37855c);
    }
}
