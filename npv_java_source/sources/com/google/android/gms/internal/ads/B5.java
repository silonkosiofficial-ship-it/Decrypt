package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class B5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f25892f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f25897e = new byte[128];

    public B5(int i6) {
    }

    public final void a(byte[] bArr, int i6, int i10) {
        if (this.f25893a) {
            int i11 = i10 - i6;
            byte[] bArr2 = this.f25897e;
            int length = bArr2.length;
            int i12 = this.f25895c + i11;
            if (length < i12) {
                this.f25897e = java.util.Arrays.copyOf(bArr2, i12 + i12);
            }
            java.lang.System.arraycopy(bArr, i6, this.f25897e, this.f25895c, i11);
            this.f25895c += i11;
        }
    }

    public final void b() {
        this.f25893a = false;
        this.f25895c = 0;
        this.f25894b = 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    public final boolean c(int i6, int i10) {
        int i11 = this.f25894b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i6 == 179 || i6 == 181) {
                            this.f25895c -= i10;
                            this.f25893a = false;
                            return true;
                        }
                    } else if ((i6 & 240) != 32) {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("H263Reader", "Unexpected start code value");
                        b();
                    } else {
                        this.f25896d = this.f25895c;
                        this.f25894b = 4;
                    }
                } else if (i6 > 31) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("H263Reader", "Unexpected start code value");
                    b();
                } else {
                    this.f25894b = 3;
                }
            } else if (i6 != 181) {
                com.google.android.gms.internal.ads.AbstractC3586eM.f("H263Reader", "Unexpected start code value");
                b();
            } else {
                this.f25894b = 2;
            }
        } else if (i6 == 176) {
            this.f25894b = 1;
            this.f25893a = true;
        }
        a(f25892f, 0, 3);
        return false;
    }
}
