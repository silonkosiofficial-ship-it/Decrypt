.class public final LP7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP7/g;


# instance fields
.field private final C:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const-string v0, "delegates"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP7/k;->C:Ljava/util/List;

    return-void
.end method

.method public varargs constructor <init>([LP7/g;)V
    .locals 1

    const-string v0, "delegates"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lj7/n;->R0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, LP7/k;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public H(Ln8/c;)Z
    .locals 2

    .prologue
    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP7/k;->C:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->Y(Ljava/lang/Iterable;)LR8/h;

    move-result-object v0

    invoke-interface {v0}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP7/g;

    invoke-interface {v1, p1}, LP7/g;->H(Ln8/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isEmpty()Z
    .locals 3

    .prologue
    iget-object v0, p0, LP7/k;->C:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP7/g;

    invoke-interface {v1}, LP7/g;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v2, 0x0

    :cond_2
    :goto_0
    return v2
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, LP7/k;->C:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->Y(Ljava/lang/Iterable;)LR8/h;

    move-result-object v0

    sget-object v1, LP7/k$b;->D:LP7/k$b;

    invoke-static {v0, v1}, LR8/k;->B(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    invoke-interface {v0}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public j(Ln8/c;)LP7/c;
    .locals 2

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP7/k;->C:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->Y(Ljava/lang/Iterable;)LR8/h;

    move-result-object v0

    new-instance v1, LP7/k$a;

    invoke-direct {v1, p1}, LP7/k$a;-><init>(Ln8/c;)V

    invoke-static {v0, v1}, LR8/k;->H(LR8/h;Lx7/l;)LR8/h;

    move-result-object p1

    invoke-static {p1}, LR8/k;->A(LR8/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LP7/c;

    return-object p1
.end method
