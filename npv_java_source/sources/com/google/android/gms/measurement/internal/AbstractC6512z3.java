package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6512z3 extends com.google.android.gms.measurement.internal.AbstractC6491w3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42748b;

    AbstractC6512z3(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
        this.f42679a.n();
    }

    protected void o() {
    }

    protected final void p() {
        if (!s()) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (this.f42748b) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        if (t()) {
            return;
        }
        this.f42679a.R();
        this.f42748b = true;
    }

    public final void r() {
        if (this.f42748b) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        o();
        this.f42679a.R();
        this.f42748b = true;
    }

    final boolean s() {
        return this.f42748b;
    }

    protected abstract boolean t();
}
