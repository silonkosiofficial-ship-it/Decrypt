package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24964a;

    public y(int i6) {
        this.f24964a = i6;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status e(android.os.RemoteException remoteException) {
        return new com.google.android.gms.common.api.Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(com.google.android.gms.common.api.Status status);

    public abstract void b(java.lang.Exception exc);

    public abstract void c(com.google.android.gms.common.api.internal.n nVar);

    public abstract void d(com.google.android.gms.common.api.internal.g gVar, boolean z6);
}
