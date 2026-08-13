.class public final LA2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA2/c$c;
    }
.end annotation


# static fields
.field public static final D:LA2/c$c;

.field private static final E:[Ljava/lang/String;

.field private static final F:[Ljava/lang/String;

.field private static final G:Li7/n;

.field private static final H:Li7/n;


# instance fields
.field private final C:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, LA2/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA2/c$c;-><init>(Ly7/k;)V

    sput-object v0, LA2/c;->D:LA2/c$c;

    const-string v6, " OR IGNORE "

    const-string v7, " OR REPLACE "

    const-string v2, ""

    const-string v3, " OR ROLLBACK "

    const-string v4, " OR ABORT "

    const-string v5, " OR FAIL "

    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, LA2/c;->E:[Ljava/lang/String;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, LA2/c;->F:[Ljava/lang/String;

    sget-object v0, Li7/r;->E:Li7/r;

    sget-object v1, LA2/c$b;->D:LA2/c$b;

    invoke-static {v0, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v1

    sput-object v1, LA2/c;->G:Li7/n;

    sget-object v1, LA2/c$a;->D:LA2/c$a;

    invoke-static {v0, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, LA2/c;->H:Li7/n;

    return-void
.end method

.method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method

.method private static final D(Lz2/g;Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/Cursor;
    .locals 0

    new-instance p1, LA2/g;

    invoke-static {p4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p1, p4}, LA2/g;-><init>(Landroid/database/sqlite/SQLiteProgram;)V

    invoke-interface {p0, p1}, Lz2/g;->f(Lz2/f;)V

    new-instance p0, Landroid/database/sqlite/SQLiteCursor;

    invoke-direct {p0, p2, p3, p4}, Landroid/database/sqlite/SQLiteCursor;-><init>(Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)V

    return-object p0
.end method

.method public static synthetic a(Lz2/g;Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/Cursor;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LA2/c;->D(Lz2/g;Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/Cursor;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lx7/r;Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/Cursor;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LA2/c;->y(Lx7/r;Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/Cursor;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g()Li7/n;
    .locals 1

    sget-object v0, LA2/c;->H:Li7/n;

    return-object v0
.end method

.method public static final synthetic i()Li7/n;
    .locals 1

    sget-object v0, LA2/c;->G:Li7/n;

    return-object v0
.end method

.method private final r(Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    sget-object v1, LA2/c;->D:LA2/c$c;

    invoke-static {v1}, LA2/c$c;->a(LA2/c$c;)Ljava/lang/reflect/Method;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v1}, LA2/c$c;->b(LA2/c$c;)Ljava/lang/reflect/Method;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v1}, LA2/c$c;->a(LA2/c$c;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v1}, LA2/c$c;->b(LA2/c$c;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v3, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v3, v6, v0

    const/4 v0, 0x1

    aput-object p1, v6, v0

    const/4 p1, 0x2

    aput-object v5, v6, p1

    const/4 p1, 0x3

    aput-object v4, v6, p1

    invoke-virtual {v2, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, LA2/c;->o(Landroid/database/sqlite/SQLiteTransactionListener;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LA2/c;->u()V

    :goto_0
    return-void
.end method

.method private static final y(Lx7/r;Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/Cursor;
    .locals 0

    invoke-interface {p0, p1, p2, p3, p4}, Lx7/r;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/database/Cursor;

    return-object p0
.end method


# virtual methods
.method public B(Ljava/lang/String;)V
    .locals 1

    const-string v0, "sql"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public B0()V
    .locals 1

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void
.end method

.method public J(Ljava/lang/String;)Lz2/h;
    .locals 2

    const-string v0, "sql"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LA2/h;

    iget-object v1, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1, p1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p1

    const-string v1, "delegate.compileStatement(sql)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, LA2/h;-><init>(Landroid/database/sqlite/SQLiteStatement;)V

    return-object v0
.end method

.method public L0(Lz2/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 7

    const-string v0, "query"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, LA2/a;

    invoke-direct {v2, p1}, LA2/a;-><init>(Lz2/g;)V

    invoke-interface {p1}, Lz2/g;->a()Ljava/lang/String;

    move-result-object v3

    sget-object v4, LA2/c;->F:[Ljava/lang/String;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v5, 0x0

    move-object v6, p2

    invoke-virtual/range {v1 .. v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    const-string p2, "delegate.rawQueryWithFac\u2026llationSignal!!\n        )"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public S()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LA2/c;->r(Landroid/database/sqlite/SQLiteTransactionListener;)V

    return-void
.end method

.method public S0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public T(Lz2/g;)Landroid/database/Cursor;
    .locals 4

    const-string v0, "query"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LA2/c$d;

    invoke-direct {v0, p1}, LA2/c$d;-><init>(Lz2/g;)V

    iget-object v1, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, LA2/b;

    invoke-direct {v2, v0}, LA2/b;-><init>(Lx7/r;)V

    invoke-interface {p1}, Lz2/g;->a()Ljava/lang/String;

    move-result-object p1

    sget-object v0, LA2/c;->F:[Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    const-string v0, "delegate.rawQueryWithFac\u2026EMPTY_STRING_ARRAY, null)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public V0()Z
    .locals 1

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v0

    return v0
.end method

.method public a1()Z
    .locals 1

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isWriteAheadLoggingEnabled()Z

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    return-void
.end method

.method public i0()V
    .locals 1

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    return-void
.end method

.method public isOpen()Z
    .locals 1

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    return v0
.end method

.method public j0(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const-string v0, "sql"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bindArgs"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public l0()V
    .locals 1

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V

    return-void
.end method

.method public o(Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 1

    const-string v0, "transactionListener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionWithListener(Landroid/database/sqlite/SQLiteTransactionListener;)V

    return-void
.end method

.method public final s(Landroid/database/sqlite/SQLiteDatabase;)Z
    .locals 1

    const-string v0, "sqLiteDatabase"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public u()V
    .locals 1

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    return-void
.end method

.method public w0(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz2/a;

    invoke-direct {v0, p1}, Lz2/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LA2/c;->T(Lz2/g;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public z()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LA2/c;->C:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getAttachedDbs()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
