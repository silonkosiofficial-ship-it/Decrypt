package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class k implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ int f24922C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.n f24923D;

    k(com.google.android.gms.common.api.internal.n nVar, int i6) {
        this.f24923D = nVar;
        this.f24922C = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24923D.i(this.f24922C);
    }
}
