.class public final Lcom/google/android/gms/internal/ads/u5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/y5;


# static fields
.field private static final w:[B


# instance fields
.field private final a:Z

.field private final b:Lcom/google/android/gms/internal/ads/RQ;

.field private final c:Lcom/google/android/gms/internal/ads/sR;

.field private final d:Ljava/lang/String;

.field private final e:I

.field private f:Ljava/lang/String;

.field private g:Lcom/google/android/gms/internal/ads/a1;

.field private h:Lcom/google/android/gms/internal/ads/a1;

.field private i:I

.field private j:I

.field private k:I

.field private l:Z

.field private m:Z

.field private n:I

.field private o:I

.field private p:I

.field private q:Z

.field private r:J

.field private s:I

.field private t:J

.field private u:Lcom/google/android/gms/internal/ads/a1;

.field private v:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/u5;->w:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x49t
        0x44t
        0x33t
    .end array-data
.end method

.method public constructor <init>(ZLjava/lang/String;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/RQ;

    const/4 v1, 0x7

    new-array v2, v1, [B

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/RQ;-><init>([BI)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    new-instance v0, Lcom/google/android/gms/internal/ads/sR;

    sget-object v1, Lcom/google/android/gms/internal/ads/u5;->w:[B

    const/16 v2, 0xa

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/sR;-><init>([B)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u5;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/u5;->h()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/u5;->n:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/u5;->o:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/u5;->r:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/u5;->t:J

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/u5;->a:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/u5;->d:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/internal/ads/u5;->e:I

    return-void
.end method

.method public static f(I)Z
    .locals 1

    .prologue
    const v0, 0xfff6

    and-int/2addr p0, v0

    const v0, 0xfff0

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final g()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/u5;->m:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/u5;->h()V

    return-void
.end method

.method private final h()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/u5;->i:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/u5;->j:I

    const/16 v0, 0x100

    iput v0, p0, Lcom/google/android/gms/internal/ads/u5;->k:I

    return-void
.end method

.method private final i()V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/ads/u5;->i:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/u5;->j:I

    return-void
.end method

.method private final j(Lcom/google/android/gms/internal/ads/a1;JII)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ads/u5;->i:I

    iput p4, p0, Lcom/google/android/gms/internal/ads/u5;->j:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/u5;->u:Lcom/google/android/gms/internal/ads/a1;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/u5;->v:J

    iput p5, p0, Lcom/google/android/gms/internal/ads/u5;->s:I

    return-void
.end method

.method private final k(Lcom/google/android/gms/internal/ads/sR;[BI)Z
    .locals 2

    .prologue
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/u5;->j:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/u5;->j:I

    invoke-virtual {p1, p2, v1, v0}, Lcom/google/android/gms/internal/ads/sR;->h([BII)V

    iget p1, p0, Lcom/google/android/gms/internal/ads/u5;->j:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/u5;->j:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private static final l(BB)Z
    .locals 0

    and-int/lit16 p0, p1, 0xff

    const p1, 0xff00

    or-int/2addr p0, p1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/u5;->f(I)Z

    move-result p0

    return p0
.end method

.method private static final m(Lcom/google/android/gms/internal/ads/sR;[BI)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v0

    const/4 v1, 0x0

    if-ge v0, p2, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1, v1, p2}, Lcom/google/android/gms/internal/ads/sR;->h([BII)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/sR;)V
    .locals 20

    .prologue
    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const/4 v8, 0x0

    const/4 v9, -0x1

    const/4 v10, 0x2

    const/4 v11, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->g:Lcom/google/android/gms/internal/ads/a1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v0

    if-lez v0, :cond_1d

    iget v0, v6, Lcom/google/android/gms/internal/ads/u5;->i:I

    const/16 v1, 0xd

    const/4 v2, 0x7

    const/4 v3, 0x4

    const/4 v4, 0x3

    if-eqz v0, :cond_b

    if-eq v0, v11, :cond_8

    const/16 v5, 0xa

    if-eq v0, v10, :cond_7

    if-eq v0, v4, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v0

    iget v1, v6, Lcom/google/android/gms/internal/ads/u5;->s:I

    iget v2, v6, Lcom/google/android/gms/internal/ads/u5;->j:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, v6, Lcom/google/android/gms/internal/ads/u5;->u:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {v1, v7, v0}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    iget v1, v6, Lcom/google/android/gms/internal/ads/u5;->j:I

    add-int/2addr v1, v0

    iput v1, v6, Lcom/google/android/gms/internal/ads/u5;->j:I

    iget v0, v6, Lcom/google/android/gms/internal/ads/u5;->s:I

    if-ne v1, v0, :cond_0

    iget-wide v0, v6, Lcom/google/android/gms/internal/ads/u5;->t:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    move v0, v11

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget-object v12, v6, Lcom/google/android/gms/internal/ads/u5;->u:Lcom/google/android/gms/internal/ads/a1;

    iget-wide v13, v6, Lcom/google/android/gms/internal/ads/u5;->t:J

    iget v0, v6, Lcom/google/android/gms/internal/ads/u5;->s:I

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/4 v15, 0x1

    move/from16 v16, v0

    invoke-interface/range {v12 .. v18}, Lcom/google/android/gms/internal/ads/a1;->b(JIIILcom/google/android/gms/internal/ads/Z0;)V

    iget-wide v0, v6, Lcom/google/android/gms/internal/ads/u5;->t:J

    iget-wide v2, v6, Lcom/google/android/gms/internal/ads/u5;->v:J

    add-long/2addr v0, v2

    iput-wide v0, v6, Lcom/google/android/gms/internal/ads/u5;->t:J

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/u5;->h()V

    goto :goto_0

    :cond_2
    iget-boolean v0, v6, Lcom/google/android/gms/internal/ads/u5;->l:Z

    const/4 v12, 0x5

    if-eq v11, v0, :cond_3

    move v0, v12

    goto :goto_2

    :cond_3
    move v0, v2

    :goto_2
    iget-object v13, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    iget-object v13, v13, Lcom/google/android/gms/internal/ads/RQ;->a:[B

    invoke-direct {v6, v7, v13, v0}, Lcom/google/android/gms/internal/ads/u5;->k(Lcom/google/android/gms/internal/ads/sR;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/RQ;->l(I)V

    iget-boolean v0, v6, Lcom/google/android/gms/internal/ads/u5;->q:Z

    if-nez v0, :cond_5

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/RQ;->d(I)I

    move-result v0

    add-int/2addr v0, v11

    if-eq v0, v10, :cond_4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Detected audio object type: "

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", but assuming AAC LC."

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v5, "AdtsReader"

    invoke-static {v5, v0}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/ads/RQ;->n(I)V

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/RQ;->d(I)I

    move-result v0

    iget v5, v6, Lcom/google/android/gms/internal/ads/u5;->o:I

    shr-int/lit8 v12, v5, 0x1

    and-int/2addr v12, v2

    or-int/lit8 v12, v12, 0x10

    int-to-byte v12, v12

    shl-int/lit8 v2, v5, 0x7

    shl-int/2addr v0, v4

    and-int/lit16 v2, v2, 0x80

    and-int/lit8 v0, v0, 0x78

    or-int/2addr v0, v2

    int-to-byte v0, v0

    new-array v2, v10, [B

    aput-byte v12, v2, v8

    aput-byte v0, v2, v11

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/O;->a([B)Lcom/google/android/gms/internal/ads/M;

    move-result-object v0

    new-instance v4, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    iget-object v5, v6, Lcom/google/android/gms/internal/ads/u5;->f:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/oK0;->m(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    const-string v5, "audio/mp4a-latm"

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/M;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/oK0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget v5, v0, Lcom/google/android/gms/internal/ads/M;->b:I

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/oK0;->r0(I)Lcom/google/android/gms/internal/ads/oK0;

    iget v0, v0, Lcom/google/android/gms/internal/ads/M;->a:I

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/oK0;->C(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/oK0;->n(Ljava/util/List;)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->d:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/oK0;->q(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget v0, v6, Lcom/google/android/gms/internal/ads/u5;->e:I

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/oK0;->y(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v0

    iget v2, v0, Lcom/google/android/gms/internal/ads/D;->E:I

    int-to-long v4, v2

    const-wide/32 v12, 0x3d090000

    div-long/2addr v12, v4

    iput-wide v12, v6, Lcom/google/android/gms/internal/ads/u5;->r:J

    iget-object v2, v6, Lcom/google/android/gms/internal/ads/u5;->g:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    iput-boolean v11, v6, Lcom/google/android/gms/internal/ads/u5;->q:Z

    goto :goto_3

    :cond_5
    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/RQ;->n(I)V

    :goto_3
    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/RQ;->n(I)V

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/RQ;->d(I)I

    move-result v0

    add-int/lit8 v1, v0, -0x7

    iget-boolean v2, v6, Lcom/google/android/gms/internal/ads/u5;->l:Z

    if-eqz v2, :cond_6

    add-int/lit8 v0, v0, -0x9

    move v5, v0

    goto :goto_4

    :cond_6
    move v5, v1

    :goto_4
    iget-object v1, v6, Lcom/google/android/gms/internal/ads/u5;->g:Lcom/google/android/gms/internal/ads/a1;

    iget-wide v2, v6, Lcom/google/android/gms/internal/ads/u5;->r:J

    const/4 v4, 0x0

    :goto_5
    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/u5;->j(Lcom/google/android/gms/internal/ads/a1;JII)V

    goto/16 :goto_0

    :cond_7
    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v0

    invoke-direct {v6, v7, v0, v5}, Lcom/google/android/gms/internal/ads/u5;->k(Lcom/google/android/gms/internal/ads/sR;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->h:Lcom/google/android/gms/internal/ads/a1;

    iget-object v1, v6, Lcom/google/android/gms/internal/ads/u5;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-interface {v0, v1, v5}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->c:Lcom/google/android/gms/internal/ads/sR;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v1, v6, Lcom/google/android/gms/internal/ads/u5;->h:Lcom/google/android/gms/internal/ads/a1;

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->B()I

    move-result v0

    const/16 v4, 0xa

    add-int/lit8 v5, v0, 0xa

    const-wide/16 v2, 0x0

    goto :goto_5

    :cond_8
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/RQ;->a:[B

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->t()I

    move-result v4

    aget-byte v2, v2, v4

    aput-byte v2, v1, v8

    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/RQ;->l(I)V

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/RQ;->d(I)I

    move-result v0

    iget v1, v6, Lcom/google/android/gms/internal/ads/u5;->o:I

    if-eq v1, v9, :cond_9

    if-eq v0, v1, :cond_9

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/u5;->g()V

    goto/16 :goto_0

    :cond_9
    iget-boolean v1, v6, Lcom/google/android/gms/internal/ads/u5;->m:Z

    if-nez v1, :cond_a

    iput-boolean v11, v6, Lcom/google/android/gms/internal/ads/u5;->m:Z

    iget v1, v6, Lcom/google/android/gms/internal/ads/u5;->p:I

    iput v1, v6, Lcom/google/android/gms/internal/ads/u5;->n:I

    iput v0, v6, Lcom/google/android/gms/internal/ads/u5;->o:I

    :cond_a
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/u5;->i()V

    goto/16 :goto_0

    :cond_b
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->t()I

    move-result v5

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->u()I

    move-result v12

    :goto_6
    if-ge v5, v12, :cond_1c

    add-int/lit8 v13, v5, 0x1

    aget-byte v14, v0, v5

    and-int/lit16 v15, v14, 0xff

    iget v8, v6, Lcom/google/android/gms/internal/ads/u5;->k:I

    const/16 v4, 0x200

    if-ne v8, v4, :cond_c

    int-to-byte v8, v15

    invoke-static {v9, v8}, Lcom/google/android/gms/internal/ads/u5;->l(BB)Z

    move-result v8

    if-eqz v8, :cond_c

    iget-boolean v8, v6, Lcom/google/android/gms/internal/ads/u5;->m:Z

    if-nez v8, :cond_13

    add-int/lit8 v8, v5, -0x1

    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v4, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/RQ;->a:[B

    invoke-static {v7, v4, v11}, Lcom/google/android/gms/internal/ads/u5;->m(Lcom/google/android/gms/internal/ads/sR;[BI)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    move v10, v2

    goto/16 :goto_b

    :cond_d
    iget-object v4, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/RQ;->l(I)V

    iget-object v4, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v4, v11}, Lcom/google/android/gms/internal/ads/RQ;->d(I)I

    move-result v4

    iget v2, v6, Lcom/google/android/gms/internal/ads/u5;->n:I

    if-eq v2, v9, :cond_f

    if-ne v4, v2, :cond_e

    goto :goto_7

    :cond_e
    const/4 v10, 0x7

    goto/16 :goto_b

    :cond_f
    :goto_7
    iget v2, v6, Lcom/google/android/gms/internal/ads/u5;->o:I

    if-eq v2, v9, :cond_11

    iget-object v2, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/RQ;->a:[B

    invoke-static {v7, v2, v11}, Lcom/google/android/gms/internal/ads/u5;->m(Lcom/google/android/gms/internal/ads/sR;[BI)Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/ads/RQ;->l(I)V

    iget-object v2, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/RQ;->d(I)I

    move-result v2

    iget v10, v6, Lcom/google/android/gms/internal/ads/u5;->o:I

    if-ne v2, v10, :cond_e

    add-int/lit8 v2, v5, 0x1

    invoke-virtual {v7, v2}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    :cond_11
    iget-object v2, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/RQ;->a:[B

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/ads/u5;->m(Lcom/google/android/gms/internal/ads/sR;[BI)Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    const/16 v10, 0xe

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/ads/RQ;->l(I)V

    iget-object v2, v6, Lcom/google/android/gms/internal/ads/u5;->b:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/RQ;->d(I)I

    move-result v2

    const/4 v10, 0x7

    if-lt v2, v10, :cond_16

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->u()I

    move-result v1

    add-int/2addr v8, v2

    if-ge v8, v1, :cond_13

    aget-byte v2, v19, v8

    if-ne v2, v9, :cond_12

    add-int/2addr v8, v11

    if-eq v8, v1, :cond_13

    aget-byte v1, v19, v8

    invoke-static {v9, v1}, Lcom/google/android/gms/internal/ads/u5;->l(BB)Z

    move-result v2

    if-eqz v2, :cond_16

    and-int/lit8 v1, v1, 0x8

    const/4 v2, 0x3

    shr-int/2addr v1, v2

    if-ne v1, v4, :cond_16

    goto :goto_8

    :cond_12
    const/16 v4, 0x49

    if-ne v2, v4, :cond_16

    add-int/lit8 v2, v8, 0x1

    if-eq v2, v1, :cond_13

    aget-byte v2, v19, v2

    const/16 v4, 0x44

    if-ne v2, v4, :cond_16

    const/4 v2, 0x2

    add-int/2addr v8, v2

    if-eq v8, v1, :cond_13

    aget-byte v1, v19, v8

    const/16 v2, 0x33

    if-ne v1, v2, :cond_16

    :cond_13
    :goto_8
    and-int/lit8 v0, v14, 0x8

    const/4 v1, 0x3

    shr-int/2addr v0, v1

    iput v0, v6, Lcom/google/android/gms/internal/ads/u5;->p:I

    and-int/lit8 v0, v14, 0x1

    xor-int/2addr v0, v11

    if-eq v11, v0, :cond_14

    const/4 v0, 0x0

    goto :goto_9

    :cond_14
    move v0, v11

    :goto_9
    iput-boolean v0, v6, Lcom/google/android/gms/internal/ads/u5;->l:Z

    iget-boolean v0, v6, Lcom/google/android/gms/internal/ads/u5;->m:Z

    if-nez v0, :cond_15

    iput v11, v6, Lcom/google/android/gms/internal/ads/u5;->i:I

    const/4 v0, 0x0

    iput v0, v6, Lcom/google/android/gms/internal/ads/u5;->j:I

    goto :goto_a

    :cond_15
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/u5;->i()V

    :goto_a
    invoke-virtual {v7, v13}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    const/4 v8, 0x0

    const/4 v10, 0x2

    goto/16 :goto_0

    :cond_16
    :goto_b
    iget v1, v6, Lcom/google/android/gms/internal/ads/u5;->k:I

    or-int v2, v1, v15

    const/16 v4, 0x149

    if-eq v2, v4, :cond_1b

    const/16 v4, 0x1ff

    if-eq v2, v4, :cond_1a

    const/16 v4, 0x344

    if-eq v2, v4, :cond_19

    const/16 v4, 0x433

    if-eq v2, v4, :cond_18

    const/16 v2, 0x100

    if-eq v1, v2, :cond_17

    iput v2, v6, Lcom/google/android/gms/internal/ads/u5;->k:I

    move v2, v10

    const/16 v1, 0xd

    const/4 v4, 0x3

    const/4 v8, 0x0

    const/4 v10, 0x2

    goto/16 :goto_6

    :cond_17
    const/4 v1, 0x2

    const/4 v2, 0x3

    const/4 v4, 0x0

    goto :goto_d

    :cond_18
    const/4 v1, 0x2

    iput v1, v6, Lcom/google/android/gms/internal/ads/u5;->i:I

    const/4 v2, 0x3

    iput v2, v6, Lcom/google/android/gms/internal/ads/u5;->j:I

    const/4 v4, 0x0

    iput v4, v6, Lcom/google/android/gms/internal/ads/u5;->s:I

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/u5;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v7, v13}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    move v10, v1

    move v8, v4

    goto/16 :goto_0

    :cond_19
    const/4 v1, 0x2

    const/4 v2, 0x3

    const/4 v4, 0x0

    const/16 v5, 0x400

    :goto_c
    iput v5, v6, Lcom/google/android/gms/internal/ads/u5;->k:I

    goto :goto_d

    :cond_1a
    const/4 v1, 0x2

    const/4 v2, 0x3

    const/4 v4, 0x0

    const/16 v5, 0x200

    goto :goto_c

    :cond_1b
    const/4 v1, 0x2

    const/4 v2, 0x3

    const/4 v4, 0x0

    const/16 v5, 0x300

    goto :goto_c

    :goto_d
    move v8, v4

    move v5, v13

    move v4, v2

    move v2, v10

    move v10, v1

    const/16 v1, 0xd

    goto/16 :goto_6

    :cond_1c
    move v4, v8

    move v1, v10

    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    goto/16 :goto_0

    :cond_1d
    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/n6;)V
    .locals 2

    .prologue
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->c()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u5;->f:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->a()I

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u5;->g:Lcom/google/android/gms/internal/ads/a1;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u5;->u:Lcom/google/android/gms/internal/ads/a1;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/u5;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->c()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->a()I

    move-result v0

    const/4 v1, 0x5

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/u5;->h:Lcom/google/android/gms/internal/ads/a1;

    new-instance v0, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/oK0;->m(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    const-string p2, "application/id3"

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    return-void

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/o0;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/o0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/u5;->h:Lcom/google/android/gms/internal/ads/a1;

    return-void
.end method

.method public final d()V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/u5;->t:J

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/u5;->g()V

    return-void
.end method

.method public final e(JI)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/u5;->t:J

    return-void
.end method
