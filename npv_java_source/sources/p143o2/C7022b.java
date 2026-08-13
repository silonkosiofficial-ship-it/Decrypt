package p143o2;

/* JADX INFO: renamed from: o2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7022b implements p243y2.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p143o2.C7022b.a f52395b = new p143o2.C7022b.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p243y2.e f52396a;

    /* JADX INFO: renamed from: o2.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public C7022b(p243y2.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "delegate");
        this.f52396a = eVar;
    }

    @Override // p243y2.e
    public void a() {
        throw new java.lang.IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.".toString());
    }

    @Override // p243y2.e
    public void close() {
        throw new java.lang.IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.".toString());
    }

    @Override // p243y2.e
    public int getColumnCount() {
        throw new java.lang.IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.".toString());
    }

    @Override // p243y2.e
    public java.lang.String getColumnName(int i6) {
        throw new java.lang.IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.".toString());
    }

    @Override // p243y2.e
    public int getInt(int i6) {
        return this.f52396a.getInt(i6);
    }

    @Override // p243y2.e
    public long getLong(int i6) {
        throw new java.lang.IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.".toString());
    }

    @Override // p243y2.e
    public boolean isNull(int i6) {
        throw new java.lang.IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.".toString());
    }

    @Override // p243y2.e
    public void l(int i6, long j6) {
        this.f52396a.l(i6, j6);
    }

    @Override // p243y2.e
    public boolean m(int i6) {
        return this.f52396a.m(i6);
    }

    @Override // p243y2.e
    public void n(int i6, java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "value");
        this.f52396a.n(i6, str);
    }

    @Override // p243y2.e
    public java.lang.String o(int i6) {
        throw new java.lang.IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.".toString());
    }

    @Override // p243y2.e
    public boolean p() {
        throw new java.lang.IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.".toString());
    }
}
