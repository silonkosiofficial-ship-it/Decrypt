package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Ap0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.HashMap f25792a = new java.util.HashMap();

    public final com.google.android.gms.internal.ads.Cp0 a() {
        if (this.f25792a == null) {
            throw new java.lang.IllegalStateException("cannot call build() twice");
        }
        com.google.android.gms.internal.ads.Cp0 cp0 = new com.google.android.gms.internal.ads.Cp0(j$.util.DesugarCollections.unmodifiableMap(this.f25792a), null);
        this.f25792a = null;
        return cp0;
    }
}
