.class final LX/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements Lz7/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final C:LX/b;


# direct methods
.method public constructor <init>(LX/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX/b$a;->C:LX/b;

    return-void
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0, p1, p2}, LX/b;->a(ILjava/lang/Object;)V

    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0, p1}, LX/b;->d(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0, p1, p2}, LX/b;->f(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0, p1}, LX/b;->h(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0}, LX/b;->j()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0, p1}, LX/b;->l(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0, p1}, LX/b;->n(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v0

    return v0
.end method

.method public e(I)Ljava/lang/Object;
    .locals 1

    invoke-static {p0, p1}, LX/c;->a(Ljava/util/List;I)V

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0, p1}, LX/b;->D(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    invoke-static {p0, p1}, LX/c;->a(Ljava/util/List;I)V

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0, p1}, LX/b;->v(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0}, LX/b;->w()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LX/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LX/b$c;-><init>(Ljava/util/List;I)V

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0, p1}, LX/b;->z(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 2

    new-instance v0, LX/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LX/b$c;-><init>(Ljava/util/List;I)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, LX/b$c;

    invoke-direct {v0, p0, p1}, LX/b$c;-><init>(Ljava/util/List;I)V

    return-object v0
.end method

.method public final bridge remove(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LX/b$a;->e(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0, p1}, LX/b;->A(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0, p1}, LX/b;->C(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0, p1}, LX/b;->H(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {p0, p1}, LX/c;->a(Ljava/util/List;I)V

    iget-object v0, p0, LX/b$a;->C:LX/b;

    invoke-virtual {v0, p1, p2}, LX/b;->J(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, LX/b$a;->d()I

    move-result v0

    return v0
.end method

.method public subList(II)Ljava/util/List;
    .locals 1

    invoke-static {p0, p1, p2}, LX/c;->b(Ljava/util/List;II)V

    new-instance v0, LX/b$b;

    invoke-direct {v0, p0, p1, p2}, LX/b$b;-><init>(Ljava/util/List;II)V

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, Ly7/j;->a(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Ly7/j;->b(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
