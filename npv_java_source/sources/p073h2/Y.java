package p073h2;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.r f46065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W8.InterfaceC1813v f46066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p059f9.a f46067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W8.InterfaceC1813v[] f46068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Object[] f46069e;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f46070F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46071G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f46072H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f46073I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46074J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f46076L;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f46074J = obj;
            this.f46076L |= Integer.MIN_VALUE;
            return p073h2.Y.this.a(0, null, this);
        }
    }

    public Y(p237x7.r rVar) {
        p247y7.AbstractC7350t.f(rVar, "send");
        this.f46065a = rVar;
        this.f46066b = W8.AbstractC1817x.b(null, 1, null);
        this.f46067c = p059f9.g.b(false, 1, null);
        W8.InterfaceC1813v[] interfaceC1813vArr = new W8.InterfaceC1813v[2];
        for (int i6 = 0; i6 < 2; i6++) {
            interfaceC1813vArr[i6] = W8.AbstractC1817x.b(null, 1, null);
        }
        this.f46068d = interfaceC1813vArr;
        java.lang.Object[] objArr = new java.lang.Object[2];
        for (int i10 = 0; i10 < 2; i10++) {
            objArr[i10] = p073h2.AbstractC6634k.f46174a;
        }
        this.f46069e = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b2 A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:34:0x00ab, B:36:0x00b2, B:43:0x00c2, B:45:0x00ca, B:48:0x00d4, B:50:0x00d8, B:54:0x00e2, B:52:0x00dd, B:53:0x00e0, B:39:0x00bc), top: B:66:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc A[Catch: all -> 0x00be, LOOP:0: B:35:0x00b0->B:39:0x00bc, LOOP_END, TryCatch #1 {all -> 0x00be, blocks: (B:34:0x00ab, B:36:0x00b2, B:43:0x00c2, B:45:0x00ca, B:48:0x00d4, B:50:0x00d8, B:54:0x00e2, B:52:0x00dd, B:53:0x00e0, B:39:0x00bc), top: B:66:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:34:0x00ab, B:36:0x00b2, B:43:0x00c2, B:45:0x00ca, B:48:0x00d4, B:50:0x00d8, B:54:0x00e2, B:52:0x00dd, B:53:0x00e0, B:39:0x00bc), top: B:66:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4 A[Catch: all -> 0x00be, LOOP:1: B:44:0x00c8->B:48:0x00d4, LOOP_END, TryCatch #1 {all -> 0x00be, blocks: (B:34:0x00ab, B:36:0x00b2, B:43:0x00c2, B:45:0x00ca, B:48:0x00d4, B:50:0x00d8, B:54:0x00e2, B:52:0x00dd, B:53:0x00e0, B:39:0x00bc), top: B:66:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8 A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:34:0x00ab, B:36:0x00b2, B:43:0x00c2, B:45:0x00ca, B:48:0x00d4, B:50:0x00d8, B:54:0x00e2, B:52:0x00dd, B:53:0x00e0, B:39:0x00bc), top: B:66:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:34:0x00ab, B:36:0x00b2, B:43:0x00c2, B:45:0x00ca, B:48:0x00d4, B:50:0x00d8, B:54:0x00e2, B:52:0x00dd, B:53:0x00e0, B:39:0x00bc), top: B:66:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0 A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:34:0x00ab, B:36:0x00b2, B:43:0x00c2, B:45:0x00ca, B:48:0x00d4, B:50:0x00d8, B:54:0x00e2, B:52:0x00dd, B:53:0x00e0, B:39:0x00bc), top: B:66:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final java.lang.Object a(int i6, java.lang.Object obj, p127m7.e eVar) throws java.lang.Throwable {
        h2.Y.a aVar;
        java.lang.Object obj2;
        p073h2.Y y6;
        java.lang.Object obj3;
        p059f9.a aVar2;
        int i10;
        p073h2.Y y10;
        p059f9.a aVar3;
        java.lang.Object[] objArr;
        int length;
        int i11;
        boolean z6;
        java.lang.Object[] objArr2;
        int length2;
        int i12;
        p073h2.EnumC6629f enumC6629f;
        p237x7.r rVar;
        java.lang.Object obj4;
        java.lang.Object obj5;
        int i13 = i6;
        if (eVar instanceof h2.Y.a) {
            aVar = (h2.Y.a) eVar;
            int i14 = aVar.f46076L;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f46076L = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new h2.Y.a(eVar);
            }
        } else {
            aVar = new h2.Y.a(eVar);
        }
        java.lang.Object obj6 = aVar.f46074J;
        java.lang.Object objG = p137n7.b.g();
        int i15 = aVar.f46076L;
        if (i15 == 0) {
            p087i7.x.b(obj6);
            if (this.f46068d[i13].f1()) {
                W8.InterfaceC1813v interfaceC1813v = this.f46066b;
                aVar.f46070F = this;
                obj2 = obj;
                aVar.f46071G = obj2;
                aVar.f46073I = i13;
                aVar.f46076L = 1;
                if (interfaceC1813v.d1(aVar) == objG) {
                    return objG;
                }
            } else {
                obj2 = obj;
                this.f46068d[i13].R0(p087i7.M.f46721a);
            }
            y6 = this;
        } else {
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (p059f9.a) aVar.f46071G;
                    y10 = (p073h2.Y) aVar.f46070F;
                    try {
                        p087i7.x.b(obj6);
                        y10.f46066b.R0(p087i7.M.f46721a);
                        p087i7.M m6 = p087i7.M.f46721a;
                        aVar3.d(null);
                        return p087i7.M.f46721a;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        aVar3.d(null);
                        throw th;
                    }
                }
                i13 = aVar.f46073I;
                aVar2 = (p059f9.a) aVar.f46072H;
                obj3 = aVar.f46071G;
                y6 = (p073h2.Y) aVar.f46070F;
                p087i7.x.b(obj6);
                i10 = i13;
                y10 = y6;
                try {
                    objArr = y10.f46069e;
                    length = objArr.length;
                    i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            z6 = false;
                            break;
                        }
                        if (objArr[i11] == p073h2.AbstractC6634k.f46174a) {
                            z6 = true;
                            break;
                        }
                        i11++;
                    }
                    objArr2 = y10.f46069e;
                    objArr2[i10] = obj3;
                    length2 = objArr2.length;
                    i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            if (z6) {
                                enumC6629f = p073h2.EnumC6629f.INITIAL;
                            } else if (i10 == 0) {
                                enumC6629f = p073h2.EnumC6629f.RECEIVER;
                            } else {
                                enumC6629f = p073h2.EnumC6629f.OTHER;
                            }
                            rVar = y10.f46065a;
                            java.lang.Object[] objArr3 = y10.f46069e;
                            obj4 = objArr3[0];
                            obj5 = objArr3[1];
                            aVar.f46070F = y10;
                            aVar.f46071G = aVar2;
                            aVar.f46072H = null;
                            aVar.f46076L = 3;
                            if (rVar.o(obj4, obj5, enumC6629f, aVar) == objG) {
                                aVar3 = aVar2;
                                y10.f46066b.R0(p087i7.M.f46721a);
                                break;
                            }
                            return objG;
                        }
                        if (objArr2[i12] == p073h2.AbstractC6634k.f46174a) {
                            aVar3 = aVar2;
                            break;
                        }
                        i12++;
                    }
                    p087i7.M m10 = p087i7.M.f46721a;
                    aVar3.d(null);
                    return p087i7.M.f46721a;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    aVar3 = aVar2;
                    aVar3.d(null);
                    throw th;
                }
            }
            i13 = aVar.f46073I;
            obj2 = aVar.f46071G;
            y6 = (p073h2.Y) aVar.f46070F;
            p087i7.x.b(obj6);
        }
        p059f9.a aVar4 = y6.f46067c;
        aVar.f46070F = y6;
        aVar.f46071G = obj2;
        aVar.f46072H = aVar4;
        aVar.f46073I = i13;
        aVar.f46076L = 2;
        if (aVar4.c(null, aVar) == objG) {
            return objG;
        }
        obj3 = obj2;
        aVar2 = aVar4;
        i10 = i13;
        y10 = y6;
        objArr = y10.f46069e;
        length = objArr.length;
        i11 = 0;
        while (true) {
            if (i11 < length) {
                z6 = false;
                break;
            }
            if (objArr[i11] == p073h2.AbstractC6634k.f46174a) {
                z6 = true;
                break;
            }
            i11++;
        }
        objArr2 = y10.f46069e;
        objArr2[i10] = obj3;
        length2 = objArr2.length;
        i12 = 0;
        while (true) {
            if (i12 < length2) {
                if (z6) {
                    enumC6629f = p073h2.EnumC6629f.INITIAL;
                } else if (i10 == 0) {
                    enumC6629f = p073h2.EnumC6629f.RECEIVER;
                } else {
                    enumC6629f = p073h2.EnumC6629f.OTHER;
                }
                rVar = y10.f46065a;
                java.lang.Object[] objArr4 = y10.f46069e;
                obj4 = objArr4[0];
                obj5 = objArr4[1];
                aVar.f46070F = y10;
                aVar.f46071G = aVar2;
                aVar.f46072H = null;
                aVar.f46076L = 3;
                if (rVar.o(obj4, obj5, enumC6629f, aVar) == objG) {
                    aVar3 = aVar2;
                    y10.f46066b.R0(p087i7.M.f46721a);
                    break;
                }
                return objG;
            }
            if (objArr2[i12] == p073h2.AbstractC6634k.f46174a) {
                aVar3 = aVar2;
                break;
            }
            i12++;
        }
        p087i7.M m11 = p087i7.M.f46721a;
        aVar3.d(null);
        return p087i7.M.f46721a;
    }
}
