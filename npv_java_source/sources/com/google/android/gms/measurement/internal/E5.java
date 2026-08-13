package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
abstract class E5 extends com.google.android.gms.measurement.internal.F5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41778c;

    E5(com.google.android.gms.measurement.internal.H5 h6) {
        super(h6);
        this.f41809b.C0();
    }

    protected final void u() {
        if (!w()) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
    }

    public final void v() {
        if (this.f41778c) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        x();
        this.f41809b.B0();
        this.f41778c = true;
    }

    final boolean w() {
        return this.f41778c;
    }

    protected abstract boolean x();
}
