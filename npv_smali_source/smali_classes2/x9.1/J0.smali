.class public final Lx9/J0;
.super Lx9/n0;
.source "SourceFile"


# instance fields
.field private a:[J

.field private b:I


# direct methods
.method private constructor <init>([J)V
    .locals 1

    const-string v0, "bufferWithData"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lx9/n0;-><init>()V

    iput-object p1, p0, Lx9/J0;->a:[J

    invoke-static {p1}, Li7/H;->M([J)I

    move-result p1

    iput p1, p0, Lx9/J0;->b:I

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, Lx9/J0;->b(I)V

    return-void
.end method

.method public synthetic constructor <init>([JLy7/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lx9/J0;-><init>([J)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx9/J0;->f()[J

    move-result-object v0

    invoke-static {v0}, Li7/H;->d([J)Li7/H;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 2

    .prologue
    iget-object v0, p0, Lx9/J0;->a:[J

    invoke-static {v0}, Li7/H;->M([J)I

    move-result v0

    if-ge v0, p1, :cond_0

    iget-object v0, p0, Lx9/J0;->a:[J

    invoke-static {v0}, Li7/H;->M([J)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {p1, v1}, LE7/j;->d(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    const-string v0, "copyOf(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Li7/H;->f([J)[J

    move-result-object p1

    iput-object p1, p0, Lx9/J0;->a:[J

    :cond_0
    return-void
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lx9/J0;->b:I

    return v0
.end method

.method public final e(J)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lx9/n0;->c(Lx9/n0;IILjava/lang/Object;)V

    iget-object v0, p0, Lx9/J0;->a:[J

    invoke-virtual {p0}, Lx9/J0;->d()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lx9/J0;->b:I

    invoke-static {v0, v1, p1, p2}, Li7/H;->Q([JIJ)V

    return-void
.end method

.method public f()[J
    .locals 2

    iget-object v0, p0, Lx9/J0;->a:[J

    invoke-virtual {p0}, Lx9/J0;->d()I

    move-result v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Li7/H;->f([J)[J

    move-result-object v0

    return-object v0
.end method
