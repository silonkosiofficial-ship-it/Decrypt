package P9;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends java.io.IOException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final P9.b f8700C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(P9.b bVar) {
        super("stream was reset: " + bVar);
        p247y7.AbstractC7350t.f(bVar, "errorCode");
        this.f8700C = bVar;
    }
}
