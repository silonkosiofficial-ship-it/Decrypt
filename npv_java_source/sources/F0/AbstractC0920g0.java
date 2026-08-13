package F0;

/* JADX INFO: renamed from: F0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0920g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p170r.H f2660a = p170r.O.b();

    public static final void a(androidx.compose.ui.d.c cVar) {
        if (!cVar.A1()) {
            C0.a.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    public static final void b(androidx.compose.ui.d.c cVar, int i6, int i10) {
        if (!(cVar instanceof F0.AbstractC0927m)) {
            c(cVar, i6 & cVar.v1(), i10);
            return;
        }
        F0.AbstractC0927m abstractC0927m = (F0.AbstractC0927m) cVar;
        c(cVar, abstractC0927m.V1() & i6, i10);
        int i11 = (~abstractC0927m.V1()) & i6;
        for (androidx.compose.ui.d.c cVarU1 = abstractC0927m.U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
            b(cVarU1, i11, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(androidx.compose.ui.d.c cVar, int i6, int i10) {
        if (i10 != 0 || cVar.y1()) {
            if ((F0.AbstractC0918f0.a(2) & i6) != 0 && (cVar instanceof F0.E)) {
                F0.H.b((F0.E) cVar);
                if (i10 == 2) {
                    F0.AbstractC0925k.h(cVar, F0.AbstractC0918f0.a(2)).I2();
                }
            }
            if ((F0.AbstractC0918f0.a(128) & i6) != 0 && (cVar instanceof F0.C) && i10 != 2) {
                F0.AbstractC0925k.m(cVar).F0();
            }
            if ((F0.AbstractC0918f0.a(256) & i6) != 0 && (cVar instanceof F0.InterfaceC0934u) && i10 != 2) {
                F0.AbstractC0925k.m(cVar).G0();
            }
            if ((F0.AbstractC0918f0.a(4) & i6) != 0 && (cVar instanceof F0.InterfaceC0932s)) {
                F0.AbstractC0933t.a((F0.InterfaceC0932s) cVar);
            }
            if ((F0.AbstractC0918f0.a(8) & i6) != 0 && (cVar instanceof F0.z0)) {
                F0.A0.b((F0.z0) cVar);
            }
            if ((F0.AbstractC0918f0.a(64) & i6) != 0 && (cVar instanceof F0.r0)) {
                F0.s0.a((F0.r0) cVar);
            }
            if ((F0.AbstractC0918f0.a(1024) & i6) != 0 && (cVar instanceof androidx.compose.ui.focus.FocusTargetNode) && i10 != 2) {
                p121m0.r.c((androidx.compose.ui.focus.FocusTargetNode) cVar);
            }
            if ((F0.AbstractC0918f0.a(2048) & i6) != 0 && (cVar instanceof p121m0.j)) {
                p121m0.j jVar = (p121m0.j) cVar;
                if (k(jVar)) {
                    if (i10 == 2) {
                        j(jVar);
                    } else {
                        p121m0.k.a(jVar);
                    }
                }
            }
            if ((i6 & F0.AbstractC0918f0.a(4096)) == 0 || !(cVar instanceof p121m0.b)) {
                return;
            }
            p121m0.c.b((p121m0.b) cVar);
        }
    }

    public static final void d(androidx.compose.ui.d.c cVar) {
        if (!cVar.A1()) {
            C0.a.b("autoInvalidateRemovedNode called on unattached node");
        }
        b(cVar, -1, 2);
    }

    public static final void e(androidx.compose.ui.d.c cVar) {
        if (!cVar.A1()) {
            C0.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int f(androidx.compose.ui.d.b bVar) {
        int iA = F0.AbstractC0918f0.a(1);
        if (bVar instanceof D0.A) {
            iA |= F0.AbstractC0918f0.a(2);
        }
        if (bVar instanceof p111l0.g) {
            iA |= F0.AbstractC0918f0.a(4);
        }
        if (bVar instanceof K0.m) {
            iA |= F0.AbstractC0918f0.a(8);
        }
        if (bVar instanceof p251z0.I) {
            iA |= F0.AbstractC0918f0.a(16);
        }
        if ((bVar instanceof E0.d) || (bVar instanceof E0.k)) {
            iA |= F0.AbstractC0918f0.a(32);
        }
        if (bVar instanceof D0.S) {
            iA |= F0.AbstractC0918f0.a(256);
        }
        return bVar instanceof D0.U ? iA | F0.AbstractC0918f0.a(64) : iA;
    }

    public static final int g(androidx.compose.ui.d.c cVar) {
        if (cVar.v1() != 0) {
            return cVar.v1();
        }
        p170r.H h6 = f2660a;
        java.lang.Object objB = p071h0.b.b(cVar);
        int iB = h6.b(objB);
        if (iB >= 0) {
            return h6.f53318c[iB];
        }
        int iA = F0.AbstractC0918f0.a(1);
        if (cVar instanceof F0.E) {
            iA |= F0.AbstractC0918f0.a(2);
        }
        if (cVar instanceof F0.InterfaceC0932s) {
            iA |= F0.AbstractC0918f0.a(4);
        }
        if (cVar instanceof F0.z0) {
            iA |= F0.AbstractC0918f0.a(8);
        }
        if (cVar instanceof F0.v0) {
            iA |= F0.AbstractC0918f0.a(16);
        }
        if (cVar instanceof E0.i) {
            iA |= F0.AbstractC0918f0.a(32);
        }
        if (cVar instanceof F0.r0) {
            iA |= F0.AbstractC0918f0.a(64);
        }
        if (cVar instanceof F0.C) {
            iA |= F0.AbstractC0918f0.a(128);
        }
        if (cVar instanceof F0.InterfaceC0934u) {
            iA |= F0.AbstractC0918f0.a(256);
        }
        if (cVar instanceof androidx.compose.ui.focus.FocusTargetNode) {
            iA |= F0.AbstractC0918f0.a(1024);
        }
        if (cVar instanceof p121m0.j) {
            iA |= F0.AbstractC0918f0.a(2048);
        }
        if (cVar instanceof p121m0.b) {
            iA |= F0.AbstractC0918f0.a(4096);
        }
        if (cVar instanceof p231x0.e) {
            iA |= F0.AbstractC0918f0.a(8192);
        }
        if (cVar instanceof B0.a) {
            iA |= F0.AbstractC0918f0.a(16384);
        }
        if (cVar instanceof F0.InterfaceC0921h) {
            iA |= F0.AbstractC0918f0.a(32768);
        }
        int iA2 = cVar instanceof F0.E0 ? F0.AbstractC0918f0.a(262144) | iA : iA;
        h6.s(objB, iA2);
        return iA2;
    }

    public static final int h(androidx.compose.ui.d.c cVar) {
        if (!(cVar instanceof F0.AbstractC0927m)) {
            return g(cVar);
        }
        F0.AbstractC0927m abstractC0927m = (F0.AbstractC0927m) cVar;
        int iV1 = abstractC0927m.V1();
        for (androidx.compose.ui.d.c cVarU1 = abstractC0927m.U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
            iV1 |= h(cVarU1);
        }
        return iV1;
    }

    public static final boolean i(int i6) {
        return (i6 & F0.AbstractC0918f0.a(128)) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:48:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0046 -> B:7:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static final void j(p121m0.j r10) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = F0.AbstractC0918f0.a(r0)
            androidx.compose.ui.d$c r1 = r10.E0()
            boolean r1 = r1.A1()
            if (r1 == 0) goto La7
            X.b r1 = new X.b
            r2 = 16
            androidx.compose.ui.d$c[] r3 = new androidx.compose.ui.d.c[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.d$c r3 = r10.E0()
            androidx.compose.ui.d$c r3 = r3.r1()
            if (r3 != 0) goto L2c
            androidx.compose.ui.d$c r10 = r10.E0()
        L28:
            F0.AbstractC0925k.a(r1, r10)
            goto L2f
        L2c:
            r1.d(r3)
        L2f:
            boolean r10 = r1.x()
            if (r10 == 0) goto La6
            int r10 = r1.t()
            r3 = 1
            int r10 = r10 - r3
            java.lang.Object r10 = r1.D(r10)
            androidx.compose.ui.d$c r10 = (androidx.compose.ui.d.c) r10
            int r5 = r10.q1()
            r5 = r5 & r0
            if (r5 != 0) goto L49
            goto L28
        L49:
            if (r10 == 0) goto L2f
            int r5 = r10.v1()
            r5 = r5 & r0
            if (r5 == 0) goto La1
            r5 = 0
            r6 = r5
        L54:
            if (r10 == 0) goto L2f
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L60
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            p121m0.r.c(r10)
            goto L9c
        L60:
            int r7 = r10.v1()
            r7 = r7 & r0
            if (r7 == 0) goto L9c
            boolean r7 = r10 instanceof F0.AbstractC0927m
            if (r7 == 0) goto L9c
            r7 = r10
            F0.m r7 = (F0.AbstractC0927m) r7
            androidx.compose.ui.d$c r7 = r7.U1()
            r8 = r4
        L73:
            if (r7 == 0) goto L99
            int r9 = r7.v1()
            r9 = r9 & r0
            if (r9 == 0) goto L94
            int r8 = r8 + 1
            if (r8 != r3) goto L82
            r10 = r7
            goto L94
        L82:
            if (r6 != 0) goto L8b
            X.b r6 = new X.b
            androidx.compose.ui.d$c[] r9 = new androidx.compose.ui.d.c[r2]
            r6.<init>(r9, r4)
        L8b:
            if (r10 == 0) goto L91
            r6.d(r10)
            r10 = r5
        L91:
            r6.d(r7)
        L94:
            androidx.compose.ui.d$c r7 = r7.r1()
            goto L73
        L99:
            if (r8 != r3) goto L9c
            goto L54
        L9c:
            androidx.compose.ui.d$c r10 = F0.AbstractC0925k.b(r6)
            goto L54
        La1:
            androidx.compose.ui.d$c r10 = r10.r1()
            goto L49
        La6:
            return
        La7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.AbstractC0920g0.j(m0.j):void");
    }

    private static final boolean k(p121m0.j jVar) {
        F0.C0915e c0915e = F0.C0915e.f2639a;
        c0915e.b();
        jVar.Y(c0915e);
        return c0915e.a();
    }
}
