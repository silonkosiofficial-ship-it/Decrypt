package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class B30 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.internal.ads.Yk0 f25881a;

    public B30(com.google.android.gms.internal.ads.C3387cd c3387cd, com.google.android.gms.internal.ads.Yk0 yk0, android.content.Context context) {
        this.f25881a = yk0;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f25881a.H0(new java.util.concurrent.Callable(this) { // from class: com.google.android.gms.internal.ads.A30
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return new com.google.android.gms.internal.ads.C30(new org.json.JSONObject());
            }
        });
    }
}
