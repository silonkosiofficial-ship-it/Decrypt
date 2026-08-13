.class final LI7/j$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/j;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/j;


# direct methods
.method constructor <init>(LI7/j;)V
    .locals 0

    iput-object p1, p0, LI7/j$a;->D:LI7/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()[Ljava/lang/Object;
    .locals 9

    .prologue
    iget-object v0, p0, LI7/j$a;->D:LI7/j;

    invoke-virtual {v0}, LI7/j;->C()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, LI7/j$a;->D:LI7/j;

    invoke-interface {v2}, LF7/b;->y()Z

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, LI7/j$a;->D:LI7/j;

    invoke-static {v2}, LI7/j;->m(LI7/j;)Li7/n;

    move-result-object v2

    invoke-interface {v2}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    iget-object v4, p0, LI7/j$a;->D:LI7/j;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v5, v3

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LF7/j;

    invoke-interface {v6}, LF7/j;->j()LF7/j$a;

    move-result-object v7

    sget-object v8, LF7/j$a;->E:LF7/j$a;

    if-ne v7, v8, :cond_0

    invoke-static {v4, v6}, LI7/j;->k(LI7/j;LF7/j;)I

    move-result v6

    goto :goto_1

    :cond_0
    move v6, v3

    :goto_1
    add-int/2addr v5, v6

    goto :goto_0

    :cond_1
    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    instance-of v4, v2, Ljava/util/Collection;

    if-eqz v4, :cond_2

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    move v5, v3

    goto :goto_3

    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v5, v3

    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF7/j;

    invoke-interface {v4}, LF7/j;->j()LF7/j$a;

    move-result-object v4

    sget-object v6, LF7/j$a;->E:LF7/j$a;

    if-ne v4, v6, :cond_3

    add-int/lit8 v5, v5, 0x1

    if-gez v5, :cond_3

    invoke-static {}, Lj7/v;->v()V

    goto :goto_2

    :cond_4
    :goto_3
    add-int/lit8 v5, v5, 0x1f

    div-int/lit8 v5, v5, 0x20

    add-int v2, v1, v5

    add-int/lit8 v2, v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v4, p0, LI7/j$a;->D:LI7/j;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LF7/j;

    invoke-interface {v6}, LF7/j;->n()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, LF7/j;->getType()LF7/o;

    move-result-object v7

    invoke-static {v7}, LI7/M;->l(LF7/o;)Z

    move-result v7

    if-nez v7, :cond_6

    invoke-interface {v6}, LF7/j;->getIndex()I

    move-result v7

    invoke-interface {v6}, LF7/j;->getType()LF7/o;

    move-result-object v6

    invoke-static {v6}, LH7/c;->f(LF7/o;)Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, LI7/M;->g(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v2, v7

    goto :goto_4

    :cond_6
    invoke-interface {v6}, LF7/j;->m()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, LF7/j;->getIndex()I

    move-result v7

    invoke-interface {v6}, LF7/j;->getType()LF7/o;

    move-result-object v6

    invoke-static {v4, v6}, LI7/j;->e(LI7/j;LF7/o;)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v2, v7

    goto :goto_4

    :cond_7
    move v0, v3

    :goto_5
    if-ge v0, v5, :cond_8

    add-int v4, v1, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v2, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_8
    return-object v2
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/j$a;->a()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
