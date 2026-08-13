.class final LV/y1$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/y1;->e(Lx7/a;)LZ8/f;
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

.field L:I

.field M:I

.field private synthetic N:Ljava/lang/Object;

.field final synthetic O:Lx7/a;


# direct methods
.method constructor <init>(Lx7/a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LV/y1$b;->O:Lx7/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LV/y1$b;->M:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LV/y1$b;->K:Ljava/lang/Object;

    iget-object v6, p0, LV/y1$b;->J:Ljava/lang/Object;

    check-cast v6, Lf0/f;

    iget-object v7, p0, LV/y1$b;->I:Ljava/lang/Object;

    check-cast v7, LY8/j;

    iget-object v8, p0, LV/y1$b;->H:Ljava/lang/Object;

    check-cast v8, Lx7/l;

    iget-object v9, p0, LV/y1$b;->G:Ljava/lang/Object;

    check-cast v9, Lr/L;

    iget-object v10, p0, LV/y1$b;->N:Ljava/lang/Object;

    check-cast v10, LZ8/g;

    :goto_0
    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, LV/y1$b;->L:I

    iget-object v6, p0, LV/y1$b;->K:Ljava/lang/Object;

    iget-object v7, p0, LV/y1$b;->J:Ljava/lang/Object;

    check-cast v7, Lf0/f;

    iget-object v8, p0, LV/y1$b;->I:Ljava/lang/Object;

    check-cast v8, LY8/j;

    iget-object v9, p0, LV/y1$b;->H:Ljava/lang/Object;

    check-cast v9, Lx7/l;

    iget-object v10, p0, LV/y1$b;->G:Ljava/lang/Object;

    check-cast v10, Lr/L;

    iget-object v11, p0, LV/y1$b;->N:Ljava/lang/Object;

    check-cast v11, LZ8/g;

    :try_start_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_2

    :catchall_1
    move-exception p1

    move-object v6, v7

    goto/16 :goto_7

    :cond_2
    iget-object v1, p0, LV/y1$b;->K:Ljava/lang/Object;

    iget-object v6, p0, LV/y1$b;->J:Ljava/lang/Object;

    check-cast v6, Lf0/f;

    iget-object v7, p0, LV/y1$b;->I:Ljava/lang/Object;

    check-cast v7, LY8/j;

    iget-object v8, p0, LV/y1$b;->H:Ljava/lang/Object;

    check-cast v8, Lx7/l;

    iget-object v9, p0, LV/y1$b;->G:Ljava/lang/Object;

    check-cast v9, Lr/L;

    iget-object v10, p0, LV/y1$b;->N:Ljava/lang/Object;

    check-cast v10, LZ8/g;

    goto :goto_0

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LV/y1$b;->N:Ljava/lang/Object;

    move-object v10, p1

    check-cast v10, LZ8/g;

    new-instance v9, Lr/L;

    const/4 p1, 0x0

    invoke-direct {v9, v4, v5, p1}, Lr/L;-><init>(IILy7/k;)V

    new-instance v8, LV/y1$b$a;

    invoke-direct {v8, v9}, LV/y1$b$a;-><init>(Lr/L;)V

    const v1, 0x7fffffff

    const/4 v6, 0x6

    invoke-static {v1, p1, p1, v6, p1}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object v7

    sget-object p1, Lf0/k;->e:Lf0/k$a;

    new-instance v1, LV/y1$b$b;

    invoke-direct {v1, v7}, LV/y1$b$b;-><init>(LY8/j;)V

    invoke-virtual {p1, v1}, Lf0/k$a;->i(Lx7/p;)Lf0/f;

    move-result-object v6

    :try_start_2
    invoke-virtual {p1, v8}, Lf0/k$a;->p(Lx7/l;)Lf0/k;

    move-result-object p1

    iget-object v1, p0, LV/y1$b;->O:Lx7/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {p1}, Lf0/k;->l()Lf0/k;

    move-result-object v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    :try_start_4
    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    :try_start_5
    invoke-virtual {p1, v11}, Lf0/k;->s(Lf0/k;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    invoke-virtual {p1}, Lf0/k;->d()V

    iput-object v10, p0, LV/y1$b;->N:Ljava/lang/Object;

    iput-object v9, p0, LV/y1$b;->G:Ljava/lang/Object;

    iput-object v8, p0, LV/y1$b;->H:Ljava/lang/Object;

    iput-object v7, p0, LV/y1$b;->I:Ljava/lang/Object;

    iput-object v6, p0, LV/y1$b;->J:Ljava/lang/Object;

    iput-object v1, p0, LV/y1$b;->K:Ljava/lang/Object;

    iput v5, p0, LV/y1$b;->M:I

    invoke-interface {v10, v1, p0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    iput-object v10, p0, LV/y1$b;->N:Ljava/lang/Object;

    iput-object v9, p0, LV/y1$b;->G:Ljava/lang/Object;

    iput-object v8, p0, LV/y1$b;->H:Ljava/lang/Object;

    iput-object v7, p0, LV/y1$b;->I:Ljava/lang/Object;

    iput-object v6, p0, LV/y1$b;->J:Ljava/lang/Object;

    iput-object v1, p0, LV/y1$b;->K:Ljava/lang/Object;

    iput v4, p0, LV/y1$b;->L:I

    iput v3, p0, LV/y1$b;->M:I

    invoke-interface {v7, p0}, LY8/B;->b(Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v1

    move v1, v4

    :goto_2
    :try_start_7
    check-cast p1, Ljava/util/Set;

    :cond_6
    if-nez v1, :cond_8

    invoke-static {v10, p1}, LV/y1;->a(Lr/L;Ljava/util/Set;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    move v1, v4

    goto :goto_4

    :cond_8
    :goto_3
    move v1, v5

    :goto_4
    invoke-interface {v8}, LY8/B;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LY8/n;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    if-nez p1, :cond_6

    if-eqz v1, :cond_9

    invoke-virtual {v10}, Lr/L;->m()V

    sget-object p1, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {p1, v9}, Lf0/k$a;->p(Lx7/l;)Lf0/k;

    move-result-object p1

    iget-object v1, p0, LV/y1$b;->O:Lx7/a;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    invoke-virtual {p1}, Lf0/k;->l()Lf0/k;

    move-result-object v12
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :try_start_a
    invoke-virtual {p1, v12}, Lf0/k;->s(Lf0/k;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :try_start_b
    invoke-virtual {p1}, Lf0/k;->d()V

    invoke-static {v1, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    iput-object v11, p0, LV/y1$b;->N:Ljava/lang/Object;

    iput-object v10, p0, LV/y1$b;->G:Ljava/lang/Object;

    iput-object v9, p0, LV/y1$b;->H:Ljava/lang/Object;

    iput-object v8, p0, LV/y1$b;->I:Ljava/lang/Object;

    iput-object v7, p0, LV/y1$b;->J:Ljava/lang/Object;

    iput-object v1, p0, LV/y1$b;->K:Ljava/lang/Object;

    iput v2, p0, LV/y1$b;->M:I

    invoke-interface {v11, v1, p0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    if-ne p1, v0, :cond_a

    return-object v0

    :catchall_2
    move-exception v0

    goto :goto_5

    :catchall_3
    move-exception v0

    :try_start_c
    invoke-virtual {p1, v12}, Lf0/k;->s(Lf0/k;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :goto_5
    :try_start_d
    invoke-virtual {p1}, Lf0/k;->d()V

    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    :cond_9
    move-object v1, v6

    :cond_a
    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    goto :goto_1

    :catchall_4
    move-exception v0

    goto :goto_6

    :catchall_5
    move-exception v0

    :try_start_e
    invoke-virtual {p1, v11}, Lf0/k;->s(Lf0/k;)V

    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    :goto_6
    :try_start_f
    invoke-virtual {p1}, Lf0/k;->d()V

    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    :goto_7
    invoke-interface {v6}, Lf0/f;->e()V

    throw p1
.end method

.method public final H(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LV/y1$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LV/y1$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LV/y1$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LV/y1$b;->H(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LV/y1$b;

    iget-object v1, p0, LV/y1$b;->O:Lx7/a;

    invoke-direct {v0, v1, p2}, LV/y1$b;-><init>(Lx7/a;Lm7/e;)V

    iput-object p1, v0, LV/y1$b;->N:Ljava/lang/Object;

    return-object v0
.end method
