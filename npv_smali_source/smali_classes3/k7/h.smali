.class public final Lk7/h;
.super Lj7/j;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/io/Serializable;
.implements Lz7/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk7/h$a;
    }
.end annotation


# static fields
.field private static final D:Lk7/h$a;

.field private static final E:Lk7/h;


# instance fields
.field private final C:Lk7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk7/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk7/h$a;-><init>(Ly7/k;)V

    sput-object v0, Lk7/h;->D:Lk7/h$a;

    new-instance v0, Lk7/h;

    sget-object v1, Lk7/d;->P:Lk7/d$a;

    invoke-virtual {v1}, Lk7/d$a;->e()Lk7/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lk7/h;-><init>(Lk7/d;)V

    sput-object v0, Lk7/h;->E:Lk7/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lk7/d;

    invoke-direct {v0}, Lk7/d;-><init>()V

    invoke-direct {p0, v0}, Lk7/h;-><init>(Lk7/d;)V

    return-void
.end method

.method public constructor <init>(Lk7/d;)V
    .locals 1

    const-string v0, "backing"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lj7/j;-><init>()V

    iput-object p1, p0, Lk7/h;->C:Lk7/d;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Lk7/h;->C:Lk7/d;

    invoke-virtual {v0, p1}, Lk7/d;->k(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lk7/h;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->o()V

    invoke-super {p0, p1}, Ljava/util/AbstractSet;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lk7/h;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lk7/h;->C:Lk7/d;

    invoke-virtual {v0, p1}, Lk7/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lk7/h;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->size()I

    move-result v0

    return v0
.end method

.method public final e()Ljava/util/Set;
    .locals 1

    .prologue
    iget-object v0, p0, Lk7/h;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->m()Ljava/util/Map;

    invoke-virtual {p0}, Lj7/j;->size()I

    move-result v0

    if-lez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    sget-object v0, Lk7/h;->E:Lk7/h;

    :goto_0
    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lk7/h;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lk7/h;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->J()Lk7/d$e;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lk7/h;->C:Lk7/d;

    invoke-virtual {v0, p1}, Lk7/d;->S(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lk7/h;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->o()V

    invoke-super {p0, p1}, Ljava/util/AbstractSet;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lk7/h;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->o()V

    invoke-super {p0, p1}, Ljava/util/AbstractSet;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method
