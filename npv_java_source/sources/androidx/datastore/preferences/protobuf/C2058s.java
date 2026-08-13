package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2058s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.C2058s f22146d = new androidx.datastore.preferences.protobuf.C2058s(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.h0 f22147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22149c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f22151b;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.r0.b.values().length];
            f22151b = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.r0.b.f22114E.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22115F.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22116G.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22117H.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22118I.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22119J.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22120K.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22121L.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22123N.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22124O.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22122M.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22125P.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22126Q.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22128S.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22129T.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22130U.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22131V.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                f22151b[androidx.datastore.preferences.protobuf.r0.b.f22127R.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[androidx.datastore.preferences.protobuf.r0.c.values().length];
            f22150a = iArr2;
            try {
                iArr2[androidx.datastore.preferences.protobuf.r0.c.INT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                f22150a[androidx.datastore.preferences.protobuf.r0.c.LONG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                f22150a[androidx.datastore.preferences.protobuf.r0.c.FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                f22150a[androidx.datastore.preferences.protobuf.r0.c.DOUBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                f22150a[androidx.datastore.preferences.protobuf.r0.c.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                f22150a[androidx.datastore.preferences.protobuf.r0.c.STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                f22150a[androidx.datastore.preferences.protobuf.r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                f22150a[androidx.datastore.preferences.protobuf.r0.c.ENUM.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                f22150a[androidx.datastore.preferences.protobuf.r0.c.MESSAGE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$b */
    public interface b extends java.lang.Comparable {
        int c();

        boolean h();

        androidx.datastore.preferences.protobuf.r0.b j();

        boolean k();
    }

    private C2058s() {
        this.f22147a = androidx.datastore.preferences.protobuf.h0.s(16);
    }

    private C2058s(androidx.datastore.preferences.protobuf.h0 h0Var) {
        this.f22147a = h0Var;
        o();
    }

    private C2058s(boolean z6) {
        this(androidx.datastore.preferences.protobuf.h0.s(0));
        o();
    }

    static int b(androidx.datastore.preferences.protobuf.r0.b bVar, int i6, java.lang.Object obj) {
        int iO = androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6);
        if (bVar == androidx.datastore.preferences.protobuf.r0.b.f22123N) {
            iO *= 2;
        }
        return iO + c(bVar, obj);
    }

    static int c(androidx.datastore.preferences.protobuf.r0.b bVar, java.lang.Object obj) {
        switch (androidx.datastore.preferences.protobuf.C2058s.a.f22151b[bVar.ordinal()]) {
            case 1:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.i(((java.lang.Double) obj).doubleValue());
            case 2:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.q(((java.lang.Float) obj).floatValue());
            case 3:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.x(((java.lang.Long) obj).longValue());
            case 4:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.S(((java.lang.Long) obj).longValue());
            case 5:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.v(((java.lang.Integer) obj).intValue());
            case 6:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.o(((java.lang.Long) obj).longValue());
            case 7:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.m(((java.lang.Integer) obj).intValue());
            case 8:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.d(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.s((androidx.datastore.preferences.protobuf.O) obj);
            case 10:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.A((androidx.datastore.preferences.protobuf.O) obj);
            case 11:
                return obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g ? androidx.datastore.preferences.protobuf.AbstractC2050j.g((androidx.datastore.preferences.protobuf.AbstractC2047g) obj) : androidx.datastore.preferences.protobuf.AbstractC2050j.N((java.lang.String) obj);
            case 12:
                return obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g ? androidx.datastore.preferences.protobuf.AbstractC2050j.g((androidx.datastore.preferences.protobuf.AbstractC2047g) obj) : androidx.datastore.preferences.protobuf.AbstractC2050j.e((byte[]) obj);
            case 13:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.Q(((java.lang.Integer) obj).intValue());
            case 14:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.F(((java.lang.Integer) obj).intValue());
            case 15:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.H(((java.lang.Long) obj).longValue());
            case 16:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.J(((java.lang.Integer) obj).intValue());
            case 17:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.L(((java.lang.Long) obj).longValue());
            case 18:
                return androidx.datastore.preferences.protobuf.AbstractC2050j.k(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(androidx.datastore.preferences.protobuf.C2058s.b bVar, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.r0.b bVarJ = bVar.j();
        int iC = bVar.c();
        if (!bVar.h()) {
            return b(bVarJ, iC, obj);
        }
        java.util.List list = (java.util.List) obj;
        int iB = 0;
        if (!bVar.k()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                iB += b(bVarJ, iC, it.next());
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iB += c(bVarJ, it2.next());
        }
        return androidx.datastore.preferences.protobuf.AbstractC2050j.O(iC) + iB + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(iB);
    }

    private int g(java.util.Map.Entry entry) {
        androidx.appcompat.app.D.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(androidx.datastore.preferences.protobuf.r0.b bVar, boolean z6) {
        if (z6) {
            return 2;
        }
        return bVar.g();
    }

    private static boolean l(java.util.Map.Entry entry) {
        androidx.appcompat.app.D.a(entry.getKey());
        throw null;
    }

    private static boolean m(androidx.datastore.preferences.protobuf.r0.b bVar, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.AbstractC2064y.a(obj);
        switch (androidx.datastore.preferences.protobuf.C2058s.a.f22150a[bVar.e().ordinal()]) {
            case 1:
                return obj instanceof java.lang.Integer;
            case 2:
                return obj instanceof java.lang.Long;
            case 3:
                return obj instanceof java.lang.Float;
            case 4:
                return obj instanceof java.lang.Double;
            case 5:
                return obj instanceof java.lang.Boolean;
            case 6:
                return obj instanceof java.lang.String;
            case 7:
                return (obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g) || (obj instanceof byte[]);
            case 8:
                return obj instanceof java.lang.Integer;
            case 9:
                return obj instanceof androidx.datastore.preferences.protobuf.O;
            default:
                return false;
        }
    }

    private void q(java.util.Map.Entry entry) {
        androidx.appcompat.app.D.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static androidx.datastore.preferences.protobuf.C2058s r() {
        return new androidx.datastore.preferences.protobuf.C2058s();
    }

    private void t(androidx.datastore.preferences.protobuf.C2058s.b bVar, java.lang.Object obj) {
        if (!m(bVar.j(), obj)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(bVar.c()), bVar.j().e(), obj.getClass().getName()));
        }
    }

    static void u(androidx.datastore.preferences.protobuf.AbstractC2050j abstractC2050j, androidx.datastore.preferences.protobuf.r0.b bVar, int i6, java.lang.Object obj) {
        if (bVar == androidx.datastore.preferences.protobuf.r0.b.f22123N) {
            abstractC2050j.q0(i6, (androidx.datastore.preferences.protobuf.O) obj);
        } else {
            abstractC2050j.M0(i6, i(bVar, false));
            v(abstractC2050j, bVar, obj);
        }
    }

    static void v(androidx.datastore.preferences.protobuf.AbstractC2050j abstractC2050j, androidx.datastore.preferences.protobuf.r0.b bVar, java.lang.Object obj) {
        switch (androidx.datastore.preferences.protobuf.C2058s.a.f22151b[bVar.ordinal()]) {
            case 1:
                abstractC2050j.h0(((java.lang.Double) obj).doubleValue());
                return;
            case 2:
                abstractC2050j.p0(((java.lang.Float) obj).floatValue());
                return;
            case 3:
                abstractC2050j.x0(((java.lang.Long) obj).longValue());
                return;
            case 4:
                abstractC2050j.Q0(((java.lang.Long) obj).longValue());
                return;
            case 5:
                abstractC2050j.v0(((java.lang.Integer) obj).intValue());
                return;
            case 6:
                abstractC2050j.n0(((java.lang.Long) obj).longValue());
                return;
            case 7:
                abstractC2050j.l0(((java.lang.Integer) obj).intValue());
                return;
            case 8:
                abstractC2050j.b0(((java.lang.Boolean) obj).booleanValue());
                return;
            case 9:
                abstractC2050j.s0((androidx.datastore.preferences.protobuf.O) obj);
                return;
            case 10:
                abstractC2050j.z0((androidx.datastore.preferences.protobuf.O) obj);
                return;
            case 11:
                if (!(obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g)) {
                    abstractC2050j.L0((java.lang.String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g)) {
                    abstractC2050j.c0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                abstractC2050j.O0(((java.lang.Integer) obj).intValue());
                return;
            case 14:
                abstractC2050j.D0(((java.lang.Integer) obj).intValue());
                return;
            case 15:
                abstractC2050j.F0(((java.lang.Long) obj).longValue());
                return;
            case 16:
                abstractC2050j.H0(((java.lang.Integer) obj).intValue());
                return;
            case 17:
                abstractC2050j.J0(((java.lang.Long) obj).longValue());
                return;
            case 18:
                abstractC2050j.j0(((java.lang.Integer) obj).intValue());
                return;
            default:
                return;
        }
        abstractC2050j.f0((androidx.datastore.preferences.protobuf.AbstractC2047g) obj);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public androidx.datastore.preferences.protobuf.C2058s clone() {
        androidx.datastore.preferences.protobuf.C2058s c2058sR = r();
        for (int i6 = 0; i6 < this.f22147a.l(); i6++) {
            java.util.Map.Entry entryK = this.f22147a.k(i6);
            androidx.appcompat.app.D.a(entryK.getKey());
            c2058sR.s(null, entryK.getValue());
        }
        for (java.util.Map.Entry entry : this.f22147a.o()) {
            androidx.appcompat.app.D.a(entry.getKey());
            c2058sR.s(null, entry.getValue());
        }
        c2058sR.f22149c = this.f22149c;
        return c2058sR;
    }

    java.util.Iterator e() {
        return this.f22149c ? new androidx.datastore.preferences.protobuf.B(this.f22147a.h().iterator()) : this.f22147a.h().iterator();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.C2058s) {
            return this.f22147a.equals(((androidx.datastore.preferences.protobuf.C2058s) obj).f22147a);
        }
        return false;
    }

    public int f() {
        int iG = 0;
        for (int i6 = 0; i6 < this.f22147a.l(); i6++) {
            iG += g(this.f22147a.k(i6));
        }
        java.util.Iterator it = this.f22147a.o().iterator();
        while (it.hasNext()) {
            iG += g((java.util.Map.Entry) it.next());
        }
        return iG;
    }

    public int h() {
        int iD = 0;
        for (int i6 = 0; i6 < this.f22147a.l(); i6++) {
            java.util.Map.Entry entryK = this.f22147a.k(i6);
            androidx.appcompat.app.D.a(entryK.getKey());
            iD += d(null, entryK.getValue());
        }
        for (java.util.Map.Entry entry : this.f22147a.o()) {
            androidx.appcompat.app.D.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public int hashCode() {
        return this.f22147a.hashCode();
    }

    boolean j() {
        return this.f22147a.isEmpty();
    }

    public boolean k() {
        for (int i6 = 0; i6 < this.f22147a.l(); i6++) {
            if (!l(this.f22147a.k(i6))) {
                return false;
            }
        }
        java.util.Iterator it = this.f22147a.o().iterator();
        while (it.hasNext()) {
            if (!l((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public java.util.Iterator n() {
        return this.f22149c ? new androidx.datastore.preferences.protobuf.B(this.f22147a.entrySet().iterator()) : this.f22147a.entrySet().iterator();
    }

    public void o() {
        if (this.f22148b) {
            return;
        }
        for (int i6 = 0; i6 < this.f22147a.l(); i6++) {
            java.util.Map.Entry entryK = this.f22147a.k(i6);
            if (entryK.getValue() instanceof androidx.datastore.preferences.protobuf.AbstractC2062w) {
                ((androidx.datastore.preferences.protobuf.AbstractC2062w) entryK.getValue()).C();
            }
        }
        this.f22147a.r();
        this.f22148b = true;
    }

    public void p(androidx.datastore.preferences.protobuf.C2058s c2058s) {
        for (int i6 = 0; i6 < c2058s.f22147a.l(); i6++) {
            q(c2058s.f22147a.k(i6));
        }
        java.util.Iterator it = c2058s.f22147a.o().iterator();
        while (it.hasNext()) {
            q((java.util.Map.Entry) it.next());
        }
    }

    public void s(androidx.datastore.preferences.protobuf.C2058s.b bVar, java.lang.Object obj) {
        if (!bVar.h()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f22147a.put(bVar, obj);
    }
}
