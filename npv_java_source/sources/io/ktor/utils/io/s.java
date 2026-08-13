package io.ktor.utils.io;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements io.ktor.utils.io.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.ktor.utils.io.d f47671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W8.InterfaceC1822z0 f47672b;

    public s(io.ktor.utils.io.d dVar, W8.InterfaceC1822z0 interfaceC1822z0) {
        p247y7.AbstractC7350t.f(dVar, "channel");
        p247y7.AbstractC7350t.f(interfaceC1822z0, "job");
        this.f47671a = dVar;
        this.f47672b = interfaceC1822z0;
    }

    @Override // io.ktor.utils.io.m
    public W8.InterfaceC1822z0 a() {
        return this.f47672b;
    }

    public final io.ktor.utils.io.d b() {
        return this.f47671a;
    }
}
