package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class SV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.String f31704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.String f31705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f31706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f31707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final java.lang.Integer f31708e;

    SV(java.lang.String str, java.lang.String str2, int i6, long j6, java.lang.Integer num) {
        this.f31704a = str;
        this.f31705b = str2;
        this.f31706c = i6;
        this.f31707d = j6;
        this.f31708e = num;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f31704a + "." + this.f31706c + "." + this.f31707d;
        if (!android.text.TextUtils.isEmpty(this.f31705b)) {
            str = str + "." + this.f31705b;
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25318K1)).booleanValue() || this.f31708e == null || android.text.TextUtils.isEmpty(this.f31705b)) {
            return str;
        }
        return str + "." + this.f31708e;
    }
}
