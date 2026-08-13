.class public final Lh2/y$h$b$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/y$h$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lh2/T;

.field final synthetic I:LZ8/f;

.field final synthetic J:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic K:Lh2/Y;

.field final synthetic L:I


# direct methods
.method public constructor <init>(LZ8/f;Ljava/util/concurrent/atomic/AtomicInteger;Lh2/T;Lh2/Y;ILm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/y$h$b$b;->I:LZ8/f;

    iput-object p2, p0, Lh2/y$h$b$b;->J:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p4, p0, Lh2/y$h$b$b;->K:Lh2/Y;

    iput p5, p0, Lh2/y$h$b$b;->L:I

    iput-object p3, p0, Lh2/y$h$b$b;->H:Lh2/T;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/y$h$b$b;->G:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lh2/y$h$b$b;->I:LZ8/f;

    new-instance v1, Lh2/y$h$b$b$a;

    iget-object v4, p0, Lh2/y$h$b$b;->K:Lh2/Y;

    iget v5, p0, Lh2/y$h$b$b;->L:I

    invoke-direct {v1, v4, v5}, Lh2/y$h$b$b$a;-><init>(Lh2/Y;I)V

    iput v3, p0, Lh2/y$h$b$b;->G:I

    invoke-interface {p1, v1, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lh2/y$h$b$b;->J:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lh2/y$h$b$b;->H:Lh2/T;

    invoke-static {p1, v2, v3, v2}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_1
    iget-object v0, p0, Lh2/y$h$b$b;->J:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lh2/y$h$b$b;->H:Lh2/T;

    invoke-static {v0, v2, v3, v2}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_4
    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/y$h$b$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/y$h$b$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/y$h$b$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/y$h$b$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance p1, Lh2/y$h$b$b;

    iget-object v1, p0, Lh2/y$h$b$b;->I:LZ8/f;

    iget-object v2, p0, Lh2/y$h$b$b;->J:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v3, p0, Lh2/y$h$b$b;->H:Lh2/T;

    iget-object v4, p0, Lh2/y$h$b$b;->K:Lh2/Y;

    iget v5, p0, Lh2/y$h$b$b;->L:I

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lh2/y$h$b$b;-><init>(LZ8/f;Ljava/util/concurrent/atomic/AtomicInteger;Lh2/T;Lh2/Y;ILm7/e;)V

    return-object p1
.end method
