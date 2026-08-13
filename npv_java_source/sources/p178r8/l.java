package p178r8;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.List f54006e = p097j7.AbstractC6879v.T0(java.util.ServiceLoader.load(p178r8.g.class, p178r8.g.class.getClassLoader()));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p178r8.l f54007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final G8.e.a f54008g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G8.g f54009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G8.f f54010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G8.e.a f54011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.p f54012d;

    static class a implements G8.e.a {
        a() {
        }

        private static /* synthetic */ void b(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // G8.e.a
        public boolean a(F8.e0 e0Var, F8.e0 e0Var2) {
            if (e0Var == null) {
                b(0);
            }
            if (e0Var2 == null) {
                b(1);
            }
            return e0Var.equals(e0Var2);
        }
    }

    static class b implements p237x7.p {
        b() {
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p087i7.u u(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2) {
            return new p087i7.u(interfaceC1420a, interfaceC1420a2);
        }
    }

    static class c implements p237x7.l {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ O7.InterfaceC1432m f54013C;

        c(O7.InterfaceC1432m interfaceC1432m) {
            this.f54013C = interfaceC1432m;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean l(O7.InterfaceC1421b interfaceC1421b) {
            return java.lang.Boolean.valueOf(interfaceC1421b.b() == this.f54013C);
        }
    }

    static class d implements p237x7.l {
        d() {
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public O7.InterfaceC1421b l(O7.InterfaceC1421b interfaceC1421b) {
            return interfaceC1421b;
        }
    }

    static class e implements p237x7.l {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ O7.InterfaceC1424e f54014C;

        e(O7.InterfaceC1424e interfaceC1424e) {
            this.f54014C = interfaceC1424e;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean l(O7.InterfaceC1421b interfaceC1421b) {
            boolean z6 = false;
            if (!O7.AbstractC1438t.g(interfaceC1421b.h()) && O7.AbstractC1438t.h(interfaceC1421b, this.f54014C, false)) {
                z6 = true;
            }
            return java.lang.Boolean.valueOf(z6);
        }
    }

    static class f implements p237x7.l {
        f() {
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public O7.InterfaceC1420a l(O7.InterfaceC1421b interfaceC1421b) {
            return interfaceC1421b;
        }
    }

    static class g implements p237x7.l {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p178r8.k f54015C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ O7.InterfaceC1421b f54016D;

        g(p178r8.k kVar, O7.InterfaceC1421b interfaceC1421b) {
            this.f54015C = kVar;
            this.f54016D = interfaceC1421b;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p087i7.M l(O7.InterfaceC1421b interfaceC1421b) {
            this.f54015C.b(this.f54016D, interfaceC1421b);
            return p087i7.M.f46721a;
        }
    }

    static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f54018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f54019c;

        static {
            int[] iArr = new int[O7.D.values().length];
            f54019c = iArr;
            try {
                iArr[O7.D.FINAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f54019c[O7.D.SEALED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f54019c[O7.D.OPEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f54019c[O7.D.ABSTRACT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[r8.l.i.a.values().length];
            f54018b = iArr2;
            try {
                iArr2[r8.l.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f54018b[r8.l.i.a.CONFLICT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f54018b[r8.l.i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[r8.g.b.values().length];
            f54017a = iArr3;
            try {
                iArr3[r8.g.b.OVERRIDABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f54017a[r8.g.b.CONFLICT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f54017a[r8.g.b.INCOMPATIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f54017a[r8.g.b.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    public static class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final r8.l.i f54020c = new r8.l.i(r8.l.i.a.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r8.l.i.a f54021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.String f54022b;

        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(r8.l.i.a aVar, java.lang.String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f54021a = aVar;
            this.f54022b = str;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031  */
        private static /* synthetic */ void a(int i6) {
            java.lang.String str = (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[(i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) ? 3 : 2];
            if (i6 == 1 || i6 == 2) {
                objArr[0] = "debugMessage";
            } else if (i6 == 3) {
                objArr[0] = "success";
            } else if (i6 != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            } else {
                objArr[0] = "debugMessage";
            }
            switch (i6) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i6 == 1) {
                objArr[2] = "incompatible";
            } else if (i6 == 2) {
                objArr[2] = "conflict";
            } else if (i6 == 3 || i6 == 4) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4) {
                throw new java.lang.IllegalStateException(str2);
            }
            throw new java.lang.IllegalArgumentException(str2);
        }

        public static r8.l.i b(java.lang.String str) {
            if (str == null) {
                a(2);
            }
            return new r8.l.i(r8.l.i.a.CONFLICT, str);
        }

        public static r8.l.i d(java.lang.String str) {
            if (str == null) {
                a(1);
            }
            return new r8.l.i(r8.l.i.a.INCOMPATIBLE, str);
        }

        public static r8.l.i e() {
            r8.l.i iVar = f54020c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public r8.l.i.a c() {
            r8.l.i.a aVar = this.f54021a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }
    }

    static {
        r8.l.a aVar = new r8.l.a();
        f54008g = aVar;
        f54007f = new p178r8.l(aVar, G8.g.a.f3136a, G8.f.a.f3135a, null);
    }

    private l(G8.e.a aVar, G8.g gVar, G8.f fVar, p237x7.p pVar) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f54011c = aVar;
        this.f54009a = gVar;
        this.f54010b = fVar;
        this.f54012d = pVar;
    }

    private static boolean A(O7.T t6, O7.T t10) {
        if (t6 == null || t10 == null) {
            return true;
        }
        return H(t6, t10);
    }

    public static boolean B(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2) {
        if (interfaceC1420a == null) {
            a(67);
        }
        if (interfaceC1420a2 == null) {
            a(68);
        }
        F8.E eL = interfaceC1420a.l();
        F8.E eL2 = interfaceC1420a2.l();
        if (!H(interfaceC1420a, interfaceC1420a2)) {
            return false;
        }
        F8.d0 d0VarL = f54007f.l(interfaceC1420a.g(), interfaceC1420a2.g());
        if (interfaceC1420a instanceof O7.InterfaceC1443y) {
            return G(interfaceC1420a, eL, interfaceC1420a2, eL2, d0VarL);
        }
        if (!(interfaceC1420a instanceof O7.U)) {
            throw new java.lang.IllegalArgumentException("Unexpected callable: " + interfaceC1420a.getClass());
        }
        O7.U u6 = (O7.U) interfaceC1420a;
        O7.U u10 = (O7.U) interfaceC1420a2;
        if (!A(u6.i(), u10.i())) {
            return false;
        }
        if (u6.t0() && u10.t0()) {
            return F8.C0944e.f2895a.k(d0VarL, eL.Z0(), eL2.Z0());
        }
        return (u6.t0() || !u10.t0()) && G(interfaceC1420a, eL, interfaceC1420a2, eL2, d0VarL);
    }

    private static boolean C(O7.InterfaceC1420a interfaceC1420a, java.util.Collection collection) {
        if (interfaceC1420a == null) {
            a(71);
        }
        if (collection == null) {
            a(72);
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!B(interfaceC1420a, (O7.InterfaceC1420a) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(O7.InterfaceC1420a interfaceC1420a, F8.E e6, O7.InterfaceC1420a interfaceC1420a2, F8.E e10, F8.d0 d0Var) {
        if (interfaceC1420a == null) {
            a(73);
        }
        if (e6 == null) {
            a(74);
        }
        if (interfaceC1420a2 == null) {
            a(75);
        }
        if (e10 == null) {
            a(76);
        }
        if (d0Var == null) {
            a(77);
        }
        return F8.C0944e.f2895a.r(d0Var, e6.Z0(), e10.Z0());
    }

    private static boolean H(O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1436q interfaceC1436q2) {
        if (interfaceC1436q == null) {
            a(69);
        }
        if (interfaceC1436q2 == null) {
            a(70);
        }
        java.lang.Integer numD = O7.AbstractC1438t.d(interfaceC1436q.h(), interfaceC1436q2.h());
        return numD == null || numD.intValue() >= 0;
    }

    public static boolean I(O7.C c6, O7.C c10, boolean z6) {
        if (c6 == null) {
            a(57);
        }
        if (c10 == null) {
            a(58);
        }
        return !O7.AbstractC1438t.g(c10.h()) && O7.AbstractC1438t.h(c10, c6, z6);
    }

    public static boolean J(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2, boolean z6, boolean z10) {
        if (interfaceC1420a == null) {
            a(13);
        }
        if (interfaceC1420a2 == null) {
            a(14);
        }
        if (!interfaceC1420a.equals(interfaceC1420a2) && p178r8.d.f53988a.f(interfaceC1420a.a(), interfaceC1420a2.a(), z6, z10)) {
            return true;
        }
        O7.InterfaceC1420a interfaceC1420aA = interfaceC1420a2.a();
        java.util.Iterator it = p178r8.f.d(interfaceC1420a).iterator();
        while (it.hasNext()) {
            if (p178r8.d.f53988a.f(interfaceC1420aA, (O7.InterfaceC1420a) it.next(), z6, z10)) {
                return true;
            }
        }
        return false;
    }

    public static void K(O7.InterfaceC1421b interfaceC1421b, p237x7.l lVar) {
        O7.AbstractC1439u abstractC1439u;
        if (interfaceC1421b == null) {
            a(107);
        }
        for (O7.InterfaceC1421b interfaceC1421b2 : interfaceC1421b.f()) {
            if (interfaceC1421b2.h() == O7.AbstractC1438t.f8188g) {
                K(interfaceC1421b2, lVar);
            }
        }
        if (interfaceC1421b.h() != O7.AbstractC1438t.f8188g) {
            return;
        }
        O7.AbstractC1439u abstractC1439uH = h(interfaceC1421b);
        if (abstractC1439uH == null) {
            if (lVar != null) {
                lVar.l(interfaceC1421b);
            }
            abstractC1439u = O7.AbstractC1438t.f8186e;
        } else {
            abstractC1439u = abstractC1439uH;
        }
        if (interfaceC1421b instanceof R7.C) {
            ((R7.C) interfaceC1421b).l1(abstractC1439u);
            java.util.Iterator it = ((O7.U) interfaceC1421b).B().iterator();
            while (it.hasNext()) {
                K((O7.T) it.next(), abstractC1439uH == null ? null : lVar);
            }
            return;
        }
        if (interfaceC1421b instanceof R7.p) {
            ((R7.p) interfaceC1421b).s1(abstractC1439u);
            return;
        }
        R7.B b6 = (R7.B) interfaceC1421b;
        b6.W0(abstractC1439u);
        if (abstractC1439u != b6.K0().h()) {
            b6.U0(false);
        }
    }

    public static java.lang.Object L(java.util.Collection collection, p237x7.l lVar) {
        java.lang.Object next;
        if (collection == null) {
            a(78);
        }
        if (lVar == null) {
            a(79);
        }
        if (collection.size() == 1) {
            java.lang.Object objH0 = p097j7.AbstractC6879v.h0(collection);
            if (objH0 == null) {
                a(80);
            }
            return objH0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        java.util.List listW0 = p097j7.AbstractC6879v.w0(collection, lVar);
        java.lang.Object objH1 = p097j7.AbstractC6879v.h0(collection);
        O7.InterfaceC1420a interfaceC1420a = (O7.InterfaceC1420a) lVar.l(objH1);
        for (java.lang.Object obj : collection) {
            O7.InterfaceC1420a interfaceC1420a2 = (O7.InterfaceC1420a) lVar.l(obj);
            if (C(interfaceC1420a2, listW0)) {
                arrayList.add(obj);
            }
            if (B(interfaceC1420a2, interfaceC1420a) && !B(interfaceC1420a, interfaceC1420a2)) {
                objH1 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objH1 == null) {
                a(81);
            }
            return objH1;
        }
        if (arrayList.size() == 1) {
            java.lang.Object objH2 = p097j7.AbstractC6879v.h0(arrayList);
            if (objH2 == null) {
                a(82);
            }
            return objH2;
        }
        java.util.Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (F8.B.b(((O7.InterfaceC1420a) lVar.l(next)).l()));
        if (next != null) {
            return next;
        }
        java.lang.Object objH3 = p097j7.AbstractC6879v.h0(arrayList);
        if (objH3 == null) {
            a(84);
        }
        return objH3;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    private static /* synthetic */ void a(int i6) {
        java.lang.String str;
        int i10;
        if (i6 != 11 && i6 != 12 && i6 != 16 && i6 != 21 && i6 != 95 && i6 != 98 && i6 != 103 && i6 != 44 && i6 != 45) {
            switch (i6) {
                default:
                    switch (i6) {
                        default:
                            switch (i6) {
                                default:
                                    switch (i6) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 32:
                        case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 11 && i6 != 12 && i6 != 16 && i6 != 21 && i6 != 95 && i6 != 98 && i6 != 103 && i6 != 44 && i6 != 45) {
            switch (i6) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    i10 = 2;
                    break;
                default:
                    switch (i6) {
                        case 32:
                        case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            i10 = 2;
                            break;
                        default:
                            switch (i6) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    i10 = 2;
                                    break;
                                default:
                                    switch (i6) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            i10 = 2;
                                            break;
                                        default:
                                            i10 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i10 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 30:
            case 40:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 31:
            case 41:
                objArr[0] = "subDescriptor";
                break;
            case 42:
                objArr[0] = "firstParameters";
                break;
            case 43:
                objArr[0] = "secondParameters";
                break;
            case 46:
                objArr[0] = "typeInSuper";
                break;
            case 47:
                objArr[0] = "typeInSub";
                break;
            case 48:
            case 51:
            case 77:
                objArr[0] = "typeCheckerState";
                break;
            case 49:
                objArr[0] = "superTypeParameter";
                break;
            case 50:
                objArr[0] = "subTypeParameter";
                break;
            case 52:
                objArr[0] = "name";
                break;
            case 53:
                objArr[0] = "membersFromSupertypes";
                break;
            case 54:
                objArr[0] = "membersFromCurrent";
                break;
            case 55:
            case 61:
            case 64:
            case 86:
            case 89:
            case 96:
                objArr[0] = "current";
                break;
            case 56:
            case 62:
            case 66:
            case 87:
            case 106:
                objArr[0] = "strategy";
                break;
            case 57:
                objArr[0] = "overriding";
                break;
            case 58:
                objArr[0] = "fromSuper";
                break;
            case 59:
                objArr[0] = "fromCurrent";
                break;
            case 60:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 63:
            case 65:
                objArr[0] = "notOverridden";
                break;
            case 67:
            case 69:
            case 73:
                objArr[0] = "a";
                break;
            case 68:
            case 70:
            case 75:
                objArr[0] = "b";
                break;
            case 71:
                objArr[0] = "candidate";
                break;
            case 72:
            case 88:
            case 93:
            case 109:
                objArr[0] = "descriptors";
                break;
            case 74:
                objArr[0] = "aReturnType";
                break;
            case 76:
                objArr[0] = "bReturnType";
                break;
            case 78:
            case 85:
                objArr[0] = "overridables";
                break;
            case 79:
            case 101:
                objArr[0] = "descriptorByHandle";
                break;
            case 94:
                objArr[0] = "classModality";
                break;
            case 97:
                objArr[0] = "toFilter";
                break;
            case 99:
            case 104:
                objArr[0] = "overrider";
                break;
            case 100:
            case 105:
                objArr[0] = "extractFrom";
                break;
            case 102:
                objArr[0] = "onConflict";
                break;
            case 107:
            case 108:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i6 == 11 || i6 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i6 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i6 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i6 == 95) {
            objArr[1] = "getMinimalModality";
        } else if (i6 == 98) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i6 == 103) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i6 != 44 && i6 != 45) {
            switch (i6) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i6) {
                        case 32:
                        case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i6) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i6) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i6) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 30:
            case 31:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 40:
            case 41:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 42:
            case 43:
                objArr[2] = "createTypeCheckerState";
                break;
            case 46:
            case 47:
            case 48:
                objArr[2] = "areTypesEquivalent";
                break;
            case 49:
            case 50:
            case 51:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 57:
            case 58:
                objArr[2] = "isVisibleForOverride";
                break;
            case 59:
            case 60:
            case 61:
            case 62:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 63:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 64:
            case 65:
            case 66:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 67:
            case 68:
                objArr[2] = "isMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 71:
            case 72:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 78:
            case 79:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 85:
            case 86:
            case 87:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 88:
            case 89:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 93:
            case 94:
                objArr[2] = "getMinimalModality";
                break;
            case 96:
            case 97:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 99:
            case 100:
            case 101:
            case 102:
            case 104:
            case 105:
            case 106:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 107:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 108:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 109:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 11 && i6 != 12 && i6 != 16 && i6 != 21 && i6 != 95 && i6 != 98 && i6 != 103 && i6 != 44 && i6 != 45) {
            switch (i6) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i6) {
                        case 32:
                        case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i6) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i6) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            throw new java.lang.IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    private static boolean b(java.util.Collection collection) {
        if (collection == null) {
            a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        return p097j7.AbstractC6879v.X(collection, new r8.l.c(((O7.InterfaceC1421b) collection.iterator().next()).b()));
    }

    private static boolean c(O7.f0 f0Var, O7.f0 f0Var2, F8.d0 d0Var) {
        if (f0Var == null) {
            a(49);
        }
        if (f0Var2 == null) {
            a(50);
        }
        if (d0Var == null) {
            a(51);
        }
        java.util.List<F8.E> upperBounds = f0Var.getUpperBounds();
        java.util.ArrayList arrayList = new java.util.ArrayList(f0Var2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (F8.E e6 : upperBounds) {
            java.util.ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (d(e6, (F8.E) listIterator.next(), d0Var)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    private static boolean d(F8.E e6, F8.E e10, F8.d0 d0Var) {
        if (e6 == null) {
            a(46);
        }
        if (e10 == null) {
            a(47);
        }
        if (d0Var == null) {
            a(48);
        }
        if (F8.G.a(e6) && F8.G.a(e10)) {
            return true;
        }
        return F8.C0944e.f2895a.k(d0Var, e6.Z0(), e10.Z0());
    }

    private static r8.l.i e(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2) {
        java.lang.String str;
        if ((interfaceC1420a.v0() == null) != (interfaceC1420a2.v0() == null)) {
            str = "Receiver presence mismatch";
        } else {
            if (interfaceC1420a.n().size() == interfaceC1420a2.n().size()) {
                return null;
            }
            str = "Value parameter number mismatch";
        }
        return r8.l.i.d(str);
    }

    private static void f(O7.InterfaceC1421b interfaceC1421b, java.util.Set set) {
        if (interfaceC1421b == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (interfaceC1421b.j().e()) {
            set.add(interfaceC1421b);
            return;
        }
        if (interfaceC1421b.f().isEmpty()) {
            throw new java.lang.IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC1421b);
        }
        java.util.Iterator it = interfaceC1421b.f().iterator();
        while (it.hasNext()) {
            f((O7.InterfaceC1421b) it.next(), set);
        }
    }

    private static java.util.List g(O7.InterfaceC1420a interfaceC1420a) {
        O7.X xV0 = interfaceC1420a.v0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (xV0 != null) {
            arrayList.add(xV0.getType());
        }
        java.util.Iterator it = interfaceC1420a.n().iterator();
        while (it.hasNext()) {
            arrayList.add(((O7.j0) it.next()).getType());
        }
        return arrayList;
    }

    private static O7.AbstractC1439u h(O7.InterfaceC1421b interfaceC1421b) {
        if (interfaceC1421b == null) {
            a(108);
        }
        java.util.Collection<O7.InterfaceC1421b> collectionF = interfaceC1421b.f();
        O7.AbstractC1439u abstractC1439uU = u(collectionF);
        if (abstractC1439uU == null) {
            return null;
        }
        if (interfaceC1421b.j() != O7.InterfaceC1421b.a.FAKE_OVERRIDE) {
            return abstractC1439uU.f();
        }
        for (O7.InterfaceC1421b interfaceC1421b2 : collectionF) {
            if (interfaceC1421b2.q() != O7.D.ABSTRACT && !interfaceC1421b2.h().equals(abstractC1439uU)) {
                return null;
            }
        }
        return abstractC1439uU;
    }

    public static p178r8.l i(G8.g gVar, G8.e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new p178r8.l(aVar, gVar, G8.f.a.f3135a, null);
    }

    private static void j(java.util.Collection collection, O7.InterfaceC1424e interfaceC1424e, p178r8.k kVar) {
        if (collection == null) {
            a(85);
        }
        if (interfaceC1424e == null) {
            a(86);
        }
        if (kVar == null) {
            a(87);
        }
        java.util.Collection collectionT = t(interfaceC1424e, collection);
        boolean zIsEmpty = collectionT.isEmpty();
        if (!zIsEmpty) {
            collection = collectionT;
        }
        O7.InterfaceC1421b interfaceC1421bI0 = ((O7.InterfaceC1421b) L(collection, new r8.l.d())).i0(interfaceC1424e, n(collection, interfaceC1424e), zIsEmpty ? O7.AbstractC1438t.f8189h : O7.AbstractC1438t.f8188g, O7.InterfaceC1421b.a.FAKE_OVERRIDE, false);
        kVar.d(interfaceC1421bI0, collection);
        kVar.a(interfaceC1421bI0);
    }

    private static void k(O7.InterfaceC1424e interfaceC1424e, java.util.Collection collection, p178r8.k kVar) {
        if (interfaceC1424e == null) {
            a(64);
        }
        if (collection == null) {
            a(65);
        }
        if (kVar == null) {
            a(66);
        }
        if (b(collection)) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                j(java.util.Collections.singleton((O7.InterfaceC1421b) it.next()), interfaceC1424e, kVar);
            }
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(p(p178r8.s.a(linkedList), linkedList, kVar), interfaceC1424e, kVar);
            }
        }
    }

    private F8.d0 l(java.util.List list, java.util.List list2) {
        if (list == null) {
            a(42);
        }
        if (list2 == null) {
            a(43);
        }
        if (list.isEmpty()) {
            F8.d0 d0VarH0 = new p178r8.m(null, this.f54011c, this.f54009a, this.f54010b, this.f54012d).H0(true, true);
            if (d0VarH0 == null) {
                a(44);
            }
            return d0VarH0;
        }
        java.util.HashMap map = new java.util.HashMap();
        for (int i6 = 0; i6 < list.size(); i6++) {
            map.put(((O7.f0) list.get(i6)).p(), ((O7.f0) list2.get(i6)).p());
        }
        F8.d0 d0VarH1 = new p178r8.m(map, this.f54011c, this.f54009a, this.f54010b, this.f54012d).H0(true, true);
        if (d0VarH1 == null) {
            a(45);
        }
        return d0VarH1;
    }

    public static p178r8.l m(G8.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new p178r8.l(f54008g, gVar, G8.f.a.f3135a, null);
    }

    private static O7.D n(java.util.Collection collection, O7.InterfaceC1424e interfaceC1424e) {
        if (collection == null) {
            a(88);
        }
        if (interfaceC1424e == null) {
            a(89);
        }
        java.util.Iterator it = collection.iterator();
        boolean z6 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            O7.InterfaceC1421b interfaceC1421b = (O7.InterfaceC1421b) it.next();
            int i6 = r8.l.h.f54019c[interfaceC1421b.q().ordinal()];
            if (i6 == 1) {
                O7.D d6 = O7.D.FINAL;
                if (d6 == null) {
                    a(90);
                }
                return d6;
            }
            if (i6 == 2) {
                throw new java.lang.IllegalStateException("Member cannot have SEALED modality: " + interfaceC1421b);
            }
            if (i6 == 3) {
                z10 = true;
            } else if (i6 == 4) {
                z11 = true;
            }
        }
        if (interfaceC1424e.R() && interfaceC1424e.q() != O7.D.ABSTRACT && interfaceC1424e.q() != O7.D.SEALED) {
            z6 = true;
        }
        if (z10 && !z11) {
            O7.D d10 = O7.D.OPEN;
            if (d10 == null) {
                a(91);
            }
            return d10;
        }
        if (!z10 && z11) {
            O7.D dQ = z6 ? interfaceC1424e.q() : O7.D.ABSTRACT;
            if (dQ == null) {
                a(92);
            }
            return dQ;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            hashSet.addAll(z((O7.InterfaceC1421b) it2.next()));
        }
        return y(r(hashSet), z6, interfaceC1424e.q());
    }

    private java.util.Collection o(O7.InterfaceC1421b interfaceC1421b, java.util.Collection collection, O7.InterfaceC1424e interfaceC1424e, p178r8.k kVar) {
        if (interfaceC1421b == null) {
            a(59);
        }
        if (collection == null) {
            a(60);
        }
        if (interfaceC1424e == null) {
            a(61);
        }
        if (kVar == null) {
            a(62);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        P8.g gVarD = P8.g.d();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            O7.InterfaceC1421b interfaceC1421b2 = (O7.InterfaceC1421b) it.next();
            r8.l.i.a aVarC = D(interfaceC1421b2, interfaceC1421b, interfaceC1424e).c();
            boolean zI = I(interfaceC1421b, interfaceC1421b2, false);
            int i6 = r8.l.h.f54018b[aVarC.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    if (zI) {
                        kVar.c(interfaceC1421b2, interfaceC1421b);
                    }
                }
            } else if (zI) {
                gVarD.add(interfaceC1421b2);
            }
            arrayList.add(interfaceC1421b2);
        }
        kVar.d(interfaceC1421b, gVarD);
        return arrayList;
    }

    private static java.util.Collection p(O7.InterfaceC1421b interfaceC1421b, java.util.Queue queue, p178r8.k kVar) {
        if (interfaceC1421b == null) {
            a(104);
        }
        if (queue == null) {
            a(105);
        }
        if (kVar == null) {
            a(106);
        }
        return q(interfaceC1421b, queue, new r8.l.f(), new r8.l.g(kVar, interfaceC1421b));
    }

    public static java.util.Collection q(java.lang.Object obj, java.util.Collection collection, p237x7.l lVar, p237x7.l lVar2) {
        if (obj == null) {
            a(99);
        }
        if (collection == null) {
            a(100);
        }
        if (lVar == null) {
            a(101);
        }
        if (lVar2 == null) {
            a(102);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(obj);
        O7.InterfaceC1420a interfaceC1420a = (O7.InterfaceC1420a) lVar.l(obj);
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            O7.InterfaceC1420a interfaceC1420a2 = (O7.InterfaceC1420a) lVar.l(next);
            if (obj != next) {
                r8.l.i.a aVarX = x(interfaceC1420a, interfaceC1420a2);
                if (aVarX == r8.l.i.a.OVERRIDABLE) {
                    arrayList.add(next);
                } else if (aVarX == r8.l.i.a.CONFLICT) {
                    lVar2.l(next);
                }
            }
            it.remove();
        }
        return arrayList;
    }

    public static java.util.Set r(java.util.Set set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && p218v8.c.v(p218v8.c.p((O7.InterfaceC1432m) set.iterator().next())), null, new r8.l.b());
    }

    public static java.util.Set s(java.util.Set set, boolean z6, p237x7.a aVar, p237x7.p pVar) {
        if (set == null) {
            a(9);
        }
        if (pVar == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : set) {
            if (aVar != null) {
                aVar.b();
            }
            java.util.Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                p087i7.u uVar = (p087i7.u) pVar.u(obj, it.next());
                O7.InterfaceC1420a interfaceC1420a = (O7.InterfaceC1420a) uVar.a();
                O7.InterfaceC1420a interfaceC1420a2 = (O7.InterfaceC1420a) uVar.b();
                if (!J(interfaceC1420a, interfaceC1420a2, z6, true)) {
                    if (J(interfaceC1420a2, interfaceC1420a, z6, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static java.util.Collection t(O7.InterfaceC1424e interfaceC1424e, java.util.Collection collection) {
        if (interfaceC1424e == null) {
            a(96);
        }
        if (collection == null) {
            a(97);
        }
        java.util.List listE0 = p097j7.AbstractC6879v.e0(collection, new r8.l.e(interfaceC1424e));
        if (listE0 == null) {
            a(98);
        }
        return listE0;
    }

    public static O7.AbstractC1439u u(java.util.Collection collection) {
        O7.AbstractC1439u abstractC1439u;
        if (collection == null) {
            a(109);
        }
        if (collection.isEmpty()) {
            return O7.AbstractC1438t.f8193l;
        }
        java.util.Iterator it = collection.iterator();
        loop0: while (true) {
            abstractC1439u = null;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                O7.AbstractC1439u abstractC1439uH = ((O7.InterfaceC1421b) it.next()).h();
                if (abstractC1439u != null) {
                    java.lang.Integer numD = O7.AbstractC1438t.d(abstractC1439uH, abstractC1439u);
                    if (numD == null) {
                        break;
                    }
                    if (numD.intValue() > 0) {
                    }
                }
                abstractC1439u = abstractC1439uH;
            }
        }
        if (abstractC1439u == null) {
            return null;
        }
        java.util.Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            java.lang.Integer numD2 = O7.AbstractC1438t.d(abstractC1439u, ((O7.InterfaceC1421b) it2.next()).h());
            if (numD2 == null || numD2.intValue() < 0) {
                return null;
            }
        }
        return abstractC1439u;
    }

    public static r8.l.i w(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2) {
        boolean z6;
        java.lang.String str;
        if (interfaceC1420a == null) {
            a(40);
        }
        if (interfaceC1420a2 == null) {
            a(41);
        }
        boolean z10 = interfaceC1420a instanceof O7.InterfaceC1443y;
        if ((z10 && !(interfaceC1420a2 instanceof O7.InterfaceC1443y)) || (((z6 = interfaceC1420a instanceof O7.U)) && !(interfaceC1420a2 instanceof O7.U))) {
            str = "Member kind mismatch";
        } else {
            if (!z10 && !z6) {
                throw new java.lang.IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC1420a);
            }
            if (interfaceC1420a.getName().equals(interfaceC1420a2.getName())) {
                r8.l.i iVarE = e(interfaceC1420a, interfaceC1420a2);
                if (iVarE != null) {
                    return iVarE;
                }
                return null;
            }
            str = "Name mismatch";
        }
        return r8.l.i.d(str);
    }

    public static r8.l.i.a x(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2) {
        p178r8.l lVar = f54007f;
        r8.l.i.a aVarC = lVar.D(interfaceC1420a2, interfaceC1420a, null).c();
        r8.l.i.a aVarC2 = lVar.D(interfaceC1420a, interfaceC1420a2, null).c();
        r8.l.i.a aVar = r8.l.i.a.OVERRIDABLE;
        if (aVarC == aVar && aVarC2 == aVar) {
            return aVar;
        }
        r8.l.i.a aVar2 = r8.l.i.a.CONFLICT;
        return (aVarC == aVar2 || aVarC2 == aVar2) ? aVar2 : r8.l.i.a.INCOMPATIBLE;
    }

    private static O7.D y(java.util.Collection collection, boolean z6, O7.D d6) {
        if (collection == null) {
            a(93);
        }
        if (d6 == null) {
            a(94);
        }
        O7.D d10 = O7.D.ABSTRACT;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            O7.InterfaceC1421b interfaceC1421b = (O7.InterfaceC1421b) it.next();
            O7.D dQ = (z6 && interfaceC1421b.q() == O7.D.ABSTRACT) ? d6 : interfaceC1421b.q();
            if (dQ.compareTo(d10) < 0) {
                d10 = dQ;
            }
        }
        if (d10 == null) {
            a(95);
        }
        return d10;
    }

    public static java.util.Set z(O7.InterfaceC1421b interfaceC1421b) {
        if (interfaceC1421b == null) {
            a(15);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        f(interfaceC1421b, linkedHashSet);
        return linkedHashSet;
    }

    public r8.l.i D(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2, O7.InterfaceC1424e interfaceC1424e) {
        if (interfaceC1420a == null) {
            a(19);
        }
        if (interfaceC1420a2 == null) {
            a(20);
        }
        r8.l.i iVarE = E(interfaceC1420a, interfaceC1420a2, interfaceC1424e, false);
        if (iVarE == null) {
            a(21);
        }
        return iVarE;
    }

    public r8.l.i E(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2, O7.InterfaceC1424e interfaceC1424e, boolean z6) {
        if (interfaceC1420a == null) {
            a(22);
        }
        if (interfaceC1420a2 == null) {
            a(23);
        }
        r8.l.i iVarF = F(interfaceC1420a, interfaceC1420a2, z6);
        boolean z10 = iVarF.c() == r8.l.i.a.OVERRIDABLE;
        for (p178r8.g gVar : f54006e) {
            if (gVar.a() != r8.g.a.CONFLICTS_ONLY && (!z10 || gVar.a() != r8.g.a.SUCCESS_ONLY)) {
                int i6 = r8.l.h.f54017a[gVar.b(interfaceC1420a, interfaceC1420a2, interfaceC1424e).ordinal()];
                if (i6 == 1) {
                    z10 = true;
                } else {
                    if (i6 == 2) {
                        r8.l.i iVarB = r8.l.i.b("External condition failed");
                        if (iVarB == null) {
                            a(24);
                        }
                        return iVarB;
                    }
                    if (i6 == 3) {
                        r8.l.i iVarD = r8.l.i.d("External condition");
                        if (iVarD == null) {
                            a(25);
                        }
                        return iVarD;
                    }
                }
            }
        }
        if (!z10) {
            return iVarF;
        }
        for (p178r8.g gVar2 : f54006e) {
            if (gVar2.a() == r8.g.a.CONFLICTS_ONLY) {
                int i10 = r8.l.h.f54017a[gVar2.b(interfaceC1420a, interfaceC1420a2, interfaceC1424e).ordinal()];
                if (i10 == 1) {
                    throw new java.lang.IllegalStateException("Contract violation in " + gVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i10 == 2) {
                    r8.l.i iVarB2 = r8.l.i.b("External condition failed");
                    if (iVarB2 == null) {
                        a(27);
                    }
                    return iVarB2;
                }
                if (i10 == 3) {
                    r8.l.i iVarD2 = r8.l.i.d("External condition");
                    if (iVarD2 == null) {
                        a(28);
                    }
                    return iVarD2;
                }
            }
        }
        r8.l.i iVarE = r8.l.i.e();
        if (iVarE == null) {
            a(29);
        }
        return iVarE;
    }

    public r8.l.i F(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2, boolean z6) {
        if (interfaceC1420a == null) {
            a(30);
        }
        if (interfaceC1420a2 == null) {
            a(31);
        }
        r8.l.i iVarW = w(interfaceC1420a, interfaceC1420a2);
        if (iVarW != null) {
            return iVarW;
        }
        java.util.List listG = g(interfaceC1420a);
        java.util.List listG2 = g(interfaceC1420a2);
        java.util.List listG3 = interfaceC1420a.g();
        java.util.List listG4 = interfaceC1420a2.g();
        int i6 = 0;
        if (listG3.size() != listG4.size()) {
            while (i6 < listG.size()) {
                if (!G8.e.f3134a.b((F8.E) listG.get(i6), (F8.E) listG2.get(i6))) {
                    r8.l.i iVarD = r8.l.i.d("Type parameter number mismatch");
                    if (iVarD == null) {
                        a(33);
                    }
                    return iVarD;
                }
                i6++;
            }
            r8.l.i iVarB = r8.l.i.b("Type parameter number mismatch");
            if (iVarB == null) {
                a(34);
            }
            return iVarB;
        }
        F8.d0 d0VarL = l(listG3, listG4);
        for (int i10 = 0; i10 < listG3.size(); i10++) {
            if (!c((O7.f0) listG3.get(i10), (O7.f0) listG4.get(i10), d0VarL)) {
                r8.l.i iVarD2 = r8.l.i.d("Type parameter bounds mismatch");
                if (iVarD2 == null) {
                    a(35);
                }
                return iVarD2;
            }
        }
        while (i6 < listG.size()) {
            if (!d((F8.E) listG.get(i6), (F8.E) listG2.get(i6), d0VarL)) {
                r8.l.i iVarD3 = r8.l.i.d("Value parameter type mismatch");
                if (iVarD3 == null) {
                    a(36);
                }
                return iVarD3;
            }
            i6++;
        }
        if ((interfaceC1420a instanceof O7.InterfaceC1443y) && (interfaceC1420a2 instanceof O7.InterfaceC1443y) && ((O7.InterfaceC1443y) interfaceC1420a).y() != ((O7.InterfaceC1443y) interfaceC1420a2).y()) {
            r8.l.i iVarB2 = r8.l.i.b("Incompatible suspendability");
            if (iVarB2 == null) {
                a(37);
            }
            return iVarB2;
        }
        if (z6) {
            F8.E eL = interfaceC1420a.l();
            F8.E eL2 = interfaceC1420a2.l();
            if (eL != null && eL2 != null && ((!F8.G.a(eL2) || !F8.G.a(eL)) && !F8.C0944e.f2895a.r(d0VarL, eL2.Z0(), eL.Z0()))) {
                r8.l.i iVarB3 = r8.l.i.b("Return type mismatch");
                if (iVarB3 == null) {
                    a(38);
                }
                return iVarB3;
            }
        }
        r8.l.i iVarE = r8.l.i.e();
        if (iVarE == null) {
            a(39);
        }
        return iVarE;
    }

    public void v(p138n8.f fVar, java.util.Collection collection, java.util.Collection collection2, O7.InterfaceC1424e interfaceC1424e, p178r8.k kVar) {
        if (fVar == null) {
            a(52);
        }
        if (collection == null) {
            a(53);
        }
        if (collection2 == null) {
            a(54);
        }
        if (interfaceC1424e == null) {
            a(55);
        }
        if (kVar == null) {
            a(56);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(collection);
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o((O7.InterfaceC1421b) it.next(), collection, interfaceC1424e, kVar));
        }
        k(interfaceC1424e, linkedHashSet, kVar);
    }
}
