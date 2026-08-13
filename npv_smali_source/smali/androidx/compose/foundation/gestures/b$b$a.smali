.class final Landroidx/compose/foundation/gestures/b$b$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Landroidx/compose/foundation/gestures/b;

.field final synthetic J:Lz0/K;

.field final synthetic K:Lx7/q;

.field final synthetic L:Lx7/l;

.field final synthetic M:Lx7/a;

.field final synthetic N:Lx7/a;

.field final synthetic O:Lx7/p;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/b;Lz0/K;Lx7/q;Lx7/l;Lx7/a;Lx7/a;Lx7/p;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b$a;->I:Landroidx/compose/foundation/gestures/b;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/b$b$a;->J:Lz0/K;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/b$b$a;->K:Lx7/q;

    iput-object p4, p0, Landroidx/compose/foundation/gestures/b$b$a;->L:Lx7/l;

    iput-object p5, p0, Landroidx/compose/foundation/gestures/b$b$a;->M:Lx7/a;

    iput-object p6, p0, Landroidx/compose/foundation/gestures/b$b$a;->N:Lx7/a;

    iput-object p7, p0, Landroidx/compose/foundation/gestures/b$b$a;->O:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/gestures/b$b$a;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$a;->H:Ljava/lang/Object;

    check-cast v0, LW8/N;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b$a;->H:Ljava/lang/Object;

    check-cast p1, LW8/N;

    :try_start_1
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b$a;->I:Landroidx/compose/foundation/gestures/b;

    invoke-static {v1}, Landroidx/compose/foundation/gestures/b;->a2(Landroidx/compose/foundation/gestures/b;)Lx/s;

    move-result-object v8

    iget-object v3, p0, Landroidx/compose/foundation/gestures/b$b$a;->J:Lz0/K;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/b$b$a;->K:Lx7/q;

    iget-object v5, p0, Landroidx/compose/foundation/gestures/b$b$a;->L:Lx7/l;

    iget-object v6, p0, Landroidx/compose/foundation/gestures/b$b$a;->M:Lx7/a;

    iget-object v7, p0, Landroidx/compose/foundation/gestures/b$b$a;->N:Lx7/a;

    iget-object v9, p0, Landroidx/compose/foundation/gestures/b$b$a;->O:Lx7/p;

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b$a;->H:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/foundation/gestures/b$b$a;->G:I

    move-object v10, p0

    invoke-static/range {v3 .. v10}, Lx/l;->e(Lz0/K;Lx7/q;Lx7/l;Lx7/a;Lx7/a;Lx/s;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v0, :cond_3

    return-object v0

    :catch_1
    move-exception v0

    move-object v11, v0

    move-object v0, p1

    move-object p1, v11

    :goto_0
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b$a;->I:Landroidx/compose/foundation/gestures/b;

    invoke-static {v1}, Landroidx/compose/foundation/gestures/b;->Z1(Landroidx/compose/foundation/gestures/b;)LY8/j;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v2, Landroidx/compose/foundation/gestures/a$a;->a:Landroidx/compose/foundation/gestures/a$a;

    invoke-interface {v1, v2}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LY8/n;->b(Ljava/lang/Object;)LY8/n;

    :cond_2
    invoke-static {v0}, LW8/O;->h(LW8/N;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_4
    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$b$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/b$b$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/b$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$b$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 10

    new-instance v9, Landroidx/compose/foundation/gestures/b$b$a;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b$a;->I:Landroidx/compose/foundation/gestures/b;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/b$b$a;->J:Lz0/K;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/b$b$a;->K:Lx7/q;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/b$b$a;->L:Lx7/l;

    iget-object v5, p0, Landroidx/compose/foundation/gestures/b$b$a;->M:Lx7/a;

    iget-object v6, p0, Landroidx/compose/foundation/gestures/b$b$a;->N:Lx7/a;

    iget-object v7, p0, Landroidx/compose/foundation/gestures/b$b$a;->O:Lx7/p;

    move-object v0, v9

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/b$b$a;-><init>(Landroidx/compose/foundation/gestures/b;Lz0/K;Lx7/q;Lx7/l;Lx7/a;Lx7/a;Lx7/p;Lm7/e;)V

    iput-object p1, v9, Landroidx/compose/foundation/gestures/b$b$a;->H:Ljava/lang/Object;

    return-object v9
.end method
