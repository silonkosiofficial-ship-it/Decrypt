.class public final Lh2/y$d$e;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/y$d;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Lh2/y;

.field final synthetic K:Lh2/P;


# direct methods
.method public constructor <init>(Lm7/e;Lh2/y;Lh2/P;)V
    .locals 0

    iput-object p2, p0, Lh2/y$d$e;->J:Lh2/y;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/y$d$e;->G:I

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

    iget-object p1, p0, Lh2/y$d$e;->H:Ljava/lang/Object;

    check-cast p1, LZ8/g;

    iget-object v1, p0, Lh2/y$d$e;->I:Ljava/lang/Object;

    check-cast v1, Lh2/y$a;

    iget-object v3, p0, Lh2/y$d$e;->J:Lh2/y;

    invoke-virtual {v1}, Lh2/y$a;->b()Lh2/z;

    move-result-object v4

    invoke-virtual {v1}, Lh2/y$a;->a()LW8/z0;

    move-result-object v5

    iget-object v6, p0, Lh2/y$d$e;->K:Lh2/P;

    invoke-static {v3, v4, v5, v6}, Lh2/y;->f(Lh2/y;Lh2/z;LW8/z0;Lh2/P;)LZ8/f;

    move-result-object v3

    new-instance v4, Lh2/y$d$c;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lh2/y$d$c;-><init>(Lm7/e;)V

    invoke-static {v3, v4}, LZ8/h;->G(LZ8/f;Lx7/p;)LZ8/f;

    move-result-object v7

    new-instance v3, Lh2/F;

    new-instance v8, Lh2/y$c;

    iget-object v4, p0, Lh2/y$d$e;->J:Lh2/y;

    invoke-static {v4}, Lh2/y;->e(Lh2/y;)Lh2/h;

    move-result-object v5

    invoke-direct {v8, v4, v5}, Lh2/y$c;-><init>(Lh2/y;Lh2/h;)V

    new-instance v9, Lh2/y$b;

    iget-object v4, p0, Lh2/y$d$e;->J:Lh2/y;

    invoke-virtual {v1}, Lh2/y$a;->b()Lh2/z;

    move-result-object v1

    invoke-direct {v9, v4, v1}, Lh2/y$b;-><init>(Lh2/y;Lh2/z;)V

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v6, v3

    invoke-direct/range {v6 .. v12}, Lh2/F;-><init>(LZ8/f;Lh2/X;Lh2/o;Lx7/a;ILy7/k;)V

    iput v2, p0, Lh2/y$d$e;->G:I

    invoke-interface {p1, v3, p0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LZ8/g;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lh2/y$d$e;

    iget-object v1, p0, Lh2/y$d$e;->J:Lh2/y;

    iget-object v2, p0, Lh2/y$d$e;->K:Lh2/P;

    invoke-direct {v0, p3, v1, v2}, Lh2/y$d$e;-><init>(Lm7/e;Lh2/y;Lh2/P;)V

    iput-object p1, v0, Lh2/y$d$e;->H:Ljava/lang/Object;

    iput-object p2, v0, Lh2/y$d$e;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, Lh2/y$d$e;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, Lh2/y$d$e;->H(LZ8/g;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
