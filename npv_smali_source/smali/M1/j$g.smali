.class final LM1/j$g;
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
.field G:Ljava/lang/Object;

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:LM1/j;


# direct methods
.method constructor <init>(LM1/j;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/j$g;->J:LM1/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM1/j$g;->H:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LM1/j$g;->G:Ljava/lang/Object;

    check-cast v1, LM1/v;

    iget-object v3, p0, LM1/j$g;->I:Ljava/lang/Object;

    check-cast v3, LZ8/g;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, LM1/j$g;->I:Ljava/lang/Object;

    check-cast v1, LZ8/g;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM1/j$g;->I:Ljava/lang/Object;

    check-cast p1, LZ8/g;

    iget-object v1, p0, LM1/j$g;->J:LM1/j;

    iput-object p1, p0, LM1/j$g;->I:Ljava/lang/Object;

    iput v4, p0, LM1/j$g;->H:I

    const/4 v4, 0x0

    invoke-static {v1, v4, p0}, LM1/j;->o(LM1/j;ZLm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v6, v1

    move-object v1, p1

    move-object p1, v6

    :goto_0
    check-cast p1, LM1/v;

    instance-of v4, p1, LM1/e;

    if-eqz v4, :cond_6

    move-object v4, p1

    check-cast v4, LM1/e;

    invoke-virtual {v4}, LM1/e;->c()Ljava/lang/Object;

    move-result-object v4

    iput-object v1, p0, LM1/j$g;->I:Ljava/lang/Object;

    iput-object p1, p0, LM1/j$g;->G:Ljava/lang/Object;

    iput v3, p0, LM1/j$g;->H:I

    invoke-interface {v1, v4, p0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_5

    return-object v0

    :cond_5
    move-object v3, v1

    move-object v1, p1

    :goto_1
    move-object p1, v1

    move-object v1, v3

    goto :goto_2

    :cond_6
    instance-of v3, p1, LM1/z;

    if-nez v3, :cond_a

    instance-of v3, p1, LM1/q;

    if-nez v3, :cond_9

    instance-of v3, p1, LM1/l;

    if-eqz v3, :cond_7

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_7
    :goto_2
    iget-object v3, p0, LM1/j$g;->J:LM1/j;

    invoke-static {v3}, LM1/j;->c(LM1/j;)LM1/k;

    move-result-object v3

    invoke-virtual {v3}, LM1/k;->b()LZ8/f;

    move-result-object v3

    new-instance v4, LM1/j$g$a;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, LM1/j$g$a;-><init>(Lm7/e;)V

    invoke-static {v3, v4}, LZ8/h;->M(LZ8/f;Lx7/p;)LZ8/f;

    move-result-object v3

    new-instance v4, LM1/j$g$b;

    invoke-direct {v4, p1, v5}, LM1/j$g$b;-><init>(LM1/v;Lm7/e;)V

    invoke-static {v3, v4}, LZ8/h;->p(LZ8/f;Lx7/p;)LZ8/f;

    move-result-object p1

    new-instance v3, LM1/j$g$c;

    invoke-direct {v3, p1}, LM1/j$g$c;-><init>(LZ8/f;)V

    iput-object v5, p0, LM1/j$g;->I:Ljava/lang/Object;

    iput-object v5, p0, LM1/j$g;->G:Ljava/lang/Object;

    iput v2, p0, LM1/j$g;->H:I

    invoke-static {v1, v3, p0}, LZ8/h;->r(LZ8/g;LZ8/f;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_9
    check-cast p1, LM1/q;

    invoke-virtual {p1}, LM1/q;->b()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM1/j$g;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LM1/j$g;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LM1/j$g;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LM1/j$g;->H(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LM1/j$g;

    iget-object v1, p0, LM1/j$g;->J:LM1/j;

    invoke-direct {v0, v1, p2}, LM1/j$g;-><init>(LM1/j;Lm7/e;)V

    iput-object p1, v0, LM1/j$g;->I:Ljava/lang/Object;

    return-object v0
.end method
