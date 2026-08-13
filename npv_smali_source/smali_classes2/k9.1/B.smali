.class public abstract Lk9/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/l;


# instance fields
.field private final a:Lk9/n;

.field private final b:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lk9/n;Ljava/util/Set;)V
    .locals 1

    .prologue
    const-string v0, "field"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptedStrings"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/B;->a:Lk9/n;

    iput-object p2, p0, Lk9/B;->b:Ljava/util/Set;

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The set of accepted strings is empty"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ll9/e;
    .locals 3

    new-instance v0, Ll9/j;

    new-instance v1, Lk9/B$a;

    iget-object v2, p0, Lk9/B;->a:Lk9/n;

    invoke-interface {v2}, Lk9/n;->b()Lk9/b;

    move-result-object v2

    invoke-direct {v1, v2}, Lk9/B$a;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Ll9/j;-><init>(Lx7/l;)V

    return-object v0
.end method

.method public b()Lm9/q;
    .locals 5

    new-instance v0, Lm9/q;

    new-instance v1, Lm9/u;

    iget-object v2, p0, Lk9/B;->b:Ljava/util/Set;

    check-cast v2, Ljava/util/Collection;

    iget-object v3, p0, Lk9/B;->a:Lk9/n;

    invoke-interface {v3}, Lk9/n;->b()Lk9/b;

    move-result-object v3

    iget-object v4, p0, Lk9/B;->a:Lk9/n;

    invoke-interface {v4}, Lk9/n;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lm9/u;-><init>(Ljava/util/Collection;Lm9/a;Ljava/lang/String;)V

    invoke-static {v1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public final c()Lk9/n;
    .locals 1

    iget-object v0, p0, Lk9/B;->a:Lk9/n;

    return-object v0
.end method
