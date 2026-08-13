.class final Lh2/y$h;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/y;->j(Lh2/z;LW8/z0;Lh2/P;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lh2/P;

.field final synthetic J:Lh2/z;

.field final synthetic K:Lh2/w;


# direct methods
.method constructor <init>(Lh2/P;Lh2/z;Lh2/w;Lm7/e;)V
    .locals 0

    iput-object p2, p0, Lh2/y$h;->J:Lh2/z;

    iput-object p3, p0, Lh2/y$h;->K:Lh2/w;

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

    iget v1, p0, Lh2/y$h;->G:I

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

    iget-object p1, p0, Lh2/y$h;->H:Ljava/lang/Object;

    check-cast p1, Lh2/T;

    iget-object v1, p0, Lh2/y$h;->I:Lh2/P;

    invoke-interface {v1}, Lh2/P;->getState()LZ8/N;

    move-result-object v1

    iget-object v3, p0, Lh2/y$h;->J:Lh2/z;

    invoke-virtual {v3}, Lh2/z;->u()LZ8/f;

    move-result-object v3

    iget-object v4, p0, Lh2/y$h;->K:Lh2/w;

    new-instance v5, Lh2/y$h$b;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v3, v6, v4}, Lh2/y$h$b;-><init>(LZ8/f;LZ8/f;Lm7/e;Lh2/w;)V

    invoke-static {v5}, Lh2/S;->a(Lx7/p;)LZ8/f;

    move-result-object v1

    new-instance v3, Lh2/y$h$a;

    invoke-direct {v3, p1}, Lh2/y$h$a;-><init>(Lh2/T;)V

    iput v2, p0, Lh2/y$h;->G:I

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

    invoke-virtual {p0, p1, p2}, Lh2/y$h;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/y$h;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/y$h;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/T;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/y$h;->H(Lh2/T;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, Lh2/y$h;

    iget-object v1, p0, Lh2/y$h;->I:Lh2/P;

    iget-object v2, p0, Lh2/y$h;->J:Lh2/z;

    iget-object v3, p0, Lh2/y$h;->K:Lh2/w;

    invoke-direct {v0, v1, v2, v3, p2}, Lh2/y$h;-><init>(Lh2/P;Lh2/z;Lh2/w;Lm7/e;)V

    iput-object p1, v0, Lh2/y$h;->H:Ljava/lang/Object;

    return-object v0
.end method
