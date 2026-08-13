.class public final Lr/I;
.super Lr/P;
.source "SourceFile"


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lr/P;-><init>(ILy7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(IILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x10

    :cond_0
    invoke-direct {p0, p1}, Lr/I;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Z
    .locals 3

    iget v0, p0, Lr/P;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lr/I;->i(I)V

    iget-object v0, p0, Lr/P;->a:[Ljava/lang/Object;

    iget v2, p0, Lr/P;->b:I

    aput-object p1, v0, v2

    add-int/2addr v2, v1

    iput v2, p0, Lr/P;->b:I

    return v1
.end method

.method public final h()V
    .locals 4

    iget-object v0, p0, Lr/P;->a:[Ljava/lang/Object;

    iget v1, p0, Lr/P;->b:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lj7/n;->w([Ljava/lang/Object;Ljava/lang/Object;II)V

    iput v3, p0, Lr/P;->b:I

    return-void
.end method

.method public final i(I)V
    .locals 2

    .prologue
    iget-object v0, p0, Lr/P;->a:[Ljava/lang/Object;

    array-length v1, v0

    if-ge v1, p1, :cond_0

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x3

    div-int/lit8 v1, v1, 0x2

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "copyOf(this, newSize)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lr/P;->a:[Ljava/lang/Object;

    :cond_0
    return-void
.end method
