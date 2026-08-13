package p067g7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g7.b.c f45568i = new g7.b.c(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f45569j = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f45570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p067g7.d f45571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f45572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W8.InterfaceC1783f0 f45573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f45574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f45575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f45576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.nio.ByteBuffer f45577h;

    public static final class a extends p067g7.b {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(boolean z6, byte[] bArr) {
            this(z6, bArr, false, false, false);
            p247y7.AbstractC7350t.f(bArr, "data");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z6, byte[] bArr, boolean z10, boolean z11, boolean z12) {
            super(z6, p067g7.d.BINARY, bArr, p067g7.e.f45590C, z10, z11, z12, null);
            p247y7.AbstractC7350t.f(bArr, "data");
        }
    }

    /* JADX INFO: renamed from: g7.b$b, reason: collision with other inner class name */
    public static final class C0514b extends p067g7.b {
        public C0514b(p067g7.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "reason");
            p149o9.a aVar2 = new p149o9.a();
            aVar2.F(aVar.a());
            p037d7.e.f(aVar2, aVar.c(), 0, 0, null, 14, null);
            this(aVar2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C0514b(p149o9.q qVar) {
            this(p149o9.r.a(qVar));
            p247y7.AbstractC7350t.f(qVar, "packet");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0514b(byte[] bArr) {
            super(true, p067g7.d.CLOSE, bArr, p067g7.e.f45590C, false, false, false, null);
            p247y7.AbstractC7350t.f(bArr, "data");
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public static final class d extends p067g7.b {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(boolean z6, byte[] bArr) {
            this(z6, bArr, false, false, false);
            p247y7.AbstractC7350t.f(bArr, "data");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z6, byte[] bArr, boolean z10, boolean z11, boolean z12) {
            super(z6, p067g7.d.TEXT, bArr, p067g7.e.f45590C, z10, z11, z12, null);
            p247y7.AbstractC7350t.f(bArr, "data");
        }
    }

    private b(boolean z6, p067g7.d dVar, byte[] bArr, W8.InterfaceC1783f0 interfaceC1783f0, boolean z10, boolean z11, boolean z12) {
        this.f45570a = z6;
        this.f45571b = dVar;
        this.f45572c = bArr;
        this.f45573d = interfaceC1783f0;
        this.f45574e = z10;
        this.f45575f = z11;
        this.f45576g = z12;
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        p247y7.AbstractC7350t.e(byteBufferWrap, "wrap(...)");
        this.f45577h = byteBufferWrap;
    }

    public /* synthetic */ b(boolean z6, p067g7.d dVar, byte[] bArr, W8.InterfaceC1783f0 interfaceC1783f0, boolean z10, boolean z11, boolean z12, p247y7.AbstractC7342k abstractC7342k) {
        this(z6, dVar, bArr, interfaceC1783f0, z10, z11, z12);
    }

    public final byte[] a() {
        return this.f45572c;
    }

    public java.lang.String toString() {
        return "Frame " + this.f45571b + " (fin=" + this.f45570a + ", buffer len = " + this.f45572c.length + ')';
    }
}
