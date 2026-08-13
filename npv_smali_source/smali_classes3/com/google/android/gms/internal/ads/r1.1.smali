.class final Lcom/google/android/gms/internal/ads/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/j1;


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/ci0;

.field private final b:I


# direct methods
.method private constructor <init>(ILcom/google/android/gms/internal/ads/ci0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/r1;->b:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/r1;->a:Lcom/google/android/gms/internal/ads/ci0;

    return-void
.end method

.method public static c(ILcom/google/android/gms/internal/ads/sR;)Lcom/google/android/gms/internal/ads/r1;
    .locals 16

    .prologue
    move-object/from16 v0, p1

    new-instance v1, Lcom/google/android/gms/internal/ads/Zh0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Zh0;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->u()I

    move-result v2

    const/4 v3, -0x2

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v4

    const/16 v5, 0x8

    if-le v4, v5, :cond_12

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v5

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->t()I

    move-result v6

    add-int/2addr v6, v5

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/sR;->k(I)V

    const v5, 0x5453494c

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-ne v4, v5, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v4

    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/r1;->c(ILcom/google/android/gms/internal/ads/sR;)Lcom/google/android/gms/internal/ads/r1;

    move-result-object v4

    goto/16 :goto_7

    :cond_0
    const/4 v5, 0x0

    sparse-switch v4, :sswitch_data_0

    :goto_1
    move-object v4, v5

    goto/16 :goto_7

    :sswitch_0
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/t1;->b(Lcom/google/android/gms/internal/ads/sR;)Lcom/google/android/gms/internal/ads/t1;

    move-result-object v4

    goto/16 :goto_7

    :sswitch_1
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/p1;->b(Lcom/google/android/gms/internal/ads/sR;)Lcom/google/android/gms/internal/ads/p1;

    move-result-object v4

    goto/16 :goto_7

    :sswitch_2
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/o1;->b(Lcom/google/android/gms/internal/ads/sR;)Lcom/google/android/gms/internal/ads/o1;

    move-result-object v4

    goto/16 :goto_7

    :sswitch_3
    const-string v4, "StreamFormatChunk"

    if-ne v3, v7, :cond_2

    const/4 v9, 0x4

    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v11

    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v9

    sparse-switch v9, :sswitch_data_1

    move-object v12, v5

    goto :goto_2

    :sswitch_4
    const-string v12, "video/mjpeg"

    goto :goto_2

    :sswitch_5
    const-string v12, "video/mp43"

    goto :goto_2

    :sswitch_6
    const-string v12, "video/mp42"

    goto :goto_2

    :sswitch_7
    const-string v12, "video/avc"

    goto :goto_2

    :sswitch_8
    const-string v12, "video/mp4v-es"

    :goto_2
    if-nez v12, :cond_1

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Ignoring track with unsupported compression "

    :goto_3
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    :goto_4
    invoke-static {v4, v9}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance v4, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/ads/oK0;->G(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v4, v11}, Lcom/google/android/gms/internal/ads/oK0;->k(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v4, v12}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    new-instance v5, Lcom/google/android/gms/internal/ads/s1;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v4

    invoke-direct {v5, v4}, Lcom/google/android/gms/internal/ads/s1;-><init>(Lcom/google/android/gms/internal/ads/D;)V

    goto :goto_1

    :cond_2
    if-ne v3, v8, :cond_c

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->A()I

    move-result v9

    const-string v10, "audio/raw"

    const-string v11, "audio/mp4a-latm"

    if-eq v9, v8, :cond_7

    const/16 v12, 0x55

    if-eq v9, v12, :cond_6

    const/16 v12, 0xff

    if-eq v9, v12, :cond_5

    const/16 v12, 0x2000

    if-eq v9, v12, :cond_4

    const/16 v12, 0x2001

    if-eq v9, v12, :cond_3

    move-object v12, v5

    goto :goto_5

    :cond_3
    const-string v12, "audio/vnd.dts"

    goto :goto_5

    :cond_4
    const-string v12, "audio/ac3"

    goto :goto_5

    :cond_5
    move-object v12, v11

    goto :goto_5

    :cond_6
    const-string v12, "audio/mpeg"

    goto :goto_5

    :cond_7
    move-object v12, v10

    :goto_5
    if-nez v12, :cond_8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Ignoring track with unsupported format tag "

    goto :goto_3

    :cond_8
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->A()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v5

    const/4 v9, 0x6

    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->A()I

    move-result v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/EW;->F(I)I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v13

    const/4 v14, 0x0

    if-lez v13, :cond_9

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->A()I

    move-result v13

    goto :goto_6

    :cond_9
    move v13, v14

    :goto_6
    new-array v15, v13, [B

    invoke-virtual {v0, v15, v14, v13}, Lcom/google/android/gms/internal/ads/sR;->h([BII)V

    new-instance v14, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v14}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    invoke-virtual {v14, v12}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v14, v4}, Lcom/google/android/gms/internal/ads/oK0;->r0(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v14, v5}, Lcom/google/android/gms/internal/ads/oK0;->C(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    if-eqz v9, :cond_a

    invoke-virtual {v14, v9}, Lcom/google/android/gms/internal/ads/oK0;->u(I)Lcom/google/android/gms/internal/ads/oK0;

    :cond_a
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    if-lez v13, :cond_b

    invoke-static {v15}, Lcom/google/android/gms/internal/ads/ci0;->P(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v4

    invoke-virtual {v14, v4}, Lcom/google/android/gms/internal/ads/oK0;->n(Ljava/util/List;)Lcom/google/android/gms/internal/ads/oK0;

    :cond_b
    new-instance v4, Lcom/google/android/gms/internal/ads/s1;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/ads/s1;-><init>(Lcom/google/android/gms/internal/ads/D;)V

    goto :goto_7

    :cond_c
    const-string v9, "Ignoring strf box for unsupported track type: "

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/EW;->d(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_4

    :goto_7
    if-eqz v4, :cond_11

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/j1;->a()I

    move-result v5

    const v9, 0x68727473

    if-ne v5, v9, :cond_10

    move-object v3, v4

    check-cast v3, Lcom/google/android/gms/internal/ads/p1;

    iget v3, v3, Lcom/google/android/gms/internal/ads/p1;->a:I

    const v5, 0x73646976

    if-eq v3, v5, :cond_f

    const v5, 0x73647561

    if-eq v3, v5, :cond_e

    const v5, 0x73747874

    if-eq v3, v5, :cond_d

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "AviStreamHeaderChunk"

    const-string v7, "Found unsupported streamType fourCC: "

    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, -0x1

    goto :goto_8

    :cond_d
    const/4 v3, 0x3

    goto :goto_8

    :cond_e
    move v3, v8

    goto :goto_8

    :cond_f
    move v3, v7

    :cond_10
    :goto_8
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/Zh0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Zh0;

    :cond_11
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/sR;->k(I)V

    goto/16 :goto_0

    :cond_12
    new-instance v0, Lcom/google/android/gms/internal/ads/r1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Zh0;->j()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v1

    move/from16 v2, p0

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/r1;-><init>(ILcom/google/android/gms/internal/ads/ci0;)V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x66727473 -> :sswitch_3
        0x68697661 -> :sswitch_2
        0x68727473 -> :sswitch_1
        0x6e727473 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x30355844 -> :sswitch_8
        0x31435641 -> :sswitch_7
        0x31637661 -> :sswitch_7
        0x3234504d -> :sswitch_6
        0x3334504d -> :sswitch_5
        0x34363248 -> :sswitch_7
        0x34504d46 -> :sswitch_8
        0x44495633 -> :sswitch_8
        0x44495658 -> :sswitch_8
        0x47504a4d -> :sswitch_4
        0x58564944 -> :sswitch_8
        0x64697678 -> :sswitch_8
        0x67706a6d -> :sswitch_4
        0x78766964 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/r1;->b:I

    return v0
.end method

.method public final b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/j1;
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/r1;->a:Lcom/google/android/gms/internal/ads/ci0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :cond_0
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/j1;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    add-int/lit8 v2, v2, 0x1

    if-ne v4, p1, :cond_0

    return-object v3

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
