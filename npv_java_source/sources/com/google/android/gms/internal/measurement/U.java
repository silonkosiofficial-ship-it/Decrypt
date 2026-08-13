package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class U extends com.google.android.gms.internal.measurement.A {
    @Override // com.google.android.gms.internal.measurement.A
    public final com.google.android.gms.internal.measurement.InterfaceC6117s b(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        if (str == null || str.isEmpty() || !c5963a3.g(str)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Command not found: %s", str));
        }
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sC = c5963a3.c(str);
        if (interfaceC6117sC instanceof com.google.android.gms.internal.measurement.AbstractC6076n) {
            return ((com.google.android.gms.internal.measurement.AbstractC6076n) interfaceC6117sC).a(c5963a3, list);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Function %s is not defined", str));
    }
}
