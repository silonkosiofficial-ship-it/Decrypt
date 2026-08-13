package p067g7;

/* JADX INFO: loaded from: classes3.dex */
public enum d {
    TEXT(false, 1),
    BINARY(false, 2),
    CLOSE(true, 8),
    PING(true, 9),
    PONG(true, 10);


    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int f45579F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final p067g7.d[] f45580G;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f45588C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f45589D;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f45587N = p157p7.b.a(e());

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final g7.d.a f45578E = new g7.d.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.lang.Object next;
        java.util.Iterator<E> it = g().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i6 = ((p067g7.d) next).f45589D;
                do {
                    java.lang.Object next2 = it.next();
                    int i10 = ((p067g7.d) next2).f45589D;
                    if (i6 < i10) {
                        next = next2;
                        i6 = i10;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        p247y7.AbstractC7350t.c(next);
        int i11 = ((p067g7.d) next).f45589D;
        f45579F = i11;
        int i12 = i11 + 1;
        p067g7.d[] dVarArr = new p067g7.d[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            java.util.Iterator<E> it2 = g().iterator();
            java.lang.Object obj = null;
            boolean z6 = false;
            while (true) {
                if (!it2.hasNext()) {
                    if (z6) {
                        break;
                    }
                } else {
                    java.lang.Object next3 = it2.next();
                    if (((p067g7.d) next3).f45589D == i13) {
                        if (!z6) {
                            z6 = true;
                            obj = next3;
                        }
                    }
                }
                obj = null;
                break;
            }
            dVarArr[i13] = obj;
        }
        f45580G = dVarArr;
    }

    d(boolean z6, int i6) {
        this.f45588C = z6;
        this.f45589D = i6;
    }

    public static p157p7.a g() {
        return f45587N;
    }
}
