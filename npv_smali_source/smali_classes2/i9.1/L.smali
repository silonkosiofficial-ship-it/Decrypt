.class final Li9/L;
.super Lk9/y;
.source "SourceFile"


# instance fields
.field private final d:I

.field private final e:Z


# direct methods
.method public constructor <init>(IZ)V
    .locals 2

    sget-object v0, Li9/i;->a:Li9/i;

    invoke-virtual {v0}, Li9/i;->d()Lk9/q;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1, p1}, Lk9/y;-><init>(Lk9/n;II)V

    iput p1, p0, Li9/L;->d:I

    iput-boolean p2, p0, Li9/L;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(IZILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Li9/L;-><init>(IZ)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Li9/L;

    if-eqz v0, :cond_0

    iget v0, p0, Li9/L;->d:I

    check-cast p1, Li9/L;

    iget v1, p1, Li9/L;->d:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Li9/L;->e:Z

    iget-boolean p1, p1, Li9/L;->e:Z

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Li9/L;->d:I

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Li9/L;->e:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
