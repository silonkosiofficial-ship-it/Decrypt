.class public final Lk9/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/s;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk9/t$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lk9/o;

.field private final c:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lk9/o;)V
    .locals 2

    .prologue
    const-string v0, "onZero"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/t;->a:Ljava/lang/String;

    iput-object p2, p0, Lk9/t;->b:Lk9/o;

    invoke-static {p2}, Lk9/p;->a(Lk9/o;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk9/l;

    invoke-interface {v1}, Lk9/l;->c()Lk9/n;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lj7/v;->b0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v0}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk9/n;

    sget-object v1, Lk9/t$a;->c:Lk9/t$a$a;

    invoke-virtual {v1, v0}, Lk9/t$a$a;->a(Lk9/n;)Lk9/t$a;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iput-object p2, p0, Lk9/t;->c:Ljava/util/List;

    return-void
.end method

.method public static final synthetic c(Lk9/t;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lk9/t;->c:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public a()Ll9/e;
    .locals 7

    .prologue
    iget-object v0, p0, Lk9/t;->b:Lk9/o;

    invoke-interface {v0}, Lk9/o;->a()Ll9/e;

    move-result-object v0

    iget-object v1, p0, Lk9/t;->c:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk9/t$a;

    new-instance v4, Lk9/g;

    invoke-static {v3}, Lk9/t$a;->b(Lk9/t$a;)Ljava/lang/Object;

    move-result-object v5

    new-instance v6, Lk9/u;

    invoke-static {v3}, Lk9/t$a;->a(Lk9/t$a;)Lk9/b;

    move-result-object v3

    invoke-direct {v6, v3}, Lk9/u;-><init>(Ljava/lang/Object;)V

    invoke-direct {v4, v5, v6}, Lk9/g;-><init>(Ljava/lang/Object;Lx7/l;)V

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lk9/w;->a(Ljava/util/List;)Lk9/v;

    move-result-object v1

    instance-of v2, v1, Lk9/C;

    if-eqz v2, :cond_1

    new-instance v0, Ll9/c;

    iget-object v1, p0, Lk9/t;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ll9/c;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance v2, Ll9/b;

    new-instance v3, Lk9/t$b;

    invoke-direct {v3, v1}, Lk9/t$b;-><init>(Ljava/lang/Object;)V

    new-instance v1, Ll9/c;

    iget-object v4, p0, Lk9/t;->a:Ljava/lang/String;

    invoke-direct {v1, v4}, Ll9/c;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    new-instance v3, Lk9/t$c;

    sget-object v4, Lk9/C;->a:Lk9/C;

    invoke-direct {v3, v4}, Lk9/t$c;-><init>(Ljava/lang/Object;)V

    invoke-static {v3, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    const/4 v3, 0x2

    new-array v3, v3, [Li7/u;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v0, v3, v1

    invoke-static {v3}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Ll9/b;-><init>(Ljava/util/List;)V

    move-object v0, v2

    :goto_1
    return-object v0
.end method

.method public b()Lm9/q;
    .locals 10

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    new-instance v3, Lm9/q;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v4

    iget-object v5, p0, Lk9/t;->b:Lk9/o;

    invoke-interface {v5}, Lk9/o;->b()Lm9/q;

    move-result-object v5

    new-instance v6, Lk9/j;

    iget-object v7, p0, Lk9/t;->a:Ljava/lang/String;

    invoke-direct {v6, v7}, Lk9/j;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Lk9/j;->b()Lm9/q;

    move-result-object v6

    new-instance v7, Lm9/q;

    iget-object v8, p0, Lk9/t;->c:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v8

    goto :goto_0

    :cond_0
    new-instance v8, Lm9/v;

    new-instance v9, Lk9/t$d;

    invoke-direct {v9, p0}, Lk9/t$d;-><init>(Lk9/t;)V

    invoke-direct {v8, v9}, Lm9/v;-><init>(Lx7/l;)V

    invoke-static {v8}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    :goto_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v9

    invoke-direct {v7, v8, v9}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    new-array v8, v2, [Lm9/q;

    aput-object v6, v8, v1

    aput-object v7, v8, v0

    invoke-static {v8}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lm9/n;->b(Ljava/util/List;)Lm9/q;

    move-result-object v6

    new-array v2, v2, [Lm9/q;

    aput-object v5, v2, v1

    aput-object v6, v2, v0

    invoke-static {v2}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v3
.end method

.method public final d()Lk9/o;
    .locals 1

    iget-object v0, p0, Lk9/t;->b:Lk9/o;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Lk9/t;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk9/t;->a:Ljava/lang/String;

    check-cast p1, Lk9/t;

    iget-object v1, p1, Lk9/t;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk9/t;->b:Lk9/o;

    iget-object p1, p1, Lk9/t;->b:Lk9/o;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lk9/t;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lk9/t;->b:Lk9/o;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Optional("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk9/t;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk9/t;->b:Lk9/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
