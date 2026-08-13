package U8;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements java.io.Serializable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final U8.b.a f14617E = new U8.b.a(null);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final U8.b f14618F = new U8.b(0, 0);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final java.util.Comparator f14619G = new java.util.Comparator() { // from class: U8.a
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return U8.b.b((U8.b) obj, (U8.b) obj2);
        }
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final long f14620C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final long f14621D;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final U8.b a(long j6, long j10) {
            return (j6 == 0 && j10 == 0) ? b() : new U8.b(j6, j10);
        }

        public final U8.b b() {
            return U8.b.f14618F;
        }

        public final U8.b c(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "uuidString");
            if (str.length() != 36) {
                throw new java.lang.IllegalArgumentException("Expected a 36-char string in the standard uuid format.".toString());
            }
            long jG = S8.AbstractC1633f.g(str, 0, 8, null, 4, null);
            U8.d.c(str, 8);
            long jG2 = S8.AbstractC1633f.g(str, 9, 13, null, 4, null);
            U8.d.c(str, 13);
            long jG3 = S8.AbstractC1633f.g(str, 14, 18, null, 4, null);
            U8.d.c(str, 18);
            long jG4 = S8.AbstractC1633f.g(str, 19, 23, null, 4, null);
            U8.d.c(str, 23);
            return a((jG << 32) | (jG2 << 16) | jG3, S8.AbstractC1633f.g(str, 24, 36, null, 4, null) | (jG4 << 48));
        }
    }

    public b(long j6, long j10) {
        this.f14620C = j6;
        this.f14621D = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(U8.b bVar, U8.b bVar2) {
        long jG;
        long j6;
        p247y7.AbstractC7350t.f(bVar, "a");
        p247y7.AbstractC7350t.f(bVar2, "b");
        long j10 = bVar.f14620C;
        if (j10 != bVar2.f14620C) {
            jG = p087i7.G.g(j10);
            j6 = bVar2.f14620C;
        } else {
            jG = p087i7.G.g(bVar.f14621D);
            j6 = bVar2.f14621D;
        }
        return java.lang.Long.compare(jG ^ Long.MIN_VALUE, p087i7.G.g(j6) ^ Long.MIN_VALUE);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U8.b)) {
            return false;
        }
        U8.b bVar = (U8.b) obj;
        return this.f14620C == bVar.f14620C && this.f14621D == bVar.f14621D;
    }

    public int hashCode() {
        long j6 = this.f14620C ^ this.f14621D;
        return ((int) j6) ^ ((int) (j6 >> 32));
    }

    public java.lang.String toString() {
        byte[] bArr = new byte[36];
        U8.d.d(this.f14621D, bArr, 24, 6);
        bArr[23] = 45;
        U8.d.d(this.f14621D >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        U8.d.d(this.f14620C, bArr, 14, 2);
        bArr[13] = 45;
        U8.d.d(this.f14620C >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        U8.d.d(this.f14620C >>> 32, bArr, 0, 4);
        return S8.r.C(bArr);
    }
}
