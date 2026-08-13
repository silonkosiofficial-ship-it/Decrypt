package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class D10 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f26595a;

    public D10(com.google.android.gms.internal.ads.Yk0 yk0) {
        this.f26595a = yk0;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f26595a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.C10
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", p174r3.v.s().c());
                return new com.google.android.gms.internal.ads.E10(bundle);
            }
        });
    }
}
