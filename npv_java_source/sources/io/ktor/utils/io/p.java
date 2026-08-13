package io.ktor.utils.io;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends java.lang.IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, java.lang.Throwable th) {
        super("Concurrent " + str + " attempts", th);
        p247y7.AbstractC7350t.f(str, "taskName");
    }
}
