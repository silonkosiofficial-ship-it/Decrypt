package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5083s10 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f38613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.view.ViewGroup f38614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f38615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Set f38616d;

    public C5083s10(com.google.android.gms.internal.ads.Yk0 yk0, android.view.ViewGroup viewGroup, android.content.Context context, java.util.Set set) {
        this.f38613a = yk0;
        this.f38616d = set;
        this.f38614b = viewGroup;
        this.f38615c = context;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f38613a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.r10
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f38421a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.C5193t10 c() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25344M5)).booleanValue() && this.f38614b != null && this.f38616d.contains("banner")) {
            return new com.google.android.gms.internal.ads.C5193t10(java.lang.Boolean.valueOf(this.f38614b.isHardwareAccelerated()));
        }
        java.lang.Boolean boolValueOf = null;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25355N5)).booleanValue() && this.f38616d.contains("native")) {
            android.content.Context context = this.f38615c;
            if (context instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) context;
                android.view.Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolValueOf = java.lang.Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = java.lang.Boolean.TRUE;
                }
                return new com.google.android.gms.internal.ads.C5193t10(boolValueOf);
            }
        }
        return new com.google.android.gms.internal.ads.C5193t10(null);
    }
}
