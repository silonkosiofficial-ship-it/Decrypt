.class final LR7/r$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/r;-><init>(LR7/x;Ln8/c;LE8/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LR7/r;


# direct methods
.method constructor <init>(LR7/r;)V
    .locals 0

    iput-object p1, p0, LR7/r$c;->D:LR7/r;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ly8/h;
    .locals 4

    .prologue
    iget-object v0, p0, LR7/r$c;->D:LR7/r;

    invoke-virtual {v0}, LR7/r;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ly8/h$b;->b:Ly8/h$b;

    goto :goto_1

    :cond_0
    iget-object v0, p0, LR7/r$c;->D:LR7/r;

    invoke-virtual {v0}, LR7/r;->N()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/K;

    invoke-interface {v2}, LO7/K;->u()Ly8/h;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, LR7/H;

    iget-object v2, p0, LR7/r$c;->D:LR7/r;

    invoke-virtual {v2}, LR7/r;->T0()LR7/x;

    move-result-object v2

    iget-object v3, p0, LR7/r$c;->D:LR7/r;

    invoke-virtual {v3}, LR7/r;->e()Ln8/c;

    move-result-object v3

    invoke-direct {v0, v2, v3}, LR7/H;-><init>(LO7/G;Ln8/c;)V

    invoke-static {v1, v0}, Lj7/v;->D0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Ly8/b;->d:Ly8/b$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "package view scope for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LR7/r$c;->D:LR7/r;

    invoke-virtual {v3}, LR7/r;->e()Ln8/c;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " in "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LR7/r$c;->D:LR7/r;

    invoke-virtual {v3}, LR7/r;->T0()LR7/x;

    move-result-object v3

    invoke-virtual {v3}, LR7/j;->getName()Ln8/f;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {v1, v2, v0}, Ly8/b$a;->a(Ljava/lang/String;Ljava/lang/Iterable;)Ly8/h;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR7/r$c;->a()Ly8/h;

    move-result-object v0

    return-object v0
.end method
