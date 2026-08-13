package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4017iH extends com.google.android.gms.internal.ads.BF {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f36258D;

    protected C4017iH(java.util.Set set) {
        super(set);
    }

    public final void a() {
        p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.fH
            @Override // com.google.android.gms.internal.ads.AF
            public final void b(java.lang.Object obj) {
                ((k3.w.a) obj).a();
            }
        });
    }

    public final void b() {
        p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.eH
            @Override // com.google.android.gms.internal.ads.AF
            public final void b(java.lang.Object obj) {
                ((k3.w.a) obj).c();
            }
        });
    }

    public final synchronized void c() {
        try {
            if (!this.f36258D) {
                p1(new com.google.android.gms.internal.ads.C3797gH());
                this.f36258D = true;
            }
            p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.hH
                @Override // com.google.android.gms.internal.ads.AF
                public final void b(java.lang.Object obj) {
                    ((k3.w.a) obj).d();
                }
            });
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void q1() {
        p1(new com.google.android.gms.internal.ads.C3797gH());
        this.f36258D = true;
    }
}
