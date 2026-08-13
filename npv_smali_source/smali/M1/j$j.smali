.class final LM1/j$j;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j;->u(ZLm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field final synthetic I:LM1/j;


# direct methods
.method constructor <init>(LM1/j;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/j$j;->I:LM1/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM1/j$j;->H:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LM1/j$j;->G:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, LM1/j$j;->I:LM1/j;

    iput v3, p0, LM1/j$j;->H:I

    invoke-static {p1, v3, p0}, LM1/j;->n(LM1/j;ZLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, LM1/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_1
    iget-object v1, p0, LM1/j$j;->I:LM1/j;

    invoke-static {v1}, LM1/j;->b(LM1/j;)LM1/n;

    move-result-object v1

    iput-object p1, p0, LM1/j$j;->G:Ljava/lang/Object;

    iput v2, p0, LM1/j$j;->H:I

    invoke-interface {v1, p0}, LM1/n;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, p1

    move-object p1, v1

    :goto_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v1, LM1/q;

    invoke-direct {v1, v0, p1}, LM1/q;-><init>(Ljava/lang/Throwable;I)V

    move-object p1, v1

    :goto_3
    invoke-static {v3}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p1

    return-object p1
.end method

.method public final H(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, LM1/j$j;->y(Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LM1/j$j;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p1, v0}, LM1/j$j;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm7/e;

    invoke-virtual {p0, p1}, LM1/j$j;->H(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LM1/j$j;

    iget-object v1, p0, LM1/j$j;->I:LM1/j;

    invoke-direct {v0, v1, p1}, LM1/j$j;-><init>(LM1/j;Lm7/e;)V

    return-object v0
.end method
