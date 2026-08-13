package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class B implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.z f24858C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.C f24859D;

    B(com.google.android.gms.common.api.internal.C c6, com.google.android.gms.common.api.internal.z zVar) {
        this.f24859D = c6;
        this.f24858C = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f24859D.f24873D) {
            N3.C1389b c1389bB = this.f24858C.b();
            if (c1389bB.w()) {
                com.google.android.gms.common.api.internal.C c6 = this.f24859D;
                c6.f24878C.startActivityForResult(com.google.android.gms.common.api.GoogleApiActivity.a(c6.b(), (android.app.PendingIntent) Q3.AbstractC1477p.l(c1389bB.s()), this.f24858C.a(), false), 1);
                return;
            }
            com.google.android.gms.common.api.internal.C c10 = this.f24859D;
            if (c10.f24876G.b(c10.b(), c1389bB.e(), null) != null) {
                com.google.android.gms.common.api.internal.C c11 = this.f24859D;
                c11.f24876G.v(c11.b(), c11.f24878C, c1389bB.e(), 2, this.f24859D);
                return;
            }
            if (c1389bB.e() != 18) {
                this.f24859D.l(c1389bB, this.f24858C.a());
                return;
            }
            com.google.android.gms.common.api.internal.C c12 = this.f24859D;
            android.app.Dialog dialogQ = c12.f24876G.q(c12.b(), c12);
            com.google.android.gms.common.api.internal.C c13 = this.f24859D;
            c13.f24876G.r(c13.b().getApplicationContext(), new com.google.android.gms.common.api.internal.A(this, dialogQ));
        }
    }
}
