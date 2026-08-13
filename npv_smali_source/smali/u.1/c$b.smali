.class final Lu/c$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/c;->e(Ljava/lang/Object;Lu/x0;Lu/j;Ljava/lang/Object;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:LY8/j;

.field final synthetic K:Lu/a;

.field final synthetic L:LV/G1;

.field final synthetic M:LV/G1;


# direct methods
.method constructor <init>(LY8/j;Lu/a;LV/G1;LV/G1;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lu/c$b;->J:LY8/j;

    iput-object p2, p0, Lu/c$b;->K:Lu/a;

    iput-object p3, p0, Lu/c$b;->L:LV/G1;

    iput-object p4, p0, Lu/c$b;->M:LV/G1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu/c$b;->H:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lu/c$b;->G:Ljava/lang/Object;

    check-cast v1, LY8/l;

    iget-object v3, p0, Lu/c$b;->I:Ljava/lang/Object;

    check-cast v3, LW8/N;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v4, p1

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lu/c$b;->I:Ljava/lang/Object;

    check-cast v1, LW8/N;

    iget-object v3, p0, Lu/c$b;->J:LY8/j;

    invoke-interface {v3}, LY8/B;->iterator()LY8/l;

    move-result-object v3

    move-object v12, v3

    move-object v3, v1

    move-object v1, v12

    :goto_0
    iput-object v3, p0, Lu/c$b;->I:Ljava/lang/Object;

    iput-object v1, p0, Lu/c$b;->G:Ljava/lang/Object;

    iput v2, p0, Lu/c$b;->H:I

    invoke-interface {v1, p0}, LY8/l;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, LY8/l;->next()Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Lu/c$b;->J:LY8/j;

    invoke-interface {v5}, LY8/B;->a()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, LY8/n;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_3

    move-object v7, v4

    goto :goto_2

    :cond_3
    move-object v7, v5

    :goto_2
    new-instance v4, Lu/c$b$a;

    iget-object v8, p0, Lu/c$b;->K:Lu/a;

    iget-object v9, p0, Lu/c$b;->L:LV/G1;

    iget-object v10, p0, Lu/c$b;->M:LV/G1;

    const/4 v11, 0x0

    move-object v6, v4

    invoke-direct/range {v6 .. v11}, Lu/c$b$a;-><init>(Ljava/lang/Object;Lu/a;LV/G1;LV/G1;Lm7/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, v3

    move-object v8, v4

    invoke-static/range {v5 .. v10}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    goto :goto_0

    :cond_4
    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu/c$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lu/c$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lu/c$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lu/c$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance v6, Lu/c$b;

    iget-object v1, p0, Lu/c$b;->J:LY8/j;

    iget-object v2, p0, Lu/c$b;->K:Lu/a;

    iget-object v3, p0, Lu/c$b;->L:LV/G1;

    iget-object v4, p0, Lu/c$b;->M:LV/G1;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lu/c$b;-><init>(LY8/j;Lu/a;LV/G1;LV/G1;Lm7/e;)V

    iput-object p1, v6, Lu/c$b;->I:Ljava/lang/Object;

    return-object v6
.end method
