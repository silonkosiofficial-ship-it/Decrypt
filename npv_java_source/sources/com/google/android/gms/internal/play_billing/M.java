package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class M extends com.google.android.gms.internal.play_billing.Q {
    M() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.Q
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.Q
    public final com.google.android.gms.internal.play_billing.Q b(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        int iCompareTo = comparable.compareTo(comparable2);
        if (iCompareTo < 0) {
            return com.google.android.gms.internal.play_billing.Q.f41442b;
        }
        return iCompareTo > 0 ? com.google.android.gms.internal.play_billing.Q.f41443c : com.google.android.gms.internal.play_billing.Q.f41441a;
    }
}
