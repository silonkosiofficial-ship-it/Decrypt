package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class X4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.Map f40706a = new java.util.HashMap();

    public final com.google.android.gms.internal.measurement.InterfaceC6117s a(java.lang.String str) {
        if (!this.f40706a.containsKey(str)) {
            return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
        }
        try {
            return (com.google.android.gms.internal.measurement.InterfaceC6117s) ((java.util.concurrent.Callable) this.f40706a.get(str)).call();
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalStateException("Failed to create API implementation: " + str);
        }
    }

    public final void b(java.lang.String str, java.util.concurrent.Callable callable) {
        this.f40706a.put(str, callable);
    }
}
