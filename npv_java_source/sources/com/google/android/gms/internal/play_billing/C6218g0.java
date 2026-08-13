package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6218g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.lang.Object[] f41556a = new java.lang.Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f41557b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.google.android.gms.internal.play_billing.C6212f0 f41558c;

    public final com.google.android.gms.internal.play_billing.C6218g0 a(java.lang.Object obj, java.lang.Object obj2) {
        int i6 = this.f41557b + 1;
        java.lang.Object[] objArr = this.f41556a;
        int length = objArr.length;
        int i10 = i6 + i6;
        if (i10 > length) {
            this.f41556a = java.util.Arrays.copyOf(objArr, com.google.android.gms.internal.play_billing.Y.a(length, i10));
        }
        com.google.android.gms.internal.play_billing.L.b(obj, obj2);
        java.lang.Object[] objArr2 = this.f41556a;
        int i11 = this.f41557b;
        int i12 = i11 + i11;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f41557b = i11 + 1;
        return this;
    }

    public final com.google.android.gms.internal.play_billing.AbstractC6224h0 b() {
        com.google.android.gms.internal.play_billing.C6212f0 c6212f0 = this.f41558c;
        if (c6212f0 != null) {
            throw c6212f0.a();
        }
        com.google.android.gms.internal.play_billing.G0 g0G = com.google.android.gms.internal.play_billing.G0.g(this.f41557b, this.f41556a, this);
        com.google.android.gms.internal.play_billing.C6212f0 c6212f1 = this.f41558c;
        if (c6212f1 == null) {
            return g0G;
        }
        throw c6212f1.a();
    }
}
