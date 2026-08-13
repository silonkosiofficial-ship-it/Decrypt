package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class UZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P4.d f32231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V3.f f32233c;

    public UZ(P4.d dVar, long j6, V3.f fVar) {
        this.f32231a = dVar;
        this.f32233c = fVar;
        this.f32232b = fVar.c() + j6;
    }

    public final boolean a() {
        return this.f32232b < this.f32233c.c();
    }
}
