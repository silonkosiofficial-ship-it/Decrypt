package R7;

/* JADX INFO: loaded from: classes2.dex */
public class C extends R7.N implements O7.U {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final O7.D f9513K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private O7.AbstractC1439u f9514L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private java.util.Collection f9515M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final O7.U f9516N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final O7.InterfaceC1421b.a f9517O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final boolean f9518P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final boolean f9519Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final boolean f9520R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final boolean f9521S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final boolean f9522T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final boolean f9523U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private java.util.List f9524V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private O7.X f9525W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private O7.X f9526X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private java.util.List f9527Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private R7.D f9528Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private O7.W f9529a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f9530b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private O7.InterfaceC1441w f9531c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private O7.InterfaceC1441w f9532d0;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private O7.InterfaceC1432m f9533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private O7.D f9534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private O7.AbstractC1439u f9535c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private O7.InterfaceC1421b.a f9538f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private O7.X f9541i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private p138n8.f f9543k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private F8.E f9544l;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private O7.U f9536d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f9537e = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private F8.l0 f9539g = F8.l0.f2948b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f9540h = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private java.util.List f9542j = null;

        public a() {
            this.f9533a = R7.C.this.b();
            this.f9534b = R7.C.this.q();
            this.f9535c = R7.C.this.h();
            this.f9538f = R7.C.this.j();
            this.f9541i = R7.C.this.f9525W;
            this.f9543k = R7.C.this.getName();
            this.f9544l = R7.C.this.getType();
        }

        private static /* synthetic */ void a(int i6) {
            java.lang.String str = (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 5 || i6 == 7 || i6 == 9 || i6 == 11 || i6 == 19 || i6 == 13 || i6 == 14 || i6 == 16 || i6 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i6 == 1 || i6 == 2 || i6 == 3 || i6 == 5 || i6 == 7 || i6 == 9 || i6 == 11 || i6 == 19 || i6 == 13 || i6 == 14 || i6 == 16 || i6 == 17) ? 2 : 3];
            switch (i6) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i6 == 1) {
                objArr[1] = "setOwner";
            } else if (i6 == 2) {
                objArr[1] = "setOriginal";
            } else if (i6 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i6 == 5) {
                objArr[1] = "setReturnType";
            } else if (i6 == 7) {
                objArr[1] = "setModality";
            } else if (i6 == 9) {
                objArr[1] = "setVisibility";
            } else if (i6 == 11) {
                objArr[1] = "setKind";
            } else if (i6 == 19) {
                objArr[1] = "setName";
            } else if (i6 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i6 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i6 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i6 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i6) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 5 && i6 != 7 && i6 != 9 && i6 != 11 && i6 != 19 && i6 != 13 && i6 != 14 && i6 != 16 && i6 != 17) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        public O7.U n() {
            return R7.C.this.Z0(this);
        }

        O7.V o() {
            O7.U u6 = this.f9536d;
            if (u6 == null) {
                return null;
            }
            return u6.d();
        }

        O7.W p() {
            O7.U u6 = this.f9536d;
            if (u6 == null) {
                return null;
            }
            return u6.i();
        }

        public R7.C.a q(boolean z6) {
            this.f9540h = z6;
            return this;
        }

        public R7.C.a r(O7.InterfaceC1421b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f9538f = aVar;
            return this;
        }

        public R7.C.a s(O7.D d6) {
            if (d6 == null) {
                a(6);
            }
            this.f9534b = d6;
            return this;
        }

        public R7.C.a t(O7.InterfaceC1421b interfaceC1421b) {
            this.f9536d = (O7.U) interfaceC1421b;
            return this;
        }

        public R7.C.a u(O7.InterfaceC1432m interfaceC1432m) {
            if (interfaceC1432m == null) {
                a(0);
            }
            this.f9533a = interfaceC1432m;
            return this;
        }

        public R7.C.a v(F8.l0 l0Var) {
            if (l0Var == null) {
                a(15);
            }
            this.f9539g = l0Var;
            return this;
        }

        public R7.C.a w(O7.AbstractC1439u abstractC1439u) {
            if (abstractC1439u == null) {
                a(8);
            }
            this.f9535c = abstractC1439u;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C(O7.InterfaceC1432m interfaceC1432m, O7.U u6, P7.g gVar, O7.D d6, O7.AbstractC1439u abstractC1439u, boolean z6, p138n8.f fVar, O7.InterfaceC1421b.a aVar, O7.a0 a0Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        super(interfaceC1432m, gVar, fVar, null, z6, a0Var);
        if (interfaceC1432m == null) {
            M(0);
        }
        if (gVar == null) {
            M(1);
        }
        if (d6 == null) {
            M(2);
        }
        if (abstractC1439u == null) {
            M(3);
        }
        if (fVar == null) {
            M(4);
        }
        if (aVar == null) {
            M(5);
        }
        if (a0Var == null) {
            M(6);
        }
        this.f9515M = null;
        this.f9524V = java.util.Collections.emptyList();
        this.f9513K = d6;
        this.f9514L = abstractC1439u;
        this.f9516N = u6 == null ? this : u6;
        this.f9517O = aVar;
        this.f9518P = z10;
        this.f9519Q = z11;
        this.f9520R = z12;
        this.f9521S = z13;
        this.f9522T = z14;
        this.f9523U = z15;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    private static /* synthetic */ void M(int i6) {
        java.lang.String str;
        int i10;
        if (i6 != 28 && i6 != 38 && i6 != 39 && i6 != 41 && i6 != 42) {
            switch (i6) {
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 28 && i6 != 38 && i6 != 39 && i6 != 41 && i6 != 42) {
            switch (i6) {
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    i10 = 2;
                    break;
                default:
                    i10 = 3;
                    break;
            }
        } else {
            i10 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i6 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i6 == 38) {
            objArr[1] = "getOriginal";
        } else if (i6 == 39) {
            objArr[1] = "getKind";
        } else if (i6 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i6 != 42) {
            switch (i6) {
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i6) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 28 && i6 != 38 && i6 != 39 && i6 != 41 && i6 != 42) {
            switch (i6) {
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static R7.C X0(O7.InterfaceC1432m interfaceC1432m, P7.g gVar, O7.D d6, O7.AbstractC1439u abstractC1439u, boolean z6, p138n8.f fVar, O7.InterfaceC1421b.a aVar, O7.a0 a0Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        if (interfaceC1432m == null) {
            M(7);
        }
        if (gVar == null) {
            M(8);
        }
        if (d6 == null) {
            M(9);
        }
        if (abstractC1439u == null) {
            M(10);
        }
        if (fVar == null) {
            M(11);
        }
        if (aVar == null) {
            M(12);
        }
        if (a0Var == null) {
            M(13);
        }
        return new R7.C(interfaceC1432m, null, gVar, d6, abstractC1439u, z6, fVar, aVar, a0Var, z10, z11, z12, z13, z14, z15);
    }

    private O7.a0 b1(boolean z6, O7.U u6) {
        O7.a0 a0VarO;
        if (z6) {
            if (u6 == null) {
                u6 = a();
            }
            a0VarO = u6.o();
        } else {
            a0VarO = O7.a0.f8143a;
        }
        if (a0VarO == null) {
            M(28);
        }
        return a0VarO;
    }

    private static O7.InterfaceC1443y c1(F8.n0 n0Var, O7.T t6) {
        if (n0Var == null) {
            M(30);
        }
        if (t6 == null) {
            M(31);
        }
        if (t6.l0() != null) {
            return t6.l0().c(n0Var);
        }
        return null;
    }

    private static O7.AbstractC1439u h1(O7.AbstractC1439u abstractC1439u, O7.InterfaceC1421b.a aVar) {
        return (aVar == O7.InterfaceC1421b.a.FAKE_OVERRIDE && O7.AbstractC1438t.g(abstractC1439u.f())) ? O7.AbstractC1438t.f8189h : abstractC1439u;
    }

    private static O7.X m1(F8.n0 n0Var, O7.U u6, O7.X x6) {
        F8.E eP = n0Var.p(x6.getType(), F8.u0.IN_VARIANCE);
        if (eP == null) {
            return null;
        }
        return new R7.F(u6, new p257z8.c(u6, eP, ((p257z8.f) x6.getValue()).a(), x6.getValue()), x6.k());
    }

    private static O7.X n1(F8.n0 n0Var, O7.U u6, O7.X x6) {
        F8.E eP = n0Var.p(x6.getType(), F8.u0.IN_VARIANCE);
        if (eP == null) {
            return null;
        }
        return new R7.F(u6, new p257z8.d(u6, eP, x6.getValue()), x6.k());
    }

    @Override // O7.InterfaceC1420a
    public java.util.List A0() {
        java.util.List list = this.f9524V;
        if (list == null) {
            M(22);
        }
        return list;
    }

    @Override // O7.U
    public java.util.List B() {
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        R7.D d6 = this.f9528Z;
        if (d6 != null) {
            arrayList.add(d6);
        }
        O7.W w6 = this.f9529a0;
        if (w6 != null) {
            arrayList.add(w6);
        }
        return arrayList;
    }

    @Override // O7.k0
    public boolean B0() {
        return this.f9518P;
    }

    public boolean C() {
        return this.f9522T;
    }

    @Override // O7.InterfaceC1420a
    public java.lang.Object D(O7.InterfaceC1420a.InterfaceC0196a interfaceC0196a) {
        return null;
    }

    @Override // O7.k0
    public boolean F() {
        return this.f9519Q;
    }

    @Override // O7.InterfaceC1421b
    public void G0(java.util.Collection collection) {
        if (collection == null) {
            M(40);
        }
        this.f9515M = collection;
    }

    @Override // O7.C
    public boolean N0() {
        return this.f9521S;
    }

    @Override // O7.C
    public boolean R() {
        return this.f9520R;
    }

    @Override // O7.l0
    public boolean T() {
        return this.f9523U;
    }

    @Override // O7.InterfaceC1421b
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public O7.U i0(O7.InterfaceC1432m interfaceC1432m, O7.D d6, O7.AbstractC1439u abstractC1439u, O7.InterfaceC1421b.a aVar, boolean z6) {
        O7.U uN = g1().u(interfaceC1432m).t(null).s(d6).w(abstractC1439u).r(aVar).q(z6).n();
        if (uN == null) {
            M(42);
        }
        return uN;
    }

    protected R7.C Y0(O7.InterfaceC1432m interfaceC1432m, O7.D d6, O7.AbstractC1439u abstractC1439u, O7.U u6, O7.InterfaceC1421b.a aVar, p138n8.f fVar, O7.a0 a0Var) {
        if (interfaceC1432m == null) {
            M(32);
        }
        if (d6 == null) {
            M(33);
        }
        if (abstractC1439u == null) {
            M(34);
        }
        if (aVar == null) {
            M(35);
        }
        if (fVar == null) {
            M(36);
        }
        if (a0Var == null) {
            M(37);
        }
        return new R7.C(interfaceC1432m, u6, k(), d6, abstractC1439u, t0(), fVar, aVar, a0Var, B0(), F(), R(), N0(), C(), T());
    }

    protected O7.U Z0(R7.C.a aVar) {
        O7.X x6;
        p237x7.a aVar2;
        if (aVar == null) {
            M(29);
        }
        R7.C cY0 = Y0(aVar.f9533a, aVar.f9534b, aVar.f9535c, aVar.f9536d, aVar.f9538f, aVar.f9543k, b1(aVar.f9537e, aVar.f9536d));
        java.util.List listG = aVar.f9542j == null ? g() : aVar.f9542j;
        java.util.ArrayList arrayList = new java.util.ArrayList(listG.size());
        F8.n0 n0VarB = F8.AbstractC0957s.b(listG, aVar.f9539g, cY0, arrayList);
        F8.E e6 = aVar.f9544l;
        F8.E eP = n0VarB.p(e6, F8.u0.OUT_VARIANCE);
        if (eP == null) {
            return null;
        }
        F8.E eP2 = n0VarB.p(e6, F8.u0.IN_VARIANCE);
        if (eP2 != null) {
            cY0.i1(eP2);
        }
        O7.X x10 = aVar.f9541i;
        if (x10 != null) {
            O7.X xC = x10.c(n0VarB);
            if (xC == null) {
                return null;
            }
            x6 = xC;
        } else {
            x6 = null;
        }
        O7.X x11 = this.f9526X;
        O7.X xN1 = x11 != null ? n1(n0VarB, cY0, x11) : null;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = this.f9524V.iterator();
        while (it.hasNext()) {
            O7.X xM1 = m1(n0VarB, cY0, (O7.X) it.next());
            if (xM1 != null) {
                arrayList2.add(xM1);
            }
        }
        cY0.k1(eP, arrayList, x6, xN1, arrayList2);
        R7.D d6 = this.f9528Z == null ? null : new R7.D(cY0, this.f9528Z.k(), aVar.f9534b, h1(this.f9528Z.h(), aVar.f9538f), this.f9528Z.b0(), this.f9528Z.C(), this.f9528Z.m(), aVar.f9538f, aVar.o(), O7.a0.f8143a);
        if (d6 != null) {
            F8.E eL = this.f9528Z.l();
            d6.V0(c1(n0VarB, this.f9528Z));
            d6.Y0(eL != null ? n0VarB.p(eL, F8.u0.OUT_VARIANCE) : null);
        }
        R7.E e10 = this.f9529a0 == null ? null : new R7.E(cY0, this.f9529a0.k(), aVar.f9534b, h1(this.f9529a0.h(), aVar.f9538f), this.f9529a0.b0(), this.f9529a0.C(), this.f9529a0.m(), aVar.f9538f, aVar.p(), O7.a0.f8143a);
        if (e10 != null) {
            java.util.List listY0 = R7.p.Y0(e10, this.f9529a0.n(), n0VarB, false, false, null);
            if (listY0 == null) {
                cY0.j1(true);
                listY0 = java.util.Collections.singletonList(R7.E.X0(e10, p218v8.c.j(aVar.f9533a).H(), ((O7.j0) this.f9529a0.n().get(0)).k()));
            }
            if (listY0.size() != 1) {
                throw new java.lang.IllegalStateException();
            }
            e10.V0(c1(n0VarB, this.f9529a0));
            e10.Z0((O7.j0) listY0.get(0));
        }
        O7.InterfaceC1441w interfaceC1441w = this.f9531c0;
        R7.o oVar = interfaceC1441w == null ? null : new R7.o(interfaceC1441w.k(), cY0);
        O7.InterfaceC1441w interfaceC1441w2 = this.f9532d0;
        cY0.e1(d6, e10, oVar, interfaceC1441w2 != null ? new R7.o(interfaceC1441w2.k(), cY0) : null);
        if (aVar.f9540h) {
            P8.g gVarD = P8.g.d();
            java.util.Iterator it2 = f().iterator();
            while (it2.hasNext()) {
                gVarD.add(((O7.U) it2.next()).c(n0VarB));
            }
            cY0.G0(gVarD);
        }
        if (F() && (aVar2 = this.f9577J) != null) {
            cY0.T0(this.f9576I, aVar2);
        }
        return cY0;
    }

    @Override // R7.AbstractC1505k, R7.AbstractC1504j, O7.InterfaceC1432m
    public O7.U a() {
        O7.U u6 = this.f9516N;
        O7.U uA = u6 == this ? this : u6.a();
        if (uA == null) {
            M(38);
        }
        return uA;
    }

    @Override // O7.U
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public R7.D d() {
        return this.f9528Z;
    }

    @Override // O7.c0
    public O7.U c(F8.n0 n0Var) {
        if (n0Var == null) {
            M(27);
        }
        return n0Var.k() ? this : g1().v(n0Var.j()).t(a()).n();
    }

    public void d1(R7.D d6, O7.W w6) {
        e1(d6, w6, null, null);
    }

    public void e1(R7.D d6, O7.W w6, O7.InterfaceC1441w interfaceC1441w, O7.InterfaceC1441w interfaceC1441w2) {
        this.f9528Z = d6;
        this.f9529a0 = w6;
        this.f9531c0 = interfaceC1441w;
        this.f9532d0 = interfaceC1441w2;
    }

    @Override // O7.InterfaceC1420a
    public java.util.Collection f() {
        java.util.Collection collectionEmptyList = this.f9515M;
        if (collectionEmptyList == null) {
            collectionEmptyList = java.util.Collections.emptyList();
        }
        if (collectionEmptyList == null) {
            M(41);
        }
        return collectionEmptyList;
    }

    public boolean f1() {
        return this.f9530b0;
    }

    @Override // R7.M, O7.InterfaceC1420a
    public java.util.List g() {
        java.util.List list = this.f9527Y;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("typeParameters == null for " + this);
    }

    public R7.C.a g1() {
        return new R7.C.a();
    }

    @Override // O7.InterfaceC1436q, O7.C
    public O7.AbstractC1439u h() {
        O7.AbstractC1439u abstractC1439u = this.f9514L;
        if (abstractC1439u == null) {
            M(25);
        }
        return abstractC1439u;
    }

    @Override // O7.U
    public O7.W i() {
        return this.f9529a0;
    }

    public void i1(F8.E e6) {
        if (e6 == null) {
            M(14);
        }
    }

    @Override // O7.InterfaceC1421b
    public O7.InterfaceC1421b.a j() {
        O7.InterfaceC1421b.a aVar = this.f9517O;
        if (aVar == null) {
            M(39);
        }
        return aVar;
    }

    public void j1(boolean z6) {
        this.f9530b0 = z6;
    }

    public void k1(F8.E e6, java.util.List list, O7.X x6, O7.X x10, java.util.List list2) {
        if (e6 == null) {
            M(17);
        }
        if (list == null) {
            M(18);
        }
        if (list2 == null) {
            M(19);
        }
        O0(e6);
        this.f9527Y = new java.util.ArrayList(list);
        this.f9526X = x10;
        this.f9525W = x6;
        this.f9524V = list2;
    }

    @Override // R7.M, O7.InterfaceC1420a
    public F8.E l() {
        F8.E type = getType();
        if (type == null) {
            M(23);
        }
        return type;
    }

    public void l1(O7.AbstractC1439u abstractC1439u) {
        if (abstractC1439u == null) {
            M(20);
        }
        this.f9514L = abstractC1439u;
    }

    @Override // R7.M, O7.InterfaceC1420a
    public O7.X m0() {
        return this.f9525W;
    }

    @Override // O7.C
    public O7.D q() {
        O7.D d6 = this.f9513K;
        if (d6 == null) {
            M(24);
        }
        return d6;
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        return interfaceC1434o.h(this, obj);
    }

    @Override // R7.M, O7.InterfaceC1420a
    public O7.X v0() {
        return this.f9526X;
    }

    @Override // O7.U
    public O7.InterfaceC1441w w0() {
        return this.f9532d0;
    }

    @Override // O7.U
    public O7.InterfaceC1441w z0() {
        return this.f9531c0;
    }
}
