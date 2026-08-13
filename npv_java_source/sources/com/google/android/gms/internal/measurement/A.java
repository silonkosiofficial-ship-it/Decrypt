package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.List f40431a = new java.util.ArrayList();

    protected A() {
    }

    final com.google.android.gms.internal.measurement.InterfaceC6117s a(java.lang.String str) {
        if (!this.f40431a.contains(com.google.android.gms.internal.measurement.AbstractC6152w2.c(str))) {
            throw new java.lang.IllegalArgumentException("Command not supported");
        }
        throw new java.lang.UnsupportedOperationException("Command not implemented: " + str);
    }

    public abstract com.google.android.gms.internal.measurement.InterfaceC6117s b(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list);
}
