.class final LI7/o$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/o;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;LO7/y;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/o;


# direct methods
.method constructor <init>(LI7/o;)V
    .locals 0

    iput-object p1, p0, LI7/o$a;->D:LI7/o;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LJ7/e;
    .locals 11

    .prologue
    sget-object v0, LI7/I;->a:LI7/I;

    iget-object v1, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v1}, LI7/o;->P()LO7/y;

    move-result-object v1

    invoke-virtual {v0, v1}, LI7/I;->g(LO7/y;)LI7/h;

    move-result-object v0

    instance-of v1, v0, LI7/h$d;

    const/16 v2, 0xa

    if-eqz v1, :cond_2

    iget-object v1, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v1}, LI7/j;->D()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v0}, LI7/o;->t()LI7/n;

    move-result-object v0

    invoke-interface {v0}, Ly7/h;->e()Ljava/lang/Class;

    move-result-object v4

    iget-object v0, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v0}, LI7/j;->C()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF7/j;

    invoke-interface {v1}, LF7/j;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v6, LJ7/a$a;->D:LJ7/a$a;

    sget-object v7, LJ7/a$b;->D:LJ7/a$b;

    new-instance v0, LJ7/a;

    const/4 v8, 0x0

    const/16 v9, 0x10

    const/4 v10, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v10}, LJ7/a;-><init>(Ljava/lang/Class;Ljava/util/List;LJ7/a$a;LJ7/a$b;Ljava/util/List;ILy7/k;)V

    return-object v0

    :cond_1
    iget-object v1, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v1}, LI7/o;->t()LI7/n;

    move-result-object v1

    check-cast v0, LI7/h$d;

    invoke-virtual {v0}, LI7/h$d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LI7/n;->j(Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    goto/16 :goto_1

    :cond_2
    instance-of v1, v0, LI7/h$e;

    if-eqz v1, :cond_4

    iget-object v1, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v1}, LI7/o;->P()LO7/y;

    move-result-object v1

    invoke-interface {v1}, LO7/y;->b()LO7/m;

    move-result-object v2

    const-string v3, "getContainingDeclaration(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lr8/h;->d(LO7/m;)Z

    move-result v2

    if-eqz v2, :cond_3

    instance-of v2, v1, LO7/l;

    if-eqz v2, :cond_3

    check-cast v1, LO7/l;

    invoke-interface {v1}, LO7/l;->G()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, LJ7/j$b;

    iget-object v2, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v2}, LI7/o;->P()LO7/y;

    move-result-object v2

    iget-object v3, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v3}, LI7/o;->t()LI7/n;

    move-result-object v3

    check-cast v0, LI7/h$e;

    invoke-virtual {v0}, LI7/h$e;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v4}, LI7/o;->P()LO7/y;

    move-result-object v4

    invoke-interface {v4}, LO7/a;->n()Ljava/util/List;

    move-result-object v4

    const-string v5, "getValueParameters(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v3, v0, v4}, LJ7/j$b;-><init>(LO7/y;LI7/n;Ljava/lang/String;Ljava/util/List;)V

    return-object v1

    :cond_3
    iget-object v1, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v1}, LI7/o;->t()LI7/n;

    move-result-object v1

    check-cast v0, LI7/h$e;

    invoke-virtual {v0}, LI7/h$e;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, LI7/h$e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, LI7/n;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    goto :goto_1

    :cond_4
    instance-of v1, v0, LI7/h$c;

    if-eqz v1, :cond_5

    check-cast v0, LI7/h$c;

    invoke-virtual {v0}, LI7/h$c;->b()Ljava/lang/reflect/Method;

    move-result-object v0

    goto :goto_1

    :cond_5
    instance-of v1, v0, LI7/h$b;

    if-eqz v1, :cond_a

    check-cast v0, LI7/h$b;

    invoke-virtual {v0}, LI7/h$b;->b()Ljava/lang/reflect/Constructor;

    move-result-object v0

    :goto_1
    instance-of v1, v0, Ljava/lang/reflect/Constructor;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    iget-object v1, p0, LI7/o$a;->D:LI7/o;

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-virtual {v1}, LI7/o;->P()LO7/y;

    move-result-object v3

    invoke-static {v1, v0, v3, v2}, LI7/o;->F(LI7/o;Ljava/lang/reflect/Constructor;LO7/y;Z)LJ7/f;

    move-result-object v0

    goto :goto_2

    :cond_6
    instance-of v1, v0, Ljava/lang/reflect/Method;

    if-eqz v1, :cond_9

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, LI7/o$a;->D:LI7/o;

    invoke-static {v1, v0}, LI7/o;->G(LI7/o;Ljava/lang/reflect/Method;)LJ7/f$h;

    move-result-object v0

    goto :goto_2

    :cond_7
    iget-object v1, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v1}, LI7/o;->P()LO7/y;

    move-result-object v1

    invoke-interface {v1}, LP7/a;->k()LP7/g;

    move-result-object v1

    invoke-static {}, LI7/M;->j()Ln8/c;

    move-result-object v3

    invoke-interface {v1, v3}, LP7/g;->j(Ln8/c;)LP7/c;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-object v1, p0, LI7/o$a;->D:LI7/o;

    invoke-static {v1, v0}, LI7/o;->H(LI7/o;Ljava/lang/reflect/Method;)LJ7/f$h;

    move-result-object v0

    goto :goto_2

    :cond_8
    iget-object v1, p0, LI7/o$a;->D:LI7/o;

    invoke-static {v1, v0}, LI7/o;->I(LI7/o;Ljava/lang/reflect/Method;)LJ7/f$h;

    move-result-object v0

    :goto_2
    iget-object v1, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v1}, LI7/o;->P()LO7/y;

    move-result-object v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, LJ7/k;->i(LJ7/e;LO7/b;ZILjava/lang/Object;)LJ7/e;

    move-result-object v0

    return-object v0

    :cond_9
    new-instance v1, LI7/D;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not compute caller for function: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v3}, LI7/o;->P()LO7/y;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " (member = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    instance-of v1, v0, LI7/h$a;

    if-eqz v1, :cond_c

    check-cast v0, LI7/h$a;

    invoke-virtual {v0}, LI7/h$a;->b()Ljava/util/List;

    move-result-object v8

    iget-object v0, p0, LI7/o$a;->D:LI7/o;

    invoke-virtual {v0}, LI7/o;->t()LI7/n;

    move-result-object v0

    invoke-interface {v0}, Ly7/h;->e()Ljava/lang/Class;

    move-result-object v4

    move-object v0, v8

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_b
    sget-object v6, LJ7/a$a;->D:LJ7/a$a;

    sget-object v7, LJ7/a$b;->C:LJ7/a$b;

    new-instance v0, LJ7/a;

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, LJ7/a;-><init>(Ljava/lang/Class;Ljava/util/List;LJ7/a$a;LJ7/a$b;Ljava/util/List;)V

    return-object v0

    :cond_c
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/o$a;->a()LJ7/e;

    move-result-object v0

    return-object v0
.end method
