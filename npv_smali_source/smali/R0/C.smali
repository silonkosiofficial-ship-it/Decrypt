.class final LR0/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/z;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Ljava/lang/String;LR0/q;I)Landroid/graphics/Typeface;
    .locals 1

    .prologue
    sget-object v0, LR0/o;->b:LR0/o$a;

    invoke-virtual {v0}, LR0/o$a;->b()I

    move-result v0

    invoke-static {p3, v0}, LR0/o;->f(II)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LR0/q;->D:LR0/q$a;

    invoke-virtual {v0}, LR0/q$a;->d()LR0/q;

    move-result-object v0

    invoke-static {p2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    return-object p1

    :cond_1
    invoke-static {p2, p3}, LR0/d;->c(LR0/q;I)I

    move-result p2

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-nez p3, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {p2}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method private final d(Ljava/lang/String;LR0/q;I)Landroid/graphics/Typeface;
    .locals 3

    .prologue
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LR0/C;->c(Ljava/lang/String;LR0/q;I)Landroid/graphics/Typeface;

    move-result-object p1

    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {p2, p3}, LR0/d;->c(LR0/q;I)I

    move-result v2

    invoke-static {v0, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, v1, p2, p3}, LR0/C;->c(Ljava/lang/String;LR0/q;I)Landroid/graphics/Typeface;

    move-result-object p2

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    move-object v1, p1

    :cond_1
    return-object v1
.end method


# virtual methods
.method public a(LR0/q;I)Landroid/graphics/Typeface;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, LR0/C;->c(Ljava/lang/String;LR0/q;I)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public b(LR0/u;LR0/q;I)Landroid/graphics/Typeface;
    .locals 1

    .prologue
    invoke-virtual {p1}, LR0/u;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, LR0/D;->b(Ljava/lang/String;LR0/q;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, LR0/C;->d(Ljava/lang/String;LR0/q;I)Landroid/graphics/Typeface;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LR0/u;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, LR0/C;->c(Ljava/lang/String;LR0/q;I)Landroid/graphics/Typeface;

    move-result-object v0

    :cond_0
    return-object v0
.end method
