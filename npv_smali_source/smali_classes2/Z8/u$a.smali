.class final LZ8/u$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/u;->d(LW8/N;Lm7/i;LZ8/f;LZ8/x;LZ8/I;Ljava/lang/Object;)LW8/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LZ8/I;

.field final synthetic I:LZ8/f;

.field final synthetic J:LZ8/x;

.field final synthetic K:Ljava/lang/Object;


# direct methods
.method constructor <init>(LZ8/I;LZ8/f;LZ8/x;Ljava/lang/Object;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LZ8/u$a;->H:LZ8/I;

    iput-object p2, p0, LZ8/u$a;->I:LZ8/f;

    iput-object p3, p0, LZ8/u$a;->J:LZ8/x;

    iput-object p4, p0, LZ8/u$a;->K:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LZ8/u$a;->G:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LZ8/u$a;->H:LZ8/I;

    sget-object v1, LZ8/I;->a:LZ8/I$a;

    invoke-virtual {v1}, LZ8/I$a;->c()LZ8/I;

    move-result-object v6

    if-ne p1, v6, :cond_4

    iget-object p1, p0, LZ8/u$a;->I:LZ8/f;

    iget-object v1, p0, LZ8/u$a;->J:LZ8/x;

    iput v5, p0, LZ8/u$a;->G:I

    invoke-interface {p1, v1, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_4
    iget-object p1, p0, LZ8/u$a;->H:LZ8/I;

    invoke-virtual {v1}, LZ8/I$a;->d()LZ8/I;

    move-result-object v1

    const/4 v5, 0x0

    if-ne p1, v1, :cond_6

    iget-object p1, p0, LZ8/u$a;->J:LZ8/x;

    invoke-interface {p1}, LZ8/x;->p()LZ8/N;

    move-result-object p1

    new-instance v1, LZ8/u$a$a;

    invoke-direct {v1, v5}, LZ8/u$a$a;-><init>(Lm7/e;)V

    iput v4, p0, LZ8/u$a;->G:I

    invoke-static {p1, v1, p0}, LZ8/h;->v(LZ8/f;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    iget-object p1, p0, LZ8/u$a;->I:LZ8/f;

    iget-object v1, p0, LZ8/u$a;->J:LZ8/x;

    iput v3, p0, LZ8/u$a;->G:I

    invoke-interface {p1, v1, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_6
    iget-object p1, p0, LZ8/u$a;->H:LZ8/I;

    iget-object v1, p0, LZ8/u$a;->J:LZ8/x;

    invoke-interface {v1}, LZ8/x;->p()LZ8/N;

    move-result-object v1

    invoke-interface {p1, v1}, LZ8/I;->a(LZ8/N;)LZ8/f;

    move-result-object p1

    invoke-static {p1}, LZ8/h;->n(LZ8/f;)LZ8/f;

    move-result-object p1

    new-instance v1, LZ8/u$a$b;

    iget-object v3, p0, LZ8/u$a;->I:LZ8/f;

    iget-object v4, p0, LZ8/u$a;->J:LZ8/x;

    iget-object v6, p0, LZ8/u$a;->K:Ljava/lang/Object;

    invoke-direct {v1, v3, v4, v6, v5}, LZ8/u$a$b;-><init>(LZ8/f;LZ8/x;Ljava/lang/Object;Lm7/e;)V

    iput v2, p0, LZ8/u$a;->G:I

    invoke-static {p1, v1, p0}, LZ8/h;->j(LZ8/f;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LZ8/u$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LZ8/u$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LZ8/u$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LZ8/u$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 6

    new-instance p1, LZ8/u$a;

    iget-object v1, p0, LZ8/u$a;->H:LZ8/I;

    iget-object v2, p0, LZ8/u$a;->I:LZ8/f;

    iget-object v3, p0, LZ8/u$a;->J:LZ8/x;

    iget-object v4, p0, LZ8/u$a;->K:Ljava/lang/Object;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LZ8/u$a;-><init>(LZ8/I;LZ8/f;LZ8/x;Ljava/lang/Object;Lm7/e;)V

    return-object p1
.end method
