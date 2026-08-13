.class final Lcom/google/android/gms/internal/ads/Dw0;
.super Lcom/google/android/gms/internal/ads/fv0;
.source "SourceFile"


# static fields
.field static final J:[I


# instance fields
.field private final E:I

.field private final F:Lcom/google/android/gms/internal/ads/fv0;

.field private final G:Lcom/google/android/gms/internal/ads/fv0;

.field private final H:I

.field private final I:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/16 v0, 0x2f

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/Dw0;->J:[I

    return-void

    :array_0
    .array-data 4
        0x1
        0x1
        0x2
        0x3
        0x5
        0x8
        0xd
        0x15
        0x22
        0x37
        0x59
        0x90
        0xe9
        0x179
        0x262
        0x3db
        0x63d
        0xa18
        0x1055
        0x1a6d
        0x2ac2
        0x452f
        0x6ff1
        0xb520
        0x12511
        0x1da31
        0x2ff42
        0x4d973
        0x7d8b5
        0xcb228
        0x148add
        0x213d05
        0x35c7e2
        0x5704e7
        0x8cccc9
        0xe3d1b0
        0x1709e79
        0x2547029
        0x3c50ea2
        0x6197ecb
        0x9de8d6d
        0xff80c38
        0x19d699a5
        0x29cea5dd
        0x43a53f82
        0x6d73e55f
        0x7fffffff
    .end array-data
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/fv0;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/fv0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Dw0;->F:Lcom/google/android/gms/internal/ads/fv0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->H:I

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->E:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fv0;->s()I

    move-result p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/fv0;->s()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Dw0;->I:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/Cw0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/Dw0;-><init>(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/fv0;)V

    return-void
.end method

.method static bridge synthetic X(Lcom/google/android/gms/internal/ads/Dw0;)Lcom/google/android/gms/internal/ads/fv0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    return-object p0
.end method

.method static Y(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/fv0;
    .locals 5

    .prologue
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0x80

    if-ge v0, v1, :cond_2

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/Dw0;->Z(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/fv0;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v2, p0, Lcom/google/android/gms/internal/ads/Dw0;

    if-eqz v2, :cond_5

    move-object v2, p0

    check-cast v2, Lcom/google/android/gms/internal/ads/Dw0;

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v4

    add-int/2addr v3, v4

    if-ge v3, v1, :cond_3

    iget-object p0, v2, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/Dw0;->Z(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/fv0;

    move-result-object p0

    iget-object p1, v2, Lcom/google/android/gms/internal/ads/Dw0;->F:Lcom/google/android/gms/internal/ads/fv0;

    new-instance v0, Lcom/google/android/gms/internal/ads/Dw0;

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/internal/ads/Dw0;-><init>(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/fv0;)V

    return-object v0

    :cond_3
    iget-object v1, v2, Lcom/google/android/gms/internal/ads/Dw0;->F:Lcom/google/android/gms/internal/ads/fv0;

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/fv0;->s()I

    move-result v1

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/fv0;->s()I

    move-result v3

    if-le v1, v3, :cond_5

    iget v1, v2, Lcom/google/android/gms/internal/ads/Dw0;->I:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fv0;->s()I

    move-result v3

    if-gt v1, v3, :cond_4

    goto :goto_0

    :cond_4
    iget-object p0, v2, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    new-instance v0, Lcom/google/android/gms/internal/ads/Dw0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Dw0;-><init>(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/fv0;)V

    iget-object p0, v2, Lcom/google/android/gms/internal/ads/Dw0;->F:Lcom/google/android/gms/internal/ads/fv0;

    new-instance p1, Lcom/google/android/gms/internal/ads/Dw0;

    invoke-direct {p1, p0, v0}, Lcom/google/android/gms/internal/ads/Dw0;-><init>(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/fv0;)V

    return-object p1

    :cond_5
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/fv0;->s()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fv0;->s()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Dw0;->a0(I)I

    move-result v1

    if-lt v0, v1, :cond_6

    new-instance v0, Lcom/google/android/gms/internal/ads/Dw0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Dw0;-><init>(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/fv0;)V

    return-object v0

    :cond_6
    new-instance v0, Lcom/google/android/gms/internal/ads/Aw0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Aw0;-><init>(Lcom/google/android/gms/internal/ads/Cw0;)V

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Aw0;->a(Lcom/google/android/gms/internal/ads/Aw0;Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/fv0;

    move-result-object p0

    return-object p0
.end method

.method private static Z(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/fv0;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v1

    add-int v2, v0, v1

    new-array v2, v2, [B

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3, v3, v0}, Lcom/google/android/gms/internal/ads/fv0;->W([BIII)V

    invoke-virtual {p1, v2, v3, v0, v1}, Lcom/google/android/gms/internal/ads/fv0;->W([BIII)V

    new-instance p0, Lcom/google/android/gms/internal/ads/cv0;

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/cv0;-><init>([B)V

    return-object p0
.end method

.method static a0(I)I
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Dw0;->J:[I

    array-length v1, v0

    const/16 v1, 0x2f

    if-lt p0, v1, :cond_0

    const p0, 0x7fffffff

    return p0

    :cond_0
    aget p0, v0, p0

    return p0
.end method

.method static bridge synthetic b0(Lcom/google/android/gms/internal/ads/Dw0;)Lcom/google/android/gms/internal/ads/fv0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Dw0;->F:Lcom/google/android/gms/internal/ads/fv0;

    return-object p0
.end method


# virtual methods
.method protected final C(III)I
    .locals 2

    .prologue
    add-int v0, p2, p3

    iget v1, p0, Lcom/google/android/gms/internal/ads/Dw0;->H:I

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->F:Lcom/google/android/gms/internal/ads/fv0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/fv0;->C(III)I

    move-result p1

    return p1

    :cond_0
    if-lt p2, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    sub-int/2addr p2, v1

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/fv0;->C(III)I

    move-result p1

    return p1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->F:Lcom/google/android/gms/internal/ads/fv0;

    sub-int/2addr v1, p2

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/fv0;->C(III)I

    move-result p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    const/4 v0, 0x0

    sub-int/2addr p3, v1

    invoke-virtual {p2, p1, v0, p3}, Lcom/google/android/gms/internal/ads/fv0;->C(III)I

    move-result p1

    return p1
.end method

.method public final D(II)Lcom/google/android/gms/internal/ads/fv0;
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->E:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/fv0;->O(III)I

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/fv0;->D:Lcom/google/android/gms/internal/ads/fv0;

    return-object p1

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/Dw0;->E:I

    if-ne v0, v1, :cond_1

    return-object p0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->H:I

    if-gt p2, v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->F:Lcom/google/android/gms/internal/ads/fv0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/fv0;->D(II)Lcom/google/android/gms/internal/ads/fv0;

    move-result-object p1

    return-object p1

    :cond_2
    if-lt p1, v0, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    sub-int/2addr p2, v0

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/ads/fv0;->D(II)Lcom/google/android/gms/internal/ads/fv0;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->F:Lcom/google/android/gms/internal/ads/fv0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/fv0;->D(II)Lcom/google/android/gms/internal/ads/fv0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/Dw0;->H:I

    sub-int/2addr p2, v1

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/ads/fv0;->D(II)Lcom/google/android/gms/internal/ads/fv0;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/Dw0;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Dw0;-><init>(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/fv0;)V

    return-object v0
.end method

.method public final E()Lcom/google/android/gms/internal/ads/kv0;
    .locals 9

    .prologue
    const/4 v0, 0x2

    const/4 v1, 0x1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/ads/Bw0;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/google/android/gms/internal/ads/Bw0;-><init>(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/Cw0;)V

    :goto_0
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Bw0;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Bw0;->b()Lcom/google/android/gms/internal/ads/bv0;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/fv0;->M()Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget v3, Lcom/google/android/gms/internal/ads/kv0;->e:I

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/nio/ByteBuffer;

    invoke-virtual {v7}, Ljava/nio/Buffer;->remaining()I

    move-result v8

    add-int/2addr v6, v8

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v8

    if-eqz v8, :cond_1

    or-int/2addr v5, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v7

    if-eqz v7, :cond_2

    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    or-int/lit8 v5, v5, 0x4

    goto :goto_1

    :cond_3
    if-ne v5, v0, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/ads/hv0;

    invoke-direct {v0, v2, v6, v1, v4}, Lcom/google/android/gms/internal/ads/hv0;-><init>(Ljava/lang/Iterable;IZLcom/google/android/gms/internal/ads/jv0;)V

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/google/android/gms/internal/ads/Wv0;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/Wv0;-><init>(Ljava/lang/Iterable;)V

    const/16 v1, 0x1000

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/kv0;->e(Ljava/io/InputStream;I)Lcom/google/android/gms/internal/ads/kv0;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method final N(Lcom/google/android/gms/internal/ads/Wu0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->F:Lcom/google/android/gms/internal/ads/fv0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/fv0;->N(Lcom/google/android/gms/internal/ads/Wu0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/fv0;->N(Lcom/google/android/gms/internal/ads/Wu0;)V

    return-void
.end method

.method public final Q()Lcom/google/android/gms/internal/ads/av0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zw0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zw0;-><init>(Lcom/google/android/gms/internal/ads/Dw0;)V

    return-object v0
.end method

.method public final e(I)B
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->E:I

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/fv0;->V(II)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/Dw0;->f(I)B

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 12

    .prologue
    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/ads/fv0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/fv0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/Dw0;->E:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/google/android/gms/internal/ads/Dw0;->E:I

    if-nez v1, :cond_3

    return v0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/fv0;->P()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fv0;->P()I

    move-result v3

    if-eqz v1, :cond_5

    if-eqz v3, :cond_5

    if-ne v1, v3, :cond_4

    goto :goto_0

    :cond_4
    return v2

    :cond_5
    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ads/Bw0;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3}, Lcom/google/android/gms/internal/ads/Bw0;-><init>(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/Cw0;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Bw0;->b()Lcom/google/android/gms/internal/ads/bv0;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/internal/ads/Bw0;

    invoke-direct {v5, p1, v3}, Lcom/google/android/gms/internal/ads/Bw0;-><init>(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/Cw0;)V

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/Bw0;->b()Lcom/google/android/gms/internal/ads/bv0;

    move-result-object p1

    move v3, v2

    move v6, v3

    move v7, v6

    :goto_1
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v8

    sub-int/2addr v8, v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v9

    sub-int/2addr v9, v6

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v10

    if-nez v3, :cond_6

    invoke-virtual {v4, p1, v6, v10}, Lcom/google/android/gms/internal/ads/bv0;->X(Lcom/google/android/gms/internal/ads/fv0;II)Z

    move-result v11

    goto :goto_2

    :cond_6
    invoke-virtual {p1, v4, v3, v10}, Lcom/google/android/gms/internal/ads/bv0;->X(Lcom/google/android/gms/internal/ads/fv0;II)Z

    move-result v11

    :goto_2
    if-nez v11, :cond_7

    move v0, v2

    goto :goto_3

    :cond_7
    add-int/2addr v7, v10

    iget v11, p0, Lcom/google/android/gms/internal/ads/Dw0;->E:I

    if-lt v7, v11, :cond_9

    if-ne v7, v11, :cond_8

    :goto_3
    return v0

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_9
    if-ne v10, v8, :cond_a

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Bw0;->b()Lcom/google/android/gms/internal/ads/bv0;

    move-result-object v3

    move-object v4, v3

    move v3, v2

    goto :goto_4

    :cond_a
    add-int/2addr v3, v10

    :goto_4
    if-ne v10, v9, :cond_b

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/Bw0;->b()Lcom/google/android/gms/internal/ads/bv0;

    move-result-object p1

    move v6, v2

    goto :goto_1

    :cond_b
    add-int/2addr v6, v10

    goto :goto_1
.end method

.method final f(I)B
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->H:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->F:Lcom/google/android/gms/internal/ads/fv0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/fv0;->f(I)B

    move-result p1

    return p1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/fv0;->f(I)B

    move-result p1

    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zw0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zw0;-><init>(Lcom/google/android/gms/internal/ads/Dw0;)V

    return-object v0
.end method

.method public final n()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->E:I

    return v0
.end method

.method protected final o([BIII)V
    .locals 2

    .prologue
    add-int v0, p2, p4

    iget v1, p0, Lcom/google/android/gms/internal/ads/Dw0;->H:I

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->F:Lcom/google/android/gms/internal/ads/fv0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/fv0;->o([BIII)V

    return-void

    :cond_0
    if-lt p2, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    sub-int/2addr p2, v1

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/fv0;->o([BIII)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->F:Lcom/google/android/gms/internal/ads/fv0;

    sub-int/2addr v1, p2

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/google/android/gms/internal/ads/fv0;->o([BIII)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Dw0;->G:Lcom/google/android/gms/internal/ads/fv0;

    add-int/2addr p3, v1

    sub-int/2addr p4, v1

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0, p3, p4}, Lcom/google/android/gms/internal/ads/fv0;->o([BIII)V

    return-void
.end method

.method protected final s()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->I:I

    return v0
.end method

.method protected final w()Z
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Dw0;->I:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/Dw0;->E:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Dw0;->a0(I)I

    move-result v0

    if-lt v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
