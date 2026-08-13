package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class WD implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.ref.WeakReference f32706C;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.ZD zd = (com.google.android.gms.internal.ads.ZD) this.f32706C.get();
        if (zd != null) {
            zd.p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.UD
                @Override // com.google.android.gms.internal.ads.AF
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.TD) obj).a();
                }
            });
        }
    }
}
