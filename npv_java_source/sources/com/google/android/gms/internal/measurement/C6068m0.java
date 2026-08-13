package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6068m0 implements com.google.android.gms.internal.measurement.InterfaceC6077n0 {
    C6068m0() {
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6077n0
    public final java.lang.String a(java.lang.String str, com.google.android.gms.internal.measurement.AbstractC6110r0 abstractC6110r0, com.google.android.gms.internal.measurement.EnumC6086o0 enumC6086o0) {
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6077n0
    public final /* synthetic */ java.lang.String b(java.io.File file, java.lang.String str) {
        return d(file, str, com.google.android.gms.internal.measurement.AbstractC6110r0.f41162a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6077n0
    public final /* synthetic */ java.lang.String c(java.lang.String str, com.google.android.gms.internal.measurement.AbstractC6110r0 abstractC6110r0) {
        return a(str, abstractC6110r0, com.google.android.gms.internal.measurement.EnumC6086o0.RAW_FILE_IO_TYPE);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6077n0
    public final /* synthetic */ java.lang.String d(java.io.File file, java.lang.String str, com.google.android.gms.internal.measurement.AbstractC6110r0 abstractC6110r0) {
        return c(new java.io.File(file, str).getPath(), abstractC6110r0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6077n0
    public final /* synthetic */ java.lang.String o(java.lang.String str) {
        return c(str, com.google.android.gms.internal.measurement.AbstractC6110r0.f41162a);
    }
}
