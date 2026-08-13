package p121m0;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p170r.K f50222a = p170r.V.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X.b f50223b = new X.b(new p237x7.a[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50224c;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.f50224c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        this.f50222a.i();
        int i6 = 0;
        this.f50224c = false;
        X.b bVar = this.f50223b;
        int iT = bVar.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVar.s();
            do {
                ((p237x7.a) objArrS[i6]).b();
                i6++;
            } while (i6 < iT);
        }
        this.f50223b.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    public final void h() {
        p170r.K k6 = this.f50222a;
        java.lang.Object[] objArr = k6.f53334b;
        long[] jArr = k6.f53333a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j6 = jArr[i6];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i6 != length) {
                        break;
                        break;
                    }
                    i6++;
                } else {
                    int i10 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j6) < 128) {
                            ((androidx.compose.ui.focus.FocusTargetNode) objArr[(i6 << 3) + i11]).X1();
                        }
                        j6 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    } else if (i6 != length) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
        this.f50222a.i();
        this.f50224c = false;
        this.f50223b.j();
    }

    public final p121m0.o i(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        return (p121m0.o) this.f50222a.c(focusTargetNode);
    }

    public final void j(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, p121m0.o oVar) {
        p170r.K k6 = this.f50222a;
        if (oVar != null) {
            k6.s(focusTargetNode, oVar);
        } else {
            C0.a.c("requires a non-null focus state");
            throw new p087i7.C6665k();
        }
    }
}
