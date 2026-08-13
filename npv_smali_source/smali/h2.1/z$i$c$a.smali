.class final Lh2/z$i$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z$i$c;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/z$i$c$a$a;
    }
.end annotation


# instance fields
.field final synthetic C:Lh2/z;

.field final synthetic D:LW8/N;


# direct methods
.method constructor <init>(Lh2/z;LW8/N;)V
    .locals 0

    iput-object p1, p0, Lh2/z$i$c$a;->C:Lh2/z;

    iput-object p2, p0, Lh2/z$i$c$a;->D:LW8/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li7/M;

    invoke-virtual {p0, p1, p2}, Lh2/z$i$c$a;->b(Li7/M;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Li7/M;Lm7/e;)Ljava/lang/Object;
    .locals 13

    .prologue
    instance-of p1, p2, Lh2/z$i$c$a$b;

    if-eqz p1, :cond_0

    move-object p1, p2

    check-cast p1, Lh2/z$i$c$a$b;

    iget v0, p1, Lh2/z$i$c$a$b;->P:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p1, Lh2/z$i$c$a$b;->P:I

    goto :goto_0

    :cond_0
    new-instance p1, Lh2/z$i$c$a$b;

    invoke-direct {p1, p0, p2}, Lh2/z$i$c$a$b;-><init>(Lh2/z$i$c$a;Lm7/e;)V

    :goto_0
    iget-object p2, p1, Lh2/z$i$c$a$b;->N:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p1, Lh2/z$i$c$a$b;->P:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v0, Lf9/a;

    iget-object v1, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v1, Lh2/B$a;

    iget-object v2, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v2, LW8/N;

    iget-object p1, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast p1, Lh2/z;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_1a

    :pswitch_1
    iget-object v1, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v1, Lh2/t;

    iget-object v2, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v2, LW8/N;

    iget-object v4, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v4, Lh2/z;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v11, v4

    move-object v4, v1

    move-object v1, v11

    goto/16 :goto_19

    :pswitch_2
    iget-object v1, p1, Lh2/z$i$c$a$b;->L:Ljava/lang/Object;

    check-cast v1, Lh2/z;

    iget-object v2, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    check-cast v2, Lh2/t;

    iget-object v4, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    check-cast v4, Lf9/a;

    iget-object v5, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v5, Lh2/B$a;

    iget-object v6, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v6, Lh2/t;

    iget-object v7, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v7, LW8/N;

    iget-object v8, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v8, Lh2/z;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_17

    :pswitch_3
    iget-object v1, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v4, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v4, Lh2/t;

    iget-object v5, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v5, LW8/N;

    iget-object v6, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v6, Lh2/z;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_14

    :catchall_0
    move-exception p1

    goto/16 :goto_15

    :pswitch_4
    iget-object v1, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v4, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v4, Lh2/B$a;

    iget-object v5, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v5, Lh2/t;

    iget-object v6, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v6, LW8/N;

    iget-object v7, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v7, Lh2/z;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p2, v7

    goto/16 :goto_13

    :pswitch_5
    iget-object v1, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v4, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v4, Lh2/B$a;

    iget-object v5, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v5, LW8/N;

    iget-object v6, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v6, Lh2/z;

    iget-object v7, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v7, Lh2/s;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_11

    :pswitch_6
    iget-object v1, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v1, Lh2/t;

    iget-object v4, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v4, LW8/N;

    iget-object v5, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v5, Lh2/z;

    iget-object v6, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v6, Lh2/s;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    goto/16 :goto_10

    :pswitch_7
    iget-object v1, p1, Lh2/z$i$c$a$b;->M:Ljava/lang/Object;

    check-cast v1, Lh2/z;

    iget-object v4, p1, Lh2/z$i$c$a$b;->L:Ljava/lang/Object;

    check-cast v4, Lh2/t;

    iget-object v5, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    check-cast v5, Lf9/a;

    iget-object v6, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    check-cast v6, Lh2/B$a;

    iget-object v7, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v7, Lh2/t;

    iget-object v8, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v8, LW8/N;

    iget-object v9, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v9, Lh2/z;

    iget-object v10, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v10, Lh2/s;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_e

    :pswitch_8
    iget-object v1, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v4, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v4, Lh2/t;

    iget-object v5, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v5, LW8/N;

    iget-object v6, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v6, Lh2/z;

    iget-object v7, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v7, Lh2/s;

    :try_start_1
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_b

    :catchall_1
    move-exception p1

    goto/16 :goto_c

    :pswitch_9
    iget-object v1, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v4, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    check-cast v4, Lh2/B$a;

    iget-object v5, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v5, Lh2/t;

    iget-object v6, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v6, LW8/N;

    iget-object v7, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v7, Lh2/z;

    iget-object v8, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v8, Lh2/s;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p2, v7

    move-object v7, v8

    goto/16 :goto_a

    :pswitch_a
    iget-object v1, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v4, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v4, Lh2/B$a;

    iget-object v5, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v5, LW8/N;

    iget-object v6, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v6, Lh2/z;

    iget-object v7, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v7, Lh2/s;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_b
    iget-object v1, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v1, Lh2/t;

    iget-object v4, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v4, LW8/N;

    iget-object v5, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v5, Lh2/z;

    iget-object v6, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v6, Lh2/s;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    goto/16 :goto_7

    :pswitch_c
    iget-object v1, p1, Lh2/z$i$c$a$b;->M:Ljava/lang/Object;

    check-cast v1, Lh2/z;

    iget-object v4, p1, Lh2/z$i$c$a$b;->L:Ljava/lang/Object;

    check-cast v4, Lh2/t;

    iget-object v5, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    check-cast v5, Lf9/a;

    iget-object v6, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    check-cast v6, Lh2/B$a;

    iget-object v7, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v7, Lh2/t;

    iget-object v8, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v8, LW8/N;

    iget-object v9, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v9, Lh2/z;

    iget-object v10, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v10, Lh2/s;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_d
    iget-object v1, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v4, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v4, Lh2/t;

    iget-object v5, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v5, LW8/N;

    iget-object v6, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v6, Lh2/z;

    iget-object v7, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v7, Lh2/s;

    :try_start_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    goto :goto_2

    :pswitch_e
    iget-object v1, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v4, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    check-cast v4, Lh2/B$a;

    iget-object v5, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v5, Lh2/t;

    iget-object v6, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v6, LW8/N;

    iget-object v7, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v7, Lh2/z;

    iget-object v8, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v8, Lh2/s;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_3
    invoke-static {v4}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p2

    iput-object v8, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object v7, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v6, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v5, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    const/4 v4, 0x3

    iput v4, p1, Lh2/z$i$c$a$b;->P:I

    invoke-static {v7, p2, v5, p1}, Lh2/z;->m(Lh2/z;Lh2/B;Lh2/t;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_1

    return-object v0

    :cond_1
    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    :goto_1
    sget-object p2, Li7/M;->a:Li7/M;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    move-object v8, v5

    move-object v1, v6

    move-object v10, v7

    goto/16 :goto_4

    :goto_2
    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :pswitch_f
    iget-object v1, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v4, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    check-cast v4, Lh2/z;

    iget-object v5, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    check-cast v5, Lh2/B$a;

    iget-object v6, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    check-cast v6, Lh2/z$i$c$a;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_10
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lh2/z$i$c$a;->C:Lh2/z;

    invoke-static {p2}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object v5

    iget-object v4, p0, Lh2/z$i$c$a;->C:Lh2/z;

    invoke-static {v5}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v1

    iput-object p0, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object v5, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput v2, p1, Lh2/z$i$c$a$b;->P:I

    invoke-interface {v1, v3, p1}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_2

    return-object v0

    :cond_2
    move-object v6, p0

    :goto_3
    :try_start_4
    invoke-static {v5}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p2

    invoke-virtual {p2}, Lh2/B;->p()Lh2/w;

    move-result-object v5

    invoke-virtual {v5}, Lh2/w;->d()Lh2/s;

    move-result-object v5

    invoke-static {v4}, Lh2/z;->e(Lh2/z;)Lh2/m;

    move-result-object v4

    invoke-virtual {v4}, Lh2/m;->b()Lh2/Z$a;

    move-result-object v4

    invoke-virtual {p2, v4}, Lh2/B;->g(Lh2/Z$a;)Lh2/M;

    move-result-object p2

    invoke-static {v5, p2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_9

    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    invoke-virtual {p2}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/s;

    invoke-virtual {p2}, Li7/u;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lh2/M;

    iget-object v4, v6, Lh2/z$i$c$a;->C:Lh2/z;

    invoke-virtual {v4}, Lh2/z;->w()Lh2/Q;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-interface {v4, p2}, Lh2/Q;->a(Lh2/M;)V

    sget-object p2, Li7/M;->a:Li7/M;

    :cond_3
    iget-object p2, v6, Lh2/z$i$c$a;->C:Lh2/z;

    iget-object v4, v6, Lh2/z$i$c$a;->D:LW8/N;

    sget-object v5, Lh2/t;->C:Lh2/t;

    invoke-virtual {v1}, Lh2/s;->f()Lh2/r;

    move-result-object v6

    instance-of v6, v6, Lh2/r$a;

    if-eqz v6, :cond_9

    move-object v10, v1

    move-object v8, v4

    move-object v4, v5

    move-object v1, p2

    :goto_4
    sget-object p2, Lh2/z$i$c$a$a;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget p2, p2, v5

    if-ne p2, v2, :cond_4

    move-object v5, v1

    move-object p2, v3

    move-object v6, v4

    goto :goto_6

    :cond_4
    invoke-static {v1}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object v6

    invoke-static {v6}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v5

    iput-object v10, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v8, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput-object v6, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    iput-object v5, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->L:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->M:Ljava/lang/Object;

    const/4 p2, 0x4

    iput p2, p1, Lh2/z$i$c$a$b;->P:I

    invoke-interface {v5, v3, p1}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    return-object v0

    :cond_5
    move-object v9, v1

    move-object v7, v4

    :goto_5
    :try_start_5
    invoke-static {v6}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p2

    invoke-virtual {p2}, Lh2/B;->k()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lh2/Z;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    invoke-interface {v5, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    move-object v5, v1

    move-object v6, v4

    move-object v4, v7

    move-object v1, v9

    :goto_6
    iput-object v10, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v8, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->L:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->M:Ljava/lang/Object;

    const/4 v7, 0x5

    iput v7, p1, Lh2/z$i$c$a$b;->P:I

    invoke-static {v5, v6, p2, p1}, Lh2/z;->l(Lh2/z;Lh2/t;Lh2/Z;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_6

    return-object v0

    :cond_6
    move-object v6, v1

    move-object v1, v4

    move-object v5, v8

    move-object v7, v10

    :goto_7
    sget-object p2, Lh2/t;->C:Lh2/t;

    if-ne v1, p2, :cond_8

    invoke-static {v6}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object v4

    invoke-static {v4}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v1

    iput-object v7, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object v6, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v5, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    const/4 p2, 0x6

    iput p2, p1, Lh2/z$i$c$a$b;->P:I

    invoke-interface {v1, v3, p1}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_7

    return-object v0

    :cond_7
    :goto_8
    :try_start_6
    invoke-static {v4}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p2

    invoke-virtual {p2}, Lh2/B;->p()Lh2/w;

    move-result-object p2

    sget-object v4, Lh2/t;->C:Lh2/t;

    invoke-virtual {p2, v4}, Lh2/w;->a(Lh2/t;)Lh2/r;

    move-result-object p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    instance-of p2, p2, Lh2/r$a;

    if-nez p2, :cond_8

    invoke-static {v6, v5}, Lh2/z;->n(Lh2/z;LW8/N;)V

    :cond_8
    move-object v4, v5

    move-object p2, v6

    move-object v1, v7

    goto :goto_9

    :catchall_3
    move-exception p1

    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :catchall_4
    move-exception p1

    invoke-interface {v5, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :cond_9
    :goto_9
    sget-object v5, Lh2/t;->D:Lh2/t;

    invoke-virtual {v1}, Lh2/s;->e()Lh2/r;

    move-result-object v6

    instance-of v6, v6, Lh2/r$a;

    if-eqz v6, :cond_12

    sget-object v6, Lh2/t;->C:Lh2/t;

    if-eq v5, v6, :cond_c

    invoke-static {p2}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object v6

    invoke-static {v6}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v7

    iput-object v1, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object p2, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v5, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput-object v6, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    iput-object v7, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    const/4 v8, 0x7

    iput v8, p1, Lh2/z$i$c$a$b;->P:I

    invoke-interface {v7, v3, p1}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v0, :cond_a

    return-object v0

    :cond_a
    move-object v11, v7

    move-object v7, v1

    move-object v1, v11

    move-object v12, v6

    move-object v6, v4

    move-object v4, v12

    :goto_a
    :try_start_7
    invoke-static {v4}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object v4

    iput-object v7, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object p2, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v6, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v5, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    const/16 v8, 0x8

    iput v8, p1, Lh2/z$i$c$a$b;->P:I

    invoke-static {p2, v4, v5, p1}, Lh2/z;->m(Lh2/z;Lh2/B;Lh2/t;Lm7/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_b

    return-object v0

    :cond_b
    move-object v4, v5

    move-object v5, v6

    move-object v6, p2

    :goto_b
    sget-object p2, Li7/M;->a:Li7/M;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    move-object v8, v5

    move-object v1, v6

    move-object v10, v7

    goto :goto_d

    :goto_c
    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :cond_c
    move-object v10, v1

    move-object v8, v4

    move-object v4, v5

    move-object v1, p2

    :goto_d
    sget-object p2, Lh2/z$i$c$a$a;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget p2, p2, v5

    if-ne p2, v2, :cond_d

    move-object v5, v1

    move-object p2, v3

    move-object v6, v4

    goto :goto_f

    :cond_d
    invoke-static {v1}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object v6

    invoke-static {v6}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v5

    iput-object v10, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v8, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput-object v6, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    iput-object v5, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->L:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->M:Ljava/lang/Object;

    const/16 p2, 0x9

    iput p2, p1, Lh2/z$i$c$a$b;->P:I

    invoke-interface {v5, v3, p1}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_e

    return-object v0

    :cond_e
    move-object v9, v1

    move-object v7, v4

    :goto_e
    :try_start_8
    invoke-static {v6}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p2

    invoke-virtual {p2}, Lh2/B;->k()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lh2/Z;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    invoke-interface {v5, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    move-object v5, v1

    move-object v6, v4

    move-object v4, v7

    move-object v1, v9

    :goto_f
    iput-object v10, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v8, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->L:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->M:Ljava/lang/Object;

    const/16 v7, 0xa

    iput v7, p1, Lh2/z$i$c$a$b;->P:I

    invoke-static {v5, v6, p2, p1}, Lh2/z;->l(Lh2/z;Lh2/t;Lh2/Z;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_f

    return-object v0

    :cond_f
    move-object v6, v1

    move-object v1, v4

    move-object v5, v8

    move-object v7, v10

    :goto_10
    sget-object p2, Lh2/t;->C:Lh2/t;

    if-ne v1, p2, :cond_11

    invoke-static {v6}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object v4

    invoke-static {v4}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v1

    iput-object v7, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object v6, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v5, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    const/16 p2, 0xb

    iput p2, p1, Lh2/z$i$c$a$b;->P:I

    invoke-interface {v1, v3, p1}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_10

    return-object v0

    :cond_10
    :goto_11
    :try_start_9
    invoke-static {v4}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p2

    invoke-virtual {p2}, Lh2/B;->p()Lh2/w;

    move-result-object p2

    sget-object v4, Lh2/t;->C:Lh2/t;

    invoke-virtual {p2, v4}, Lh2/w;->a(Lh2/t;)Lh2/r;

    move-result-object p2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    instance-of p2, p2, Lh2/r$a;

    if-nez p2, :cond_11

    invoke-static {v6, v5}, Lh2/z;->n(Lh2/z;LW8/N;)V

    :cond_11
    move-object v4, v5

    move-object p2, v6

    move-object v1, v7

    goto :goto_12

    :catchall_5
    move-exception p1

    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :catchall_6
    move-exception p1

    invoke-interface {v5, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :cond_12
    :goto_12
    sget-object v5, Lh2/t;->E:Lh2/t;

    invoke-virtual {v1}, Lh2/s;->d()Lh2/r;

    move-result-object v1

    instance-of v1, v1, Lh2/r$a;

    if-eqz v1, :cond_1a

    sget-object v1, Lh2/t;->C:Lh2/t;

    if-eq v5, v1, :cond_15

    invoke-static {p2}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object v1

    invoke-static {v1}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v6

    iput-object p2, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v5, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput-object v6, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    const/16 v7, 0xc

    iput v7, p1, Lh2/z$i$c$a$b;->P:I

    invoke-interface {v6, v3, p1}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_13

    return-object v0

    :cond_13
    move-object v11, v4

    move-object v4, v1

    move-object v1, v6

    move-object v6, v11

    :goto_13
    :try_start_a
    invoke-static {v4}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object v4

    iput-object p2, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object v6, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v5, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    const/16 v7, 0xd

    iput v7, p1, Lh2/z$i$c$a$b;->P:I

    invoke-static {p2, v4, v5, p1}, Lh2/z;->m(Lh2/z;Lh2/B;Lh2/t;Lm7/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_14

    return-object v0

    :cond_14
    move-object v4, v5

    move-object v5, v6

    move-object v6, p2

    :goto_14
    sget-object p2, Li7/M;->a:Li7/M;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    move-object v7, v5

    move-object v1, v6

    goto :goto_16

    :goto_15
    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :cond_15
    move-object v1, p2

    move-object v7, v4

    move-object v4, v5

    :goto_16
    sget-object p2, Lh2/z$i$c$a$a;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget p2, p2, v5

    if-ne p2, v2, :cond_16

    move-object v2, v1

    move-object p2, v3

    move-object v5, v4

    goto :goto_18

    :cond_16
    invoke-static {v1}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object v5

    invoke-static {v5}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object p2

    iput-object v1, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object v7, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v5, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput-object p2, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    iput-object v1, p1, Lh2/z$i$c$a$b;->L:Ljava/lang/Object;

    const/16 v2, 0xe

    iput v2, p1, Lh2/z$i$c$a$b;->P:I

    invoke-interface {p2, v3, p1}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_17

    return-object v0

    :cond_17
    move-object v8, v1

    move-object v2, v4

    move-object v6, v2

    move-object v4, p2

    :goto_17
    :try_start_b
    invoke-static {v5}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p2

    invoke-virtual {p2}, Lh2/B;->k()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lh2/Z;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    invoke-interface {v4, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    move-object v5, v2

    move-object v4, v6

    move-object v2, v1

    move-object v1, v8

    :goto_18
    iput-object v1, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object v7, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->J:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->K:Ljava/lang/Object;

    iput-object v3, p1, Lh2/z$i$c$a$b;->L:Ljava/lang/Object;

    const/16 v6, 0xf

    iput v6, p1, Lh2/z$i$c$a$b;->P:I

    invoke-static {v2, v5, p2, p1}, Lh2/z;->l(Lh2/z;Lh2/t;Lh2/Z;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_18

    return-object v0

    :cond_18
    move-object v2, v7

    :goto_19
    sget-object p2, Lh2/t;->C:Lh2/t;

    if-ne v4, p2, :cond_1a

    invoke-static {v1}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object p2

    invoke-static {p2}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v4

    iput-object v1, p1, Lh2/z$i$c$a$b;->F:Ljava/lang/Object;

    iput-object v2, p1, Lh2/z$i$c$a$b;->G:Ljava/lang/Object;

    iput-object p2, p1, Lh2/z$i$c$a$b;->H:Ljava/lang/Object;

    iput-object v4, p1, Lh2/z$i$c$a$b;->I:Ljava/lang/Object;

    const/16 v5, 0x10

    iput v5, p1, Lh2/z$i$c$a$b;->P:I

    invoke-interface {v4, v3, p1}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_19

    return-object v0

    :cond_19
    move-object p1, v1

    move-object v0, v4

    move-object v1, p2

    :goto_1a
    :try_start_c
    invoke-static {v1}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p2

    invoke-virtual {p2}, Lh2/B;->p()Lh2/w;

    move-result-object p2

    sget-object v1, Lh2/t;->C:Lh2/t;

    invoke-virtual {p2, v1}, Lh2/w;->a(Lh2/t;)Lh2/r;

    move-result-object p2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    invoke-interface {v0, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    instance-of p2, p2, Lh2/r$a;

    if-nez p2, :cond_1a

    invoke-static {p1, v2}, Lh2/z;->n(Lh2/z;LW8/N;)V

    goto :goto_1b

    :catchall_7
    move-exception p1

    invoke-interface {v0, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :catchall_8
    move-exception p1

    invoke-interface {v4, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :cond_1a
    :goto_1b
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_9
    move-exception p1

    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
