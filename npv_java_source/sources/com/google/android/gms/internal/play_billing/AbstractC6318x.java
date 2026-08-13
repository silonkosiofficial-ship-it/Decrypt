package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6318x implements com.google.android.gms.internal.play_billing.A0 {
    AbstractC6318x() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.A0) {
            return c().equals(((com.google.android.gms.internal.play_billing.A0) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final java.lang.String toString() {
        return c().toString();
    }
}
