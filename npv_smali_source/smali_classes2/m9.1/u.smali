.class public final Lm9/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/u$a;
    }
.end annotation


# instance fields
.field private final a:Lm9/a;

.field private final b:Ljava/lang/String;

.field private final c:Lm9/u$a;


# direct methods
.method public constructor <init>(Ljava/util/Collection;Lm9/a;Ljava/lang/String;)V
    .locals 11

    .prologue
    const-string v0, "strings"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whatThisExpects"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lm9/u;->a:Lm9/a;

    iput-object p3, p0, Lm9/u;->b:Ljava/lang/String;

    new-instance p2, Lm9/u$a;

    const/4 p3, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p2, p3, v0, v1, p3}, Lm9/u$a;-><init>(Ljava/util/List;ZILy7/k;)V

    iput-object p2, p0, Lm9/u;->c:Lm9/u$a;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_3

    iget-object v2, p0, Lm9/u;->c:Lm9/u$a;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    move v4, v0

    :goto_1
    const/4 v5, 0x1

    if-ge v4, v3, :cond_1

    invoke-virtual {p2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v2}, Lm9/u$a;->a()Ljava/util/List;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    new-instance v10, Lm9/u$d;

    invoke-direct {v10, v8}, Lm9/u$d;-><init>(Ljava/lang/Comparable;)V

    invoke-static {v7, v0, v9, v10}, Lj7/v;->i(Ljava/util/List;IILx7/l;)I

    move-result v7

    if-gez v7, :cond_0

    new-instance v8, Lm9/u$a;

    invoke-direct {v8, p3, v0, v1, p3}, Lm9/u$a;-><init>(Ljava/util/List;ZILy7/k;)V

    invoke-virtual {v2}, Lm9/u$a;->a()Ljava/util/List;

    move-result-object v2

    neg-int v7, v7

    sub-int/2addr v7, v5

    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    invoke-interface {v2, v7, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    move-object v2, v8

    goto :goto_2

    :cond_0
    invoke-virtual {v2}, Lm9/u$a;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li7/u;

    invoke-virtual {v2}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/u$a;

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lm9/u$a;->b()Z

    move-result v3

    xor-int/2addr v3, v5

    if-eqz v3, :cond_2

    invoke-virtual {v2, v5}, Lm9/u$a;->c(Z)V

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The string \'"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' was passed several times"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Found an empty string in "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lm9/u;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    iget-object p1, p0, Lm9/u;->c:Lm9/u$a;

    invoke-static {p1}, Lm9/u;->b(Lm9/u$a;)V

    return-void
.end method

.method private static final b(Lm9/u$a;)V
    .locals 6

    .prologue
    invoke-virtual {p0}, Lm9/u$a;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li7/u;

    invoke-virtual {v1}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm9/u$a;

    invoke-static {v1}, Lm9/u;->b(Lm9/u$a;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lm9/u$a;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li7/u;

    invoke-virtual {v2}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/u$a;

    invoke-virtual {v2}, Lm9/u$a;->b()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2}, Lm9/u$a;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_1

    invoke-virtual {v2}, Lm9/u$a;->a()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li7/u;

    invoke-virtual {v2}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/u$a;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_1
    invoke-static {v3, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lm9/u$a;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lm9/u$a;->a()Ljava/util/List;

    move-result-object p0

    new-instance v1, Lm9/u$b;

    invoke-direct {v1}, Lm9/u$b;-><init>()V

    invoke-static {v0, v1}, Lj7/v;->L0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p0, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public static final synthetic c(Lm9/u;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lm9/u;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;
    .locals 11

    .prologue
    const-string v0, "input"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm9/u;->c:Lm9/u$a;

    new-instance v1, Ly7/M;

    invoke-direct {v1}, Ly7/M;-><init>()V

    iput p3, v1, Ly7/M;->C:I

    const/4 v2, 0x0

    :goto_0
    iget v3, v1, Ly7/M;->C:I

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-gt v3, v4, :cond_2

    invoke-virtual {v0}, Lm9/u$a;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    iget v2, v1, Ly7/M;->C:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_0
    invoke-virtual {v0}, Lm9/u$a;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li7/u;

    invoke-virtual {v3}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm9/u$a;

    iget v7, v1, Ly7/M;->C:I

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v5, p2

    move-object v6, v4

    invoke-static/range {v5 .. v10}, LS8/r;->b1(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget v0, v1, Ly7/M;->C:I

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v0, v4

    iput v0, v1, Ly7/M;->C:I

    move-object v0, v3

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    iget-object v0, p0, Lm9/u;->a:Lm9/a;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p2, p3, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, p1, p2, p3, v1}, Lm9/p;->c(Lm9/a;Ljava/lang/Object;Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_3
    sget-object p1, Lm9/k;->a:Lm9/k$a;

    new-instance v0, Lm9/u$c;

    invoke-direct {v0, p0, p2, p3, v1}, Lm9/u$c;-><init>(Lm9/u;Ljava/lang/CharSequence;ILy7/M;)V

    invoke-virtual {p1, p3, v0}, Lm9/k$a;->a(ILx7/a;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    return-object p1
.end method
