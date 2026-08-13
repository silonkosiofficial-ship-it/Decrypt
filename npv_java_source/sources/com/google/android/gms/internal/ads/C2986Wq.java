package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2986Wq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.math.BigInteger f32809a = java.math.BigInteger.ONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f32810b = "0";

    public final synchronized java.lang.String a() {
        java.lang.String string;
        string = this.f32809a.toString();
        this.f32809a = this.f32809a.add(java.math.BigInteger.ONE);
        this.f32810b = string;
        return string;
    }

    public final synchronized java.lang.String b() {
        return this.f32810b;
    }
}
