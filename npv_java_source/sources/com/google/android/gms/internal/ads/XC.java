package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class XC extends com.google.android.gms.internal.ads.BF {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f33073D;

    public XC(java.util.Set set) {
        super(set);
        this.f33073D = false;
    }

    public final synchronized void a() {
        if (this.f33073D) {
            return;
        }
        p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.WC
            @Override // com.google.android.gms.internal.ads.AF
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.ZC) obj).t();
            }
        });
        this.f33073D = true;
    }
}
