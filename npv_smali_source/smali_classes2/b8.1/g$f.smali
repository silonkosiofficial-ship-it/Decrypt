.class final Lb8/g$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/g;-><init>(La8/g;LO7/e;Le8/g;ZLb8/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/g;

.field final synthetic E:La8/g;


# direct methods
.method constructor <init>(Lb8/g;La8/g;)V
    .locals 0

    iput-object p1, p0, Lb8/g$f;->D:Lb8/g;

    iput-object p2, p0, Lb8/g$f;->E:La8/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 8

    .prologue
    iget-object v0, p0, Lb8/g$f;->D:Lb8/g;

    invoke-static {v0}, Lb8/g;->Q(Lb8/g;)Le8/g;

    move-result-object v0

    invoke-interface {v0}, Le8/g;->r()Ljava/util/Collection;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/k;

    iget-object v3, p0, Lb8/g$f;->D:Lb8/g;

    invoke-static {v3, v2}, Lb8/g;->S(Lb8/g;Le8/k;)LZ7/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb8/g$f;->D:Lb8/g;

    invoke-static {v0}, Lb8/g;->Q(Lb8/g;)Le8/g;

    move-result-object v0

    invoke-interface {v0}, Le8/g;->w()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lb8/g$f;->D:Lb8/g;

    invoke-static {v0}, Lb8/g;->N(Lb8/g;)LO7/d;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v2, v2, v3, v4}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LO7/d;

    invoke-static {v7, v2, v2, v3, v4}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lb8/g$f;->E:La8/g;

    invoke-virtual {v2}, La8/g;->a()La8/b;

    move-result-object v2

    invoke-virtual {v2}, La8/b;->h()LY7/g;

    move-result-object v2

    iget-object v3, p0, Lb8/g$f;->D:Lb8/g;

    invoke-static {v3}, Lb8/g;->Q(Lb8/g;)Le8/g;

    move-result-object v3

    invoke-interface {v2, v3, v0}, LY7/g;->a(Le8/l;LO7/l;)V

    :cond_4
    :goto_2
    iget-object v0, p0, Lb8/g$f;->E:La8/g;

    iget-object v2, p0, Lb8/g$f;->D:Lb8/g;

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v3

    invoke-virtual {v3}, La8/b;->w()Lw8/f;

    move-result-object v3

    invoke-virtual {v2}, Lb8/g;->z0()LO7/e;

    move-result-object v2

    invoke-interface {v3, v0, v2, v1}, Lw8/f;->h(La8/g;LO7/e;Ljava/util/List;)V

    iget-object v0, p0, Lb8/g$f;->E:La8/g;

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->r()Lf8/l;

    move-result-object v0

    iget-object v2, p0, Lb8/g$f;->E:La8/g;

    iget-object v3, p0, Lb8/g$f;->D:Lb8/g;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v3}, Lb8/g;->M(Lb8/g;)LO7/d;

    move-result-object v1

    invoke-static {v1}, Lj7/v;->q(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    :cond_5
    invoke-virtual {v0, v2, v1}, Lf8/l;->g(La8/g;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/g$f;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
