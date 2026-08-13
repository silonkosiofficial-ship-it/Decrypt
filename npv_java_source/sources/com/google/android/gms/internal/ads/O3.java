package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class O3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f30438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.Z0 f30439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f30441e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public O3(boolean z6, java.lang.String str, int i6, byte[] bArr, int i10, int i11, byte[] bArr2) {
        byte b6 = 0;
        int i12 = 1;
        com.google.android.gms.internal.ads.LC.d((i6 == 0) ^ (bArr2 == null));
        this.f30437a = z6;
        this.f30438b = str;
        this.f30440d = i6;
        this.f30441e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b6 = -1;
                    } else {
                        b6 = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        b6 = -1;
                    } else {
                        b6 = 3;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        b6 = -1;
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        b6 = -1;
                    } else {
                        b6 = 1;
                    }
                    break;
                default:
                    b6 = -1;
                    break;
            }
            if (b6 != 0 && b6 != 1) {
                if (b6 == 2 || b6 == 3) {
                    i12 = 2;
                } else {
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                }
            }
        }
        this.f30439c = new com.google.android.gms.internal.ads.Z0(i12, bArr, i10, i11);
    }
}
