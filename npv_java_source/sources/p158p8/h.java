package p158p8;

/* JADX INFO: loaded from: classes2.dex */
final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p158p8.h f52795d = new p158p8.h(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f52797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52798c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p158p8.u f52796a = p158p8.u.p(16);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f52799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f52800b;

        static {
            int[] iArr = new int[p8.y.b.values().length];
            f52800b = iArr;
            try {
                iArr[p8.y.b.f52872E.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f52800b[p8.y.b.f52873F.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f52800b[p8.y.b.f52874G.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f52800b[p8.y.b.f52875H.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f52800b[p8.y.b.f52876I.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f52800b[p8.y.b.f52877J.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f52800b[p8.y.b.f52878K.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f52800b[p8.y.b.f52879L.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f52800b[p8.y.b.f52880M.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f52800b[p8.y.b.f52883P.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f52800b[p8.y.b.f52884Q.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f52800b[p8.y.b.f52886S.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                f52800b[p8.y.b.f52887T.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                f52800b[p8.y.b.f52888U.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                f52800b[p8.y.b.f52889V.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                f52800b[p8.y.b.f52881N.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                f52800b[p8.y.b.f52882O.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                f52800b[p8.y.b.f52885R.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[p8.y.c.values().length];
            f52799a = iArr2;
            try {
                iArr2[p8.y.c.INT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                f52799a[p8.y.c.LONG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                f52799a[p8.y.c.FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                f52799a[p8.y.c.DOUBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                f52799a[p8.y.c.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                f52799a[p8.y.c.STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                f52799a[p8.y.c.BYTE_STRING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                f52799a[p8.y.c.ENUM.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                f52799a[p8.y.c.MESSAGE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
        }
    }

    public interface b extends java.lang.Comparable {
        int c();

        boolean h();

        p8.y.b j();

        boolean k();

        p8.p.a l(p8.p.a aVar, p158p8.p pVar);

        p8.y.c p();
    }

    private h() {
    }

    private h(boolean z6) {
        q();
    }

    private java.lang.Object c(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int d(p8.y.b bVar, int i6, java.lang.Object obj) {
        int iC = p158p8.f.C(i6);
        if (bVar == p8.y.b.f52881N) {
            iC *= 2;
        }
        return iC + e(bVar, obj);
    }

    private static int e(p8.y.b bVar, java.lang.Object obj) {
        switch (p8.h.a.f52800b[bVar.ordinal()]) {
            case 1:
                return p158p8.f.g(((java.lang.Double) obj).doubleValue());
            case 2:
                return p158p8.f.m(((java.lang.Float) obj).floatValue());
            case 3:
                return p158p8.f.q(((java.lang.Long) obj).longValue());
            case 4:
                return p158p8.f.E(((java.lang.Long) obj).longValue());
            case 5:
                return p158p8.f.p(((java.lang.Integer) obj).intValue());
            case 6:
                return p158p8.f.k(((java.lang.Long) obj).longValue());
            case 7:
                return p158p8.f.j(((java.lang.Integer) obj).intValue());
            case 8:
                return p158p8.f.b(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return p158p8.f.B((java.lang.String) obj);
            case 10:
                return obj instanceof p158p8.d ? p158p8.f.e((p158p8.d) obj) : p158p8.f.c((byte[]) obj);
            case 11:
                return p158p8.f.D(((java.lang.Integer) obj).intValue());
            case 12:
                return p158p8.f.w(((java.lang.Integer) obj).intValue());
            case 13:
                return p158p8.f.x(((java.lang.Long) obj).longValue());
            case 14:
                return p158p8.f.y(((java.lang.Integer) obj).intValue());
            case 15:
                return p158p8.f.A(((java.lang.Long) obj).longValue());
            case 16:
                return p158p8.f.n((p158p8.p) obj);
            case 17:
                return p158p8.f.s((p158p8.p) obj);
            case 18:
                return obj instanceof p8.j.a ? p158p8.f.i(((p8.j.a) obj).c()) : p158p8.f.i(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(p8.h.b bVar, java.lang.Object obj) {
        p8.y.b bVarJ = bVar.j();
        int iC = bVar.c();
        if (!bVar.h()) {
            return d(bVarJ, iC, obj);
        }
        int iD = 0;
        java.util.List list = (java.util.List) obj;
        if (bVar.k()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                iD += e(bVarJ, it.next());
            }
            return p158p8.f.C(iC) + iD + p158p8.f.u(iD);
        }
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iD += d(bVarJ, iC, it2.next());
        }
        return iD;
    }

    public static p158p8.h g() {
        return f52795d;
    }

    static int l(p8.y.b bVar, boolean z6) {
        if (z6) {
            return 2;
        }
        return bVar.g();
    }

    private boolean o(java.util.Map.Entry entry) {
        p8.h.b bVar = (p8.h.b) entry.getKey();
        if (bVar.p() != p8.y.c.MESSAGE) {
            return true;
        }
        boolean zH = bVar.h();
        java.lang.Object value = entry.getValue();
        if (!zH) {
            if (value instanceof p158p8.p) {
                return ((p158p8.p) value).d();
            }
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        java.util.Iterator it = ((java.util.List) value).iterator();
        while (it.hasNext()) {
            if (!((p158p8.p) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    private void s(java.util.Map.Entry entry) {
        p158p8.u uVar;
        java.lang.Object objC;
        java.lang.Object objH;
        p8.h.b bVar = (p8.h.b) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (bVar.h()) {
            java.lang.Object objH2 = h(bVar);
            if (objH2 == null) {
                objH2 = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) objH2).add(c(it.next()));
            }
            this.f52796a.q(bVar, objH2);
            return;
        }
        if (bVar.p() != p8.y.c.MESSAGE || (objH = h(bVar)) == null) {
            uVar = this.f52796a;
            objC = c(value);
        } else {
            objC = bVar.l(((p158p8.p) objH).e(), (p158p8.p) value).i();
            uVar = this.f52796a;
        }
        uVar.q(bVar, objC);
    }

    public static p158p8.h t() {
        return new p158p8.h();
    }

    public static java.lang.Object u(p158p8.e eVar, p8.y.b bVar, boolean z6) {
        switch (p8.h.a.f52800b[bVar.ordinal()]) {
            case 1:
                return java.lang.Double.valueOf(eVar.l());
            case 2:
                return java.lang.Float.valueOf(eVar.p());
            case 3:
                return java.lang.Long.valueOf(eVar.s());
            case 4:
                return java.lang.Long.valueOf(eVar.L());
            case 5:
                return java.lang.Integer.valueOf(eVar.r());
            case 6:
                return java.lang.Long.valueOf(eVar.o());
            case 7:
                return java.lang.Integer.valueOf(eVar.n());
            case 8:
                return java.lang.Boolean.valueOf(eVar.j());
            case 9:
                return z6 ? eVar.I() : eVar.H();
            case 10:
                return eVar.k();
            case 11:
                return java.lang.Integer.valueOf(eVar.K());
            case 12:
                return java.lang.Integer.valueOf(eVar.D());
            case 13:
                return java.lang.Long.valueOf(eVar.E());
            case 14:
                return java.lang.Integer.valueOf(eVar.F());
            case 15:
                return java.lang.Long.valueOf(eVar.G());
            case 16:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    private static void w(p8.y.b bVar, java.lang.Object obj) {
        obj.getClass();
        boolean z6 = true;
        boolean z10 = false;
        switch (p8.h.a.f52799a[bVar.e().ordinal()]) {
            case 1:
                z10 = obj instanceof java.lang.Integer;
                break;
            case 2:
                z10 = obj instanceof java.lang.Long;
                break;
            case 3:
                z10 = obj instanceof java.lang.Float;
                break;
            case 4:
                z10 = obj instanceof java.lang.Double;
                break;
            case 5:
                z10 = obj instanceof java.lang.Boolean;
                break;
            case 6:
                z10 = obj instanceof java.lang.String;
                break;
            case 7:
                if (!(obj instanceof p158p8.d) && !(obj instanceof byte[])) {
                    z6 = false;
                }
                z10 = z6;
                break;
            case 8:
                if (!(obj instanceof java.lang.Integer) && !(obj instanceof p8.j.a)) {
                    z6 = false;
                }
                z10 = z6;
                break;
            case 9:
                z10 = obj instanceof p158p8.p;
                break;
        }
        if (!z10) {
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private static void x(p158p8.f fVar, p8.y.b bVar, int i6, java.lang.Object obj) throws java.io.IOException {
        if (bVar == p8.y.b.f52881N) {
            fVar.X(i6, (p158p8.p) obj);
        } else {
            fVar.v0(i6, l(bVar, false));
            y(fVar, bVar, obj);
        }
    }

    private static void y(p158p8.f fVar, p8.y.b bVar, java.lang.Object obj) throws java.io.IOException {
        switch (p8.h.a.f52800b[bVar.ordinal()]) {
            case 1:
                fVar.Q(((java.lang.Double) obj).doubleValue());
                break;
            case 2:
                fVar.W(((java.lang.Float) obj).floatValue());
                break;
            case 3:
                fVar.b0(((java.lang.Long) obj).longValue());
                break;
            case 4:
                fVar.y0(((java.lang.Long) obj).longValue());
                break;
            case 5:
                fVar.a0(((java.lang.Integer) obj).intValue());
                break;
            case 6:
                fVar.U(((java.lang.Long) obj).longValue());
                break;
            case 7:
                fVar.T(((java.lang.Integer) obj).intValue());
                break;
            case 8:
                fVar.L(((java.lang.Boolean) obj).booleanValue());
                break;
            case 9:
                fVar.u0((java.lang.String) obj);
                break;
            case 10:
                if (!(obj instanceof p158p8.d)) {
                    fVar.M((byte[]) obj);
                } else {
                    fVar.O((p158p8.d) obj);
                }
                break;
            case 11:
                fVar.x0(((java.lang.Integer) obj).intValue());
                break;
            case 12:
                fVar.p0(((java.lang.Integer) obj).intValue());
                break;
            case 13:
                fVar.q0(((java.lang.Long) obj).longValue());
                break;
            case 14:
                fVar.r0(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                fVar.t0(((java.lang.Long) obj).longValue());
                break;
            case 16:
                fVar.Y((p158p8.p) obj);
                break;
            case 17:
                fVar.d0((p158p8.p) obj);
                break;
            case 18:
                fVar.S(obj instanceof p8.j.a ? ((p8.j.a) obj).c() : ((java.lang.Integer) obj).intValue());
                break;
        }
    }

    public static void z(p8.h.b bVar, java.lang.Object obj, p158p8.f fVar) throws java.io.IOException {
        p8.y.b bVarJ = bVar.j();
        int iC = bVar.c();
        if (!bVar.h()) {
            x(fVar, bVarJ, iC, obj);
            return;
        }
        java.util.List list = (java.util.List) obj;
        if (!bVar.k()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                x(fVar, bVarJ, iC, it.next());
            }
            return;
        }
        fVar.v0(iC, 2);
        java.util.Iterator it2 = list.iterator();
        int iE = 0;
        while (it2.hasNext()) {
            iE += e(bVarJ, it2.next());
        }
        fVar.n0(iE);
        java.util.Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            y(fVar, bVarJ, it3.next());
        }
    }

    public void a(p8.h.b bVar, java.lang.Object obj) {
        java.util.List arrayList;
        if (!bVar.h()) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        w(bVar.j(), obj);
        java.lang.Object objH = h(bVar);
        if (objH == null) {
            arrayList = new java.util.ArrayList();
            this.f52796a.q(bVar, arrayList);
        } else {
            arrayList = (java.util.List) objH;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p158p8.h clone() {
        p158p8.h hVarT = t();
        for (int i6 = 0; i6 < this.f52796a.j(); i6++) {
            java.util.Map.Entry entryH = this.f52796a.h(i6);
            hVarT.v((p8.h.b) entryH.getKey(), entryH.getValue());
        }
        for (java.util.Map.Entry entry : this.f52796a.k()) {
            hVarT.v((p8.h.b) entry.getKey(), entry.getValue());
        }
        hVarT.f52798c = this.f52798c;
        return hVarT;
    }

    public java.lang.Object h(p8.h.b bVar) {
        return this.f52796a.get(bVar);
    }

    public java.lang.Object i(p8.h.b bVar, int i6) {
        if (!bVar.h()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object objH = h(bVar);
        if (objH != null) {
            return ((java.util.List) objH).get(i6);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public int j(p8.h.b bVar) {
        if (!bVar.h()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object objH = h(bVar);
        if (objH == null) {
            return 0;
        }
        return ((java.util.List) objH).size();
    }

    public int k() {
        int iF = 0;
        for (int i6 = 0; i6 < this.f52796a.j(); i6++) {
            java.util.Map.Entry entryH = this.f52796a.h(i6);
            iF += f((p8.h.b) entryH.getKey(), entryH.getValue());
        }
        for (java.util.Map.Entry entry : this.f52796a.k()) {
            iF += f((p8.h.b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean m(p8.h.b bVar) {
        if (bVar.h()) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f52796a.get(bVar) != null;
    }

    public boolean n() {
        for (int i6 = 0; i6 < this.f52796a.j(); i6++) {
            if (!o(this.f52796a.h(i6))) {
                return false;
            }
        }
        java.util.Iterator it = this.f52796a.k().iterator();
        while (it.hasNext()) {
            if (!o((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public java.util.Iterator p() {
        return this.f52798c ? new p158p8.l(this.f52796a.entrySet().iterator()) : this.f52796a.entrySet().iterator();
    }

    public void q() {
        if (this.f52797b) {
            return;
        }
        this.f52796a.o();
        this.f52797b = true;
    }

    public void r(p158p8.h hVar) {
        for (int i6 = 0; i6 < hVar.f52796a.j(); i6++) {
            s(hVar.f52796a.h(i6));
        }
        java.util.Iterator it = hVar.f52796a.k().iterator();
        while (it.hasNext()) {
            s((java.util.Map.Entry) it.next());
        }
    }

    public void v(p8.h.b bVar, java.lang.Object obj) {
        if (!bVar.h()) {
            w(bVar.j(), obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(bVar.j(), it.next());
            }
            obj = arrayList;
        }
        this.f52796a.q(bVar, obj);
    }
}
