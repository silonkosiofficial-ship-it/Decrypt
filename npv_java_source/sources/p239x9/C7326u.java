package p239x9;

/* JADX INFO: renamed from: x9.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7326u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p239x9.C7326u.a f57044e = new p239x9.C7326u.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long[] f57045f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p219v9.f f57046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.p f57047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f57048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f57049d;

    /* JADX INFO: renamed from: x9.u$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public C7326u(p219v9.f fVar, p237x7.p pVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(pVar, "readIfAbsent");
        this.f57046a = fVar;
        this.f57047b = pVar;
        int iE = fVar.e();
        if (iE <= 64) {
            this.f57048c = iE != 64 ? (-1) << iE : 0L;
            this.f57049d = f57045f;
        } else {
            this.f57048c = 0L;
            this.f57049d = e(iE);
        }
    }

    private final void b(int i6) {
        int i10 = (i6 >>> 6) - 1;
        long[] jArr = this.f57049d;
        jArr[i10] = jArr[i10] | (1 << (i6 & 63));
    }

    private final int c() {
        int length = this.f57049d.length;
        int i6 = 0;
        while (i6 < length) {
            int i10 = i6 + 1;
            int i11 = i10 * 64;
            long j6 = this.f57049d[i6];
            while (j6 != -1) {
                int iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(~j6);
                j6 |= 1 << iNumberOfTrailingZeros;
                int i12 = iNumberOfTrailingZeros + i11;
                if (((java.lang.Boolean) this.f57047b.u(this.f57046a, java.lang.Integer.valueOf(i12))).booleanValue()) {
                    this.f57049d[i6] = j6;
                    return i12;
                }
            }
            this.f57049d[i6] = j6;
            i6 = i10;
        }
        return -1;
    }

    private final long[] e(int i6) {
        long[] jArr = new long[(i6 - 1) >>> 6];
        if ((i6 & 63) != 0) {
            jArr[p097j7.AbstractC6872n.d0(jArr)] = (-1) << i6;
        }
        return jArr;
    }

    public final void a(int i6) {
        if (i6 < 64) {
            this.f57048c |= 1 << i6;
        } else {
            b(i6);
        }
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iE = this.f57046a.e();
        do {
            long j6 = this.f57048c;
            if (j6 == -1) {
                if (iE > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(~j6);
            this.f57048c |= 1 << iNumberOfTrailingZeros;
        } while (!((java.lang.Boolean) this.f57047b.u(this.f57046a, java.lang.Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
