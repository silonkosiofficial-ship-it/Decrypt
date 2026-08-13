.class final Lcom/google/android/gms/internal/ads/sB0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final u:Lcom/google/android/gms/internal/ads/LH0;


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/qm;

.field public final b:Lcom/google/android/gms/internal/ads/LH0;

.field public final c:J

.field public final d:J

.field public final e:I

.field public final f:Lcom/google/android/gms/internal/ads/Qz0;

.field public final g:Z

.field public final h:Lcom/google/android/gms/internal/ads/PI0;

.field public final i:Lcom/google/android/gms/internal/ads/QJ0;

.field public final j:Ljava/util/List;

.field public final k:Lcom/google/android/gms/internal/ads/LH0;

.field public final l:Z

.field public final m:I

.field public final n:I

.field public final o:Lcom/google/android/gms/internal/ads/qg;

.field public final p:Z

.field public volatile q:J

.field public volatile r:J

.field public volatile s:J

.field public volatile t:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/LH0;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/LH0;-><init>(Ljava/lang/Object;J)V

    sput-object v0, Lcom/google/android/gms/internal/ads/sB0;->u:Lcom/google/android/gms/internal/ads/LH0;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJILcom/google/android/gms/internal/ads/Qz0;ZLcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;Ljava/util/List;Lcom/google/android/gms/internal/ads/LH0;ZIILcom/google/android/gms/internal/ads/qg;JJJJZ)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    move-object v1, p2

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    move-wide v1, p3

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->c:J

    move-wide v1, p5

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->d:J

    move v1, p7

    iput v1, v0, Lcom/google/android/gms/internal/ads/sB0;->e:I

    move-object v1, p8

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->f:Lcom/google/android/gms/internal/ads/Qz0;

    move v1, p9

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/sB0;->g:Z

    move-object v1, p10

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->h:Lcom/google/android/gms/internal/ads/PI0;

    move-object v1, p11

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->i:Lcom/google/android/gms/internal/ads/QJ0;

    move-object v1, p12

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->j:Ljava/util/List;

    move-object/from16 v1, p13

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->k:Lcom/google/android/gms/internal/ads/LH0;

    move/from16 v1, p14

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    move/from16 v1, p15

    iput v1, v0, Lcom/google/android/gms/internal/ads/sB0;->m:I

    move/from16 v1, p16

    iput v1, v0, Lcom/google/android/gms/internal/ads/sB0;->n:I

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    move-wide/from16 v1, p18

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->q:J

    move-wide/from16 v1, p20

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->r:J

    move-wide/from16 v1, p22

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    move-wide/from16 v1, p24

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->t:J

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/sB0;->p:Z

    return-void
.end method

.method public static g(Lcom/google/android/gms/internal/ads/QJ0;)Lcom/google/android/gms/internal/ads/sB0;
    .locals 28

    move-object/from16 v11, p0

    new-instance v27, Lcom/google/android/gms/internal/ads/sB0;

    move-object/from16 v0, v27

    sget-object v1, Lcom/google/android/gms/internal/ads/qm;->a:Lcom/google/android/gms/internal/ads/qm;

    sget-object v13, Lcom/google/android/gms/internal/ads/sB0;->u:Lcom/google/android/gms/internal/ads/LH0;

    move-object v2, v13

    sget-object v10, Lcom/google/android/gms/internal/ads/PI0;->d:Lcom/google/android/gms/internal/ads/PI0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v12

    sget-object v17, Lcom/google/android/gms/internal/ads/qg;->d:Lcom/google/android/gms/internal/ads/qg;

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    invoke-direct/range {v0 .. v26}, Lcom/google/android/gms/internal/ads/sB0;-><init>(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJILcom/google/android/gms/internal/ads/Qz0;ZLcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;Ljava/util/List;Lcom/google/android/gms/internal/ads/LH0;ZIILcom/google/android/gms/internal/ads/qg;JJJJZ)V

    return-object v27
.end method

.method public static h()Lcom/google/android/gms/internal/ads/LH0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/sB0;->u:Lcom/google/android/gms/internal/ads/LH0;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/sB0;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    new-instance v28, Lcom/google/android/gms/internal/ads/sB0;

    move-object/from16 v1, v28

    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    iget v2, v0, Lcom/google/android/gms/internal/ads/sB0;->m:I

    move/from16 v16, v2

    iget v2, v0, Lcom/google/android/gms/internal/ads/sB0;->n:I

    move/from16 v17, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    move-object/from16 v18, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->q:J

    move-wide/from16 v19, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->r:J

    move-wide/from16 v21, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    move-wide/from16 v23, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->t:J

    move-wide/from16 v25, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/sB0;->c:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/sB0;->d:J

    iget v8, v0, Lcom/google/android/gms/internal/ads/sB0;->e:I

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/sB0;->f:Lcom/google/android/gms/internal/ads/Qz0;

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/sB0;->g:Z

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/sB0;->h:Lcom/google/android/gms/internal/ads/PI0;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/sB0;->i:Lcom/google/android/gms/internal/ads/QJ0;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/sB0;->j:Ljava/util/List;

    const/16 v27, 0x0

    invoke-direct/range {v1 .. v27}, Lcom/google/android/gms/internal/ads/sB0;-><init>(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJILcom/google/android/gms/internal/ads/Qz0;ZLcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;Ljava/util/List;Lcom/google/android/gms/internal/ads/LH0;ZIILcom/google/android/gms/internal/ads/qg;JJJJZ)V

    return-object v28
.end method

.method public final b(Lcom/google/android/gms/internal/ads/LH0;JJJJLcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;Ljava/util/List;)Lcom/google/android/gms/internal/ads/sB0;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-wide/from16 v23, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v21, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    new-instance v28, Lcom/google/android/gms/internal/ads/sB0;

    move-object/from16 v1, v28

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/sB0;->k:Lcom/google/android/gms/internal/ads/LH0;

    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    iget v2, v0, Lcom/google/android/gms/internal/ads/sB0;->m:I

    move/from16 v16, v2

    iget v2, v0, Lcom/google/android/gms/internal/ads/sB0;->n:I

    move/from16 v17, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    move-object/from16 v18, v2

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/sB0;->q:J

    move-wide/from16 v19, v8

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v25

    iget v8, v0, Lcom/google/android/gms/internal/ads/sB0;->e:I

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/sB0;->f:Lcom/google/android/gms/internal/ads/Qz0;

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/sB0;->g:Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    const/16 v27, 0x0

    invoke-direct/range {v1 .. v27}, Lcom/google/android/gms/internal/ads/sB0;-><init>(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJILcom/google/android/gms/internal/ads/Qz0;ZLcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;Ljava/util/List;Lcom/google/android/gms/internal/ads/LH0;ZIILcom/google/android/gms/internal/ads/qg;JJJJZ)V

    return-object v28
.end method

.method public final c(ZII)Lcom/google/android/gms/internal/ads/sB0;
    .locals 29

    move-object/from16 v0, p0

    move/from16 v15, p1

    move/from16 v16, p2

    move/from16 v17, p3

    new-instance v28, Lcom/google/android/gms/internal/ads/sB0;

    move-object/from16 v1, v28

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    move-object/from16 v18, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->q:J

    move-wide/from16 v19, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->r:J

    move-wide/from16 v21, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    move-wide/from16 v23, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->t:J

    move-wide/from16 v25, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/sB0;->c:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/sB0;->d:J

    iget v8, v0, Lcom/google/android/gms/internal/ads/sB0;->e:I

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/sB0;->f:Lcom/google/android/gms/internal/ads/Qz0;

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/sB0;->g:Z

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/sB0;->h:Lcom/google/android/gms/internal/ads/PI0;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/sB0;->i:Lcom/google/android/gms/internal/ads/QJ0;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/sB0;->j:Ljava/util/List;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/sB0;->k:Lcom/google/android/gms/internal/ads/LH0;

    const/16 v27, 0x0

    invoke-direct/range {v1 .. v27}, Lcom/google/android/gms/internal/ads/sB0;-><init>(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJILcom/google/android/gms/internal/ads/Qz0;ZLcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;Ljava/util/List;Lcom/google/android/gms/internal/ads/LH0;ZIILcom/google/android/gms/internal/ads/qg;JJJJZ)V

    return-object v28
.end method

.method public final d(Lcom/google/android/gms/internal/ads/Qz0;)Lcom/google/android/gms/internal/ads/sB0;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    new-instance v28, Lcom/google/android/gms/internal/ads/sB0;

    move-object/from16 v1, v28

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/sB0;->g:Z

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/sB0;->h:Lcom/google/android/gms/internal/ads/PI0;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/sB0;->i:Lcom/google/android/gms/internal/ads/QJ0;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/sB0;->j:Ljava/util/List;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/sB0;->k:Lcom/google/android/gms/internal/ads/LH0;

    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    iget v2, v0, Lcom/google/android/gms/internal/ads/sB0;->m:I

    move/from16 v16, v2

    iget v2, v0, Lcom/google/android/gms/internal/ads/sB0;->n:I

    move/from16 v17, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    move-object/from16 v18, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->q:J

    move-wide/from16 v19, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->r:J

    move-wide/from16 v21, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    move-wide/from16 v23, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->t:J

    move-wide/from16 v25, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/sB0;->c:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/sB0;->d:J

    iget v8, v0, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/16 v27, 0x0

    invoke-direct/range {v1 .. v27}, Lcom/google/android/gms/internal/ads/sB0;-><init>(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJILcom/google/android/gms/internal/ads/Qz0;ZLcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;Ljava/util/List;Lcom/google/android/gms/internal/ads/LH0;ZIILcom/google/android/gms/internal/ads/qg;JJJJZ)V

    return-object v28
.end method

.method public final e(I)Lcom/google/android/gms/internal/ads/sB0;
    .locals 29

    move-object/from16 v0, p0

    move/from16 v8, p1

    new-instance v28, Lcom/google/android/gms/internal/ads/sB0;

    move-object/from16 v1, v28

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/sB0;->f:Lcom/google/android/gms/internal/ads/Qz0;

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/sB0;->g:Z

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/sB0;->h:Lcom/google/android/gms/internal/ads/PI0;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/sB0;->i:Lcom/google/android/gms/internal/ads/QJ0;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/sB0;->j:Ljava/util/List;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/sB0;->k:Lcom/google/android/gms/internal/ads/LH0;

    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    iget v2, v0, Lcom/google/android/gms/internal/ads/sB0;->m:I

    move/from16 v16, v2

    iget v2, v0, Lcom/google/android/gms/internal/ads/sB0;->n:I

    move/from16 v17, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    move-object/from16 v18, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->q:J

    move-wide/from16 v19, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->r:J

    move-wide/from16 v21, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    move-wide/from16 v23, v2

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->t:J

    move-wide/from16 v25, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/sB0;->c:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/sB0;->d:J

    const/16 v27, 0x0

    invoke-direct/range {v1 .. v27}, Lcom/google/android/gms/internal/ads/sB0;-><init>(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJILcom/google/android/gms/internal/ads/Qz0;ZLcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;Ljava/util/List;Lcom/google/android/gms/internal/ads/LH0;ZIILcom/google/android/gms/internal/ads/qg;JJJJZ)V

    return-object v28
.end method

.method public final f(Lcom/google/android/gms/internal/ads/qm;)Lcom/google/android/gms/internal/ads/sB0;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    new-instance v28, Lcom/google/android/gms/internal/ads/sB0;

    move-object/from16 v1, v28

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/sB0;->c:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/sB0;->d:J

    iget v8, v0, Lcom/google/android/gms/internal/ads/sB0;->e:I

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/sB0;->f:Lcom/google/android/gms/internal/ads/Qz0;

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/sB0;->g:Z

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/sB0;->h:Lcom/google/android/gms/internal/ads/PI0;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/sB0;->i:Lcom/google/android/gms/internal/ads/QJ0;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/sB0;->j:Ljava/util/List;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/sB0;->k:Lcom/google/android/gms/internal/ads/LH0;

    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lcom/google/android/gms/internal/ads/sB0;->m:I

    move/from16 v16, v1

    iget v1, v0, Lcom/google/android/gms/internal/ads/sB0;->n:I

    move/from16 v17, v1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    move-object/from16 v18, v1

    move-object/from16 v29, v2

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->q:J

    move-wide/from16 v19, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->r:J

    move-wide/from16 v21, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    move-wide/from16 v23, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->t:J

    move-wide/from16 v25, v1

    const/16 v27, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, v29

    invoke-direct/range {v1 .. v27}, Lcom/google/android/gms/internal/ads/sB0;-><init>(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJILcom/google/android/gms/internal/ads/Qz0;ZLcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;Ljava/util/List;Lcom/google/android/gms/internal/ads/LH0;ZIILcom/google/android/gms/internal/ads/qg;JJJJZ)V

    return-object v28
.end method

.method public final i()Z
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/sB0;->n:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
