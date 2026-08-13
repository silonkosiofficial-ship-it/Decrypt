package p079h9;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends java.lang.IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str) {
        super(str);
        p247y7.AbstractC7350t.f(str, "message");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        p247y7.AbstractC7350t.f(str, "message");
        p247y7.AbstractC7350t.f(th, "cause");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.Throwable th) {
        super(th);
        p247y7.AbstractC7350t.f(th, "cause");
    }
}
