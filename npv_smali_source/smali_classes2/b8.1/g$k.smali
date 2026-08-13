.class final Lb8/g$k;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


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

    iput-object p1, p0, Lb8/g$k;->D:Lb8/g;

    iput-object p2, p0, Lb8/g$k;->E:La8/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/f;)LO7/e;
    .locals 17

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v3, p1

    const-string v1, "name"

    invoke-static {v3, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lb8/g$k;->D:Lb8/g;

    invoke-static {v1}, Lb8/g;->R(Lb8/g;)LE8/i;

    move-result-object v1

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, Lb8/g$k;->E:La8/g;

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {v1}, La8/b;->d()LX7/p;

    move-result-object v1

    new-instance v9, LX7/p$a;

    iget-object v4, v0, Lb8/g$k;->D:Lb8/g;

    invoke-virtual {v4}, Lb8/g;->z0()LO7/e;

    move-result-object v4

    invoke-static {v4}, Lv8/c;->k(LO7/h;)Ln8/b;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Ln8/b;->d(Ln8/f;)Ln8/b;

    move-result-object v4

    const-string v3, "createNestedClassId(...)"

    invoke-static {v4, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lb8/g$k;->D:Lb8/g;

    invoke-static {v3}, Lb8/g;->Q(Lb8/g;)Le8/g;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, LX7/p$a;-><init>(Ln8/b;[BLe8/g;ILy7/k;)V

    invoke-interface {v1, v9}, LX7/p;->b(LX7/p$a;)Le8/g;

    move-result-object v13

    if-eqz v13, :cond_3

    iget-object v1, v0, Lb8/g$k;->E:La8/g;

    iget-object v2, v0, Lb8/g$k;->D:Lb8/g;

    new-instance v3, Lb8/f;

    invoke-virtual {v2}, Lb8/g;->z0()LO7/e;

    move-result-object v12

    const/16 v15, 0x8

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object v10, v3

    move-object v11, v1

    invoke-direct/range {v10 .. v16}, Lb8/f;-><init>(La8/g;LO7/m;Le8/g;LO7/e;ILy7/k;)V

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {v1}, La8/b;->e()LX7/q;

    move-result-object v1

    invoke-interface {v1, v3}, LX7/q;->a(LZ7/c;)V

    move-object v2, v3

    goto/16 :goto_0

    :cond_0
    iget-object v1, v0, Lb8/g$k;->D:Lb8/g;

    invoke-static {v1}, Lb8/g;->P(Lb8/g;)LE8/i;

    move-result-object v1

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lb8/g$k;->E:La8/g;

    iget-object v4, v0, Lb8/g$k;->D:Lb8/g;

    invoke-static {}, Lj7/v;->c()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v6

    invoke-virtual {v6}, La8/b;->w()Lw8/f;

    move-result-object v6

    invoke-virtual {v4}, Lb8/g;->z0()LO7/e;

    move-result-object v4

    invoke-interface {v6, v1, v4, v3, v5}, Lw8/f;->e(La8/g;LO7/e;Ln8/f;Ljava/util/List;)V

    invoke-static {v5}, Lj7/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-eqz v3, :cond_3

    const/4 v2, 0x1

    if-ne v3, v2, :cond_1

    invoke-static {v1}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LO7/e;

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Multiple classes with same name are generated: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2
    iget-object v1, v0, Lb8/g$k;->D:Lb8/g;

    invoke-static {v1}, Lb8/g;->O(Lb8/g;)LE8/i;

    move-result-object v1

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/n;

    if-eqz v1, :cond_3

    iget-object v2, v0, Lb8/g$k;->E:La8/g;

    invoke-virtual {v2}, La8/g;->e()LE8/n;

    move-result-object v2

    new-instance v4, Lb8/g$k$a;

    iget-object v5, v0, Lb8/g$k;->D:Lb8/g;

    invoke-direct {v4, v5}, Lb8/g$k$a;-><init>(Lb8/g;)V

    invoke-interface {v2, v4}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object v4

    iget-object v2, v0, Lb8/g$k;->E:La8/g;

    invoke-virtual {v2}, La8/g;->e()LE8/n;

    move-result-object v2

    iget-object v5, v0, Lb8/g$k;->D:Lb8/g;

    invoke-virtual {v5}, Lb8/g;->z0()LO7/e;

    move-result-object v5

    iget-object v6, v0, Lb8/g$k;->E:La8/g;

    invoke-static {v6, v1}, La8/e;->a(La8/g;Le8/d;)LP7/g;

    move-result-object v6

    iget-object v7, v0, Lb8/g$k;->E:La8/g;

    invoke-virtual {v7}, La8/g;->a()La8/b;

    move-result-object v7

    invoke-virtual {v7}, La8/b;->t()Ld8/b;

    move-result-object v7

    invoke-interface {v7, v1}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object v7

    move-object v1, v2

    move-object v2, v5

    move-object/from16 v3, p1

    move-object v5, v6

    move-object v6, v7

    invoke-static/range {v1 .. v6}, LR7/n;->U0(LE8/n;LO7/e;Ln8/f;LE8/i;LP7/g;LO7/a0;)LR7/n;

    move-result-object v2

    :cond_3
    :goto_0
    return-object v2
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/f;

    invoke-virtual {p0, p1}, Lb8/g$k;->a(Ln8/f;)LO7/e;

    move-result-object p1

    return-object p1
.end method
