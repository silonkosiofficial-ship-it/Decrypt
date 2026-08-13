package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class K implements java.util.Comparator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.AbstractC6076n f40552C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5963a3 f40553D;

    K(com.google.android.gms.internal.measurement.AbstractC6076n abstractC6076n, com.google.android.gms.internal.measurement.C5963a3 c5963a3) {
        this.f40552C = abstractC6076n;
        this.f40553D = c5963a3;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s = (com.google.android.gms.internal.measurement.InterfaceC6117s) obj;
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s2 = (com.google.android.gms.internal.measurement.InterfaceC6117s) obj2;
        com.google.android.gms.internal.measurement.AbstractC6076n abstractC6076n = this.f40552C;
        com.google.android.gms.internal.measurement.C5963a3 c5963a3 = this.f40553D;
        if (interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6173z) {
            return !(interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.C6173z) ? 1 : 0;
        }
        if (interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.C6173z) {
            return -1;
        }
        return abstractC6076n == null ? interfaceC6117s.e().compareTo(interfaceC6117s2.e()) : (int) com.google.android.gms.internal.measurement.AbstractC6152w2.a(abstractC6076n.a(c5963a3, java.util.Arrays.asList(interfaceC6117s, interfaceC6117s2)).d().doubleValue());
    }
}
