package H9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H9.A.a f4535a = new H9.A.a(null);

    public static final class a {

        /* JADX INFO: renamed from: H9.A$a$a, reason: collision with other inner class name */
        public static final class C0106a extends H9.A {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ H9.w f4536b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f4537c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ byte[] f4538d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f4539e;

            C0106a(H9.w wVar, int i6, byte[] bArr, int i10) {
                this.f4536b = wVar;
                this.f4537c = i6;
                this.f4538d = bArr;
                this.f4539e = i10;
            }

            @Override // H9.A
            public long a() {
                return this.f4537c;
            }

            @Override // H9.A
            public H9.w b() {
                return this.f4536b;
            }

            @Override // H9.A
            public void e(X9.InterfaceC1837e interfaceC1837e) {
                p247y7.AbstractC7350t.f(interfaceC1837e, "sink");
                interfaceC1837e.write(this.f4538d, this.f4539e, this.f4537c);
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ H9.A b(H9.A.a aVar, byte[] bArr, H9.w wVar, int i6, int i10, int i11, java.lang.Object obj) {
            if ((i11 & 1) != 0) {
                wVar = null;
            }
            if ((i11 & 2) != 0) {
                i6 = 0;
            }
            if ((i11 & 4) != 0) {
                i10 = bArr.length;
            }
            return aVar.a(bArr, wVar, i6, i10);
        }

        public final H9.A a(byte[] bArr, H9.w wVar, int i6, int i10) {
            p247y7.AbstractC7350t.f(bArr, "<this>");
            I9.d.l(bArr.length, i6, i10);
            return new H9.A.a.C0106a(wVar, i10, bArr, i6);
        }
    }

    public abstract long a();

    public abstract H9.w b();

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public abstract void e(X9.InterfaceC1837e interfaceC1837e);
}
