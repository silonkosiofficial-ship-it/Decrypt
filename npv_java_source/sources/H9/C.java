package H9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C implements java.io.Closeable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final H9.C.a f4567C = new H9.C.a(null);

    public static final class a {

        /* JADX INFO: renamed from: H9.C$a$a, reason: collision with other inner class name */
        public static final class C0107a extends H9.C {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ H9.w f4568D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ long f4569E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ X9.InterfaceC1838f f4570F;

            C0107a(H9.w wVar, long j6, X9.InterfaceC1838f interfaceC1838f) {
                this.f4568D = wVar;
                this.f4569E = j6;
                this.f4570F = interfaceC1838f;
            }

            @Override // H9.C
            public long a() {
                return this.f4569E;
            }

            @Override // H9.C
            public H9.w f() {
                return this.f4568D;
            }

            @Override // H9.C
            public X9.InterfaceC1838f g() {
                return this.f4570F;
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ H9.C c(H9.C.a aVar, byte[] bArr, H9.w wVar, int i6, java.lang.Object obj) {
            if ((i6 & 1) != 0) {
                wVar = null;
            }
            return aVar.b(bArr, wVar);
        }

        public final H9.C a(X9.InterfaceC1838f interfaceC1838f, H9.w wVar, long j6) {
            p247y7.AbstractC7350t.f(interfaceC1838f, "<this>");
            return new H9.C.a.C0107a(wVar, j6, interfaceC1838f);
        }

        public final H9.C b(byte[] bArr, H9.w wVar) {
            p247y7.AbstractC7350t.f(bArr, "<this>");
            return a(new X9.C1836d().X0(bArr), wVar, bArr.length);
        }
    }

    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        I9.d.m(g());
    }

    public abstract H9.w f();

    public abstract X9.InterfaceC1838f g();
}
