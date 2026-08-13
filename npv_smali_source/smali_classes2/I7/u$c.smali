.class final LI7/u$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/u;->getType()LF7/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/u;


# direct methods
.method constructor <init>(LI7/u;)V
    .locals 0

    iput-object p1, p0, LI7/u$c;->D:LI7/u;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/reflect/Type;
    .locals 4

    .prologue
    iget-object v0, p0, LI7/u$c;->D:LI7/u;

    invoke-static {v0}, LI7/u;->b(LI7/u;)LO7/Q;

    move-result-object v0

    instance-of v1, v0, LO7/X;

    if-eqz v1, :cond_1

    iget-object v1, p0, LI7/u$c;->D:LI7/u;

    invoke-virtual {v1}, LI7/u;->d()LI7/j;

    move-result-object v1

    invoke-virtual {v1}, LI7/j;->A()LO7/b;

    move-result-object v1

    invoke-static {v1}, LI7/M;->i(LO7/a;)LO7/X;

    move-result-object v1

    invoke-static {v1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LI7/u$c;->D:LI7/u;

    invoke-virtual {v1}, LI7/u;->d()LI7/j;

    move-result-object v1

    invoke-virtual {v1}, LI7/j;->A()LO7/b;

    move-result-object v1

    invoke-interface {v1}, LO7/b;->j()LO7/b$a;

    move-result-object v1

    sget-object v2, LO7/b$a;->D:LO7/b$a;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, LI7/u$c;->D:LI7/u;

    invoke-virtual {v1}, LI7/u;->d()LI7/j;

    move-result-object v1

    invoke-virtual {v1}, LI7/j;->A()LO7/b;

    move-result-object v1

    invoke-interface {v1}, LO7/n;->b()LO7/m;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LO7/e;

    invoke-static {v1}, LI7/M;->q(LO7/e;)Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    new-instance v1, LI7/D;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot determine receiver Java type of inherited declaration: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v0, p0, LI7/u$c;->D:LI7/u;

    invoke-virtual {v0}, LI7/u;->d()LI7/j;

    move-result-object v0

    invoke-virtual {v0}, LI7/j;->s()LJ7/e;

    move-result-object v0

    instance-of v1, v0, LJ7/j;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, LJ7/j;

    iget-object v3, p0, LI7/u$c;->D:LI7/u;

    invoke-virtual {v3}, LI7/u;->getIndex()I

    move-result v3

    invoke-virtual {v1, v3}, LJ7/j;->b(I)LE7/i;

    move-result-object v1

    invoke-interface {v0}, LJ7/e;->m()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Lj7/v;->J0(Ljava/util/List;LE7/i;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LI7/u$c;->D:LI7/u;

    check-cast v0, Ljava/util/Collection;

    new-array v2, v2, [Ljava/lang/reflect/Type;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Type;

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Type;

    invoke-static {v1, v0}, LI7/u;->a(LI7/u;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v1

    goto :goto_0

    :cond_2
    instance-of v1, v0, LJ7/j$b;

    if-eqz v1, :cond_3

    iget-object v1, p0, LI7/u$c;->D:LI7/u;

    check-cast v0, LJ7/j$b;

    invoke-virtual {v0}, LJ7/j$b;->b()Ljava/util/List;

    move-result-object v0

    iget-object v3, p0, LI7/u$c;->D:LI7/u;

    invoke-virtual {v3}, LI7/u;->getIndex()I

    move-result v3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-array v2, v2, [Ljava/lang/Class;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Class;

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Type;

    invoke-static {v1, v0}, LI7/u;->a(LI7/u;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v1

    goto :goto_0

    :cond_3
    invoke-interface {v0}, LJ7/e;->m()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LI7/u$c;->D:LI7/u;

    invoke-virtual {v1}, LI7/u;->getIndex()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/reflect/Type;

    :goto_0
    return-object v1
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/u$c;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method
