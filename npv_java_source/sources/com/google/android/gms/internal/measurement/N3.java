package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class N3 implements java.util.Comparator {
    N3() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.L3 l6 = (com.google.android.gms.internal.measurement.L3) obj;
        com.google.android.gms.internal.measurement.L3 l10 = (com.google.android.gms.internal.measurement.L3) obj2;
        com.google.android.gms.internal.measurement.R3 r6 = (com.google.android.gms.internal.measurement.R3) l6.iterator();
        com.google.android.gms.internal.measurement.R3 r10 = (com.google.android.gms.internal.measurement.R3) l10.iterator();
        while (r6.hasNext() && r10.hasNext()) {
            int iCompare = java.lang.Integer.compare(com.google.android.gms.internal.measurement.L3.f(r6.a()), com.google.android.gms.internal.measurement.L3.f(r10.a()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return java.lang.Integer.compare(l6.E(), l10.E());
    }
}
