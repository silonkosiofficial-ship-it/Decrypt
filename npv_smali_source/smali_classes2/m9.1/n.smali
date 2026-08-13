.class public abstract Lm9/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ljava/util/List;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lm9/n;->e(Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/List;)Lm9/q;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm9/q;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm9/q;

    invoke-static {v1, v0}, Lm9/n;->c(Lm9/q;Lm9/q;)Lm9/q;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p0

    invoke-static {v0, p0}, Lm9/n;->d(Lm9/q;Ljava/util/List;)Lm9/q;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lm9/q;Lm9/q;)Lm9/q;
    .locals 3

    .prologue
    invoke-virtual {p0}, Lm9/q;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lm9/q;

    invoke-virtual {p0}, Lm9/q;->b()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-virtual {p1}, Lm9/q;->b()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {p0, v1}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1}, Lm9/q;->a()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lm9/q;->b()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lm9/q;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/q;

    invoke-static {v2, p1}, Lm9/n;->c(Lm9/q;Lm9/q;)Lm9/q;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Lm9/q;

    invoke-direct {p0, v0, v1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    move-object v0, p0

    :goto_1
    return-object v0
.end method

.method private static final d(Lm9/q;Ljava/util/List;)Lm9/q;
    .locals 8

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lj7/v;->W0(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0}, Lm9/q;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm9/o;

    instance-of v5, v4, Lm9/h;

    if-eqz v5, :cond_1

    check-cast v4, Lm9/h;

    if-eqz v3, :cond_0

    invoke-virtual {v4}, Lm9/h;->c()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lm9/h;->c()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lj7/v;->W0(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v3

    goto :goto_0

    :cond_1
    instance-of v5, v4, Lm9/v;

    if-eqz v5, :cond_2

    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    new-instance v5, Lm9/h;

    invoke-direct {v5, v3}, Lm9/h;-><init>(Ljava/util/List;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v3, v2

    :cond_3
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lm9/q;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/q;

    invoke-static {v2, p1}, Lm9/n;->d(Lm9/q;Ljava/util/List;)Lm9/q;

    move-result-object v2

    invoke-virtual {v2}, Lm9/q;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v2}, Lm9/q;->a()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {v2}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :cond_5
    check-cast v4, Ljava/util/List;

    goto :goto_2

    :cond_6
    invoke-static {v2}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :goto_2
    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v1, v4}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_1

    :cond_7
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_8

    new-instance p0, Lm9/q;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-static {p0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :cond_8
    check-cast v1, Ljava/util/List;

    if-nez v3, :cond_9

    new-instance p0, Lm9/q;

    invoke-direct {p0, v0, v1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    goto/16 :goto_6

    :cond_9
    move-object p0, v1

    check-cast p0, Ljava/lang/Iterable;

    instance-of p1, p0, Ljava/util/Collection;

    if-eqz p1, :cond_a

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_a

    goto/16 :goto_5

    :cond_a
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/q;

    invoke-virtual {v2}, Lm9/q;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/o;

    if-eqz v2, :cond_b

    instance-of v2, v2, Lm9/h;

    const/4 v4, 0x1

    if-ne v2, v4, :cond_b

    new-instance p1, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm9/q;

    invoke-virtual {v1}, Lm9/q;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/o;

    instance-of v5, v2, Lm9/h;

    if-eqz v5, :cond_c

    new-instance v5, Lm9/q;

    new-instance v6, Lm9/h;

    move-object v7, v3

    check-cast v7, Ljava/util/Collection;

    check-cast v2, Lm9/h;

    invoke-virtual {v2}, Lm9/h;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v7, v2}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v6, v2}, Lm9/h;-><init>(Ljava/util/List;)V

    invoke-static {v6}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v1}, Lm9/q;->b()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6, v4}, Lj7/v;->c0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v2, v6}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Lm9/q;->a()Ljava/util/List;

    move-result-object v1

    invoke-direct {v5, v2, v1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    goto :goto_4

    :cond_c
    new-instance v5, Lm9/q;

    if-nez v2, :cond_d

    new-instance v2, Lm9/h;

    invoke-direct {v2, v3}, Lm9/h;-><init>(Ljava/util/List;)V

    invoke-static {v2}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Lm9/q;->a()Ljava/util/List;

    move-result-object v1

    invoke-direct {v5, v2, v1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    goto :goto_4

    :cond_d
    new-instance v2, Lm9/h;

    invoke-direct {v2, v3}, Lm9/h;-><init>(Ljava/util/List;)V

    invoke-static {v2}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v1}, Lm9/q;->b()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v2, v6}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Lm9/q;->a()Ljava/util/List;

    move-result-object v1

    invoke-direct {v5, v2, v1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    :goto_4
    invoke-interface {p1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_e
    new-instance p0, Lm9/q;

    invoke-direct {p0, v0, p1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    goto :goto_6

    :cond_f
    :goto_5
    new-instance p0, Lm9/h;

    invoke-direct {p0, v3}, Lm9/h;-><init>(Ljava/util/List;)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lm9/q;

    invoke-direct {p0, v0, v1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    :goto_6
    return-object p0
.end method

.method private static final e(Ljava/util/List;)Ljava/lang/String;
    .locals 10

    .prologue
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Position "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/i;

    invoke-virtual {v2}, Lm9/i;->b()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm9/i;

    invoke-virtual {p0}, Lm9/i;->a()Lx7/a;

    move-result-object p0

    invoke-interface {p0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x21

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    sget-object v7, Lm9/n$a;->D:Lm9/n$a;

    const/16 v8, 0x38

    const/4 v9, 0x0

    const-string v2, ", "

    const-string v3, "Errors: "

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v9}, Lj7/v;->p0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/Appendable;

    move-result-object p0

    check-cast p0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
