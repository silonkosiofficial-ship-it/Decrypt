package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4564nG0 extends com.google.android.gms.internal.ads.C5518vz0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f37547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f37548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f37549k;

    public C4564nG0() {
        super(2, 0);
        this.f37549k = 32;
    }

    @Override // com.google.android.gms.internal.ads.C5518vz0, com.google.android.gms.internal.ads.AbstractC3428cx0
    public final void b() {
        super.b();
        this.f37548j = 0;
    }

    public final int n() {
        return this.f37548j;
    }

    public final long o() {
        return this.f37547i;
    }

    public final void p(int i6) {
        this.f37549k = i6;
    }

    public final boolean q(com.google.android.gms.internal.ads.C5518vz0 c5518vz0) {
        java.nio.ByteBuffer byteBuffer;
        com.google.android.gms.internal.ads.LC.d(!c5518vz0.d(1073741824));
        com.google.android.gms.internal.ads.LC.d(!c5518vz0.d(268435456));
        com.google.android.gms.internal.ads.LC.d(!c5518vz0.d(4));
        if (r()) {
            if (this.f37548j >= this.f37549k) {
                return false;
            }
            java.nio.ByteBuffer byteBuffer2 = c5518vz0.f39486d;
            if (byteBuffer2 != null && (byteBuffer = this.f39486d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i6 = this.f37548j;
        this.f37548j = i6 + 1;
        if (i6 == 0) {
            this.f39488f = c5518vz0.f39488f;
            if (c5518vz0.d(1)) {
                c(1);
            }
        }
        java.nio.ByteBuffer byteBuffer3 = c5518vz0.f39486d;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.f39486d.put(byteBuffer3);
        }
        this.f37547i = c5518vz0.f39488f;
        return true;
    }

    public final boolean r() {
        return this.f37548j > 0;
    }
}
