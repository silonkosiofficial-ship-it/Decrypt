.class final Lf8/a$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/a;->C(LJ8/i;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lf8/a;

.field final synthetic E:LJ8/o;


# direct methods
.method constructor <init>(Lf8/a;LJ8/o;)V
    .locals 0

    iput-object p1, p0, Lf8/a$d;->D:Lf8/a;

    iput-object p2, p0, Lf8/a$d;->E:LJ8/o;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf8/a$a;)Ljava/lang/Iterable;
    .locals 10

    .prologue
    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf8/a$d;->D:Lf8/a;

    invoke-virtual {v0}, Lf8/a;->u()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lf8/a$a;->b()LJ8/i;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lf8/a$d;->E:LJ8/o;

    invoke-interface {v2, v0}, LJ8/o;->v0(LJ8/i;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lf8/a$a;->b()LJ8/i;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v2, p0, Lf8/a$d;->E:LJ8/o;

    invoke-interface {v2, v0}, LJ8/o;->u0(LJ8/i;)LJ8/m;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v2, p0, Lf8/a$d;->E:LJ8/o;

    invoke-interface {v2, v0}, LJ8/o;->s(LJ8/m;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    iget-object v2, p0, Lf8/a$d;->E:LJ8/o;

    invoke-virtual {p1}, Lf8/a$a;->b()LJ8/i;

    move-result-object v3

    invoke-interface {v2, v3}, LJ8/o;->R(LJ8/i;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    iget-object v3, p0, Lf8/a$d;->E:LJ8/o;

    iget-object v4, p0, Lf8/a$d;->D:Lf8/a;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v0, v8}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v2, v8}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJ8/l;

    check-cast v0, LJ8/n;

    invoke-interface {v3, v2}, LJ8/o;->E0(LJ8/l;)Z

    move-result v8

    if-eqz v8, :cond_1

    new-instance v2, Lf8/a$a;

    invoke-virtual {p1}, Lf8/a$a;->a()LX7/y;

    move-result-object v8

    invoke-direct {v2, v1, v8, v0}, Lf8/a$a;-><init>(LJ8/i;LX7/y;LJ8/n;)V

    goto :goto_1

    :cond_1
    invoke-interface {v3, v2}, LJ8/o;->n0(LJ8/l;)LJ8/i;

    move-result-object v2

    new-instance v8, Lf8/a$a;

    invoke-virtual {p1}, Lf8/a$a;->a()LX7/y;

    move-result-object v9

    invoke-static {v4, v2, v9}, Lf8/a;->a(Lf8/a;LJ8/i;LX7/y;)LX7/y;

    move-result-object v9

    invoke-direct {v8, v2, v9, v0}, Lf8/a$a;-><init>(LJ8/i;LX7/y;LJ8/n;)V

    move-object v2, v8

    :goto_1
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object v1, v7

    :cond_3
    return-object v1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf8/a$a;

    invoke-virtual {p0, p1}, Lf8/a$d;->a(Lf8/a$a;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
