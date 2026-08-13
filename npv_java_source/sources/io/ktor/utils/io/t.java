package io.ktor.utils.io;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements W8.N {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final io.ktor.utils.io.g f47673C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p127m7.i f47674D;

    public t(io.ktor.utils.io.g gVar, p127m7.i iVar) {
        p247y7.AbstractC7350t.f(gVar, "channel");
        p247y7.AbstractC7350t.f(iVar, "coroutineContext");
        this.f47673C = gVar;
        this.f47674D = iVar;
    }

    public final io.ktor.utils.io.g a() {
        return this.f47673C;
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f47674D;
    }
}
