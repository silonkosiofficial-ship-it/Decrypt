package M0;

/* JADX INFO: renamed from: M0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1336h {

    /* JADX INFO: renamed from: M0.h$a */
    public static final class a extends M0.AbstractC1336h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f6719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final M0.L f6720b;

        public a(java.lang.String str, M0.L l6, M0.InterfaceC1337i interfaceC1337i) {
            super(null);
            this.f6719a = str;
            this.f6720b = l6;
        }

        @Override // M0.AbstractC1336h
        public M0.InterfaceC1337i a() {
            return null;
        }

        public M0.L b() {
            return this.f6720b;
        }

        public final java.lang.String c() {
            return this.f6719a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof M0.AbstractC1336h.a)) {
                return false;
            }
            M0.AbstractC1336h.a aVar = (M0.AbstractC1336h.a) obj;
            if (!p247y7.AbstractC7350t.b(this.f6719a, aVar.f6719a) || !p247y7.AbstractC7350t.b(b(), aVar.b())) {
                return false;
            }
            a();
            aVar.a();
            return p247y7.AbstractC7350t.b(null, null);
        }

        public int hashCode() {
            int iHashCode = this.f6719a.hashCode() * 31;
            M0.L lB = b();
            int iHashCode2 = (iHashCode + (lB != null ? lB.hashCode() : 0)) * 31;
            a();
            return iHashCode2;
        }

        public java.lang.String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.f6719a + ')';
        }
    }

    /* JADX INFO: renamed from: M0.h$b */
    public static final class b extends M0.AbstractC1336h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f6721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final M0.L f6722b;

        public b(java.lang.String str, M0.L l6, M0.InterfaceC1337i interfaceC1337i) {
            super(null);
            this.f6721a = str;
            this.f6722b = l6;
        }

        public /* synthetic */ b(java.lang.String str, M0.L l6, M0.InterfaceC1337i interfaceC1337i, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this(str, (i6 & 2) != 0 ? null : l6, (i6 & 4) != 0 ? null : interfaceC1337i);
        }

        @Override // M0.AbstractC1336h
        public M0.InterfaceC1337i a() {
            return null;
        }

        public M0.L b() {
            return this.f6722b;
        }

        public final java.lang.String c() {
            return this.f6721a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof M0.AbstractC1336h.b)) {
                return false;
            }
            M0.AbstractC1336h.b bVar = (M0.AbstractC1336h.b) obj;
            if (!p247y7.AbstractC7350t.b(this.f6721a, bVar.f6721a) || !p247y7.AbstractC7350t.b(b(), bVar.b())) {
                return false;
            }
            a();
            bVar.a();
            return p247y7.AbstractC7350t.b(null, null);
        }

        public int hashCode() {
            int iHashCode = this.f6721a.hashCode() * 31;
            M0.L lB = b();
            int iHashCode2 = (iHashCode + (lB != null ? lB.hashCode() : 0)) * 31;
            a();
            return iHashCode2;
        }

        public java.lang.String toString() {
            return "LinkAnnotation.Url(url=" + this.f6721a + ')';
        }
    }

    private AbstractC1336h() {
    }

    public /* synthetic */ AbstractC1336h(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public abstract M0.InterfaceC1337i a();
}
