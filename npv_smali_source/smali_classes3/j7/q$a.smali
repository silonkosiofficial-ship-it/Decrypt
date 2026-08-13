.class public final Lj7/q$a;
.super Lj7/d;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/q;->c([I)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic D:[I


# direct methods
.method constructor <init>([I)V
    .locals 0

    iput-object p1, p0, Lj7/q$a;->D:[I

    invoke-direct {p0}, Lj7/d;-><init>()V

    return-void
.end method


# virtual methods
.method public C(I)I
    .locals 1

    iget-object v0, p0, Lj7/q$a;->D:[I

    invoke-static {v0, p1}, Lj7/s;->y0([II)I

    move-result p1

    return p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lj7/q$a;->g(I)Z

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lj7/q$a;->D:[I

    array-length v0, v0

    return v0
.end method

.method public g(I)Z
    .locals 1

    iget-object v0, p0, Lj7/q$a;->D:[I

    invoke-static {v0, p1}, Lj7/n;->R([II)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj7/q$a;->o(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .prologue
    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lj7/q$a;->s(I)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lj7/q$a;->D:[I

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .prologue
    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lj7/q$a;->C(I)I

    move-result p1

    return p1
.end method

.method public o(I)Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lj7/q$a;->D:[I

    aget p1, v0, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public s(I)I
    .locals 1

    iget-object v0, p0, Lj7/q$a;->D:[I

    invoke-static {v0, p1}, Lj7/s;->j0([II)I

    move-result p1

    return p1
.end method
