package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class JB {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String f28642d = java.lang.Integer.toString(0, 36);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.String f28643e = java.lang.Integer.toString(1, 36);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.String f28644f = java.lang.Integer.toString(2, 36);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28647c;

    public JB(int i6, int i10, int i11) {
        this.f28645a = i6;
        this.f28646b = i10;
        this.f28647c = i11;
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(f28642d, this.f28645a);
        bundle.putInt(f28643e, this.f28646b);
        bundle.putInt(f28644f, this.f28647c);
        return bundle;
    }
}
