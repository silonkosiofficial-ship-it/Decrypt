package p138n8;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p138n8.g f51961a = new p138n8.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final S8.o f51962b = new S8.o("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.String f51963c = "$context_receiver";

    private g() {
    }

    public static final p138n8.f a(int i6) {
        p138n8.f fVarO = p138n8.f.o(f51963c + '_' + i6);
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        return fVarO;
    }

    public static final java.lang.String b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return f51962b.e(str, "_");
    }
}
