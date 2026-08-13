package p230x;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f56576F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f56577G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f56578H;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f56577G = obj;
            this.f56578H |= Integer.MIN_VALUE;
            return p230x.q.b(null, this);
        }
    }

    static final class b extends p147o7.k implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        int f56579E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f56580F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p127m7.i f56581G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f56582H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p127m7.i iVar, p237x7.p pVar, p127m7.e eVar) {
            super(2, eVar);
            this.f56581G = iVar;
            this.f56582H = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x004f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x0050  */
        /* JADX WARN: Code duplicated, block: B:27:0x005b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, z0.c] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, z0.c] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [x7.p] */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v8 */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:12:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0070 -> B:12:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p137n7.b.g()
                int r1 = r7.f56579E
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r7.f56580F
                z0.c r1 = (p251z0.InterfaceC7367c) r1
                p087i7.x.b(r8)
                goto L28
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.f56580F
                z0.c r1 = (p251z0.InterfaceC7367c) r1
                p087i7.x.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            L28:
                r8 = r1
                goto L3b
            L2a:
                r8 = move-exception
                goto L60
            L2c:
                java.lang.Object r1 = r7.f56580F
                z0.c r1 = (p251z0.InterfaceC7367c) r1
                p087i7.x.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
                goto L51
            L34:
                p087i7.x.b(r8)
                java.lang.Object r8 = r7.f56580F
                z0.c r8 = (p251z0.InterfaceC7367c) r8
            L3b:
                m7.i r1 = r7.f56581G
                boolean r1 = W8.C0.p(r1)
                if (r1 == 0) goto L74
                x7.p r1 = r7.f56582H     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.f56580F = r8     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.f56579E = r4     // Catch: java.util.concurrent.CancellationException -> L5c
                java.lang.Object r1 = r1.u(r8, r7)     // Catch: java.util.concurrent.CancellationException -> L5c
                if (r1 != r0) goto L50
                return r0
            L50:
                r1 = r8
            L51:
                r7.f56580F = r1     // Catch: java.util.concurrent.CancellationException -> L2a
                r7.f56579E = r3     // Catch: java.util.concurrent.CancellationException -> L2a
                java.lang.Object r8 = p230x.q.b(r1, r7)     // Catch: java.util.concurrent.CancellationException -> L2a
                if (r8 != r0) goto L28
                return r0
            L5c:
                r1 = move-exception
                r6 = r1
                r1 = r8
                r8 = r6
            L60:
                m7.i r5 = r7.f56581G
                boolean r5 = W8.C0.p(r5)
                if (r5 == 0) goto L73
                r7.f56580F = r1
                r7.f56579E = r2
                java.lang.Object r8 = p230x.q.b(r1, r7)
                if (r8 != r0) goto L28
                return r0
            L73:
                throw r8
            L74:
                i7.M r8 = p087i7.M.f46721a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: x.q.b.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p251z0.InterfaceC7367c interfaceC7367c, p127m7.e eVar) {
            return ((x.q.b) x(interfaceC7367c, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            x.q.b bVar = new x.q.b(this.f56581G, this.f56582H, eVar);
            bVar.f56580F = obj;
            return bVar;
        }
    }

    public static final boolean a(p251z0.InterfaceC7367c interfaceC7367c) {
        java.util.List listC = interfaceC7367c.L().c();
        int size = listC.size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            if (((p251z0.B) listC.get(i6)).i()) {
                z6 = true;
                break;
            }
        }
        return !z6;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065 A[LOOP:0: B:20:0x0056->B:24:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x003e A[EDGE_INSN: B:28:0x003e->B:16:0x003e BREAK  A[LOOP:0: B:20:0x0056->B:24:0x0065], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(p251z0.InterfaceC7367c r6, p127m7.e r7) {
        /*
            boolean r0 = r7 instanceof x.q.a
            if (r0 == 0) goto L13
            r0 = r7
            x.q$a r0 = (x.q.a) r0
            int r1 = r0.f56578H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56578H = r1
            goto L18
        L13:
            x.q$a r0 = new x.q$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f56577G
            java.lang.Object r1 = p137n7.b.g()
            int r2 = r0.f56578H
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f56576F
            z0.c r6 = (p251z0.InterfaceC7367c) r6
            p087i7.x.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            p087i7.x.b(r7)
            boolean r7 = a(r6)
            if (r7 != 0) goto L68
        L3e:
            z0.r r7 = p251z0.r.Final
            r0.f56576F = r6
            r0.f56578H = r3
            java.lang.Object r7 = r6.X0(r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            z0.p r7 = (p251z0.C7380p) r7
            java.util.List r7 = r7.c()
            int r2 = r7.size()
            r4 = 0
        L56:
            if (r4 >= r2) goto L68
            java.lang.Object r5 = r7.get(r4)
            z0.B r5 = (p251z0.B) r5
            boolean r5 = r5.i()
            if (r5 == 0) goto L65
            goto L3e
        L65:
            int r4 = r4 + 1
            goto L56
        L68:
            i7.M r6 = p087i7.M.f46721a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p230x.q.b(z0.c, m7.e):java.lang.Object");
    }

    public static final java.lang.Object c(p251z0.K k6, p237x7.p pVar, p127m7.e eVar) {
        java.lang.Object objV = k6.V(new x.q.b(eVar.getContext(), pVar, null), eVar);
        return objV == p137n7.b.g() ? objV : p087i7.M.f46721a;
    }
}
