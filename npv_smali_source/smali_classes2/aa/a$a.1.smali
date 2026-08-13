.class final Laa/a$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/a;->c(Ljava/lang/Object;Lx7/l;Lm7/e;)Ljava/lang/Object;
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

.field K:I

.field private synthetic L:Ljava/lang/Object;

.field final synthetic M:Laa/a;

.field final synthetic N:Ljava/lang/Object;

.field final synthetic O:Lx7/l;


# direct methods
.method constructor <init>(Laa/a;Ljava/lang/Object;Lx7/l;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Laa/a$a;->M:Laa/a;

    iput-object p2, p0, Laa/a$a;->N:Ljava/lang/Object;

    iput-object p3, p0, Laa/a$a;->O:Lx7/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Laa/a$a;->K:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Laa/a$a;->J:Ljava/lang/Object;

    check-cast v1, Lx7/l;

    iget-object v3, p0, Laa/a$a;->I:Ljava/lang/Object;

    iget-object v5, p0, Laa/a$a;->H:Ljava/lang/Object;

    check-cast v5, Laa/a;

    iget-object v6, p0, Laa/a$a;->G:Ljava/lang/Object;

    check-cast v6, Lf9/a;

    iget-object v7, p0, Laa/a$a;->L:Ljava/lang/Object;

    check-cast v7, LW8/N;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Laa/a$a;->L:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, LW8/N;

    iget-object p1, p0, Laa/a$a;->M:Laa/a;

    invoke-static {p1}, Laa/a;->b(Laa/a;)Lf9/a;

    move-result-object v6

    iget-object v5, p0, Laa/a$a;->M:Laa/a;

    iget-object p1, p0, Laa/a$a;->N:Ljava/lang/Object;

    iget-object v1, p0, Laa/a$a;->O:Lx7/l;

    iput-object v7, p0, Laa/a$a;->L:Ljava/lang/Object;

    iput-object v6, p0, Laa/a$a;->G:Ljava/lang/Object;

    iput-object v5, p0, Laa/a$a;->H:Ljava/lang/Object;

    iput-object p1, p0, Laa/a$a;->I:Ljava/lang/Object;

    iput-object v1, p0, Laa/a$a;->J:Ljava/lang/Object;

    iput v3, p0, Laa/a$a;->K:I

    invoke-interface {v6, v4, p0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v3, p1

    :goto_0
    :try_start_0
    invoke-static {v5}, Laa/a;->a(Laa/a;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LW8/V;

    if-eqz p1, :cond_4

    invoke-interface {p1}, LW8/z0;->isCancelled()Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    :goto_1
    sget-object v9, LW8/P;->D:LW8/P;

    new-instance v10, Laa/a$a$a;

    invoke-direct {v10, v1, v4}, Laa/a$a$a;-><init>(Lx7/l;Lm7/e;)V

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v8, 0x0

    invoke-static/range {v7 .. v12}, LW8/g;->b(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/V;

    move-result-object p1

    invoke-static {v5}, Laa/a;->a(Laa/a;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    invoke-interface {v6, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    iput-object v4, p0, Laa/a$a;->L:Ljava/lang/Object;

    iput-object v4, p0, Laa/a$a;->G:Ljava/lang/Object;

    iput-object v4, p0, Laa/a$a;->H:Ljava/lang/Object;

    iput-object v4, p0, Laa/a$a;->I:Ljava/lang/Object;

    iput-object v4, p0, Laa/a$a;->J:Ljava/lang/Object;

    iput v2, p0, Laa/a$a;->K:I

    invoke-interface {p1, p0}, LW8/V;->d1(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_2
    return-object p1

    :goto_3
    invoke-interface {v6, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Laa/a$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Laa/a$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Laa/a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Laa/a$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, Laa/a$a;

    iget-object v1, p0, Laa/a$a;->M:Laa/a;

    iget-object v2, p0, Laa/a$a;->N:Ljava/lang/Object;

    iget-object v3, p0, Laa/a$a;->O:Lx7/l;

    invoke-direct {v0, v1, v2, v3, p2}, Laa/a$a;-><init>(Laa/a;Ljava/lang/Object;Lx7/l;Lm7/e;)V

    iput-object p1, v0, Laa/a$a;->L:Ljava/lang/Object;

    return-object v0
.end method
