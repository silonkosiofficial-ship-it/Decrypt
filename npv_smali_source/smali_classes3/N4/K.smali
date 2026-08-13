.class final LN4/K;
.super LN4/r;
.source "SourceFile"


# static fields
.field private static final J:[Ljava/lang/Object;

.field static final K:LN4/K;


# instance fields
.field final transient E:[Ljava/lang/Object;

.field private final transient F:I

.field final transient G:[Ljava/lang/Object;

.field private final transient H:I

.field private final transient I:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    new-array v4, v0, [Ljava/lang/Object;

    sput-object v4, LN4/K;->J:[Ljava/lang/Object;

    new-instance v0, LN4/K;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, v0

    move-object v2, v4

    invoke-direct/range {v1 .. v6}, LN4/K;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    sput-object v0, LN4/K;->K:LN4/K;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, LN4/r;-><init>()V

    iput-object p1, p0, LN4/K;->E:[Ljava/lang/Object;

    iput p2, p0, LN4/K;->F:I

    iput-object p3, p0, LN4/K;->G:[Ljava/lang/Object;

    iput p4, p0, LN4/K;->H:I

    iput p5, p0, LN4/K;->I:I

    return-void
.end method


# virtual methods
.method D()LN4/o;
    .locals 2

    iget-object v0, p0, LN4/K;->E:[Ljava/lang/Object;

    iget v1, p0, LN4/K;->I:I

    invoke-static {v0, v1}, LN4/o;->s([Ljava/lang/Object;I)LN4/o;

    move-result-object v0

    return-object v0
.end method

.method E()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public R()LN4/S;
    .locals 1

    invoke-virtual {p0}, LN4/r;->o()LN4/o;

    move-result-object v0

    invoke-virtual {v0}, LN4/o;->C()LN4/S;

    move-result-object v0

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    iget-object v0, p0, LN4/K;->G:[Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    array-length v2, v0

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, LN4/m;->c(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    iget v3, p0, LN4/K;->H:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_1

    return v1

    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method d([Ljava/lang/Object;I)I
    .locals 3

    iget-object v0, p0, LN4/K;->E:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, LN4/K;->I:I

    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, LN4/K;->I:I

    add-int/2addr p2, p1

    return p2
.end method

.method e()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN4/K;->E:[Ljava/lang/Object;

    return-object v0
.end method

.method f()I
    .locals 1

    iget v0, p0, LN4/K;->I:I

    return v0
.end method

.method g()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LN4/K;->F:I

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LN4/K;->R()LN4/S;

    move-result-object v0

    return-object v0
.end method

.method n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, LN4/K;->I:I

    return v0
.end method
