package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class S implements androidx.datastore.preferences.protobuf.e0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f21945r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final sun.misc.Unsafe f21946s = androidx.datastore.preferences.protobuf.p0.D();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f21947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object[] f21948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.O f21951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f21952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f21953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f21955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f21956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f21957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f21958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.U f21959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.E f21960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.l0 f21961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.AbstractC2056p f21962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.J f21963q;

    private S(int[] iArr, java.lang.Object[] objArr, int i6, int i10, androidx.datastore.preferences.protobuf.O o6, boolean z6, boolean z10, int[] iArr2, int i11, int i12, androidx.datastore.preferences.protobuf.U u6, androidx.datastore.preferences.protobuf.E e6, androidx.datastore.preferences.protobuf.l0 l0Var, androidx.datastore.preferences.protobuf.AbstractC2056p abstractC2056p, androidx.datastore.preferences.protobuf.J j6) {
        this.f21947a = iArr;
        this.f21948b = objArr;
        this.f21949c = i6;
        this.f21950d = i10;
        this.f21953g = o6 instanceof androidx.datastore.preferences.protobuf.AbstractC2062w;
        this.f21954h = z6;
        this.f21952f = abstractC2056p != null && abstractC2056p.e(o6);
        this.f21955i = z10;
        this.f21956j = iArr2;
        this.f21957k = i11;
        this.f21958l = i12;
        this.f21959m = u6;
        this.f21960n = e6;
        this.f21961o = l0Var;
        this.f21962p = abstractC2056p;
        this.f21951e = o6;
        this.f21963q = j6;
    }

    private static boolean A(java.lang.Object obj, int i6, androidx.datastore.preferences.protobuf.e0 e0Var) {
        return e0Var.d(androidx.datastore.preferences.protobuf.p0.C(obj, U(i6)));
    }

    private boolean B(java.lang.Object obj, int i6, int i10) {
        java.util.List list = (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(i6));
        if (list.isEmpty()) {
            return true;
        }
        androidx.datastore.preferences.protobuf.e0 e0VarS = s(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!e0VarS.d(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    private boolean C(java.lang.Object obj, int i6, int i10) {
        java.util.Map mapH = this.f21963q.h(androidx.datastore.preferences.protobuf.p0.C(obj, U(i6)));
        if (mapH.isEmpty()) {
            return true;
        }
        if (this.f21963q.c(r(i10)).f21938c.e() != androidx.datastore.preferences.protobuf.r0.c.MESSAGE) {
            return true;
        }
        androidx.datastore.preferences.protobuf.e0 e0VarC = null;
        for (java.lang.Object obj2 : mapH.values()) {
            if (e0VarC == null) {
                e0VarC = androidx.datastore.preferences.protobuf.a0.a().c(obj2.getClass());
            }
            if (!e0VarC.d(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean D(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.AbstractC2062w) {
            return ((androidx.datastore.preferences.protobuf.AbstractC2062w) obj).B();
        }
        return true;
    }

    private boolean E(java.lang.Object obj, java.lang.Object obj2, int i6) {
        long jB0 = b0(i6) & 1048575;
        return androidx.datastore.preferences.protobuf.p0.z(obj, jB0) == androidx.datastore.preferences.protobuf.p0.z(obj2, jB0);
    }

    private boolean F(java.lang.Object obj, int i6, int i10) {
        return androidx.datastore.preferences.protobuf.p0.z(obj, (long) (b0(i10) & 1048575)) == i6;
    }

    private static boolean G(int i6) {
        return (i6 & 268435456) != 0;
    }

    private static java.util.List H(java.lang.Object obj, long j6) {
        return (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, j6);
    }

    private static long I(java.lang.Object obj, long j6) {
        return androidx.datastore.preferences.protobuf.p0.A(obj, j6);
    }

    /* JADX WARN: Code duplicated, block: B:180:0x0565 A[Catch: all -> 0x025e, TRY_LEAVE, TryCatch #9 {all -> 0x025e, blocks: (B:178:0x055f, B:180:0x0565, B:190:0x058e, B:109:0x0259, B:112:0x0261, B:113:0x026d, B:114:0x0272, B:115:0x027e, B:116:0x0283, B:117:0x028f, B:118:0x0294, B:119:0x02a0, B:120:0x02a5, B:121:0x02b7, B:122:0x02c6, B:123:0x02d2, B:124:0x02d7, B:125:0x02e3, B:126:0x02e8, B:127:0x02f4, B:128:0x02f9, B:129:0x0305, B:130:0x030a, B:131:0x0316, B:132:0x031b, B:133:0x0327, B:134:0x032c, B:135:0x0338, B:136:0x033d, B:137:0x0349, B:138:0x034e, B:139:0x035a, B:140:0x035f, B:141:0x036d, B:142:0x037b, B:143:0x0389, B:144:0x0397, B:145:0x03ab, B:146:0x03b9, B:147:0x03ca, B:148:0x03de, B:149:0x03e5, B:150:0x03f3, B:151:0x0401, B:152:0x040f, B:153:0x041d, B:154:0x042b, B:155:0x0439, B:156:0x0447, B:157:0x0455, B:158:0x0464, B:159:0x0469, B:160:0x0476, B:161:0x047b, B:162:0x0489, B:163:0x0497, B:164:0x04a5, B:165:0x04b6, B:166:0x04c4, B:167:0x04d2, B:168:0x04e2, B:169:0x04e8, B:170:0x04f6, B:171:0x0505, B:172:0x0514, B:173:0x0523, B:174:0x0532, B:175:0x0541, B:176:0x0550), top: B:232:0x055f }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0573 A[LOOP:2: B:183:0x056f->B:185:0x0573, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x0588  */
    /* JADX WARN: Code duplicated, block: B:189:0x058c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x058e A[Catch: all -> 0x025e, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x025e, blocks: (B:178:0x055f, B:180:0x0565, B:190:0x058e, B:109:0x0259, B:112:0x0261, B:113:0x026d, B:114:0x0272, B:115:0x027e, B:116:0x0283, B:117:0x028f, B:118:0x0294, B:119:0x02a0, B:120:0x02a5, B:121:0x02b7, B:122:0x02c6, B:123:0x02d2, B:124:0x02d7, B:125:0x02e3, B:126:0x02e8, B:127:0x02f4, B:128:0x02f9, B:129:0x0305, B:130:0x030a, B:131:0x0316, B:132:0x031b, B:133:0x0327, B:134:0x032c, B:135:0x0338, B:136:0x033d, B:137:0x0349, B:138:0x034e, B:139:0x035a, B:140:0x035f, B:141:0x036d, B:142:0x037b, B:143:0x0389, B:144:0x0397, B:145:0x03ab, B:146:0x03b9, B:147:0x03ca, B:148:0x03de, B:149:0x03e5, B:150:0x03f3, B:151:0x0401, B:152:0x040f, B:153:0x041d, B:154:0x042b, B:155:0x0439, B:156:0x0447, B:157:0x0455, B:158:0x0464, B:159:0x0469, B:160:0x0476, B:161:0x047b, B:162:0x0489, B:163:0x0497, B:164:0x04a5, B:165:0x04b6, B:166:0x04c4, B:167:0x04d2, B:168:0x04e2, B:169:0x04e8, B:170:0x04f6, B:171:0x0505, B:172:0x0514, B:173:0x0523, B:174:0x0532, B:175:0x0541, B:176:0x0550), top: B:232:0x055f }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0593  */
    /* JADX WARN: Code duplicated, block: B:198:0x05a2 A[LOOP:3: B:196:0x059e->B:198:0x05a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:202:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:209:0x05ce A[LOOP:4: B:207:0x05ca->B:209:0x05ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:211:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:244:0x056b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x059b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:? A[RETURN, SYNTHETIC] */
    private void J(androidx.datastore.preferences.protobuf.l0 l0Var, androidx.datastore.preferences.protobuf.AbstractC2056p abstractC2056p, java.lang.Object obj, androidx.datastore.preferences.protobuf.d0 d0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) throws java.lang.Throwable {
        java.lang.Object obj2;
        int i6;
        java.lang.Object objO;
        java.lang.Object obj3;
        java.lang.Object objF;
        java.lang.Object objF2;
        int i10;
        java.lang.Object objO2;
        int i11;
        java.lang.Object objO3;
        androidx.datastore.preferences.protobuf.O o6;
        java.util.List listE;
        java.util.List listE2;
        java.util.List listE3;
        java.util.List listE4;
        java.util.List listE5;
        java.util.List listE6;
        java.util.List listE7;
        java.util.List listE8;
        java.util.List listE9;
        java.util.List listE10;
        java.util.List listE11;
        java.util.List listE12;
        java.util.List listE13;
        java.util.List listE14;
        androidx.datastore.preferences.protobuf.O o10;
        androidx.datastore.preferences.protobuf.l0 l0Var2 = l0Var;
        java.lang.Object obj4 = obj;
        androidx.datastore.preferences.protobuf.C2055o c2055o2 = c2055o;
        androidx.datastore.preferences.protobuf.C2058s c2058s = null;
        java.lang.Object objG = null;
        while (true) {
            try {
                int iA = d0Var.A();
                int iA0 = a0(iA);
                if (iA0 >= 0) {
                    obj2 = obj4;
                    try {
                        int iN0 = n0(iA0);
                        try {
                            switch (m0(iN0)) {
                                case 0:
                                    androidx.datastore.preferences.protobuf.p0.N(obj2, U(iN0), d0Var.l());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 1:
                                    androidx.datastore.preferences.protobuf.p0.O(obj2, U(iN0), d0Var.I());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 2:
                                    androidx.datastore.preferences.protobuf.p0.Q(obj2, U(iN0), d0Var.N());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 3:
                                    androidx.datastore.preferences.protobuf.p0.Q(obj2, U(iN0), d0Var.b());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 4:
                                    androidx.datastore.preferences.protobuf.p0.P(obj2, U(iN0), d0Var.F());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 5:
                                    androidx.datastore.preferences.protobuf.p0.Q(obj2, U(iN0), d0Var.c());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 6:
                                    androidx.datastore.preferences.protobuf.p0.P(obj2, U(iN0), d0Var.g());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 7:
                                    androidx.datastore.preferences.protobuf.p0.H(obj2, U(iN0), d0Var.h());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 8:
                                    e0(obj2, iN0, d0Var);
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 9:
                                    c2055o2 = c2055o2;
                                    o6 = (androidx.datastore.preferences.protobuf.O) O(obj2, iA0);
                                    d0Var.o(o6, s(iA0), c2055o2);
                                    k0(obj2, iA0, o6);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 10:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), d0Var.D());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 11:
                                    androidx.datastore.preferences.protobuf.p0.P(obj2, U(iN0), d0Var.k());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 12:
                                    int iS = d0Var.s();
                                    q(iA0);
                                    androidx.datastore.preferences.protobuf.p0.P(obj2, U(iN0), iS);
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 13:
                                    androidx.datastore.preferences.protobuf.p0.P(obj2, U(iN0), d0Var.J());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 14:
                                    androidx.datastore.preferences.protobuf.p0.Q(obj2, U(iN0), d0Var.i());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 15:
                                    androidx.datastore.preferences.protobuf.p0.P(obj2, U(iN0), d0Var.w());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 16:
                                    androidx.datastore.preferences.protobuf.p0.Q(obj2, U(iN0), d0Var.x());
                                    h0(obj2, iA0);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 17:
                                    c2055o2 = c2055o2;
                                    o6 = (androidx.datastore.preferences.protobuf.O) O(obj2, iA0);
                                    d0Var.t(o6, s(iA0), c2055o2);
                                    k0(obj2, iA0, o6);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 18:
                                    listE = this.f21960n.e(obj2, U(iN0));
                                    d0Var.L(listE);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 19:
                                    listE2 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.E(listE2);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 20:
                                    listE3 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.m(listE3);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                                    listE4 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.j(listE4);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 22:
                                    listE5 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.p(listE5);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 23:
                                    listE6 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.P(listE6);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 24:
                                    listE7 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.v(listE7);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 25:
                                    listE8 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.y(listE8);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 26:
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    f0(obj2, iN0, d0Var);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 27:
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    d0(obj, iN0, d0Var, s(iA0), c2055o);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 28:
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    d0Var.K(this.f21960n.e(obj2, U(iN0)));
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 29:
                                    listE9 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.f(listE9);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 30:
                                    listE10 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.q(listE10);
                                    q(iA0);
                                    objG = androidx.datastore.preferences.protobuf.g0.z(obj, iA, listE10, null, objG, l0Var);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 31:
                                    listE11 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.d(listE11);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 32:
                                    listE12 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.n(listE12);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                                    listE13 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.a(listE13);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 34:
                                    listE14 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.e(listE14);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 35:
                                    listE = this.f21960n.e(obj2, U(iN0));
                                    d0Var.L(listE);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 36:
                                    listE2 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.E(listE2);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 37:
                                    listE3 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.m(listE3);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 38:
                                    listE4 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.j(listE4);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 39:
                                    listE5 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.p(listE5);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 40:
                                    listE6 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.P(listE6);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 41:
                                    listE7 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.v(listE7);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 42:
                                    listE8 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.y(listE8);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 43:
                                    listE9 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.f(listE9);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 44:
                                    listE10 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.q(listE10);
                                    q(iA0);
                                    objG = androidx.datastore.preferences.protobuf.g0.z(obj, iA, listE10, null, objG, l0Var);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 45:
                                    listE11 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.d(listE11);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 46:
                                    listE12 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.n(listE12);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 47:
                                    listE13 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.a(listE13);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 48:
                                    listE14 = this.f21960n.e(obj2, U(iN0));
                                    d0Var.e(listE14);
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 49:
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    try {
                                        c0(obj, U(iN0), d0Var, s(iA0), c2055o);
                                    } catch (androidx.datastore.preferences.protobuf.C2065z.a unused) {
                                        try {
                                            if (!l0Var2.q(d0Var)) {
                                                if (objG == null) {
                                                    objF2 = l0Var2.f(obj2);
                                                } else {
                                                    objF2 = objG;
                                                }
                                                try {
                                                    if (!l0Var2.m(objF2, d0Var)) {
                                                        objO2 = objF2;
                                                        for (i10 = this.f21957k; i10 < this.f21958l; i10++) {
                                                            objO2 = o(obj, this.f21956j[i10], objO2, l0Var, obj);
                                                        }
                                                        if (objO2 != null) {
                                                            l0Var2.o(obj2, objO2);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    objG = objF2;
                                                } catch (java.lang.Throwable th) {
                                                    th = th;
                                                    objG = objF2;
                                                }
                                            } else if (!d0Var.H()) {
                                                objO3 = objG;
                                                for (i11 = this.f21957k; i11 < this.f21958l; i11++) {
                                                    objO3 = o(obj, this.f21956j[i11], objO3, l0Var, obj);
                                                }
                                                if (objO3 != null) {
                                                    l0Var2.o(obj2, objO3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 50:
                                    c2055o2 = c2055o2;
                                    try {
                                        K(obj, iA0, r(iA0), c2055o, d0Var);
                                        l0Var2 = l0Var2;
                                    } catch (androidx.datastore.preferences.protobuf.C2065z.a unused2) {
                                        l0Var2 = l0Var2;
                                        if (!l0Var2.q(d0Var)) {
                                            if (objG == null) {
                                                objF2 = l0Var2.f(obj2);
                                            } else {
                                                objF2 = objG;
                                            }
                                            if (!l0Var2.m(objF2, d0Var)) {
                                                objO2 = objF2;
                                                while (i10 < this.f21958l) {
                                                    objO2 = o(obj, this.f21956j[i10], objO2, l0Var, obj);
                                                }
                                                if (objO2 != null) {
                                                    l0Var2.o(obj2, objO2);
                                                    return;
                                                }
                                                return;
                                            }
                                            objG = objF2;
                                        } else if (!d0Var.H()) {
                                            objO3 = objG;
                                            while (i11 < this.f21958l) {
                                                objO3 = o(obj, this.f21956j[i11], objO3, l0Var, obj);
                                            }
                                            if (objO3 != null) {
                                                l0Var2.o(obj2, objO3);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 51:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Double.valueOf(d0Var.l()));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 52:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Float.valueOf(d0Var.I()));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 53:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Long.valueOf(d0Var.N()));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 54:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Long.valueOf(d0Var.b()));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 55:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Integer.valueOf(d0Var.F()));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 56:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Long.valueOf(d0Var.c()));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 57:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Integer.valueOf(d0Var.g()));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 58:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Boolean.valueOf(d0Var.h()));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 59:
                                    e0(obj2, iN0, d0Var);
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 60:
                                    o10 = (androidx.datastore.preferences.protobuf.O) P(obj2, iA, iA0);
                                    d0Var.o(o10, s(iA0), c2055o2);
                                    l0(obj2, iA, iA0, o10);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 61:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), d0Var.D());
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 62:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Integer.valueOf(d0Var.k()));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 63:
                                    int iS2 = d0Var.s();
                                    q(iA0);
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Integer.valueOf(iS2));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 64:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Integer.valueOf(d0Var.J()));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 65:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Long.valueOf(d0Var.i()));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 66:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Integer.valueOf(d0Var.w()));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 67:
                                    androidx.datastore.preferences.protobuf.p0.R(obj2, U(iN0), java.lang.Long.valueOf(d0Var.x()));
                                    i0(obj2, iA, iA0);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                case 68:
                                    o10 = (androidx.datastore.preferences.protobuf.O) P(obj2, iA, iA0);
                                    d0Var.t(o10, s(iA0), c2055o2);
                                    l0(obj2, iA, iA0, o10);
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    obj4 = obj2;
                                    c2055o2 = c2055o2;
                                    l0Var2 = l0Var2;
                                    break;
                                default:
                                    if (objG == null) {
                                        objG = l0Var2.f(obj2);
                                    }
                                    objF = objG;
                                    try {
                                        if (!l0Var2.m(objF, d0Var)) {
                                            java.lang.Object objO4 = objF;
                                            for (int i12 = this.f21957k; i12 < this.f21958l; i12++) {
                                                objO4 = o(obj, this.f21956j[i12], objO4, l0Var, obj);
                                            }
                                            if (objO4 != null) {
                                                l0Var2.o(obj2, objO4);
                                                return;
                                            }
                                            return;
                                        }
                                        objG = objF;
                                        c2055o2 = c2055o2;
                                        l0Var2 = l0Var2;
                                        obj4 = obj2;
                                        c2055o2 = c2055o2;
                                        l0Var2 = l0Var2;
                                        break;
                                    } catch (androidx.datastore.preferences.protobuf.C2065z.a unused3) {
                                        objG = objF;
                                        c2055o2 = c2055o2;
                                        l0Var2 = l0Var2;
                                        if (!l0Var2.q(d0Var)) {
                                            if (objG == null) {
                                                objF2 = l0Var2.f(obj2);
                                            } else {
                                                objF2 = objG;
                                            }
                                            if (!l0Var2.m(objF2, d0Var)) {
                                                objO2 = objF2;
                                                while (i10 < this.f21958l) {
                                                    objO2 = o(obj, this.f21956j[i10], objO2, l0Var, obj);
                                                }
                                                if (objO2 != null) {
                                                    l0Var2.o(obj2, objO2);
                                                    return;
                                                }
                                                return;
                                            }
                                            objG = objF2;
                                        } else if (!d0Var.H()) {
                                            objO3 = objG;
                                            while (i11 < this.f21958l) {
                                                objO3 = o(obj, this.f21956j[i11], objO3, l0Var, obj);
                                            }
                                            if (objO3 != null) {
                                                l0Var2.o(obj2, objO3);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        objG = objF;
                                        l0Var2 = l0Var2;
                                        objO = objG;
                                        for (i6 = this.f21957k; i6 < this.f21958l; i6++) {
                                            objO = o(obj, this.f21956j[i6], objO, l0Var, obj);
                                        }
                                        if (objO != null) {
                                            l0Var2.o(obj2, objO);
                                        }
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (androidx.datastore.preferences.protobuf.C2065z.a unused4) {
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        l0Var2 = l0Var2;
                    }
                } else {
                    if (iA == Integer.MAX_VALUE) {
                        java.lang.Object objO5 = objG;
                        for (int i13 = this.f21957k; i13 < this.f21958l; i13++) {
                            objO5 = o(obj, this.f21956j[i13], objO5, l0Var, obj);
                        }
                        if (objO5 != null) {
                            l0Var2.o(obj4, objO5);
                            return;
                        }
                        return;
                    }
                    try {
                        java.lang.Object objB = !this.f21952f ? null : abstractC2056p.b(c2055o2, this.f21951e, iA);
                        if (objB != null) {
                            androidx.datastore.preferences.protobuf.C2058s c2058sD = c2058s == null ? abstractC2056p.d(obj) : c2058s;
                            obj3 = obj4;
                            try {
                                objG = abstractC2056p.g(obj, d0Var, objB, c2055o, c2058sD, objG, l0Var);
                                c2058s = c2058sD;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                obj2 = obj3;
                                l0Var2 = l0Var2;
                                objO = objG;
                                while (i6 < this.f21958l) {
                                    objO = o(obj, this.f21956j[i6], objO, l0Var, obj);
                                }
                                if (objO != null) {
                                    l0Var2.o(obj2, objO);
                                }
                                throw th;
                            }
                        } else {
                            obj3 = obj4;
                            if (!l0Var2.q(d0Var)) {
                                objF = objG == null ? l0Var2.f(obj3) : objG;
                                try {
                                    objG = objF;
                                    if (!l0Var2.m(objF, d0Var)) {
                                    }
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    obj2 = obj3;
                                    objG = objF;
                                    l0Var2 = l0Var2;
                                    objO = objG;
                                    while (i6 < this.f21958l) {
                                        objO = o(obj, this.f21956j[i6], objO, l0Var, obj);
                                    }
                                    if (objO != null) {
                                        l0Var2.o(obj2, objO);
                                    }
                                    throw th;
                                }
                            } else if (d0Var.H()) {
                            }
                        }
                        obj4 = obj3;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        obj2 = obj4;
                    }
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                l0Var2 = l0Var2;
                obj2 = obj4;
            }
            objO = objG;
            while (i6 < this.f21958l) {
                objO = o(obj, this.f21956j[i6], objO, l0Var, obj);
            }
            if (objO != null) {
                l0Var2.o(obj2, objO);
            }
            throw th;
        }
        int i14 = this.f21957k;
        java.lang.Object objO6 = objG;
        while (i14 < this.f21958l) {
            objO6 = o(obj, this.f21956j[i14], objO6, l0Var, obj);
            i14++;
            obj3 = obj3;
        }
        java.lang.Object obj5 = obj3;
        if (objO6 != null) {
            l0Var2.o(obj5, objO6);
        }
    }

    private final void K(java.lang.Object obj, int i6, java.lang.Object obj2, androidx.datastore.preferences.protobuf.C2055o c2055o, androidx.datastore.preferences.protobuf.d0 d0Var) {
        long jU = U(n0(i6));
        java.lang.Object objC = androidx.datastore.preferences.protobuf.p0.C(obj, jU);
        if (objC == null) {
            objC = this.f21963q.e(obj2);
            androidx.datastore.preferences.protobuf.p0.R(obj, jU, objC);
        } else if (this.f21963q.g(objC)) {
            java.lang.Object objE = this.f21963q.e(obj2);
            this.f21963q.a(objE, objC);
            androidx.datastore.preferences.protobuf.p0.R(obj, jU, objE);
            objC = objE;
        }
        d0Var.r(this.f21963q.d(objC), this.f21963q.c(obj2), c2055o);
    }

    private void L(java.lang.Object obj, java.lang.Object obj2, int i6) {
        if (y(obj2, i6)) {
            long jU = U(n0(i6));
            sun.misc.Unsafe unsafe = f21946s;
            java.lang.Object object = unsafe.getObject(obj2, jU);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + T(i6) + " is present but null: " + obj2);
            }
            androidx.datastore.preferences.protobuf.e0 e0VarS = s(i6);
            if (!y(obj, i6)) {
                if (D(object)) {
                    java.lang.Object objH = e0VarS.h();
                    e0VarS.a(objH, object);
                    unsafe.putObject(obj, jU, objH);
                } else {
                    unsafe.putObject(obj, jU, object);
                }
                h0(obj, i6);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, jU);
            if (!D(object2)) {
                java.lang.Object objH2 = e0VarS.h();
                e0VarS.a(objH2, object2);
                unsafe.putObject(obj, jU, objH2);
                object2 = objH2;
            }
            e0VarS.a(object2, object);
        }
    }

    private void M(java.lang.Object obj, java.lang.Object obj2, int i6) {
        int iT = T(i6);
        if (F(obj2, iT, i6)) {
            long jU = U(n0(i6));
            sun.misc.Unsafe unsafe = f21946s;
            java.lang.Object object = unsafe.getObject(obj2, jU);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + T(i6) + " is present but null: " + obj2);
            }
            androidx.datastore.preferences.protobuf.e0 e0VarS = s(i6);
            if (!F(obj, iT, i6)) {
                if (D(object)) {
                    java.lang.Object objH = e0VarS.h();
                    e0VarS.a(objH, object);
                    unsafe.putObject(obj, jU, objH);
                } else {
                    unsafe.putObject(obj, jU, object);
                }
                i0(obj, iT, i6);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, jU);
            if (!D(object2)) {
                java.lang.Object objH2 = e0VarS.h();
                e0VarS.a(objH2, object2);
                unsafe.putObject(obj, jU, objH2);
                object2 = objH2;
            }
            e0VarS.a(object2, object);
        }
    }

    private void N(java.lang.Object obj, java.lang.Object obj2, int i6) {
        int iN0 = n0(i6);
        long jU = U(iN0);
        int iT = T(i6);
        switch (m0(iN0)) {
            case 0:
                if (y(obj2, i6)) {
                    androidx.datastore.preferences.protobuf.p0.N(obj, jU, androidx.datastore.preferences.protobuf.p0.x(obj2, jU));
                    h0(obj, i6);
                }
                break;
            case 1:
                if (y(obj2, i6)) {
                    androidx.datastore.preferences.protobuf.p0.O(obj, jU, androidx.datastore.preferences.protobuf.p0.y(obj2, jU));
                    h0(obj, i6);
                }
                break;
            case 2:
                if (!y(obj2, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.Q(obj, jU, androidx.datastore.preferences.protobuf.p0.A(obj2, jU));
                h0(obj, i6);
                break;
            case 3:
                if (!y(obj2, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.Q(obj, jU, androidx.datastore.preferences.protobuf.p0.A(obj2, jU));
                h0(obj, i6);
                break;
            case 4:
                if (!y(obj2, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.P(obj, jU, androidx.datastore.preferences.protobuf.p0.z(obj2, jU));
                h0(obj, i6);
                break;
            case 5:
                if (!y(obj2, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.Q(obj, jU, androidx.datastore.preferences.protobuf.p0.A(obj2, jU));
                h0(obj, i6);
                break;
            case 6:
                if (!y(obj2, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.P(obj, jU, androidx.datastore.preferences.protobuf.p0.z(obj2, jU));
                h0(obj, i6);
                break;
            case 7:
                if (y(obj2, i6)) {
                    androidx.datastore.preferences.protobuf.p0.H(obj, jU, androidx.datastore.preferences.protobuf.p0.r(obj2, jU));
                    h0(obj, i6);
                }
                break;
            case 8:
                if (!y(obj2, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.R(obj, jU, androidx.datastore.preferences.protobuf.p0.C(obj2, jU));
                h0(obj, i6);
                break;
            case 9:
            case 17:
                L(obj, obj2, i6);
                break;
            case 10:
                if (!y(obj2, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.R(obj, jU, androidx.datastore.preferences.protobuf.p0.C(obj2, jU));
                h0(obj, i6);
                break;
            case 11:
                if (!y(obj2, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.P(obj, jU, androidx.datastore.preferences.protobuf.p0.z(obj2, jU));
                h0(obj, i6);
                break;
            case 12:
                if (!y(obj2, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.P(obj, jU, androidx.datastore.preferences.protobuf.p0.z(obj2, jU));
                h0(obj, i6);
                break;
            case 13:
                if (!y(obj2, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.P(obj, jU, androidx.datastore.preferences.protobuf.p0.z(obj2, jU));
                h0(obj, i6);
                break;
            case 14:
                if (!y(obj2, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.Q(obj, jU, androidx.datastore.preferences.protobuf.p0.A(obj2, jU));
                h0(obj, i6);
                break;
            case 15:
                if (!y(obj2, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.P(obj, jU, androidx.datastore.preferences.protobuf.p0.z(obj2, jU));
                h0(obj, i6);
                break;
            case 16:
                if (!y(obj2, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.Q(obj, jU, androidx.datastore.preferences.protobuf.p0.A(obj2, jU));
                h0(obj, i6);
                break;
            case 18:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f21960n.d(obj, obj2, jU);
                break;
            case 50:
                androidx.datastore.preferences.protobuf.g0.E(this.f21963q, obj, obj2, jU);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (!F(obj2, iT, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.R(obj, jU, androidx.datastore.preferences.protobuf.p0.C(obj2, jU));
                i0(obj, iT, i6);
                break;
            case 60:
            case 68:
                M(obj, obj2, i6);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!F(obj2, iT, i6)) {
                }
                androidx.datastore.preferences.protobuf.p0.R(obj, jU, androidx.datastore.preferences.protobuf.p0.C(obj2, jU));
                i0(obj, iT, i6);
                break;
        }
    }

    private java.lang.Object O(java.lang.Object obj, int i6) {
        androidx.datastore.preferences.protobuf.e0 e0VarS = s(i6);
        long jU = U(n0(i6));
        if (!y(obj, i6)) {
            return e0VarS.h();
        }
        java.lang.Object object = f21946s.getObject(obj, jU);
        if (D(object)) {
            return object;
        }
        java.lang.Object objH = e0VarS.h();
        if (object != null) {
            e0VarS.a(objH, object);
        }
        return objH;
    }

    private java.lang.Object P(java.lang.Object obj, int i6, int i10) {
        androidx.datastore.preferences.protobuf.e0 e0VarS = s(i10);
        if (!F(obj, i6, i10)) {
            return e0VarS.h();
        }
        java.lang.Object object = f21946s.getObject(obj, U(n0(i10)));
        if (D(object)) {
            return object;
        }
        java.lang.Object objH = e0VarS.h();
        if (object != null) {
            e0VarS.a(objH, object);
        }
        return objH;
    }

    static androidx.datastore.preferences.protobuf.S Q(java.lang.Class cls, androidx.datastore.preferences.protobuf.M m6, androidx.datastore.preferences.protobuf.U u6, androidx.datastore.preferences.protobuf.E e6, androidx.datastore.preferences.protobuf.l0 l0Var, androidx.datastore.preferences.protobuf.AbstractC2056p abstractC2056p, androidx.datastore.preferences.protobuf.J j6) {
        if (m6 instanceof androidx.datastore.preferences.protobuf.c0) {
            return S((androidx.datastore.preferences.protobuf.c0) m6, u6, e6, l0Var, abstractC2056p, j6);
        }
        androidx.appcompat.app.D.a(m6);
        return R(null, u6, e6, l0Var, abstractC2056p, j6);
    }

    static androidx.datastore.preferences.protobuf.S R(androidx.datastore.preferences.protobuf.i0 i0Var, androidx.datastore.preferences.protobuf.U u6, androidx.datastore.preferences.protobuf.E e6, androidx.datastore.preferences.protobuf.l0 l0Var, androidx.datastore.preferences.protobuf.AbstractC2056p abstractC2056p, androidx.datastore.preferences.protobuf.J j6) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x024f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0255  */
    /* JADX WARN: Code duplicated, block: B:127:0x026b  */
    /* JADX WARN: Code duplicated, block: B:129:0x026f  */
    /* JADX WARN: Code duplicated, block: B:163:0x031f  */
    /* JADX WARN: Code duplicated, block: B:179:0x036d  */
    /* JADX WARN: Code duplicated, block: B:182:0x037a  */
    static androidx.datastore.preferences.protobuf.S S(androidx.datastore.preferences.protobuf.c0 c0Var, androidx.datastore.preferences.protobuf.U u6, androidx.datastore.preferences.protobuf.E e6, androidx.datastore.preferences.protobuf.l0 l0Var, androidx.datastore.preferences.protobuf.AbstractC2056p abstractC2056p, androidx.datastore.preferences.protobuf.J j6) {
        int i6;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int iCharAt5;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        char cCharAt;
        int i13;
        char cCharAt2;
        int i14;
        char cCharAt3;
        int i15;
        char cCharAt4;
        int i16;
        char cCharAt5;
        int i17;
        char cCharAt6;
        int i18;
        char cCharAt7;
        int i19;
        char cCharAt8;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i26;
        int i27;
        java.lang.reflect.Field fieldG0;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        java.lang.Object obj;
        java.lang.reflect.Field fieldG1;
        int i31;
        java.lang.Object obj2;
        java.lang.reflect.Field fieldG2;
        int i32;
        char cCharAt10;
        int i33;
        char cCharAt11;
        int i34;
        char cCharAt12;
        int i35;
        char cCharAt13;
        boolean z6 = c0Var.c() == androidx.datastore.preferences.protobuf.Z.PROTO3;
        java.lang.String strE = c0Var.e();
        int length = strE.length();
        char c6 = 55296;
        if (strE.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i6 = i36 + 1;
                if (strE.charAt(i36) < 55296) {
                    break;
                }
                i36 = i6;
            }
        } else {
            i6 = 1;
        }
        int i37 = i6 + 1;
        int iCharAt6 = strE.charAt(i6);
        if (iCharAt6 >= 55296) {
            int i38 = iCharAt6 & 8191;
            int i39 = 13;
            while (true) {
                i35 = i37 + 1;
                cCharAt13 = strE.charAt(i37);
                if (cCharAt13 < 55296) {
                    break;
                }
                i38 |= (cCharAt13 & 8191) << i39;
                i39 += 13;
                i37 = i35;
            }
            iCharAt6 = i38 | (cCharAt13 << i39);
            i37 = i35;
        }
        if (iCharAt6 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            iCharAt5 = 0;
            i10 = 0;
            iArr = f21945r;
            i11 = 0;
        } else {
            int i40 = i37 + 1;
            int iCharAt7 = strE.charAt(i37);
            if (iCharAt7 >= 55296) {
                int i41 = iCharAt7 & 8191;
                int i42 = 13;
                while (true) {
                    i19 = i40 + 1;
                    cCharAt8 = strE.charAt(i40);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i19;
                }
                iCharAt7 = i41 | (cCharAt8 << i42);
                i40 = i19;
            }
            int i43 = i40 + 1;
            int iCharAt8 = strE.charAt(i40);
            if (iCharAt8 >= 55296) {
                int i44 = iCharAt8 & 8191;
                int i45 = 13;
                while (true) {
                    i18 = i43 + 1;
                    cCharAt7 = strE.charAt(i43);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i18;
                }
                iCharAt8 = i44 | (cCharAt7 << i45);
                i43 = i18;
            }
            int i46 = i43 + 1;
            iCharAt = strE.charAt(i43);
            if (iCharAt >= 55296) {
                int i47 = iCharAt & 8191;
                int i48 = 13;
                while (true) {
                    i17 = i46 + 1;
                    cCharAt6 = strE.charAt(i46);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i17;
                }
                iCharAt = i47 | (cCharAt6 << i48);
                i46 = i17;
            }
            int i49 = i46 + 1;
            iCharAt2 = strE.charAt(i46);
            if (iCharAt2 >= 55296) {
                int i50 = iCharAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i16 = i49 + 1;
                    cCharAt5 = strE.charAt(i49);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i16;
                }
                iCharAt2 = i50 | (cCharAt5 << i51);
                i49 = i16;
            }
            int i52 = i49 + 1;
            iCharAt3 = strE.charAt(i49);
            if (iCharAt3 >= 55296) {
                int i53 = iCharAt3 & 8191;
                int i54 = 13;
                while (true) {
                    i15 = i52 + 1;
                    cCharAt4 = strE.charAt(i52);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i15;
                }
                iCharAt3 = i53 | (cCharAt4 << i54);
                i52 = i15;
            }
            int i55 = i52 + 1;
            iCharAt4 = strE.charAt(i52);
            if (iCharAt4 >= 55296) {
                int i56 = iCharAt4 & 8191;
                int i57 = 13;
                while (true) {
                    i14 = i55 + 1;
                    cCharAt3 = strE.charAt(i55);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i14;
                }
                iCharAt4 = i56 | (cCharAt3 << i57);
                i55 = i14;
            }
            int i58 = i55 + 1;
            int iCharAt9 = strE.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = 13;
                while (true) {
                    i13 = i58 + 1;
                    cCharAt2 = strE.charAt(i58);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i13;
                }
                iCharAt9 = i59 | (cCharAt2 << i60);
                i58 = i13;
            }
            int i61 = i58 + 1;
            iCharAt5 = strE.charAt(i58);
            if (iCharAt5 >= 55296) {
                int i62 = iCharAt5 & 8191;
                int i63 = 13;
                while (true) {
                    i12 = i61 + 1;
                    cCharAt = strE.charAt(i61);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i62 |= (cCharAt & 8191) << i63;
                    i63 += 13;
                    i61 = i12;
                }
                iCharAt5 = i62 | (cCharAt << i63);
                i61 = i12;
            }
            iArr = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i10 = (iCharAt7 * 2) + iCharAt8;
            i11 = iCharAt7;
            i37 = i61;
        }
        sun.misc.Unsafe unsafe = f21946s;
        java.lang.Object[] objArrD = c0Var.d();
        java.lang.Class<?> cls = c0Var.b().getClass();
        int[] iArr2 = new int[iCharAt3 * 3];
        java.lang.Object[] objArr = new java.lang.Object[iCharAt3 * 2];
        int i64 = iCharAt5 + iCharAt4;
        int i65 = iCharAt5;
        int i66 = i64;
        int i67 = 0;
        int i68 = 0;
        while (i37 < length) {
            int i69 = i37 + 1;
            int iCharAt10 = strE.charAt(i37);
            if (iCharAt10 >= c6) {
                int i70 = iCharAt10 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i34 = i71 + 1;
                    cCharAt12 = strE.charAt(i71);
                    if (cCharAt12 < c6) {
                        break;
                    }
                    i70 |= (cCharAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i34;
                }
                iCharAt10 = i70 | (cCharAt12 << i72);
                i20 = i34;
            } else {
                i20 = i69;
            }
            int i73 = i20 + 1;
            int iCharAt11 = strE.charAt(i20);
            if (iCharAt11 >= c6) {
                int i74 = iCharAt11 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i33 = i75 + 1;
                    cCharAt11 = strE.charAt(i75);
                    i21 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i74 |= (cCharAt11 & 8191) << i76;
                    i76 += 13;
                    i75 = i33;
                    length = i21;
                }
                iCharAt11 = i74 | (cCharAt11 << i76);
                i22 = i33;
            } else {
                i21 = length;
                i22 = i73;
            }
            int i77 = iCharAt11 & 255;
            int i78 = iCharAt5;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i79 = i67;
            if (i77 >= 51) {
                int i80 = i22 + 1;
                int iCharAt12 = strE.charAt(i22);
                char c10 = 55296;
                if (iCharAt12 >= 55296) {
                    int i81 = iCharAt12 & 8191;
                    int i82 = 13;
                    while (true) {
                        i32 = i80 + 1;
                        cCharAt10 = strE.charAt(i80);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i81 |= (cCharAt10 & 8191) << i82;
                        i82 += 13;
                        i80 = i32;
                        c10 = 55296;
                    }
                    iCharAt12 = i81 | (cCharAt10 << i82);
                    i80 = i32;
                }
                int i83 = i77 - 51;
                int i84 = i80;
                if (i83 == 9 || i83 == 17) {
                    i29 = i10 + 1;
                    objArr[((i68 / 3) * 2) + 1] = objArrD[i10];
                } else {
                    if (i83 == 12 && !z6) {
                        i29 = i10 + 1;
                        objArr[((i68 / 3) * 2) + 1] = objArrD[i10];
                    }
                    i30 = iCharAt12 * 2;
                    obj = objArrD[i30];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldG1 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldG1 = g0(cls, (java.lang.String) obj);
                        objArrD[i30] = fieldG1;
                    }
                    i23 = iCharAt;
                    i24 = iCharAt2;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldG1);
                    i31 = i30 + 1;
                    obj2 = objArrD[i31];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldG2 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldG2 = g0(cls, (java.lang.String) obj2);
                        objArrD[i31] = fieldG2;
                    }
                    strE = strE;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG2);
                    z6 = z6;
                    i26 = i84;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i27 = 0;
                }
                i10 = i29;
                i30 = iCharAt12 * 2;
                obj = objArrD[i30];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldG1 = (java.lang.reflect.Field) obj;
                } else {
                    fieldG1 = g0(cls, (java.lang.String) obj);
                    objArrD[i30] = fieldG1;
                }
                i23 = iCharAt;
                i24 = iCharAt2;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldG1);
                i31 = i30 + 1;
                obj2 = objArrD[i31];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldG2 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldG2 = g0(cls, (java.lang.String) obj2);
                    objArrD[i31] = fieldG2;
                }
                strE = strE;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG2);
                z6 = z6;
                i26 = i84;
                iObjectFieldOffset = iObjectFieldOffset4;
                i27 = 0;
            } else {
                i23 = iCharAt;
                i24 = iCharAt2;
                int i85 = i10 + 1;
                java.lang.reflect.Field fieldG3 = g0(cls, (java.lang.String) objArrD[i10]);
                if (i77 == 9 || i77 == 17) {
                    objArr[((i68 / 3) * 2) + 1] = fieldG3.getType();
                } else {
                    if (i77 == 27 || i77 == 49) {
                        i28 = i10 + 2;
                        objArr[((i68 / 3) * 2) + 1] = objArrD[i85];
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        if (!z6) {
                            i28 = i10 + 2;
                            objArr[((i68 / 3) * 2) + 1] = objArrD[i85];
                        }
                    } else if (i77 == 50) {
                        int i86 = i65 + 1;
                        iArr[i65] = i68;
                        int i87 = (i68 / 3) * 2;
                        int i88 = i10 + 2;
                        objArr[i87] = objArrD[i85];
                        if ((iCharAt11 & 2048) != 0) {
                            i85 = i10 + 3;
                            objArr[i87 + 1] = objArrD[i88];
                            i65 = i86;
                        } else {
                            i65 = i86;
                            i25 = i88;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG3);
                        i10 = i25;
                        if ((iCharAt11 & 4096) == 4096 || i77 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i26 = i22;
                            i27 = 0;
                        } else {
                            int i89 = i22 + 1;
                            int iCharAt13 = strE.charAt(i22);
                            if (iCharAt13 >= 55296) {
                                int i90 = iCharAt13 & 8191;
                                int i91 = 13;
                                while (true) {
                                    i26 = i89 + 1;
                                    cCharAt9 = strE.charAt(i89);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i90 |= (cCharAt9 & 8191) << i91;
                                    i91 += 13;
                                    i89 = i26;
                                }
                                iCharAt13 = i90 | (cCharAt9 << i91);
                            } else {
                                i26 = i89;
                            }
                            int i92 = (i11 * 2) + (iCharAt13 / 32);
                            java.lang.Object obj3 = objArrD[i92];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldG0 = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldG0 = g0(cls, (java.lang.String) obj3);
                                objArrD[i92] = fieldG0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG0);
                            i27 = iCharAt13 % 32;
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = iObjectFieldOffset;
                            i66++;
                        }
                    }
                    i25 = i28;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG3);
                    i10 = i25;
                    if ((iCharAt11 & 4096) == 4096) {
                        iObjectFieldOffset2 = 1048575;
                        i26 = i22;
                        i27 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i26 = i22;
                        i27 = 0;
                    }
                    if (i77 >= 18) {
                        iArr[i66] = iObjectFieldOffset;
                        i66++;
                    }
                }
                i25 = i85;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG3);
                i10 = i25;
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i26 = i22;
                    i27 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i26 = i22;
                    i27 = 0;
                }
                if (i77 >= 18) {
                    iArr[i66] = iObjectFieldOffset;
                    i66++;
                }
            }
            int i93 = i68 + 1;
            iArr2[i68] = iCharAt10;
            int i94 = i68 + 2;
            iArr2[i93] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i77 << 20) | iObjectFieldOffset;
            i68 += 3;
            iArr2[i94] = (i27 << 20) | iObjectFieldOffset2;
            z6 = z6;
            iCharAt = i23;
            iCharAt5 = i78;
            i37 = i26;
            length = i21;
            strE = strE;
            i67 = i79;
            iCharAt2 = i24;
            c6 = 55296;
        }
        return new androidx.datastore.preferences.protobuf.S(iArr2, objArr, iCharAt, iCharAt2, c0Var.b(), z6, false, iArr, iCharAt5, i64, u6, e6, l0Var, abstractC2056p, j6);
    }

    private int T(int i6) {
        return this.f21947a[i6];
    }

    private static long U(int i6) {
        return i6 & 1048575;
    }

    private static boolean V(java.lang.Object obj, long j6) {
        return ((java.lang.Boolean) androidx.datastore.preferences.protobuf.p0.C(obj, j6)).booleanValue();
    }

    private static double W(java.lang.Object obj, long j6) {
        return ((java.lang.Double) androidx.datastore.preferences.protobuf.p0.C(obj, j6)).doubleValue();
    }

    private static float X(java.lang.Object obj, long j6) {
        return ((java.lang.Float) androidx.datastore.preferences.protobuf.p0.C(obj, j6)).floatValue();
    }

    private static int Y(java.lang.Object obj, long j6) {
        return ((java.lang.Integer) androidx.datastore.preferences.protobuf.p0.C(obj, j6)).intValue();
    }

    private static long Z(java.lang.Object obj, long j6) {
        return ((java.lang.Long) androidx.datastore.preferences.protobuf.p0.C(obj, j6)).longValue();
    }

    private int a0(int i6) {
        if (i6 < this.f21949c || i6 > this.f21950d) {
            return -1;
        }
        return j0(i6, 0);
    }

    private int b0(int i6) {
        return this.f21947a[i6 + 2];
    }

    private void c0(java.lang.Object obj, long j6, androidx.datastore.preferences.protobuf.d0 d0Var, androidx.datastore.preferences.protobuf.e0 e0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) {
        d0Var.G(this.f21960n.e(obj, j6), e0Var, c2055o);
    }

    private void d0(java.lang.Object obj, int i6, androidx.datastore.preferences.protobuf.d0 d0Var, androidx.datastore.preferences.protobuf.e0 e0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) {
        d0Var.M(this.f21960n.e(obj, U(i6)), e0Var, c2055o);
    }

    private void e0(java.lang.Object obj, int i6, androidx.datastore.preferences.protobuf.d0 d0Var) {
        long jU;
        java.lang.Object objD;
        if (x(i6)) {
            jU = U(i6);
            objD = d0Var.O();
        } else if (this.f21953g) {
            jU = U(i6);
            objD = d0Var.z();
        } else {
            jU = U(i6);
            objD = d0Var.D();
        }
        androidx.datastore.preferences.protobuf.p0.R(obj, jU, objD);
    }

    private void f0(java.lang.Object obj, int i6, androidx.datastore.preferences.protobuf.d0 d0Var) {
        if (x(i6)) {
            d0Var.C(this.f21960n.e(obj, U(i6)));
        } else {
            d0Var.B(this.f21960n.e(obj, U(i6)));
        }
    }

    private static java.lang.reflect.Field g0(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new java.lang.RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + java.util.Arrays.toString(declaredFields));
        }
    }

    private void h0(java.lang.Object obj, int i6) {
        int iB0 = b0(i6);
        long j6 = 1048575 & iB0;
        if (j6 == 1048575) {
            return;
        }
        androidx.datastore.preferences.protobuf.p0.P(obj, j6, (1 << (iB0 >>> 20)) | androidx.datastore.preferences.protobuf.p0.z(obj, j6));
    }

    private void i0(java.lang.Object obj, int i6, int i10) {
        androidx.datastore.preferences.protobuf.p0.P(obj, b0(i10) & 1048575, i6);
    }

    private boolean j(java.lang.Object obj, java.lang.Object obj2, int i6) {
        return y(obj, i6) == y(obj2, i6);
    }

    private int j0(int i6, int i10) {
        int length = (this.f21947a.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int iT = T(i12);
            if (i6 == iT) {
                return i12;
            }
            if (i6 < iT) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    private static boolean k(java.lang.Object obj, long j6) {
        return androidx.datastore.preferences.protobuf.p0.r(obj, j6);
    }

    private void k0(java.lang.Object obj, int i6, java.lang.Object obj2) {
        f21946s.putObject(obj, U(n0(i6)), obj2);
        h0(obj, i6);
    }

    private static void l(java.lang.Object obj) {
        if (D(obj)) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private void l0(java.lang.Object obj, int i6, int i10, java.lang.Object obj2) {
        f21946s.putObject(obj, U(n0(i10)), obj2);
        i0(obj, i6, i10);
    }

    private static double m(java.lang.Object obj, long j6) {
        return androidx.datastore.preferences.protobuf.p0.x(obj, j6);
    }

    private static int m0(int i6) {
        return (i6 & 267386880) >>> 20;
    }

    private boolean n(java.lang.Object obj, java.lang.Object obj2, int i6) {
        int iN0 = n0(i6);
        long jU = U(iN0);
        switch (m0(iN0)) {
            case 0:
                return j(obj, obj2, i6) && java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.p0.x(obj, jU)) == java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.p0.x(obj2, jU));
            case 1:
                return j(obj, obj2, i6) && java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.p0.y(obj, jU)) == java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.p0.y(obj2, jU));
            case 2:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.p0.A(obj, jU) == androidx.datastore.preferences.protobuf.p0.A(obj2, jU);
            case 3:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.p0.A(obj, jU) == androidx.datastore.preferences.protobuf.p0.A(obj2, jU);
            case 4:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.p0.z(obj, jU) == androidx.datastore.preferences.protobuf.p0.z(obj2, jU);
            case 5:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.p0.A(obj, jU) == androidx.datastore.preferences.protobuf.p0.A(obj2, jU);
            case 6:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.p0.z(obj, jU) == androidx.datastore.preferences.protobuf.p0.z(obj2, jU);
            case 7:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.p0.r(obj, jU) == androidx.datastore.preferences.protobuf.p0.r(obj2, jU);
            case 8:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.g0.J(androidx.datastore.preferences.protobuf.p0.C(obj, jU), androidx.datastore.preferences.protobuf.p0.C(obj2, jU));
            case 9:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.g0.J(androidx.datastore.preferences.protobuf.p0.C(obj, jU), androidx.datastore.preferences.protobuf.p0.C(obj2, jU));
            case 10:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.g0.J(androidx.datastore.preferences.protobuf.p0.C(obj, jU), androidx.datastore.preferences.protobuf.p0.C(obj2, jU));
            case 11:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.p0.z(obj, jU) == androidx.datastore.preferences.protobuf.p0.z(obj2, jU);
            case 12:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.p0.z(obj, jU) == androidx.datastore.preferences.protobuf.p0.z(obj2, jU);
            case 13:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.p0.z(obj, jU) == androidx.datastore.preferences.protobuf.p0.z(obj2, jU);
            case 14:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.p0.A(obj, jU) == androidx.datastore.preferences.protobuf.p0.A(obj2, jU);
            case 15:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.p0.z(obj, jU) == androidx.datastore.preferences.protobuf.p0.z(obj2, jU);
            case 16:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.p0.A(obj, jU) == androidx.datastore.preferences.protobuf.p0.A(obj2, jU);
            case 17:
                return j(obj, obj2, i6) && androidx.datastore.preferences.protobuf.g0.J(androidx.datastore.preferences.protobuf.p0.C(obj, jU), androidx.datastore.preferences.protobuf.p0.C(obj2, jU));
            case 18:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                return androidx.datastore.preferences.protobuf.g0.J(androidx.datastore.preferences.protobuf.p0.C(obj, jU), androidx.datastore.preferences.protobuf.p0.C(obj2, jU));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return E(obj, obj2, i6) && androidx.datastore.preferences.protobuf.g0.J(androidx.datastore.preferences.protobuf.p0.C(obj, jU), androidx.datastore.preferences.protobuf.p0.C(obj2, jU));
            default:
                return true;
        }
    }

    private int n0(int i6) {
        return this.f21947a[i6 + 1];
    }

    private java.lang.Object o(java.lang.Object obj, int i6, java.lang.Object obj2, androidx.datastore.preferences.protobuf.l0 l0Var, java.lang.Object obj3) {
        T(i6);
        if (androidx.datastore.preferences.protobuf.p0.C(obj, U(n0(i6))) == null) {
            return obj2;
        }
        q(i6);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void o0(java.lang.Object obj, androidx.datastore.preferences.protobuf.s0 s0Var) {
        java.util.Iterator itN;
        java.util.Map.Entry entry;
        int i6;
        if (this.f21952f) {
            androidx.datastore.preferences.protobuf.C2058s c2058sC = this.f21962p.c(obj);
            if (c2058sC.j()) {
                itN = null;
                entry = null;
            } else {
                itN = c2058sC.n();
                entry = (java.util.Map.Entry) itN.next();
            }
        } else {
            itN = null;
            entry = null;
        }
        int length = this.f21947a.length;
        sun.misc.Unsafe unsafe = f21946s;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int iN0 = n0(i12);
            int iT = T(i12);
            int iM0 = m0(iN0);
            if (iM0 <= 17) {
                int i14 = this.f21947a[i12 + 2];
                int i15 = i14 & i10;
                if (i15 != i11) {
                    i13 = unsafe.getInt(obj, i15);
                    i11 = i15;
                }
                i6 = 1 << (i14 >>> 20);
            } else {
                i6 = 0;
            }
            while (entry != null && this.f21962p.a(entry) <= iT) {
                this.f21962p.j(s0Var, entry);
                entry = itN.hasNext() ? (java.util.Map.Entry) itN.next() : null;
            }
            long jU = U(iN0);
            switch (iM0) {
                case 0:
                    if ((i6 & i13) != 0) {
                        s0Var.e(iT, m(obj, jU));
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 1:
                    if ((i6 & i13) != 0) {
                        s0Var.E(iT, p(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 2:
                    if ((i6 & i13) != 0) {
                        s0Var.p(iT, unsafe.getLong(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 3:
                    if ((i6 & i13) != 0) {
                        s0Var.n(iT, unsafe.getLong(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 4:
                    if ((i6 & i13) != 0) {
                        s0Var.t(iT, unsafe.getInt(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 5:
                    if ((i6 & i13) != 0) {
                        s0Var.h(iT, unsafe.getLong(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 6:
                    if ((i6 & i13) != 0) {
                        s0Var.d(iT, unsafe.getInt(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 7:
                    if ((i6 & i13) != 0) {
                        s0Var.q(iT, k(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 8:
                    if ((i6 & i13) != 0) {
                        s0(iT, unsafe.getObject(obj, jU), s0Var);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 9:
                    if ((i6 & i13) != 0) {
                        s0Var.z(iT, unsafe.getObject(obj, jU), s(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 10:
                    if ((i6 & i13) != 0) {
                        s0Var.w(iT, (androidx.datastore.preferences.protobuf.AbstractC2047g) unsafe.getObject(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 11:
                    if ((i6 & i13) != 0) {
                        s0Var.b(iT, unsafe.getInt(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 12:
                    if ((i6 & i13) != 0) {
                        s0Var.H(iT, unsafe.getInt(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 13:
                    if ((i6 & i13) != 0) {
                        s0Var.r(iT, unsafe.getInt(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 14:
                    if ((i6 & i13) != 0) {
                        s0Var.x(iT, unsafe.getLong(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 15:
                    if ((i6 & i13) != 0) {
                        s0Var.M(iT, unsafe.getInt(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 16:
                    if ((i6 & i13) != 0) {
                        s0Var.D(iT, unsafe.getLong(obj, jU));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 17:
                    if ((i6 & i13) != 0) {
                        s0Var.O(iT, unsafe.getObject(obj, jU), s(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 18:
                    androidx.datastore.preferences.protobuf.g0.O(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 19:
                    androidx.datastore.preferences.protobuf.g0.S(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 20:
                    androidx.datastore.preferences.protobuf.g0.V(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    androidx.datastore.preferences.protobuf.g0.d0(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 22:
                    androidx.datastore.preferences.protobuf.g0.U(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 23:
                    androidx.datastore.preferences.protobuf.g0.R(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 24:
                    androidx.datastore.preferences.protobuf.g0.Q(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 25:
                    androidx.datastore.preferences.protobuf.g0.M(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 26:
                    androidx.datastore.preferences.protobuf.g0.b0(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var);
                    break;
                case 27:
                    androidx.datastore.preferences.protobuf.g0.W(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, s(i12));
                    break;
                case 28:
                    androidx.datastore.preferences.protobuf.g0.N(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var);
                    break;
                case 29:
                    androidx.datastore.preferences.protobuf.g0.c0(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 30:
                    androidx.datastore.preferences.protobuf.g0.P(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 31:
                    androidx.datastore.preferences.protobuf.g0.X(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 32:
                    androidx.datastore.preferences.protobuf.g0.Y(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                    androidx.datastore.preferences.protobuf.g0.Z(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 34:
                    androidx.datastore.preferences.protobuf.g0.a0(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 35:
                    androidx.datastore.preferences.protobuf.g0.O(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 36:
                    androidx.datastore.preferences.protobuf.g0.S(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 37:
                    androidx.datastore.preferences.protobuf.g0.V(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 38:
                    androidx.datastore.preferences.protobuf.g0.d0(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 39:
                    androidx.datastore.preferences.protobuf.g0.U(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 40:
                    androidx.datastore.preferences.protobuf.g0.R(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 41:
                    androidx.datastore.preferences.protobuf.g0.Q(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 42:
                    androidx.datastore.preferences.protobuf.g0.M(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 43:
                    androidx.datastore.preferences.protobuf.g0.c0(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 44:
                    androidx.datastore.preferences.protobuf.g0.P(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 45:
                    androidx.datastore.preferences.protobuf.g0.X(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 46:
                    androidx.datastore.preferences.protobuf.g0.Y(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 47:
                    androidx.datastore.preferences.protobuf.g0.Z(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 48:
                    androidx.datastore.preferences.protobuf.g0.a0(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, true);
                    break;
                case 49:
                    androidx.datastore.preferences.protobuf.g0.T(T(i12), (java.util.List) unsafe.getObject(obj, jU), s0Var, s(i12));
                    break;
                case 50:
                    r0(s0Var, iT, unsafe.getObject(obj, jU), i12);
                    break;
                case 51:
                    if (F(obj, iT, i12)) {
                        s0Var.e(iT, W(obj, jU));
                    }
                    break;
                case 52:
                    if (F(obj, iT, i12)) {
                        s0Var.E(iT, X(obj, jU));
                    }
                    break;
                case 53:
                    if (F(obj, iT, i12)) {
                        s0Var.p(iT, Z(obj, jU));
                    }
                    break;
                case 54:
                    if (F(obj, iT, i12)) {
                        s0Var.n(iT, Z(obj, jU));
                    }
                    break;
                case 55:
                    if (F(obj, iT, i12)) {
                        s0Var.t(iT, Y(obj, jU));
                    }
                    break;
                case 56:
                    if (F(obj, iT, i12)) {
                        s0Var.h(iT, Z(obj, jU));
                    }
                    break;
                case 57:
                    if (F(obj, iT, i12)) {
                        s0Var.d(iT, Y(obj, jU));
                    }
                    break;
                case 58:
                    if (F(obj, iT, i12)) {
                        s0Var.q(iT, V(obj, jU));
                    }
                    break;
                case 59:
                    if (F(obj, iT, i12)) {
                        s0(iT, unsafe.getObject(obj, jU), s0Var);
                    }
                    break;
                case 60:
                    if (F(obj, iT, i12)) {
                        s0Var.z(iT, unsafe.getObject(obj, jU), s(i12));
                    }
                    break;
                case 61:
                    if (F(obj, iT, i12)) {
                        s0Var.w(iT, (androidx.datastore.preferences.protobuf.AbstractC2047g) unsafe.getObject(obj, jU));
                    }
                    break;
                case 62:
                    if (F(obj, iT, i12)) {
                        s0Var.b(iT, Y(obj, jU));
                    }
                    break;
                case 63:
                    if (F(obj, iT, i12)) {
                        s0Var.H(iT, Y(obj, jU));
                    }
                    break;
                case 64:
                    if (F(obj, iT, i12)) {
                        s0Var.r(iT, Y(obj, jU));
                    }
                    break;
                case 65:
                    if (F(obj, iT, i12)) {
                        s0Var.x(iT, Z(obj, jU));
                    }
                    break;
                case 66:
                    if (F(obj, iT, i12)) {
                        s0Var.M(iT, Y(obj, jU));
                    }
                    break;
                case 67:
                    if (F(obj, iT, i12)) {
                        s0Var.D(iT, Z(obj, jU));
                    }
                    break;
                case 68:
                    if (F(obj, iT, i12)) {
                        s0Var.O(iT, unsafe.getObject(obj, jU), s(i12));
                    }
                    break;
            }
            i12 += 3;
            i10 = 1048575;
        }
        while (entry != null) {
            this.f21962p.j(s0Var, entry);
            entry = itN.hasNext() ? (java.util.Map.Entry) itN.next() : null;
        }
        t0(this.f21961o, obj, s0Var);
    }

    private static float p(java.lang.Object obj, long j6) {
        return androidx.datastore.preferences.protobuf.p0.y(obj, j6);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    private void p0(java.lang.Object obj, androidx.datastore.preferences.protobuf.s0 s0Var) {
        java.util.Iterator itN;
        java.util.Map.Entry entry;
        double dM;
        float fP;
        long jI;
        long jI2;
        int iW;
        long jI3;
        int iW2;
        boolean zK;
        int iW3;
        int iW4;
        int iW5;
        long jI4;
        int iW6;
        long jI5;
        if (this.f21952f) {
            androidx.datastore.preferences.protobuf.C2058s c2058sC = this.f21962p.c(obj);
            if (c2058sC.j()) {
                itN = null;
                entry = null;
            } else {
                itN = c2058sC.n();
                entry = (java.util.Map.Entry) itN.next();
            }
        } else {
            itN = null;
            entry = null;
        }
        int length = this.f21947a.length;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int iN0 = n0(i6);
            int iT = T(i6);
            while (entry != null && this.f21962p.a(entry) <= iT) {
                this.f21962p.j(s0Var, entry);
                entry = itN.hasNext() ? (java.util.Map.Entry) itN.next() : null;
            }
            switch (m0(iN0)) {
                case 0:
                    if (y(obj, i6)) {
                        dM = m(obj, U(iN0));
                        s0Var.e(iT, dM);
                    }
                    break;
                case 1:
                    if (y(obj, i6)) {
                        fP = p(obj, U(iN0));
                        s0Var.E(iT, fP);
                    }
                    break;
                case 2:
                    if (y(obj, i6)) {
                        jI = I(obj, U(iN0));
                        s0Var.p(iT, jI);
                    }
                    break;
                case 3:
                    if (y(obj, i6)) {
                        jI2 = I(obj, U(iN0));
                        s0Var.n(iT, jI2);
                    }
                    break;
                case 4:
                    if (y(obj, i6)) {
                        iW = w(obj, U(iN0));
                        s0Var.t(iT, iW);
                    }
                    break;
                case 5:
                    if (y(obj, i6)) {
                        jI3 = I(obj, U(iN0));
                        s0Var.h(iT, jI3);
                    }
                    break;
                case 6:
                    if (y(obj, i6)) {
                        iW2 = w(obj, U(iN0));
                        s0Var.d(iT, iW2);
                    }
                    break;
                case 7:
                    if (y(obj, i6)) {
                        zK = k(obj, U(iN0));
                        s0Var.q(iT, zK);
                    }
                    break;
                case 8:
                    if (y(obj, i6)) {
                        s0(iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var);
                    }
                    break;
                case 9:
                    if (y(obj, i6)) {
                        s0Var.z(iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s(i6));
                    }
                    break;
                case 10:
                    if (y(obj, i6)) {
                        s0Var.w(iT, (androidx.datastore.preferences.protobuf.AbstractC2047g) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)));
                    }
                    break;
                case 11:
                    if (y(obj, i6)) {
                        iW3 = w(obj, U(iN0));
                        s0Var.b(iT, iW3);
                    }
                    break;
                case 12:
                    if (y(obj, i6)) {
                        iW4 = w(obj, U(iN0));
                        s0Var.H(iT, iW4);
                    }
                    break;
                case 13:
                    if (y(obj, i6)) {
                        iW5 = w(obj, U(iN0));
                        s0Var.r(iT, iW5);
                    }
                    break;
                case 14:
                    if (y(obj, i6)) {
                        jI4 = I(obj, U(iN0));
                        s0Var.x(iT, jI4);
                    }
                    break;
                case 15:
                    if (y(obj, i6)) {
                        iW6 = w(obj, U(iN0));
                        s0Var.M(iT, iW6);
                    }
                    break;
                case 16:
                    if (y(obj, i6)) {
                        jI5 = I(obj, U(iN0));
                        s0Var.D(iT, jI5);
                    }
                    break;
                case 17:
                    if (y(obj, i6)) {
                        s0Var.O(iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s(i6));
                    }
                    break;
                case 18:
                    androidx.datastore.preferences.protobuf.g0.O(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 19:
                    androidx.datastore.preferences.protobuf.g0.S(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 20:
                    androidx.datastore.preferences.protobuf.g0.V(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    androidx.datastore.preferences.protobuf.g0.d0(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 22:
                    androidx.datastore.preferences.protobuf.g0.U(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 23:
                    androidx.datastore.preferences.protobuf.g0.R(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 24:
                    androidx.datastore.preferences.protobuf.g0.Q(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 25:
                    androidx.datastore.preferences.protobuf.g0.M(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 26:
                    androidx.datastore.preferences.protobuf.g0.b0(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var);
                    break;
                case 27:
                    androidx.datastore.preferences.protobuf.g0.W(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, s(i6));
                    break;
                case 28:
                    androidx.datastore.preferences.protobuf.g0.N(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var);
                    break;
                case 29:
                    androidx.datastore.preferences.protobuf.g0.c0(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 30:
                    androidx.datastore.preferences.protobuf.g0.P(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 31:
                    androidx.datastore.preferences.protobuf.g0.X(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 32:
                    androidx.datastore.preferences.protobuf.g0.Y(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                    androidx.datastore.preferences.protobuf.g0.Z(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 34:
                    androidx.datastore.preferences.protobuf.g0.a0(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 35:
                    androidx.datastore.preferences.protobuf.g0.O(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 36:
                    androidx.datastore.preferences.protobuf.g0.S(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 37:
                    androidx.datastore.preferences.protobuf.g0.V(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 38:
                    androidx.datastore.preferences.protobuf.g0.d0(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 39:
                    androidx.datastore.preferences.protobuf.g0.U(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 40:
                    androidx.datastore.preferences.protobuf.g0.R(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 41:
                    androidx.datastore.preferences.protobuf.g0.Q(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 42:
                    androidx.datastore.preferences.protobuf.g0.M(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 43:
                    androidx.datastore.preferences.protobuf.g0.c0(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 44:
                    androidx.datastore.preferences.protobuf.g0.P(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 45:
                    androidx.datastore.preferences.protobuf.g0.X(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 46:
                    androidx.datastore.preferences.protobuf.g0.Y(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 47:
                    androidx.datastore.preferences.protobuf.g0.Z(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 48:
                    androidx.datastore.preferences.protobuf.g0.a0(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 49:
                    androidx.datastore.preferences.protobuf.g0.T(T(i6), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, s(i6));
                    break;
                case 50:
                    r0(s0Var, iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), i6);
                    break;
                case 51:
                    if (F(obj, iT, i6)) {
                        dM = W(obj, U(iN0));
                        s0Var.e(iT, dM);
                    }
                    break;
                case 52:
                    if (F(obj, iT, i6)) {
                        fP = X(obj, U(iN0));
                        s0Var.E(iT, fP);
                    }
                    break;
                case 53:
                    if (F(obj, iT, i6)) {
                        jI = Z(obj, U(iN0));
                        s0Var.p(iT, jI);
                    }
                    break;
                case 54:
                    if (F(obj, iT, i6)) {
                        jI2 = Z(obj, U(iN0));
                        s0Var.n(iT, jI2);
                    }
                    break;
                case 55:
                    if (F(obj, iT, i6)) {
                        iW = Y(obj, U(iN0));
                        s0Var.t(iT, iW);
                    }
                    break;
                case 56:
                    if (F(obj, iT, i6)) {
                        jI3 = Z(obj, U(iN0));
                        s0Var.h(iT, jI3);
                    }
                    break;
                case 57:
                    if (F(obj, iT, i6)) {
                        iW2 = Y(obj, U(iN0));
                        s0Var.d(iT, iW2);
                    }
                    break;
                case 58:
                    if (F(obj, iT, i6)) {
                        zK = V(obj, U(iN0));
                        s0Var.q(iT, zK);
                    }
                    break;
                case 59:
                    if (F(obj, iT, i6)) {
                        s0(iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var);
                    }
                    break;
                case 60:
                    if (F(obj, iT, i6)) {
                        s0Var.z(iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s(i6));
                    }
                    break;
                case 61:
                    if (F(obj, iT, i6)) {
                        s0Var.w(iT, (androidx.datastore.preferences.protobuf.AbstractC2047g) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)));
                    }
                    break;
                case 62:
                    if (F(obj, iT, i6)) {
                        iW3 = Y(obj, U(iN0));
                        s0Var.b(iT, iW3);
                    }
                    break;
                case 63:
                    if (F(obj, iT, i6)) {
                        iW4 = Y(obj, U(iN0));
                        s0Var.H(iT, iW4);
                    }
                    break;
                case 64:
                    if (F(obj, iT, i6)) {
                        iW5 = Y(obj, U(iN0));
                        s0Var.r(iT, iW5);
                    }
                    break;
                case 65:
                    if (F(obj, iT, i6)) {
                        jI4 = Z(obj, U(iN0));
                        s0Var.x(iT, jI4);
                    }
                    break;
                case 66:
                    if (F(obj, iT, i6)) {
                        iW6 = Y(obj, U(iN0));
                        s0Var.M(iT, iW6);
                    }
                    break;
                case 67:
                    if (F(obj, iT, i6)) {
                        jI5 = Z(obj, U(iN0));
                        s0Var.D(iT, jI5);
                    }
                    break;
                case 68:
                    if (F(obj, iT, i6)) {
                        s0Var.O(iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s(i6));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f21962p.j(s0Var, entry);
            entry = itN.hasNext() ? (java.util.Map.Entry) itN.next() : null;
        }
        t0(this.f21961o, obj, s0Var);
    }

    private androidx.datastore.preferences.protobuf.AbstractC2064y.a q(int i6) {
        androidx.appcompat.app.D.a(this.f21948b[((i6 / 3) * 2) + 1]);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void q0(java.lang.Object obj, androidx.datastore.preferences.protobuf.s0 s0Var) {
        java.util.Iterator itE;
        java.util.Map.Entry entry;
        double dM;
        float fP;
        long jI;
        long jI2;
        int iW;
        long jI3;
        int iW2;
        boolean zK;
        int iW3;
        int iW4;
        int iW5;
        long jI4;
        int iW6;
        long jI5;
        t0(this.f21961o, obj, s0Var);
        if (this.f21952f) {
            androidx.datastore.preferences.protobuf.C2058s c2058sC = this.f21962p.c(obj);
            if (c2058sC.j()) {
                itE = null;
                entry = null;
            } else {
                itE = c2058sC.e();
                entry = (java.util.Map.Entry) itE.next();
            }
        } else {
            itE = null;
            entry = null;
        }
        for (int length = this.f21947a.length - 3; length >= 0; length -= 3) {
            int iN0 = n0(length);
            int iT = T(length);
            while (entry != null && this.f21962p.a(entry) > iT) {
                this.f21962p.j(s0Var, entry);
                entry = itE.hasNext() ? (java.util.Map.Entry) itE.next() : null;
            }
            switch (m0(iN0)) {
                case 0:
                    if (y(obj, length)) {
                        dM = m(obj, U(iN0));
                        s0Var.e(iT, dM);
                    }
                    break;
                case 1:
                    if (y(obj, length)) {
                        fP = p(obj, U(iN0));
                        s0Var.E(iT, fP);
                    }
                    break;
                case 2:
                    if (y(obj, length)) {
                        jI = I(obj, U(iN0));
                        s0Var.p(iT, jI);
                    }
                    break;
                case 3:
                    if (y(obj, length)) {
                        jI2 = I(obj, U(iN0));
                        s0Var.n(iT, jI2);
                    }
                    break;
                case 4:
                    if (y(obj, length)) {
                        iW = w(obj, U(iN0));
                        s0Var.t(iT, iW);
                    }
                    break;
                case 5:
                    if (y(obj, length)) {
                        jI3 = I(obj, U(iN0));
                        s0Var.h(iT, jI3);
                    }
                    break;
                case 6:
                    if (y(obj, length)) {
                        iW2 = w(obj, U(iN0));
                        s0Var.d(iT, iW2);
                    }
                    break;
                case 7:
                    if (y(obj, length)) {
                        zK = k(obj, U(iN0));
                        s0Var.q(iT, zK);
                    }
                    break;
                case 8:
                    if (y(obj, length)) {
                        s0(iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var);
                    }
                    break;
                case 9:
                    if (y(obj, length)) {
                        s0Var.z(iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s(length));
                    }
                    break;
                case 10:
                    if (y(obj, length)) {
                        s0Var.w(iT, (androidx.datastore.preferences.protobuf.AbstractC2047g) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)));
                    }
                    break;
                case 11:
                    if (y(obj, length)) {
                        iW3 = w(obj, U(iN0));
                        s0Var.b(iT, iW3);
                    }
                    break;
                case 12:
                    if (y(obj, length)) {
                        iW4 = w(obj, U(iN0));
                        s0Var.H(iT, iW4);
                    }
                    break;
                case 13:
                    if (y(obj, length)) {
                        iW5 = w(obj, U(iN0));
                        s0Var.r(iT, iW5);
                    }
                    break;
                case 14:
                    if (y(obj, length)) {
                        jI4 = I(obj, U(iN0));
                        s0Var.x(iT, jI4);
                    }
                    break;
                case 15:
                    if (y(obj, length)) {
                        iW6 = w(obj, U(iN0));
                        s0Var.M(iT, iW6);
                    }
                    break;
                case 16:
                    if (y(obj, length)) {
                        jI5 = I(obj, U(iN0));
                        s0Var.D(iT, jI5);
                    }
                    break;
                case 17:
                    if (y(obj, length)) {
                        s0Var.O(iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s(length));
                    }
                    break;
                case 18:
                    androidx.datastore.preferences.protobuf.g0.O(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 19:
                    androidx.datastore.preferences.protobuf.g0.S(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 20:
                    androidx.datastore.preferences.protobuf.g0.V(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    androidx.datastore.preferences.protobuf.g0.d0(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 22:
                    androidx.datastore.preferences.protobuf.g0.U(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 23:
                    androidx.datastore.preferences.protobuf.g0.R(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 24:
                    androidx.datastore.preferences.protobuf.g0.Q(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 25:
                    androidx.datastore.preferences.protobuf.g0.M(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 26:
                    androidx.datastore.preferences.protobuf.g0.b0(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var);
                    break;
                case 27:
                    androidx.datastore.preferences.protobuf.g0.W(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, s(length));
                    break;
                case 28:
                    androidx.datastore.preferences.protobuf.g0.N(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var);
                    break;
                case 29:
                    androidx.datastore.preferences.protobuf.g0.c0(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 30:
                    androidx.datastore.preferences.protobuf.g0.P(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 31:
                    androidx.datastore.preferences.protobuf.g0.X(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 32:
                    androidx.datastore.preferences.protobuf.g0.Y(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                    androidx.datastore.preferences.protobuf.g0.Z(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 34:
                    androidx.datastore.preferences.protobuf.g0.a0(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, false);
                    break;
                case 35:
                    androidx.datastore.preferences.protobuf.g0.O(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 36:
                    androidx.datastore.preferences.protobuf.g0.S(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 37:
                    androidx.datastore.preferences.protobuf.g0.V(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 38:
                    androidx.datastore.preferences.protobuf.g0.d0(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 39:
                    androidx.datastore.preferences.protobuf.g0.U(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 40:
                    androidx.datastore.preferences.protobuf.g0.R(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 41:
                    androidx.datastore.preferences.protobuf.g0.Q(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 42:
                    androidx.datastore.preferences.protobuf.g0.M(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 43:
                    androidx.datastore.preferences.protobuf.g0.c0(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 44:
                    androidx.datastore.preferences.protobuf.g0.P(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 45:
                    androidx.datastore.preferences.protobuf.g0.X(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 46:
                    androidx.datastore.preferences.protobuf.g0.Y(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 47:
                    androidx.datastore.preferences.protobuf.g0.Z(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 48:
                    androidx.datastore.preferences.protobuf.g0.a0(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, true);
                    break;
                case 49:
                    androidx.datastore.preferences.protobuf.g0.T(T(length), (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var, s(length));
                    break;
                case 50:
                    r0(s0Var, iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), length);
                    break;
                case 51:
                    if (F(obj, iT, length)) {
                        dM = W(obj, U(iN0));
                        s0Var.e(iT, dM);
                    }
                    break;
                case 52:
                    if (F(obj, iT, length)) {
                        fP = X(obj, U(iN0));
                        s0Var.E(iT, fP);
                    }
                    break;
                case 53:
                    if (F(obj, iT, length)) {
                        jI = Z(obj, U(iN0));
                        s0Var.p(iT, jI);
                    }
                    break;
                case 54:
                    if (F(obj, iT, length)) {
                        jI2 = Z(obj, U(iN0));
                        s0Var.n(iT, jI2);
                    }
                    break;
                case 55:
                    if (F(obj, iT, length)) {
                        iW = Y(obj, U(iN0));
                        s0Var.t(iT, iW);
                    }
                    break;
                case 56:
                    if (F(obj, iT, length)) {
                        jI3 = Z(obj, U(iN0));
                        s0Var.h(iT, jI3);
                    }
                    break;
                case 57:
                    if (F(obj, iT, length)) {
                        iW2 = Y(obj, U(iN0));
                        s0Var.d(iT, iW2);
                    }
                    break;
                case 58:
                    if (F(obj, iT, length)) {
                        zK = V(obj, U(iN0));
                        s0Var.q(iT, zK);
                    }
                    break;
                case 59:
                    if (F(obj, iT, length)) {
                        s0(iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s0Var);
                    }
                    break;
                case 60:
                    if (F(obj, iT, length)) {
                        s0Var.z(iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s(length));
                    }
                    break;
                case 61:
                    if (F(obj, iT, length)) {
                        s0Var.w(iT, (androidx.datastore.preferences.protobuf.AbstractC2047g) androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)));
                    }
                    break;
                case 62:
                    if (F(obj, iT, length)) {
                        iW3 = Y(obj, U(iN0));
                        s0Var.b(iT, iW3);
                    }
                    break;
                case 63:
                    if (F(obj, iT, length)) {
                        iW4 = Y(obj, U(iN0));
                        s0Var.H(iT, iW4);
                    }
                    break;
                case 64:
                    if (F(obj, iT, length)) {
                        iW5 = Y(obj, U(iN0));
                        s0Var.r(iT, iW5);
                    }
                    break;
                case 65:
                    if (F(obj, iT, length)) {
                        jI4 = Z(obj, U(iN0));
                        s0Var.x(iT, jI4);
                    }
                    break;
                case 66:
                    if (F(obj, iT, length)) {
                        iW6 = Y(obj, U(iN0));
                        s0Var.M(iT, iW6);
                    }
                    break;
                case 67:
                    if (F(obj, iT, length)) {
                        jI5 = Z(obj, U(iN0));
                        s0Var.D(iT, jI5);
                    }
                    break;
                case 68:
                    if (F(obj, iT, length)) {
                        s0Var.O(iT, androidx.datastore.preferences.protobuf.p0.C(obj, U(iN0)), s(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f21962p.j(s0Var, entry);
            entry = itE.hasNext() ? (java.util.Map.Entry) itE.next() : null;
        }
    }

    private java.lang.Object r(int i6) {
        return this.f21948b[(i6 / 3) * 2];
    }

    private void r0(androidx.datastore.preferences.protobuf.s0 s0Var, int i6, java.lang.Object obj, int i10) {
        if (obj != null) {
            s0Var.L(i6, this.f21963q.c(r(i10)), this.f21963q.h(obj));
        }
    }

    private androidx.datastore.preferences.protobuf.e0 s(int i6) {
        int i10 = (i6 / 3) * 2;
        androidx.datastore.preferences.protobuf.e0 e0Var = (androidx.datastore.preferences.protobuf.e0) this.f21948b[i10];
        if (e0Var != null) {
            return e0Var;
        }
        androidx.datastore.preferences.protobuf.e0 e0VarC = androidx.datastore.preferences.protobuf.a0.a().c((java.lang.Class) this.f21948b[i10 + 1]);
        this.f21948b[i10] = e0VarC;
        return e0VarC;
    }

    private void s0(int i6, java.lang.Object obj, androidx.datastore.preferences.protobuf.s0 s0Var) {
        if (obj instanceof java.lang.String) {
            s0Var.m(i6, (java.lang.String) obj);
        } else {
            s0Var.w(i6, (androidx.datastore.preferences.protobuf.AbstractC2047g) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[PHI: r6
  0x0077: PHI (r6v4 int) = 
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v8 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v9 int)
  (r6v1 int)
 binds: [B:20:0x005e, B:211:0x03c1, B:208:0x03bb, B:202:0x039f, B:199:0x0399, B:196:0x0393, B:193:0x0389, B:190:0x037f, B:187:0x0379, B:184:0x0373, B:181:0x0369, B:178:0x035f, B:175:0x0359, B:155:0x029b, B:150:0x0289, B:145:0x0277, B:140:0x0265, B:135:0x0253, B:130:0x0241, B:125:0x022f, B:120:0x021e, B:115:0x020d, B:110:0x01fc, B:105:0x01eb, B:100:0x01da, B:95:0x01c9, B:89:0x01a9, B:84:0x0175, B:81:0x0169, B:78:0x0159, B:75:0x0149, B:72:0x0139, B:69:0x012d, B:66:0x0121, B:63:0x0114, B:57:0x00f6, B:54:0x00e3, B:51:0x00d2, B:47:0x00c3, B:43:0x00b4, B:41:0x00ae, B:39:0x00a7, B:36:0x009c, B:32:0x008d, B:28:0x007e, B:25:0x0076, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x01af A[PHI: r3
  0x01af: PHI (r3v121 int) = 
  (r3v83 int)
  (r3v86 int)
  (r3v89 int)
  (r3v92 int)
  (r3v95 int)
  (r3v98 int)
  (r3v101 int)
  (r3v104 int)
  (r3v107 int)
  (r3v110 int)
  (r3v113 int)
  (r3v116 int)
  (r3v119 int)
  (r3v124 int)
 binds: [B:157:0x029f, B:152:0x028d, B:147:0x027b, B:142:0x0269, B:137:0x0257, B:132:0x0245, B:127:0x0233, B:122:0x0222, B:117:0x0211, B:112:0x0200, B:107:0x01ef, B:102:0x01de, B:97:0x01cd, B:91:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0359, code lost:
    
        if ((r8 & r15) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0373, code lost:
    
        if ((r8 & r15) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0379, code lost:
    
        if ((r8 & r15) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0393, code lost:
    
        if ((r8 & r15) != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0399, code lost:
    
        if ((r8 & r15) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03bb, code lost:
    
        if ((r8 & r15) != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (F(r17, r10, r5) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC2050j.r(r10, (androidx.datastore.preferences.protobuf.O) r2.getObject(r17, r13), s(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (F(r17, r10, r5) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC2050j.G(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        if (F(r17, r10, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        r4 = androidx.datastore.preferences.protobuf.AbstractC2050j.E(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d2, code lost:
    
        if (F(r17, r10, r5) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC2050j.f(r10, (androidx.datastore.preferences.protobuf.AbstractC2047g) r2.getObject(r17, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
    
        if (F(r17, r10, r5) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.g0.o(r10, r2.getObject(r17, r13), s(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0114, code lost:
    
        if (F(r17, r10, r5) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0116, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC2050j.c(r10, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int t(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.t(java.lang.Object):int");
    }

    private void t0(androidx.datastore.preferences.protobuf.l0 l0Var, java.lang.Object obj, androidx.datastore.preferences.protobuf.s0 s0Var) {
        l0Var.t(l0Var.g(obj), s0Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5 A[PHI: r6
  0x00b5: PHI (r6v97 java.lang.Object) = (r6v19 java.lang.Object), (r6v93 java.lang.Object), (r6v100 java.lang.Object) binds: [B:196:0x0360, B:50:0x00db, B:42:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de A[PHI: r6
  0x00de: PHI (r6v89 java.lang.Object) = (r6v19 java.lang.Object), (r6v93 java.lang.Object) binds: [B:196:0x0360, B:50:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:76:0x0140  */
    /* JADX WARN: Code duplicated, block: B:79:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0182 A[PHI: r7
  0x0182: PHI (r7v43 int) = 
  (r7v5 int)
  (r7v8 int)
  (r7v11 int)
  (r7v14 int)
  (r7v17 int)
  (r7v20 int)
  (r7v23 int)
  (r7v26 int)
  (r7v29 int)
  (r7v32 int)
  (r7v35 int)
  (r7v38 int)
  (r7v41 int)
  (r7v46 int)
 binds: [B:151:0x0272, B:146:0x0260, B:141:0x024e, B:136:0x023c, B:131:0x022a, B:126:0x0218, B:121:0x0206, B:116:0x01f5, B:111:0x01e4, B:106:0x01d3, B:101:0x01c2, B:96:0x01b1, B:91:0x01a0, B:85:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    private int u(java.lang.Object obj) {
        long jA;
        long jA2;
        int iZ;
        java.lang.Object objC;
        int iZ2;
        int iZ3;
        int iZ4;
        long jA3;
        int iM;
        int i6;
        sun.misc.Unsafe unsafe = f21946s;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f21947a.length; i11 += 3) {
            int iN0 = n0(i11);
            int iM0 = m0(iN0);
            int iT = T(i11);
            long jU = U(iN0);
            int i12 = (iM0 < androidx.datastore.preferences.protobuf.EnumC2059t.f22199q0.e() || iM0 > androidx.datastore.preferences.protobuf.EnumC2059t.f22158D0.e()) ? 0 : this.f21947a[i11 + 2] & 1048575;
            switch (iM0) {
                case 0:
                    if (y(obj, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.h(iT, 0.0d);
                        i10 += iM;
                    }
                    break;
                case 1:
                    if (y(obj, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.p(iT, 0.0f);
                        i10 += iM;
                    }
                    break;
                case 2:
                    if (y(obj, i11)) {
                        jA = androidx.datastore.preferences.protobuf.p0.A(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.w(iT, jA);
                        i10 += iM;
                    }
                    break;
                case 3:
                    if (y(obj, i11)) {
                        jA2 = androidx.datastore.preferences.protobuf.p0.A(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.R(iT, jA2);
                        i10 += iM;
                    }
                    break;
                case 4:
                    if (y(obj, i11)) {
                        iZ = androidx.datastore.preferences.protobuf.p0.z(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.u(iT, iZ);
                        i10 += iM;
                    }
                    break;
                case 5:
                    if (y(obj, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.n(iT, 0L);
                        i10 += iM;
                    }
                    break;
                case 6:
                    if (y(obj, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.l(iT, 0);
                        i10 += iM;
                    }
                    break;
                case 7:
                    if (y(obj, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.c(iT, true);
                        i10 += iM;
                    }
                    break;
                case 8:
                    if (y(obj, i11)) {
                        objC = androidx.datastore.preferences.protobuf.p0.C(obj, jU);
                        if (objC instanceof androidx.datastore.preferences.protobuf.AbstractC2047g) {
                            iM = androidx.datastore.preferences.protobuf.AbstractC2050j.f(iT, (androidx.datastore.preferences.protobuf.AbstractC2047g) objC);
                        } else {
                            iM = androidx.datastore.preferences.protobuf.AbstractC2050j.M(iT, (java.lang.String) objC);
                        }
                        i10 += iM;
                    }
                    break;
                case 9:
                    if (y(obj, i11)) {
                        iM = androidx.datastore.preferences.protobuf.g0.o(iT, androidx.datastore.preferences.protobuf.p0.C(obj, jU), s(i11));
                        i10 += iM;
                    }
                    break;
                case 10:
                    if (y(obj, i11)) {
                        objC = androidx.datastore.preferences.protobuf.p0.C(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.f(iT, (androidx.datastore.preferences.protobuf.AbstractC2047g) objC);
                        i10 += iM;
                    }
                    break;
                case 11:
                    if (y(obj, i11)) {
                        iZ2 = androidx.datastore.preferences.protobuf.p0.z(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.P(iT, iZ2);
                        i10 += iM;
                    }
                    break;
                case 12:
                    if (y(obj, i11)) {
                        iZ3 = androidx.datastore.preferences.protobuf.p0.z(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.j(iT, iZ3);
                        i10 += iM;
                    }
                    break;
                case 13:
                    if (y(obj, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.E(iT, 0);
                        i10 += iM;
                    }
                    break;
                case 14:
                    if (y(obj, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.G(iT, 0L);
                        i10 += iM;
                    }
                    break;
                case 15:
                    if (y(obj, i11)) {
                        iZ4 = androidx.datastore.preferences.protobuf.p0.z(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.I(iT, iZ4);
                        i10 += iM;
                    }
                    break;
                case 16:
                    if (y(obj, i11)) {
                        jA3 = androidx.datastore.preferences.protobuf.p0.A(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.K(iT, jA3);
                        i10 += iM;
                    }
                    break;
                case 17:
                    if (y(obj, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.r(iT, (androidx.datastore.preferences.protobuf.O) androidx.datastore.preferences.protobuf.p0.C(obj, jU), s(i11));
                        i10 += iM;
                    }
                    break;
                case 18:
                case 23:
                case 32:
                    iM = androidx.datastore.preferences.protobuf.g0.h(iT, H(obj, jU), false);
                    i10 += iM;
                    break;
                case 19:
                case 24:
                case 31:
                    iM = androidx.datastore.preferences.protobuf.g0.f(iT, H(obj, jU), false);
                    i10 += iM;
                    break;
                case 20:
                    iM = androidx.datastore.preferences.protobuf.g0.m(iT, H(obj, jU), false);
                    i10 += iM;
                    break;
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    iM = androidx.datastore.preferences.protobuf.g0.x(iT, H(obj, jU), false);
                    i10 += iM;
                    break;
                case 22:
                    iM = androidx.datastore.preferences.protobuf.g0.k(iT, H(obj, jU), false);
                    i10 += iM;
                    break;
                case 25:
                    iM = androidx.datastore.preferences.protobuf.g0.a(iT, H(obj, jU), false);
                    i10 += iM;
                    break;
                case 26:
                    iM = androidx.datastore.preferences.protobuf.g0.u(iT, H(obj, jU));
                    i10 += iM;
                    break;
                case 27:
                    iM = androidx.datastore.preferences.protobuf.g0.p(iT, H(obj, jU), s(i11));
                    i10 += iM;
                    break;
                case 28:
                    iM = androidx.datastore.preferences.protobuf.g0.c(iT, H(obj, jU));
                    i10 += iM;
                    break;
                case 29:
                    iM = androidx.datastore.preferences.protobuf.g0.v(iT, H(obj, jU), false);
                    i10 += iM;
                    break;
                case 30:
                    iM = androidx.datastore.preferences.protobuf.g0.d(iT, H(obj, jU), false);
                    i10 += iM;
                    break;
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                    iM = androidx.datastore.preferences.protobuf.g0.q(iT, H(obj, jU), false);
                    i10 += iM;
                    break;
                case 34:
                    iM = androidx.datastore.preferences.protobuf.g0.s(iT, H(obj, jU), false);
                    i10 += iM;
                    break;
                case 35:
                    i6 = androidx.datastore.preferences.protobuf.g0.i((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 36:
                    i6 = androidx.datastore.preferences.protobuf.g0.g((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 37:
                    i6 = androidx.datastore.preferences.protobuf.g0.n((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 38:
                    i6 = androidx.datastore.preferences.protobuf.g0.y((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 39:
                    i6 = androidx.datastore.preferences.protobuf.g0.l((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 40:
                    i6 = androidx.datastore.preferences.protobuf.g0.i((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 41:
                    i6 = androidx.datastore.preferences.protobuf.g0.g((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 42:
                    i6 = androidx.datastore.preferences.protobuf.g0.b((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 43:
                    i6 = androidx.datastore.preferences.protobuf.g0.w((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 44:
                    i6 = androidx.datastore.preferences.protobuf.g0.e((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 45:
                    i6 = androidx.datastore.preferences.protobuf.g0.g((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 46:
                    i6 = androidx.datastore.preferences.protobuf.g0.i((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 47:
                    i6 = androidx.datastore.preferences.protobuf.g0.r((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 48:
                    i6 = androidx.datastore.preferences.protobuf.g0.t((java.util.List) unsafe.getObject(obj, jU));
                    if (i6 > 0) {
                        if (this.f21955i) {
                            unsafe.putInt(obj, i12, i6);
                        }
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.O(iT) + androidx.datastore.preferences.protobuf.AbstractC2050j.Q(i6) + i6;
                        i10 += iM;
                    }
                    break;
                case 49:
                    iM = androidx.datastore.preferences.protobuf.g0.j(iT, H(obj, jU), s(i11));
                    i10 += iM;
                    break;
                case 50:
                    iM = this.f21963q.f(iT, androidx.datastore.preferences.protobuf.p0.C(obj, jU), r(i11));
                    i10 += iM;
                    break;
                case 51:
                    if (F(obj, iT, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.h(iT, 0.0d);
                        i10 += iM;
                    }
                    break;
                case 52:
                    if (F(obj, iT, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.p(iT, 0.0f);
                        i10 += iM;
                    }
                    break;
                case 53:
                    if (F(obj, iT, i11)) {
                        jA = Z(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.w(iT, jA);
                        i10 += iM;
                    }
                    break;
                case 54:
                    if (F(obj, iT, i11)) {
                        jA2 = Z(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.R(iT, jA2);
                        i10 += iM;
                    }
                    break;
                case 55:
                    if (F(obj, iT, i11)) {
                        iZ = Y(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.u(iT, iZ);
                        i10 += iM;
                    }
                    break;
                case 56:
                    if (F(obj, iT, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.n(iT, 0L);
                        i10 += iM;
                    }
                    break;
                case 57:
                    if (F(obj, iT, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.l(iT, 0);
                        i10 += iM;
                    }
                    break;
                case 58:
                    if (F(obj, iT, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.c(iT, true);
                        i10 += iM;
                    }
                    break;
                case 59:
                    if (F(obj, iT, i11)) {
                        objC = androidx.datastore.preferences.protobuf.p0.C(obj, jU);
                        if (objC instanceof androidx.datastore.preferences.protobuf.AbstractC2047g) {
                            iM = androidx.datastore.preferences.protobuf.AbstractC2050j.f(iT, (androidx.datastore.preferences.protobuf.AbstractC2047g) objC);
                        } else {
                            iM = androidx.datastore.preferences.protobuf.AbstractC2050j.M(iT, (java.lang.String) objC);
                        }
                        i10 += iM;
                    }
                    break;
                case 60:
                    if (F(obj, iT, i11)) {
                        iM = androidx.datastore.preferences.protobuf.g0.o(iT, androidx.datastore.preferences.protobuf.p0.C(obj, jU), s(i11));
                        i10 += iM;
                    }
                    break;
                case 61:
                    if (F(obj, iT, i11)) {
                        objC = androidx.datastore.preferences.protobuf.p0.C(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.f(iT, (androidx.datastore.preferences.protobuf.AbstractC2047g) objC);
                        i10 += iM;
                    }
                    break;
                case 62:
                    if (F(obj, iT, i11)) {
                        iZ2 = Y(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.P(iT, iZ2);
                        i10 += iM;
                    }
                    break;
                case 63:
                    if (F(obj, iT, i11)) {
                        iZ3 = Y(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.j(iT, iZ3);
                        i10 += iM;
                    }
                    break;
                case 64:
                    if (F(obj, iT, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.E(iT, 0);
                        i10 += iM;
                    }
                    break;
                case 65:
                    if (F(obj, iT, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.G(iT, 0L);
                        i10 += iM;
                    }
                    break;
                case 66:
                    if (F(obj, iT, i11)) {
                        iZ4 = Y(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.I(iT, iZ4);
                        i10 += iM;
                    }
                    break;
                case 67:
                    if (F(obj, iT, i11)) {
                        jA3 = Z(obj, jU);
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.K(iT, jA3);
                        i10 += iM;
                    }
                    break;
                case 68:
                    if (F(obj, iT, i11)) {
                        iM = androidx.datastore.preferences.protobuf.AbstractC2050j.r(iT, (androidx.datastore.preferences.protobuf.O) androidx.datastore.preferences.protobuf.p0.C(obj, jU), s(i11));
                        i10 += iM;
                    }
                    break;
            }
        }
        return i10 + v(this.f21961o, obj);
    }

    private int v(androidx.datastore.preferences.protobuf.l0 l0Var, java.lang.Object obj) {
        return l0Var.h(l0Var.g(obj));
    }

    private static int w(java.lang.Object obj, long j6) {
        return androidx.datastore.preferences.protobuf.p0.z(obj, j6);
    }

    private static boolean x(int i6) {
        return (i6 & 536870912) != 0;
    }

    private boolean y(java.lang.Object obj, int i6) {
        int iB0 = b0(i6);
        long j6 = 1048575 & iB0;
        if (j6 != 1048575) {
            return (androidx.datastore.preferences.protobuf.p0.z(obj, j6) & (1 << (iB0 >>> 20))) != 0;
        }
        int iN0 = n0(i6);
        long jU = U(iN0);
        switch (m0(iN0)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(androidx.datastore.preferences.protobuf.p0.x(obj, jU)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(androidx.datastore.preferences.protobuf.p0.y(obj, jU)) != 0;
            case 2:
                return androidx.datastore.preferences.protobuf.p0.A(obj, jU) != 0;
            case 3:
                return androidx.datastore.preferences.protobuf.p0.A(obj, jU) != 0;
            case 4:
                return androidx.datastore.preferences.protobuf.p0.z(obj, jU) != 0;
            case 5:
                return androidx.datastore.preferences.protobuf.p0.A(obj, jU) != 0;
            case 6:
                return androidx.datastore.preferences.protobuf.p0.z(obj, jU) != 0;
            case 7:
                return androidx.datastore.preferences.protobuf.p0.r(obj, jU);
            case 8:
                java.lang.Object objC = androidx.datastore.preferences.protobuf.p0.C(obj, jU);
                if (objC instanceof java.lang.String) {
                    return !((java.lang.String) objC).isEmpty();
                }
                if (objC instanceof androidx.datastore.preferences.protobuf.AbstractC2047g) {
                    return !androidx.datastore.preferences.protobuf.AbstractC2047g.f21988D.equals(objC);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return androidx.datastore.preferences.protobuf.p0.C(obj, jU) != null;
            case 10:
                return !androidx.datastore.preferences.protobuf.AbstractC2047g.f21988D.equals(androidx.datastore.preferences.protobuf.p0.C(obj, jU));
            case 11:
                return androidx.datastore.preferences.protobuf.p0.z(obj, jU) != 0;
            case 12:
                return androidx.datastore.preferences.protobuf.p0.z(obj, jU) != 0;
            case 13:
                return androidx.datastore.preferences.protobuf.p0.z(obj, jU) != 0;
            case 14:
                return androidx.datastore.preferences.protobuf.p0.A(obj, jU) != 0;
            case 15:
                return androidx.datastore.preferences.protobuf.p0.z(obj, jU) != 0;
            case 16:
                return androidx.datastore.preferences.protobuf.p0.A(obj, jU) != 0;
            case 17:
                return androidx.datastore.preferences.protobuf.p0.C(obj, jU) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private boolean z(java.lang.Object obj, int i6, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return y(obj, i6);
        }
        return (i11 & i12) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void a(java.lang.Object obj, java.lang.Object obj2) {
        l(obj);
        obj2.getClass();
        for (int i6 = 0; i6 < this.f21947a.length; i6 += 3) {
            N(obj, obj2, i6);
        }
        androidx.datastore.preferences.protobuf.g0.F(this.f21961o, obj, obj2);
        if (this.f21952f) {
            androidx.datastore.preferences.protobuf.g0.D(this.f21962p, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void b(java.lang.Object obj, androidx.datastore.preferences.protobuf.d0 d0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) throws java.lang.Throwable {
        c2055o.getClass();
        l(obj);
        J(this.f21961o, this.f21962p, obj, d0Var, c2055o);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Switch 'out' block B:24:0x005b for B:16:0x0035 already processed. Defaulting to fallback option. */
    @Override // androidx.datastore.preferences.protobuf.e0
    public void c(java.lang.Object obj) {
        if (D(obj)) {
            if (obj instanceof androidx.datastore.preferences.protobuf.AbstractC2062w) {
                androidx.datastore.preferences.protobuf.AbstractC2062w abstractC2062w = (androidx.datastore.preferences.protobuf.AbstractC2062w) obj;
                abstractC2062w.l();
                abstractC2062w.k();
                abstractC2062w.D();
            }
            int length = this.f21947a.length;
            for (int i6 = 0; i6 < length; i6 += 3) {
                int iN0 = n0(i6);
                long jU = U(iN0);
                int iM0 = m0(iN0);
                if (iM0 != 9) {
                    if (iM0 != 60 && iM0 != 68) {
                        switch (iM0) {
                            case 17:
                                if (y(obj, i6)) {
                                    s(i6).c(f21946s.getObject(obj, jU));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f21960n.c(obj, jU);
                                continue;
                            case 50:
                                sun.misc.Unsafe unsafe = f21946s;
                                java.lang.Object object = unsafe.getObject(obj, jU);
                                if (object != null) {
                                    unsafe.putObject(obj, jU, this.f21963q.b(object));
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                continue;
                        }
                    } else if (F(obj, T(i6), i6)) {
                        s(i6).c(f21946s.getObject(obj, jU));
                    }
                } else if (y(obj, i6)) {
                    s(i6).c(f21946s.getObject(obj, jU));
                }
            }
            this.f21961o.j(obj);
            if (this.f21952f) {
                this.f21962p.f(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.e0
    public final boolean d(java.lang.Object obj) {
        int i6;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.f21957k) {
            int i14 = this.f21956j[i13];
            int iT = T(i14);
            int iN0 = n0(i14);
            int i15 = this.f21947a[i14 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i11) {
                if (i16 != 1048575) {
                    i12 = f21946s.getInt(obj, i16);
                }
                i10 = i12;
                i6 = i16;
            } else {
                i6 = i11;
                i10 = i12;
            }
            if (G(iN0) && !z(obj, i14, i6, i10, i17)) {
                return false;
            }
            int iM0 = m0(iN0);
            if (iM0 == 9 || iM0 == 17) {
                if (z(obj, i14, i6, i10, i17) && !A(obj, iN0, s(i14))) {
                    return false;
                }
            } else if (iM0 == 27) {
                if (!B(obj, iN0, i14)) {
                    return false;
                }
            } else if (iM0 == 60 || iM0 == 68) {
                if (F(obj, iT, i14) && !A(obj, iN0, s(i14))) {
                    return false;
                }
            } else if (iM0 != 49) {
                if (iM0 == 50 && !C(obj, iN0, i14)) {
                    return false;
                }
            } else if (!B(obj, iN0, i14)) {
                return false;
            }
            i13++;
            i11 = i6;
            i12 = i10;
        }
        return !this.f21952f || this.f21962p.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void e(java.lang.Object obj, androidx.datastore.preferences.protobuf.s0 s0Var) {
        if (s0Var.i() == androidx.datastore.preferences.protobuf.s0.a.DESCENDING) {
            q0(obj, s0Var);
        } else if (this.f21954h) {
            p0(obj, s0Var);
        } else {
            o0(obj, s0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean f(java.lang.Object obj, java.lang.Object obj2) {
        int length = this.f21947a.length;
        for (int i6 = 0; i6 < length; i6 += 3) {
            if (!n(obj, obj2, i6)) {
                return false;
            }
        }
        if (!this.f21961o.g(obj).equals(this.f21961o.g(obj2))) {
            return false;
        }
        if (this.f21952f) {
            return this.f21962p.c(obj).equals(this.f21962p.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int g(java.lang.Object obj) {
        return this.f21954h ? u(obj) : t(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public java.lang.Object h() {
        return this.f21959m.a(this.f21951e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2 A[PHI: r3
  0x00f2: PHI (r3v8 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:74:0x010e, B:68:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // androidx.datastore.preferences.protobuf.e0
    public int i(java.lang.Object obj) {
        int i6;
        double dX;
        float fY;
        boolean zR;
        java.lang.Object objC;
        int iZ;
        long jA;
        java.lang.Object objC2;
        int length = this.f21947a.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int iN0 = n0(i11);
            int iT = T(i11);
            long jU = U(iN0);
            int iHashCode = 37;
            switch (m0(iN0)) {
                case 0:
                    i6 = i10 * 53;
                    dX = androidx.datastore.preferences.protobuf.p0.x(obj, jU);
                    jA = java.lang.Double.doubleToLongBits(dX);
                    iZ = androidx.datastore.preferences.protobuf.AbstractC2064y.f(jA);
                    i10 = i6 + iZ;
                    break;
                case 1:
                    i6 = i10 * 53;
                    fY = androidx.datastore.preferences.protobuf.p0.y(obj, jU);
                    iZ = java.lang.Float.floatToIntBits(fY);
                    i10 = i6 + iZ;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i6 = i10 * 53;
                    jA = androidx.datastore.preferences.protobuf.p0.A(obj, jU);
                    iZ = androidx.datastore.preferences.protobuf.AbstractC2064y.f(jA);
                    i10 = i6 + iZ;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i6 = i10 * 53;
                    iZ = androidx.datastore.preferences.protobuf.p0.z(obj, jU);
                    i10 = i6 + iZ;
                    break;
                case 7:
                    i6 = i10 * 53;
                    zR = androidx.datastore.preferences.protobuf.p0.r(obj, jU);
                    iZ = androidx.datastore.preferences.protobuf.AbstractC2064y.c(zR);
                    i10 = i6 + iZ;
                    break;
                case 8:
                    i6 = i10 * 53;
                    iZ = ((java.lang.String) androidx.datastore.preferences.protobuf.p0.C(obj, jU)).hashCode();
                    i10 = i6 + iZ;
                    break;
                case 9:
                    objC = androidx.datastore.preferences.protobuf.p0.C(obj, jU);
                    if (objC != null) {
                        iHashCode = objC.hashCode();
                    }
                    i10 = (i10 * 53) + iHashCode;
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i6 = i10 * 53;
                    objC2 = androidx.datastore.preferences.protobuf.p0.C(obj, jU);
                    iZ = objC2.hashCode();
                    i10 = i6 + iZ;
                    break;
                case 17:
                    objC = androidx.datastore.preferences.protobuf.p0.C(obj, jU);
                    if (objC != null) {
                        iHashCode = objC.hashCode();
                    }
                    i10 = (i10 * 53) + iHashCode;
                    break;
                case 51:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        dX = W(obj, jU);
                        jA = java.lang.Double.doubleToLongBits(dX);
                        iZ = androidx.datastore.preferences.protobuf.AbstractC2064y.f(jA);
                        i10 = i6 + iZ;
                    }
                    break;
                case 52:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        fY = X(obj, jU);
                        iZ = java.lang.Float.floatToIntBits(fY);
                        i10 = i6 + iZ;
                    }
                    break;
                case 53:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        jA = Z(obj, jU);
                        iZ = androidx.datastore.preferences.protobuf.AbstractC2064y.f(jA);
                        i10 = i6 + iZ;
                    }
                    break;
                case 54:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        jA = Z(obj, jU);
                        iZ = androidx.datastore.preferences.protobuf.AbstractC2064y.f(jA);
                        i10 = i6 + iZ;
                    }
                    break;
                case 55:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        iZ = Y(obj, jU);
                        i10 = i6 + iZ;
                    }
                    break;
                case 56:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        jA = Z(obj, jU);
                        iZ = androidx.datastore.preferences.protobuf.AbstractC2064y.f(jA);
                        i10 = i6 + iZ;
                    }
                    break;
                case 57:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        iZ = Y(obj, jU);
                        i10 = i6 + iZ;
                    }
                    break;
                case 58:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        zR = V(obj, jU);
                        iZ = androidx.datastore.preferences.protobuf.AbstractC2064y.c(zR);
                        i10 = i6 + iZ;
                    }
                    break;
                case 59:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        iZ = ((java.lang.String) androidx.datastore.preferences.protobuf.p0.C(obj, jU)).hashCode();
                        i10 = i6 + iZ;
                    }
                    break;
                case 60:
                    if (F(obj, iT, i11)) {
                        objC2 = androidx.datastore.preferences.protobuf.p0.C(obj, jU);
                        i6 = i10 * 53;
                        iZ = objC2.hashCode();
                        i10 = i6 + iZ;
                    }
                    break;
                case 61:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        objC2 = androidx.datastore.preferences.protobuf.p0.C(obj, jU);
                        iZ = objC2.hashCode();
                        i10 = i6 + iZ;
                    }
                    break;
                case 62:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        iZ = Y(obj, jU);
                        i10 = i6 + iZ;
                    }
                    break;
                case 63:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        iZ = Y(obj, jU);
                        i10 = i6 + iZ;
                    }
                    break;
                case 64:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        iZ = Y(obj, jU);
                        i10 = i6 + iZ;
                    }
                    break;
                case 65:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        jA = Z(obj, jU);
                        iZ = androidx.datastore.preferences.protobuf.AbstractC2064y.f(jA);
                        i10 = i6 + iZ;
                    }
                    break;
                case 66:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        iZ = Y(obj, jU);
                        i10 = i6 + iZ;
                    }
                    break;
                case 67:
                    if (F(obj, iT, i11)) {
                        i6 = i10 * 53;
                        jA = Z(obj, jU);
                        iZ = androidx.datastore.preferences.protobuf.AbstractC2064y.f(jA);
                        i10 = i6 + iZ;
                    }
                    break;
                case 68:
                    if (F(obj, iT, i11)) {
                        objC2 = androidx.datastore.preferences.protobuf.p0.C(obj, jU);
                        i6 = i10 * 53;
                        iZ = objC2.hashCode();
                        i10 = i6 + iZ;
                    }
                    break;
            }
        }
        int iHashCode2 = (i10 * 53) + this.f21961o.g(obj).hashCode();
        return this.f21952f ? (iHashCode2 * 53) + this.f21962p.c(obj).hashCode() : iHashCode2;
    }
}
