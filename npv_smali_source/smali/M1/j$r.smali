.class final LM1/j$r;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j;-><init>(LM1/w;Ljava/util/List;LM1/d;LW8/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LM1/j;


# direct methods
.method constructor <init>(LM1/j;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/j$r;->H:LM1/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM1/j$r;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM1/j$r;->H:LM1/j;

    invoke-static {p1}, LM1/j;->e(LM1/j;)LM1/j$b;

    move-result-object p1

    iput v3, p0, LM1/j$r;->G:I

    invoke-virtual {p1, p0}, LM1/s;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object p1, p0, LM1/j$r;->H:LM1/j;

    invoke-static {p1}, LM1/j;->b(LM1/j;)LM1/n;

    move-result-object p1

    invoke-interface {p1}, LM1/n;->e()LZ8/f;

    move-result-object p1

    invoke-static {p1}, LZ8/h;->l(LZ8/f;)LZ8/f;

    move-result-object p1

    new-instance v1, LM1/j$r$a;

    iget-object v3, p0, LM1/j$r;->H:LM1/j;

    invoke-direct {v1, v3}, LM1/j$r$a;-><init>(LM1/j;)V

    iput v2, p0, LM1/j$r;->G:I

    invoke-interface {p1, v1, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM1/j$r;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LM1/j$r;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LM1/j$r;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LM1/j$r;->H(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 1

    new-instance p1, LM1/j$r;

    iget-object v0, p0, LM1/j$r;->H:LM1/j;

    invoke-direct {p1, v0, p2}, LM1/j$r;-><init>(LM1/j;Lm7/e;)V

    return-object p1
.end method
