package T6;

/* JADX INFO: loaded from: classes3.dex */
public final class Y extends java.lang.IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(java.lang.String str) {
        super("Header(s) " + str + " are controlled by the engine and cannot be set explicitly");
        p247y7.AbstractC7350t.f(str, "header");
    }
}
