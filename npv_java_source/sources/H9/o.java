package H9;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H9.o f4787a = new H9.o();

    private o() {
    }

    public static final java.lang.String a(java.lang.String str, java.lang.String str2, java.nio.charset.Charset charset) {
        p247y7.AbstractC7350t.f(str, "username");
        p247y7.AbstractC7350t.f(str2, "password");
        p247y7.AbstractC7350t.f(charset, "charset");
        return "Basic " + X9.C1839g.f16149F.b(str + ':' + str2, charset).e();
    }
}
