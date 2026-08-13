package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class QD extends com.google.android.gms.internal.ads.BF implements com.google.android.gms.internal.ads.ZC, com.google.android.gms.internal.ads.FD {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f30945D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f30946E;

    public QD(java.util.Set set, com.google.android.gms.internal.ads.R60 r60) {
        super(set);
        this.f30946E = new java.util.concurrent.atomic.AtomicBoolean();
        this.f30945D = r60;
    }

    private final void a() {
        final p184s3.e2 e2Var;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25302I7)).booleanValue() && this.f30946E.compareAndSet(false, true) && (e2Var = this.f30945D.f31169e0) != null && e2Var.f54229C == 3) {
            p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.PD
                @Override // com.google.android.gms.internal.ads.AF
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.SD) obj).r(e2Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.FD
    public final void i() {
        if (this.f30945D.f31162b == 1) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void t() {
        int i6 = this.f30945D.f31162b;
        if (i6 == 2 || i6 == 5 || i6 == 4 || i6 == 6 || i6 == 7) {
            a();
        }
    }
}
