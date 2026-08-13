package T6;

/* JADX INFO: loaded from: classes3.dex */
public final class Q extends java.lang.IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(java.lang.String str, java.lang.Throwable th) {
        super("Fail to parse url: " + str, th);
        p247y7.AbstractC7350t.f(str, "urlString");
        p247y7.AbstractC7350t.f(th, "cause");
    }
}
