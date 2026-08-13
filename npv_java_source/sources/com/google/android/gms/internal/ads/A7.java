package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class A7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f25062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.io.InputStream f25064d;

    public A7(int i6, java.util.List list, int i10, java.io.InputStream inputStream) {
        this.f25061a = i6;
        this.f25062b = list;
        this.f25063c = i10;
        this.f25064d = inputStream;
    }

    public final int a() {
        return this.f25063c;
    }

    public final int b() {
        return this.f25061a;
    }

    public final java.io.InputStream c() {
        java.io.InputStream inputStream = this.f25064d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final java.util.List d() {
        return j$.util.DesugarCollections.unmodifiableList(this.f25062b);
    }
}
