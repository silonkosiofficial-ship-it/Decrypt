.class final Lh2/y$d$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/y$d;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field synthetic I:Ljava/lang/Object;

.field synthetic J:Z

.field final synthetic K:Lh2/P;

.field final synthetic L:Lh2/y;


# direct methods
.method constructor <init>(Lh2/P;Lh2/y;Lm7/e;)V
    .locals 0

    iput-object p2, p0, Lh2/y$d$b;->L:Lh2/y;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/y$d$b;->H:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lh2/y$d$b;->G:Ljava/lang/Object;

    check-cast v0, Lh2/L;

    iget-object v1, p0, Lh2/y$d$b;->I:Ljava/lang/Object;

    check-cast v1, Lh2/y$a;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lh2/y$d$b;->I:Ljava/lang/Object;

    check-cast v1, Lh2/y$a;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/y$d$b;->I:Ljava/lang/Object;

    check-cast p1, Lh2/y$a;

    iget-boolean v1, p0, Lh2/y$d$b;->J:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lh2/y$d$b;->K:Lh2/P;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Lh2/Q;->e()V

    :cond_3
    iget-object v1, p0, Lh2/y$d$b;->L:Lh2/y;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lh2/y$a;->b()Lh2/z;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lh2/z;->v()Lh2/L;

    move-result-object v5

    goto :goto_0

    :cond_4
    move-object v5, v4

    :goto_0
    iput-object p1, p0, Lh2/y$d$b;->I:Ljava/lang/Object;

    iput v3, p0, Lh2/y$d$b;->H:I

    invoke-static {v1, v5, p0}, Lh2/y;->a(Lh2/y;Lh2/L;Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    return-object v0

    :cond_5
    move-object v13, v1

    move-object v1, p1

    move-object p1, v13

    :goto_1
    check-cast p1, Lh2/L;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lh2/y$a;->b()Lh2/z;

    move-result-object v5

    if-eqz v5, :cond_7

    iput-object v1, p0, Lh2/y$d$b;->I:Ljava/lang/Object;

    iput-object p1, p0, Lh2/y$d$b;->G:Ljava/lang/Object;

    iput v2, p0, Lh2/y$d$b;->H:I

    invoke-virtual {v5, p0}, Lh2/z;->r(Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_6

    return-object v0

    :cond_6
    move-object v0, p1

    move-object p1, v2

    :goto_2
    check-cast p1, Lh2/M;

    move-object v7, v0

    goto :goto_3

    :cond_7
    move-object v7, p1

    move-object p1, v4

    :goto_3
    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lh2/M;->c()Ljava/util/List;

    move-result-object v0

    goto :goto_4

    :cond_8
    move-object v0, v4

    :goto_4
    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lh2/y$a;->c()Lh2/M;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lh2/M;->c()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_a

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v3

    if-ne v0, v3, :cond_a

    invoke-virtual {v1}, Lh2/y$a;->c()Lh2/M;

    move-result-object p1

    :cond_a
    if-eqz p1, :cond_b

    invoke-virtual {p1}, Lh2/M;->a()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_5

    :cond_b
    move-object v0, v4

    :goto_5
    if-nez v0, :cond_d

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lh2/y$a;->c()Lh2/M;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lh2/M;->a()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_6

    :cond_c
    move-object v0, v4

    :goto_6
    if-eqz v0, :cond_d

    invoke-virtual {v1}, Lh2/y$a;->c()Lh2/M;

    move-result-object p1

    :cond_d
    if-nez p1, :cond_f

    iget-object v0, p0, Lh2/y$d$b;->L:Lh2/y;

    invoke-static {v0}, Lh2/y;->c(Lh2/y;)Ljava/lang/Object;

    move-result-object v0

    :cond_e
    :goto_7
    move-object v6, v0

    goto :goto_8

    :cond_f
    invoke-virtual {v7, p1}, Lh2/L;->d(Lh2/M;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lh2/K;->a:Lh2/K;

    const/4 v5, 0x3

    invoke-virtual {v2, v5}, Lh2/K;->a(I)Z

    move-result v6

    if-eqz v6, :cond_e

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Refresh key "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " returned from PagingSource "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v5, v6, v4}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_7

    :goto_8
    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lh2/y$a;->b()Lh2/z;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lh2/z;->p()V

    :cond_10
    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lh2/y$a;->a()LW8/z0;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-static {v0, v4, v3, v4}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_11
    new-instance v0, Lh2/y$a;

    iget-object v1, p0, Lh2/y$d$b;->L:Lh2/y;

    invoke-static {v1}, Lh2/y;->b(Lh2/y;)Lh2/E;

    move-result-object v8

    iget-object v1, p0, Lh2/y$d$b;->L:Lh2/y;

    invoke-static {v1}, Lh2/y;->e(Lh2/y;)Lh2/h;

    move-result-object v1

    invoke-virtual {v1}, Lh2/h;->a()LZ8/f;

    move-result-object v9

    new-instance v12, Lh2/y$d$b$a;

    iget-object v1, p0, Lh2/y$d$b;->L:Lh2/y;

    invoke-direct {v12, v1}, Lh2/y$d$b$a;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lh2/z;

    iget-object v10, p0, Lh2/y$d$b;->K:Lh2/P;

    move-object v5, v1

    move-object v11, p1

    invoke-direct/range {v5 .. v12}, Lh2/z;-><init>(Ljava/lang/Object;Lh2/L;Lh2/E;LZ8/f;Lh2/Q;Lh2/M;Lx7/a;)V

    invoke-static {v4, v3, v4}, LW8/C0;->b(LW8/z0;ILjava/lang/Object;)LW8/y;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lh2/y$a;-><init>(Lh2/z;Lh2/M;LW8/z0;)V

    return-object v0
.end method

.method public final H(Lh2/y$a;ZLm7/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lh2/y$d$b;

    iget-object v1, p0, Lh2/y$d$b;->K:Lh2/P;

    iget-object v2, p0, Lh2/y$d$b;->L:Lh2/y;

    invoke-direct {v0, v1, v2, p3}, Lh2/y$d$b;-><init>(Lh2/P;Lh2/y;Lm7/e;)V

    iput-object p1, v0, Lh2/y$d$b;->I:Ljava/lang/Object;

    iput-boolean p2, v0, Lh2/y$d$b;->J:Z

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, Lh2/y$d$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/y$a;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, Lh2/y$d$b;->H(Lh2/y$a;ZLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
