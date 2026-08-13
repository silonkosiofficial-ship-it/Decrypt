package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6292s3 implements com.google.android.gms.internal.play_billing.InterfaceC6215f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.InterfaceC6233i3 f41652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f41653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object[] f41654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41655d;

    C6292s3(com.google.android.gms.internal.play_billing.InterfaceC6233i3 interfaceC6233i3, java.lang.String str, java.lang.Object[] objArr) {
        this.f41652a = interfaceC6233i3;
        this.f41653b = str;
        this.f41654c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f41655d = cCharAt;
            return;
        }
        int i6 = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f41655d = i6 | (cCharAt2 << i11);
                return;
            } else {
                i6 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6215f3
    public final com.google.android.gms.internal.play_billing.InterfaceC6233i3 a() {
        return this.f41652a;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6215f3
    public final boolean b() {
        return (this.f41655d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6215f3
    public final int c() {
        int i6 = this.f41655d;
        if ((i6 & 1) != 0) {
            return 1;
        }
        return (i6 & 4) == 4 ? 3 : 2;
    }

    final java.lang.String d() {
        return this.f41653b;
    }

    final java.lang.Object[] e() {
        return this.f41654c;
    }
}
