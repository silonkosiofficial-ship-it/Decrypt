package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6381g4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f42410C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42411D;

    RunnableC6381g4(com.google.android.gms.measurement.internal.F3 f6, com.google.android.gms.internal.measurement.U0 u6) {
        this.f42410C = u6;
        this.f42411D = f6;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Long lValueOf;
        com.google.android.gms.measurement.internal.C6445p5 c6445p5U = this.f42411D.u();
        if (c6445p5U.h().M().z()) {
            if (!c6445p5U.h().z(c6445p5U.b().a()) && c6445p5U.h().f42740s.a() != 0) {
                lValueOf = java.lang.Long.valueOf(c6445p5U.h().f42740s.a());
            }
            if (lValueOf != null) {
                this.f42411D.f42679a.L().Q(this.f42410C, lValueOf.longValue());
            }
            try {
                this.f42410C.e0(null);
            } catch (android.os.RemoteException e6) {
                this.f42411D.f42679a.j().G().b("getSessionId failed with exception", e6);
                return;
            }
        }
        c6445p5U.j().M().a("Analytics storage consent denied; will not get session id");
        lValueOf = null;
        if (lValueOf != null) {
            this.f42411D.f42679a.L().Q(this.f42410C, lValueOf.longValue());
        } else {
            this.f42410C.e0(null);
        }
    }
}
