package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5732xw0 implements com.google.android.gms.internal.ads.InterfaceC4083iw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4523mw0 f39956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f39957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object[] f39958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39959d;

    C5732xw0(com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0, java.lang.String str, java.lang.Object[] objArr) {
        this.f39956a = interfaceC4523mw0;
        this.f39957b = str;
        this.f39958c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f39959d = cCharAt;
            return;
        }
        int i6 = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f39959d = i6 | (cCharAt2 << i11);
                return;
            } else {
                i6 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4083iw0
    public final com.google.android.gms.internal.ads.InterfaceC4523mw0 a() {
        return this.f39956a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4083iw0
    public final boolean b() {
        return (this.f39959d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4083iw0
    public final int c() {
        int i6 = this.f39959d;
        if ((i6 & 1) != 0) {
            return 1;
        }
        return (i6 & 4) == 4 ? 3 : 2;
    }

    final java.lang.String d() {
        return this.f39957b;
    }

    final java.lang.Object[] e() {
        return this.f39958c;
    }
}
