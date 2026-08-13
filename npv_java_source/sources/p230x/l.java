package p230x;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f56527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f56528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f56529c;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f56530F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f56531G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f56532H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f56533I;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f56532H = obj;
            this.f56533I |= Integer.MIN_VALUE;
            return p230x.l.b(null, 0L, this);
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f56534F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f56535G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f56536H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f56537I;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f56536H = obj;
            this.f56537I |= Integer.MIN_VALUE;
            return p230x.l.c(null, 0L, this);
        }
    }

    static final class c extends p147o7.k implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        java.lang.Object f56538E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int f56539F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f56540G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f56541H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p247y7.O f56542I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p247y7.O f56543J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p247y7.O o6, p247y7.O o10, p127m7.e eVar) {
            super(2, eVar);
            this.f56542I = o6;
            this.f56543J = o10;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005f  */
        /* JADX WARN: Code duplicated, block: B:20:0x006c A[LOOP:2: B:16:0x005d->B:20:0x006c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:69:0x006f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:70:0x0070 A[EDGE_INSN: B:70:0x0070->B:22:0x0070 BREAK  A[LOOP:2: B:16:0x005d->B:20:0x006c], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ac -> B:35:0x00af). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x.l.c.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p251z0.InterfaceC7367c interfaceC7367c, p127m7.e eVar) {
            return ((x.l.c) x(interfaceC7367c, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            x.l.c cVar = new x.l.c(this.f56542I, this.f56543J, eVar);
            cVar.f56541H = obj;
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final x.l.d f56544D = new x.l.d();

        d() {
            super(1);
        }

        public final void a(long j6) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((p131n0.g) obj).v());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class e extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final x.l.e f56545D = new x.l.e();

        e() {
            super(0);
        }

        public final void a() {
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class f extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final x.l.f f56546D = new x.l.f();

        f() {
            super(0);
        }

        public final void a() {
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f56547D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p237x7.l lVar) {
            super(3);
            this.f56547D = lVar;
        }

        public final void a(p251z0.B b6, p251z0.B b10, long j6) {
            this.f56547D.l(p131n0.g.d(b10.h()));
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            a((p251z0.B) obj, (p251z0.B) obj2, ((p131n0.g) obj3).v());
            return p087i7.M.f46721a;
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.a f56548D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(p237x7.a aVar) {
            super(1);
            this.f56548D = aVar;
        }

        public final void a(p251z0.B b6) {
            this.f56548D.b();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p251z0.B) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final x.l.i f56549D = new x.l.i();

        i() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.TRUE;
        }
    }

    static final class j extends p147o7.k implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        java.lang.Object f56550E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f56551F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f56552G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f56553H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f56554I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        java.lang.Object f56555J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        boolean f56556K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        float f56557L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        int f56558M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f56559N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ p237x7.a f56560O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        final /* synthetic */ p247y7.N f56561P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        final /* synthetic */ p230x.s f56562Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        final /* synthetic */ p237x7.q f56563R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ p237x7.p f56564S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ p237x7.a f56565T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        final /* synthetic */ p237x7.l f56566U;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(p237x7.a aVar, p247y7.N n6, p230x.s sVar, p237x7.q qVar, p237x7.p pVar, p237x7.a aVar2, p237x7.l lVar, p127m7.e eVar) {
            super(2, eVar);
            this.f56560O = aVar;
            this.f56561P = n6;
            this.f56562Q = sVar;
            this.f56563R = qVar;
            this.f56564S = pVar;
            this.f56565T = aVar2;
            this.f56566U = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:149:0x0181 A[EDGE_INSN: B:149:0x0181->B:43:0x0181 BREAK  A[LOOP:2: B:37:0x015c->B:41:0x0175], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:38:0x015e  */
        /* JADX WARN: Code duplicated, block: B:41:0x0175 A[LOOP:2: B:37:0x015c->B:41:0x0175, LOOP_END] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12, types: [x7.p] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13, types: [z0.B] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v31 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, z0.B] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r3v2, types: [x7.q] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x011f -> B:78:0x0212). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0207 -> B:75:0x020a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0279 -> B:92:0x027c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 829
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x.l.j.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p251z0.InterfaceC7367c interfaceC7367c, p127m7.e eVar) {
            return ((x.l.j) x(interfaceC7367c, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            x.l.j jVar = new x.l.j(this.f56560O, this.f56561P, this.f56562Q, this.f56563R, this.f56564S, this.f56565T, this.f56566U, eVar);
            jVar.f56559N = obj;
            return jVar;
        }
    }

    static final class k extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f56567F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f56568G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f56569H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f56570I;

        k(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f56569H = obj;
            this.f56570I |= Integer.MIN_VALUE;
            return p230x.l.g(null, 0L, null, this);
        }
    }

    static {
        float fQ = Y0.i.q((float) 0.125d);
        f56527a = fQ;
        float fQ2 = Y0.i.q(18);
        f56528b = fQ2;
        f56529c = fQ / fQ2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e A[LOOP:0: B:23:0x0078->B:27:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0092 A[EDGE_INSN: B:54:0x0092->B:29:0x0092 BREAK  A[LOOP:0: B:23:0x0078->B:27:0x008e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(p251z0.InterfaceC7367c r17, long r18, p127m7.e r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p230x.l.b(z0.c, long, m7.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object c(p251z0.InterfaceC7367c interfaceC7367c, long j6, p127m7.e eVar) {
        x.l.b bVar;
        java.lang.Object obj;
        p251z0.B b6;
        p247y7.O o6;
        if (eVar instanceof x.l.b) {
            bVar = (x.l.b) eVar;
            int i6 = bVar.f56537I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f56537I = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new x.l.b(eVar);
            }
        } else {
            bVar = new x.l.b(eVar);
        }
        java.lang.Object obj2 = bVar.f56536H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = bVar.f56537I;
        if (i10 == 0) {
            p087i7.x.b(obj2);
            if (h(interfaceC7367c.L(), j6)) {
                return null;
            }
            java.util.List listC = interfaceC7367c.L().c();
            int size = listC.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    obj = null;
                    break;
                }
                obj = listC.get(i11);
                if (p251z0.A.d(((p251z0.B) obj).f(), j6)) {
                    break;
                }
                i11++;
            }
            b6 = (p251z0.B) obj;
            if (b6 == null) {
                return null;
            }
            p247y7.O o10 = new p247y7.O();
            p247y7.O o11 = new p247y7.O();
            o11.f57254C = b6;
            long jC = interfaceC7367c.getViewConfiguration().c();
            try {
                p237x7.p cVar = new x.l.c(o11, o10, null);
                bVar.f56534F = b6;
                bVar.f56535G = o10;
                bVar.f56537I = 1;
                if (interfaceC7367c.G0(jC, cVar, bVar) == objG) {
                    return objG;
                }
                return null;
            } catch (p251z0.C7382s unused) {
                o6 = o10;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o6 = (p247y7.O) bVar.f56535G;
            b6 = (p251z0.B) bVar.f56534F;
            try {
                p087i7.x.b(obj2);
                return null;
            } catch (p251z0.C7382s unused2) {
            }
        }
        p251z0.B b10 = (p251z0.B) o6.f57254C;
        return b10 == null ? b6 : b10;
    }

    public static final java.lang.Object d(p251z0.K k6, p237x7.l lVar, p237x7.a aVar, p237x7.a aVar2, p237x7.p pVar, p127m7.e eVar) {
        java.lang.Object objE = e(k6, new x.l.g(lVar), new x.l.h(aVar), aVar2, x.l.i.f56549D, null, pVar, eVar);
        return objE == p137n7.b.g() ? objE : p087i7.M.f46721a;
    }

    public static final java.lang.Object e(p251z0.K k6, p237x7.q qVar, p237x7.l lVar, p237x7.a aVar, p237x7.a aVar2, p230x.s sVar, p237x7.p pVar, p127m7.e eVar) {
        java.lang.Object objC = p230x.q.c(k6, new x.l.j(aVar2, new p247y7.N(), sVar, qVar, pVar, aVar, lVar, null), eVar);
        return objC == p137n7.b.g() ? objC : p087i7.M.f46721a;
    }

    public static /* synthetic */ java.lang.Object f(p251z0.K k6, p237x7.l lVar, p237x7.a aVar, p237x7.a aVar2, p237x7.p pVar, p127m7.e eVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            lVar = x.l.d.f56544D;
        }
        p237x7.l lVar2 = lVar;
        if ((i6 & 2) != 0) {
            aVar = x.l.e.f56545D;
        }
        p237x7.a aVar3 = aVar;
        if ((i6 & 4) != 0) {
            aVar2 = x.l.f.f56546D;
        }
        return d(k6, lVar2, aVar3, aVar2, pVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(p251z0.InterfaceC7367c r4, long r5, p237x7.l r7, p127m7.e r8) {
        /*
            boolean r0 = r8 instanceof x.l.k
            if (r0 == 0) goto L13
            r0 = r8
            x.l$k r0 = (x.l.k) r0
            int r1 = r0.f56570I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56570I = r1
            goto L18
        L13:
            x.l$k r0 = new x.l$k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f56569H
            java.lang.Object r1 = p137n7.b.g()
            int r2 = r0.f56570I
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f56568G
            x7.l r4 = (p237x7.l) r4
            java.lang.Object r5 = r0.f56567F
            z0.c r5 = (p251z0.InterfaceC7367c) r5
            p087i7.x.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            p087i7.x.b(r8)
        L3e:
            r0.f56567F = r4
            r0.f56568G = r7
            r0.f56570I = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            z0.B r8 = (p251z0.B) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = p147o7.b.a(r4)
            return r4
        L55:
            boolean r5 = p251z0.AbstractC7381q.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = p147o7.b.a(r3)
            return r4
        L60:
            r7.l(r8)
            long r5 = r8.f()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: p230x.l.g(z0.c, long, x7.l, m7.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(p251z0.C7380p c7380p, long j6) {
        java.lang.Object obj;
        java.util.List listC = c7380p.c();
        int size = listC.size();
        boolean z6 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = listC.get(i6);
            if (p251z0.A.d(((p251z0.B) obj).f(), j6)) {
                break;
            }
            i6++;
        }
        p251z0.B b6 = (p251z0.B) obj;
        if (b6 != null && b6.i()) {
            z6 = true;
        }
        return true ^ z6;
    }

    public static final float i(androidx.compose.ui.platform.A1 a6, int i6) {
        boolean zG = p251z0.P.g(i6, p251z0.P.f57513a.b());
        float fG = a6.g();
        return zG ? fG * f56529c : fG;
    }
}
