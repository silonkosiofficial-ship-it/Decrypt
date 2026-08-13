.class public abstract Lp8/i;
.super Lp8/a;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp8/i$f;,
        Lp8/i$e;,
        Lp8/i$c;,
        Lp8/i$d;,
        Lp8/i$b;
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lp8/a;-><init>()V

    return-void
.end method

.method protected constructor <init>(Lp8/i$b;)V
    .locals 0

    invoke-direct {p0}, Lp8/a;-><init>()V

    return-void
.end method

.method static synthetic j(Lp8/h;Lp8/p;Lp8/e;Lp8/f;Lp8/g;I)Z
    .locals 0

    invoke-static/range {p0 .. p5}, Lp8/i;->q(Lp8/h;Lp8/p;Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result p0

    return p0
.end method

.method static varargs k(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 4

    .prologue
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p2

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x2d

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Generated message class \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\" missing method \""

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\"."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method static varargs l(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static n(Lp8/p;Lp8/p;Lp8/j$b;ILp8/y$b;ZLjava/lang/Class;)Lp8/i$f;
    .locals 13

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    new-instance v6, Lp8/i$f;

    new-instance v4, Lp8/i$e;

    const/4 v11, 0x1

    move-object v7, v4

    move-object v8, p2

    move/from16 v9, p3

    move-object/from16 v10, p4

    move/from16 v12, p5

    invoke-direct/range {v7 .. v12}, Lp8/i$e;-><init>(Lp8/j$b;ILp8/y$b;ZZ)V

    move-object v0, v6

    move-object v1, p0

    move-object v3, p1

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v5}, Lp8/i$f;-><init>(Lp8/p;Ljava/lang/Object;Lp8/p;Lp8/i$e;Ljava/lang/Class;)V

    return-object v6
.end method

.method public static o(Lp8/p;Ljava/lang/Object;Lp8/p;Lp8/j$b;ILp8/y$b;Ljava/lang/Class;)Lp8/i$f;
    .locals 8

    new-instance v6, Lp8/i$f;

    new-instance v7, Lp8/i$e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v7

    move-object v1, p3

    move v2, p4

    move-object v3, p5

    invoke-direct/range {v0 .. v5}, Lp8/i$e;-><init>(Lp8/j$b;ILp8/y$b;ZZ)V

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, v7

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lp8/i$f;-><init>(Lp8/p;Ljava/lang/Object;Lp8/p;Lp8/i$e;Ljava/lang/Class;)V

    return-object v6
.end method

.method private static q(Lp8/h;Lp8/p;Lp8/e;Lp8/f;Lp8/g;I)Z
    .locals 5

    .prologue
    invoke-static {p5}, Lp8/y;->b(I)I

    move-result v0

    invoke-static {p5}, Lp8/y;->a(I)I

    move-result v1

    invoke-virtual {p4, p1, v1}, Lp8/g;->b(Lp8/p;I)Lp8/i$f;

    move-result-object p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_1

    :cond_0
    move v0, v1

    move v3, v2

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {v3}, Lp8/i$e;->j()Lp8/y$b;

    move-result-object v3

    invoke-static {v3, v2}, Lp8/h;->l(Lp8/y$b;Z)I

    move-result v3

    if-ne v0, v3, :cond_2

    move v0, v2

    move v3, v0

    goto :goto_0

    :cond_2
    iget-object v3, p1, Lp8/i$f;->d:Lp8/i$e;

    iget-boolean v4, v3, Lp8/i$e;->F:Z

    if-eqz v4, :cond_0

    iget-object v3, v3, Lp8/i$e;->E:Lp8/y$b;

    invoke-virtual {v3}, Lp8/y$b;->i()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {v3}, Lp8/i$e;->j()Lp8/y$b;

    move-result-object v3

    invoke-static {v3, v1}, Lp8/h;->l(Lp8/y$b;Z)I

    move-result v3

    if-ne v0, v3, :cond_0

    move v3, v1

    move v0, v2

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {p2, p5, p3}, Lp8/e;->O(ILp8/f;)Z

    move-result p0

    return p0

    :cond_3
    if-eqz v3, :cond_7

    invoke-virtual {p2}, Lp8/e;->z()I

    move-result p3

    invoke-virtual {p2, p3}, Lp8/e;->i(I)I

    move-result p3

    iget-object p4, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {p4}, Lp8/i$e;->j()Lp8/y$b;

    move-result-object p4

    sget-object p5, Lp8/y$b;->R:Lp8/y$b;

    if-ne p4, p5, :cond_5

    :goto_1
    invoke-virtual {p2}, Lp8/e;->e()I

    move-result p4

    if-lez p4, :cond_6

    invoke-virtual {p2}, Lp8/e;->m()I

    move-result p4

    iget-object p5, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {p5}, Lp8/i$e;->g()Lp8/j$b;

    move-result-object p5

    invoke-interface {p5, p4}, Lp8/j$b;->a(I)Lp8/j$a;

    move-result-object p4

    if-nez p4, :cond_4

    return v1

    :cond_4
    iget-object p5, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {p1, p4}, Lp8/i$f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p0, p5, p4}, Lp8/h;->a(Lp8/h$b;Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    :goto_2
    invoke-virtual {p2}, Lp8/e;->e()I

    move-result p4

    if-lez p4, :cond_6

    iget-object p4, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {p4}, Lp8/i$e;->j()Lp8/y$b;

    move-result-object p4

    invoke-static {p2, p4, v2}, Lp8/h;->u(Lp8/e;Lp8/y$b;Z)Ljava/lang/Object;

    move-result-object p4

    iget-object p5, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {p0, p5, p4}, Lp8/h;->a(Lp8/h$b;Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p2, p3}, Lp8/e;->h(I)V

    goto/16 :goto_6

    :cond_7
    sget-object v0, Lp8/i$a;->a:[I

    iget-object v3, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {v3}, Lp8/i$e;->p()Lp8/y$c;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v0, v0, v3

    if-eq v0, v1, :cond_a

    const/4 p4, 0x2

    if-eq v0, p4, :cond_8

    iget-object p3, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {p3}, Lp8/i$e;->j()Lp8/y$b;

    move-result-object p3

    invoke-static {p2, p3, v2}, Lp8/h;->u(Lp8/e;Lp8/y$b;Z)Ljava/lang/Object;

    move-result-object p2

    goto :goto_5

    :cond_8
    invoke-virtual {p2}, Lp8/e;->m()I

    move-result p2

    iget-object p4, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {p4}, Lp8/i$e;->g()Lp8/j$b;

    move-result-object p4

    invoke-interface {p4, p2}, Lp8/j$b;->a(I)Lp8/j$a;

    move-result-object p4

    if-nez p4, :cond_9

    invoke-virtual {p3, p5}, Lp8/f;->n0(I)V

    invoke-virtual {p3, p2}, Lp8/f;->x0(I)V

    return v1

    :cond_9
    move-object p2, p4

    goto :goto_5

    :cond_a
    iget-object p3, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {p3}, Lp8/i$e;->h()Z

    move-result p3

    if-nez p3, :cond_b

    iget-object p3, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {p0, p3}, Lp8/h;->h(Lp8/h$b;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lp8/p;

    if-eqz p3, :cond_b

    invoke-interface {p3}, Lp8/p;->e()Lp8/p$a;

    move-result-object p3

    goto :goto_3

    :cond_b
    const/4 p3, 0x0

    :goto_3
    if-nez p3, :cond_c

    invoke-virtual {p1}, Lp8/i$f;->c()Lp8/p;

    move-result-object p3

    invoke-interface {p3}, Lp8/p;->c()Lp8/p$a;

    move-result-object p3

    :cond_c
    iget-object p5, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {p5}, Lp8/i$e;->j()Lp8/y$b;

    move-result-object p5

    sget-object v0, Lp8/y$b;->N:Lp8/y$b;

    if-ne p5, v0, :cond_d

    invoke-virtual {p1}, Lp8/i$f;->d()I

    move-result p5

    invoke-virtual {p2, p5, p3, p4}, Lp8/e;->q(ILp8/p$a;Lp8/g;)V

    goto :goto_4

    :cond_d
    invoke-virtual {p2, p3, p4}, Lp8/e;->u(Lp8/p$a;Lp8/g;)V

    :goto_4
    invoke-interface {p3}, Lp8/p$a;->i()Lp8/p;

    move-result-object p2

    :goto_5
    iget-object p3, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {p3}, Lp8/i$e;->h()Z

    move-result p3

    if-eqz p3, :cond_e

    iget-object p3, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {p1, p2}, Lp8/i$f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lp8/h;->a(Lp8/h$b;Ljava/lang/Object;)V

    goto :goto_6

    :cond_e
    iget-object p3, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {p1, p2}, Lp8/i$f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lp8/h;->v(Lp8/h$b;Ljava/lang/Object;)V

    :goto_6
    return v1
.end method


# virtual methods
.method protected m()V
    .locals 0

    return-void
.end method

.method protected p(Lp8/e;Lp8/f;Lp8/g;I)Z
    .locals 0

    invoke-virtual {p1, p4, p2}, Lp8/e;->O(ILp8/f;)Z

    move-result p1

    return p1
.end method
