package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class Vv0 extends java.io.IOException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f32622C;

    public Vv0(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public Vv0(java.lang.String str) {
        super(str);
    }

    final void a() {
        this.f32622C = true;
    }

    final boolean b() {
        return this.f32622C;
    }
}
