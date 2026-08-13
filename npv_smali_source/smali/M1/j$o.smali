.class final LM1/j$o;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j;->x(ZLm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LM1/j;

.field final synthetic I:Z


# direct methods
.method constructor <init>(LM1/j;ZLm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/j$o;->H:LM1/j;

    iput-boolean p2, p0, LM1/j$o;->I:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM1/j$o;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM1/j$o;->H:LM1/j;

    invoke-static {p1}, LM1/j;->c(LM1/j;)LM1/k;

    move-result-object p1

    invoke-virtual {p1}, LM1/k;->a()LM1/v;

    move-result-object p1

    instance-of p1, p1, LM1/l;

    if-eqz p1, :cond_3

    iget-object p1, p0, LM1/j$o;->H:LM1/j;

    invoke-static {p1}, LM1/j;->c(LM1/j;)LM1/k;

    move-result-object p1

    invoke-virtual {p1}, LM1/k;->a()LM1/v;

    move-result-object p1

    goto :goto_2

    :cond_3
    :try_start_1
    iget-object p1, p0, LM1/j$o;->H:LM1/j;

    iput v3, p0, LM1/j$o;->G:I

    invoke-static {p1, p0}, LM1/j;->k(LM1/j;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    iget-object p1, p0, LM1/j$o;->H:LM1/j;

    iget-boolean v1, p0, LM1/j$o;->I:Z

    iput v2, p0, LM1/j$o;->G:I

    invoke-static {p1, v1, p0}, LM1/j;->l(LM1/j;ZLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    check-cast p1, LM1/v;

    :goto_2
    return-object p1

    :goto_3
    new-instance v0, LM1/q;

    const/4 v1, -0x1

    invoke-direct {v0, p1, v1}, LM1/q;-><init>(Ljava/lang/Throwable;I)V

    return-object v0
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM1/j$o;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LM1/j$o;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LM1/j$o;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LM1/j$o;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, LM1/j$o;

    iget-object v0, p0, LM1/j$o;->H:LM1/j;

    iget-boolean v1, p0, LM1/j$o;->I:Z

    invoke-direct {p1, v0, v1, p2}, LM1/j$o;-><init>(LM1/j;ZLm7/e;)V

    return-object p1
.end method
