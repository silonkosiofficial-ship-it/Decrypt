package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6504y2 extends com.google.android.gms.measurement.internal.AbstractC6336a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42710b;

    AbstractC6504y2(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
        this.f42679a.n();
    }

    protected abstract boolean A();

    protected final void v() {
        if (!z()) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
    }

    public final void w() {
        if (this.f42710b) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        if (A()) {
            return;
        }
        this.f42679a.R();
        this.f42710b = true;
    }

    public final void x() {
        if (this.f42710b) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        y();
        this.f42679a.R();
        this.f42710b = true;
    }

    protected void y() {
    }

    final boolean z() {
        return this.f42710b;
    }
}
