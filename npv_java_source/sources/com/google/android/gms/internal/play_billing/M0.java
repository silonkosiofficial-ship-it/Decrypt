package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
abstract class M0 {
    public static boolean a(java.util.Comparator comparator, java.lang.Iterable iterable) {
        java.util.Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof java.util.SortedSet) {
            comparator2 = ((java.util.SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = com.google.android.gms.internal.play_billing.C6295t0.f41656C;
            }
        } else {
            if (!(iterable instanceof com.google.android.gms.internal.play_billing.L0)) {
                return false;
            }
            comparator2 = ((com.google.android.gms.internal.play_billing.L0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
