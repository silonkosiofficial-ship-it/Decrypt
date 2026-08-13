.class public LN4/s;
.super LN4/q;
.source "SourceFile"

# interfaces
.implements LN4/A;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/s$a;
    }
.end annotation


# instance fields
.field private final transient E:LN4/r;


# direct methods
.method constructor <init>(LN4/p;ILjava/util/Comparator;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LN4/q;-><init>(LN4/p;I)V

    invoke-static {p3}, LN4/s;->d(Ljava/util/Comparator;)LN4/r;

    move-result-object p1

    iput-object p1, p0, LN4/s;->E:LN4/r;

    return-void
.end method

.method private static d(Ljava/util/Comparator;)LN4/r;
    .locals 0

    .prologue
    if-nez p0, :cond_0

    invoke-static {}, LN4/r;->M()LN4/r;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LN4/t;->W(Ljava/util/Comparator;)LN4/L;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method static e(Ljava/util/Collection;Ljava/util/Comparator;)LN4/s;
    .locals 5

    .prologue
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LN4/s;->f()LN4/s;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LN4/p$a;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, LN4/p$a;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {p1, v2}, LN4/s;->g(Ljava/util/Comparator;Ljava/util/Collection;)LN4/r;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0, v3, v2}, LN4/p$a;->e(Ljava/lang/Object;Ljava/lang/Object;)LN4/p$a;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    new-instance p0, LN4/s;

    invoke-virtual {v0}, LN4/p$a;->b()LN4/p;

    move-result-object v0

    invoke-direct {p0, v0, v1, p1}, LN4/s;-><init>(LN4/p;ILjava/util/Comparator;)V

    return-object p0
.end method

.method public static f()LN4/s;
    .locals 1

    sget-object v0, LN4/l;->F:LN4/l;

    return-object v0
.end method

.method private static g(Ljava/util/Comparator;Ljava/util/Collection;)LN4/r;
    .locals 0

    .prologue
    if-nez p0, :cond_0

    invoke-static {p1}, LN4/r;->C(Ljava/util/Collection;)LN4/r;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LN4/t;->T(Ljava/util/Comparator;Ljava/util/Collection;)LN4/t;

    move-result-object p0

    :goto_0
    return-object p0
.end method
