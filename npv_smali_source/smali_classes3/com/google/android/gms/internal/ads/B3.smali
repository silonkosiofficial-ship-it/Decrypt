.class public final Lcom/google/android/gms/internal/ads/B3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/t0;


# static fields
.field private static final J:[B

.field private static final K:Lcom/google/android/gms/internal/ads/D;


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:Z

.field private E:Z

.field private F:Lcom/google/android/gms/internal/ads/w0;

.field private G:[Lcom/google/android/gms/internal/ads/a1;

.field private H:[Lcom/google/android/gms/internal/ads/a1;

.field private I:Z

.field private final a:Lcom/google/android/gms/internal/ads/q4;

.field private final b:I

.field private final c:Ljava/util/List;

.field private final d:Landroid/util/SparseArray;

.field private final e:Lcom/google/android/gms/internal/ads/sR;

.field private final f:Lcom/google/android/gms/internal/ads/sR;

.field private final g:Lcom/google/android/gms/internal/ads/sR;

.field private final h:[B

.field private final i:Lcom/google/android/gms/internal/ads/sR;

.field private final j:Lcom/google/android/gms/internal/ads/U1;

.field private final k:Lcom/google/android/gms/internal/ads/sR;

.field private final l:Ljava/util/ArrayDeque;

.field private final m:Ljava/util/ArrayDeque;

.field private final n:Lcom/google/android/gms/internal/ads/nd0;

.field private o:Lcom/google/android/gms/internal/ads/ci0;

.field private p:I

.field private q:I

.field private r:J

.field private s:I

.field private t:Lcom/google/android/gms/internal/ads/sR;

.field private u:J

.field private v:I

.field private w:J

.field private x:J

.field private y:J

.field private z:Lcom/google/android/gms/internal/ads/A3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/B3;->J:[B

    new-instance v0, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    const-string v1, "application/x-emsg"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/B3;->K:Lcom/google/android/gms/internal/ads/D;

    return-void

    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/q4;ILcom/google/android/gms/internal/ads/bV;Lcom/google/android/gms/internal/ads/N3;Ljava/util/List;Lcom/google/android/gms/internal/ads/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->a:Lcom/google/android/gms/internal/ads/q4;

    iput p2, p0, Lcom/google/android/gms/internal/ads/B3;->b:I

    invoke-static {p5}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->c:Ljava/util/List;

    new-instance p1, Lcom/google/android/gms/internal/ads/U1;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/U1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->j:Lcom/google/android/gms/internal/ads/U1;

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->k:Lcom/google/android/gms/internal/ads/sR;

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    sget-object p3, Lcom/google/android/gms/internal/ads/lb0;->a:[B

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/sR;-><init>([B)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->e:Lcom/google/android/gms/internal/ads/sR;

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    const/4 p3, 0x5

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->f:Lcom/google/android/gms/internal/ads/sR;

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/sR;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->g:Lcom/google/android/gms/internal/ads/sR;

    new-array p1, p2, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->h:[B

    new-instance p2, Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/sR;-><init>([B)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/B3;->i:Lcom/google/android/gms/internal/ads/sR;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->l:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->m:Ljava/util/ArrayDeque;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->o:Lcom/google/android/gms/internal/ads/ci0;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/B3;->x:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/B3;->w:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/B3;->y:J

    sget-object p1, Lcom/google/android/gms/internal/ads/w0;->n:Lcom/google/android/gms/internal/ads/w0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->F:Lcom/google/android/gms/internal/ads/w0;

    const/4 p1, 0x0

    new-array p2, p1, [Lcom/google/android/gms/internal/ads/a1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/B3;->G:[Lcom/google/android/gms/internal/ads/a1;

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/a1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->H:[Lcom/google/android/gms/internal/ads/a1;

    new-instance p1, Lcom/google/android/gms/internal/ads/nd0;

    new-instance p2, Lcom/google/android/gms/internal/ads/y3;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/y3;-><init>(Lcom/google/android/gms/internal/ads/B3;)V

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/nd0;-><init>(Lcom/google/android/gms/internal/ads/mc0;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->n:Lcom/google/android/gms/internal/ads/nd0;

    return-void
.end method

.method private static b(I)I
    .locals 2

    .prologue
    if-ltz p0, :cond_0

    return p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected negative value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object p0

    throw p0
.end method

.method private static d(Ljava/util/List;)Lcom/google/android/gms/internal/ads/EH0;
    .locals 18

    .prologue
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v0, :cond_b

    move-object/from16 v5, p0

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/LZ;

    iget v7, v6, Lcom/google/android/gms/internal/ads/N00;->a:I

    const v8, 0x70737368    # 3.013775E29f

    if-ne v7, v8, :cond_a

    if-nez v4, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {v7, v6}, Lcom/google/android/gms/internal/ads/sR;-><init>([B)V

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->u()I

    move-result v9

    const/16 v10, 0x20

    if-ge v9, v10, :cond_1

    :goto_1
    move/from16 v16, v3

    move-object/from16 v17, v4

    :goto_2
    const/4 v2, 0x0

    goto/16 :goto_7

    :cond_1
    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v9

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v10

    const-string v11, "PsshAtomUtil"

    if-eq v10, v9, :cond_2

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Advertised atom size ("

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ") does not match buffer size: "

    :goto_3
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_4
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v9

    if-eq v9, v8, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Atom type is not pssh: "

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v8

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/v3;->a(I)I

    move-result v8

    const/4 v9, 0x1

    if-le v8, v9, :cond_4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Unsupported pssh version: "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_4
    new-instance v10, Ljava/util/UUID;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->J()J

    move-result-wide v12

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->J()J

    move-result-wide v14

    invoke-direct {v10, v12, v13, v14, v15}, Ljava/util/UUID;-><init>(JJ)V

    if-ne v8, v9, :cond_6

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->F()I

    move-result v9

    new-array v12, v9, [Ljava/util/UUID;

    move v13, v1

    :goto_5
    if-ge v13, v9, :cond_5

    new-instance v14, Ljava/util/UUID;

    move/from16 v16, v3

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->J()J

    move-result-wide v2

    move-object/from16 v17, v4

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->J()J

    move-result-wide v4

    invoke-direct {v14, v2, v3, v4, v5}, Ljava/util/UUID;-><init>(JJ)V

    aput-object v14, v12, v13

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v5, p0

    move/from16 v3, v16

    move-object/from16 v4, v17

    goto :goto_5

    :cond_5
    move/from16 v16, v3

    move-object/from16 v17, v4

    goto :goto_6

    :cond_6
    move/from16 v16, v3

    move-object/from16 v17, v4

    const/4 v12, 0x0

    :goto_6
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->F()I

    move-result v2

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v3

    if-eq v2, v3, :cond_7

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Atom data size ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") does not match the bytes left: "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_7
    new-array v3, v2, [B

    invoke-virtual {v7, v3, v1, v2}, Lcom/google/android/gms/internal/ads/sR;->h([BII)V

    new-instance v2, Lcom/google/android/gms/internal/ads/I3;

    invoke-direct {v2, v10, v8, v3, v12}, Lcom/google/android/gms/internal/ads/I3;-><init>(Ljava/util/UUID;I[B[Ljava/util/UUID;)V

    :goto_7
    if-nez v2, :cond_8

    const/4 v2, 0x0

    goto :goto_8

    :cond_8
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/I3;->a:Ljava/util/UUID;

    :goto_8
    if-nez v2, :cond_9

    const-string v2, "FragmentedMp4Extractor"

    const-string v3, "Skipped pssh atom (failed to extract uuid)"

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, v17

    goto :goto_9

    :cond_9
    new-instance v3, Lcom/google/android/gms/internal/ads/aH0;

    const-string v4, "video/mp4"

    const/4 v5, 0x0

    invoke-direct {v3, v2, v5, v4, v6}, Lcom/google/android/gms/internal/ads/aH0;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    move-object/from16 v4, v17

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_a
    move/from16 v16, v3

    :goto_9
    const/4 v5, 0x0

    :goto_a
    add-int/lit8 v3, v16, 0x1

    goto/16 :goto_0

    :cond_b
    const/4 v5, 0x0

    if-nez v4, :cond_c

    return-object v5

    :cond_c
    new-instance v0, Lcom/google/android/gms/internal/ads/EH0;

    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/ads/EH0;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private final g()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/B3;->p:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/B3;->s:I

    return-void
.end method

.method private static h(Lcom/google/android/gms/internal/ads/sR;ILcom/google/android/gms/internal/ads/P3;)V
    .locals 3

    .prologue
    add-int/lit8 p1, p1, 0x8

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result p1

    sget v0, Lcom/google/android/gms/internal/ads/v3;->b:I

    const/4 v0, 0x1

    and-int/lit8 v1, p1, 0x1

    if-nez v1, :cond_3

    and-int/lit8 p1, p1, 0x2

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sR;->F()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p0, p2, Lcom/google/android/gms/internal/ads/P3;->l:[Z

    iget p1, p2, Lcom/google/android/gms/internal/ads/P3;->e:I

    invoke-static {p0, v1, p1, v1}, Ljava/util/Arrays;->fill([ZIIZ)V

    return-void

    :cond_1
    iget v2, p2, Lcom/google/android/gms/internal/ads/P3;->e:I

    if-ne p1, v2, :cond_2

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/P3;->l:[Z

    invoke-static {v2, v1, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/P3;->a(I)V

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/P3;->n:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->u()I

    move-result p1

    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/gms/internal/ads/sR;->h([BII)V

    iget-object p0, p2, Lcom/google/android/gms/internal/ads/P3;->n:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iput-boolean v1, p2, Lcom/google/android/gms/internal/ads/P3;->o:Z

    return-void

    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Senc sample count "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is different from fragment sample count"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object p0

    throw p0

    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/of;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/of;

    move-result-object p0

    throw p0
.end method

.method private final l(J)V
    .locals 53

    .prologue
    move-object/from16 v0, p0

    const/16 v2, 0x8

    :cond_0
    :goto_0
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/B3;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_52

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/B3;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/kZ;

    iget-wide v6, v6, Lcom/google/android/gms/internal/ads/kZ;->b:J

    cmp-long v6, v6, p1

    if-nez v6, :cond_52

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/B3;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v6}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/google/android/gms/internal/ads/kZ;

    iget v6, v7, Lcom/google/android/gms/internal/ads/N00;->a:I

    const v8, 0x6d6f6f76

    const/16 v11, 0xc

    if-ne v6, v8, :cond_9

    iget-object v6, v7, Lcom/google/android/gms/internal/ads/kZ;->c:Ljava/util/List;

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/B3;->d(Ljava/util/List;)Lcom/google/android/gms/internal/ads/EH0;

    move-result-object v6

    const v8, 0x6d766578

    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/ads/kZ;->b(I)Lcom/google/android/gms/internal/ads/kZ;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v14, Landroid/util/SparseArray;

    invoke-direct {v14}, Landroid/util/SparseArray;-><init>()V

    iget-object v12, v8, Lcom/google/android/gms/internal/ads/kZ;->c:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v12, :cond_4

    iget-object v1, v8, Lcom/google/android/gms/internal/ads/kZ;->c:Ljava/util/List;

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/LZ;

    iget v15, v1, Lcom/google/android/gms/internal/ads/N00;->a:I

    const v4, 0x74726578

    if-ne v15, v4, :cond_1

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v1, v11}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v15

    add-int/lit8 v15, v15, -0x1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v11

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/internal/ads/w3;

    invoke-direct {v5, v15, v11, v3, v1}, Lcom/google/android/gms/internal/ads/w3;-><init>(IIII)V

    invoke-static {v4, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/w3;

    invoke-virtual {v14, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_3

    :cond_1
    const v3, 0x6d656864

    if-ne v15, v3, :cond_3

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/v3;->a(I)I

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v3

    :goto_2
    move-wide v9, v3

    goto :goto_3

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->M()J

    move-result-wide v3

    goto :goto_2

    :cond_3
    :goto_3
    const/4 v1, 0x1

    add-int/2addr v13, v1

    const/16 v11, 0xc

    goto :goto_1

    :cond_4
    new-instance v8, Lcom/google/android/gms/internal/ads/I0;

    invoke-direct {v8}, Lcom/google/android/gms/internal/ads/I0;-><init>()V

    iget v1, v0, Lcom/google/android/gms/internal/ads/B3;->b:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-eqz v1, :cond_5

    const/4 v12, 0x1

    goto :goto_4

    :cond_5
    const/4 v12, 0x0

    :goto_4
    new-instance v1, Lcom/google/android/gms/internal/ads/x3;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/x3;-><init>(Lcom/google/android/gms/internal/ads/B3;)V

    const/4 v13, 0x0

    move-object v11, v6

    move-object v3, v14

    move-object v14, v1

    invoke-static/range {v7 .. v14}, Lcom/google/android/gms/internal/ads/v3;->f(Lcom/google/android/gms/internal/ads/kZ;Lcom/google/android/gms/internal/ads/I0;JLcom/google/android/gms/internal/ads/EH0;ZZLcom/google/android/gms/internal/ads/pg0;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-nez v5, :cond_7

    const/4 v15, 0x0

    :goto_5
    if-ge v15, v4, :cond_6

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/Q3;

    iget-object v6, v5, Lcom/google/android/gms/internal/ads/Q3;->a:Lcom/google/android/gms/internal/ads/N3;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/B3;->F:Lcom/google/android/gms/internal/ads/w0;

    iget v8, v6, Lcom/google/android/gms/internal/ads/N3;->b:I

    invoke-interface {v7, v15, v8}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object v7

    iget-wide v8, v6, Lcom/google/android/gms/internal/ads/N3;->e:J

    invoke-interface {v7, v8, v9}, Lcom/google/android/gms/internal/ads/a1;->d(J)V

    iget v8, v6, Lcom/google/android/gms/internal/ads/N3;->a:I

    new-instance v9, Lcom/google/android/gms/internal/ads/A3;

    invoke-static {v3, v8}, Lcom/google/android/gms/internal/ads/B3;->m(Landroid/util/SparseArray;I)Lcom/google/android/gms/internal/ads/w3;

    move-result-object v8

    invoke-direct {v9, v7, v5, v8}, Lcom/google/android/gms/internal/ads/A3;-><init>(Lcom/google/android/gms/internal/ads/a1;Lcom/google/android/gms/internal/ads/Q3;Lcom/google/android/gms/internal/ads/w3;)V

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    iget v7, v6, Lcom/google/android/gms/internal/ads/N3;->a:I

    invoke-virtual {v5, v7, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/B3;->x:J

    iget-wide v5, v6, Lcom/google/android/gms/internal/ads/N3;->e:J

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/B3;->x:J

    const/4 v5, 0x1

    add-int/2addr v15, v5

    goto :goto_5

    :cond_6
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/B3;->F:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/w0;->Q()V

    goto/16 :goto_0

    :cond_7
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-ne v5, v4, :cond_8

    const/4 v5, 0x1

    goto :goto_6

    :cond_8
    const/4 v5, 0x0

    :goto_6
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    const/4 v15, 0x0

    :goto_7
    if-ge v15, v4, :cond_0

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/Q3;

    iget-object v6, v5, Lcom/google/android/gms/internal/ads/Q3;->a:Lcom/google/android/gms/internal/ads/N3;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    iget v8, v6, Lcom/google/android/gms/internal/ads/N3;->a:I

    invoke-virtual {v7, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/ads/A3;

    iget v6, v6, Lcom/google/android/gms/internal/ads/N3;->a:I

    invoke-static {v3, v6}, Lcom/google/android/gms/internal/ads/B3;->m(Landroid/util/SparseArray;I)Lcom/google/android/gms/internal/ads/w3;

    move-result-object v6

    invoke-virtual {v7, v5, v6}, Lcom/google/android/gms/internal/ads/A3;->h(Lcom/google/android/gms/internal/ads/Q3;Lcom/google/android/gms/internal/ads/w3;)V

    const/4 v5, 0x1

    add-int/2addr v15, v5

    goto :goto_7

    :cond_9
    const v1, 0x6d6f6f66

    if-ne v6, v1, :cond_51

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    iget v3, v0, Lcom/google/android/gms/internal/ads/B3;->b:I

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/B3;->h:[B

    iget-object v5, v7, Lcom/google/android/gms/internal/ads/kZ;->d:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_8
    if-ge v6, v5, :cond_4a

    iget-object v11, v7, Lcom/google/android/gms/internal/ads/kZ;->d:Ljava/util/List;

    invoke-interface {v11, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/ads/kZ;

    iget v12, v11, Lcom/google/android/gms/internal/ads/N00;->a:I

    const v13, 0x74726166

    if-ne v12, v13, :cond_10

    const v12, 0x74666864

    invoke-virtual {v11, v12}, Lcom/google/android/gms/internal/ads/kZ;->c(I)Lcom/google/android/gms/internal/ads/LZ;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v12, v12, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v12, v2}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v13

    sget v14, Lcom/google/android/gms/internal/ads/v3;->b:I

    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v14

    invoke-virtual {v1, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/ads/A3;

    if-nez v14, :cond_a

    const/4 v14, 0x0

    goto :goto_e

    :cond_a
    const/4 v15, 0x1

    and-int/lit8 v20, v13, 0x1

    if-eqz v20, :cond_b

    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/sR;->M()J

    move-result-wide v9

    iget-object v15, v14, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iput-wide v9, v15, Lcom/google/android/gms/internal/ads/P3;->b:J

    iput-wide v9, v15, Lcom/google/android/gms/internal/ads/P3;->c:J

    :cond_b
    iget-object v9, v14, Lcom/google/android/gms/internal/ads/A3;->e:Lcom/google/android/gms/internal/ads/w3;

    const/4 v10, 0x2

    and-int/lit8 v15, v13, 0x2

    if-eqz v15, :cond_c

    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    goto :goto_9

    :cond_c
    iget v10, v9, Lcom/google/android/gms/internal/ads/w3;->a:I

    :goto_9
    and-int/lit8 v15, v13, 0x8

    if-eqz v15, :cond_d

    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v15

    :goto_a
    const/16 v18, 0x10

    goto :goto_b

    :cond_d
    iget v15, v9, Lcom/google/android/gms/internal/ads/w3;->b:I

    goto :goto_a

    :goto_b
    and-int/lit8 v21, v13, 0x10

    if-eqz v21, :cond_e

    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v21

    move/from16 v8, v21

    goto :goto_c

    :cond_e
    iget v8, v9, Lcom/google/android/gms/internal/ads/w3;->c:I

    :goto_c
    and-int/lit8 v13, v13, 0x20

    if-eqz v13, :cond_f

    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v9

    goto :goto_d

    :cond_f
    iget v9, v9, Lcom/google/android/gms/internal/ads/w3;->d:I

    :goto_d
    iget-object v12, v14, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    new-instance v13, Lcom/google/android/gms/internal/ads/w3;

    invoke-direct {v13, v10, v15, v8, v9}, Lcom/google/android/gms/internal/ads/w3;-><init>(IIII)V

    iput-object v13, v12, Lcom/google/android/gms/internal/ads/P3;->a:Lcom/google/android/gms/internal/ads/w3;

    :goto_e
    if-nez v14, :cond_11

    :cond_10
    move-object/from16 v23, v1

    move/from16 v46, v3

    move/from16 v22, v5

    move/from16 v30, v6

    move-object/from16 v29, v7

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/16 v7, 0x10

    const/16 v12, 0xc

    const/4 v13, 0x4

    const/4 v14, 0x2

    move-object v6, v4

    move v4, v2

    goto/16 :goto_33

    :cond_11
    iget-object v8, v14, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget-wide v9, v8, Lcom/google/android/gms/internal/ads/P3;->p:J

    iget-boolean v12, v8, Lcom/google/android/gms/internal/ads/P3;->q:Z

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/A3;->i()V

    const/4 v13, 0x1

    invoke-static {v14, v13}, Lcom/google/android/gms/internal/ads/A3;->g(Lcom/google/android/gms/internal/ads/A3;Z)V

    const v15, 0x74666474

    invoke-virtual {v11, v15}, Lcom/google/android/gms/internal/ads/kZ;->c(I)Lcom/google/android/gms/internal/ads/LZ;

    move-result-object v15

    if-eqz v15, :cond_13

    const/16 v17, 0x2

    and-int/lit8 v19, v3, 0x2

    if-nez v19, :cond_13

    iget-object v9, v15, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v10

    invoke-static {v10}, Lcom/google/android/gms/internal/ads/v3;->a(I)I

    move-result v10

    if-ne v10, v13, :cond_12

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/sR;->M()J

    move-result-wide v9

    goto :goto_f

    :cond_12
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v9

    :goto_f
    iput-wide v9, v8, Lcom/google/android/gms/internal/ads/P3;->p:J

    iput-boolean v13, v8, Lcom/google/android/gms/internal/ads/P3;->q:Z

    goto :goto_10

    :cond_13
    iput-wide v9, v8, Lcom/google/android/gms/internal/ads/P3;->p:J

    iput-boolean v12, v8, Lcom/google/android/gms/internal/ads/P3;->q:Z

    :goto_10
    iget-object v9, v11, Lcom/google/android/gms/internal/ads/kZ;->c:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    :goto_11
    const v2, 0x7472756e

    if-ge v12, v10, :cond_15

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v23, v1

    move-object/from16 v1, v22

    check-cast v1, Lcom/google/android/gms/internal/ads/LZ;

    move/from16 v22, v5

    iget v5, v1, Lcom/google/android/gms/internal/ads/N00;->a:I

    if-ne v5, v2, :cond_14

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->F()I

    move-result v1

    if-lez v1, :cond_14

    add-int/2addr v15, v1

    const/4 v1, 0x1

    add-int/2addr v13, v1

    goto :goto_12

    :cond_14
    const/4 v1, 0x1

    :goto_12
    add-int/2addr v12, v1

    move/from16 v5, v22

    move-object/from16 v1, v23

    goto :goto_11

    :cond_15
    move-object/from16 v23, v1

    move/from16 v22, v5

    const/4 v1, 0x0

    iput v1, v14, Lcom/google/android/gms/internal/ads/A3;->h:I

    iput v1, v14, Lcom/google/android/gms/internal/ads/A3;->g:I

    iput v1, v14, Lcom/google/android/gms/internal/ads/A3;->f:I

    iget-object v1, v14, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iput v13, v1, Lcom/google/android/gms/internal/ads/P3;->d:I

    iput v15, v1, Lcom/google/android/gms/internal/ads/P3;->e:I

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/P3;->g:[I

    array-length v5, v5

    if-ge v5, v13, :cond_16

    new-array v5, v13, [J

    iput-object v5, v1, Lcom/google/android/gms/internal/ads/P3;->f:[J

    new-array v5, v13, [I

    iput-object v5, v1, Lcom/google/android/gms/internal/ads/P3;->g:[I

    :cond_16
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/P3;->h:[I

    array-length v5, v5

    if-ge v5, v15, :cond_17

    mul-int/lit8 v15, v15, 0x7d

    div-int/lit8 v15, v15, 0x64

    new-array v5, v15, [I

    iput-object v5, v1, Lcom/google/android/gms/internal/ads/P3;->h:[I

    new-array v5, v15, [J

    iput-object v5, v1, Lcom/google/android/gms/internal/ads/P3;->i:[J

    new-array v5, v15, [Z

    iput-object v5, v1, Lcom/google/android/gms/internal/ads/P3;->j:[Z

    new-array v5, v15, [Z

    iput-object v5, v1, Lcom/google/android/gms/internal/ads/P3;->l:[Z

    :cond_17
    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    :goto_13
    const-wide/16 v24, 0x0

    if-ge v1, v10, :cond_2c

    invoke-interface {v9, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/ads/LZ;

    iget v15, v13, Lcom/google/android/gms/internal/ads/N00;->a:I

    if-ne v15, v2, :cond_2b

    const/4 v15, 0x1

    add-int/lit8 v26, v5, 0x1

    iget-object v13, v13, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    const/16 v15, 0x8

    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v15

    iget-object v2, v14, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/Q3;->a:Lcom/google/android/gms/internal/ads/N3;

    move-object/from16 v27, v9

    iget-object v9, v14, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    move/from16 v28, v10

    iget-object v10, v9, Lcom/google/android/gms/internal/ads/P3;->a:Lcom/google/android/gms/internal/ads/w3;

    sget v29, Lcom/google/android/gms/internal/ads/EW;->a:I

    iget-object v0, v9, Lcom/google/android/gms/internal/ads/P3;->g:[I

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/sR;->F()I

    move-result v29

    aput v29, v0, v5

    iget-object v0, v9, Lcom/google/android/gms/internal/ads/P3;->f:[J

    move/from16 v30, v6

    move-object/from16 v29, v7

    iget-wide v6, v9, Lcom/google/android/gms/internal/ads/P3;->b:J

    aput-wide v6, v0, v5

    const/16 v19, 0x1

    and-int/lit8 v31, v15, 0x1

    if-eqz v31, :cond_18

    move-object/from16 v31, v4

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v4

    move-object/from16 v32, v11

    move/from16 v33, v12

    int-to-long v11, v4

    add-long/2addr v6, v11

    aput-wide v6, v0, v5

    :goto_14
    const/4 v0, 0x4

    goto :goto_15

    :cond_18
    move-object/from16 v31, v4

    move-object/from16 v32, v11

    move/from16 v33, v12

    goto :goto_14

    :goto_15
    and-int/lit8 v4, v15, 0x4

    if-eqz v4, :cond_19

    const/4 v0, 0x1

    goto :goto_16

    :cond_19
    const/4 v0, 0x0

    :goto_16
    iget v4, v10, Lcom/google/android/gms/internal/ads/w3;->d:I

    if-eqz v0, :cond_1a

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v4

    :cond_1a
    and-int/lit16 v6, v15, 0x100

    and-int/lit16 v7, v15, 0x200

    and-int/lit16 v11, v15, 0x400

    and-int/lit16 v12, v15, 0x800

    iget-object v15, v2, Lcom/google/android/gms/internal/ads/N3;->i:[J

    if-eqz v15, :cond_1f

    move/from16 v34, v4

    array-length v4, v15

    move-object/from16 v35, v8

    const/4 v8, 0x1

    if-ne v4, v8, :cond_1b

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/N3;->j:[J

    if-nez v4, :cond_1c

    :cond_1b
    move/from16 v36, v0

    move v8, v1

    move-object v4, v14

    goto :goto_18

    :cond_1c
    const/4 v4, 0x0

    aget-wide v36, v15, v4

    cmp-long v4, v36, v24

    if-nez v4, :cond_1d

    move/from16 v36, v0

    move v8, v1

    move-object v4, v14

    goto :goto_17

    :cond_1d
    move-object v4, v14

    iget-wide v14, v2, Lcom/google/android/gms/internal/ads/N3;->d:J

    sget-object v44, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v38, 0xf4240

    move-wide/from16 v40, v14

    move-object/from16 v42, v44

    invoke-static/range {v36 .. v42}, Lcom/google/android/gms/internal/ads/EW;->M(JJJLjava/math/RoundingMode;)J

    move-result-wide v14

    iget-object v8, v2, Lcom/google/android/gms/internal/ads/N3;->j:[J

    const/16 v16, 0x0

    aget-wide v38, v8, v16

    const-wide/32 v40, 0xf4240

    move/from16 v36, v0

    move v8, v1

    iget-wide v0, v2, Lcom/google/android/gms/internal/ads/N3;->c:J

    move-wide/from16 v42, v0

    invoke-static/range {v38 .. v44}, Lcom/google/android/gms/internal/ads/EW;->M(JJJLjava/math/RoundingMode;)J

    move-result-wide v0

    add-long/2addr v14, v0

    iget-wide v0, v2, Lcom/google/android/gms/internal/ads/N3;->e:J

    cmp-long v0, v14, v0

    if-gez v0, :cond_1e

    goto :goto_18

    :cond_1e
    :goto_17
    iget-object v0, v2, Lcom/google/android/gms/internal/ads/N3;->j:[J

    const/4 v1, 0x0

    aget-wide v24, v0, v1

    goto :goto_18

    :cond_1f
    move/from16 v36, v0

    move/from16 v34, v4

    move-object/from16 v35, v8

    move-object v4, v14

    move v8, v1

    :goto_18
    iget-object v0, v9, Lcom/google/android/gms/internal/ads/P3;->h:[I

    iget-object v1, v9, Lcom/google/android/gms/internal/ads/P3;->i:[J

    iget-object v14, v9, Lcom/google/android/gms/internal/ads/P3;->j:[Z

    iget v15, v2, Lcom/google/android/gms/internal/ads/N3;->b:I

    move/from16 v37, v8

    const/4 v8, 0x2

    if-ne v15, v8, :cond_20

    const/4 v8, 0x1

    and-int/lit8 v15, v3, 0x1

    if-eqz v15, :cond_20

    const/4 v8, 0x1

    goto :goto_19

    :cond_20
    const/4 v8, 0x0

    :goto_19
    iget-object v15, v9, Lcom/google/android/gms/internal/ads/P3;->g:[I

    aget v5, v15, v5

    add-int v5, v33, v5

    move v15, v3

    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/N3;->c:J

    move-object/from16 v45, v14

    move/from16 v46, v15

    iget-wide v14, v9, Lcom/google/android/gms/internal/ads/P3;->p:J

    move/from16 v47, v8

    move/from16 v8, v33

    :goto_1a
    if-ge v8, v5, :cond_2a

    if-eqz v6, :cond_21

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v33

    move/from16 v48, v5

    move/from16 v5, v33

    goto :goto_1b

    :cond_21
    move/from16 v48, v5

    iget v5, v10, Lcom/google/android/gms/internal/ads/w3;->b:I

    :goto_1b
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/B3;->b(I)I

    if-eqz v7, :cond_22

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v33

    move/from16 v49, v6

    goto :goto_1c

    :cond_22
    move/from16 v49, v6

    iget v6, v10, Lcom/google/android/gms/internal/ads/w3;->c:I

    move/from16 v33, v6

    :goto_1c
    invoke-static/range {v33 .. v33}, Lcom/google/android/gms/internal/ads/B3;->b(I)I

    if-eqz v11, :cond_23

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v6

    goto :goto_1d

    :cond_23
    if-nez v8, :cond_25

    if-eqz v36, :cond_24

    move/from16 v6, v34

    const/4 v8, 0x0

    goto :goto_1d

    :cond_24
    const/4 v8, 0x0

    :cond_25
    iget v6, v10, Lcom/google/android/gms/internal/ads/w3;->d:I

    :goto_1d
    if-eqz v12, :cond_26

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v38

    move/from16 v50, v7

    move-object/from16 v51, v10

    move/from16 v52, v11

    move/from16 v7, v38

    goto :goto_1e

    :cond_26
    move/from16 v50, v7

    move-object/from16 v51, v10

    move/from16 v52, v11

    const/4 v7, 0x0

    :goto_1e
    int-to-long v10, v7

    add-long/2addr v10, v14

    sub-long v38, v10, v24

    const-wide/32 v40, 0xf4240

    sget-object v44, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide/from16 v42, v2

    invoke-static/range {v38 .. v44}, Lcom/google/android/gms/internal/ads/EW;->M(JJJLjava/math/RoundingMode;)J

    move-result-wide v10

    aput-wide v10, v1, v8

    iget-boolean v7, v9, Lcom/google/android/gms/internal/ads/P3;->q:Z

    if-nez v7, :cond_27

    iget-object v7, v4, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    move-wide/from16 v38, v2

    iget-wide v2, v7, Lcom/google/android/gms/internal/ads/Q3;->h:J

    add-long/2addr v10, v2

    aput-wide v10, v1, v8

    goto :goto_1f

    :cond_27
    move-wide/from16 v38, v2

    :goto_1f
    aput v33, v0, v8

    const/16 v2, 0x10

    shr-int/lit8 v3, v6, 0x10

    const/4 v2, 0x1

    and-int/2addr v3, v2

    if-nez v3, :cond_28

    if-eqz v47, :cond_29

    if-nez v8, :cond_28

    move v3, v2

    const/4 v8, 0x0

    goto :goto_20

    :cond_28
    const/4 v3, 0x0

    goto :goto_20

    :cond_29
    move v3, v2

    :goto_20
    aput-boolean v3, v45, v8

    int-to-long v5, v5

    add-long/2addr v14, v5

    add-int/2addr v8, v2

    move-wide/from16 v2, v38

    move/from16 v5, v48

    move/from16 v6, v49

    move/from16 v7, v50

    move-object/from16 v10, v51

    move/from16 v11, v52

    goto/16 :goto_1a

    :cond_2a
    move/from16 v48, v5

    const/4 v2, 0x1

    iput-wide v14, v9, Lcom/google/android/gms/internal/ads/P3;->p:J

    move/from16 v5, v26

    move/from16 v12, v48

    goto :goto_21

    :cond_2b
    move/from16 v37, v1

    move/from16 v46, v3

    move-object/from16 v31, v4

    move/from16 v30, v6

    move-object/from16 v29, v7

    move-object/from16 v35, v8

    move-object/from16 v27, v9

    move/from16 v28, v10

    move-object/from16 v32, v11

    move/from16 v33, v12

    move-object v4, v14

    const/4 v2, 0x1

    :goto_21
    add-int/lit8 v1, v37, 0x1

    move-object/from16 v0, p0

    move-object v14, v4

    move-object/from16 v9, v27

    move/from16 v10, v28

    move-object/from16 v7, v29

    move/from16 v6, v30

    move-object/from16 v4, v31

    move-object/from16 v11, v32

    move-object/from16 v8, v35

    move/from16 v3, v46

    const v2, 0x7472756e

    goto/16 :goto_13

    :cond_2c
    move/from16 v46, v3

    move-object/from16 v31, v4

    move/from16 v30, v6

    move-object/from16 v29, v7

    move-object/from16 v35, v8

    move-object/from16 v32, v11

    move-object v4, v14

    iget-object v0, v4, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Q3;->a:Lcom/google/android/gms/internal/ads/N3;

    move-object/from16 v1, v35

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/P3;->a:Lcom/google/android/gms/internal/ads/w3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, v2, Lcom/google/android/gms/internal/ads/w3;->a:I

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/N3;->b(I)Lcom/google/android/gms/internal/ads/O3;

    move-result-object v0

    const v2, 0x7361697a

    move-object/from16 v11, v32

    invoke-virtual {v11, v2}, Lcom/google/android/gms/internal/ads/kZ;->c(I)Lcom/google/android/gms/internal/ads/LZ;

    move-result-object v2

    if-eqz v2, :cond_33

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v0, Lcom/google/android/gms/internal/ads/O3;->d:I

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v5

    const/4 v6, 0x1

    and-int/2addr v5, v6

    if-ne v5, v6, :cond_2d

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    :cond_2d
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->F()I

    move-result v5

    iget v6, v1, Lcom/google/android/gms/internal/ads/P3;->e:I

    if-gt v5, v6, :cond_32

    if-nez v4, :cond_30

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/P3;->l:[Z

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_22
    if-ge v6, v5, :cond_2f

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v8

    add-int/2addr v7, v8

    if-le v8, v3, :cond_2e

    const/4 v8, 0x1

    goto :goto_23

    :cond_2e
    const/4 v8, 0x0

    :goto_23
    aput-boolean v8, v4, v6

    const/4 v8, 0x1

    add-int/2addr v6, v8

    goto :goto_22

    :cond_2f
    const/4 v4, 0x0

    goto :goto_25

    :cond_30
    if-le v4, v3, :cond_31

    const/4 v2, 0x1

    goto :goto_24

    :cond_31
    const/4 v2, 0x0

    :goto_24
    mul-int v7, v4, v5

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/P3;->l:[Z

    const/4 v4, 0x0

    invoke-static {v3, v4, v5, v2}, Ljava/util/Arrays;->fill([ZIIZ)V

    :goto_25
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/P3;->l:[Z

    iget v3, v1, Lcom/google/android/gms/internal/ads/P3;->e:I

    invoke-static {v2, v5, v3, v4}, Ljava/util/Arrays;->fill([ZIIZ)V

    if-lez v7, :cond_33

    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/P3;->a(I)V

    goto :goto_26

    :cond_32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Saiz sample count "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " is greater than fragment sample count"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v0

    throw v0

    :cond_33
    :goto_26
    const v2, 0x7361696f

    invoke-virtual {v11, v2}, Lcom/google/android/gms/internal/ads/kZ;->c(I)Lcom/google/android/gms/internal/ads/LZ;

    move-result-object v2

    if-eqz v2, :cond_36

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v4

    const/4 v5, 0x1

    and-int/lit8 v6, v4, 0x1

    if-ne v6, v5, :cond_34

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    :cond_34
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->F()I

    move-result v3

    if-ne v3, v5, :cond_37

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/v3;->a(I)I

    move-result v3

    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/P3;->c:J

    if-nez v3, :cond_35

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v2

    goto :goto_27

    :cond_35
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->M()J

    move-result-wide v2

    :goto_27
    add-long/2addr v4, v2

    iput-wide v4, v1, Lcom/google/android/gms/internal/ads/P3;->c:J

    :cond_36
    const/4 v2, 0x0

    goto :goto_28

    :cond_37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected saio entry count: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v0

    throw v0

    :goto_28
    const v3, 0x73656e63

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/ads/kZ;->c(I)Lcom/google/android/gms/internal/ads/LZ;

    move-result-object v3

    if-eqz v3, :cond_38

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    const/4 v4, 0x0

    invoke-static {v3, v4, v1}, Lcom/google/android/gms/internal/ads/B3;->h(Lcom/google/android/gms/internal/ads/sR;ILcom/google/android/gms/internal/ads/P3;)V

    :cond_38
    if-eqz v0, :cond_39

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/O3;->b:Ljava/lang/String;

    move-object v5, v0

    goto :goto_29

    :cond_39
    move-object v5, v2

    :goto_29
    move-object v0, v2

    move-object v3, v0

    const/4 v4, 0x0

    :goto_2a
    iget-object v6, v11, Lcom/google/android/gms/internal/ads/kZ;->c:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_3c

    iget-object v6, v11, Lcom/google/android/gms/internal/ads/kZ;->c:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/LZ;

    iget-object v7, v6, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    iget v6, v6, Lcom/google/android/gms/internal/ads/N00;->a:I

    const v8, 0x73626770

    const v9, 0x73656967

    const/16 v12, 0xc

    if-ne v6, v8, :cond_3b

    invoke-virtual {v7, v12}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v6

    if-ne v6, v9, :cond_3a

    move-object v0, v7

    :cond_3a
    :goto_2b
    const/4 v6, 0x1

    goto :goto_2c

    :cond_3b
    const v8, 0x73677064

    if-ne v6, v8, :cond_3a

    invoke-virtual {v7, v12}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v6

    if-ne v6, v9, :cond_3a

    move-object v3, v7

    goto :goto_2b

    :goto_2c
    add-int/2addr v4, v6

    goto :goto_2a

    :cond_3c
    const/4 v6, 0x1

    const/16 v12, 0xc

    if-eqz v0, :cond_3d

    if-nez v3, :cond_3e

    :cond_3d
    const/4 v13, 0x4

    const/4 v14, 0x2

    goto/16 :goto_2f

    :cond_3e
    const/16 v4, 0x8

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v7

    invoke-static {v7}, Lcom/google/android/gms/internal/ads/v3;->a(I)I

    move-result v7

    const/4 v13, 0x4

    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    if-ne v7, v6, :cond_3f

    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    :cond_3f
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v0

    if-ne v0, v6, :cond_45

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/v3;->a(I)I

    move-result v0

    invoke-virtual {v3, v13}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    if-ne v0, v6, :cond_41

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v6

    cmp-long v0, v6, v24

    if-eqz v0, :cond_40

    const/4 v14, 0x2

    goto :goto_2d

    :cond_40
    const-string v0, "Variable length description in sgpd found (unsupported)"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/of;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v0

    throw v0

    :cond_41
    const/4 v14, 0x2

    if-lt v0, v14, :cond_42

    invoke-virtual {v3, v13}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    :cond_42
    :goto_2d
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    cmp-long v0, v6, v8

    if-nez v0, :cond_44

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v4

    and-int/lit16 v6, v4, 0xf0

    shr-int/lit8 v8, v6, 0x4

    and-int/lit8 v9, v4, 0xf

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v4

    if-ne v4, v0, :cond_46

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v6

    const/16 v4, 0x10

    new-array v7, v4, [B

    const/4 v10, 0x0

    invoke-virtual {v3, v7, v10, v4}, Lcom/google/android/gms/internal/ads/sR;->h([BII)V

    if-nez v6, :cond_43

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v2

    new-array v4, v2, [B

    invoke-virtual {v3, v4, v10, v2}, Lcom/google/android/gms/internal/ads/sR;->h([BII)V

    move-object v10, v4

    goto :goto_2e

    :cond_43
    move-object v10, v2

    :goto_2e
    iput-boolean v0, v1, Lcom/google/android/gms/internal/ads/P3;->k:Z

    new-instance v0, Lcom/google/android/gms/internal/ads/O3;

    const/4 v4, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/internal/ads/O3;-><init>(ZLjava/lang/String;I[BII[B)V

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/P3;->m:Lcom/google/android/gms/internal/ads/O3;

    goto :goto_2f

    :cond_44
    const-string v0, "Entry count in sgpd != 1 (unsupported)."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/of;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v0

    throw v0

    :cond_45
    const-string v0, "Entry count in sbgp != 1 (unsupported)."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/of;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v0

    throw v0

    :cond_46
    :goto_2f
    iget-object v0, v11, Lcom/google/android/gms/internal/ads/kZ;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_30
    if-ge v2, v0, :cond_49

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/kZ;->c:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/LZ;

    iget v4, v3, Lcom/google/android/gms/internal/ads/N00;->a:I

    const v5, 0x75756964

    if-ne v4, v5, :cond_48

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    move-object/from16 v6, v31

    const/4 v5, 0x0

    const/16 v7, 0x10

    invoke-virtual {v3, v6, v5, v7}, Lcom/google/android/gms/internal/ads/sR;->h([BII)V

    sget-object v8, Lcom/google/android/gms/internal/ads/B3;->J:[B

    invoke-static {v6, v8}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v8

    if-eqz v8, :cond_47

    invoke-static {v3, v7, v1}, Lcom/google/android/gms/internal/ads/B3;->h(Lcom/google/android/gms/internal/ads/sR;ILcom/google/android/gms/internal/ads/P3;)V

    :cond_47
    :goto_31
    const/4 v3, 0x1

    goto :goto_32

    :cond_48
    move-object/from16 v6, v31

    const/16 v4, 0x8

    const/4 v5, 0x0

    const/16 v7, 0x10

    goto :goto_31

    :goto_32
    add-int/2addr v2, v3

    move-object/from16 v31, v6

    goto :goto_30

    :cond_49
    move-object/from16 v6, v31

    const/4 v3, 0x1

    const/16 v4, 0x8

    const/4 v5, 0x0

    const/16 v7, 0x10

    :goto_33
    add-int/lit8 v0, v30, 0x1

    move v2, v4

    move-object v4, v6

    move/from16 v5, v22

    move-object/from16 v1, v23

    move-object/from16 v7, v29

    move/from16 v3, v46

    move v6, v0

    move-object/from16 v0, p0

    goto/16 :goto_8

    :cond_4a
    move v4, v2

    move-object v0, v7

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/16 v7, 0x10

    const/4 v13, 0x4

    const/4 v14, 0x2

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/kZ;->c:Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/B3;->d(Ljava/util/List;)Lcom/google/android/gms/internal/ads/EH0;

    move-result-object v0

    move-object/from16 v1, p0

    if-eqz v0, :cond_4c

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    move v6, v5

    :goto_34
    if-ge v6, v3, :cond_4c

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/ads/A3;

    iget-object v9, v8, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget-object v9, v9, Lcom/google/android/gms/internal/ads/Q3;->a:Lcom/google/android/gms/internal/ads/N3;

    iget-object v10, v8, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/P3;->a:Lcom/google/android/gms/internal/ads/w3;

    sget v11, Lcom/google/android/gms/internal/ads/EW;->a:I

    iget v10, v10, Lcom/google/android/gms/internal/ads/w3;->a:I

    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/ads/N3;->b(I)Lcom/google/android/gms/internal/ads/O3;

    move-result-object v9

    if-eqz v9, :cond_4b

    iget-object v9, v9, Lcom/google/android/gms/internal/ads/O3;->b:Ljava/lang/String;

    goto :goto_35

    :cond_4b
    move-object v9, v2

    :goto_35
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/EH0;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/EH0;

    move-result-object v9

    iget-object v10, v8, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/Q3;->a:Lcom/google/android/gms/internal/ads/N3;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/N3;->g:Lcom/google/android/gms/internal/ads/D;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/D;->b()Lcom/google/android/gms/internal/ads/oK0;

    move-result-object v10

    invoke-virtual {v10, v9}, Lcom/google/android/gms/internal/ads/oK0;->f(Lcom/google/android/gms/internal/ads/EH0;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v9

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/A3;->a:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {v8, v9}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    const/4 v8, 0x1

    add-int/2addr v6, v8

    goto :goto_34

    :cond_4c
    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/B3;->w:J

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v8

    if-eqz v0, :cond_50

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    move v15, v5

    :goto_36
    if-ge v15, v0, :cond_4f

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {v2, v15}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/A3;

    iget-wide v5, v1, Lcom/google/android/gms/internal/ads/B3;->w:J

    iget v3, v2, Lcom/google/android/gms/internal/ads/A3;->f:I

    :goto_37
    iget-object v8, v2, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget v9, v8, Lcom/google/android/gms/internal/ads/P3;->e:I

    if-ge v3, v9, :cond_4e

    iget-object v9, v8, Lcom/google/android/gms/internal/ads/P3;->i:[J

    aget-wide v10, v9, v3

    cmp-long v9, v10, v5

    if-gtz v9, :cond_4e

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/P3;->j:[Z

    aget-boolean v8, v8, v3

    if-eqz v8, :cond_4d

    iput v3, v2, Lcom/google/android/gms/internal/ads/A3;->i:I

    :cond_4d
    const/4 v8, 0x1

    add-int/2addr v3, v8

    goto :goto_37

    :cond_4e
    const/4 v8, 0x1

    add-int/2addr v15, v8

    goto :goto_36

    :cond_4f
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x1

    iput-wide v2, v1, Lcom/google/android/gms/internal/ads/B3;->w:J

    :cond_50
    :goto_38
    move-object v0, v1

    move v2, v4

    goto/16 :goto_0

    :cond_51
    move-object v1, v0

    move v4, v2

    move-object v0, v7

    const/16 v7, 0x10

    const/4 v8, 0x1

    const/4 v13, 0x4

    const/4 v14, 0x2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/B3;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_50

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/B3;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/kZ;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/kZ;->d(Lcom/google/android/gms/internal/ads/kZ;)V

    goto :goto_38

    :cond_52
    move-object v1, v0

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/B3;->g()V

    return-void
.end method

.method private static final m(Landroid/util/SparseArray;I)Lcom/google/android/gms/internal/ads/w3;
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/w3;

    return-object p0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/w3;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method


# virtual methods
.method final synthetic a(JLcom/google/android/gms/internal/ads/sR;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/B3;->H:[Lcom/google/android/gms/internal/ads/a1;

    invoke-static {p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/e0;->a(JLcom/google/android/gms/internal/ads/sR;[Lcom/google/android/gms/internal/ads/a1;)V

    return-void
.end method

.method public final synthetic c()Lcom/google/android/gms/internal/ads/t0;
    .locals 0

    return-object p0
.end method

.method public final e(JJ)V
    .locals 2

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    if-ge v0, p1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/A3;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/A3;->i()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->m:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    iput p2, p0, Lcom/google/android/gms/internal/ads/B3;->v:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->n:Lcom/google/android/gms/internal/ads/nd0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/nd0;->c()V

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/B3;->w:J

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->l:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/B3;->g()V

    return-void
.end method

.method public final synthetic f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/B3;->o:Lcom/google/android/gms/internal/ads/ci0;

    return-object v0
.end method

.method public final i(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I
    .locals 26

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    :goto_0
    const/4 v3, 0x1

    :goto_1
    iget v4, v0, Lcom/google/android/gms/internal/ads/B3;->p:I

    const v5, 0x656d7367

    const v6, 0x73696478

    const/4 v7, 0x2

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v4, :cond_34

    const-string v11, "FragmentedMp4Extractor"

    if-eq v4, v3, :cond_26

    const-wide v5, 0x7fffffffffffffffL

    const/4 v13, 0x3

    if-eq v4, v7, :cond_21

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/B3;->z:Lcom/google/android/gms/internal/ads/A3;

    if-nez v4, :cond_8

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v14

    move-wide v15, v5

    move-object v5, v9

    move v6, v10

    :goto_2
    if-ge v6, v14, :cond_3

    invoke-virtual {v4, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v2, v17

    check-cast v2, Lcom/google/android/gms/internal/ads/A3;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/A3;->j(Lcom/google/android/gms/internal/ads/A3;)Z

    move-result v17

    if-nez v17, :cond_0

    iget v7, v2, Lcom/google/android/gms/internal/ads/A3;->f:I

    iget-object v12, v2, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget v12, v12, Lcom/google/android/gms/internal/ads/Q3;->b:I

    if-eq v7, v12, :cond_2

    :cond_0
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/A3;->j(Lcom/google/android/gms/internal/ads/A3;)Z

    move-result v7

    if-eqz v7, :cond_1

    iget v7, v2, Lcom/google/android/gms/internal/ads/A3;->h:I

    iget-object v12, v2, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget v12, v12, Lcom/google/android/gms/internal/ads/P3;->d:I

    if-ne v7, v12, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/A3;->d()J

    move-result-wide v19

    cmp-long v7, v19, v15

    if-gez v7, :cond_2

    move-object v5, v2

    move-wide/from16 v15, v19

    :cond_2
    :goto_3
    add-int/2addr v6, v3

    const/4 v7, 0x2

    goto :goto_2

    :cond_3
    if-nez v5, :cond_6

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/B3;->u:J

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v6

    sub-long/2addr v4, v6

    long-to-int v2, v4

    if-ltz v2, :cond_5

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    :cond_4
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/B3;->g()V

    goto :goto_1

    :cond_5
    const-string v1, "Offset to end of mdat was negative."

    invoke-static {v1, v9}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v1

    throw v1

    :cond_6
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/A3;->d()J

    move-result-wide v6

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v14

    sub-long/2addr v6, v14

    long-to-int v2, v6

    if-gez v2, :cond_7

    const-string v2, "Ignoring negative offset to sample data."

    invoke-static {v11, v2}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v10

    :cond_7
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    iput-object v5, v0, Lcom/google/android/gms/internal/ads/B3;->z:Lcom/google/android/gms/internal/ads/A3;

    move-object v4, v5

    :cond_8
    iget v2, v0, Lcom/google/android/gms/internal/ads/B3;->p:I

    const/4 v5, 0x6

    if-ne v2, v13, :cond_10

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/A3;->b()I

    move-result v2

    iput v2, v0, Lcom/google/android/gms/internal/ads/B3;->A:I

    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/B3;->D:Z

    iget v6, v4, Lcom/google/android/gms/internal/ads/A3;->f:I

    iget v7, v4, Lcom/google/android/gms/internal/ads/A3;->i:I

    if-ge v6, v7, :cond_d

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/A3;->f()Lcom/google/android/gms/internal/ads/O3;

    move-result-object v1

    if-nez v1, :cond_9

    goto :goto_4

    :cond_9
    iget-object v2, v4, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/P3;->n:Lcom/google/android/gms/internal/ads/sR;

    iget v1, v1, Lcom/google/android/gms/internal/ads/O3;->d:I

    if-eqz v1, :cond_a

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    :cond_a
    iget-object v1, v4, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget v3, v4, Lcom/google/android/gms/internal/ads/A3;->f:I

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/P3;->b(I)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->G()I

    move-result v1

    mul-int/2addr v1, v5

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    :cond_b
    :goto_4
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/A3;->k()Z

    move-result v1

    if-nez v1, :cond_c

    iput-object v9, v0, Lcom/google/android/gms/internal/ads/B3;->z:Lcom/google/android/gms/internal/ads/A3;

    :cond_c
    move v1, v13

    goto/16 :goto_10

    :cond_d
    iget-object v6, v4, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/Q3;->a:Lcom/google/android/gms/internal/ads/N3;

    iget v6, v6, Lcom/google/android/gms/internal/ads/N3;->h:I

    if-ne v6, v3, :cond_e

    add-int/lit8 v2, v2, -0x8

    iput v2, v0, Lcom/google/android/gms/internal/ads/B3;->A:I

    invoke-interface {v1, v8}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    :cond_e
    iget-object v2, v4, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/Q3;->a:Lcom/google/android/gms/internal/ads/N3;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/N3;->g:Lcom/google/android/gms/internal/ads/D;

    const-string v6, "audio/ac4"

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    iget v2, v0, Lcom/google/android/gms/internal/ads/B3;->A:I

    const/4 v6, 0x7

    invoke-virtual {v4, v2, v6}, Lcom/google/android/gms/internal/ads/A3;->c(II)I

    move-result v2

    iput v2, v0, Lcom/google/android/gms/internal/ads/B3;->B:I

    iget v2, v0, Lcom/google/android/gms/internal/ads/B3;->A:I

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/B3;->i:Lcom/google/android/gms/internal/ads/sR;

    invoke-static {v2, v7}, Lcom/google/android/gms/internal/ads/V;->b(ILcom/google/android/gms/internal/ads/sR;)V

    iget-object v2, v4, Lcom/google/android/gms/internal/ads/A3;->a:Lcom/google/android/gms/internal/ads/a1;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/B3;->i:Lcom/google/android/gms/internal/ads/sR;

    invoke-interface {v2, v7, v6}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    iget v2, v0, Lcom/google/android/gms/internal/ads/B3;->B:I

    add-int/2addr v2, v6

    :goto_5
    iput v2, v0, Lcom/google/android/gms/internal/ads/B3;->B:I

    goto :goto_6

    :cond_f
    iget v2, v0, Lcom/google/android/gms/internal/ads/B3;->A:I

    invoke-virtual {v4, v2, v10}, Lcom/google/android/gms/internal/ads/A3;->c(II)I

    move-result v2

    goto :goto_5

    :goto_6
    iget v6, v0, Lcom/google/android/gms/internal/ads/B3;->A:I

    add-int/2addr v6, v2

    iput v6, v0, Lcom/google/android/gms/internal/ads/B3;->A:I

    const/4 v2, 0x4

    iput v2, v0, Lcom/google/android/gms/internal/ads/B3;->p:I

    iput v10, v0, Lcom/google/android/gms/internal/ads/B3;->C:I

    :cond_10
    iget-object v2, v4, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/Q3;->a:Lcom/google/android/gms/internal/ads/N3;

    iget-object v6, v4, Lcom/google/android/gms/internal/ads/A3;->a:Lcom/google/android/gms/internal/ads/a1;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/A3;->e()J

    move-result-wide v7

    iget v11, v2, Lcom/google/android/gms/internal/ads/N3;->k:I

    if-nez v11, :cond_11

    :goto_7
    iget v2, v0, Lcom/google/android/gms/internal/ads/B3;->B:I

    iget v5, v0, Lcom/google/android/gms/internal/ads/B3;->A:I

    if-ge v2, v5, :cond_1b

    sub-int/2addr v5, v2

    invoke-interface {v6, v1, v5, v10}, Lcom/google/android/gms/internal/ads/a1;->e(Lcom/google/android/gms/internal/ads/qB0;IZ)I

    move-result v2

    iget v5, v0, Lcom/google/android/gms/internal/ads/B3;->B:I

    add-int/2addr v5, v2

    iput v5, v0, Lcom/google/android/gms/internal/ads/B3;->B:I

    goto :goto_7

    :cond_11
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/B3;->f:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v12

    aput-byte v10, v12, v10

    aput-byte v10, v12, v3

    const/4 v14, 0x2

    aput-byte v10, v12, v14

    add-int/lit8 v14, v11, 0x1

    const/4 v15, 0x4

    rsub-int/lit8 v11, v11, 0x4

    :goto_8
    iget v15, v0, Lcom/google/android/gms/internal/ads/B3;->B:I

    iget v13, v0, Lcom/google/android/gms/internal/ads/B3;->A:I

    if-ge v15, v13, :cond_1b

    iget v13, v0, Lcom/google/android/gms/internal/ads/B3;->C:I

    const-string v15, "video/hevc"

    if-nez v13, :cond_17

    invoke-interface {v1, v12, v11, v14}, Lcom/google/android/gms/internal/ads/u0;->M([BII)V

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/B3;->f:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/B3;->f:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v13

    if-lez v13, :cond_16

    const/16 v17, -0x1

    add-int/lit8 v13, v13, -0x1

    iput v13, v0, Lcom/google/android/gms/internal/ads/B3;->C:I

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/B3;->e:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/B3;->e:Lcom/google/android/gms/internal/ads/sR;

    const/4 v10, 0x4

    invoke-interface {v6, v13, v10}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/B3;->f:Lcom/google/android/gms/internal/ads/sR;

    invoke-interface {v6, v13, v3}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/B3;->H:[Lcom/google/android/gms/internal/ads/a1;

    array-length v13, v13

    const-string v9, "video/avc"

    if-lez v13, :cond_14

    iget-object v13, v2, Lcom/google/android/gms/internal/ads/N3;->g:Lcom/google/android/gms/internal/ads/D;

    aget-byte v17, v12, v10

    sget-object v10, Lcom/google/android/gms/internal/ads/lb0;->a:[B

    iget-object v10, v13, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_13

    and-int/lit8 v13, v17, 0x1f

    if-eq v13, v5, :cond_12

    goto :goto_a

    :cond_12
    :goto_9
    move v10, v3

    goto :goto_b

    :cond_13
    :goto_a
    invoke-virtual {v15, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_14

    and-int/lit8 v10, v17, 0x7e

    shr-int/2addr v10, v3

    const/16 v13, 0x27

    if-ne v10, v13, :cond_14

    goto :goto_9

    :cond_14
    const/4 v10, 0x0

    :goto_b
    iput-boolean v10, v0, Lcom/google/android/gms/internal/ads/B3;->E:Z

    iget v10, v0, Lcom/google/android/gms/internal/ads/B3;->B:I

    add-int/lit8 v10, v10, 0x5

    iput v10, v0, Lcom/google/android/gms/internal/ads/B3;->B:I

    iget v10, v0, Lcom/google/android/gms/internal/ads/B3;->A:I

    add-int/2addr v10, v11

    iput v10, v0, Lcom/google/android/gms/internal/ads/B3;->A:I

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/B3;->D:Z

    if-nez v10, :cond_15

    iget-object v10, v4, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/Q3;->a:Lcom/google/android/gms/internal/ads/N3;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/N3;->g:Lcom/google/android/gms/internal/ads/D;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    invoke-static {v10, v9}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_15

    const/4 v9, 0x4

    aget-byte v10, v12, v9

    invoke-static {v10}, Lcom/google/android/gms/internal/ads/lb0;->i(B)Z

    move-result v9

    if-eqz v9, :cond_15

    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/B3;->D:Z

    :cond_15
    :goto_c
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x3

    goto/16 :goto_8

    :cond_16
    const-string v1, "Invalid NAL length"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v1

    throw v1

    :cond_17
    iget-boolean v9, v0, Lcom/google/android/gms/internal/ads/B3;->E:Z

    if-eqz v9, :cond_19

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/B3;->g:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v9, v13}, Lcom/google/android/gms/internal/ads/sR;->i(I)V

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/B3;->g:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v9

    iget v10, v0, Lcom/google/android/gms/internal/ads/B3;->C:I

    const/4 v13, 0x0

    invoke-interface {v1, v9, v13, v10}, Lcom/google/android/gms/internal/ads/u0;->M([BII)V

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/B3;->g:Lcom/google/android/gms/internal/ads/sR;

    iget v10, v0, Lcom/google/android/gms/internal/ads/B3;->C:I

    invoke-interface {v6, v9, v10}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    iget v9, v0, Lcom/google/android/gms/internal/ads/B3;->C:I

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/B3;->g:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v13

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/sR;->u()I

    move-result v10

    invoke-static {v13, v10}, Lcom/google/android/gms/internal/ads/lb0;->b([BI)I

    move-result v10

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/B3;->g:Lcom/google/android/gms/internal/ads/sR;

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/N3;->g:Lcom/google/android/gms/internal/ads/D;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v13, v5}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/B3;->g:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v5, v10}, Lcom/google/android/gms/internal/ads/sR;->k(I)V

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/N3;->g:Lcom/google/android/gms/internal/ads/D;

    iget v5, v5, Lcom/google/android/gms/internal/ads/D;->q:I

    const/4 v10, -0x1

    if-eq v5, v10, :cond_18

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/B3;->n:Lcom/google/android/gms/internal/ads/nd0;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/nd0;->a()I

    move-result v10

    if-eq v5, v10, :cond_18

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/B3;->n:Lcom/google/android/gms/internal/ads/nd0;

    iget-object v10, v2, Lcom/google/android/gms/internal/ads/N3;->g:Lcom/google/android/gms/internal/ads/D;

    iget v10, v10, Lcom/google/android/gms/internal/ads/D;->q:I

    invoke-virtual {v5, v10}, Lcom/google/android/gms/internal/ads/nd0;->d(I)V

    :cond_18
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/B3;->n:Lcom/google/android/gms/internal/ads/nd0;

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/B3;->g:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v5, v7, v8, v10}, Lcom/google/android/gms/internal/ads/nd0;->b(JLcom/google/android/gms/internal/ads/sR;)V

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/A3;->a()I

    move-result v5

    and-int/lit8 v5, v5, 0x5

    if-eqz v5, :cond_1a

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/B3;->n:Lcom/google/android/gms/internal/ads/nd0;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/nd0;->c()V

    goto :goto_d

    :cond_19
    const/4 v5, 0x0

    invoke-interface {v6, v1, v13, v5}, Lcom/google/android/gms/internal/ads/a1;->e(Lcom/google/android/gms/internal/ads/qB0;IZ)I

    move-result v9

    :cond_1a
    :goto_d
    iget v5, v0, Lcom/google/android/gms/internal/ads/B3;->B:I

    add-int/2addr v5, v9

    iput v5, v0, Lcom/google/android/gms/internal/ads/B3;->B:I

    iget v5, v0, Lcom/google/android/gms/internal/ads/B3;->C:I

    sub-int/2addr v5, v9

    iput v5, v0, Lcom/google/android/gms/internal/ads/B3;->C:I

    const/4 v5, 0x6

    goto/16 :goto_c

    :cond_1b
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/A3;->a()I

    move-result v22

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/A3;->f()Lcom/google/android/gms/internal/ads/O3;

    move-result-object v1

    if-eqz v1, :cond_1c

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/O3;->c:Lcom/google/android/gms/internal/ads/Z0;

    move-object/from16 v25, v1

    goto :goto_e

    :cond_1c
    const/16 v25, 0x0

    :goto_e
    iget v1, v0, Lcom/google/android/gms/internal/ads/B3;->A:I

    const/16 v24, 0x0

    move-object/from16 v19, v6

    move-wide/from16 v20, v7

    move/from16 v23, v1

    invoke-interface/range {v19 .. v25}, Lcom/google/android/gms/internal/ads/a1;->b(JIIILcom/google/android/gms/internal/ads/Z0;)V

    :cond_1d
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/B3;->m:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1f

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/B3;->m:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/z3;

    iget v2, v0, Lcom/google/android/gms/internal/ads/B3;->v:I

    iget v5, v1, Lcom/google/android/gms/internal/ads/z3;->c:I

    sub-int/2addr v2, v5

    iput v2, v0, Lcom/google/android/gms/internal/ads/B3;->v:I

    iget-wide v5, v1, Lcom/google/android/gms/internal/ads/z3;->a:J

    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/z3;->b:Z

    if-eqz v2, :cond_1e

    add-long/2addr v5, v7

    :cond_1e
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/B3;->G:[Lcom/google/android/gms/internal/ads/a1;

    array-length v15, v2

    const/4 v14, 0x0

    :goto_f
    if-ge v14, v15, :cond_1d

    aget-object v9, v2, v14

    iget v13, v1, Lcom/google/android/gms/internal/ads/z3;->c:I

    iget v12, v0, Lcom/google/android/gms/internal/ads/B3;->v:I

    const/16 v17, 0x0

    const/16 v18, 0x1

    move-wide v10, v5

    move/from16 v19, v12

    move/from16 v12, v18

    move/from16 v18, v14

    move/from16 v14, v19

    move/from16 v19, v15

    move-object/from16 v15, v17

    invoke-interface/range {v9 .. v15}, Lcom/google/android/gms/internal/ads/a1;->b(JIIILcom/google/android/gms/internal/ads/Z0;)V

    add-int/lit8 v14, v18, 0x1

    move/from16 v15, v19

    goto :goto_f

    :cond_1f
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/A3;->k()Z

    move-result v1

    if-nez v1, :cond_20

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/B3;->z:Lcom/google/android/gms/internal/ads/A3;

    :cond_20
    const/4 v1, 0x3

    :goto_10
    iput v1, v0, Lcom/google/android/gms/internal/ads/B3;->p:I

    const/4 v1, 0x0

    return v1

    :cond_21
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v4, 0x0

    const/4 v7, 0x0

    :goto_11
    if-ge v4, v2, :cond_23

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {v8, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/ads/A3;

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget-boolean v9, v8, Lcom/google/android/gms/internal/ads/P3;->o:Z

    if-eqz v9, :cond_22

    iget-wide v8, v8, Lcom/google/android/gms/internal/ads/P3;->c:J

    cmp-long v10, v8, v5

    if-gez v10, :cond_22

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/A3;

    move-object v7, v5

    move-wide v5, v8

    :cond_22
    add-int/2addr v4, v3

    goto :goto_11

    :cond_23
    if-nez v7, :cond_24

    const/4 v2, 0x3

    iput v2, v0, Lcom/google/android/gms/internal/ads/B3;->p:I

    goto/16 :goto_1

    :cond_24
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v8

    sub-long/2addr v5, v8

    long-to-int v2, v5

    if-ltz v2, :cond_25

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    iget-object v2, v7, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/P3;->n:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v5

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/sR;->u()I

    move-result v4

    const/4 v6, 0x0

    invoke-interface {v1, v5, v6, v4}, Lcom/google/android/gms/internal/ads/u0;->M([BII)V

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/P3;->n:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iput-boolean v6, v2, Lcom/google/android/gms/internal/ads/P3;->o:Z

    goto/16 :goto_1

    :cond_25
    const-string v1, "Offset to encryption data was negative."

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v1

    throw v1

    :cond_26
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/B3;->r:J

    long-to-int v2, v9

    iget v4, v0, Lcom/google/android/gms/internal/ads/B3;->s:I

    sub-int/2addr v2, v4

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/B3;->t:Lcom/google/android/gms/internal/ads/sR;

    if-eqz v4, :cond_33

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v7

    invoke-interface {v1, v7, v8, v2}, Lcom/google/android/gms/internal/ads/u0;->M([BII)V

    new-instance v2, Lcom/google/android/gms/internal/ads/LZ;

    iget v7, v0, Lcom/google/android/gms/internal/ads/B3;->q:I

    invoke-direct {v2, v7, v4}, Lcom/google/android/gms/internal/ads/LZ;-><init>(ILcom/google/android/gms/internal/ads/sR;)V

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v9

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/B3;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_27

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/B3;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/kZ;

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/kZ;->e(Lcom/google/android/gms/internal/ads/LZ;)V

    goto/16 :goto_1b

    :cond_27
    iget v4, v2, Lcom/google/android/gms/internal/ads/N00;->a:I

    if-ne v4, v6, :cond_2c

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v4

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/v3;->a(I)I

    move-result v4

    const/4 v5, 0x4

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v5

    if-nez v4, :cond_28

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v7

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v11

    :goto_12
    add-long/2addr v9, v11

    goto :goto_13

    :cond_28
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->M()J

    move-result-wide v7

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->M()J

    move-result-wide v11

    goto :goto_12

    :goto_13
    const-wide/32 v21, 0xf4240

    sget-object v25, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide/from16 v19, v7

    move-wide/from16 v23, v5

    invoke-static/range {v19 .. v25}, Lcom/google/android/gms/internal/ads/EW;->M(JJJLjava/math/RoundingMode;)J

    move-result-wide v11

    const/4 v4, 0x2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->G()I

    move-result v4

    new-array v13, v4, [I

    new-array v14, v4, [J

    new-array v15, v4, [J

    new-array v3, v4, [J

    move-wide/from16 v19, v11

    const/4 v1, 0x0

    :goto_14
    if-ge v1, v4, :cond_2a

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v17

    const/high16 v21, -0x80000000

    and-int v21, v17, v21

    if-nez v21, :cond_29

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v21

    const v23, 0x7fffffff

    and-int v17, v17, v23

    aput v17, v13, v1

    aput-wide v9, v14, v1

    aput-wide v19, v3, v1

    add-long v7, v7, v21

    const-wide/32 v21, 0xf4240

    sget-object v25, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide/from16 v19, v7

    move-wide/from16 v23, v5

    invoke-static/range {v19 .. v25}, Lcom/google/android/gms/internal/ads/EW;->M(JJJLjava/math/RoundingMode;)J

    move-result-wide v19

    aget-wide v21, v3, v1

    sub-long v21, v19, v21

    aput-wide v21, v15, v1

    move/from16 v17, v4

    const/4 v4, 0x4

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    aget v4, v13, v1

    move-wide/from16 v21, v5

    int-to-long v4, v4

    add-long/2addr v9, v4

    const/4 v4, 0x1

    add-int/2addr v1, v4

    move/from16 v4, v17

    move-wide/from16 v5, v21

    goto :goto_14

    :cond_29
    const-string v1, "Unhandled indirect reference"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v1

    throw v1

    :cond_2a
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/g0;

    invoke-direct {v2, v13, v14, v15, v3}, Lcom/google/android/gms/internal/ads/g0;-><init>([I[J[J[J)V

    invoke-static {v1, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/B3;->y:J

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/B3;->F:Lcom/google/android/gms/internal/ads/w0;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/T0;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/w0;->R(Lcom/google/android/gms/internal/ads/T0;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/B3;->I:Z

    :cond_2b
    :goto_15
    move-object/from16 v1, p1

    goto/16 :goto_1b

    :cond_2c
    if-ne v4, v5, :cond_2b

    iget-object v1, v2, Lcom/google/android/gms/internal/ads/LZ;->b:Lcom/google/android/gms/internal/ads/sR;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/B3;->G:[Lcom/google/android/gms/internal/ads/a1;

    array-length v2, v2

    if-eqz v2, :cond_2b

    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/v3;->a(I)I

    move-result v2

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_2e

    const/4 v5, 0x1

    if-eq v2, v5, :cond_2d

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Skipping unsupported emsg version: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_15

    :cond_2d
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->M()J

    move-result-wide v17

    sget-object v2, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v19, 0xf4240

    move-wide/from16 v21, v5

    move-object/from16 v23, v2

    invoke-static/range {v17 .. v23}, Lcom/google/android/gms/internal/ads/EW;->M(JJJLjava/math/RoundingMode;)J

    move-result-wide v7

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v17

    const-wide/16 v19, 0x3e8

    invoke-static/range {v17 .. v23}, Lcom/google/android/gms/internal/ads/EW;->M(JJJLjava/math/RoundingMode;)J

    move-result-wide v5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v9

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/sR;->O(C)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/sR;->O(C)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide/from16 v20, v5

    move-wide/from16 v22, v9

    move-object/from16 v18, v11

    move-object/from16 v19, v12

    move-wide v12, v7

    move-wide v7, v3

    goto :goto_17

    :cond_2e
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/sR;->O(C)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/sR;->O(C)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v17

    sget-object v2, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v19, 0xf4240

    move-wide/from16 v21, v5

    move-object/from16 v23, v2

    invoke-static/range {v17 .. v23}, Lcom/google/android/gms/internal/ads/EW;->M(JJJLjava/math/RoundingMode;)J

    move-result-wide v7

    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/B3;->y:J

    cmp-long v13, v9, v3

    if-eqz v13, :cond_2f

    add-long/2addr v9, v7

    goto :goto_16

    :cond_2f
    move-wide v9, v3

    :goto_16
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v17

    const-wide/16 v19, 0x3e8

    move-wide/from16 v21, v5

    move-object/from16 v23, v2

    invoke-static/range {v17 .. v23}, Lcom/google/android/gms/internal/ads/EW;->M(JJJLjava/math/RoundingMode;)J

    move-result-wide v5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v13

    move-wide/from16 v20, v5

    move-object/from16 v18, v11

    move-object/from16 v19, v12

    move-wide/from16 v22, v13

    move-wide v12, v9

    :goto_17
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v2

    new-array v2, v2, [B

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {v1, v2, v6, v5}, Lcom/google/android/gms/internal/ads/sR;->h([BII)V

    new-instance v1, Lcom/google/android/gms/internal/ads/T1;

    move-object/from16 v17, v1

    move-object/from16 v24, v2

    invoke-direct/range {v17 .. v24}, Lcom/google/android/gms/internal/ads/T1;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/B3;->j:Lcom/google/android/gms/internal/ads/U1;

    new-instance v5, Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/U1;->a(Lcom/google/android/gms/internal/ads/T1;)[B

    move-result-object v1

    invoke-direct {v5, v1}, Lcom/google/android/gms/internal/ads/sR;-><init>([B)V

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/B3;->G:[Lcom/google/android/gms/internal/ads/a1;

    array-length v6, v2

    const/4 v9, 0x0

    :goto_18
    if-ge v9, v6, :cond_30

    aget-object v10, v2, v9

    const/4 v11, 0x0

    invoke-virtual {v5, v11}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-interface {v10, v5, v1}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    const/4 v10, 0x1

    add-int/2addr v9, v10

    goto :goto_18

    :cond_30
    const/4 v10, 0x1

    cmp-long v2, v12, v3

    if-nez v2, :cond_31

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/B3;->m:Ljava/util/ArrayDeque;

    new-instance v3, Lcom/google/android/gms/internal/ads/z3;

    invoke-direct {v3, v7, v8, v10, v1}, Lcom/google/android/gms/internal/ads/z3;-><init>(JZI)V

    :goto_19
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget v2, v0, Lcom/google/android/gms/internal/ads/B3;->v:I

    add-int/2addr v2, v1

    iput v2, v0, Lcom/google/android/gms/internal/ads/B3;->v:I

    goto/16 :goto_15

    :cond_31
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/B3;->m:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_32

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/B3;->m:Ljava/util/ArrayDeque;

    new-instance v3, Lcom/google/android/gms/internal/ads/z3;

    const/4 v4, 0x0

    invoke-direct {v3, v12, v13, v4, v1}, Lcom/google/android/gms/internal/ads/z3;-><init>(JZI)V

    goto :goto_19

    :cond_32
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/B3;->G:[Lcom/google/android/gms/internal/ads/a1;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_1a
    if-ge v4, v3, :cond_2b

    aget-object v5, v2, v4

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x1

    move-wide v6, v12

    move v9, v1

    invoke-interface/range {v5 .. v11}, Lcom/google/android/gms/internal/ads/a1;->b(JIIILcom/google/android/gms/internal/ads/Z0;)V

    const/4 v5, 0x1

    add-int/2addr v4, v5

    goto :goto_1a

    :cond_33
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    :goto_1b
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/B3;->l(J)V

    goto/16 :goto_0

    :cond_34
    iget v2, v0, Lcom/google/android/gms/internal/ads/B3;->s:I

    if-nez v2, :cond_36

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/B3;->k:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-interface {v1, v2, v3, v8, v4}, Lcom/google/android/gms/internal/ads/u0;->J([BIIZ)Z

    move-result v2

    if-nez v2, :cond_35

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/B3;->n:Lcom/google/android/gms/internal/ads/nd0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/nd0;->c()V

    const/4 v2, -0x1

    return v2

    :cond_35
    const/4 v2, -0x1

    iput v8, v0, Lcom/google/android/gms/internal/ads/B3;->s:I

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/B3;->k:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/B3;->k:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v3

    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/B3;->r:J

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/B3;->k:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v3

    iput v3, v0, Lcom/google/android/gms/internal/ads/B3;->q:I

    goto :goto_1c

    :cond_36
    const/4 v2, -0x1

    :goto_1c
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/B3;->r:J

    const-wide/16 v9, 0x1

    cmp-long v7, v3, v9

    if-nez v7, :cond_37

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/B3;->k:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v3

    invoke-interface {v1, v3, v8, v8}, Lcom/google/android/gms/internal/ads/u0;->M([BII)V

    iget v3, v0, Lcom/google/android/gms/internal/ads/B3;->s:I

    add-int/2addr v3, v8

    iput v3, v0, Lcom/google/android/gms/internal/ads/B3;->s:I

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/B3;->k:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->M()J

    move-result-wide v3

    :goto_1d
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/B3;->r:J

    goto :goto_1f

    :cond_37
    const-wide/16 v9, 0x0

    cmp-long v3, v3, v9

    if-nez v3, :cond_3a

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->f()J

    move-result-wide v3

    const-wide/16 v9, -0x1

    cmp-long v7, v3, v9

    if-nez v7, :cond_39

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/B3;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_38

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/B3;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/kZ;

    iget-wide v3, v3, Lcom/google/android/gms/internal/ads/kZ;->b:J

    goto :goto_1e

    :cond_38
    move-wide v3, v9

    :cond_39
    :goto_1e
    cmp-long v7, v3, v9

    if-eqz v7, :cond_3a

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v9

    sub-long/2addr v3, v9

    iget v7, v0, Lcom/google/android/gms/internal/ads/B3;->s:I

    int-to-long v9, v7

    add-long/2addr v3, v9

    goto :goto_1d

    :cond_3a
    :goto_1f
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/B3;->r:J

    iget v7, v0, Lcom/google/android/gms/internal/ads/B3;->s:I

    int-to-long v9, v7

    cmp-long v3, v3, v9

    if-ltz v3, :cond_46

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v3

    sub-long/2addr v3, v9

    iget v7, v0, Lcom/google/android/gms/internal/ads/B3;->q:I

    const v9, 0x6d646174

    const v10, 0x6d6f6f66

    if-eq v7, v10, :cond_3b

    if-ne v7, v9, :cond_3c

    :cond_3b
    iget-boolean v7, v0, Lcom/google/android/gms/internal/ads/B3;->I:Z

    if-nez v7, :cond_3c

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/B3;->F:Lcom/google/android/gms/internal/ads/w0;

    new-instance v11, Lcom/google/android/gms/internal/ads/S0;

    iget-wide v12, v0, Lcom/google/android/gms/internal/ads/B3;->x:J

    invoke-direct {v11, v12, v13, v3, v4}, Lcom/google/android/gms/internal/ads/S0;-><init>(JJ)V

    invoke-interface {v7, v11}, Lcom/google/android/gms/internal/ads/w0;->R(Lcom/google/android/gms/internal/ads/T0;)V

    const/4 v7, 0x1

    iput-boolean v7, v0, Lcom/google/android/gms/internal/ads/B3;->I:Z

    :cond_3c
    iget v7, v0, Lcom/google/android/gms/internal/ads/B3;->q:I

    if-ne v7, v10, :cond_3d

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v7

    const/4 v13, 0x0

    :goto_20
    if-ge v13, v7, :cond_3d

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/B3;->d:Landroid/util/SparseArray;

    invoke-virtual {v11, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/ads/A3;

    iget-object v11, v11, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iput-wide v3, v11, Lcom/google/android/gms/internal/ads/P3;->c:J

    iput-wide v3, v11, Lcom/google/android/gms/internal/ads/P3;->b:J

    const/4 v11, 0x1

    add-int/2addr v13, v11

    goto :goto_20

    :cond_3d
    iget v7, v0, Lcom/google/android/gms/internal/ads/B3;->q:I

    if-ne v7, v9, :cond_3e

    const/4 v9, 0x0

    iput-object v9, v0, Lcom/google/android/gms/internal/ads/B3;->z:Lcom/google/android/gms/internal/ads/A3;

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/B3;->r:J

    add-long/2addr v3, v5

    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/B3;->u:J

    const/4 v3, 0x2

    iput v3, v0, Lcom/google/android/gms/internal/ads/B3;->p:I

    goto/16 :goto_0

    :cond_3e
    const v3, 0x6d6f6f76

    if-eq v7, v3, :cond_3f

    const v3, 0x7472616b

    if-eq v7, v3, :cond_3f

    const v3, 0x6d646961

    if-eq v7, v3, :cond_3f

    const v3, 0x6d696e66

    if-eq v7, v3, :cond_3f

    const v3, 0x7374626c

    if-eq v7, v3, :cond_3f

    if-eq v7, v10, :cond_3f

    const v3, 0x74726166

    if-eq v7, v3, :cond_3f

    const v3, 0x6d766578

    if-eq v7, v3, :cond_3f

    const v3, 0x65647473

    if-ne v7, v3, :cond_40

    :cond_3f
    const/4 v3, 0x1

    goto/16 :goto_23

    :cond_40
    const v3, 0x68646c72    # 4.3148E24f

    const-wide/32 v9, 0x7fffffff

    if-eq v7, v3, :cond_43

    const v3, 0x6d646864

    if-eq v7, v3, :cond_43

    const v3, 0x6d766864

    if-eq v7, v3, :cond_43

    if-eq v7, v6, :cond_43

    const v3, 0x73747364

    if-eq v7, v3, :cond_43

    const v3, 0x73747473

    if-eq v7, v3, :cond_43

    const v3, 0x63747473

    if-eq v7, v3, :cond_43

    const v3, 0x73747363

    if-eq v7, v3, :cond_43

    const v3, 0x7374737a

    if-eq v7, v3, :cond_43

    const v3, 0x73747a32

    if-eq v7, v3, :cond_43

    const v3, 0x7374636f

    if-eq v7, v3, :cond_43

    const v3, 0x636f3634

    if-eq v7, v3, :cond_43

    const v3, 0x73747373

    if-eq v7, v3, :cond_43

    const v3, 0x74666474

    if-eq v7, v3, :cond_43

    const v3, 0x74666864

    if-eq v7, v3, :cond_43

    const v3, 0x746b6864

    if-eq v7, v3, :cond_43

    const v3, 0x74726578

    if-eq v7, v3, :cond_43

    const v3, 0x7472756e

    if-eq v7, v3, :cond_43

    const v3, 0x70737368    # 3.013775E29f

    if-eq v7, v3, :cond_43

    const v3, 0x7361697a

    if-eq v7, v3, :cond_43

    const v3, 0x7361696f

    if-eq v7, v3, :cond_43

    const v3, 0x73656e63

    if-eq v7, v3, :cond_43

    const v3, 0x75756964

    if-eq v7, v3, :cond_43

    const v3, 0x73626770

    if-eq v7, v3, :cond_43

    const v3, 0x73677064

    if-eq v7, v3, :cond_43

    const v3, 0x656c7374

    if-eq v7, v3, :cond_43

    const v3, 0x6d656864

    if-eq v7, v3, :cond_43

    if-ne v7, v5, :cond_41

    goto :goto_22

    :cond_41
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/B3;->r:J

    cmp-long v3, v3, v9

    if-gtz v3, :cond_42

    const/4 v3, 0x0

    :goto_21
    iput-object v3, v0, Lcom/google/android/gms/internal/ads/B3;->t:Lcom/google/android/gms/internal/ads/sR;

    const/4 v3, 0x1

    iput v3, v0, Lcom/google/android/gms/internal/ads/B3;->p:I

    goto/16 :goto_1

    :cond_42
    const-string v1, "Skipping atom with length > 2147483647 (unsupported)."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/of;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v1

    throw v1

    :cond_43
    :goto_22
    iget v3, v0, Lcom/google/android/gms/internal/ads/B3;->s:I

    if-ne v3, v8, :cond_45

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/B3;->r:J

    cmp-long v3, v3, v9

    if-gtz v3, :cond_44

    new-instance v3, Lcom/google/android/gms/internal/ads/sR;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/B3;->r:J

    long-to-int v4, v4

    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/B3;->k:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v4, v6, v5, v6, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_21

    :cond_44
    const-string v1, "Leaf atom with length > 2147483647 (unsupported)."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/of;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v1

    throw v1

    :cond_45
    const-string v1, "Leaf atom defines extended atom size (unsupported)."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/of;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v1

    throw v1

    :goto_23
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v4

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/B3;->r:J

    add-long/2addr v4, v8

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/B3;->l:Ljava/util/ArrayDeque;

    new-instance v8, Lcom/google/android/gms/internal/ads/kZ;

    const-wide/16 v9, -0x8

    add-long/2addr v4, v9

    invoke-direct {v8, v7, v4, v5}, Lcom/google/android/gms/internal/ads/kZ;-><init>(IJ)V

    invoke-virtual {v6, v8}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/B3;->r:J

    iget v8, v0, Lcom/google/android/gms/internal/ads/B3;->s:I

    int-to-long v8, v8

    cmp-long v6, v6, v8

    if-nez v6, :cond_4

    invoke-direct {v0, v4, v5}, Lcom/google/android/gms/internal/ads/B3;->l(J)V

    goto/16 :goto_1

    :cond_46
    const-string v1, "Atom size less than header length (unsupported)."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/of;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v1

    throw v1
.end method

.method public final j(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 1

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/M3;->a(Lcom/google/android/gms/internal/ads/u0;)Lcom/google/android/gms/internal/ads/X0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ci0;->P(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/B3;->o:Lcom/google/android/gms/internal/ads/ci0;

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final k(Lcom/google/android/gms/internal/ads/w0;)V
    .locals 6

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/B3;->b:I

    and-int/lit8 v0, v0, 0x20

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/B3;->a:Lcom/google/android/gms/internal/ads/q4;

    new-instance v1, Lcom/google/android/gms/internal/ads/t4;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/t4;-><init>(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/q4;)V

    move-object p1, v1

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->F:Lcom/google/android/gms/internal/ads/w0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/B3;->g()V

    const/4 p1, 0x2

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/a1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->G:[Lcom/google/android/gms/internal/ads/a1;

    iget v0, p0, Lcom/google/android/gms/internal/ads/B3;->b:I

    and-int/lit8 v0, v0, 0x4

    const/16 v1, 0x64

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/B3;->F:Lcom/google/android/gms/internal/ads/w0;

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object v0

    aput-object v0, p1, v2

    const/4 p1, 0x1

    const/16 v1, 0x65

    goto :goto_0

    :cond_1
    move p1, v2

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/B3;->G:[Lcom/google/android/gms/internal/ads/a1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/EW;->n([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/gms/internal/ads/a1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->G:[Lcom/google/android/gms/internal/ads/a1;

    array-length v0, p1

    move v3, v2

    :goto_1
    if-ge v3, v0, :cond_2

    aget-object v4, p1, v3

    sget-object v5, Lcom/google/android/gms/internal/ads/B3;->K:Lcom/google/android/gms/internal/ads/D;

    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/a1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->H:[Lcom/google/android/gms/internal/ads/a1;

    :goto_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->H:[Lcom/google/android/gms/internal/ads/a1;

    array-length p1, p1

    if-ge v2, p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/B3;->F:Lcom/google/android/gms/internal/ads/w0;

    add-int/lit8 v0, v1, 0x1

    const/4 v3, 0x3

    invoke-interface {p1, v1, v3}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/B3;->c:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/D;

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/B3;->H:[Lcom/google/android/gms/internal/ads/a1;

    aput-object p1, v1, v2

    add-int/lit8 v2, v2, 0x1

    move v1, v0

    goto :goto_2

    :cond_3
    return-void
.end method
