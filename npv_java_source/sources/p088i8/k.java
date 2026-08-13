package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public enum k implements p8.j.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);


    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static p8.j.b f47031H = new p8.j.b() { // from class: i8.k.a
        @Override // p8.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p088i8.k a(int i6) {
            return p088i8.k.e(i6);
        }
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f47033C;

    k(int i6, int i10) {
        this.f47033C = i10;
    }

    public static p088i8.k e(int i6) {
        if (i6 == 0) {
            return FINAL;
        }
        if (i6 == 1) {
            return OPEN;
        }
        if (i6 == 2) {
            return ABSTRACT;
        }
        if (i6 != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // p8.j.a
    public final int c() {
        return this.f47033C;
    }
}
