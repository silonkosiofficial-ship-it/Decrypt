.class public abstract Lx9/o;
.super Lx9/a;
.source "SourceFile"


# instance fields
.field private final a:Lt9/b;


# direct methods
.method private constructor <init>(Lt9/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lx9/a;-><init>(Ly7/k;)V

    iput-object p1, p0, Lx9/o;->a:Lt9/b;

    return-void
.end method

.method public synthetic constructor <init>(Lt9/b;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lx9/o;-><init>(Lt9/b;)V

    return-void
.end method

.method public static final synthetic r(Lx9/o;)Lt9/b;
    .locals 0

    iget-object p0, p0, Lx9/o;->a:Lt9/b;

    return-object p0
.end method


# virtual methods
.method public abstract a()Lv9/f;
.end method

.method public e(Lw9/j;Ljava/lang/Object;)V
    .locals 6

    .prologue
    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lx9/a;->j(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, Lx9/o;->a()Lv9/f;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Lw9/j;->k(Lv9/f;I)Lw9/f;

    move-result-object p1

    invoke-virtual {p0, p2}, Lx9/a;->i(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p0}, Lx9/o;->a()Lv9/f;

    move-result-object v3

    invoke-static {p0}, Lx9/o;->r(Lx9/o;)Lt9/b;

    move-result-object v4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p1, v3, v2, v4, v5}, Lw9/f;->r(Lv9/f;ILt9/e;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1}, Lw9/f;->b(Lv9/f;)V

    return-void
.end method

.method protected final l(Lw9/d;Ljava/lang/Object;II)V
    .locals 3

    .prologue
    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p4, :cond_1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p4, :cond_0

    add-int v2, p3, v1

    invoke-virtual {p0, p1, v2, p2, v0}, Lx9/o;->m(Lw9/d;ILjava/lang/Object;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Size must be known in advance when using READ_ALL"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected m(Lw9/d;ILjava/lang/Object;Z)V
    .locals 7

    const-string p4, "decoder"

    invoke-static {p1, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/o;->a()Lv9/f;

    move-result-object v1

    iget-object v3, p0, Lx9/o;->a:Lt9/b;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    move v2, p2

    invoke-static/range {v0 .. v6}, Lw9/c;->c(Lw9/d;Lv9/f;ILt9/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p3, p2, p1}, Lx9/o;->s(Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method protected abstract s(Ljava/lang/Object;ILjava/lang/Object;)V
.end method
