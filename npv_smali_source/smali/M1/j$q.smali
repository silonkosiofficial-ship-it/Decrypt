.class final LM1/j$q;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j;->y(Lx7/p;Lm7/i;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field final synthetic I:LM1/j;

.field final synthetic J:Lm7/i;

.field final synthetic K:Lx7/p;


# direct methods
.method constructor <init>(LM1/j;Lm7/i;Lx7/p;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/j$q;->I:LM1/j;

    iput-object p2, p0, LM1/j$q;->J:Lm7/i;

    iput-object p3, p0, LM1/j$q;->K:Lx7/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM1/j$q;->H:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LM1/j$q;->G:Ljava/lang/Object;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LM1/j$q;->G:Ljava/lang/Object;

    check-cast v1, LM1/e;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM1/j$q;->I:LM1/j;

    iput v4, p0, LM1/j$q;->H:I

    invoke-static {p1, v4, p0}, LM1/j;->n(LM1/j;ZLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    move-object v1, p1

    check-cast v1, LM1/e;

    iget-object p1, p0, LM1/j$q;->J:Lm7/i;

    new-instance v5, LM1/j$q$a;

    iget-object v6, p0, LM1/j$q;->K:Lx7/p;

    const/4 v7, 0x0

    invoke-direct {v5, v6, v1, v7}, LM1/j$q$a;-><init>(Lx7/p;LM1/e;Lm7/e;)V

    iput-object v1, p0, LM1/j$q;->G:Ljava/lang/Object;

    iput v3, p0, LM1/j$q;->H:I

    invoke-static {p1, v5, p0}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    invoke-virtual {v1}, LM1/e;->b()V

    invoke-virtual {v1}, LM1/e;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, LM1/j$q;->I:LM1/j;

    iput-object p1, p0, LM1/j$q;->G:Ljava/lang/Object;

    iput v2, p0, LM1/j$q;->H:I

    invoke-virtual {v1, p1, v4, p0}, LM1/j;->z(Ljava/lang/Object;ZLm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    return-object v0

    :cond_6
    move-object v0, p1

    :goto_2
    move-object p1, v0

    :cond_7
    return-object p1
.end method

.method public final H(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, LM1/j$q;->y(Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LM1/j$q;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p1, v0}, LM1/j$q;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm7/e;

    invoke-virtual {p0, p1}, LM1/j$q;->H(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, LM1/j$q;

    iget-object v1, p0, LM1/j$q;->I:LM1/j;

    iget-object v2, p0, LM1/j$q;->J:Lm7/i;

    iget-object v3, p0, LM1/j$q;->K:Lx7/p;

    invoke-direct {v0, v1, v2, v3, p1}, LM1/j$q;-><init>(LM1/j;Lm7/i;Lx7/p;Lm7/e;)V

    return-object v0
.end method
