package G7;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends java.lang.Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
        p247y7.AbstractC7350t.f(illegalAccessException, "cause");
    }
}
