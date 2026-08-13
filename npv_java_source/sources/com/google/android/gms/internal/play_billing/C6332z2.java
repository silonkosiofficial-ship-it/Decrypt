package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6332z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f41679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41680b;

    C6332z2(java.lang.Object obj, int i6) {
        this.f41679a = obj;
        this.f41680b = i6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.play_billing.C6332z2)) {
            return false;
        }
        com.google.android.gms.internal.play_billing.C6332z2 c6332z2 = (com.google.android.gms.internal.play_billing.C6332z2) obj;
        return this.f41679a == c6332z2.f41679a && this.f41680b == c6332z2.f41680b;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.f41679a) * 65535) + this.f41680b;
    }
}
