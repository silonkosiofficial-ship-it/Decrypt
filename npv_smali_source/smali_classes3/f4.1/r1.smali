.class final Lf4/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lf4/s1;

.field private final b:Lf4/o0;

.field private c:I

.field private d:LL4/c$c;


# direct methods
.method constructor <init>(Lf4/s1;Lf4/o0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lf4/r1;->c:I

    sget-object v0, LL4/c$c;->C:LL4/c$c;

    iput-object v0, p0, Lf4/r1;->d:LL4/c$c;

    iput-object p1, p0, Lf4/r1;->a:Lf4/s1;

    iput-object p2, p0, Lf4/r1;->b:Lf4/o0;

    return-void
.end method


# virtual methods
.method final a()Lf4/u1;
    .locals 11

    .prologue
    const/4 v0, 0x0

    iget-object v1, p0, Lf4/r1;->b:Lf4/o0;

    iget v1, v1, Lf4/o0;->f:I

    const/16 v2, 0x8

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    iget-object v4, p0, Lf4/r1;->a:Lf4/s1;

    invoke-static {v4}, Lf4/s1;->c(Lf4/s1;)Lf4/q;

    move-result-object v4

    invoke-virtual {v4, v2}, Lf4/q;->g(Z)V

    add-int/lit8 v2, v1, -0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_b

    const/4 v1, 0x3

    const-string v5, "Invalid response from server."

    const/4 v6, 0x2

    packed-switch v2, :pswitch_data_0

    new-instance v0, Lf4/Z0;

    invoke-direct {v0, v3, v5}, Lf4/Z0;-><init>(ILjava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lf4/r1;->b:Lf4/o0;

    new-instance v2, Lf4/Z0;

    iget-object v0, v0, Lf4/o0;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Publisher misconfiguration: "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Lf4/Z0;-><init>(ILjava/lang/String;)V

    throw v2

    :pswitch_1
    iget-object v0, p0, Lf4/r1;->b:Lf4/o0;

    new-instance v1, Lf4/Z0;

    iget-object v0, v0, Lf4/o0;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Invalid response from server: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Lf4/Z0;-><init>(ILjava/lang/String;)V

    throw v1

    :pswitch_2
    iput v3, p0, Lf4/r1;->c:I

    goto :goto_1

    :pswitch_3
    iput v6, p0, Lf4/r1;->c:I

    goto :goto_1

    :pswitch_4
    iput v1, p0, Lf4/r1;->c:I

    :goto_1
    iget-object v1, p0, Lf4/r1;->b:Lf4/o0;

    iget v2, v1, Lf4/o0;->g:I

    add-int/lit8 v7, v2, -0x1

    if-eqz v2, :cond_a

    if-eq v7, v3, :cond_2

    if-ne v7, v6, :cond_1

    sget-object v2, LL4/c$c;->D:LL4/c$c;

    :goto_2
    iput-object v2, p0, Lf4/r1;->d:LL4/c$c;

    goto :goto_3

    :cond_1
    new-instance v0, Lf4/Z0;

    invoke-direct {v0, v3, v5}, Lf4/Z0;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_2
    sget-object v2, LL4/c$c;->E:LL4/c$c;

    goto :goto_2

    :goto_3
    iget-object v2, v1, Lf4/o0;->a:Ljava/lang/String;

    if-nez v2, :cond_3

    move-object v5, v4

    goto :goto_4

    :cond_3
    new-instance v5, Lf4/S;

    iget-object v7, v1, Lf4/o0;->b:Ljava/lang/String;

    invoke-direct {v5, v7, v2}, Lf4/S;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_4
    iget-object v2, p0, Lf4/r1;->a:Lf4/s1;

    invoke-static {v2}, Lf4/s1;->c(Lf4/s1;)Lf4/q;

    move-result-object v2

    new-instance v7, Ljava/util/HashSet;

    iget-object v1, v1, Lf4/o0;->d:Ljava/util/List;

    invoke-direct {v7, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2, v7}, Lf4/q;->i(Ljava/util/Set;)V

    iget-object v1, p0, Lf4/r1;->b:Lf4/o0;

    iget-object v1, v1, Lf4/o0;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf4/n0;

    iget v7, v2, Lf4/n0;->b:I

    add-int/lit8 v8, v7, -0x1

    if-eqz v7, :cond_8

    if-eqz v8, :cond_5

    if-eq v8, v3, :cond_7

    if-eq v8, v6, :cond_6

    :cond_5
    move-object v7, v4

    goto :goto_6

    :cond_6
    const-string v7, "clear"

    goto :goto_6

    :cond_7
    const-string v7, "write"

    :goto_6
    if-eqz v7, :cond_4

    iget-object v8, p0, Lf4/r1;->a:Lf4/s1;

    invoke-static {v8}, Lf4/s1;->a(Lf4/s1;)Lf4/X0;

    move-result-object v9

    iget-object v2, v2, Lf4/n0;->a:Ljava/lang/String;

    invoke-static {v8}, Lf4/s1;->b(Lf4/s1;)Lf4/o;

    move-result-object v8

    new-array v10, v3, [Lf4/E0;

    aput-object v8, v10, v0

    invoke-virtual {v9, v7, v2, v10}, Lf4/X0;->b(Ljava/lang/String;Ljava/lang/String;[Lf4/E0;)V

    goto :goto_5

    :cond_8
    throw v4

    :cond_9
    new-instance v0, Lf4/u1;

    iget v1, p0, Lf4/r1;->c:I

    iget-object v2, p0, Lf4/r1;->d:LL4/c$c;

    invoke-direct {v0, v1, v2, v5, v4}, Lf4/u1;-><init>(ILL4/c$c;Lf4/S;Lf4/t1;)V

    return-object v0

    :cond_a
    throw v4

    :cond_b
    throw v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
