package p108k8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p108k8.a.C0626a f49762f = new p108k8.a.C0626a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f49763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f49766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f49767e;

    /* JADX INFO: renamed from: k8.a$a, reason: collision with other inner class name */
    public static final class C0626a {
        private C0626a() {
        }

        public /* synthetic */ C0626a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public a(int... iArr) {
        java.util.List listM;
        p247y7.AbstractC7350t.f(iArr, "numbers");
        this.f49763a = iArr;
        java.lang.Integer numF0 = p097j7.AbstractC6872n.f0(iArr, 0);
        this.f49764b = numF0 != null ? numF0.intValue() : -1;
        java.lang.Integer numF1 = p097j7.AbstractC6872n.f0(iArr, 1);
        this.f49765c = numF1 != null ? numF1.intValue() : -1;
        java.lang.Integer numF2 = p097j7.AbstractC6872n.f0(iArr, 2);
        this.f49766d = numF2 != null ? numF2.intValue() : -1;
        if (iArr.length <= 3) {
            listM = p097j7.AbstractC6879v.m();
        } else {
            if (iArr.length > 1024) {
                throw new java.lang.IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            listM = p097j7.AbstractC6879v.T0(p097j7.AbstractC6872n.c(iArr).subList(3, iArr.length));
        }
        this.f49767e = listM;
    }

    public final int a() {
        return this.f49764b;
    }

    public final int b() {
        return this.f49765c;
    }

    public final boolean c(int i6, int i10, int i11) {
        int i12 = this.f49764b;
        if (i12 > i6) {
            return true;
        }
        if (i12 < i6) {
            return false;
        }
        int i13 = this.f49765c;
        if (i13 > i10) {
            return true;
        }
        return i13 >= i10 && this.f49766d >= i11;
    }

    public final boolean d(p108k8.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "version");
        return c(aVar.f49764b, aVar.f49765c, aVar.f49766d);
    }

    public final boolean e(int i6, int i10, int i11) {
        int i12 = this.f49764b;
        if (i12 < i6) {
            return true;
        }
        if (i12 > i6) {
            return false;
        }
        int i13 = this.f49765c;
        if (i13 < i10) {
            return true;
        }
        return i13 <= i10 && this.f49766d <= i11;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && p247y7.AbstractC7350t.b(getClass(), obj.getClass())) {
            p108k8.a aVar = (p108k8.a) obj;
            if (this.f49764b == aVar.f49764b && this.f49765c == aVar.f49765c && this.f49766d == aVar.f49766d && p247y7.AbstractC7350t.b(this.f49767e, aVar.f49767e)) {
                return true;
            }
        }
        return false;
    }

    protected final boolean f(p108k8.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "ourVersion");
        int i6 = this.f49764b;
        if (i6 == 0) {
            if (aVar.f49764b != 0 || this.f49765c != aVar.f49765c) {
                return false;
            }
        } else if (i6 != aVar.f49764b || this.f49765c > aVar.f49765c) {
            return false;
        }
        return true;
    }

    public final int[] g() {
        return this.f49763a;
    }

    public int hashCode() {
        int i6 = this.f49764b;
        int i10 = i6 + (i6 * 31) + this.f49765c;
        int i11 = i10 + (i10 * 31) + this.f49766d;
        return i11 + (i11 * 31) + this.f49767e.hashCode();
    }

    public java.lang.String toString() {
        int[] iArrG = g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 : iArrG) {
            if (i6 == -1) {
                break;
            }
            arrayList.add(java.lang.Integer.valueOf(i6));
        }
        return arrayList.isEmpty() ? "unknown" : p097j7.AbstractC6879v.r0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
