.class final Lh2/y$d;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/y;-><init>(Lx7/l;Ljava/lang/Object;Lh2/E;Lh2/O;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lh2/y;


# direct methods
.method constructor <init>(Lh2/O;Lh2/y;Lm7/e;)V
    .locals 0

    iput-object p2, p0, Lh2/y$d;->I:Lh2/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/y$d;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/y$d;->H:Ljava/lang/Object;

    check-cast p1, Lh2/T;

    iget-object v1, p0, Lh2/y$d;->I:Lh2/y;

    invoke-static {v1}, Lh2/y;->d(Lh2/y;)Lh2/h;

    move-result-object v1

    invoke-virtual {v1}, Lh2/h;->a()LZ8/f;

    move-result-object v1

    new-instance v3, Lh2/y$d$a;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4}, Lh2/y$d$a;-><init>(Lh2/P;Lm7/e;)V

    invoke-static {v1, v3}, LZ8/h;->H(LZ8/f;Lx7/p;)LZ8/f;

    move-result-object v1

    new-instance v3, Lh2/y$d$b;

    iget-object v5, p0, Lh2/y$d;->I:Lh2/y;

    invoke-direct {v3, v4, v5, v4}, Lh2/y$d$b;-><init>(Lh2/P;Lh2/y;Lm7/e;)V

    invoke-static {v1, v4, v3}, Lh2/k;->c(LZ8/f;Ljava/lang/Object;Lx7/q;)LZ8/f;

    move-result-object v1

    invoke-static {v1}, LZ8/h;->t(LZ8/f;)LZ8/f;

    move-result-object v1

    iget-object v3, p0, Lh2/y$d;->I:Lh2/y;

    new-instance v5, Lh2/y$d$e;

    invoke-direct {v5, v4, v3, v4}, Lh2/y$d$e;-><init>(Lm7/e;Lh2/y;Lh2/P;)V

    invoke-static {v1, v5}, Lh2/k;->d(LZ8/f;Lx7/q;)LZ8/f;

    move-result-object v1

    new-instance v3, Lh2/y$d$d;

    invoke-direct {v3, p1}, Lh2/y$d$d;-><init>(Lh2/T;)V

    iput v2, p0, Lh2/y$d;->G:I

    invoke-interface {v1, v3, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lh2/T;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/y$d;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/y$d;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/y$d;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/T;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/y$d;->H(Lh2/T;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Lh2/y$d;

    const/4 v1, 0x0

    iget-object v2, p0, Lh2/y$d;->I:Lh2/y;

    invoke-direct {v0, v1, v2, p2}, Lh2/y$d;-><init>(Lh2/O;Lh2/y;Lm7/e;)V

    iput-object p1, v0, Lh2/y$d;->H:Ljava/lang/Object;

    return-object v0
.end method
