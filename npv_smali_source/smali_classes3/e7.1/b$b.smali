.class final Le7/b$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le7/b;->f(ILm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Le7/b;

.field final synthetic I:I


# direct methods
.method constructor <init>(Le7/b;ILm7/e;)V
    .locals 0

    iput-object p1, p0, Le7/b$b;->H:Le7/b;

    iput p2, p0, Le7/b$b;->I:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, Le7/b$b;->G:I

    if-nez v0, :cond_2

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    move-wide v2, v0

    :goto_0
    iget-object p1, p0, Le7/b$b;->H:Le7/b;

    invoke-static {p1}, Le7/b;->b(Le7/b;)Lo9/a;

    move-result-object p1

    invoke-static {p1}, Ld7/d;->d(Lo9/q;)J

    move-result-wide v4

    iget p1, p0, Le7/b$b;->I:I

    int-to-long v6, p1

    cmp-long p1, v4, v6

    const-wide/16 v4, -0x1

    if-gez p1, :cond_0

    cmp-long p1, v2, v0

    if-ltz p1, :cond_0

    :try_start_0
    iget-object p1, p0, Le7/b$b;->H:Le7/b;

    invoke-static {p1}, Le7/b;->c(Le7/b;)Lo9/h;

    move-result-object p1

    iget-object v2, p0, Le7/b$b;->H:Le7/b;

    invoke-static {v2}, Le7/b;->b(Le7/b;)Lo9/a;

    move-result-object v2

    const-wide v6, 0x7fffffffffffffffL

    invoke-interface {p1, v2, v6, v7}, Lo9/h;->I0(Lo9/a;J)J

    move-result-wide v2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-wide v2, v4

    goto :goto_0

    :cond_0
    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    iget-object p1, p0, Le7/b$b;->H:Le7/b;

    invoke-static {p1}, Le7/b;->c(Le7/b;)Lo9/h;

    move-result-object p1

    invoke-interface {p1}, Lo9/h;->close()V

    iget-object p1, p0, Le7/b$b;->H:Le7/b;

    invoke-virtual {p1}, Le7/b;->g()LW8/y;

    move-result-object p1

    invoke-interface {p1}, LW8/y;->K0()Z

    iget-object p1, p0, Le7/b$b;->H:Le7/b;

    new-instance v0, Lio/ktor/utils/io/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/ktor/utils/io/n;-><init>(Ljava/lang/Throwable;)V

    invoke-static {p1, v0}, Le7/b;->e(Le7/b;Lio/ktor/utils/io/n;)V

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Le7/b$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Le7/b$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Le7/b$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Le7/b$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, Le7/b$b;

    iget-object v0, p0, Le7/b$b;->H:Le7/b;

    iget v1, p0, Le7/b$b;->I:I

    invoke-direct {p1, v0, v1, p2}, Le7/b$b;-><init>(Le7/b;ILm7/e;)V

    return-object p1
.end method
