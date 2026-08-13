package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
abstract class U implements java.lang.Comparable, java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.lang.Comparable f41486C = "";

    U(java.lang.Comparable comparable) {
    }

    public abstract int e(com.google.android.gms.internal.play_billing.U u6);

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.play_billing.U) {
            try {
                if (e((com.google.android.gms.internal.play_billing.U) obj) == 0) {
                    return true;
                }
            } catch (java.lang.ClassCastException unused) {
            }
        }
        return false;
    }

    abstract void g(java.lang.StringBuilder sb);

    public abstract int hashCode();

    abstract void i(java.lang.StringBuilder sb);
}
