.class final Lh0/o$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh0/o;->d(Ljava/util/concurrent/atomic/AtomicReference;Lx7/l;Lx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lx7/l;

.field final synthetic J:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic K:Lx7/p;


# direct methods
.method constructor <init>(Lx7/l;Ljava/util/concurrent/atomic/AtomicReference;Lx7/p;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh0/o$b;->I:Lx7/l;

    iput-object p2, p0, Lh0/o$b;->J:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lh0/o$b;->K:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh0/o$b;->G:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lh0/o$b;->H:Ljava/lang/Object;

    check-cast v0, Lh0/o$a;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lh0/o$b;->H:Ljava/lang/Object;

    check-cast v1, Lh0/o$a;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/o$b;->H:Ljava/lang/Object;

    check-cast p1, LW8/N;

    new-instance v1, Lh0/o$a;

    invoke-interface {p1}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v5

    invoke-static {v5}, LW8/C0;->m(Lm7/i;)LW8/z0;

    move-result-object v5

    iget-object v6, p0, Lh0/o$b;->I:Lx7/l;

    invoke-interface {v6, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v1, v5, p1}, Lh0/o$a;-><init>(LW8/z0;Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/o$b;->J:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh0/o$a;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lh0/o$a;->a()LW8/z0;

    move-result-object p1

    if-eqz p1, :cond_3

    iput-object v1, p0, Lh0/o$b;->H:Ljava/lang/Object;

    iput v4, p0, Lh0/o$b;->G:I

    invoke-static {p1, p0}, LW8/C0;->g(LW8/z0;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    :try_start_1
    iget-object p1, p0, Lh0/o$b;->K:Lx7/p;

    invoke-virtual {v1}, Lh0/o$a;->b()Ljava/lang/Object;

    move-result-object v4

    iput-object v1, p0, Lh0/o$b;->H:Ljava/lang/Object;

    iput v3, p0, Lh0/o$b;->G:I

    invoke-interface {p1, v4, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, v1

    :goto_1
    iget-object v1, p0, Lh0/o$b;->J:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v2}, Lu/c0;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object p1

    :catchall_1
    move-exception p1

    move-object v0, v1

    :goto_2
    iget-object v1, p0, Lh0/o$b;->J:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v2}, Lu/c0;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh0/o$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh0/o$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh0/o$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh0/o$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, Lh0/o$b;

    iget-object v1, p0, Lh0/o$b;->I:Lx7/l;

    iget-object v2, p0, Lh0/o$b;->J:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lh0/o$b;->K:Lx7/p;

    invoke-direct {v0, v1, v2, v3, p2}, Lh0/o$b;-><init>(Lx7/l;Ljava/util/concurrent/atomic/AtomicReference;Lx7/p;Lm7/e;)V

    iput-object p1, v0, Lh0/o$b;->H:Ljava/lang/Object;

    return-object v0
.end method
