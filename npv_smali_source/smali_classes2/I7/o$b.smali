.class final LI7/o$b;
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

    iput-object p1, p0, LI7/o$b;->D:LI7/o;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LJ7/e;
    .locals 13

    .prologue
    sget-object v0, LI7/I;->a:LI7/I;

    iget-object v1, p0, LI7/o$b;->D:LI7/o;

    invoke-virtual {v1}, LI7/o;->P()LO7/y;

    move-result-object v1

    invoke-virtual {v0, v1}, LI7/I;->g(LO7/y;)LI7/h;

    move-result-object v0

    instance-of v1, v0, LI7/h$e;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    iget-object v1, p0, LI7/o$b;->D:LI7/o;

    invoke-virtual {v1}, LI7/o;->P()LO7/y;

    move-result-object v1

    invoke-interface {v1}, LO7/y;->b()LO7/m;

    move-result-object v4

    const-string v5, "getContainingDeclaration(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lr8/h;->d(LO7/m;)Z

    move-result v4

    if-eqz v4, :cond_1

    instance-of v4, v1, LO7/l;

    if-eqz v4, :cond_1

    check-cast v1, LO7/l;

    invoke-interface {v1}, LO7/l;->G()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LI7/D;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LI7/o$b;->D:LI7/o;

    invoke-virtual {v2}, LI7/o;->P()LO7/y;

    move-result-object v2

    invoke-interface {v2}, LO7/y;->b()LO7/m;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " cannot have default arguments"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, LI7/D;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v1, p0, LI7/o$b;->D:LI7/o;

    invoke-virtual {v1}, LI7/o;->t()LI7/n;

    move-result-object v1

    check-cast v0, LI7/h$e;

    invoke-virtual {v0}, LI7/h$e;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LI7/h$e;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v5, p0, LI7/o$b;->D:LI7/o;

    invoke-virtual {v5}, LI7/o;->s()LJ7/e;

    move-result-object v5

    invoke-interface {v5}, LJ7/e;->n()Ljava/lang/reflect/Member;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v5}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v5

    xor-int/2addr v5, v3

    invoke-virtual {v1, v4, v0, v5}, LI7/n;->l(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;

    move-result-object v0

    goto/16 :goto_3

    :cond_2
    instance-of v1, v0, LI7/h$d;

    const/16 v4, 0xa

    if-eqz v1, :cond_5

    iget-object v1, p0, LI7/o$b;->D:LI7/o;

    invoke-virtual {v1}, LI7/j;->D()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v0, p0, LI7/o$b;->D:LI7/o;

    invoke-virtual {v0}, LI7/o;->t()LI7/n;

    move-result-object v0

    invoke-interface {v0}, Ly7/h;->e()Ljava/lang/Class;

    move-result-object v6

    iget-object v0, p0, LI7/o$b;->D:LI7/o;

    invoke-virtual {v0}, LI7/j;->C()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF7/j;

    invoke-interface {v1}, LF7/j;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v7, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    sget-object v8, LJ7/a$a;->C:LJ7/a$a;

    sget-object v9, LJ7/a$b;->D:LJ7/a$b;

    new-instance v0, LJ7/a;

    const/4 v10, 0x0

    const/16 v11, 0x10

    const/4 v12, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v12}, LJ7/a;-><init>(Ljava/lang/Class;Ljava/util/List;LJ7/a$a;LJ7/a$b;Ljava/util/List;ILy7/k;)V

    return-object v0

    :cond_4
    iget-object v1, p0, LI7/o$b;->D:LI7/o;

    invoke-virtual {v1}, LI7/o;->t()LI7/n;

    move-result-object v1

    check-cast v0, LI7/h$d;

    invoke-virtual {v0}, LI7/h$d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LI7/n;->k(Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    goto :goto_3

    :cond_5
    instance-of v1, v0, LI7/h$a;

    if-eqz v1, :cond_7

    check-cast v0, LI7/h$a;

    invoke-virtual {v0}, LI7/h$a;->b()Ljava/util/List;

    move-result-object v10

    iget-object v0, p0, LI7/o$b;->D:LI7/o;

    invoke-virtual {v0}, LI7/o;->t()LI7/n;

    move-result-object v0

    invoke-interface {v0}, Ly7/h;->e()Ljava/lang/Class;

    move-result-object v6

    move-object v0, v10

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    sget-object v8, LJ7/a$a;->C:LJ7/a$a;

    sget-object v9, LJ7/a$b;->C:LJ7/a$b;

    new-instance v0, LJ7/a;

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, LJ7/a;-><init>(Ljava/lang/Class;Ljava/util/List;LJ7/a$a;LJ7/a$b;Ljava/util/List;)V

    return-object v0

    :cond_7
    move-object v0, v2

    :goto_3
    instance-of v1, v0, Ljava/lang/reflect/Constructor;

    if-eqz v1, :cond_8

    iget-object v1, p0, LI7/o$b;->D:LI7/o;

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-virtual {v1}, LI7/o;->P()LO7/y;

    move-result-object v4

    invoke-static {v1, v0, v4, v3}, LI7/o;->F(LI7/o;Ljava/lang/reflect/Constructor;LO7/y;Z)LJ7/f;

    move-result-object v0

    goto :goto_4

    :cond_8
    instance-of v1, v0, Ljava/lang/reflect/Method;

    if-eqz v1, :cond_a

    iget-object v1, p0, LI7/o$b;->D:LI7/o;

    invoke-virtual {v1}, LI7/o;->P()LO7/y;

    move-result-object v1

    invoke-interface {v1}, LP7/a;->k()LP7/g;

    move-result-object v1

    invoke-static {}, LI7/M;->j()Ln8/c;

    move-result-object v4

    invoke-interface {v1, v4}, LP7/g;->j(Ln8/c;)LP7/c;

    move-result-object v1

    if-eqz v1, :cond_9

    iget-object v1, p0, LI7/o$b;->D:LI7/o;

    invoke-virtual {v1}, LI7/o;->P()LO7/y;

    move-result-object v1

    invoke-interface {v1}, LO7/y;->b()LO7/m;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v1, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LO7/e;

    invoke-interface {v1}, LO7/e;->E()Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, LI7/o$b;->D:LI7/o;

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-static {v1, v0}, LI7/o;->H(LI7/o;Ljava/lang/reflect/Method;)LJ7/f$h;

    move-result-object v0

    goto :goto_4

    :cond_9
    iget-object v1, p0, LI7/o$b;->D:LI7/o;

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-static {v1, v0}, LI7/o;->I(LI7/o;Ljava/lang/reflect/Method;)LJ7/f$h;

    move-result-object v0

    goto :goto_4

    :cond_a
    move-object v0, v2

    :goto_4
    if-eqz v0, :cond_b

    iget-object v1, p0, LI7/o$b;->D:LI7/o;

    invoke-virtual {v1}, LI7/o;->P()LO7/y;

    move-result-object v1

    invoke-static {v0, v1, v3}, LJ7/k;->h(LJ7/e;LO7/b;Z)LJ7/e;

    move-result-object v2

    :cond_b
    return-object v2
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/o$b;->a()LJ7/e;

    move-result-object v0

    return-object v0
.end method
