.class public abstract Lk9/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk9/r$a;
    }
.end annotation


# instance fields
.field private final a:Lk9/D;

.field private final b:Ljava/util/List;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lk9/D;Ljava/util/List;Ljava/lang/String;)V
    .locals 2

    .prologue
    const-string v0, "field"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/r;->a:Lk9/D;

    iput-object p2, p0, Lk9/r;->b:Ljava/util/List;

    iput-object p3, p0, Lk9/r;->c:Ljava/lang/String;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    invoke-virtual {p1}, Lk9/D;->f()I

    move-result v0

    invoke-virtual {p1}, Lk9/D;->g()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    if-ne p3, v0, :cond_0

    return-void

    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "The number of values ("

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") in "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " does not match the range of the field ("

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lk9/D;->f()I

    move-result p2

    invoke-virtual {p1}, Lk9/D;->g()I

    move-result p1

    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final synthetic d(Lk9/r;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lk9/r;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic e(Lk9/r;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lk9/r;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lk9/r;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lk9/r;->b:Ljava/util/List;

    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .prologue
    iget-object v0, p0, Lk9/r;->a:Lk9/D;

    invoke-virtual {v0}, Lk9/D;->b()Lk9/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lk9/b;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lk9/r;->b:Ljava/util/List;

    iget-object v1, p0, Lk9/r;->a:Lk9/D;

    invoke-virtual {v1}, Lk9/D;->g()I

    move-result v1

    sub-int v1, p1, v1

    invoke-static {v0, v1}, Lj7/v;->l0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The value "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " of "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lk9/r;->a:Lk9/D;

    invoke-virtual {p1}, Lk9/D;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " does not have a corresponding string representation"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Ll9/e;
    .locals 2

    new-instance v0, Ll9/j;

    new-instance v1, Lk9/r$b;

    invoke-direct {v1, p0}, Lk9/r$b;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Ll9/j;-><init>(Lx7/l;)V

    return-object v0
.end method

.method public b()Lm9/q;
    .locals 6

    new-instance v0, Lm9/q;

    new-instance v1, Lm9/u;

    iget-object v2, p0, Lk9/r;->b:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    new-instance v3, Lk9/r$a;

    invoke-direct {v3, p0}, Lk9/r$a;-><init>(Lk9/r;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "one of "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lk9/r;->b:Ljava/util/List;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lk9/r;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lm9/u;-><init>(Ljava/util/Collection;Lm9/a;Ljava/lang/String;)V

    invoke-static {v1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic c()Lk9/n;
    .locals 1

    iget-object v0, p0, Lk9/r;->a:Lk9/D;

    return-object v0
.end method

.method public final g()Lk9/D;
    .locals 1

    iget-object v0, p0, Lk9/r;->a:Lk9/D;

    return-object v0
.end method
