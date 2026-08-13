.class final LS5/B$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS5/B;->a(LS5/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:Ljava/lang/Object;

.field M:I

.field final synthetic N:LS5/B;

.field final synthetic O:LS5/y;


# direct methods
.method constructor <init>(LS5/B;LS5/y;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS5/B$b;->N:LS5/B;

    iput-object p2, p0, LS5/B$b;->O:LS5/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LS5/B$b;->M:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LS5/B$b;->L:Ljava/lang/Object;

    check-cast v0, LU5/f;

    iget-object v1, p0, LS5/B$b;->K:Ljava/lang/Object;

    check-cast v1, LS5/y;

    iget-object v2, p0, LS5/B$b;->J:Ljava/lang/Object;

    check-cast v2, LQ4/f;

    iget-object v3, p0, LS5/B$b;->I:Ljava/lang/Object;

    check-cast v3, LS5/A;

    iget-object v4, p0, LS5/B$b;->H:Ljava/lang/Object;

    check-cast v4, LS5/B;

    iget-object v5, p0, LS5/B$b;->G:Ljava/lang/Object;

    check-cast v5, LS5/s;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v7, v4

    move-object v8, v3

    move-object v3, v0

    move-object v0, v8

    move-object v9, v2

    move-object v2, v1

    move-object v1, v9

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LS5/B$b;->N:LS5/B;

    iput v4, p0, LS5/B$b;->M:I

    invoke-static {p1, p0}, LS5/B;->f(LS5/B;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, LS5/s;->c:LS5/s$a;

    iget-object v1, p0, LS5/B$b;->N:LS5/B;

    invoke-static {v1}, LS5/B;->d(LS5/B;)LG5/e;

    move-result-object v1

    iput v3, p0, LS5/B$b;->M:I

    invoke-virtual {p1, v1, p0}, LS5/s$a;->a(LG5/e;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    move-object v5, p1

    check-cast v5, LS5/s;

    iget-object v4, p0, LS5/B$b;->N:LS5/B;

    sget-object v3, LS5/A;->a:LS5/A;

    invoke-static {v4}, LS5/B;->c(LS5/B;)LQ4/f;

    move-result-object p1

    iget-object v1, p0, LS5/B$b;->O:LS5/y;

    iget-object v6, p0, LS5/B$b;->N:LS5/B;

    invoke-static {v6}, LS5/B;->e(LS5/B;)LU5/f;

    move-result-object v6

    sget-object v7, LT5/a;->a:LT5/a;

    iput-object v5, p0, LS5/B$b;->G:Ljava/lang/Object;

    iput-object v4, p0, LS5/B$b;->H:Ljava/lang/Object;

    iput-object v3, p0, LS5/B$b;->I:Ljava/lang/Object;

    iput-object p1, p0, LS5/B$b;->J:Ljava/lang/Object;

    iput-object v1, p0, LS5/B$b;->K:Ljava/lang/Object;

    iput-object v6, p0, LS5/B$b;->L:Ljava/lang/Object;

    iput v2, p0, LS5/B$b;->M:I

    invoke-virtual {v7, p0}, LT5/a;->c(Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_6

    return-object v0

    :cond_6
    move-object v0, v3

    move-object v7, v4

    move-object v3, v6

    move-object v8, v1

    move-object v1, p1

    move-object p1, v2

    move-object v2, v8

    :goto_2
    move-object v4, p1

    check-cast v4, Ljava/util/Map;

    invoke-virtual {v5}, LS5/s;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5}, LS5/s;->a()Ljava/lang/String;

    move-result-object v6

    move-object v5, p1

    invoke-virtual/range {v0 .. v6}, LS5/A;->a(LQ4/f;LS5/y;LU5/f;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)LS5/z;

    move-result-object p1

    invoke-static {v7, p1}, LS5/B;->b(LS5/B;LS5/z;)V

    :cond_7
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS5/B$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS5/B$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS5/B$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS5/B$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, LS5/B$b;

    iget-object v0, p0, LS5/B$b;->N:LS5/B;

    iget-object v1, p0, LS5/B$b;->O:LS5/y;

    invoke-direct {p1, v0, v1, p2}, LS5/B$b;-><init>(LS5/B;LS5/y;Lm7/e;)V

    return-object p1
.end method
