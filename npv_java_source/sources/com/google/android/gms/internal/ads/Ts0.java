package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Ts0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f32026a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.Map f32027b;

    public final synchronized java.util.Map a() {
        try {
            if (this.f32027b == null) {
                this.f32027b = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(this.f32026a));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f32027b;
    }
}
