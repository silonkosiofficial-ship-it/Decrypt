.class public abstract Lm9/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/l$a;
    }
.end annotation


# direct methods
.method public static a(Lm9/q;)Lm9/q;
    .locals 1

    const-string v0, "commands"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final b(Lm9/q;Ljava/lang/CharSequence;Lm9/c;I)Lm9/c;
    .locals 8

    .prologue
    const-string v0, "input"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialContainer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lm9/l$a;

    invoke-direct {v1, p2, p0, p3}, Lm9/l$a;-><init>(Ljava/lang/Object;Lm9/q;I)V

    const/4 p0, 0x1

    new-array p2, p0, [Lm9/l$a;

    const/4 p3, 0x0

    aput-object v1, p2, p3

    invoke-static {p2}, Lj7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-static {p2}, Lj7/v;->M(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm9/l$a;

    if-nez v1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    if-le p1, p0, :cond_1

    new-instance p0, Lm9/l$b;

    invoke-direct {p0}, Lm9/l$b;-><init>()V

    invoke-static {v0, p0}, Lj7/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    new-instance p0, Lm9/j;

    invoke-direct {p0, v0}, Lm9/j;-><init>(Ljava/util/List;)V

    throw p0

    :cond_2
    invoke-virtual {v1}, Lm9/l$a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/c;

    invoke-interface {v2}, Lm9/c;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/c;

    invoke-virtual {v1}, Lm9/l$a;->a()I

    move-result v3

    invoke-virtual {v1}, Lm9/l$a;->c()Lm9/q;

    move-result-object v1

    invoke-virtual {v1}, Lm9/q;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    move v5, p3

    :goto_1
    if-ge v5, v4, :cond_5

    invoke-virtual {v1}, Lm9/q;->b()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm9/o;

    invoke-interface {v6, v2, p1, v3}, Lm9/o;->a(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Ljava/lang/Integer;

    if-eqz v6, :cond_3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    add-int/2addr v5, p0

    goto :goto_1

    :cond_3
    instance-of v1, v3, Lm9/i;

    if-eqz v1, :cond_4

    check-cast v3, Lm9/i;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unexpected parse result: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    invoke-virtual {v1}, Lm9/q;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ne v3, v1, :cond_6

    return-object v2

    :cond_6
    new-instance v1, Lm9/i;

    sget-object v2, Lm9/m;->D:Lm9/m;

    invoke-direct {v1, v3, v2}, Lm9/i;-><init>(ILx7/a;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v1}, Lm9/q;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_0

    :goto_2
    add-int/lit8 v5, v4, -0x1

    new-instance v6, Lm9/l$a;

    invoke-virtual {v1}, Lm9/q;->a()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm9/q;

    invoke-direct {v6, v2, v4, v3}, Lm9/l$a;-><init>(Ljava/lang/Object;Lm9/q;I)V

    invoke-interface {p2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-gez v5, :cond_8

    goto/16 :goto_0

    :cond_8
    move v4, v5

    goto :goto_2
.end method

.method public static synthetic c(Lm9/q;Ljava/lang/CharSequence;Lm9/c;IILjava/lang/Object;)Lm9/c;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lm9/l;->b(Lm9/q;Ljava/lang/CharSequence;Lm9/c;I)Lm9/c;

    move-result-object p0

    return-object p0
.end method
