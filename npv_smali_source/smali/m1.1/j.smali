.class public abstract Lm1/j;
.super Lm1/e;
.source "SourceFile"

# interfaces
.implements Lm1/i;


# instance fields
.field private G0:[Lm1/e;

.field private H0:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lm1/e;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Lm1/e;

    iput-object v0, p0, Lm1/j;->G0:[Lm1/e;

    return-void
.end method


# virtual methods
.method public a2(Lm1/e;)V
    .locals 3

    .prologue
    invoke-static {p1, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lm1/j;->H0:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lm1/j;->G0:[Lm1/e;

    array-length v2, v1

    if-le v0, v2, :cond_1

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Lm1/e;

    iput-object v0, p0, Lm1/j;->G0:[Lm1/e;

    :cond_1
    iget-object v0, p0, Lm1/j;->G0:[Lm1/e;

    iget v1, p0, Lm1/j;->H0:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lm1/j;->H0:I

    :cond_2
    :goto_0
    return-void
.end method

.method public b2(Ljava/util/ArrayList;ILn1/o;)V
    .locals 4

    .prologue
    const-string v0, "dependencyLists"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lm1/j;->H0:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Lm1/j;->G0:[Lm1/e;

    aget-object v3, v3, v2

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p3, v3}, Ln1/o;->a(Lm1/e;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lm1/j;->H0:I

    :goto_1
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lm1/j;->G0:[Lm1/e;

    aget-object v2, v2, v1

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v3, Ln1/i;->a:Ln1/i$a;

    invoke-virtual {v3, v2, p2, p1, p3}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public c2(I)I
    .locals 5

    .prologue
    iget v0, p0, Lm1/j;->H0:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-ge v1, v0, :cond_2

    iget-object v3, p0, Lm1/j;->G0:[Lm1/e;

    aget-object v3, v3, v1

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    if-nez p1, :cond_0

    invoke-virtual {v3}, Lm1/e;->B()I

    move-result v4

    if-eq v4, v2, :cond_0

    invoke-virtual {v3}, Lm1/e;->B()I

    move-result p1

    return p1

    :cond_0
    const/4 v4, 0x1

    if-ne p1, v4, :cond_1

    invoke-virtual {v3}, Lm1/e;->z0()I

    move-result v4

    if-eq v4, v2, :cond_1

    invoke-virtual {v3}, Lm1/e;->z0()I

    move-result p1

    return p1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method public final d2()[Lm1/e;
    .locals 1

    iget-object v0, p0, Lm1/j;->G0:[Lm1/e;

    return-object v0
.end method

.method public final e2()I
    .locals 1

    iget v0, p0, Lm1/j;->H0:I

    return v0
.end method
