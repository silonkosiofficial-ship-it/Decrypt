package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public enum x implements p8.j.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);


    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static p8.j.b f47318J = new p8.j.b() { // from class: i8.x.a
        @Override // p8.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p088i8.x a(int i6) {
            return p088i8.x.e(i6);
        }
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f47320C;

    x(int i6, int i10) {
        this.f47320C = i10;
    }

    public static p088i8.x e(int i6) {
        if (i6 == 0) {
            return INTERNAL;
        }
        if (i6 == 1) {
            return PRIVATE;
        }
        if (i6 == 2) {
            return PROTECTED;
        }
        if (i6 == 3) {
            return PUBLIC;
        }
        if (i6 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i6 != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // p8.j.a
    public final int c() {
        return this.f47320C;
    }
}
