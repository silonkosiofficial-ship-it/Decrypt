.class public final LB2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB2/c$a;
    }
.end annotation


# static fields
.field private static final d:LB2/c$a;


# instance fields
.field private final a:J

.field private final b:J

.field private volatile c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LB2/c$a;-><init>(Ly7/k;)V

    sput-object v0, LB2/c;->d:LB2/c$a;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LB2/c;->a:J

    iput-wide p3, p0, LB2/c;->b:J

    return-void
.end method

.method private final b()V
    .locals 2

    .prologue
    iget-boolean v0, p0, LB2/c;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x15

    const-string v1, "statement is closed"

    invoke-static {v0, v1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-direct {p0}, LB2/c;->b()V

    iget-wide v0, p0, LB2/c;->b:J

    invoke-static {v0, v1}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->i(J)V

    return-void
.end method

.method public close()V
    .locals 2

    .prologue
    iget-boolean v0, p0, LB2/c;->c:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, LB2/c;->b:J

    invoke-static {v0, v1}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->c(J)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LB2/c;->c:Z

    return-void
.end method

.method public getColumnCount()I
    .locals 2

    invoke-direct {p0}, LB2/c;->b()V

    iget-wide v0, p0, LB2/c;->b:J

    invoke-static {v0, v1}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->d(J)I

    move-result v0

    return v0
.end method

.method public getColumnName(I)Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, LB2/c;->b()V

    iget-wide v0, p0, LB2/c;->b:J

    invoke-static {v0, v1, p1}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->e(JI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic getInt(I)I
    .locals 0

    invoke-static {p0, p1}, Ly2/d;->b(Ly2/e;I)I

    move-result p1

    return p1
.end method

.method public getLong(I)J
    .locals 2

    invoke-direct {p0}, LB2/c;->b()V

    iget-wide v0, p0, LB2/c;->b:J

    invoke-static {v0, v1, p1}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->g(JI)J

    move-result-wide v0

    return-wide v0
.end method

.method public isNull(I)Z
    .locals 2

    .prologue
    invoke-direct {p0}, LB2/c;->b()V

    iget-wide v0, p0, LB2/c;->b:J

    invoke-static {v0, v1, p1}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->f(JI)I

    move-result p1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public l(IJ)V
    .locals 2

    invoke-direct {p0}, LB2/c;->b()V

    iget-wide v0, p0, LB2/c;->b:J

    invoke-static {v0, v1, p1, p2, p3}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->a(JIJ)V

    return-void
.end method

.method public synthetic m(I)Z
    .locals 0

    invoke-static {p0, p1}, Ly2/d;->a(Ly2/e;I)Z

    move-result p1

    return p1
.end method

.method public n(ILjava/lang/String;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LB2/c;->b()V

    iget-wide v0, p0, LB2/c;->b:J

    invoke-static {v0, v1, p1, p2}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->b(JILjava/lang/String;)V

    return-void
.end method

.method public o(I)Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, LB2/c;->b()V

    iget-wide v0, p0, LB2/c;->b:J

    invoke-static {v0, v1, p1}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->h(JI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public p()Z
    .locals 2

    invoke-direct {p0}, LB2/c;->b()V

    iget-wide v0, p0, LB2/c;->b:J

    invoke-static {v0, v1}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->j(J)Z

    move-result v0

    return v0
.end method
