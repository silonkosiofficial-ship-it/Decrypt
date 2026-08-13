package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class v extends com.google.android.gms.common.api.internal.y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.AbstractC2147b f24960b;

    public v(int i6, com.google.android.gms.common.api.internal.AbstractC2147b abstractC2147b) {
        super(i6);
        this.f24960b = (com.google.android.gms.common.api.internal.AbstractC2147b) Q3.AbstractC1477p.m(abstractC2147b, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void a(com.google.android.gms.common.api.Status status) {
        try {
            this.f24960b.p(status);
        } catch (java.lang.IllegalStateException e6) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void b(java.lang.Exception exc) {
        try {
            this.f24960b.p(new com.google.android.gms.common.api.Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (java.lang.IllegalStateException e6) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void c(com.google.android.gms.common.api.internal.n nVar) throws android.os.DeadObjectException {
        try {
            this.f24960b.n(nVar.s());
        } catch (java.lang.RuntimeException e6) {
            b(e6);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void d(com.google.android.gms.common.api.internal.g gVar, boolean z6) {
        gVar.c(this.f24960b, z6);
    }
}
