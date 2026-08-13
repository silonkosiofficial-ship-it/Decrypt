.class final LK/o$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/o;->e(Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LK/o;


# direct methods
.method constructor <init>(LK/o;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LK/o$a;->I:LK/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LK/o$a;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LK/o$a;->H:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, LW8/N;

    iget-object p1, p0, LK/o$a;->I:LK/o;

    invoke-static {p1}, LK/o;->a(LK/o;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    const/4 v6, 0x0

    invoke-virtual {p1, v6}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LW8/z0;

    iget-object v1, p0, LK/o$a;->I:LK/o;

    invoke-static {v1}, LK/o;->a(LK/o;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v7

    new-instance v3, LK/o$a$a;

    iget-object v1, p0, LK/o$a;->I:LK/o;

    invoke-direct {v3, p1, v1, v6}, LK/o$a$a;-><init>(LW8/z0;LK/o;Lm7/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p1

    invoke-static {v7, v6, p1}, Lu/c0;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LK/o$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LK/o$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LK/o$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LK/o$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LK/o$a;

    iget-object v1, p0, LK/o$a;->I:LK/o;

    invoke-direct {v0, v1, p2}, LK/o$a;-><init>(LK/o;Lm7/e;)V

    iput-object p1, v0, LK/o$a;->H:Ljava/lang/Object;

    return-object v0
.end method
