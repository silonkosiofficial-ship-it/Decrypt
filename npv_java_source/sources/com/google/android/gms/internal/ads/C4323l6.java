package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4323l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f37065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f37067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f37068e;

    public C4323l6(int i6, java.lang.String str, int i10, java.util.List list, byte[] bArr) {
        this.f37064a = i6;
        this.f37065b = str;
        this.f37066c = i10;
        this.f37067d = list == null ? java.util.Collections.emptyList() : j$.util.DesugarCollections.unmodifiableList(list);
        this.f37068e = bArr;
    }

    public final int a() {
        int i6 = this.f37066c;
        if (i6 != 2) {
            return i6 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
