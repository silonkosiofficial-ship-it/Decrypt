package A2;

/* JADX INFO: loaded from: classes.dex */
public final class h extends A2.g implements p253z2.h {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.database.sqlite.SQLiteStatement f252D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.database.sqlite.SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        p247y7.AbstractC7350t.f(sQLiteStatement, "delegate");
        this.f252D = sQLiteStatement;
    }

    @Override // p253z2.h
    public int I() {
        return this.f252D.executeUpdateDelete();
    }

    @Override // p253z2.h
    public void n() {
        this.f252D.execute();
    }

    @Override // p253z2.h
    public long o1() {
        return this.f252D.executeInsert();
    }
}
