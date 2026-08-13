.class final Lh2/H$b$a$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/H$b$a;->b(Lh2/x;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lh2/x;

.field final synthetic I:Lh2/H;

.field final synthetic J:Lh2/F;


# direct methods
.method constructor <init>(Lh2/x;Lh2/H;Lh2/F;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/H$b$a$a;->H:Lh2/x;

    iput-object p2, p0, Lh2/H$b$a$a;->I:Lh2/H;

    iput-object p3, p0, Lh2/H$b$a$a;->J:Lh2/F;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/H$b$a$a;->G:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_4
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_5
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/H$b$a$a;->H:Lh2/x;

    instance-of v1, p1, Lh2/x$b;

    if-eqz v1, :cond_0

    check-cast p1, Lh2/x$b;

    invoke-virtual {p1}, Lh2/x$b;->f()Lh2/t;

    move-result-object p1

    sget-object v1, Lh2/t;->C:Lh2/t;

    if-ne p1, v1, :cond_0

    iget-object v3, p0, Lh2/H$b$a$a;->I:Lh2/H;

    iget-object p1, p0, Lh2/H$b$a$a;->H:Lh2/x;

    check-cast p1, Lh2/x$b;

    invoke-virtual {p1}, Lh2/x$b;->h()Ljava/util/List;

    move-result-object v4

    iget-object p1, p0, Lh2/H$b$a$a;->H:Lh2/x;

    check-cast p1, Lh2/x$b;

    invoke-virtual {p1}, Lh2/x$b;->j()I

    move-result v5

    iget-object p1, p0, Lh2/H$b$a$a;->H:Lh2/x;

    check-cast p1, Lh2/x$b;

    invoke-virtual {p1}, Lh2/x$b;->i()I

    move-result v6

    iget-object p1, p0, Lh2/H$b$a$a;->H:Lh2/x;

    check-cast p1, Lh2/x$b;

    invoke-virtual {p1}, Lh2/x$b;->k()Lh2/s;

    move-result-object v8

    iget-object p1, p0, Lh2/H$b$a$a;->H:Lh2/x;

    check-cast p1, Lh2/x$b;

    invoke-virtual {p1}, Lh2/x$b;->g()Lh2/s;

    move-result-object v9

    iget-object p1, p0, Lh2/H$b$a$a;->J:Lh2/F;

    invoke-virtual {p1}, Lh2/F;->c()Lh2/o;

    move-result-object v10

    const/4 p1, 0x2

    iput p1, p0, Lh2/H$b$a$a;->G:I

    const/4 v7, 0x1

    move-object v11, p0

    invoke-static/range {v3 .. v11}, Lh2/H;->j(Lh2/H;Ljava/util/List;IIZLh2/s;Lh2/s;Lh2/o;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_13

    return-object v0

    :cond_0
    iget-object p1, p0, Lh2/H$b$a$a;->H:Lh2/x;

    instance-of v1, p1, Lh2/x$b;

    if-eqz v1, :cond_f

    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1}, Lh2/H;->c(Lh2/H;)LZ8/y;

    move-result-object p1

    invoke-interface {p1}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x3

    iput p1, p0, Lh2/H$b$a$a;->G:I

    invoke-static {p0}, LW8/g1;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    :goto_0
    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1}, Lh2/H;->h(Lh2/H;)Lh2/C;

    move-result-object v1

    iget-object v3, p0, Lh2/H$b$a$a;->H:Lh2/x;

    invoke-virtual {v1, v3}, Lh2/C;->q(Lh2/x;)Lh2/G;

    move-result-object v1

    const/4 v3, 0x4

    iput v3, p0, Lh2/H$b$a$a;->G:I

    invoke-virtual {p1, v1, p0}, Lh2/H;->r(Lh2/G;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1}, Lh2/H;->a(Lh2/H;)Lh2/v;

    move-result-object p1

    iget-object v0, p0, Lh2/H$b$a$a;->H:Lh2/x;

    check-cast v0, Lh2/x$b;

    invoke-virtual {v0}, Lh2/x$b;->k()Lh2/s;

    move-result-object v0

    iget-object v1, p0, Lh2/H$b$a$a;->H:Lh2/x;

    check-cast v1, Lh2/x$b;

    invoke-virtual {v1}, Lh2/x$b;->g()Lh2/s;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lh2/v;->f(Lh2/s;Lh2/s;)V

    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1}, Lh2/H;->a(Lh2/H;)Lh2/v;

    move-result-object p1

    invoke-virtual {p1}, Lh2/v;->e()LZ8/N;

    move-result-object p1

    invoke-interface {p1}, LZ8/N;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh2/g;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lh2/g;->e()Lh2/s;

    move-result-object p1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_e

    invoke-virtual {p1}, Lh2/s;->e()Lh2/r;

    move-result-object v0

    invoke-virtual {v0}, Lh2/r;->a()Z

    move-result v0

    invoke-virtual {p1}, Lh2/s;->d()Lh2/r;

    move-result-object p1

    invoke-virtual {p1}, Lh2/r;->a()Z

    move-result p1

    iget-object v1, p0, Lh2/H$b$a$a;->H:Lh2/x;

    check-cast v1, Lh2/x$b;

    invoke-virtual {v1}, Lh2/x$b;->f()Lh2/t;

    move-result-object v1

    sget-object v3, Lh2/t;->D:Lh2/t;

    const/4 v4, 0x1

    if-ne v1, v3, :cond_4

    if-nez v0, :cond_5

    :cond_4
    iget-object v0, p0, Lh2/H$b$a$a;->H:Lh2/x;

    check-cast v0, Lh2/x$b;

    invoke-virtual {v0}, Lh2/x$b;->f()Lh2/t;

    move-result-object v0

    sget-object v1, Lh2/t;->E:Lh2/t;

    if-ne v0, v1, :cond_6

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    move p1, v2

    goto :goto_4

    :cond_6
    :goto_3
    move p1, v4

    :goto_4
    iget-object v0, p0, Lh2/H$b$a$a;->H:Lh2/x;

    check-cast v0, Lh2/x$b;

    invoke-virtual {v0}, Lh2/x$b;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_7

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/W;

    invoke-virtual {v1}, Lh2/W;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    move v4, v2

    :cond_9
    :goto_5
    if-nez p1, :cond_b

    :cond_a
    :goto_6
    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1, v2}, Lh2/H;->k(Lh2/H;Z)V

    goto/16 :goto_9

    :cond_b
    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1}, Lh2/H;->e(Lh2/H;)Z

    move-result p1

    if-nez p1, :cond_c

    if-eqz v4, :cond_13

    :cond_c
    if-nez v4, :cond_d

    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1}, Lh2/H;->d(Lh2/H;)I

    move-result p1

    iget-object v0, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {v0}, Lh2/H;->h(Lh2/H;)Lh2/C;

    move-result-object v0

    invoke-virtual {v0}, Lh2/C;->c()I

    move-result v0

    if-lt p1, v0, :cond_d

    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1}, Lh2/H;->d(Lh2/H;)I

    move-result p1

    iget-object v0, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {v0}, Lh2/H;->h(Lh2/H;)Lh2/C;

    move-result-object v0

    invoke-virtual {v0}, Lh2/C;->c()I

    move-result v0

    iget-object v1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {v1}, Lh2/H;->h(Lh2/H;)Lh2/C;

    move-result-object v1

    invoke-virtual {v1}, Lh2/C;->b()I

    move-result v1

    add-int/2addr v0, v1

    if-le p1, v0, :cond_a

    :cond_d
    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1}, Lh2/H;->b(Lh2/H;)Lh2/o;

    move-result-object p1

    if-eqz p1, :cond_13

    iget-object v0, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {v0}, Lh2/H;->h(Lh2/H;)Lh2/C;

    move-result-object v0

    iget-object v1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {v1}, Lh2/H;->d(Lh2/H;)I

    move-result v1

    invoke-virtual {v0, v1}, Lh2/C;->f(I)Lh2/Z$a;

    move-result-object v0

    invoke-interface {p1, v0}, Lh2/o;->a(Lh2/Z;)V

    goto/16 :goto_9

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    instance-of v1, p1, Lh2/x$a;

    if-eqz v1, :cond_12

    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1}, Lh2/H;->c(Lh2/H;)LZ8/y;

    move-result-object p1

    invoke-interface {p1}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_10

    const/4 p1, 0x5

    iput p1, p0, Lh2/H$b$a$a;->G:I

    invoke-static {p0}, LW8/g1;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_10

    return-object v0

    :cond_10
    :goto_7
    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1}, Lh2/H;->h(Lh2/H;)Lh2/C;

    move-result-object v1

    iget-object v3, p0, Lh2/H$b$a$a;->H:Lh2/x;

    invoke-virtual {v1, v3}, Lh2/C;->q(Lh2/x;)Lh2/G;

    move-result-object v1

    const/4 v3, 0x6

    iput v3, p0, Lh2/H$b$a$a;->G:I

    invoke-virtual {p1, v1, p0}, Lh2/H;->r(Lh2/G;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_11

    return-object v0

    :cond_11
    :goto_8
    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1}, Lh2/H;->a(Lh2/H;)Lh2/v;

    move-result-object p1

    iget-object v0, p0, Lh2/H$b$a$a;->H:Lh2/x;

    check-cast v0, Lh2/x$a;

    invoke-virtual {v0}, Lh2/x$a;->c()Lh2/t;

    move-result-object v0

    sget-object v1, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {v1}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v1

    invoke-virtual {p1, v0, v2, v1}, Lh2/v;->g(Lh2/t;ZLh2/r;)V

    goto/16 :goto_6

    :cond_12
    instance-of p1, p1, Lh2/x$c;

    if-eqz p1, :cond_13

    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1}, Lh2/H;->a(Lh2/H;)Lh2/v;

    move-result-object p1

    iget-object v0, p0, Lh2/H$b$a$a;->H:Lh2/x;

    check-cast v0, Lh2/x$c;

    invoke-virtual {v0}, Lh2/x$c;->d()Lh2/s;

    move-result-object v0

    iget-object v1, p0, Lh2/H$b$a$a;->H:Lh2/x;

    check-cast v1, Lh2/x$c;

    invoke-virtual {v1}, Lh2/x$c;->c()Lh2/s;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lh2/v;->f(Lh2/s;Lh2/s;)V

    :cond_13
    :goto_9
    iget-object p1, p0, Lh2/H$b$a$a;->H:Lh2/x;

    instance-of v0, p1, Lh2/x$b;

    if-nez v0, :cond_14

    instance-of p1, p1, Lh2/x$a;

    if-nez p1, :cond_14

    goto :goto_b

    :cond_14
    iget-object p1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    invoke-static {p1}, Lh2/H;->g(Lh2/H;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    goto :goto_a

    :cond_15
    :goto_b
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/H$b$a$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/H$b$a$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/H$b$a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/H$b$a$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, Lh2/H$b$a$a;

    iget-object v0, p0, Lh2/H$b$a$a;->H:Lh2/x;

    iget-object v1, p0, Lh2/H$b$a$a;->I:Lh2/H;

    iget-object v2, p0, Lh2/H$b$a$a;->J:Lh2/F;

    invoke-direct {p1, v0, v1, v2, p2}, Lh2/H$b$a$a;-><init>(Lh2/x;Lh2/H;Lh2/F;Lm7/e;)V

    return-object p1
.end method
