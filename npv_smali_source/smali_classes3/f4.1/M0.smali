.class final Lf4/M0;
.super Lf4/J0;
.source "SourceFile"


# static fields
.field private static final J:[Ljava/lang/Object;

.field static final K:Lf4/M0;


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

    sput-object v4, Lf4/M0;->J:[Ljava/lang/Object;

    new-instance v0, Lf4/M0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, v0

    move-object v2, v4

    invoke-direct/range {v1 .. v6}, Lf4/M0;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    sput-object v0, Lf4/M0;->K:Lf4/M0;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lf4/J0;-><init>()V

    iput-object p1, p0, Lf4/M0;->E:[Ljava/lang/Object;

    iput p2, p0, Lf4/M0;->F:I

    iput-object p3, p0, Lf4/M0;->G:[Ljava/lang/Object;

    iput p4, p0, Lf4/M0;->H:I

    iput p5, p0, Lf4/M0;->I:I

    return-void
.end method


# virtual methods
.method final D()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    iget-object v1, p0, Lf4/M0;->G:[Ljava/lang/Object;

    array-length v2, v1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Lf4/D0;->a(I)I

    move-result v2

    :goto_0
    iget v3, p0, Lf4/M0;->H:I

    and-int/2addr v2, v3

    aget-object v3, v1, v2

    if-nez v3, :cond_1

    return v0

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
    return v0
.end method

.method final d([Ljava/lang/Object;I)I
    .locals 2

    iget-object p2, p0, Lf4/M0;->E:[Ljava/lang/Object;

    const/4 v0, 0x0

    iget v1, p0, Lf4/M0;->I:I

    invoke-static {p2, v0, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lf4/M0;->I:I

    return p1
.end method

.method final e()I
    .locals 1

    iget v0, p0, Lf4/M0;->I:I

    return v0
.end method

.method final f()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final g()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf4/M0;->E:[Ljava/lang/Object;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lf4/M0;->F:I

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lf4/J0;->o()Lf4/I0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lf4/I0;->s(I)Lf4/P0;

    move-result-object v0

    return-object v0
.end method

.method final s()Lf4/I0;
    .locals 2

    iget-object v0, p0, Lf4/M0;->E:[Ljava/lang/Object;

    iget v1, p0, Lf4/M0;->I:I

    invoke-static {v0, v1}, Lf4/I0;->o([Ljava/lang/Object;I)Lf4/I0;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lf4/M0;->I:I

    return v0
.end method
