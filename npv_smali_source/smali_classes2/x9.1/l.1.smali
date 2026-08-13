.class public final Lx9/l;
.super Lx9/n0;
.source "SourceFile"


# instance fields
.field private a:[C

.field private b:I


# direct methods
.method public constructor <init>([C)V
    .locals 1

    const-string v0, "bufferWithData"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lx9/n0;-><init>()V

    iput-object p1, p0, Lx9/l;->a:[C

    array-length p1, p1

    iput p1, p0, Lx9/l;->b:I

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, Lx9/l;->b(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx9/l;->f()[C

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 2

    .prologue
    iget-object v0, p0, Lx9/l;->a:[C

    array-length v1, v0

    if-ge v1, p1, :cond_0

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {p1, v1}, LE7/j;->d(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object p1

    const-string v0, "copyOf(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lx9/l;->a:[C

    :cond_0
    return-void
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lx9/l;->b:I

    return v0
.end method

.method public final e(C)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lx9/n0;->c(Lx9/n0;IILjava/lang/Object;)V

    iget-object v0, p0, Lx9/l;->a:[C

    invoke-virtual {p0}, Lx9/l;->d()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lx9/l;->b:I

    aput-char p1, v0, v1

    return-void
.end method

.method public f()[C
    .locals 2

    iget-object v0, p0, Lx9/l;->a:[C

    invoke-virtual {p0}, Lx9/l;->d()I

    move-result v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
