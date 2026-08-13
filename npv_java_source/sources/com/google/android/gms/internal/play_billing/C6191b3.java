package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6191b3 implements com.google.android.gms.internal.play_billing.InterfaceC6304u3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.InterfaceC6221g3 f41520b = new com.google.android.gms.internal.play_billing.Z2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.InterfaceC6221g3 f41521a;

    public C6191b3() {
        com.google.android.gms.internal.play_billing.I2 i2A = com.google.android.gms.internal.play_billing.I2.a();
        int i6 = com.google.android.gms.internal.play_billing.C6281q3.f41638d;
        com.google.android.gms.internal.play_billing.C6185a3 c6185a3 = new com.google.android.gms.internal.play_billing.C6185a3(i2A, f41520b);
        byte[] bArr = com.google.android.gms.internal.play_billing.Q2.f41449b;
        this.f41521a = c6185a3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6304u3
    public final com.google.android.gms.internal.play_billing.InterfaceC6298t3 a(java.lang.Class cls) {
        int i6 = com.google.android.gms.internal.play_billing.AbstractC6310v3.f41664b;
        if (!com.google.android.gms.internal.play_billing.L2.class.isAssignableFrom(cls)) {
            int i10 = com.google.android.gms.internal.play_billing.C6281q3.f41638d;
        }
        com.google.android.gms.internal.play_billing.InterfaceC6215f3 interfaceC6215f3B = this.f41521a.b(cls);
        if (interfaceC6215f3B.b()) {
            int i11 = com.google.android.gms.internal.play_billing.C6281q3.f41638d;
            return com.google.android.gms.internal.play_billing.C6257m3.j(com.google.android.gms.internal.play_billing.AbstractC6310v3.r(), com.google.android.gms.internal.play_billing.D2.a(), interfaceC6215f3B.a());
        }
        int i12 = com.google.android.gms.internal.play_billing.C6281q3.f41638d;
        return com.google.android.gms.internal.play_billing.C6251l3.A(cls, interfaceC6215f3B, com.google.android.gms.internal.play_billing.AbstractC6269o3.a(), com.google.android.gms.internal.play_billing.X2.a(), com.google.android.gms.internal.play_billing.AbstractC6310v3.r(), interfaceC6215f3B.c() + (-1) != 1 ? com.google.android.gms.internal.play_billing.D2.a() : null, com.google.android.gms.internal.play_billing.AbstractC6209e3.a());
    }
}
