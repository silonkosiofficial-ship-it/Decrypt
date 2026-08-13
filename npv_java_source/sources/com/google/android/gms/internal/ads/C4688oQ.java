package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4688oQ extends java.lang.Exception {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f37814C;

    public C4688oQ(int i6) {
        this.f37814C = i6;
    }

    public C4688oQ(int i6, java.lang.String str) {
        super(str);
        this.f37814C = i6;
    }

    public C4688oQ(int i6, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.f37814C = 1;
    }

    public final int a() {
        return this.f37814C;
    }
}
