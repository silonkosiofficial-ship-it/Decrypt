.class final LM1/t$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/t;->e(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field final synthetic I:LM1/t;


# direct methods
.method constructor <init>(LM1/t;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/t$b;->I:LM1/t;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM1/t$b;->H:I

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
    iget-object v1, p0, LM1/t$b;->G:Ljava/lang/Object;

    check-cast v1, Lx7/p;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM1/t$b;->I:LM1/t;

    invoke-static {p1}, LM1/t;->c(LM1/t;)LM1/a;

    move-result-object p1

    invoke-virtual {p1}, LM1/a;->b()I

    move-result p1

    if-lez p1, :cond_6

    :cond_3
    iget-object p1, p0, LM1/t$b;->I:LM1/t;

    invoke-static {p1}, LM1/t;->d(LM1/t;)LW8/N;

    move-result-object p1

    invoke-static {p1}, LW8/O;->g(LW8/N;)V

    iget-object p1, p0, LM1/t$b;->I:LM1/t;

    invoke-static {p1}, LM1/t;->a(LM1/t;)Lx7/p;

    move-result-object v1

    iget-object p1, p0, LM1/t$b;->I:LM1/t;

    invoke-static {p1}, LM1/t;->b(LM1/t;)LY8/j;

    move-result-object p1

    iput-object v1, p0, LM1/t$b;->G:Ljava/lang/Object;

    iput v3, p0, LM1/t$b;->H:I

    invoke-interface {p1, p0}, LY8/B;->b(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    const/4 v4, 0x0

    iput-object v4, p0, LM1/t$b;->G:Ljava/lang/Object;

    iput v2, p0, LM1/t$b;->H:I

    invoke-interface {v1, p1, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    iget-object p1, p0, LM1/t$b;->I:LM1/t;

    invoke-static {p1}, LM1/t;->c(LM1/t;)LM1/a;

    move-result-object p1

    invoke-virtual {p1}, LM1/a;->a()I

    move-result p1

    if-nez p1, :cond_3

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM1/t$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LM1/t$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LM1/t$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LM1/t$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 1

    new-instance p1, LM1/t$b;

    iget-object v0, p0, LM1/t$b;->I:LM1/t;

    invoke-direct {p1, v0, p2}, LM1/t$b;-><init>(LM1/t;Lm7/e;)V

    return-object p1
.end method
