package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class p implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ N3.C1389b f24941C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.q f24942D;

    p(com.google.android.gms.common.api.internal.q qVar, N3.C1389b c1389b) {
        this.f24942D = qVar;
        this.f24941C = c1389b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.q qVar = this.f24942D;
        com.google.android.gms.common.api.internal.n nVar = (com.google.android.gms.common.api.internal.n) qVar.f24948f.f24899L.get(qVar.f24944b);
        if (nVar == null) {
            return;
        }
        if (!this.f24941C.C()) {
            nVar.E(this.f24941C, null);
            return;
        }
        this.f24942D.f24947e = true;
        if (this.f24942D.f24943a.o()) {
            this.f24942D.i();
            return;
        }
        try {
            com.google.android.gms.common.api.internal.q qVar2 = this.f24942D;
            qVar2.f24943a.i(null, qVar2.f24943a.a());
        } catch (java.lang.SecurityException e6) {
            this.f24942D.f24943a.d("Failed to get service from broker.");
            nVar.E(new N3.C1389b(10), null);
        }
    }
}
