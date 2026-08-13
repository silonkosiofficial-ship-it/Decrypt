package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public enum j implements p8.j.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);


    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static p8.j.b f47024H = new p8.j.b() { // from class: i8.j.a
        @Override // p8.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p088i8.j a(int i6) {
            return p088i8.j.e(i6);
        }
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f47026C;

    j(int i6, int i10) {
        this.f47026C = i10;
    }

    public static p088i8.j e(int i6) {
        if (i6 == 0) {
            return DECLARATION;
        }
        if (i6 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i6 == 2) {
            return DELEGATION;
        }
        if (i6 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // p8.j.a
    public final int c() {
        return this.f47026C;
    }
}
