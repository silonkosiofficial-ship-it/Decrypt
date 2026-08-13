.class final Lx/h$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/h;->m2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lx/h;

.field final synthetic J:Lx/I;

.field final synthetic K:Lx/f;


# direct methods
.method constructor <init>(Lx/h;Lx/I;Lx/f;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lx/h$c;->I:Lx/h;

    iput-object p2, p0, Lx/h$c;->J:Lx/I;

    iput-object p3, p0, Lx/h$c;->K:Lx/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lx/h$c;->G:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v4, p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lx/h$c;->H:Ljava/lang/Object;

    check-cast p1, LW8/N;

    invoke-interface {p1}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p1

    invoke-static {p1}, LW8/C0;->m(Lm7/i;)LW8/z0;

    move-result-object v9

    :try_start_1
    iget-object p1, p0, Lx/h$c;->I:Lx/h;

    invoke-static {p1, v2}, Lx/h;->b2(Lx/h;Z)V

    iget-object p1, p0, Lx/h$c;->I:Lx/h;

    invoke-static {p1}, Lx/h;->X1(Lx/h;)Lx/C;

    move-result-object p1

    sget-object v1, Lv/L;->C:Lv/L;

    new-instance v11, Lx/h$c$a;

    iget-object v6, p0, Lx/h$c;->J:Lx/I;

    iget-object v7, p0, Lx/h$c;->I:Lx/h;

    iget-object v8, p0, Lx/h$c;->K:Lx/f;

    const/4 v10, 0x0

    move-object v5, v11

    invoke-direct/range {v5 .. v10}, Lx/h$c$a;-><init>(Lx/I;Lx/h;Lx/f;LW8/z0;Lm7/e;)V

    iput v2, p0, Lx/h$c;->G:I

    invoke-virtual {p1, v1, v11, p0}, Lx/C;->v(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lx/h$c;->I:Lx/h;

    invoke-static {p1}, Lx/h;->U1(Lx/h;)Lx/d;

    move-result-object p1

    invoke-virtual {p1}, Lx/d;->d()V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p1, p0, Lx/h$c;->I:Lx/h;

    invoke-static {p1, v3}, Lx/h;->b2(Lx/h;Z)V

    iget-object p1, p0, Lx/h$c;->I:Lx/h;

    invoke-static {p1}, Lx/h;->U1(Lx/h;)Lx/d;

    move-result-object p1

    invoke-virtual {p1, v4}, Lx/d;->b(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lx/h$c;->I:Lx/h;

    invoke-static {p1, v3}, Lx/h;->c2(Lx/h;Z)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_1
    :try_start_2
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    iget-object v0, p0, Lx/h$c;->I:Lx/h;

    invoke-static {v0, v3}, Lx/h;->b2(Lx/h;Z)V

    iget-object v0, p0, Lx/h$c;->I:Lx/h;

    invoke-static {v0}, Lx/h;->U1(Lx/h;)Lx/d;

    move-result-object v0

    invoke-virtual {v0, v4}, Lx/d;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lx/h$c;->I:Lx/h;

    invoke-static {v0, v3}, Lx/h;->c2(Lx/h;Z)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/h$c;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lx/h$c;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/h$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lx/h$c;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, Lx/h$c;

    iget-object v1, p0, Lx/h$c;->I:Lx/h;

    iget-object v2, p0, Lx/h$c;->J:Lx/I;

    iget-object v3, p0, Lx/h$c;->K:Lx/f;

    invoke-direct {v0, v1, v2, v3, p2}, Lx/h$c;-><init>(Lx/h;Lx/I;Lx/f;Lm7/e;)V

    iput-object p1, v0, Lx/h$c;->H:Ljava/lang/Object;

    return-object v0
.end method
