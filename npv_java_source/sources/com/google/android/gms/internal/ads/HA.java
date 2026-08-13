package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class HA {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.String f27985c = java.lang.Integer.toString(0, 36);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String f27986d = java.lang.Integer.toString(1, 36);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f27987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27988b;

    public HA(java.lang.String str, int i6) {
        this.f27987a = str;
        this.f27988b = i6;
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(f27985c, this.f27987a);
        bundle.putInt(f27986d, this.f27988b);
        return bundle;
    }
}
