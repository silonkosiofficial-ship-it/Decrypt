.class public final La7/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/e;
.implements Lo7/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private C:I

.field final synthetic D:La7/o;


# direct methods
.method constructor <init>(La7/o;)V
    .locals 0

    iput-object p1, p0, La7/o$a;->D:La7/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p1, -0x80000000

    iput p1, p0, La7/o$a;->C:I

    return-void
.end method

.method private final a()Lm7/e;
    .locals 2

    .prologue
    iget v0, p0, La7/o$a;->C:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_0

    iget-object v0, p0, La7/o$a;->D:La7/o;

    invoke-static {v0}, La7/o;->f(La7/o;)I

    move-result v0

    iput v0, p0, La7/o$a;->C:I

    :cond_0
    iget v0, p0, La7/o$a;->C:I

    if-gez v0, :cond_1

    iput v1, p0, La7/o$a;->C:I

    const/4 v0, 0x0

    return-object v0

    :cond_1
    :try_start_0
    iget-object v0, p0, La7/o$a;->D:La7/o;

    invoke-static {v0}, La7/o;->g(La7/o;)[Lm7/e;

    move-result-object v0

    iget v1, p0, La7/o$a;->C:I

    aget-object v0, v0, v1

    if-nez v0, :cond_2

    sget-object v0, La7/n;->C:La7/n;

    return-object v0

    :cond_2
    add-int/lit8 v1, v1, -0x1

    iput v1, p0, La7/o$a;->C:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    sget-object v0, La7/n;->C:La7/n;

    return-object v0
.end method


# virtual methods
.method public e()Lo7/e;
    .locals 2

    .prologue
    invoke-direct {p0}, La7/o$a;->a()Lm7/e;

    move-result-object v0

    instance-of v1, v0, Lo7/e;

    if-eqz v1, :cond_0

    check-cast v0, Lo7/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()Lm7/i;
    .locals 3

    .prologue
    iget-object v0, p0, La7/o$a;->D:La7/o;

    invoke-static {v0}, La7/o;->g(La7/o;)[Lm7/e;

    move-result-object v0

    iget-object v1, p0, La7/o$a;->D:La7/o;

    invoke-static {v1}, La7/o;->f(La7/o;)I

    move-result v1

    aget-object v0, v0, v1

    if-eq v0, p0, :cond_0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, La7/o$a;->D:La7/o;

    invoke-static {v0}, La7/o;->f(La7/o;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    iget-object v1, p0, La7/o$a;->D:La7/o;

    invoke-static {v1}, La7/o;->g(La7/o;)[Lm7/e;

    move-result-object v1

    add-int/lit8 v2, v0, -0x1

    aget-object v0, v1, v0

    if-eq v0, p0, :cond_1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    return-object v0

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not started"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public t(Ljava/lang/Object;)V
    .locals 1

    .prologue
    invoke-static {p1}, Li7/w;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La7/o$a;->D:La7/o;

    invoke-static {p1}, Li7/w;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, La7/o;->i(La7/o;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object p1, p0, La7/o$a;->D:La7/o;

    const/4 v0, 0x0

    invoke-static {p1, v0}, La7/o;->h(La7/o;Z)Z

    return-void
.end method
