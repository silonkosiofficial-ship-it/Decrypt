package P6;

/* JADX INFO: loaded from: classes3.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f8360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Long f8361b;

    public static final class a extends P6.n {
        public abstract p237x7.a c();
    }

    public static final class b extends P6.n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p237x7.a f8362c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte[] bArr, p237x7.a aVar, java.lang.Long l6) {
            super(bArr, l6, null);
            p247y7.AbstractC7350t.f(bArr, "headers");
            p247y7.AbstractC7350t.f(aVar, "provider");
            this.f8362c = aVar;
        }

        public final p237x7.a c() {
            return this.f8362c;
        }
    }

    private n(byte[] bArr, java.lang.Long l6) {
        this.f8360a = bArr;
        this.f8361b = l6;
    }

    public /* synthetic */ n(byte[] bArr, java.lang.Long l6, p247y7.AbstractC7342k abstractC7342k) {
        this(bArr, l6);
    }

    public final byte[] a() {
        return this.f8360a;
    }

    public final java.lang.Long b() {
        return this.f8361b;
    }
}
