package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class T3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ boolean f42159C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42160D;

    T3(com.google.android.gms.measurement.internal.F3 f6, boolean z6) {
        this.f42159C = z6;
        this.f42160D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zP = this.f42160D.f42679a.p();
        boolean zO = this.f42160D.f42679a.o();
        this.f42160D.f42679a.m(this.f42159C);
        if (zO == this.f42159C) {
            this.f42160D.f42679a.j().K().b("Default data collection state already set to", java.lang.Boolean.valueOf(this.f42159C));
        }
        if (this.f42160D.f42679a.p() == zP || this.f42160D.f42679a.p() != this.f42160D.f42679a.o()) {
            this.f42160D.f42679a.j().M().c("Default data collection is different than actual status", java.lang.Boolean.valueOf(this.f42159C), java.lang.Boolean.valueOf(zP));
        }
        this.f42160D.K0();
    }
}
