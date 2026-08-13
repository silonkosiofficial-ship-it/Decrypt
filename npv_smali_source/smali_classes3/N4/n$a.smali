.class abstract LN4/n$a;
.super LN4/n$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# instance fields
.field a:[Ljava/lang/Object;

.field b:I

.field c:Z


# direct methods
.method constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, LN4/n$b;-><init>()V

    const-string v0, "initialCapacity"

    invoke-static {p1, v0}, LN4/g;->b(ILjava/lang/String;)I

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, LN4/n$a;->a:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, LN4/n$a;->b:I

    return-void
.end method

.method private d(I)V
    .locals 3

    .prologue
    iget-object v0, p0, LN4/n$a;->a:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x0

    if-ge v1, p1, :cond_0

    array-length v1, v0

    invoke-static {v1, p1}, LN4/n$b;->a(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LN4/n$a;->a:[Ljava/lang/Object;

    :goto_0
    iput-boolean v2, p0, LN4/n$a;->c:Z

    goto :goto_1

    :cond_0
    iget-boolean p1, p0, LN4/n$a;->c:Z

    if-eqz p1, :cond_1

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    iput-object p1, p0, LN4/n$a;->a:[Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public varargs b([Ljava/lang/Object;)LN4/n$b;
    .locals 1

    array-length v0, p1

    invoke-virtual {p0, p1, v0}, LN4/n$a;->c([Ljava/lang/Object;I)V

    return-object p0
.end method

.method final c([Ljava/lang/Object;I)V
    .locals 3

    invoke-static {p1, p2}, LN4/F;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    iget v0, p0, LN4/n$a;->b:I

    add-int/2addr v0, p2

    invoke-direct {p0, v0}, LN4/n$a;->d(I)V

    iget-object v0, p0, LN4/n$a;->a:[Ljava/lang/Object;

    iget v1, p0, LN4/n$a;->b:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, LN4/n$a;->b:I

    add-int/2addr p1, p2

    iput p1, p0, LN4/n$a;->b:I

    return-void
.end method
