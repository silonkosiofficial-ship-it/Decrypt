package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3992i40 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f36224a;

    public C3992i40(com.google.android.gms.internal.ads.Yk0 yk0) {
        this.f36224a = yk0;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f36224a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.h40
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.util.HashMap map = new java.util.HashMap();
                java.lang.String str = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25448W);
                if (str != null && !str.isEmpty()) {
                    if (android.os.Build.VERSION.SDK_INT >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25459X)).intValue()) {
                        for (java.lang.String str2 : str.split(",", -1)) {
                            map.put(str2, p214v3.AbstractC7259n0.a(str2));
                        }
                    }
                }
                return new com.google.android.gms.internal.ads.C4100j40(map);
            }
        });
    }
}
