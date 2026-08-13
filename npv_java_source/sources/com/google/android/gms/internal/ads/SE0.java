package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class SE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.media.AudioTrack f31649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.media.AudioTimestamp f31650b = new android.media.AudioTimestamp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f31651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f31652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f31653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f31654f;

    public SE0(android.media.AudioTrack audioTrack) {
        this.f31649a = audioTrack;
    }

    public final long a() {
        return this.f31653e;
    }

    public final long b() {
        return this.f31650b.nanoTime / 1000;
    }

    public final boolean c() {
        boolean timestamp = this.f31649a.getTimestamp(this.f31650b);
        if (timestamp) {
            long j6 = this.f31650b.framePosition;
            if (this.f31652d > j6) {
                this.f31651c++;
            }
            this.f31652d = j6;
            this.f31653e = j6 + this.f31654f + (this.f31651c << 32);
        }
        return timestamp;
    }
}
