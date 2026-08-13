.class public final LF8/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/e0;
.implements LJ8/h;


# instance fields
.field private a:LF8/E;

.field private final b:Ljava/util/LinkedHashSet;

.field private final c:I


# direct methods
.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1

    const-string v0, "typesToIntersect"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LF8/D;->b:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iput p1, p0, LF8/D;->c:I

    return-void
.end method

.method private constructor <init>(Ljava/util/Collection;LF8/E;)V
    .locals 0

    invoke-direct {p0, p1}, LF8/D;-><init>(Ljava/util/Collection;)V

    iput-object p2, p0, LF8/D;->a:LF8/E;

    return-void
.end method

.method public static synthetic f(LF8/D;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, LF8/D$c;->D:LF8/D$c;

    :cond_0
    invoke-virtual {p0, p1}, LF8/D;->e(Lx7/l;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Ly8/h;
    .locals 3

    sget-object v0, Ly8/n;->d:Ly8/n$a;

    const-string v1, "member scope for intersection type"

    iget-object v2, p0, LF8/D;->b:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v1, v2}, Ly8/n$a;->a(Ljava/lang/String;Ljava/util/Collection;)Ly8/h;

    move-result-object v0

    return-object v0
.end method

.method public final c()LF8/M;
    .locals 7

    sget-object v0, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {v0}, LF8/a0$a;->i()LF8/a0;

    move-result-object v1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0}, LF8/D;->b()Ly8/h;

    move-result-object v5

    new-instance v6, LF8/D$a;

    invoke-direct {v6, p0}, LF8/D$a;-><init>(LF8/D;)V

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v6}, LF8/F;->n(LF8/a0;LF8/e0;Ljava/util/List;ZLy8/h;Lx7/l;)LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public final d()LF8/E;
    .locals 1

    iget-object v0, p0, LF8/D;->a:LF8/E;

    return-object v0
.end method

.method public final e(Lx7/l;)Ljava/lang/String;
    .locals 10

    const-string v0, "getProperTypeRelatedToStringify"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/D;->b:Ljava/util/LinkedHashSet;

    new-instance v1, LF8/D$b;

    invoke-direct {v1, p1}, LF8/D$b;-><init>(Lx7/l;)V

    invoke-static {v0, v1}, Lj7/v;->L0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v7, LF8/D$d;

    invoke-direct {v7, p1}, LF8/D$d;-><init>(Lx7/l;)V

    const/16 v8, 0x18

    const/4 v9, 0x0

    const-string v2, " & "

    const-string v3, "{"

    const-string v4, "}"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lj7/v;->r0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LF8/D;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, LF8/D;->b:Ljava/util/LinkedHashSet;

    check-cast p1, LF8/D;

    iget-object p1, p1, LF8/D;->b:Ljava/util/LinkedHashSet;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g(LG8/g;)LF8/D;
    .locals 4

    .prologue
    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/D;->u()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    invoke-virtual {v2, p1}, LF8/E;->Y0(LG8/g;)LF8/E;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LF8/D;->d()LF8/E;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2, p1}, LF8/E;->Y0(LG8/g;)LF8/E;

    move-result-object v0

    :cond_2
    new-instance p1, LF8/D;

    invoke-direct {p1, v1}, LF8/D;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, v0}, LF8/D;->h(LF8/E;)LF8/D;

    move-result-object v0

    :goto_1
    if-nez v0, :cond_3

    move-object v0, p0

    :cond_3
    return-object v0
.end method

.method public final h(LF8/E;)LF8/D;
    .locals 2

    new-instance v0, LF8/D;

    iget-object v1, p0, LF8/D;->b:Ljava/util/LinkedHashSet;

    invoke-direct {v0, v1, p1}, LF8/D;-><init>(Ljava/util/Collection;LF8/E;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LF8/D;->c:I

    return v0
.end method

.method public t()LL7/g;
    .locals 2

    iget-object v0, p0, LF8/D;->b:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/E;

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->t()LL7/g;

    move-result-object v0

    const-string v1, "getBuiltIns(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, LF8/D;->f(LF8/D;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LF8/D;->b:Ljava/util/LinkedHashSet;

    return-object v0
.end method

.method public bridge synthetic v(LG8/g;)LF8/e0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/D;->g(LG8/g;)LF8/D;

    move-result-object p1

    return-object p1
.end method

.method public w()LO7/h;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
