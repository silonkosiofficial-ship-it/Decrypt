package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5359ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f39178a = new java.util.HashMap();

    public final java.util.concurrent.atomic.AtomicReference a(java.lang.String str) {
        synchronized (this) {
            try {
                if (!this.f39178a.containsKey(str)) {
                    this.f39178a.put(str, new java.util.concurrent.atomic.AtomicReference());
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return (java.util.concurrent.atomic.AtomicReference) this.f39178a.get(str);
    }
}
