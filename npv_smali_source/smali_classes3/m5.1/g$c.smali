.class final Lm5/g$c;
.super Ljava/io/InputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private C:I

.field private D:I

.field final synthetic E:Lm5/g;


# direct methods
.method private constructor <init>(Lm5/g;Lm5/g$b;)V
    .locals 1

    iput-object p1, p0, Lm5/g$c;->E:Lm5/g;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    iget v0, p2, Lm5/g$b;->a:I

    add-int/lit8 v0, v0, 0x4

    invoke-static {p1, v0}, Lm5/g;->a(Lm5/g;I)I

    move-result p1

    iput p1, p0, Lm5/g$c;->C:I

    iget p1, p2, Lm5/g$b;->b:I

    iput p1, p0, Lm5/g$c;->D:I

    return-void
.end method

.method synthetic constructor <init>(Lm5/g;Lm5/g$b;Lm5/g$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lm5/g$c;-><init>(Lm5/g;Lm5/g$b;)V

    return-void
.end method


# virtual methods
.method public read()I
    .locals 3

    .prologue
    iget v0, p0, Lm5/g$c;->D:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-object v0, p0, Lm5/g$c;->E:Lm5/g;

    invoke-static {v0}, Lm5/g;->i(Lm5/g;)Ljava/io/RandomAccessFile;

    move-result-object v0

    iget v1, p0, Lm5/g$c;->C:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object v0, p0, Lm5/g$c;->E:Lm5/g;

    invoke-static {v0}, Lm5/g;->i(Lm5/g;)Ljava/io/RandomAccessFile;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->read()I

    move-result v0

    iget-object v1, p0, Lm5/g$c;->E:Lm5/g;

    iget v2, p0, Lm5/g$c;->C:I

    add-int/lit8 v2, v2, 0x1

    invoke-static {v1, v2}, Lm5/g;->a(Lm5/g;I)I

    move-result v1

    iput v1, p0, Lm5/g$c;->C:I

    iget v1, p0, Lm5/g$c;->D:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lm5/g$c;->D:I

    return v0
.end method

.method public read([BII)I
    .locals 2

    .prologue
    const-string v0, "buffer"

    invoke-static {p1, v0}, Lm5/g;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    or-int v0, p2, p3

    if-ltz v0, :cond_2

    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_2

    iget v0, p0, Lm5/g$c;->D:I

    if-lez v0, :cond_1

    if-le p3, v0, :cond_0

    move p3, v0

    :cond_0
    iget-object v0, p0, Lm5/g$c;->E:Lm5/g;

    iget v1, p0, Lm5/g$c;->C:I

    invoke-static {v0, v1, p1, p2, p3}, Lm5/g;->g(Lm5/g;I[BII)V

    iget-object p1, p0, Lm5/g$c;->E:Lm5/g;

    iget p2, p0, Lm5/g$c;->C:I

    add-int/2addr p2, p3

    invoke-static {p1, p2}, Lm5/g;->a(Lm5/g;I)I

    move-result p1

    iput p1, p0, Lm5/g$c;->C:I

    iget p1, p0, Lm5/g$c;->D:I

    sub-int/2addr p1, p3

    iput p1, p0, Lm5/g$c;->D:I

    return p3

    :cond_1
    const/4 p1, -0x1

    return p1

    :cond_2
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p1
.end method
