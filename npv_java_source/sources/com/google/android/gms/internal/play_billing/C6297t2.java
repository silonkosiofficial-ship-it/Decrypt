package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6297t2 extends java.io.IOException {
    C6297t2(long j6, long j10, int i6, java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(java.lang.String.format(java.util.Locale.US, "Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(j6), java.lang.Long.valueOf(j10), java.lang.Integer.valueOf(i6))), th);
    }

    C6297t2(java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
