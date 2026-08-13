.class final LW8/F0$d;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW8/F0;->N()LR8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LW8/F0;


# direct methods
.method constructor <init>(LW8/F0;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LW8/F0$d;->I:LW8/F0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LW8/F0$d;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LW8/F0$d;->F:Ljava/lang/Object;

    check-cast v1, Lb9/o;

    iget-object v3, p0, LW8/F0$d;->E:Ljava/lang/Object;

    check-cast v3, Lb9/n;

    iget-object v4, p0, LW8/F0$d;->H:Ljava/lang/Object;

    check-cast v4, LR8/j;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LW8/F0$d;->H:Ljava/lang/Object;

    check-cast p1, LR8/j;

    iget-object v1, p0, LW8/F0$d;->I:LW8/F0;

    invoke-virtual {v1}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, LW8/t;

    if-eqz v4, :cond_3

    check-cast v1, LW8/t;

    iget-object v1, v1, LW8/t;->G:LW8/u;

    iput v3, p0, LW8/F0$d;->G:I

    invoke-virtual {p1, v1, p0}, LR8/j;->b(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_3
    instance-of v3, v1, LW8/v0;

    if-eqz v3, :cond_5

    check-cast v1, LW8/v0;

    invoke-interface {v1}, LW8/v0;->a()LW8/K0;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lb9/o;->l()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v3, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lb9/o;

    move-object v4, p1

    move-object v5, v3

    move-object v3, v1

    move-object v1, v5

    :goto_0
    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    instance-of p1, v1, LW8/t;

    if-eqz p1, :cond_4

    move-object p1, v1

    check-cast p1, LW8/t;

    iget-object p1, p1, LW8/t;->G:LW8/u;

    iput-object v4, p0, LW8/F0$d;->H:Ljava/lang/Object;

    iput-object v3, p0, LW8/F0$d;->E:Ljava/lang/Object;

    iput-object v1, p0, LW8/F0$d;->F:Ljava/lang/Object;

    iput v2, p0, LW8/F0$d;->G:I

    invoke-virtual {v4, p1, p0}, LR8/j;->b(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    invoke-virtual {v1}, Lb9/o;->m()Lb9/o;

    move-result-object v1

    goto :goto_0

    :cond_5
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final E(LR8/j;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LW8/F0$d;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LW8/F0$d;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LW8/F0$d;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR8/j;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LW8/F0$d;->E(LR8/j;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LW8/F0$d;

    iget-object v1, p0, LW8/F0$d;->I:LW8/F0;

    invoke-direct {v0, v1, p2}, LW8/F0$d;-><init>(LW8/F0;Lm7/e;)V

    iput-object p1, v0, LW8/F0$d;->H:Ljava/lang/Object;

    return-object v0
.end method
