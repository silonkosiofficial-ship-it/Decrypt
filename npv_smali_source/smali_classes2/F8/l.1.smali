.class public abstract LF8/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/e0;


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(LO7/h;)Z
    .locals 1

    .prologue
    invoke-static {p1}, LH8/k;->m(LO7/m;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lr8/f;->E(LO7/m;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method protected final b(LO7/h;LO7/h;)Z
    .locals 3

    .prologue
    const-string v0, "first"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "second"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-interface {p2}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LO7/n;->b()LO7/m;

    move-result-object p1

    invoke-interface {p2}, LO7/n;->b()LO7/m;

    move-result-object p2

    :goto_0
    const/4 v0, 0x1

    if-eqz p1, :cond_7

    if-eqz p2, :cond_7

    instance-of v2, p1, LO7/G;

    if-eqz v2, :cond_1

    instance-of p1, p2, LO7/G;

    return p1

    :cond_1
    instance-of v2, p2, LO7/G;

    if-eqz v2, :cond_2

    return v1

    :cond_2
    instance-of v2, p1, LO7/K;

    if-eqz v2, :cond_4

    instance-of v2, p2, LO7/K;

    if-eqz v2, :cond_3

    check-cast p1, LO7/K;

    invoke-interface {p1}, LO7/K;->e()Ln8/c;

    move-result-object p1

    check-cast p2, LO7/K;

    invoke-interface {p2}, LO7/K;->e()Ln8/c;

    move-result-object p2

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move v1, v0

    :cond_3
    return v1

    :cond_4
    instance-of v0, p2, LO7/K;

    if-eqz v0, :cond_5

    return v1

    :cond_5
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-interface {p2}, LO7/I;->getName()Ln8/f;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    return v1

    :cond_6
    invoke-interface {p1}, LO7/m;->b()LO7/m;

    move-result-object p1

    invoke-interface {p2}, LO7/m;->b()LO7/m;

    move-result-object p2

    goto :goto_0

    :cond_7
    return v0
.end method

.method protected abstract d(LO7/h;)Z
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LF8/e0;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p0}, LF8/l;->hashCode()I

    move-result v2

    if-eq v0, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, LF8/e0;

    invoke-interface {p1}, LF8/e0;->x()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0}, LF8/e0;->x()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-eq v0, v2, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, LF8/l;->w()LO7/h;

    move-result-object v0

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    invoke-direct {p0, v0}, LF8/l;->c(LO7/h;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-direct {p0, p1}, LF8/l;->c(LO7/h;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {p0, p1}, LF8/l;->d(LO7/h;)Z

    move-result p1

    return p1

    :cond_6
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget v0, p0, LF8/l;->a:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, LF8/l;->w()LO7/h;

    move-result-object v0

    invoke-direct {p0, v0}, LF8/l;->c(LO7/h;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lr8/f;->m(LO7/m;)Ln8/d;

    move-result-object v0

    invoke-virtual {v0}, Ln8/d;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    iput v0, p0, LF8/l;->a:I

    return v0
.end method

.method public abstract w()LO7/h;
.end method
