.class public abstract LP6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ljava/lang/Object;)Li7/M;
    .locals 0

    invoke-static {p0}, LP6/j;->p(Ljava/lang/Object;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Li7/M;
    .locals 1

    invoke-static {}, LP6/j;->j()Li7/M;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Li7/M;
    .locals 1

    invoke-static {}, LP6/j;->k()Li7/M;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Li7/M;
    .locals 1

    invoke-static {}, LP6/j;->l()Li7/M;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Li7/M;
    .locals 1

    invoke-static {}, LP6/j;->n()Li7/M;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Ljava/lang/Object;)Lo9/q;
    .locals 0

    invoke-static {p0}, LP6/j;->m(Ljava/lang/Object;)Lo9/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;)Lo9/q;
    .locals 0

    invoke-static {p0}, LP6/j;->o(Ljava/lang/Object;)Lo9/q;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lx7/l;)Ljava/util/List;
    .locals 1

    const-string v0, "block"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LP6/a;

    invoke-direct {v0}, LP6/a;-><init>()V

    invoke-interface {p0, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, LP6/a;->b()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    const/4 v0, 0x0

    new-array v0, v0, [LP6/k;

    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [LP6/k;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [LP6/k;

    invoke-static {p0}, LP6/j;->i([LP6/k;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs i([LP6/k;)Ljava/util/List;
    .locals 12

    .prologue
    const-string v0, "values"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_5

    aget-object v4, p0, v3

    invoke-virtual {v4}, LP6/k;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, LP6/k;->b()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4}, LP6/k;->c()LT6/p;

    move-result-object v4

    new-instance v7, LT6/q;

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-direct {v7, v2, v9, v8}, LT6/q;-><init>(IILy7/k;)V

    sget-object v8, LT6/v;->a:LT6/v;

    invoke-virtual {v8}, LT6/v;->f()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "form-data; name="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, LT6/o;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v9, v5}, LW6/B;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v4}, LW6/B;->g(LW6/y;)V

    instance-of v4, v6, Ljava/lang/String;

    if-eqz v4, :cond_0

    new-instance v4, LU6/e$b;

    check-cast v6, Ljava/lang/String;

    new-instance v5, LP6/c;

    invoke-direct {v5}, LP6/c;-><init>()V

    invoke-virtual {v7}, LT6/q;->q()LT6/p;

    move-result-object v7

    invoke-direct {v4, v6, v5, v7}, LU6/e$b;-><init>(Ljava/lang/String;Lx7/a;LT6/p;)V

    goto/16 :goto_1

    :cond_0
    instance-of v4, v6, Ljava/lang/Number;

    if-eqz v4, :cond_1

    new-instance v4, LU6/e$b;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, LP6/d;

    invoke-direct {v6}, LP6/d;-><init>()V

    invoke-virtual {v7}, LT6/q;->q()LT6/p;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, LU6/e$b;-><init>(Ljava/lang/String;Lx7/a;LT6/p;)V

    goto :goto_1

    :cond_1
    instance-of v4, v6, Ljava/lang/Boolean;

    if-eqz v4, :cond_2

    new-instance v4, LU6/e$b;

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v5

    new-instance v6, LP6/e;

    invoke-direct {v6}, LP6/e;-><init>()V

    invoke-virtual {v7}, LT6/q;->q()LT6/p;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, LU6/e$b;-><init>(Ljava/lang/String;Lx7/a;LT6/p;)V

    goto :goto_1

    :cond_2
    instance-of v4, v6, [B

    if-eqz v4, :cond_3

    invoke-virtual {v8}, LT6/v;->g()Ljava/lang/String;

    move-result-object v4

    move-object v5, v6

    check-cast v5, [B

    array-length v5, v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v4, v5}, LW6/B;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, LU6/e$a;

    new-instance v5, LP6/f;

    invoke-direct {v5, v6}, LP6/f;-><init>(Ljava/lang/Object;)V

    new-instance v6, LP6/g;

    invoke-direct {v6}, LP6/g;-><init>()V

    invoke-virtual {v7}, LT6/q;->q()LT6/p;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, LU6/e$a;-><init>(Lx7/a;Lx7/a;LT6/p;)V

    goto :goto_1

    :cond_3
    instance-of v4, v6, Lo9/q;

    if-eqz v4, :cond_4

    invoke-virtual {v8}, LT6/v;->g()Ljava/lang/String;

    move-result-object v4

    move-object v5, v6

    check-cast v5, Lo9/q;

    invoke-static {v5}, Ld7/d;->d(Lo9/q;)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v4, v5}, LW6/B;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, LU6/e$a;

    new-instance v5, LP6/h;

    invoke-direct {v5, v6}, LP6/h;-><init>(Ljava/lang/Object;)V

    new-instance v8, LP6/i;

    invoke-direct {v8, v6}, LP6/i;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v7}, LT6/q;->q()LT6/p;

    move-result-object v6

    invoke-direct {v4, v5, v8, v6}, LU6/e$a;-><init>(Lx7/a;Lx7/a;LT6/p;)V

    :goto_1
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown form content type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    return-object v0
.end method

.method private static final j()Li7/M;
    .locals 1

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method private static final k()Li7/M;
    .locals 1

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method private static final l()Li7/M;
    .locals 1

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method private static final m(Ljava/lang/Object;)Lo9/q;
    .locals 3

    check-cast p0, [B

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v2, v0, v1}, Ld7/d;->b([BIIILjava/lang/Object;)Lo9/q;

    move-result-object p0

    return-object p0
.end method

.method private static final n()Li7/M;
    .locals 1

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method private static final o(Ljava/lang/Object;)Lo9/q;
    .locals 0

    check-cast p0, Lo9/q;

    invoke-static {p0}, Ld7/d;->c(Lo9/q;)Lo9/q;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Ljava/lang/Object;)Li7/M;
    .locals 0

    check-cast p0, Lo9/q;

    invoke-interface {p0}, Lo9/h;->close()V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
