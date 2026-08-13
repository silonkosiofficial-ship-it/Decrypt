package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5855z20 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f40191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f40192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p224w3.a f40193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f40194d;

    C5855z20(com.google.android.gms.internal.ads.Yk0 yk0, android.content.Context context, p224w3.a aVar, java.lang.String str) {
        this.f40191a = yk0;
        this.f40192b = context;
        this.f40193c = aVar;
        this.f40194d = str;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f40191a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.y20
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f39976a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.A20 c() {
        boolean zG = W3.e.a(this.f40192b).g();
        p174r3.v.t();
        boolean zF = p214v3.E0.f(this.f40192b);
        java.lang.String str = this.f40193c.f56217C;
        p174r3.v.t();
        boolean zG2 = p214v3.E0.g();
        p174r3.v.t();
        android.content.pm.ApplicationInfo applicationInfo = this.f40192b.getApplicationInfo();
        int i6 = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        android.content.Context context = this.f40192b;
        return new com.google.android.gms.internal.ads.A20(zG, zF, str, zG2, i6, com.google.android.gms.dynamite.DynamiteModule.c(context, "com.google.android.gms.ads.dynamite"), com.google.android.gms.dynamite.DynamiteModule.a(context, "com.google.android.gms.ads.dynamite"), this.f40194d);
    }
}
