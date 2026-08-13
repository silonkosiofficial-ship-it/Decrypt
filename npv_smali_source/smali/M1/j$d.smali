.class final LM1/j$d;
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

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LM1/j;


# direct methods
.method constructor <init>(LM1/j;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/j$d;->I:LM1/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM1/j$d;->G:I

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

    iget-object p1, p0, LM1/j$d;->H:Ljava/lang/Object;

    check-cast p1, LY8/z;

    sget-object v5, LW8/P;->D:LW8/P;

    new-instance v6, LM1/j$d$d;

    iget-object v1, p0, LM1/j$d;->I:LM1/j;

    const/4 v9, 0x0

    invoke-direct {v6, v1, v9}, LM1/j$d$d;-><init>(LM1/j;Lm7/e;)V

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v8}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object v1

    iget-object v3, p0, LM1/j$d;->I:LM1/j;

    invoke-static {v3}, LM1/j;->d(LM1/j;)LZ8/f;

    move-result-object v3

    new-instance v4, LM1/j$d$a;

    invoke-direct {v4, v1, v9}, LM1/j$d$a;-><init>(LW8/z0;Lm7/e;)V

    invoke-static {v3, v4}, LZ8/h;->H(LZ8/f;Lx7/p;)LZ8/f;

    move-result-object v3

    new-instance v4, LM1/j$d$b;

    invoke-direct {v4, v1, v9}, LM1/j$d$b;-><init>(LW8/z0;Lm7/e;)V

    invoke-static {v3, v4}, LZ8/h;->F(LZ8/f;Lx7/q;)LZ8/f;

    move-result-object v1

    new-instance v3, LM1/j$d$c;

    invoke-direct {v3, p1}, LM1/j$d$c;-><init>(LY8/z;)V

    iput v2, p0, LM1/j$d;->G:I

    invoke-interface {v1, v3, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LY8/z;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM1/j$d;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LM1/j$d;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LM1/j$d;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY8/z;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LM1/j$d;->H(LY8/z;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LM1/j$d;

    iget-object v1, p0, LM1/j$d;->I:LM1/j;

    invoke-direct {v0, v1, p2}, LM1/j$d;-><init>(LM1/j;Lm7/e;)V

    iput-object p1, v0, LM1/j$d;->H:Ljava/lang/Object;

    return-object v0
.end method
