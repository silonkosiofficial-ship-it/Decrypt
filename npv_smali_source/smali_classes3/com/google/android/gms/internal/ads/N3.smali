.class public final Lcom/google/android/gms/internal/ads/N3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:Lcom/google/android/gms/internal/ads/D;

.field public final h:I

.field public final i:[J

.field public final j:[J

.field public final k:I

.field private final l:[Lcom/google/android/gms/internal/ads/O3;


# direct methods
.method public constructor <init>(IIJJJJLcom/google/android/gms/internal/ads/D;I[Lcom/google/android/gms/internal/ads/O3;I[J[J)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p1

    iput v1, v0, Lcom/google/android/gms/internal/ads/N3;->a:I

    move v1, p2

    iput v1, v0, Lcom/google/android/gms/internal/ads/N3;->b:I

    move-wide v1, p3

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/N3;->c:J

    move-wide v1, p5

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/N3;->d:J

    move-wide v1, p7

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/N3;->e:J

    move-wide v1, p9

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/N3;->f:J

    move-object v1, p11

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/N3;->g:Lcom/google/android/gms/internal/ads/D;

    move v1, p12

    iput v1, v0, Lcom/google/android/gms/internal/ads/N3;->h:I

    move-object/from16 v1, p13

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/N3;->l:[Lcom/google/android/gms/internal/ads/O3;

    move/from16 v1, p14

    iput v1, v0, Lcom/google/android/gms/internal/ads/N3;->k:I

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/N3;->i:[J

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/N3;->j:[J

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/D;)Lcom/google/android/gms/internal/ads/N3;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    iget v13, v0, Lcom/google/android/gms/internal/ads/N3;->h:I

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/N3;->l:[Lcom/google/android/gms/internal/ads/O3;

    iget v15, v0, Lcom/google/android/gms/internal/ads/N3;->k:I

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/N3;->i:[J

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/N3;->j:[J

    move-object/from16 v17, v1

    new-instance v18, Lcom/google/android/gms/internal/ads/N3;

    move-object/from16 v1, v18

    iget v2, v0, Lcom/google/android/gms/internal/ads/N3;->a:I

    iget v3, v0, Lcom/google/android/gms/internal/ads/N3;->b:I

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/N3;->c:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/N3;->d:J

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/N3;->e:J

    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/N3;->f:J

    invoke-direct/range {v1 .. v17}, Lcom/google/android/gms/internal/ads/N3;-><init>(IIJJJJLcom/google/android/gms/internal/ads/D;I[Lcom/google/android/gms/internal/ads/O3;I[J[J)V

    return-object v18
.end method

.method public final b(I)Lcom/google/android/gms/internal/ads/O3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/N3;->l:[Lcom/google/android/gms/internal/ads/O3;

    aget-object p1, v0, p1

    return-object p1
.end method
