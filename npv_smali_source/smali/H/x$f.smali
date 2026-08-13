.class final LH/x$f;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/x;->e(Lz0/K;LH/F;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field private synthetic G:Ljava/lang/Object;

.field final synthetic H:LH/F;


# direct methods
.method constructor <init>(LH/F;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LH/x$f;->H:LH/F;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LH/x$f;->F:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LH/x$f;->E:Ljava/lang/Object;

    check-cast v1, Lz0/B;

    iget-object v4, p0, LH/x$f;->G:Ljava/lang/Object;

    check-cast v4, Lz0/c;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LH/x$f;->G:Ljava/lang/Object;

    check-cast v1, Lz0/c;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LH/x$f;->G:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lz0/c;

    iput-object v1, p0, LH/x$f;->G:Ljava/lang/Object;

    iput v3, p0, LH/x$f;->F:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v4, v1

    move-object v7, p0

    invoke-static/range {v4 .. v9}, Lx/D;->e(Lz0/c;ZLz0/r;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Lz0/B;

    iget-object v4, p0, LH/x$f;->H:LH/F;

    invoke-virtual {p1}, Lz0/B;->h()J

    move-result-wide v5

    invoke-interface {v4, v5, v6}, LH/F;->a(J)V

    move-object v4, v1

    move-object v1, p1

    :goto_1
    iput-object v4, p0, LH/x$f;->G:Ljava/lang/Object;

    iput-object v1, p0, LH/x$f;->E:Ljava/lang/Object;

    iput v2, p0, LH/x$f;->F:I

    const/4 p1, 0x0

    invoke-static {v4, p1, p0, v3, p1}, Lz0/b;->a(Lz0/c;Lz0/r;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Lz0/p;

    invoke-virtual {p1}, Lz0/p;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v5, :cond_6

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lz0/B;

    invoke-virtual {v7}, Lz0/B;->f()J

    move-result-wide v8

    invoke-virtual {v1}, Lz0/B;->f()J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, Lz0/A;->d(JJ)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v7}, Lz0/B;->i()Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    iget-object p1, p0, LH/x$f;->H:LH/F;

    invoke-interface {p1}, LH/F;->d()V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final E(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LH/x$f;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LH/x$f;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LH/x$f;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LH/x$f;->E(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LH/x$f;

    iget-object v1, p0, LH/x$f;->H:LH/F;

    invoke-direct {v0, v1, p2}, LH/x$f;-><init>(LH/F;Lm7/e;)V

    iput-object p1, v0, LH/x$f;->G:Ljava/lang/Object;

    return-object v0
.end method
