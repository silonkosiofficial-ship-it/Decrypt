package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6082n5 implements com.google.android.gms.internal.measurement.Y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.InterfaceC5965a5 f41102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f41103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object[] f41104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41105d;

    C6082n5(com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5, java.lang.String str, java.lang.Object[] objArr) {
        this.f41102a = interfaceC5965a5;
        this.f41103b = str;
        this.f41104c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f41105d = cCharAt;
            return;
        }
        int i6 = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f41105d = i6 | (cCharAt2 << i10);
                return;
            } else {
                i6 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final com.google.android.gms.internal.measurement.InterfaceC5965a5 a() {
        return this.f41102a;
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final com.google.android.gms.internal.measurement.EnumC6046j5 b() {
        int i6 = this.f41105d;
        if ((i6 & 1) != 0) {
            return com.google.android.gms.internal.measurement.EnumC6046j5.PROTO2;
        }
        return (i6 & 4) == 4 ? com.google.android.gms.internal.measurement.EnumC6046j5.EDITIONS : com.google.android.gms.internal.measurement.EnumC6046j5.PROTO3;
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final boolean c() {
        return (this.f41105d & 2) == 2;
    }

    final java.lang.String d() {
        return this.f41103b;
    }

    final java.lang.Object[] e() {
        return this.f41104c;
    }
}
