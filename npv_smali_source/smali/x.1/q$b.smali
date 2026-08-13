.class final Lx/q$b;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/q;->c(Lz0/K;Lx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:Lm7/i;

.field final synthetic H:Lx7/p;


# direct methods
.method constructor <init>(Lm7/i;Lx7/p;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lx/q$b;->G:Lm7/i;

    iput-object p2, p0, Lx/q$b;->H:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lx/q$b;->E:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v4, :cond_3

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lx/q$b;->F:Ljava/lang/Object;

    check-cast v1, Lz0/c;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lx/q$b;->F:Ljava/lang/Object;

    check-cast v1, Lz0/c;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    move-object p1, v1

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lx/q$b;->F:Ljava/lang/Object;

    check-cast v1, Lz0/c;

    :try_start_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_4
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lx/q$b;->F:Ljava/lang/Object;

    check-cast p1, Lz0/c;

    :goto_1
    iget-object v1, p0, Lx/q$b;->G:Lm7/i;

    invoke-static {v1}, LW8/C0;->p(Lm7/i;)Z

    move-result v1

    if-eqz v1, :cond_7

    :try_start_2
    iget-object v1, p0, Lx/q$b;->H:Lx7/p;

    iput-object p1, p0, Lx/q$b;->F:Ljava/lang/Object;

    iput v4, p0, Lx/q$b;->E:I

    invoke-interface {v1, p1, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1

    if-ne v1, v0, :cond_5

    return-object v0

    :cond_5
    move-object v1, p1

    :goto_2
    :try_start_3
    iput-object v1, p0, Lx/q$b;->F:Ljava/lang/Object;

    iput v3, p0, Lx/q$b;->E:I

    invoke-static {v1, p0}, Lx/q;->b(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    if-ne p1, v0, :cond_2

    return-object v0

    :catch_1
    move-exception v1

    move-object v6, v1

    move-object v1, p1

    move-object p1, v6

    :goto_3
    iget-object v5, p0, Lx/q$b;->G:Lm7/i;

    invoke-static {v5}, LW8/C0;->p(Lm7/i;)Z

    move-result v5

    if-eqz v5, :cond_6

    iput-object v1, p0, Lx/q$b;->F:Ljava/lang/Object;

    iput v2, p0, Lx/q$b;->E:I

    invoke-static {v1, p0}, Lx/q;->b(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_6
    throw p1

    :cond_7
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final E(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/q$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lx/q$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/q$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lx/q$b;->E(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Lx/q$b;

    iget-object v1, p0, Lx/q$b;->G:Lm7/i;

    iget-object v2, p0, Lx/q$b;->H:Lx7/p;

    invoke-direct {v0, v1, v2, p2}, Lx/q$b;-><init>(Lm7/i;Lx7/p;Lm7/e;)V

    iput-object p1, v0, Lx/q$b;->F:Ljava/lang/Object;

    return-object v0
.end method
