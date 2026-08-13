.class final Lcom/google/android/gms/internal/ads/SA0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lcom/google/android/gms/internal/ads/IH0;
.implements Lcom/google/android/gms/internal/ads/OJ0;
.implements Lcom/google/android/gms/internal/ads/pB0;
.implements Lcom/google/android/gms/internal/ads/Nz0;
.implements Lcom/google/android/gms/internal/ads/uB0;


# static fields
.field private static final v0:J


# instance fields
.field private final C:[Lcom/google/android/gms/internal/ads/FB0;

.field private final D:[Lcom/google/android/gms/internal/ads/DB0;

.field private final E:[Z

.field private final F:Lcom/google/android/gms/internal/ads/PJ0;

.field private final G:Lcom/google/android/gms/internal/ads/QJ0;

.field private final H:Lcom/google/android/gms/internal/ads/WA0;

.field private final I:Lcom/google/android/gms/internal/ads/XJ0;

.field private final J:Lcom/google/android/gms/internal/ads/xI;

.field private final K:Lcom/google/android/gms/internal/ads/tB0;

.field private final L:Landroid/os/Looper;

.field private final M:Lcom/google/android/gms/internal/ads/Ql;

.field private final N:Lcom/google/android/gms/internal/ads/pl;

.field private final O:J

.field private final P:Lcom/google/android/gms/internal/ads/Pz0;

.field private final Q:Ljava/util/ArrayList;

.field private final R:Lcom/google/android/gms/internal/ads/mD;

.field private final S:Lcom/google/android/gms/internal/ads/eB0;

.field private final T:Lcom/google/android/gms/internal/ads/rB0;

.field private final U:J

.field private final V:Lcom/google/android/gms/internal/ads/bE0;

.field private final W:Lcom/google/android/gms/internal/ads/KB0;

.field private final X:Lcom/google/android/gms/internal/ads/xI;

.field private Y:Lcom/google/android/gms/internal/ads/GB0;

.field private Z:Lcom/google/android/gms/internal/ads/sB0;

.field private a0:Lcom/google/android/gms/internal/ads/OA0;

.field private b0:Z

.field private c0:Z

.field private d0:Z

.field private e0:Z

.field private f0:J

.field private g0:Z

.field private h0:I

.field private i0:Z

.field private j0:Z

.field private k0:I

.field private l0:Lcom/google/android/gms/internal/ads/QA0;

.field private m0:J

.field private n0:J

.field private o0:I

.field private p0:Z

.field private q0:Lcom/google/android/gms/internal/ads/Qz0;

.field private r0:J

.field private s0:Lcom/google/android/gms/internal/ads/aA0;

.field private final t0:Lcom/google/android/gms/internal/ads/mA0;

.field private final u0:Lcom/google/android/gms/internal/ads/Jz0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x2710

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/EW;->N(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/internal/ads/SA0;->v0:J

    return-void
.end method

.method public constructor <init>([Lcom/google/android/gms/internal/ads/AB0;Lcom/google/android/gms/internal/ads/PJ0;Lcom/google/android/gms/internal/ads/QJ0;Lcom/google/android/gms/internal/ads/WA0;Lcom/google/android/gms/internal/ads/XJ0;IZLcom/google/android/gms/internal/ads/KB0;Lcom/google/android/gms/internal/ads/GB0;Lcom/google/android/gms/internal/ads/Jz0;JZZLandroid/os/Looper;Lcom/google/android/gms/internal/ads/mD;Lcom/google/android/gms/internal/ads/mA0;Lcom/google/android/gms/internal/ads/bE0;Lcom/google/android/gms/internal/ads/tB0;Lcom/google/android/gms/internal/ads/aA0;)V
    .locals 15

    .prologue
    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p8

    move-object/from16 v6, p16

    move-object/from16 v7, p18

    move-object/from16 v8, p20

    const/4 v9, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v10, p17

    iput-object v10, v0, Lcom/google/android/gms/internal/ads/SA0;->t0:Lcom/google/android/gms/internal/ads/mA0;

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/SA0;->F:Lcom/google/android/gms/internal/ads/PJ0;

    move-object/from16 v10, p3

    iput-object v10, v0, Lcom/google/android/gms/internal/ads/SA0;->G:Lcom/google/android/gms/internal/ads/QJ0;

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/SA0;->H:Lcom/google/android/gms/internal/ads/WA0;

    iput-object v4, v0, Lcom/google/android/gms/internal/ads/SA0;->I:Lcom/google/android/gms/internal/ads/XJ0;

    const/4 v11, 0x0

    iput v11, v0, Lcom/google/android/gms/internal/ads/SA0;->h0:I

    iput-boolean v11, v0, Lcom/google/android/gms/internal/ads/SA0;->i0:Z

    move-object/from16 v12, p9

    iput-object v12, v0, Lcom/google/android/gms/internal/ads/SA0;->Y:Lcom/google/android/gms/internal/ads/GB0;

    move-object/from16 v12, p10

    iput-object v12, v0, Lcom/google/android/gms/internal/ads/SA0;->u0:Lcom/google/android/gms/internal/ads/Jz0;

    move-wide/from16 v12, p11

    iput-wide v12, v0, Lcom/google/android/gms/internal/ads/SA0;->U:J

    iput-boolean v11, v0, Lcom/google/android/gms/internal/ads/SA0;->c0:Z

    iput-object v6, v0, Lcom/google/android/gms/internal/ads/SA0;->R:Lcom/google/android/gms/internal/ads/mD;

    iput-object v7, v0, Lcom/google/android/gms/internal/ads/SA0;->V:Lcom/google/android/gms/internal/ads/bE0;

    iput-object v8, v0, Lcom/google/android/gms/internal/ads/SA0;->s0:Lcom/google/android/gms/internal/ads/aA0;

    iput-object v5, v0, Lcom/google/android/gms/internal/ads/SA0;->W:Lcom/google/android/gms/internal/ads/KB0;

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v12, v0, Lcom/google/android/gms/internal/ads/SA0;->r0:J

    iput-wide v12, v0, Lcom/google/android/gms/internal/ads/SA0;->f0:J

    invoke-interface {v3, v7}, Lcom/google/android/gms/internal/ads/WA0;->f(Lcom/google/android/gms/internal/ads/bE0;)J

    move-result-wide v12

    iput-wide v12, v0, Lcom/google/android/gms/internal/ads/SA0;->O:J

    invoke-interface {v3, v7}, Lcom/google/android/gms/internal/ads/WA0;->a(Lcom/google/android/gms/internal/ads/bE0;)Z

    sget-object v3, Lcom/google/android/gms/internal/ads/qm;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/sB0;->g(Lcom/google/android/gms/internal/ads/QJ0;)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v3

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    new-instance v10, Lcom/google/android/gms/internal/ads/OA0;

    invoke-direct {v10, v3}, Lcom/google/android/gms/internal/ads/OA0;-><init>(Lcom/google/android/gms/internal/ads/sB0;)V

    iput-object v10, v0, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    array-length v3, v1

    const/4 v3, 0x2

    new-array v10, v3, [Lcom/google/android/gms/internal/ads/DB0;

    iput-object v10, v0, Lcom/google/android/gms/internal/ads/SA0;->D:[Lcom/google/android/gms/internal/ads/DB0;

    new-array v10, v3, [Z

    iput-object v10, v0, Lcom/google/android/gms/internal/ads/SA0;->E:[Z

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/PJ0;->b()Lcom/google/android/gms/internal/ads/CB0;

    move-result-object v10

    new-array v12, v3, [Lcom/google/android/gms/internal/ads/FB0;

    iput-object v12, v0, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    :goto_0
    if-ge v11, v3, :cond_0

    aget-object v12, v1, v11

    invoke-interface {v12, v11, v7, v6}, Lcom/google/android/gms/internal/ads/AB0;->r(ILcom/google/android/gms/internal/ads/bE0;Lcom/google/android/gms/internal/ads/mD;)V

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/SA0;->D:[Lcom/google/android/gms/internal/ads/DB0;

    aget-object v13, v1, v11

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/AB0;->m()Lcom/google/android/gms/internal/ads/DB0;

    move-result-object v13

    aput-object v13, v12, v11

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/SA0;->D:[Lcom/google/android/gms/internal/ads/DB0;

    aget-object v12, v12, v11

    invoke-interface {v12, v10}, Lcom/google/android/gms/internal/ads/DB0;->o(Lcom/google/android/gms/internal/ads/CB0;)V

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    new-instance v13, Lcom/google/android/gms/internal/ads/FB0;

    aget-object v14, v1, v11

    invoke-direct {v13, v14, v11}, Lcom/google/android/gms/internal/ads/FB0;-><init>(Lcom/google/android/gms/internal/ads/AB0;I)V

    aput-object v13, v12, v11

    add-int/2addr v11, v9

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/Pz0;

    invoke-direct {v1, p0, v6}, Lcom/google/android/gms/internal/ads/Pz0;-><init>(Lcom/google/android/gms/internal/ads/Nz0;Lcom/google/android/gms/internal/ads/mD;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->Q:Ljava/util/ArrayList;

    new-instance v1, Lcom/google/android/gms/internal/ads/Ql;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Ql;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    new-instance v1, Lcom/google/android/gms/internal/ads/pl;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/pl;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v2, p0, v4}, Lcom/google/android/gms/internal/ads/PJ0;->i(Lcom/google/android/gms/internal/ads/OJ0;Lcom/google/android/gms/internal/ads/XJ0;)V

    iput-boolean v9, v0, Lcom/google/android/gms/internal/ads/SA0;->p0:Z

    const/4 v1, 0x0

    move-object/from16 v2, p15

    invoke-interface {v6, v2, v1}, Lcom/google/android/gms/internal/ads/mD;->d(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lcom/google/android/gms/internal/ads/xI;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/SA0;->X:Lcom/google/android/gms/internal/ads/xI;

    new-instance v3, Lcom/google/android/gms/internal/ads/eB0;

    new-instance v4, Lcom/google/android/gms/internal/ads/JA0;

    invoke-direct {v4, p0}, Lcom/google/android/gms/internal/ads/JA0;-><init>(Lcom/google/android/gms/internal/ads/SA0;)V

    invoke-direct {v3, v5, v2, v4, v8}, Lcom/google/android/gms/internal/ads/eB0;-><init>(Lcom/google/android/gms/internal/ads/KB0;Lcom/google/android/gms/internal/ads/xI;Lcom/google/android/gms/internal/ads/JA0;Lcom/google/android/gms/internal/ads/aA0;)V

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    new-instance v3, Lcom/google/android/gms/internal/ads/rB0;

    invoke-direct {v3, p0, v5, v2, v7}, Lcom/google/android/gms/internal/ads/rB0;-><init>(Lcom/google/android/gms/internal/ads/pB0;Lcom/google/android/gms/internal/ads/KB0;Lcom/google/android/gms/internal/ads/xI;Lcom/google/android/gms/internal/ads/bE0;)V

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/SA0;->T:Lcom/google/android/gms/internal/ads/rB0;

    new-instance v2, Lcom/google/android/gms/internal/ads/tB0;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/tB0;-><init>(Landroid/os/Looper;)V

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/SA0;->K:Lcom/google/android/gms/internal/ads/tB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/tB0;->a()Landroid/os/Looper;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->L:Landroid/os/Looper;

    invoke-interface {v6, v1, p0}, Lcom/google/android/gms/internal/ads/mD;->d(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lcom/google/android/gms/internal/ads/xI;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    return-void
.end method

.method private final A(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/qm;)V
    .locals 0

    .prologue
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->Q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    if-gez p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->Q:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-void

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/SA0;->Q:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final B(J)V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v0, v0, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->R()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x3e8

    goto :goto_0

    :cond_0
    sget-wide v0, Lcom/google/android/gms/internal/ads/SA0;->v0:J

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/4 v3, 0x2

    add-long/2addr p1, v0

    invoke-interface {v2, v3, p1, p2}, Lcom/google/android/gms/internal/ads/xI;->m(IJ)Z

    return-void
.end method

.method private final C(Z)V
    .locals 11

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v3, v1, Lcom/google/android/gms/internal/ads/sB0;->s:J

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/SA0;->n0(Lcom/google/android/gms/internal/ads/LH0;JZZ)J

    move-result-wide v3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/sB0;->s:J

    cmp-long v1, v3, v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v5, v1, Lcom/google/android/gms/internal/ads/sB0;->c:J

    iget-wide v7, v1, Lcom/google/android/gms/internal/ads/sB0;->d:J

    const/4 v10, 0x5

    move-object v1, p0

    move-object v2, v0

    move v9, p1

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/SA0;->c(Lcom/google/android/gms/internal/ads/LH0;JJJZI)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    :cond_0
    return-void
.end method

.method private final D(Lcom/google/android/gms/internal/ads/qg;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/16 v1, 0x10

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/xI;->k(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Pz0;->Q(Lcom/google/android/gms/internal/ads/qg;)V

    return-void
.end method

.method private final E(ZIZI)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/OA0;->a(I)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-virtual {p3, p1, p4, p2}, Lcom/google/android/gms/internal/ads/sB0;->c(ZII)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    const/4 p1, 0x0

    invoke-direct {p0, p1, p1}, Lcom/google/android/gms/internal/ads/SA0;->N(ZZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object p2

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object p3

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    array-length p4, p3

    move v0, p1

    :goto_1
    if-ge v0, p4, :cond_0

    aget-object v1, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->R()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->I()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->L()V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget p1, p1, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/4 p2, 0x3

    const/4 p3, 0x2

    if-ne p1, p2, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Pz0;->g()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->G()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    invoke-interface {p1, p3}, Lcom/google/android/gms/internal/ads/xI;->K(I)Z

    return-void

    :cond_3
    if-ne p1, p3, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    invoke-interface {p1, p3}, Lcom/google/android/gms/internal/ads/xI;->K(I)Z

    :cond_4
    return-void
.end method

.method private final F(I)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v1, v0, Lcom/google/android/gms/internal/ads/sB0;->e:I

    if-eq v1, p1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/SA0;->r0:J

    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sB0;->e(I)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    :cond_1
    return-void
.end method

.method private final G()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/QJ0;->b(I)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/FB0;->s()V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private final H(ZZ)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/SA0;->j0:Z

    if-nez p1, :cond_1

    :cond_0
    move p1, v1

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_0
    invoke-direct {p0, p1, v0, v1, v0}, Lcom/google/android/gms/internal/ads/SA0;->x(ZZZZ)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/OA0;->a(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->H:Lcom/google/android/gms/internal/ads/WA0;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/SA0;->V:Lcom/google/android/gms/internal/ads/bE0;

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/WA0;->g(Lcom/google/android/gms/internal/ads/bE0;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/SA0;->F(I)V

    return-void
.end method

.method private final I()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Pz0;->h()V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    const/4 v2, 0x2

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/FB0;->t()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final J()V
    .locals 32

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->o()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/SA0;->g0:Z

    const/4 v3, 0x1

    if-nez v2, :cond_0

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/JH0;->q()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    move v13, v3

    goto :goto_0

    :cond_1
    move v13, v2

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/sB0;->g:Z

    if-eq v13, v2, :cond_2

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v7, v1, Lcom/google/android/gms/internal/ads/sB0;->c:J

    iget-wide v9, v1, Lcom/google/android/gms/internal/ads/sB0;->d:J

    iget v11, v1, Lcom/google/android/gms/internal/ads/sB0;->e:I

    iget-object v12, v1, Lcom/google/android/gms/internal/ads/sB0;->f:Lcom/google/android/gms/internal/ads/Qz0;

    iget-object v14, v1, Lcom/google/android/gms/internal/ads/sB0;->h:Lcom/google/android/gms/internal/ads/PI0;

    iget-object v15, v1, Lcom/google/android/gms/internal/ads/sB0;->i:Lcom/google/android/gms/internal/ads/QJ0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/sB0;->j:Ljava/util/List;

    move-object/from16 v16, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/sB0;->k:Lcom/google/android/gms/internal/ads/LH0;

    move-object/from16 v17, v2

    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    move/from16 v18, v2

    iget v2, v1, Lcom/google/android/gms/internal/ads/sB0;->m:I

    move/from16 v19, v2

    iget v2, v1, Lcom/google/android/gms/internal/ads/sB0;->n:I

    move/from16 v20, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    move-object/from16 v21, v2

    new-instance v2, Lcom/google/android/gms/internal/ads/sB0;

    move-object v4, v2

    move-object/from16 v31, v2

    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/sB0;->q:J

    move-wide/from16 v22, v2

    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/sB0;->r:J

    move-wide/from16 v24, v2

    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/sB0;->s:J

    move-wide/from16 v26, v2

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/sB0;->t:J

    move-wide/from16 v28, v1

    const/16 v30, 0x0

    invoke-direct/range {v4 .. v30}, Lcom/google/android/gms/internal/ads/sB0;-><init>(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJILcom/google/android/gms/internal/ads/Qz0;ZLcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;Ljava/util/List;Lcom/google/android/gms/internal/ads/LH0;ZIILcom/google/android/gms/internal/ads/qg;JJJJZ)V

    move-object/from16 v1, v31

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    :cond_2
    return-void
.end method

.method private final K(Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;)V
    .locals 17

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->o()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    if-ne v1, v2, :cond_0

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v4

    :goto_0
    sub-long/2addr v2, v4

    move-wide v8, v2

    goto :goto_1

    :cond_0
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v4, v4, Lcom/google/android/gms/internal/ads/cB0;->b:J

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->c()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/SA0;->l0(J)J

    move-result-wide v10

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/SA0;->S(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->u0:Lcom/google/android/gms/internal/ads/Jz0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Jz0;->b()J

    move-result-wide v1

    :goto_2
    move-wide v15, v1

    goto :goto_3

    :cond_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_2

    :goto_3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->H:Lcom/google/android/gms/internal/ads/WA0;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/SA0;->V:Lcom/google/android/gms/internal/ads/bE0;

    new-instance v2, Lcom/google/android/gms/internal/ads/VA0;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v6, v3, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Pz0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v3

    iget v12, v3, Lcom/google/android/gms/internal/ads/qg;->a:F

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-boolean v13, v3, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    iget-boolean v14, v0, Lcom/google/android/gms/internal/ads/SA0;->e0:Z

    move-object v4, v2

    move-object/from16 v7, p1

    invoke-direct/range {v4 .. v16}, Lcom/google/android/gms/internal/ads/VA0;-><init>(Lcom/google/android/gms/internal/ads/bE0;Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJFZZJ)V

    move-object/from16 v3, p3

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    move-object/from16 v4, p2

    invoke-interface {v1, v2, v4, v3}, Lcom/google/android/gms/internal/ads/WA0;->c(Lcom/google/android/gms/internal/ads/VA0;Lcom/google/android/gms/internal/ads/PI0;[Lcom/google/android/gms/internal/ads/IJ0;)V

    return-void
.end method

.method private final L()V
    .locals 11

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/JH0;->f()J

    move-result-wide v4

    move-wide v6, v4

    goto :goto_0

    :cond_1
    move-wide v6, v2

    :goto_0
    cmp-long v1, v6, v2

    const/4 v10, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->s()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/eB0;->F(Lcom/google/android/gms/internal/ads/bB0;)Z

    invoke-direct {p0, v10}, Lcom/google/android/gms/internal/ads/SA0;->m(Z)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->q()V

    :cond_2
    invoke-direct {p0, v6, v7}, Lcom/google/android/gms/internal/ads/SA0;->z(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    cmp-long v0, v6, v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/sB0;->c:J

    const/4 v8, 0x1

    const/4 v9, 0x5

    :goto_1
    move-object v0, p0

    move-wide v2, v6

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/ads/SA0;->c(Lcom/google/android/gms/internal/ads/LH0;JJJZI)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    goto/16 :goto_4

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    const/4 v3, 0x1

    if-eq v0, v2, :cond_4

    move v2, v3

    goto :goto_2

    :cond_4
    move v2, v10

    :goto_2
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/Pz0;->b(Z)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v4

    sub-long v6, v1, v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/SA0;->p0:Z

    if-eqz v0, :cond_6

    iput-boolean v10, p0, Lcom/google/android/gms/internal/ads/SA0;->p0:Z

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    iget v0, p0, Lcom/google/android/gms/internal/ads/SA0;->o0:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-lez v0, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Q:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_8

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    :cond_8
    iput v0, p0, Lcom/google/android/gms/internal/ads/SA0;->o0:I

    :cond_9
    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Pz0;->j()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/OA0;->d:Z

    xor-int/lit8 v8, v0, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/sB0;->c:J

    const/4 v9, 0x6

    goto/16 :goto_1

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iput-wide v6, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->t:J

    :cond_b
    :goto_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->o()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->c()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/google/android/gms/internal/ads/sB0;->q:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->k0()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->r:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    if-eqz v1, :cond_c

    iget v1, v0, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_c

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/ads/SA0;->S(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    iget v1, v1, Lcom/google/android/gms/internal/ads/qg;->a:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_c

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->u0:Lcom/google/android/gms/internal/ads/Jz0;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    invoke-direct {p0, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/SA0;->j0(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;J)J

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/sB0;->r:J

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/Jz0;->a(JJ)F

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Pz0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/internal/ads/qg;->a:F

    cmpl-float v1, v1, v0

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    iget v1, v1, Lcom/google/android/gms/internal/ads/qg;->b:F

    new-instance v2, Lcom/google/android/gms/internal/ads/qg;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/qg;-><init>(FF)V

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/SA0;->D(Lcom/google/android/gms/internal/ads/qg;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Pz0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/internal/ads/qg;->a:F

    invoke-direct {p0, v0, v1, v10, v10}, Lcom/google/android/gms/internal/ads/SA0;->p(Lcom/google/android/gms/internal/ads/qg;FZZ)V

    :cond_c
    :goto_5
    return-void
.end method

.method private final M(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JZ)V
    .locals 5

    .prologue
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/SA0;->S(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/qg;->d:Lcom/google/android/gms/internal/ads/qg;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Pz0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/qg;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/SA0;->D(Lcom/google/android/gms/internal/ads/qg;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    iget p1, p1, Lcom/google/android/gms/internal/ads/qg;->a:F

    const/4 p3, 0x0

    invoke-direct {p0, p2, p1, p3, p3}, Lcom/google/android/gms/internal/ads/SA0;->p(Lcom/google/android/gms/internal/ads/qg;FZZ)V

    return-void

    :cond_1
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/ads/pl;->c:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    const-wide/16 v2, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->u0:Lcom/google/android/gms/internal/ads/Jz0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/Ql;->i:Lcom/google/android/gms/internal/ads/N4;

    sget v4, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Jz0;->d(Lcom/google/android/gms/internal/ads/N4;)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, p5, v0

    if-eqz v4, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/SA0;->u0:Lcom/google/android/gms/internal/ads/Jz0;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-direct {p0, p1, p2, p5, p6}, Lcom/google/android/gms/internal/ads/SA0;->j0(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;J)J

    move-result-wide p1

    invoke-virtual {p3, p1, p2}, Lcom/google/android/gms/internal/ads/Jz0;->e(J)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Ql;->a:Ljava/lang/Object;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result p2

    if-nez p2, :cond_3

    iget-object p2, p4, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p3, p2, p4}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object p2

    iget p2, p2, Lcom/google/android/gms/internal/ads/pl;->c:I

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    invoke-virtual {p3, p2, p4, v2, v3}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    move-result-object p2

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/Ql;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    invoke-static {p2, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz p7, :cond_4

    goto :goto_2

    :cond_4
    return-void

    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->u0:Lcom/google/android/gms/internal/ads/Jz0;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Jz0;->e(J)V

    return-void
.end method

.method private final N(ZZ)V
    .locals 2

    .prologue
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/SA0;->e0:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz p1, :cond_0

    if-nez p2, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    :cond_0
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/SA0;->f0:J

    return-void
.end method

.method private final declared-synchronized O(Lcom/google/android/gms/internal/ads/Tg0;J)V
    .locals 5

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    add-long/2addr v0, p2

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Tg0;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    const-wide/16 v3, 0x0

    cmp-long v3, p2, v3

    if-lez v3, :cond_0

    :try_start_1
    invoke-virtual {p0, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    const/4 p2, 0x1

    move v2, p2

    :goto_1
    :try_start_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    sub-long p2, v0, p2

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method private final P()Z
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/cB0;->e:J

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v1, v4

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    cmp-long v0, v5, v1

    if-ltz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v4

    :cond_1
    move v3, v4

    :cond_2
    :goto_0
    return v3
.end method

.method private static Q(Lcom/google/android/gms/internal/ads/sB0;Lcom/google/android/gms/internal/ads/pl;)Z
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object p0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/pl;->f:Z

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private final R()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    if-eqz v1, :cond_0

    iget v0, v0, Lcom/google/android/gms/internal/ads/sB0;->n:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final S(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)Z
    .locals 4

    .prologue
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object p2

    iget p2, p2, Lcom/google/android/gms/internal/ads/pl;->c:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    const-wide/16 v2, 0x0

    invoke-virtual {p1, p2, v0, v2, v3}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ql;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    iget-boolean p2, p1, Lcom/google/android/gms/internal/ads/Ql;->h:Z

    if-eqz p2, :cond_1

    iget-wide p1, p1, Lcom/google/android/gms/internal/ads/Ql;->e:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v1
.end method

.method private static T(Lcom/google/android/gms/internal/ads/IJ0;)[Lcom/google/android/gms/internal/ads/D;
    .locals 4

    .prologue
    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/MJ0;->f()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    new-array v2, v1, [Lcom/google/android/gms/internal/ads/D;

    :goto_1
    if-ge v0, v1, :cond_1

    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/ads/MJ0;->F(I)Lcom/google/android/gms/internal/ads/D;

    move-result-object v3

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-object v2
.end method

.method private static final U(Lcom/google/android/gms/internal/ads/wB0;)V
    .locals 4

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wB0;->i()Z

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wB0;->c()Lcom/google/android/gms/internal/ads/vB0;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wB0;->a()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wB0;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/ads/vB0;->x(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/wB0;->h(Z)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/wB0;->h(Z)V

    throw v1
.end method

.method private static final V(Lcom/google/android/gms/internal/ads/bB0;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    if-eqz p0, :cond_3

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/JH0;->k()V

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bB0;->c:[Lcom/google/android/gms/internal/ads/EI0;

    move v2, v0

    :goto_0
    const/4 v3, 0x2

    if-ge v2, v3, :cond_2

    aget-object v3, v1, v2

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/EI0;->f()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/bB0;->d()J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long p0, v1, v3

    if-eqz p0, :cond_3

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_3
    return v0
.end method

.method static W(Lcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;IZLjava/lang/Object;Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/qm;)I
    .locals 14

    .prologue
    move-object v6, p0

    move-object v7, p1

    move-object/from16 v0, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    invoke-virtual {v8, v0, p1}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/internal/ads/pl;->c:I

    const-wide/16 v2, 0x0

    invoke-virtual {v8, v1, p0, v2, v3}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/Ql;->a:Ljava/lang/Object;

    const/4 v10, 0x0

    move v4, v10

    :goto_0
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/gms/internal/ads/qm;->c()I

    move-result v5

    if-ge v4, v5, :cond_1

    invoke-virtual {v9, v4, p0, v2, v3}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    move-result-object v5

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/Ql;->a:Ljava/lang/Object;

    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    return v4

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/ads/qm;->b()I

    move-result v11

    const/4 v12, -0x1

    move v1, v0

    move v13, v10

    move v0, v12

    :goto_1
    if-ge v13, v11, :cond_3

    if-ne v0, v12, :cond_3

    move-object/from16 v0, p5

    move-object v2, p1

    move-object v3, p0

    move/from16 v4, p2

    move/from16 v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/qm;->i(ILcom/google/android/gms/internal/ads/pl;Lcom/google/android/gms/internal/ads/Ql;IZ)I

    move-result v1

    if-ne v1, v12, :cond_2

    move v0, v12

    goto :goto_2

    :cond_2
    invoke-virtual {v8, v1}, Lcom/google/android/gms/internal/ads/qm;->f(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v0

    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    if-ne v0, v12, :cond_4

    return v12

    :cond_4
    invoke-virtual {v9, v0, p1, v10}, Lcom/google/android/gms/internal/ads/qm;->d(ILcom/google/android/gms/internal/ads/pl;Z)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/ads/pl;->c:I

    return v0
.end method

.method public static synthetic Y(Lcom/google/android/gms/internal/ads/SA0;Lcom/google/android/gms/internal/ads/cB0;J)Lcom/google/android/gms/internal/ads/bB0;
    .locals 14

    move-object v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->H:Lcom/google/android/gms/internal/ads/WA0;

    new-instance v13, Lcom/google/android/gms/internal/ads/bB0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/WA0;->k()Lcom/google/android/gms/internal/ads/YJ0;

    move-result-object v7

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->s0:Lcom/google/android/gms/internal/ads/aA0;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/aA0;->a:J

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/SA0;->G:Lcom/google/android/gms/internal/ads/QJ0;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/SA0;->T:Lcom/google/android/gms/internal/ads/rB0;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/SA0;->F:Lcom/google/android/gms/internal/ads/PJ0;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/SA0;->D:[Lcom/google/android/gms/internal/ads/DB0;

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    move-object v2, v13

    move-wide/from16 v4, p2

    move-object v9, p1

    invoke-direct/range {v2 .. v12}, Lcom/google/android/gms/internal/ads/bB0;-><init>([Lcom/google/android/gms/internal/ads/DB0;JLcom/google/android/gms/internal/ads/PJ0;Lcom/google/android/gms/internal/ads/YJ0;Lcom/google/android/gms/internal/ads/rB0;Lcom/google/android/gms/internal/ads/cB0;Lcom/google/android/gms/internal/ads/QJ0;J)V

    return-object v13
.end method

.method private final c(Lcom/google/android/gms/internal/ads/LH0;JJJZI)Lcom/google/android/gms/internal/ads/sB0;
    .locals 16

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-wide/from16 v5, p4

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/SA0;->p0:Z

    const/4 v3, 0x0

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v7, v1, Lcom/google/android/gms/internal/ads/sB0;->s:J

    cmp-long v1, p2, v7

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/LH0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/SA0;->p0:Z

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->y()V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/sB0;->h:Lcom/google/android/gms/internal/ads/PI0;

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/sB0;->i:Lcom/google/android/gms/internal/ads/QJ0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/sB0;->j:Ljava/util/List;

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/SA0;->T:Lcom/google/android/gms/internal/ads/rB0;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/rB0;->j()Z

    move-result v9

    if-eqz v9, :cond_c

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    if-nez v1, :cond_2

    sget-object v7, Lcom/google/android/gms/internal/ads/PI0;->d:Lcom/google/android/gms/internal/ads/PI0;

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->h()Lcom/google/android/gms/internal/ads/PI0;

    move-result-object v7

    :goto_1
    if-nez v1, :cond_3

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/SA0;->G:Lcom/google/android/gms/internal/ads/QJ0;

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v8

    :goto_2
    iget-object v9, v8, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    new-instance v10, Lcom/google/android/gms/internal/ads/Zh0;

    invoke-direct {v10}, Lcom/google/android/gms/internal/ads/Zh0;-><init>()V

    array-length v11, v9

    move v12, v3

    move v13, v12

    :goto_3
    if-ge v12, v11, :cond_6

    aget-object v14, v9, v12

    if-eqz v14, :cond_5

    invoke-interface {v14, v3}, Lcom/google/android/gms/internal/ads/MJ0;->F(I)Lcom/google/android/gms/internal/ads/D;

    move-result-object v14

    iget-object v14, v14, Lcom/google/android/gms/internal/ads/D;->l:Lcom/google/android/gms/internal/ads/Cb;

    if-nez v14, :cond_4

    new-instance v14, Lcom/google/android/gms/internal/ads/Cb;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    new-array v15, v3, [Lcom/google/android/gms/internal/ads/bb;

    invoke-direct {v14, v4, v5, v15}, Lcom/google/android/gms/internal/ads/Cb;-><init>(J[Lcom/google/android/gms/internal/ads/bb;)V

    invoke-virtual {v10, v14}, Lcom/google/android/gms/internal/ads/Zh0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Zh0;

    goto :goto_4

    :cond_4
    invoke-virtual {v10, v14}, Lcom/google/android/gms/internal/ads/Zh0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Zh0;

    const/4 v13, 0x1

    :cond_5
    :goto_4
    add-int/lit8 v12, v12, 0x1

    move-wide/from16 v5, p4

    goto :goto_3

    :cond_6
    if-eqz v13, :cond_7

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/Zh0;->j()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v4

    goto :goto_5

    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v4

    :goto_5
    if-eqz v1, :cond_8

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v9, v5, Lcom/google/android/gms/internal/ads/cB0;->c:J

    move-wide/from16 v11, p4

    cmp-long v9, v9, v11

    if-eqz v9, :cond_9

    invoke-virtual {v5, v11, v12}, Lcom/google/android/gms/internal/ads/cB0;->a(J)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object v5

    iput-object v5, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    goto :goto_6

    :cond_8
    move-wide/from16 v11, p4

    :cond_9
    :goto_6
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v1

    :goto_7
    const/4 v5, 0x2

    if-ge v3, v5, :cond_b

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/QJ0;->b(I)Z

    move-result v5

    if-eqz v5, :cond_a

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object v5, v5, v3

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/FB0;->c()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_b

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/QJ0;->b:[Lcom/google/android/gms/internal/ads/EB0;

    aget-object v5, v5, v3

    iget v5, v5, Lcom/google/android/gms/internal/ads/EB0;->a:I

    goto :goto_8

    :cond_a
    const/4 v6, 0x1

    :goto_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_b
    move-object v15, v4

    :goto_9
    move-object v13, v7

    move-object v14, v8

    goto :goto_a

    :cond_c
    move-wide v11, v5

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/LH0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->G:Lcom/google/android/gms/internal/ads/QJ0;

    sget-object v3, Lcom/google/android/gms/internal/ads/PI0;->d:Lcom/google/android/gms/internal/ads/PI0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v4

    move-object v14, v1

    move-object v13, v3

    move-object v15, v4

    goto :goto_a

    :cond_d
    move-object v15, v1

    goto :goto_9

    :goto_a
    if-eqz p8, :cond_e

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    move/from16 v3, p9

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/OA0;->c(I)V

    :cond_e
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->k0()J

    move-result-wide v9

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-object v11, v13

    move-object v12, v14

    move-object v13, v15

    invoke-virtual/range {v1 .. v13}, Lcom/google/android/gms/internal/ads/sB0;->b(Lcom/google/android/gms/internal/ads/LH0;JJJJLcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;Ljava/util/List;)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v1

    return-object v1
.end method

.method private final d(I)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/FB0;->b()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object v1, v1, p1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/FB0;->e(Lcom/google/android/gms/internal/ads/Pz0;)V

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/ads/SA0;->u(IZ)V

    iget p1, p0, Lcom/google/android/gms/internal/ads/SA0;->k0:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/SA0;->k0:I

    return-void
.end method

.method private final f()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/SA0;->d(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final h()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    const/4 v1, 0x2

    new-array v1, v1, [Z

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->f()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/SA0;->i([ZJ)V

    return-void
.end method

.method private final i([ZJ)V
    .locals 26

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x2

    if-ge v4, v5, :cond_1

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/QJ0;->b(I)Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object v5, v5, v4

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/FB0;->m()V

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move v4, v3

    :goto_1
    const/4 v6, 0x1

    if-ge v4, v5, :cond_7

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/QJ0;->b(I)Z

    move-result v7

    if-eqz v7, :cond_6

    aget-boolean v7, p1, v4

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v8

    aget-object v9, v9, v4

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/FB0;->b()I

    move-result v10

    if-lez v10, :cond_2

    goto/16 :goto_5

    :cond_2
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v10

    if-ne v8, v10, :cond_3

    move/from16 v24, v6

    goto :goto_2

    :cond_3
    move/from16 v24, v3

    :goto_2
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v10

    iget-object v11, v10, Lcom/google/android/gms/internal/ads/QJ0;->b:[Lcom/google/android/gms/internal/ads/EB0;

    aget-object v11, v11, v4

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    aget-object v10, v10, v4

    invoke-static {v10}, Lcom/google/android/gms/internal/ads/SA0;->T(Lcom/google/android/gms/internal/ads/IJ0;)[Lcom/google/android/gms/internal/ads/D;

    move-result-object v12

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->R()Z

    move-result v10

    if-eqz v10, :cond_4

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v10, v10, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/4 v13, 0x3

    if-ne v10, v13, :cond_4

    move/from16 v25, v6

    goto :goto_3

    :cond_4
    move/from16 v25, v3

    :goto_3
    if-nez v7, :cond_5

    if-eqz v25, :cond_5

    move/from16 v16, v6

    goto :goto_4

    :cond_5
    move/from16 v16, v3

    :goto_4
    iget v7, v0, Lcom/google/android/gms/internal/ads/SA0;->k0:I

    add-int/2addr v7, v6

    iput v7, v0, Lcom/google/android/gms/internal/ads/SA0;->k0:I

    iget-object v6, v8, Lcom/google/android/gms/internal/ads/bB0;->c:[Lcom/google/android/gms/internal/ads/EI0;

    aget-object v13, v6, v4

    iget-wide v14, v0, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v20

    iget-object v6, v8, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    move-object v10, v9

    move/from16 v17, v24

    move-wide/from16 v18, p2

    move-object/from16 v22, v6

    move-object/from16 v23, v7

    invoke-virtual/range {v10 .. v23}, Lcom/google/android/gms/internal/ads/FB0;->f(Lcom/google/android/gms/internal/ads/EB0;[Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/EI0;JZZJJLcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/Pz0;)V

    new-instance v6, Lcom/google/android/gms/internal/ads/MA0;

    invoke-direct {v6, v0}, Lcom/google/android/gms/internal/ads/MA0;-><init>(Lcom/google/android/gms/internal/ads/SA0;)V

    const/16 v7, 0xb

    invoke-virtual {v9, v7, v6}, Lcom/google/android/gms/internal/ads/FB0;->h(ILjava/lang/Object;)V

    if-eqz v25, :cond_6

    if-eqz v24, :cond_6

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/FB0;->s()V

    :cond_6
    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_7
    iput-boolean v6, v1, Lcom/google/android/gms/internal/ads/bB0;->h:Z

    return-void
.end method

.method static final synthetic i0(Lcom/google/android/gms/internal/ads/wB0;)V
    .locals 2

    .prologue
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/SA0;->U(Lcom/google/android/gms/internal/ads/wB0;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Qz0; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string v0, "ExoPlayerImplInternal"

    const-string v1, "Unexpected error delivering message on external thread."

    invoke-static {v0, v1, p0}, Lcom/google/android/gms/internal/ads/eM;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private final j0(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;J)J
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object p2

    iget p2, p2, Lcom/google/android/gms/internal/ads/pl;->c:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    const-wide/16 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v2}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/Ql;->e:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ql;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    iget-boolean p2, p1, Lcom/google/android/gms/internal/ads/Ql;->h:Z

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    iget-wide p1, p1, Lcom/google/android/gms/internal/ads/Ql;->f:J

    cmp-long v0, p1, v2

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    add-long/2addr p1, v0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/Ql;->e:J

    sub-long/2addr p1, v0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/EW;->K(J)J

    move-result-wide p1

    sub-long/2addr p1, p3

    return-wide p1

    :cond_2
    :goto_1
    return-wide v2
.end method

.method private final k(Ljava/io/IOException;I)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/Qz0;->c(Ljava/io/IOException;I)Lcom/google/android/gms/internal/ads/Qz0;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/Qz0;->a(Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/Qz0;

    move-result-object p1

    :cond_0
    const-string p2, "ExoPlayerImplInternal"

    const-string v0, "Playback error"

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/ads/eM;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p2, 0x0

    invoke-direct {p0, p2, p2}, Lcom/google/android/gms/internal/ads/SA0;->H(ZZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/sB0;->d(Lcom/google/android/gms/internal/ads/Qz0;)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    return-void
.end method

.method private final k0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/sB0;->q:J

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/SA0;->l0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method private final l0(J)J
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->o()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v5

    sub-long/2addr v3, v5

    sub-long/2addr p1, v3

    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method private final m(Z)V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->o()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/sB0;->k:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/LH0;->equals(Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/sB0;->a(Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    if-nez v0, :cond_2

    iget-wide v3, v1, Lcom/google/android/gms/internal/ads/sB0;->s:J

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->c()J

    move-result-wide v3

    :goto_1
    iput-wide v3, v1, Lcom/google/android/gms/internal/ads/sB0;->q:J

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->k0()J

    move-result-wide v3

    iput-wide v3, v1, Lcom/google/android/gms/internal/ads/sB0;->r:J

    if-nez v2, :cond_3

    if-eqz p1, :cond_4

    :cond_3
    if-eqz v0, :cond_4

    iget-boolean p1, v0, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-eqz p1, :cond_4

    iget-object p1, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->h()Lcom/google/android/gms/internal/ads/PI0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v0

    invoke-direct {p0, p1, v1, v0}, Lcom/google/android/gms/internal/ads/SA0;->K(Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;)V

    :cond_4
    return-void
.end method

.method private final m0(Lcom/google/android/gms/internal/ads/LH0;JZ)J
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/SA0;->n0(Lcom/google/android/gms/internal/ads/LH0;JZZ)J

    move-result-wide p1

    return-wide p1
.end method

.method private final n(Lcom/google/android/gms/internal/ads/qm;Z)V
    .locals 28

    .prologue
    move-object/from16 v11, p0

    move-object/from16 v12, p1

    iget-object v0, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v8, v11, Lcom/google/android/gms/internal/ads/SA0;->l0:Lcom/google/android/gms/internal/ads/QA0;

    iget v4, v11, Lcom/google/android/gms/internal/ads/SA0;->h0:I

    iget-boolean v9, v11, Lcom/google/android/gms/internal/ads/SA0;->i0:Z

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v1

    const/4 v10, 0x4

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/sB0;->h()Lcom/google/android/gms/internal/ads/LH0;

    move-result-object v0

    move-object v9, v0

    move-wide/from16 v17, v15

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v10, 0x1

    const-wide/16 v13, 0x0

    const-wide/16 v23, 0x0

    goto/16 :goto_11

    :cond_0
    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v1, v2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/ads/SA0;->Q(Lcom/google/android/gms/internal/ads/sB0;Lcom/google/android/gms/internal/ads/pl;)Z

    move-result v17

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v5

    if-nez v5, :cond_2

    if-eqz v17, :cond_1

    goto :goto_1

    :cond_1
    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    :goto_0
    move-wide/from16 v21, v6

    goto :goto_2

    :cond_2
    :goto_1
    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/sB0;->c:J

    goto :goto_0

    :goto_2
    iget-object v7, v11, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    if-eqz v8, :cond_6

    const/4 v5, 0x1

    move-object v6, v1

    move-object/from16 v1, p1

    move-object v13, v2

    move-object v2, v8

    move-object v14, v3

    move v3, v5

    move v5, v9

    move-object/from16 v26, v6

    move-object v6, v7

    move-object/from16 v18, v7

    move-object v7, v14

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/SA0;->p0(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/QA0;ZIZLcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;)Landroid/util/Pair;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-virtual {v12, v9}, Lcom/google/android/gms/internal/ads/qm;->g(Z)I

    move-result v1

    move v7, v1

    move-wide/from16 v3, v21

    move-object/from16 v1, v26

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    goto :goto_5

    :cond_3
    iget-wide v2, v8, Lcom/google/android/gms/internal/ads/QA0;->c:J

    cmp-long v2, v2, v15

    if-nez v2, :cond_4

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v12, v1, v14}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v1

    iget v7, v1, Lcom/google/android/gms/internal/ads/pl;->c:I

    move-wide/from16 v3, v21

    move-object/from16 v1, v26

    const/4 v6, 0x0

    goto :goto_3

    :cond_4
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    move-object v1, v2

    const/4 v6, 0x1

    const/4 v7, -0x1

    :goto_3
    iget v2, v0, Lcom/google/android/gms/internal/ads/sB0;->e:I

    if-ne v2, v10, :cond_5

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    :goto_4
    move v5, v2

    move v2, v6

    const/4 v6, 0x0

    :goto_5
    move v8, v5

    move v9, v6

    move v5, v7

    move-object/from16 v7, v18

    const/4 v10, -0x1

    const-wide/16 v23, 0x0

    move/from16 v18, v2

    goto/16 :goto_9

    :cond_6
    move-object/from16 v26, v1

    move-object v13, v2

    move-object v14, v3

    move-object/from16 v18, v7

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v12, v9}, Lcom/google/android/gms/internal/ads/qm;->g(Z)I

    move-result v1

    move v5, v1

    move-object/from16 v7, v18

    move-wide/from16 v3, v21

    move-object/from16 v1, v26

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, -0x1

    :goto_6
    const/16 v18, 0x0

    const-wide/16 v23, 0x0

    goto/16 :goto_9

    :cond_7
    move-object/from16 v8, v26

    invoke-virtual {v12, v8}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v1

    const/4 v7, -0x1

    if-ne v1, v7, :cond_9

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    move-object/from16 v1, v18

    move-object v2, v14

    move v3, v4

    move v4, v9

    move-object v5, v8

    move v10, v7

    move-object/from16 v7, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/SA0;->W(Lcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;IZLjava/lang/Object;Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/qm;)I

    move-result v1

    if-ne v1, v10, :cond_8

    invoke-virtual {v12, v9}, Lcom/google/android/gms/internal/ads/qm;->g(Z)I

    move-result v1

    const/4 v6, 0x1

    goto :goto_7

    :cond_8
    const/4 v6, 0x0

    :goto_7
    move v5, v1

    move v9, v6

    move-object v1, v8

    move-object/from16 v7, v18

    move-wide/from16 v3, v21

    const/4 v8, 0x0

    goto :goto_6

    :cond_9
    move v10, v7

    cmp-long v1, v21, v15

    if-nez v1, :cond_a

    invoke-virtual {v12, v8, v14}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/internal/ads/pl;->c:I

    move v5, v1

    move-object v1, v8

    move-object/from16 v7, v18

    move-wide/from16 v3, v21

    const/4 v8, 0x0

    const/4 v9, 0x0

    goto :goto_6

    :cond_a
    if-eqz v17, :cond_c

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v2, v13, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2, v14}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget v2, v14, Lcom/google/android/gms/internal/ads/pl;->c:I

    move-object/from16 v7, v18

    const-wide/16 v5, 0x0

    invoke-virtual {v1, v2, v7, v5, v6}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/internal/ads/Ql;->m:I

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v3, v13, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v2

    if-ne v1, v2, :cond_b

    invoke-virtual {v12, v8, v14}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v1

    iget v4, v1, Lcom/google/android/gms/internal/ads/pl;->c:I

    move-object/from16 v1, p1

    move-object v2, v7

    move-object v3, v14

    move-wide/from16 v23, v5

    move-wide/from16 v5, v21

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/qm;->l(Lcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;IJ)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    move-object v1, v2

    goto :goto_8

    :cond_b
    move-wide/from16 v23, v5

    move-object v1, v8

    move-wide/from16 v3, v21

    :goto_8
    move v5, v10

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v18, 0x1

    goto :goto_9

    :cond_c
    move-object/from16 v7, v18

    const-wide/16 v23, 0x0

    move-object v1, v8

    move v5, v10

    move-wide/from16 v3, v21

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v18, 0x0

    :goto_9
    if-eq v5, v10, :cond_d

    const-wide v26, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v1, p1

    move-object v2, v7

    move-object v3, v14

    move v4, v5

    move-wide/from16 v5, v26

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/qm;->l(Lcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;IJ)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    move-object v1, v2

    move-wide v5, v3

    move-wide v3, v15

    goto :goto_a

    :cond_d
    move-wide v5, v3

    :goto_a
    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2, v12, v1, v5, v6}, Lcom/google/android/gms/internal/ads/eB0;->v(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;J)Lcom/google/android/gms/internal/ads/LH0;

    move-result-object v2

    iget v7, v2, Lcom/google/android/gms/internal/ads/LH0;->e:I

    if-eq v7, v10, :cond_e

    iget v15, v13, Lcom/google/android/gms/internal/ads/LH0;->e:I

    if-eq v15, v10, :cond_f

    if-lt v7, v15, :cond_f

    :cond_e
    const/4 v7, 0x1

    goto :goto_b

    :cond_f
    const/4 v7, 0x0

    :goto_b
    iget-object v15, v13, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {v15, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v15

    if-nez v15, :cond_10

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v15

    if-nez v15, :cond_10

    if-eqz v7, :cond_10

    const/4 v7, 0x1

    goto :goto_c

    :cond_10
    const/4 v7, 0x0

    :goto_c
    invoke-virtual {v12, v1, v14}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v1

    if-nez v17, :cond_11

    cmp-long v15, v21, v3

    if-nez v15, :cond_11

    iget-object v15, v13, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v10, v2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {v15, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_12

    :cond_11
    :goto_d
    const/4 v10, 0x1

    goto :goto_e

    :cond_12
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v10

    if-eqz v10, :cond_13

    iget v10, v13, Lcom/google/android/gms/internal/ads/LH0;->b:I

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/ads/pl;->k(I)Z

    :cond_13
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v10

    if-eqz v10, :cond_11

    iget v10, v2, Lcom/google/android/gms/internal/ads/LH0;->b:I

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/ads/pl;->k(I)Z

    goto :goto_d

    :goto_e
    if-eq v10, v7, :cond_14

    goto :goto_f

    :cond_14
    move-object v2, v13

    :goto_f
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-virtual {v2, v13}, Lcom/google/android/gms/internal/ads/LH0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    goto :goto_10

    :cond_15
    iget-object v0, v2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {v12, v0, v14}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    iget v0, v2, Lcom/google/android/gms/internal/ads/LH0;->c:I

    iget v1, v2, Lcom/google/android/gms/internal/ads/LH0;->b:I

    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/ads/pl;->e(I)I

    move-result v1

    if-ne v0, v1, :cond_16

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/pl;->h()J

    :cond_16
    move-wide/from16 v5, v23

    :cond_17
    :goto_10
    move-wide v13, v5

    move v5, v8

    move v6, v9

    move/from16 v7, v18

    move-object v9, v2

    move-wide/from16 v17, v3

    :goto_11
    iget-object v0, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/LH0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    cmp-long v0, v13, v0

    if-eqz v0, :cond_19

    :cond_18
    move v15, v10

    goto :goto_12

    :cond_19
    const/4 v15, 0x0

    :goto_12
    const/16 v20, 0x3

    const/4 v3, 0x2

    if-eqz v6, :cond_1b

    :try_start_0
    iget-object v0, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v0, v0, Lcom/google/android/gms/internal/ads/sB0;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eq v0, v10, :cond_1a

    const/4 v6, 0x4

    :try_start_1
    invoke-direct {v11, v6}, Lcom/google/android/gms/internal/ads/SA0;->F(I)V

    :goto_13
    const/4 v4, 0x0

    goto :goto_16

    :catchall_0
    move-exception v0

    :goto_14
    move v8, v3

    move/from16 v23, v6

    move v2, v7

    :goto_15
    const/4 v10, 0x0

    goto/16 :goto_23

    :cond_1a
    const/4 v6, 0x4

    goto :goto_13

    :goto_16
    invoke-direct {v11, v4, v4, v4, v10}, Lcom/google/android/gms/internal/ads/SA0;->x(ZZZZ)V

    goto :goto_17

    :catchall_1
    move-exception v0

    const/4 v4, 0x0

    const/4 v6, 0x4

    goto :goto_14

    :cond_1b
    const/4 v4, 0x0

    const/4 v6, 0x4

    :goto_17
    iget-object v0, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    move v1, v4

    :goto_18
    if-ge v1, v3, :cond_1c

    aget-object v2, v0, v1

    invoke-virtual {v2, v12}, Lcom/google/android/gms/internal/ads/FB0;->q(Lcom/google/android/gms/internal/ads/qm;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_18

    :cond_1c
    if-nez v15, :cond_23

    :try_start_2
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    :try_start_3
    iget-wide v4, v11, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    if-nez v0, :cond_1d

    move/from16 v19, v7

    move-wide/from16 v21, v23

    goto :goto_1b

    :cond_1d
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v21

    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/bB0;->e:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    move/from16 v19, v7

    if-eqz v2, :cond_21

    move-wide/from16 v6, v21

    const/4 v2, 0x0

    :goto_19
    :try_start_4
    iget-object v8, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    if-ge v2, v3, :cond_20

    aget-object v8, v8, v2

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/ads/FB0;->z(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v8

    if-nez v8, :cond_1e

    goto :goto_1a

    :cond_1e
    iget-object v8, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object v8, v8, v2

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/ads/FB0;->d(Lcom/google/android/gms/internal/ads/bB0;)J

    move-result-wide v10

    const-wide/high16 v21, -0x8000000000000000L

    cmp-long v8, v10, v21

    if-nez v8, :cond_1f

    goto :goto_1b

    :cond_1f
    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_1a
    add-int/lit8 v2, v2, 0x1

    const/4 v10, 0x1

    move-object/from16 v11, p0

    goto :goto_19

    :catchall_2
    move-exception v0

    move-object/from16 v11, p0

    move v8, v3

    move/from16 v2, v19

    const/4 v10, 0x0

    const/16 v23, 0x4

    goto/16 :goto_23

    :cond_20
    move-wide/from16 v21, v6

    :cond_21
    :goto_1b
    move-object/from16 v2, p1

    move v10, v3

    const/4 v11, 0x0

    move-wide v3, v4

    const/16 v23, 0x4

    move-wide/from16 v5, v21

    :try_start_5
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/eB0;->H(Lcom/google/android/gms/internal/ads/qm;JJ)Z

    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    if-nez v0, :cond_22

    move-object/from16 v8, p0

    :try_start_6
    invoke-direct {v8, v11}, Lcom/google/android/gms/internal/ads/SA0;->C(Z)V

    goto/16 :goto_1e

    :catchall_3
    move-exception v0

    :goto_1c
    move-object v11, v8

    move v8, v10

    move/from16 v2, v19

    goto/16 :goto_15

    :cond_22
    move-object/from16 v8, p0

    goto :goto_1e

    :catchall_4
    move-exception v0

    move-object/from16 v8, p0

    goto :goto_1c

    :catchall_5
    move-exception v0

    move v10, v3

    move/from16 v23, v6

    move/from16 v19, v7

    move-object v8, v11

    const/4 v11, 0x0

    goto :goto_1c

    :catchall_6
    move-exception v0

    move v10, v3

    move/from16 v23, v6

    move/from16 v19, v7

    move-object v8, v11

    move v11, v4

    goto :goto_1c

    :cond_23
    move v10, v3

    move/from16 v23, v6

    move/from16 v19, v7

    move-object v8, v11

    move v11, v4

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v0

    if-nez v0, :cond_26

    iget-object v0, v8, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    :goto_1d
    if-eqz v0, :cond_25

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/ads/LH0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_24

    iget-object v1, v8, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    invoke-virtual {v1, v12, v2}, Lcom/google/android/gms/internal/ads/eB0;->u(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/cB0;)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->r()V

    :cond_24
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    goto :goto_1d

    :cond_25
    invoke-direct {v8, v9, v13, v14, v5}, Lcom/google/android/gms/internal/ads/SA0;->m0(Lcom/google/android/gms/internal/ads/LH0;JZ)J

    move-result-wide v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-wide v13, v0

    :cond_26
    :goto_1e
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    move/from16 v2, v19

    const/4 v1, 0x1

    if-eq v1, v2, :cond_27

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_1f

    :cond_27
    move-wide v6, v13

    :goto_1f
    const/4 v0, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v9

    move-object v11, v8

    move v8, v0

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/SA0;->M(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JZ)V

    if-nez v15, :cond_29

    iget-object v0, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/sB0;->c:J

    cmp-long v0, v17, v0

    if-eqz v0, :cond_28

    goto :goto_20

    :cond_28
    move v13, v10

    goto :goto_22

    :cond_29
    :goto_20
    iget-object v0, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    if-eqz v15, :cond_2a

    if-eqz p2, :cond_2a

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v2

    if-nez v2, :cond_2a

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v0

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/pl;->f:Z

    if-nez v0, :cond_2a

    const/16 v25, 0x1

    goto :goto_21

    :cond_2a
    const/16 v25, 0x0

    :goto_21
    iget-object v0, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/sB0;->d:J

    invoke-virtual {v12, v1}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2b

    move/from16 v20, v23

    :cond_2b
    move-object/from16 v1, p0

    move-object v2, v9

    move-wide v3, v13

    move-wide/from16 v5, v17

    move/from16 v9, v25

    move v13, v10

    move/from16 v10, v20

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/SA0;->c(Lcom/google/android/gms/internal/ads/LH0;JJJZI)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v0

    iput-object v0, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    :goto_22
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->y()V

    iget-object v0, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-direct {v11, v12, v0}, Lcom/google/android/gms/internal/ads/SA0;->A(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/qm;)V

    iget-object v0, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/ads/sB0;->f(Lcom/google/android/gms/internal/ads/qm;)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v0

    iput-object v0, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v0

    if-nez v0, :cond_2c

    const/4 v10, 0x0

    iput-object v10, v11, Lcom/google/android/gms/internal/ads/SA0;->l0:Lcom/google/android/gms/internal/ads/QA0;

    :cond_2c
    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lcom/google/android/gms/internal/ads/SA0;->m(Z)V

    iget-object v0, v11, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    invoke-interface {v0, v13}, Lcom/google/android/gms/internal/ads/xI;->K(I)Z

    return-void

    :goto_23
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    const/4 v6, 0x1

    if-eq v6, v2, :cond_2d

    const-wide v26, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_24

    :cond_2d
    move-wide/from16 v26, v13

    :goto_24
    const/16 v19, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v9

    move/from16 v21, v6

    move-wide/from16 v6, v26

    move/from16 v8, v19

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/SA0;->M(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JZ)V

    if-nez v15, :cond_2f

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/sB0;->c:J

    cmp-long v1, v17, v1

    if-eqz v1, :cond_2e

    goto :goto_25

    :cond_2e
    move-object v13, v10

    goto :goto_27

    :cond_2f
    :goto_25
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    if-eqz v15, :cond_30

    if-eqz p2, :cond_30

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v3

    if-nez v3, :cond_30

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ads/pl;->f:Z

    if-nez v1, :cond_30

    goto :goto_26

    :cond_30
    const/16 v21, 0x0

    :goto_26
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v7, v1, Lcom/google/android/gms/internal/ads/sB0;->d:J

    invoke-virtual {v12, v2}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_31

    move/from16 v20, v23

    :cond_31
    move-object/from16 v1, p0

    move-object v2, v9

    move-wide v3, v13

    move-wide/from16 v5, v17

    move/from16 v9, v21

    move-object v13, v10

    move/from16 v10, v20

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/SA0;->c(Lcom/google/android/gms/internal/ads/LH0;JJJZI)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v1

    iput-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    :goto_27
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->y()V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-direct {v11, v12, v1}, Lcom/google/android/gms/internal/ads/SA0;->A(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/qm;)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-virtual {v1, v12}, Lcom/google/android/gms/internal/ads/sB0;->f(Lcom/google/android/gms/internal/ads/qm;)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v1

    iput-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v1

    if-nez v1, :cond_32

    iput-object v13, v11, Lcom/google/android/gms/internal/ads/SA0;->l0:Lcom/google/android/gms/internal/ads/QA0;

    :cond_32
    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lcom/google/android/gms/internal/ads/SA0;->m(Z)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/xI;->K(I)Z

    throw v0
.end method

.method private final n0(Lcom/google/android/gms/internal/ads/LH0;JZZ)J
    .locals 5

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->I()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/ads/SA0;->N(ZZ)V

    const/4 v0, 0x2

    if-nez p5, :cond_0

    iget-object p5, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget p5, p5, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/4 v2, 0x3

    if-ne p5, v2, :cond_1

    :cond_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/SA0;->F(I)V

    :cond_1
    iget-object p5, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {p5}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object p5

    move-object v2, p5

    :goto_0
    if-eqz v2, :cond_3

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/LH0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    goto :goto_0

    :cond_3
    :goto_1
    if-nez p4, :cond_4

    if-ne p5, v2, :cond_4

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide p4

    add-long/2addr p4, p2

    const-wide/16 v3, 0x0

    cmp-long p1, p4, v3

    if-gez p1, :cond_6

    :cond_4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->f()V

    if-eqz v2, :cond_6

    :goto_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object p1

    if-eq p1, v2, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/eB0;->l()Lcom/google/android/gms/internal/ads/bB0;

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/eB0;->F(Lcom/google/android/gms/internal/ads/bB0;)Z

    const-wide p4, 0xe8d4a51000L

    invoke-virtual {v2, p4, p5}, Lcom/google/android/gms/internal/ads/bB0;->q(J)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->h()V

    :cond_6
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    if-eqz v2, :cond_9

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/eB0;->F(Lcom/google/android/gms/internal/ads/bB0;)Z

    iget-boolean p1, v2, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-nez p1, :cond_7

    iget-object p1, v2, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/cB0;->b(J)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object p1

    iput-object p1, v2, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    goto :goto_3

    :cond_7
    iget-boolean p1, v2, Lcom/google/android/gms/internal/ads/bB0;->f:Z

    if-eqz p1, :cond_8

    iget-object p1, v2, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/internal/ads/JH0;->h(J)J

    move-result-wide p2

    iget-object p1, v2, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    iget-wide p4, p0, Lcom/google/android/gms/internal/ads/SA0;->O:J

    sub-long p4, p2, p4

    invoke-interface {p1, p4, p5, v1}, Lcom/google/android/gms/internal/ads/JH0;->j(JZ)V

    :cond_8
    :goto_3
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/SA0;->z(J)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->q()V

    goto :goto_4

    :cond_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/eB0;->w()V

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/SA0;->z(J)V

    :goto_4
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/SA0;->m(Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/xI;->K(I)Z

    return-wide p2
.end method

.method private final o(Lcom/google/android/gms/internal/ads/qg;Z)V
    .locals 2

    iget v0, p1, Lcom/google/android/gms/internal/ads/qg;->a:F

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/google/android/gms/internal/ads/SA0;->p(Lcom/google/android/gms/internal/ads/qg;FZZ)V

    return-void
.end method

.method private final o0(Lcom/google/android/gms/internal/ads/qm;)Landroid/util/Pair;
    .locals 9

    .prologue
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/sB0;->h()Lcom/google/android/gms/internal/ads/LH0;

    move-result-object p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/SA0;->i0:Z

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/qm;->g(Z)I

    move-result v6

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/qm;->l(Lcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;IJ)Landroid/util/Pair;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v3, p1, v4, v1, v2}, Lcom/google/android/gms/internal/ads/eB0;->v(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;J)Lcom/google/android/gms/internal/ads/LH0;

    move-result-object v3

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v3, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p1, v0, v4}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    iget p1, v3, Lcom/google/android/gms/internal/ads/LH0;->c:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    iget v4, v3, Lcom/google/android/gms/internal/ads/LH0;->b:I

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/pl;->e(I)I

    move-result v0

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/pl;->h()J

    goto :goto_0

    :cond_1
    move-wide v1, v4

    :cond_2
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method private final p(Lcom/google/android/gms/internal/ads/qg;FZZ)V
    .locals 29

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz p3, :cond_1

    if-eqz p4, :cond_0

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/OA0;->a(I)V

    :cond_0
    iget-object v15, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v3, v15, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v4, v15, Lcom/google/android/gms/internal/ads/sB0;->c:J

    iget-wide v6, v15, Lcom/google/android/gms/internal/ads/sB0;->d:J

    iget v8, v15, Lcom/google/android/gms/internal/ads/sB0;->e:I

    iget-object v9, v15, Lcom/google/android/gms/internal/ads/sB0;->f:Lcom/google/android/gms/internal/ads/Qz0;

    iget-boolean v10, v15, Lcom/google/android/gms/internal/ads/sB0;->g:Z

    iget-object v11, v15, Lcom/google/android/gms/internal/ads/sB0;->h:Lcom/google/android/gms/internal/ads/PI0;

    iget-object v12, v15, Lcom/google/android/gms/internal/ads/sB0;->i:Lcom/google/android/gms/internal/ads/QJ0;

    iget-object v13, v15, Lcom/google/android/gms/internal/ads/sB0;->j:Ljava/util/List;

    iget-object v14, v15, Lcom/google/android/gms/internal/ads/sB0;->k:Lcom/google/android/gms/internal/ads/LH0;

    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    move-object v0, v15

    move v15, v1

    iget v1, v0, Lcom/google/android/gms/internal/ads/sB0;->m:I

    move/from16 v16, v1

    iget v1, v0, Lcom/google/android/gms/internal/ads/sB0;->n:I

    move/from16 v17, v1

    new-instance v1, Lcom/google/android/gms/internal/ads/sB0;

    move-object/from16 p3, v1

    move-object/from16 v28, v1

    move-object/from16 p4, v2

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->q:J

    move-wide/from16 v19, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->r:J

    move-wide/from16 v21, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    move-wide/from16 v23, v1

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/sB0;->t:J

    move-wide/from16 v25, v0

    const/16 v27, 0x0

    move-object/from16 v18, p1

    move-object/from16 v2, p4

    move-object/from16 v1, v28

    invoke-direct/range {v1 .. v27}, Lcom/google/android/gms/internal/ads/sB0;-><init>(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJILcom/google/android/gms/internal/ads/Qz0;ZLcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;Ljava/util/List;Lcom/google/android/gms/internal/ads/LH0;ZIILcom/google/android/gms/internal/ads/qg;JJJJZ)V

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    :cond_1
    move-object/from16 v1, p1

    iget v2, v1, Lcom/google/android/gms/internal/ads/qg;->a:F

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    :goto_0
    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v4

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    array-length v5, v4

    :goto_1
    if-ge v3, v5, :cond_2

    aget-object v6, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    goto :goto_0

    :cond_3
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    :goto_2
    const/4 v4, 0x2

    if-ge v3, v4, :cond_4

    aget-object v4, v2, v3

    iget v5, v1, Lcom/google/android/gms/internal/ads/qg;->a:F

    move/from16 v6, p2

    invoke-virtual {v4, v6, v5}, Lcom/google/android/gms/internal/ads/FB0;->p(FF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method private static p0(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/QA0;ZIZLcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;)Landroid/util/Pair;
    .locals 13

    .prologue
    move-object v7, p0

    move-object v0, p1

    move-object/from16 v8, p6

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/QA0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v2

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    return-object v9

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v2

    const/4 v3, 0x1

    if-ne v3, v2, :cond_1

    move-object v10, v7

    goto :goto_0

    :cond_1
    move-object v10, v1

    :goto_0
    :try_start_0
    iget v4, v0, Lcom/google/android/gms/internal/ads/QA0;->b:I

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/QA0;->c:J

    move-object v1, v10

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/qm;->l(Lcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;IJ)Landroid/util/Pair;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0, v10}, Lcom/google/android/gms/internal/ads/qm;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_2
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v2

    const/4 v11, -0x1

    if-eq v2, v11, :cond_4

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v10, v2, v8}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v2

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/pl;->f:Z

    if-eqz v2, :cond_3

    iget v2, v8, Lcom/google/android/gms/internal/ads/pl;->c:I

    const-wide/16 v3, 0x0

    move-object/from16 v12, p5

    invoke-virtual {v10, v2, v12, v3, v4}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/internal/ads/Ql;->m:I

    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v3

    if-ne v2, v3, :cond_3

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, v1, v8}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v1

    iget v3, v1, Lcom/google/android/gms/internal/ads/pl;->c:I

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/QA0;->c:J

    :goto_1
    move-object v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/qm;->l(Lcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;IJ)Landroid/util/Pair;

    move-result-object v0

    return-object v0

    :cond_3
    return-object v1

    :cond_4
    move-object/from16 v12, p5

    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    move/from16 v2, p3

    move/from16 v3, p4

    move-object v5, v10

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/SA0;->W(Lcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;IZLjava/lang/Object;Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/qm;)I

    move-result v3

    if-eq v3, v11, :cond_5

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_1

    :catch_0
    :cond_5
    return-object v9
.end method

.method private final q()V
    .locals 18

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->o()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/SA0;->V(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v2, 0x0

    goto/16 :goto_4

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->o()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->d()J

    move-result-wide v3

    invoke-direct {v0, v3, v4}, Lcom/google/android/gms/internal/ads/SA0;->l0(J)J

    move-result-wide v3

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v5

    if-ne v1, v5, :cond_1

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v7

    :goto_0
    sub-long/2addr v5, v7

    move-wide v9, v5

    goto :goto_1

    :cond_1
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v7

    sub-long/2addr v5, v7

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v7, v7, Lcom/google/android/gms/internal/ads/cB0;->b:J

    goto :goto_0

    :goto_1
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-direct {v0, v5, v6}, Lcom/google/android/gms/internal/ads/SA0;->S(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/SA0;->u0:Lcom/google/android/gms/internal/ads/Jz0;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/Jz0;->b()J

    move-result-wide v5

    :goto_2
    move-wide/from16 v16, v5

    goto :goto_3

    :cond_2
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_2

    :goto_3
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/SA0;->V:Lcom/google/android/gms/internal/ads/bE0;

    new-instance v15, Lcom/google/android/gms/internal/ads/VA0;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v7, v5, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Pz0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v1

    iget v13, v1, Lcom/google/android/gms/internal/ads/qg;->a:F

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-boolean v14, v1, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/SA0;->e0:Z

    move-object v5, v15

    move-wide v11, v3

    move-object v2, v15

    move v15, v1

    invoke-direct/range {v5 .. v17}, Lcom/google/android/gms/internal/ads/VA0;-><init>(Lcom/google/android/gms/internal/ads/bE0;Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJFZZJ)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->H:Lcom/google/android/gms/internal/ads/WA0;

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/WA0;->d(Lcom/google/android/gms/internal/ads/VA0;)Z

    move-result v1

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v5

    if-nez v1, :cond_3

    iget-boolean v6, v5, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-eqz v6, :cond_3

    const-wide/32 v6, 0x7a120

    cmp-long v3, v3, v6

    if-gez v3, :cond_3

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/SA0;->O:J

    const-wide/16 v6, 0x0

    cmp-long v3, v3, v6

    if-lez v3, :cond_3

    iget-object v1, v5, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v3, v3, Lcom/google/android/gms/internal/ads/sB0;->s:J

    const/4 v5, 0x0

    invoke-interface {v1, v3, v4, v5}, Lcom/google/android/gms/internal/ads/JH0;->j(JZ)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->H:Lcom/google/android/gms/internal/ads/WA0;

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/WA0;->d(Lcom/google/android/gms/internal/ads/VA0;)Z

    move-result v2

    goto :goto_4

    :cond_3
    move v2, v1

    :goto_4
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/SA0;->g0:Z

    if-eqz v2, :cond_4

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->o()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lcom/google/android/gms/internal/ads/XA0;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/XA0;-><init>()V

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/XA0;->e(J)Lcom/google/android/gms/internal/ads/XA0;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Pz0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v3

    iget v3, v3, Lcom/google/android/gms/internal/ads/qg;->a:F

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/XA0;->f(F)Lcom/google/android/gms/internal/ads/XA0;

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/SA0;->f0:J

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/XA0;->d(J)Lcom/google/android/gms/internal/ads/XA0;

    new-instance v3, Lcom/google/android/gms/internal/ads/ZA0;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, Lcom/google/android/gms/internal/ads/ZA0;-><init>(Lcom/google/android/gms/internal/ads/XA0;Lcom/google/android/gms/internal/ads/YA0;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/bB0;->k(Lcom/google/android/gms/internal/ads/ZA0;)V

    :cond_4
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->J()V

    return-void
.end method

.method private final r()V
    .locals 6

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->y()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->r()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/bB0;->d:Z

    if-eqz v1, :cond_0

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-eqz v1, :cond_4

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/JH0;->q()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->H:Lcom/google/android/gms/internal/ads/WA0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/JH0;->b()J

    move-result-wide v4

    goto :goto_0

    :cond_1
    const-wide/16 v4, 0x0

    :goto_0
    invoke-interface {v1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/WA0;->b(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;J)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/bB0;->d:Z

    if-nez v1, :cond_3

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/cB0;->b:J

    invoke-virtual {v0, p0, v1, v2}, Lcom/google/android/gms/internal/ads/bB0;->m(Lcom/google/android/gms/internal/ads/IH0;J)V

    return-void

    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/ads/XA0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/XA0;-><init>()V

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/XA0;->e(J)Lcom/google/android/gms/internal/ads/XA0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Pz0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/internal/ads/qg;->a:F

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/XA0;->f(F)Lcom/google/android/gms/internal/ads/XA0;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/SA0;->f0:J

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/XA0;->d(J)Lcom/google/android/gms/internal/ads/XA0;

    new-instance v2, Lcom/google/android/gms/internal/ads/ZA0;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/google/android/gms/internal/ads/ZA0;-><init>(Lcom/google/android/gms/internal/ads/XA0;Lcom/google/android/gms/internal/ads/YA0;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/bB0;->k(Lcom/google/android/gms/internal/ads/ZA0;)V

    :cond_4
    :goto_1
    return-void
.end method

.method private final s()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/OA0;->b(Lcom/google/android/gms/internal/ads/sB0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/OA0;->d(Lcom/google/android/gms/internal/ads/OA0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->t0:Lcom/google/android/gms/internal/ads/mA0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/mA0;->a:Lcom/google/android/gms/internal/ads/GA0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/GA0;->I(Lcom/google/android/gms/internal/ads/OA0;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/OA0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/OA0;-><init>(Lcom/google/android/gms/internal/ads/sB0;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    :cond_0
    return-void
.end method

.method private final t(I)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object p1, v0, p1

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/FB0;->i()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/FB0;->c()I

    throw v0
.end method

.method private final u(IZ)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->E:[Z

    aget-boolean v1, v0, p1

    if-eq v1, p2, :cond_0

    aput-boolean p2, v0, p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->X:Lcom/google/android/gms/internal/ads/xI;

    new-instance v1, Lcom/google/android/gms/internal/ads/IA0;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/IA0;-><init>(Lcom/google/android/gms/internal/ads/SA0;IZ)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/xI;->n(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private final v()V
    .locals 22

    .prologue
    move-object/from16 v10, p0

    iget-object v0, v10, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Pz0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/ads/qg;->a:F

    iget-object v1, v10, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v11, 0x1

    move v4, v11

    :goto_0
    if-eqz v2, :cond_f

    iget-boolean v5, v2, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-nez v5, :cond_0

    goto/16 :goto_a

    :cond_0
    iget-object v5, v10, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v6, v5, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-boolean v5, v5, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    invoke-virtual {v2, v0, v6, v5}, Lcom/google/android/gms/internal/ads/bB0;->j(FLcom/google/android/gms/internal/ads/qm;Z)Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v5

    iget-object v6, v10, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v6

    if-ne v2, v6, :cond_1

    move-object v13, v5

    goto :goto_1

    :cond_1
    move-object v13, v3

    :goto_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v3

    const/4 v9, 0x0

    if-eqz v3, :cond_5

    iget-object v6, v5, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    iget-object v7, v3, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    array-length v7, v7

    array-length v6, v6

    if-eq v7, v6, :cond_2

    goto :goto_4

    :cond_2
    move v6, v9

    :goto_2
    iget-object v7, v5, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    array-length v7, v7

    if-ge v6, v7, :cond_3

    invoke-virtual {v5, v3, v6}, Lcom/google/android/gms/internal/ads/QJ0;->a(Lcom/google/android/gms/internal/ads/QJ0;I)Z

    move-result v7

    if-eqz v7, :cond_5

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_3
    if-ne v2, v1, :cond_4

    goto :goto_3

    :cond_4
    move v9, v11

    :goto_3
    and-int/2addr v4, v9

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    move-object v3, v13

    goto :goto_0

    :cond_5
    :goto_4
    const/4 v8, 0x4

    const/4 v6, 0x2

    if-eqz v4, :cond_d

    iget-object v0, v10, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/ads/eB0;->F(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v16

    new-array v4, v6, [Z

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v10, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v14, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    move-object v12, v7

    move-object/from16 v17, v4

    invoke-virtual/range {v12 .. v17}, Lcom/google/android/gms/internal/ads/bB0;->b(Lcom/google/android/gms/internal/ads/QJ0;JZ[Z)J

    move-result-wide v12

    iget-object v0, v10, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v1, v0, Lcom/google/android/gms/internal/ads/sB0;->e:I

    if-eq v1, v8, :cond_6

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    cmp-long v0, v12, v0

    if-eqz v0, :cond_6

    move v14, v11

    goto :goto_5

    :cond_6
    move v14, v9

    :goto_5
    iget-object v0, v10, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/sB0;->c:J

    move-object/from16 v16, v7

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/sB0;->d:J

    const/16 v17, 0x5

    move-object/from16 v0, p0

    move-wide/from16 v18, v2

    move-wide v2, v12

    move-object/from16 v20, v4

    move-wide/from16 v4, v18

    move-object/from16 v21, v16

    const/4 v15, 0x2

    move v8, v14

    move/from16 v9, v17

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/ads/SA0;->c(Lcom/google/android/gms/internal/ads/LH0;JJJZI)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v0

    iput-object v0, v10, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    if-eqz v14, :cond_7

    invoke-direct {v10, v12, v13}, Lcom/google/android/gms/internal/ads/SA0;->z(J)V

    :cond_7
    new-array v0, v15, [Z

    const/4 v9, 0x0

    :goto_6
    iget-object v1, v10, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    if-ge v9, v15, :cond_c

    aget-object v1, v1, v9

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/FB0;->b()I

    move-result v1

    if-eq v11, v1, :cond_8

    const/4 v2, 0x0

    goto :goto_7

    :cond_8
    move v2, v11

    :goto_7
    aput-boolean v2, v0, v9

    if-eqz v1, :cond_a

    iget-object v1, v10, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object v1, v1, v9

    move-object/from16 v2, v21

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/FB0;->z(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v1

    if-nez v1, :cond_9

    invoke-direct {v10, v9}, Lcom/google/android/gms/internal/ads/SA0;->d(I)V

    goto :goto_8

    :cond_9
    aget-boolean v1, v20, v9

    if-eqz v1, :cond_b

    iget-object v1, v10, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object v1, v1, v9

    iget-wide v3, v10, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/ads/FB0;->n(J)V

    goto :goto_8

    :cond_a
    move-object/from16 v2, v21

    :cond_b
    :goto_8
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v21, v2

    goto :goto_6

    :cond_c
    iget-wide v1, v10, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-direct {v10, v0, v1, v2}, Lcom/google/android/gms/internal/ads/SA0;->i([ZJ)V

    goto :goto_9

    :cond_d
    move v15, v6

    iget-object v0, v10, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/eB0;->F(Lcom/google/android/gms/internal/ads/bB0;)Z

    iget-boolean v0, v2, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-eqz v0, :cond_e

    iget-object v0, v2, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/cB0;->b:J

    iget-wide v3, v10, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v6

    sub-long/2addr v3, v6

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const/4 v3, 0x0

    invoke-virtual {v2, v5, v0, v1, v3}, Lcom/google/android/gms/internal/ads/bB0;->a(Lcom/google/android/gms/internal/ads/QJ0;JZ)J

    :cond_e
    :goto_9
    invoke-direct {v10, v11}, Lcom/google/android/gms/internal/ads/SA0;->m(Z)V

    iget-object v0, v10, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v0, v0, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_f

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->q()V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->L()V

    iget-object v0, v10, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    invoke-interface {v0, v15}, Lcom/google/android/gms/internal/ads/xI;->K(I)Z

    :cond_f
    :goto_a
    return-void
.end method

.method private final w()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/SA0;->v()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/SA0;->C(Z)V

    return-void
.end method

.method private final x(ZZZZ)V
    .locals 34

    .prologue
    move-object/from16 v1, p0

    const-string v2, "ExoPlayerImplInternal"

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/4 v3, 0x2

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/xI;->k(I)V

    const/4 v4, 0x0

    iput-object v4, v1, Lcom/google/android/gms/internal/ads/SA0;->q0:Lcom/google/android/gms/internal/ads/Qz0;

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-direct {v1, v5, v6}, Lcom/google/android/gms/internal/ads/SA0;->N(ZZ)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Pz0;->h()V

    const-wide v7, 0xe8d4a51000L

    iput-wide v7, v1, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    :try_start_0
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->f()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v7, v0

    const-string v0, "Disable failed."

    invoke-static {v2, v0, v7}, Lcom/google/android/gms/internal/ads/eM;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    if-eqz p1, :cond_0

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    move v8, v5

    :goto_1
    if-ge v8, v3, :cond_0

    aget-object v0, v7, v8

    :try_start_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/FB0;->m()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v9, v0

    const-string v0, "Reset failed."

    invoke-static {v2, v0, v9}, Lcom/google/android/gms/internal/ads/eM;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    iput v5, v1, Lcom/google/android/gms/internal/ads/SA0;->k0:I

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/ads/SA0;->Q(Lcom/google/android/gms/internal/ads/sB0;Lcom/google/android/gms/internal/ads/pl;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_1
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/sB0;->s:J

    goto :goto_4

    :cond_2
    :goto_3
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/sB0;->c:J

    :goto_4
    if-eqz p2, :cond_3

    iput-object v4, v1, Lcom/google/android/gms/internal/ads/SA0;->l0:Lcom/google/android/gms/internal/ads/QA0;

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/SA0;->o0(Lcom/google/android/gms/internal/ads/qm;)Landroid/util/Pair;

    move-result-object v0

    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/internal/ads/LH0;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/LH0;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_3

    :goto_5
    move-wide/from16 v29, v7

    move-wide v10, v9

    goto :goto_6

    :cond_3
    move v6, v5

    goto :goto_5

    :goto_6
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->w()V

    iput-boolean v5, v1, Lcom/google/android/gms/internal/ads/SA0;->g0:Z

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    if-eqz p3, :cond_4

    instance-of v3, v0, Lcom/google/android/gms/internal/ads/yB0;

    if-eqz v3, :cond_4

    check-cast v0, Lcom/google/android/gms/internal/ads/yB0;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/SA0;->T:Lcom/google/android/gms/internal/ads/rB0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/rB0;->p()Lcom/google/android/gms/internal/ads/II0;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/yB0;->z(Lcom/google/android/gms/internal/ads/II0;)Lcom/google/android/gms/internal/ads/yB0;

    move-result-object v0

    iget v3, v2, Lcom/google/android/gms/internal/ads/LH0;->b:I

    const/4 v5, -0x1

    if-eq v3, v5, :cond_4

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v0, v3, v5}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    iget v3, v3, Lcom/google/android/gms/internal/ads/pl;->c:I

    const-wide/16 v7, 0x0

    invoke-virtual {v0, v3, v5, v7, v8}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/Ql;->b()Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v3, Lcom/google/android/gms/internal/ads/LH0;

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-wide v7, v2, Lcom/google/android/gms/internal/ads/LH0;->d:J

    invoke-direct {v3, v5, v7, v8}, Lcom/google/android/gms/internal/ads/LH0;-><init>(Ljava/lang/Object;J)V

    move-object v8, v0

    move-object/from16 v20, v3

    goto :goto_7

    :cond_4
    move-object v8, v0

    move-object/from16 v20, v2

    :goto_7
    new-instance v0, Lcom/google/android/gms/internal/ads/sB0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v14, v2, Lcom/google/android/gms/internal/ads/sB0;->e:I

    if-eqz p4, :cond_5

    :goto_8
    move-object v15, v4

    goto :goto_9

    :cond_5
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/sB0;->f:Lcom/google/android/gms/internal/ads/Qz0;

    goto :goto_8

    :goto_9
    if-eqz v6, :cond_6

    sget-object v3, Lcom/google/android/gms/internal/ads/PI0;->d:Lcom/google/android/gms/internal/ads/PI0;

    :goto_a
    move-object/from16 v17, v3

    goto :goto_b

    :cond_6
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/sB0;->h:Lcom/google/android/gms/internal/ads/PI0;

    goto :goto_a

    :goto_b
    if-eqz v6, :cond_7

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/SA0;->G:Lcom/google/android/gms/internal/ads/QJ0;

    :goto_c
    move-object/from16 v18, v3

    goto :goto_d

    :cond_7
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/sB0;->i:Lcom/google/android/gms/internal/ads/QJ0;

    goto :goto_c

    :goto_d
    if-eqz v6, :cond_8

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v2

    :goto_e
    move-object/from16 v19, v2

    goto :goto_f

    :cond_8
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/sB0;->j:Ljava/util/List;

    goto :goto_e

    :goto_f
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-boolean v3, v2, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    move/from16 v21, v3

    iget v3, v2, Lcom/google/android/gms/internal/ads/sB0;->m:I

    move/from16 v22, v3

    iget v3, v2, Lcom/google/android/gms/internal/ads/sB0;->n:I

    move/from16 v23, v3

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/sB0;->o:Lcom/google/android/gms/internal/ads/qg;

    move-object/from16 v24, v2

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v16, 0x0

    const-wide/16 v27, 0x0

    move-object v7, v0

    move-object/from16 v9, v20

    move-wide/from16 v12, v29

    move-wide/from16 v25, v29

    invoke-direct/range {v7 .. v33}, Lcom/google/android/gms/internal/ads/sB0;-><init>(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJILcom/google/android/gms/internal/ads/Qz0;ZLcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;Ljava/util/List;Lcom/google/android/gms/internal/ads/LH0;ZIILcom/google/android/gms/internal/ads/qg;JJJJZ)V

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    if-eqz p3, :cond_9

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->A()V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/SA0;->T:Lcom/google/android/gms/internal/ads/rB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rB0;->h()V

    :cond_9
    return-void
.end method

.method private final y()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/cB0;->h:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/SA0;->c0:Z

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/SA0;->d0:Z

    return-void
.end method

.method private final z(J)V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide v0, 0xe8d4a51000L

    :goto_0
    add-long/2addr p1, v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v0

    goto :goto_0

    :goto_1
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Pz0;->f(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    const/4 p2, 0x0

    move v0, p2

    :goto_2
    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    aget-object v1, p1, v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/FB0;->n(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object p1

    :goto_3
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    array-length v1, v0

    move v2, p2

    :goto_4
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object p1

    goto :goto_3

    :cond_3
    return-void
.end method


# virtual methods
.method public final X()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->L:Landroid/os/Looper;

    return-object v0
.end method

.method final synthetic Z()Ljava/lang/Boolean;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/SA0;->b0:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/qg;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/16 v1, 0x10

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/xI;->l(ILjava/lang/Object;)Lcom/google/android/gms/internal/ads/WH;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/WH;->a()V

    return-void
.end method

.method final synthetic a0(IZ)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/FB0;->c()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->W:Lcom/google/android/gms/internal/ads/KB0;

    invoke-interface {v1, p1, v0, p2}, Lcom/google/android/gms/internal/ads/KB0;->k(IIZ)V

    return-void
.end method

.method public final declared-synchronized b(Lcom/google/android/gms/internal/ads/wB0;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/SA0;->b0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->L:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/16 v1, 0xe

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/xI;->l(ILjava/lang/Object;)Lcom/google/android/gms/internal/ads/WH;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/WH;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_1
    const-string v0, "ExoPlayerImplInternal"

    const-string v1, "Ignoring messages sent after release."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/wB0;->h(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final b0()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/16 v1, 0x1d

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/xI;->B(I)Lcom/google/android/gms/internal/ads/WH;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/WH;->a()V

    return-void
.end method

.method public final c0(Lcom/google/android/gms/internal/ads/qm;IJ)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/QA0;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/QA0;-><init>(Lcom/google/android/gms/internal/ads/qm;IJ)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/4 p2, 0x3

    invoke-interface {p1, p2, v0}, Lcom/google/android/gms/internal/ads/xI;->l(ILjava/lang/Object;)Lcom/google/android/gms/internal/ads/WH;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/WH;->a()V

    return-void
.end method

.method public final d0(ZII)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    shl-int/lit8 p3, p3, 0x4

    or-int/2addr p2, p3

    const/4 p3, 0x1

    invoke-interface {v0, p3, p1, p2}, Lcom/google/android/gms/internal/ads/xI;->o(III)Lcom/google/android/gms/internal/ads/WH;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/WH;->a()V

    return-void
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/ads/HI0;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/16 v1, 0x9

    check-cast p1, Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/xI;->l(ILjava/lang/Object;)Lcom/google/android/gms/internal/ads/WH;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/WH;->a()V

    return-void
.end method

.method public final e0()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/xI;->B(I)Lcom/google/android/gms/internal/ads/WH;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/WH;->a()V

    return-void
.end method

.method public final declared-synchronized f0()Z
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/SA0;->b0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->L:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/xI;->K(I)Z

    new-instance v0, Lcom/google/android/gms/internal/ads/HA0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/HA0;-><init>(Lcom/google/android/gms/internal/ads/SA0;)V

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/SA0;->U:J

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/SA0;->O(Lcom/google/android/gms/internal/ads/Tg0;J)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/SA0;->b0:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/xI;->k(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/16 v1, 0x16

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/xI;->K(I)Z

    return-void
.end method

.method public final declared-synchronized g0(Ljava/lang/Object;J)Z
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/SA0;->b0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->L:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    new-instance v2, Landroid/util/Pair;

    invoke-direct {v2, p1, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p1, 0x1e

    invoke-interface {v1, p1, v2}, Lcom/google/android/gms/internal/ads/xI;->l(ILjava/lang/Object;)Lcom/google/android/gms/internal/ads/WH;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/WH;->a()V

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p2, v1

    if-eqz p1, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/ads/KA0;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/KA0;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/SA0;->O(Lcom/google/android/gms/internal/ads/Tg0;J)V

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final h0(Ljava/util/List;IJLcom/google/android/gms/internal/ads/II0;)V
    .locals 8

    new-instance v7, Lcom/google/android/gms/internal/ads/NA0;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v2, p5

    move v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/NA0;-><init>(Ljava/util/List;Lcom/google/android/gms/internal/ads/II0;IJLcom/google/android/gms/internal/ads/RA0;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/16 p2, 0x11

    invoke-interface {p1, p2, v7}, Lcom/google/android/gms/internal/ads/xI;->l(ILjava/lang/Object;)Lcom/google/android/gms/internal/ads/WH;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/WH;->a()V

    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 38

    .prologue
    move-object/from16 v11, p0

    move-object/from16 v1, p1

    const/4 v13, 0x0

    const/4 v14, 0x1

    :try_start_0
    iget v2, v1, Landroid/os/Message;->what:I

    const/16 v3, 0xf

    const/4 v15, -0x1

    const/4 v10, 0x0

    const/4 v9, 0x3

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x2

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    return v13

    :pswitch_1
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Landroid/util/Pair;

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    move v4, v13

    :goto_0
    if-ge v4, v5, :cond_0

    aget-object v6, v3, v4

    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/FB0;->r(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_42

    :catch_1
    move-exception v0

    move-object v1, v0

    goto/16 :goto_44

    :catch_2
    move-exception v0

    move-object v1, v0

    goto/16 :goto_46

    :catch_3
    move-exception v0

    move-object v1, v0

    goto/16 :goto_47

    :catch_4
    move-exception v0

    move-object v1, v0

    goto/16 :goto_49

    :catch_5
    move-exception v0

    move-object v1, v0

    goto/16 :goto_4a

    :cond_0
    if-eqz v1, :cond_1

    monitor-enter p0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Qz0; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lcom/google/android/gms/internal/ads/PF0; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lcom/google/android/gms/internal/ads/of; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/android/gms/internal/ads/Pi0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v1, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    :cond_1
    :goto_1
    move v2, v14

    goto/16 :goto_4e

    :catchall_0
    move-exception v0

    move-object v1, v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1

    :pswitch_2
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    invoke-virtual {v1, v14}, Lcom/google/android/gms/internal/ads/OA0;->a(I)V

    invoke-direct {v11, v13, v13, v13, v14}, Lcom/google/android/gms/internal/ads/SA0;->x(ZZZZ)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->H:Lcom/google/android/gms/internal/ads/WA0;

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->V:Lcom/google/android/gms/internal/ads/bE0;

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/WA0;->e(Lcom/google/android/gms/internal/ads/bE0;)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v1

    if-eq v14, v1, :cond_2

    move v8, v5

    goto :goto_2

    :cond_2
    const/4 v8, 0x4

    :goto_2
    invoke-direct {v11, v8}, Lcom/google/android/gms/internal/ads/SA0;->F(I)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->T:Lcom/google/android/gms/internal/ads/rB0;

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->I:Lcom/google/android/gms/internal/ads/XJ0;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/XJ0;->d()Lcom/google/android/gms/internal/ads/Pv0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/rB0;->g(Lcom/google/android/gms/internal/ads/Pv0;)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    :goto_3
    invoke-interface {v1, v5}, Lcom/google/android/gms/internal/ads/xI;->K(I)Z

    goto :goto_1

    :pswitch_3
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/aA0;

    iput-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->s0:Lcom/google/android/gms/internal/ads/aA0;

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/internal/ads/eB0;->B(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/aA0;)V

    goto :goto_1

    :pswitch_4
    iget v2, v1, Landroid/os/Message;->arg1:I

    iget v3, v1, Landroid/os/Message;->arg2:I

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v4, v11, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    invoke-virtual {v4, v14}, Lcom/google/android/gms/internal/ads/OA0;->a(I)V

    iget-object v4, v11, Lcom/google/android/gms/internal/ads/SA0;->T:Lcom/google/android/gms/internal/ads/rB0;

    invoke-virtual {v4, v2, v3, v1}, Lcom/google/android/gms/internal/ads/rB0;->c(IILjava/util/List;)Lcom/google/android/gms/internal/ads/qm;

    move-result-object v1

    :goto_4
    invoke-direct {v11, v1, v13}, Lcom/google/android/gms/internal/ads/SA0;->n(Lcom/google/android/gms/internal/ads/qm;Z)V

    goto :goto_1

    :pswitch_5
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->w()V

    goto :goto_1

    :pswitch_6
    iget v1, v1, Landroid/os/Message;->arg1:I

    if-eqz v1, :cond_3

    move v1, v14

    goto :goto_5

    :cond_3
    move v1, v13

    :goto_5
    iput-boolean v1, v11, Lcom/google/android/gms/internal/ads/SA0;->c0:Z

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->y()V

    iget-boolean v1, v11, Lcom/google/android/gms/internal/ads/SA0;->d0:Z

    if-eqz v1, :cond_1

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    if-eq v1, v2, :cond_1

    invoke-direct {v11, v14}, Lcom/google/android/gms/internal/ads/SA0;->C(Z)V

    :cond_4
    :goto_6
    invoke-direct {v11, v13}, Lcom/google/android/gms/internal/ads/SA0;->m(Z)V

    goto/16 :goto_1

    :pswitch_7
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->T:Lcom/google/android/gms/internal/ads/rB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rB0;->b()Lcom/google/android/gms/internal/ads/qm;

    move-result-object v1

    invoke-direct {v11, v1, v14}, Lcom/google/android/gms/internal/ads/SA0;->n(Lcom/google/android/gms/internal/ads/qm;Z)V

    goto/16 :goto_1

    :pswitch_8
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/II0;

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/ads/OA0;->a(I)V

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->T:Lcom/google/android/gms/internal/ads/rB0;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/rB0;->n(Lcom/google/android/gms/internal/ads/II0;)Lcom/google/android/gms/internal/ads/qm;

    move-result-object v1

    goto :goto_4

    :pswitch_9
    iget v2, v1, Landroid/os/Message;->arg1:I

    iget v3, v1, Landroid/os/Message;->arg2:I

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/II0;

    iget-object v4, v11, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    invoke-virtual {v4, v14}, Lcom/google/android/gms/internal/ads/OA0;->a(I)V

    iget-object v4, v11, Lcom/google/android/gms/internal/ads/SA0;->T:Lcom/google/android/gms/internal/ads/rB0;

    invoke-virtual {v4, v2, v3, v1}, Lcom/google/android/gms/internal/ads/rB0;->l(IILcom/google/android/gms/internal/ads/II0;)Lcom/google/android/gms/internal/ads/qm;

    move-result-object v1

    goto :goto_4

    :pswitch_a
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    invoke-virtual {v1, v14}, Lcom/google/android/gms/internal/ads/OA0;->a(I)V
    :try_end_2
    .catch Lcom/google/android/gms/internal/ads/Qz0; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lcom/google/android/gms/internal/ads/PF0; {:try_start_2 .. :try_end_2} :catch_4
    .catch Lcom/google/android/gms/internal/ads/of; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lcom/google/android/gms/internal/ads/Pi0; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    throw v10
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    :pswitch_b
    :try_start_4
    iget-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/internal/ads/NA0;

    iget v1, v1, Landroid/os/Message;->arg1:I

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    invoke-virtual {v3, v14}, Lcom/google/android/gms/internal/ads/OA0;->a(I)V

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->T:Lcom/google/android/gms/internal/ads/rB0;

    if-ne v1, v15, :cond_5

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/rB0;->a()I

    move-result v1

    :cond_5
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/NA0;->c(Lcom/google/android/gms/internal/ads/NA0;)Ljava/util/List;

    move-result-object v4

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/NA0;->d(Lcom/google/android/gms/internal/ads/NA0;)Lcom/google/android/gms/internal/ads/II0;

    move-result-object v2

    invoke-virtual {v3, v1, v4, v2}, Lcom/google/android/gms/internal/ads/rB0;->k(ILjava/util/List;Lcom/google/android/gms/internal/ads/II0;)Lcom/google/android/gms/internal/ads/qm;

    move-result-object v1

    goto/16 :goto_4

    :pswitch_c
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/NA0;

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/ads/OA0;->a(I)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/NA0;->a(Lcom/google/android/gms/internal/ads/NA0;)I

    move-result v2

    if-eq v2, v15, :cond_6

    new-instance v2, Lcom/google/android/gms/internal/ads/QA0;

    new-instance v3, Lcom/google/android/gms/internal/ads/yB0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/NA0;->c(Lcom/google/android/gms/internal/ads/NA0;)Ljava/util/List;

    move-result-object v4

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/NA0;->d(Lcom/google/android/gms/internal/ads/NA0;)Lcom/google/android/gms/internal/ads/II0;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/google/android/gms/internal/ads/yB0;-><init>(Ljava/util/Collection;Lcom/google/android/gms/internal/ads/II0;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/NA0;->a(Lcom/google/android/gms/internal/ads/NA0;)I

    move-result v4

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/NA0;->b(Lcom/google/android/gms/internal/ads/NA0;)J

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/internal/ads/QA0;-><init>(Lcom/google/android/gms/internal/ads/qm;IJ)V

    iput-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->l0:Lcom/google/android/gms/internal/ads/QA0;

    :cond_6
    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->T:Lcom/google/android/gms/internal/ads/rB0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/NA0;->c(Lcom/google/android/gms/internal/ads/NA0;)Ljava/util/List;

    move-result-object v3

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/NA0;->d(Lcom/google/android/gms/internal/ads/NA0;)Lcom/google/android/gms/internal/ads/II0;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/internal/ads/rB0;->m(Ljava/util/List;Lcom/google/android/gms/internal/ads/II0;)Lcom/google/android/gms/internal/ads/qm;

    move-result-object v1

    goto/16 :goto_4

    :pswitch_d
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/qg;

    invoke-direct {v11, v1, v13}, Lcom/google/android/gms/internal/ads/SA0;->o(Lcom/google/android/gms/internal/ads/qg;Z)V

    goto/16 :goto_1

    :pswitch_e
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/wB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/wB0;->b()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->isAlive()Z

    move-result v3

    if-nez v3, :cond_7

    const-string v2, "TAG"

    const-string v3, "Trying to send message on a dead thread."

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v13}, Lcom/google/android/gms/internal/ads/wB0;->h(Z)V

    goto/16 :goto_1

    :cond_7
    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->R:Lcom/google/android/gms/internal/ads/mD;

    invoke-interface {v3, v2, v10}, Lcom/google/android/gms/internal/ads/mD;->d(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lcom/google/android/gms/internal/ads/xI;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/LA0;

    invoke-direct {v3, v11, v1}, Lcom/google/android/gms/internal/ads/LA0;-><init>(Lcom/google/android/gms/internal/ads/SA0;Lcom/google/android/gms/internal/ads/wB0;)V

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/xI;->n(Ljava/lang/Runnable;)Z

    goto/16 :goto_1

    :pswitch_f
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/wB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/wB0;->b()Landroid/os/Looper;

    move-result-object v2

    iget-object v4, v11, Lcom/google/android/gms/internal/ads/SA0;->L:Landroid/os/Looper;

    if-ne v2, v4, :cond_9

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/SA0;->U(Lcom/google/android/gms/internal/ads/wB0;)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v1, v1, Lcom/google/android/gms/internal/ads/sB0;->e:I

    if-eq v1, v9, :cond_8

    if-ne v1, v5, :cond_1

    :cond_8
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    goto/16 :goto_3

    :cond_9
    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    invoke-interface {v2, v3, v1}, Lcom/google/android/gms/internal/ads/xI;->l(ILjava/lang/Object;)Lcom/google/android/gms/internal/ads/WH;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/WH;->a()V

    goto/16 :goto_1

    :pswitch_10
    iget v2, v1, Landroid/os/Message;->arg1:I

    if-eqz v2, :cond_a

    move v2, v14

    goto :goto_7

    :cond_a
    move v2, v13

    :goto_7
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-boolean v3, v11, Lcom/google/android/gms/internal/ads/SA0;->j0:Z

    if-eq v3, v2, :cond_c

    iput-boolean v2, v11, Lcom/google/android/gms/internal/ads/SA0;->j0:Z

    if-nez v2, :cond_c

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    move v3, v13

    :goto_8
    if-ge v3, v5, :cond_c

    aget-object v4, v2, v3

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/FB0;->b()I

    move-result v6

    if-nez v6, :cond_b

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/FB0;->m()V

    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_c
    if-eqz v1, :cond_1

    monitor-enter p0
    :try_end_4
    .catch Lcom/google/android/gms/internal/ads/Qz0; {:try_start_4 .. :try_end_4} :catch_5
    .catch Lcom/google/android/gms/internal/ads/PF0; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lcom/google/android/gms/internal/ads/of; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lcom/google/android/gms/internal/ads/Pi0; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    invoke-virtual {v1, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    move-object v1, v0

    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw v1

    :pswitch_11
    iget v1, v1, Landroid/os/Message;->arg1:I

    if-eqz v1, :cond_d

    move v1, v14

    goto :goto_9

    :cond_d
    move v1, v13

    :goto_9
    iput-boolean v1, v11, Lcom/google/android/gms/internal/ads/SA0;->i0:Z

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/internal/ads/eB0;->J(Lcom/google/android/gms/internal/ads/qm;Z)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-direct {v11, v14}, Lcom/google/android/gms/internal/ads/SA0;->C(Z)V

    goto/16 :goto_6

    :pswitch_12
    iget v1, v1, Landroid/os/Message;->arg1:I

    iput v1, v11, Lcom/google/android/gms/internal/ads/SA0;->h0:I

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/internal/ads/eB0;->I(Lcom/google/android/gms/internal/ads/qm;I)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-direct {v11, v14}, Lcom/google/android/gms/internal/ads/SA0;->C(Z)V

    goto/16 :goto_6

    :pswitch_13
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->v()V

    goto/16 :goto_1

    :pswitch_14
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/JH0;

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/eB0;->D(Lcom/google/android/gms/internal/ads/JH0;)Z

    move-result v2

    if-eqz v2, :cond_f

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    iget-wide v2, v11, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/eB0;->z(J)V

    :cond_e
    :goto_a
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->q()V

    goto/16 :goto_1

    :cond_f
    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/eB0;->E(Lcom/google/android/gms/internal/ads/JH0;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_b
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->r()V

    goto/16 :goto_1

    :pswitch_15
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/JH0;

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/eB0;->D(Lcom/google/android/gms/internal/ads/JH0;)Z

    move-result v2

    if-eqz v2, :cond_12

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->o()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    if-eqz v1, :cond_11

    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-nez v2, :cond_10

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Pz0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/internal/ads/qg;->a:F

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-boolean v3, v3, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    invoke-virtual {v1, v2, v4, v3}, Lcom/google/android/gms/internal/ads/bB0;->l(FLcom/google/android/gms/internal/ads/qm;Z)V

    :cond_10
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->h()Lcom/google/android/gms/internal/ads/PI0;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v4

    invoke-direct {v11, v2, v3, v4}, Lcom/google/android/gms/internal/ads/SA0;->K(Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/QJ0;)V

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    if-ne v1, v2, :cond_e

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/cB0;->b:J

    invoke-direct {v11, v2, v3}, Lcom/google/android/gms/internal/ads/SA0;->z(J)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->h()V

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v7, v1, Lcom/google/android/gms/internal/ads/cB0;->b:J

    iget-wide v5, v2, Lcom/google/android/gms/internal/ads/sB0;->c:J

    const/4 v9, 0x0

    const/4 v10, 0x5

    move-object/from16 v1, p0

    move-object v2, v3

    move-wide v3, v7

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/SA0;->c(Lcom/google/android/gms/internal/ads/LH0;JJJZI)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v1

    iput-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    goto :goto_a

    :cond_11
    throw v10

    :cond_12
    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/eB0;->q(Lcom/google/android/gms/internal/ads/JH0;)Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-boolean v3, v2, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    xor-int/2addr v3, v14

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Pz0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v3

    iget v3, v3, Lcom/google/android/gms/internal/ads/qg;->a:F

    iget-object v4, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v5, v4, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-boolean v4, v4, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    invoke-virtual {v2, v3, v5, v4}, Lcom/google/android/gms/internal/ads/bB0;->l(FLcom/google/android/gms/internal/ads/qm;Z)V

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/eB0;->E(Lcom/google/android/gms/internal/ads/JH0;)Z

    move-result v1
    :try_end_6
    .catch Lcom/google/android/gms/internal/ads/Qz0; {:try_start_6 .. :try_end_6} :catch_5
    .catch Lcom/google/android/gms/internal/ads/PF0; {:try_start_6 .. :try_end_6} :catch_4
    .catch Lcom/google/android/gms/internal/ads/of; {:try_start_6 .. :try_end_6} :catch_3
    .catch Lcom/google/android/gms/internal/ads/Pi0; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0

    if-eqz v1, :cond_1

    goto/16 :goto_b

    :pswitch_16
    :try_start_7
    invoke-direct {v11, v14, v13, v14, v13}, Lcom/google/android/gms/internal/ads/SA0;->x(ZZZZ)V

    move v1, v13

    :goto_c
    if-ge v1, v5, :cond_13

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->D:[Lcom/google/android/gms/internal/ads/DB0;

    aget-object v2, v2, v1

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/DB0;->s()V

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/FB0;->j()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_c

    :catchall_2
    move-exception v0

    move-object v1, v0

    goto :goto_d

    :cond_13
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->H:Lcom/google/android/gms/internal/ads/WA0;

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->V:Lcom/google/android/gms/internal/ads/bE0;

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/WA0;->i(Lcom/google/android/gms/internal/ads/bE0;)V

    invoke-direct {v11, v14}, Lcom/google/android/gms/internal/ads/SA0;->F(I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->K:Lcom/google/android/gms/internal/ads/tB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/tB0;->b()V

    monitor-enter p0
    :try_end_8
    .catch Lcom/google/android/gms/internal/ads/Qz0; {:try_start_8 .. :try_end_8} :catch_5
    .catch Lcom/google/android/gms/internal/ads/PF0; {:try_start_8 .. :try_end_8} :catch_4
    .catch Lcom/google/android/gms/internal/ads/of; {:try_start_8 .. :try_end_8} :catch_3
    .catch Lcom/google/android/gms/internal/ads/Pi0; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_0

    :try_start_9
    iput-boolean v14, v11, Lcom/google/android/gms/internal/ads/SA0;->b0:Z

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return v14

    :catchall_3
    move-exception v0

    move-object v1, v0

    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :try_start_a
    throw v1

    :goto_d
    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->K:Lcom/google/android/gms/internal/ads/tB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/tB0;->b()V

    monitor-enter p0
    :try_end_a
    .catch Lcom/google/android/gms/internal/ads/Qz0; {:try_start_a .. :try_end_a} :catch_5
    .catch Lcom/google/android/gms/internal/ads/PF0; {:try_start_a .. :try_end_a} :catch_4
    .catch Lcom/google/android/gms/internal/ads/of; {:try_start_a .. :try_end_a} :catch_3
    .catch Lcom/google/android/gms/internal/ads/Pi0; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_0

    :try_start_b
    iput-boolean v14, v11, Lcom/google/android/gms/internal/ads/SA0;->b0:Z

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :try_start_c
    throw v1
    :try_end_c
    .catch Lcom/google/android/gms/internal/ads/Qz0; {:try_start_c .. :try_end_c} :catch_5
    .catch Lcom/google/android/gms/internal/ads/PF0; {:try_start_c .. :try_end_c} :catch_4
    .catch Lcom/google/android/gms/internal/ads/of; {:try_start_c .. :try_end_c} :catch_3
    .catch Lcom/google/android/gms/internal/ads/Pi0; {:try_start_c .. :try_end_c} :catch_2
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_0

    :catchall_4
    move-exception v0

    move-object v1, v0

    :try_start_d
    monitor-exit p0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :try_start_e
    throw v1

    :pswitch_17
    invoke-direct {v11, v13, v14}, Lcom/google/android/gms/internal/ads/SA0;->H(ZZ)V

    goto/16 :goto_1

    :pswitch_18
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/GB0;

    iput-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Y:Lcom/google/android/gms/internal/ads/GB0;

    goto/16 :goto_1

    :pswitch_19
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/qg;

    invoke-direct {v11, v1}, Lcom/google/android/gms/internal/ads/SA0;->D(Lcom/google/android/gms/internal/ads/qg;)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Pz0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v1

    invoke-direct {v11, v1, v14}, Lcom/google/android/gms/internal/ads/SA0;->o(Lcom/google/android/gms/internal/ads/qg;Z)V

    goto/16 :goto_1

    :pswitch_1a
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/QA0;

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->a0:Lcom/google/android/gms/internal/ads/OA0;

    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/ads/OA0;->a(I)V

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v15, v2, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget v2, v11, Lcom/google/android/gms/internal/ads/SA0;->h0:I

    iget-boolean v3, v11, Lcom/google/android/gms/internal/ads/SA0;->i0:Z

    iget-object v4, v11, Lcom/google/android/gms/internal/ads/SA0;->M:Lcom/google/android/gms/internal/ads/Ql;

    iget-object v10, v11, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    const/16 v17, 0x1

    move-object/from16 v16, v1

    move/from16 v18, v2

    move/from16 v19, v3

    move-object/from16 v20, v4

    move-object/from16 v21, v10

    invoke-static/range {v15 .. v21}, Lcom/google/android/gms/internal/ads/SA0;->p0(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/QA0;ZIZLcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;)Landroid/util/Pair;

    move-result-object v2

    if-nez v2, :cond_14

    iget-object v10, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-direct {v11, v10}, Lcom/google/android/gms/internal/ads/SA0;->o0(Lcom/google/android/gms/internal/ads/qm;)Landroid/util/Pair;

    move-result-object v10

    iget-object v15, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v15, Lcom/google/android/gms/internal/ads/LH0;

    iget-object v10, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    iget-object v10, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v10

    xor-int/2addr v10, v14

    move-wide v12, v6

    move-object v9, v15

    move-wide/from16 v3, v16

    goto :goto_10

    :cond_14
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v15, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Long;

    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-wide v12, v1, Lcom/google/android/gms/internal/ads/QA0;->c:J

    cmp-long v12, v12, v6

    if-nez v12, :cond_15

    move-wide v12, v6

    goto :goto_e

    :cond_15
    move-wide v12, v3

    :goto_e
    iget-object v15, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    iget-object v9, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v9, v9, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v15, v9, v10, v3, v4}, Lcom/google/android/gms/internal/ads/eB0;->v(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;J)Lcom/google/android/gms/internal/ads/LH0;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v10

    if-eqz v10, :cond_17

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v4, v9, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v6, v11, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v3, v4, v6}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    iget v4, v9, Lcom/google/android/gms/internal/ads/LH0;->b:I

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/pl;->e(I)I

    move-result v3

    iget v4, v9, Lcom/google/android/gms/internal/ads/LH0;->c:I

    if-ne v3, v4, :cond_16

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->N:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/pl;->h()J

    :cond_16
    move v10, v14

    const-wide/16 v3, 0x0

    goto :goto_10

    :cond_17
    move-object/from16 p1, v9

    iget-wide v8, v1, Lcom/google/android/gms/internal/ads/QA0;->c:J
    :try_end_e
    .catch Lcom/google/android/gms/internal/ads/Qz0; {:try_start_e .. :try_end_e} :catch_5
    .catch Lcom/google/android/gms/internal/ads/PF0; {:try_start_e .. :try_end_e} :catch_4
    .catch Lcom/google/android/gms/internal/ads/of; {:try_start_e .. :try_end_e} :catch_3
    .catch Lcom/google/android/gms/internal/ads/Pi0; {:try_start_e .. :try_end_e} :catch_2
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_0

    cmp-long v6, v8, v6

    if-nez v6, :cond_18

    move v6, v14

    goto :goto_f

    :cond_18
    const/4 v6, 0x0

    :goto_f
    move-object/from16 v9, p1

    move v10, v6

    :goto_10
    :try_start_f
    iget-object v6, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v6

    if-eqz v6, :cond_19

    iput-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->l0:Lcom/google/android/gms/internal/ads/QA0;

    goto :goto_11

    :catchall_5
    move-exception v0

    move-object v1, v0

    goto/16 :goto_18

    :cond_19
    if-nez v2, :cond_1b

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v1, v1, Lcom/google/android/gms/internal/ads/sB0;->e:I

    if-eq v1, v14, :cond_1a

    const/4 v1, 0x4

    invoke-direct {v11, v1}, Lcom/google/android/gms/internal/ads/SA0;->F(I)V

    :cond_1a
    const/4 v1, 0x0

    invoke-direct {v11, v1, v14, v1, v14}, Lcom/google/android/gms/internal/ads/SA0;->x(ZZZZ)V

    :goto_11
    move-wide v7, v3

    goto/16 :goto_17

    :cond_1b
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v9, v1}, Lcom/google/android/gms/internal/ads/LH0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1e

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    if-eqz v1, :cond_1c

    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-eqz v2, :cond_1c

    const-wide/16 v6, 0x0

    cmp-long v2, v3, v6

    if-eqz v2, :cond_1c

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->Y:Lcom/google/android/gms/internal/ads/GB0;

    invoke-interface {v1, v3, v4, v2}, Lcom/google/android/gms/internal/ads/JH0;->i(JLcom/google/android/gms/internal/ads/GB0;)J

    move-result-wide v1

    goto :goto_12

    :cond_1c
    move-wide v1, v3

    :goto_12
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/EW;->N(J)J

    move-result-wide v6

    iget-object v8, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v14, v8, Lcom/google/android/gms/internal/ads/sB0;->s:J

    invoke-static {v14, v15}, Lcom/google/android/gms/internal/ads/EW;->N(J)J

    move-result-wide v14

    cmp-long v6, v6, v14

    if-nez v6, :cond_1f

    iget-object v6, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v7, v6, Lcom/google/android/gms/internal/ads/sB0;->e:I

    if-eq v7, v5, :cond_1d

    const/4 v14, 0x3

    if-ne v7, v14, :cond_1f

    :cond_1d
    iget-wide v7, v6, Lcom/google/android/gms/internal/ads/sB0;->s:J
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    const/4 v14, 0x2

    move-object/from16 v1, p0

    move-object v2, v9

    move-wide v3, v7

    move-wide v5, v12

    move v9, v10

    move v10, v14

    :try_start_10
    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/SA0;->c(Lcom/google/android/gms/internal/ads/LH0;JJJZI)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v1

    :goto_13
    iput-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;
    :try_end_10
    .catch Lcom/google/android/gms/internal/ads/Qz0; {:try_start_10 .. :try_end_10} :catch_5
    .catch Lcom/google/android/gms/internal/ads/PF0; {:try_start_10 .. :try_end_10} :catch_4
    .catch Lcom/google/android/gms/internal/ads/of; {:try_start_10 .. :try_end_10} :catch_3
    .catch Lcom/google/android/gms/internal/ads/Pi0; {:try_start_10 .. :try_end_10} :catch_2
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_0

    :goto_14
    const/4 v2, 0x1

    goto/16 :goto_4e

    :cond_1e
    move-wide v1, v3

    :cond_1f
    :try_start_11
    iget-object v5, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v5, v5, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/4 v8, 0x4

    if-ne v5, v8, :cond_20

    const/4 v5, 0x1

    goto :goto_15

    :cond_20
    const/4 v5, 0x0

    :goto_15
    invoke-direct {v11, v9, v1, v2, v5}, Lcom/google/android/gms/internal/ads/SA0;->m0(Lcom/google/android/gms/internal/ads/LH0;JZ)J

    move-result-wide v14
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    cmp-long v1, v3, v14

    if-eqz v1, :cond_21

    const/4 v1, 0x1

    goto :goto_16

    :cond_21
    const/4 v1, 0x0

    :goto_16
    or-int/2addr v10, v1

    :try_start_12
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    const/4 v8, 0x1

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v3, v9

    move-wide v6, v12

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/SA0;->M(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JZ)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    move-wide v7, v14

    :goto_17
    const/4 v14, 0x2

    move-object/from16 v1, p0

    move-object v2, v9

    move-wide v3, v7

    move-wide v5, v12

    move v9, v10

    move v10, v14

    :try_start_13
    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/SA0;->c(Lcom/google/android/gms/internal/ads/LH0;JJJZI)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v1

    goto :goto_13

    :catchall_6
    move-exception v0

    move-object v1, v0

    move-wide v7, v14

    move-object v14, v1

    goto :goto_19

    :goto_18
    move-object v14, v1

    move-wide v7, v3

    :goto_19
    const/4 v15, 0x2

    move-object/from16 v1, p0

    move-object v2, v9

    move-wide v3, v7

    move-wide v5, v12

    move v9, v10

    move v10, v15

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/SA0;->c(Lcom/google/android/gms/internal/ads/LH0;JJJZI)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v1

    iput-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    throw v14

    :pswitch_1b
    move v14, v9

    const/4 v8, 0x4

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v12

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    invoke-interface {v1, v5}, Lcom/google/android/gms/internal/ads/xI;->k(I)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v1

    if-nez v1, :cond_22

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->T:Lcom/google/android/gms/internal/ads/rB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rB0;->j()Z

    move-result v1

    if-nez v1, :cond_23

    :cond_22
    move v15, v14

    move v14, v5

    goto/16 :goto_2d

    :cond_23
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    iget-wide v2, v11, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/eB0;->z(J)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->G()Z

    move-result v1

    if-eqz v1, :cond_27

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    iget-wide v2, v11, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    iget-object v4, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/eB0;->t(JLcom/google/android/gms/internal/ads/sB0;)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object v1

    if-eqz v1, :cond_27

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/eB0;->n(Lcom/google/android/gms/internal/ads/cB0;)Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    iget-boolean v3, v2, Lcom/google/android/gms/internal/ads/bB0;->d:Z

    if-nez v3, :cond_24

    iget-wide v3, v1, Lcom/google/android/gms/internal/ads/cB0;->b:J

    invoke-virtual {v2, v11, v3, v4}, Lcom/google/android/gms/internal/ads/bB0;->m(Lcom/google/android/gms/internal/ads/IH0;J)V

    goto :goto_1a

    :cond_24
    iget-boolean v3, v2, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-eqz v3, :cond_25

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    const/16 v9, 0x8

    invoke-interface {v3, v9, v4}, Lcom/google/android/gms/internal/ads/xI;->l(ILjava/lang/Object;)Lcom/google/android/gms/internal/ads/WH;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/WH;->a()V

    :cond_25
    :goto_1a
    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v3

    if-ne v3, v2, :cond_26

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/cB0;->b:J

    invoke-direct {v11, v1, v2}, Lcom/google/android/gms/internal/ads/SA0;->z(J)V

    :cond_26
    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lcom/google/android/gms/internal/ads/SA0;->m(Z)V

    :cond_27
    iget-boolean v1, v11, Lcom/google/android/gms/internal/ads/SA0;->g0:Z

    if-eqz v1, :cond_28

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->o()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/SA0;->V(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v1

    iput-boolean v1, v11, Lcom/google/android/gms/internal/ads/SA0;->g0:Z

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->J()V

    goto :goto_1b

    :cond_28
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->q()V

    :goto_1b
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    if-nez v1, :cond_2a

    :cond_29
    move v14, v5

    move-wide v7, v6

    goto/16 :goto_24

    :cond_2a
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    if-eqz v2, :cond_2b

    iget-boolean v2, v11, Lcom/google/android/gms/internal/ads/SA0;->d0:Z

    if-eqz v2, :cond_2c

    :cond_2b
    move v14, v5

    move-wide v7, v6

    goto/16 :goto_20

    :cond_2c
    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    iget-boolean v3, v2, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-eqz v3, :cond_29

    const/4 v3, 0x0

    :goto_1c
    iget-object v4, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    if-ge v3, v5, :cond_2d

    aget-object v4, v4, v3

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/FB0;->v(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v4

    if-eqz v4, :cond_29

    add-int/lit8 v3, v3, 0x1

    goto :goto_1c

    :cond_2d
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-nez v2, :cond_2e

    iget-wide v2, v11, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/bB0;->f()J

    move-result-wide v20

    cmp-long v2, v2, v20

    if-ltz v2, :cond_29

    :cond_2e
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v9

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/eB0;->m()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v3

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v5, v4, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v22, 0x0

    move-object/from16 v23, v1

    move-object/from16 v1, p0

    move-object/from16 v24, v2

    move-object v10, v3

    move-object v3, v5

    move-object v5, v4

    move-object/from16 v4, v24

    move-object v15, v5

    const/4 v14, 0x2

    move-object/from16 v5, v23

    move-wide/from16 v6, v20

    move/from16 v8, v22

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/SA0;->M(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JZ)V

    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-eqz v1, :cond_31

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/JH0;->f()J

    move-result-wide v1

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v7

    if-eqz v1, :cond_30

    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/bB0;->f()J

    move-result-wide v1

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    const/4 v4, 0x0

    :goto_1d
    if-ge v4, v14, :cond_2f

    aget-object v5, v3, v4

    invoke-virtual {v5, v1, v2}, Lcom/google/android/gms/internal/ads/FB0;->o(J)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1d

    :cond_2f
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/bB0;->s()Z

    move-result v1

    if-nez v1, :cond_38

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1, v15}, Lcom/google/android/gms/internal/ads/eB0;->F(Lcom/google/android/gms/internal/ads/bB0;)Z

    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lcom/google/android/gms/internal/ads/SA0;->m(Z)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->q()V

    goto/16 :goto_24

    :cond_30
    :goto_1e
    const/4 v1, 0x0

    goto :goto_1f

    :cond_31
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_1e

    :goto_1f
    if-ge v1, v14, :cond_38

    invoke-virtual {v9, v1}, Lcom/google/android/gms/internal/ads/QJ0;->b(I)Z

    move-result v2

    invoke-virtual {v10, v1}, Lcom/google/android/gms/internal/ads/QJ0;->b(I)Z

    move-result v3

    if-eqz v2, :cond_33

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/FB0;->x()Z

    move-result v2

    if-nez v2, :cond_33

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->D:[Lcom/google/android/gms/internal/ads/DB0;

    aget-object v2, v2, v1

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/DB0;->b()I

    iget-object v2, v9, Lcom/google/android/gms/internal/ads/QJ0;->b:[Lcom/google/android/gms/internal/ads/EB0;

    aget-object v2, v2, v1

    iget-object v4, v10, Lcom/google/android/gms/internal/ads/QJ0;->b:[Lcom/google/android/gms/internal/ads/EB0;

    aget-object v4, v4, v1

    if-eqz v3, :cond_32

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/EB0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_33

    :cond_32
    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object v2, v2, v1

    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/bB0;->f()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/FB0;->o(J)V

    :cond_33
    add-int/lit8 v1, v1, 0x1

    goto :goto_1f

    :goto_20
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/cB0;->i:Z

    if-nez v2, :cond_34

    iget-boolean v2, v11, Lcom/google/android/gms/internal/ads/SA0;->d0:Z

    if-eqz v2, :cond_38

    :cond_34
    const/4 v2, 0x0

    :goto_21
    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    if-ge v2, v14, :cond_38

    aget-object v3, v3, v2

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/FB0;->z(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v4

    if-nez v4, :cond_35

    goto :goto_23

    :cond_35
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/FB0;->w()Z

    move-result v4

    if-eqz v4, :cond_37

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v4, v4, Lcom/google/android/gms/internal/ads/cB0;->e:J

    cmp-long v6, v4, v7

    if-eqz v6, :cond_36

    const-wide/high16 v9, -0x8000000000000000L

    cmp-long v6, v4, v9

    if-eqz v6, :cond_36

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v9

    add-long/2addr v4, v9

    goto :goto_22

    :cond_36
    move-wide v4, v7

    :goto_22
    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ads/FB0;->o(J)V

    :cond_37
    :goto_23
    add-int/lit8 v2, v2, 0x1

    goto :goto_21

    :cond_38
    :goto_24
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    if-eqz v1, :cond_3f

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    if-eq v2, v1, :cond_3f

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ads/bB0;->h:Z

    if-eqz v1, :cond_39

    goto :goto_27

    :cond_39
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_25
    iget-object v5, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    if-ge v3, v14, :cond_3e

    aget-object v5, v5, v3

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/FB0;->b()I

    move-result v6

    if-eqz v6, :cond_3d

    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/ads/FB0;->z(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v6

    const/4 v9, 0x1

    xor-int/2addr v6, v9

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/QJ0;->b(I)Z

    move-result v9

    if-eqz v9, :cond_3a

    if-eqz v6, :cond_3d

    :cond_3a
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/FB0;->x()Z

    move-result v6

    if-nez v6, :cond_3b

    iget-object v6, v2, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    aget-object v6, v6, v3

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/SA0;->T(Lcom/google/android/gms/internal/ads/IJ0;)[Lcom/google/android/gms/internal/ads/D;

    move-result-object v29

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/bB0;->c:[Lcom/google/android/gms/internal/ads/EI0;

    aget-object v30, v6, v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->f()J

    move-result-wide v31

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v33

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    move-object/from16 v28, v5

    move-object/from16 v35, v6

    invoke-virtual/range {v28 .. v35}, Lcom/google/android/gms/internal/ads/FB0;->l([Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/EI0;JJLcom/google/android/gms/internal/ads/LH0;)V

    goto :goto_26

    :cond_3b
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/FB0;->y()Z

    move-result v5

    if-eqz v5, :cond_3c

    invoke-direct {v11, v3}, Lcom/google/android/gms/internal/ads/SA0;->d(I)V

    goto :goto_26

    :cond_3c
    const/4 v4, 0x1

    :cond_3d
    :goto_26
    add-int/lit8 v3, v3, 0x1

    goto :goto_25

    :cond_3e
    if-nez v4, :cond_3f

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->h()V

    :cond_3f
    :goto_27
    const/4 v1, 0x0

    :goto_28
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->R()Z

    move-result v2

    if-nez v2, :cond_41

    :cond_40
    const/4 v15, 0x3

    goto/16 :goto_2c

    :cond_41
    iget-boolean v2, v11, Lcom/google/android/gms/internal/ads/SA0;->d0:Z

    if-nez v2, :cond_40

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    if-eqz v2, :cond_40

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    if-eqz v2, :cond_40

    iget-wide v3, v11, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bB0;->f()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-ltz v3, :cond_40

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/bB0;->h:Z

    if-eqz v2, :cond_40

    if-eqz v1, :cond_42

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->s()V

    :cond_42
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->l()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    if-eqz v1, :cond_48

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_44

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget v3, v2, Lcom/google/android/gms/internal/ads/LH0;->b:I

    const/4 v15, -0x1

    if-ne v3, v15, :cond_43

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget v4, v3, Lcom/google/android/gms/internal/ads/LH0;->b:I

    if-ne v4, v15, :cond_43

    iget v2, v2, Lcom/google/android/gms/internal/ads/LH0;->e:I

    iget v3, v3, Lcom/google/android/gms/internal/ads/LH0;->e:I

    if-eq v2, v3, :cond_43

    const/4 v2, 0x1

    goto :goto_2a

    :cond_43
    :goto_29
    const/4 v2, 0x0

    goto :goto_2a

    :cond_44
    const/4 v15, -0x1

    goto :goto_29

    :goto_2a
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v9, v1, Lcom/google/android/gms/internal/ads/cB0;->b:J

    iget-wide v5, v1, Lcom/google/android/gms/internal/ads/cB0;->c:J

    const/4 v1, 0x1

    xor-int/lit8 v17, v2, 0x1

    const/16 v20, 0x0

    move-object/from16 v1, p0

    move-object v2, v3

    move-wide v3, v9

    move-wide v7, v9

    const/4 v10, 0x3

    move/from16 v9, v17

    move v15, v10

    move/from16 v10, v20

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/SA0;->c(Lcom/google/android/gms/internal/ads/LH0;JJJZI)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v1

    iput-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->y()V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->L()V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v1, v1, Lcom/google/android/gms/internal/ads/sB0;->e:I

    if-ne v1, v15, :cond_45

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->G()V

    :cond_45
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v1

    const/4 v2, 0x0

    :goto_2b
    if-ge v2, v14, :cond_47

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/QJ0;->b(I)Z

    move-result v3

    if-eqz v3, :cond_46

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/FB0;->g()V

    :cond_46
    add-int/lit8 v2, v2, 0x1

    goto :goto_2b

    :cond_47
    const/4 v1, 0x1

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    goto/16 :goto_28

    :cond_48
    const/4 v1, 0x0

    throw v1

    :goto_2c
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->s0:Lcom/google/android/gms/internal/ads/aA0;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/aA0;->a:J

    :goto_2d
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v1, v1, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_77

    const/4 v2, 0x4

    if-ne v1, v2, :cond_49

    goto/16 :goto_14

    :cond_49
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    if-nez v1, :cond_4a

    invoke-direct {v11, v12, v13}, Lcom/google/android/gms/internal/ads/SA0;->B(J)V

    goto/16 :goto_14

    :cond_4a
    const-string v3, "doSomeWork"

    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->L()V

    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-eqz v3, :cond_4f

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/EW;->K(J)J

    move-result-wide v3

    iput-wide v3, v11, Lcom/google/android/gms/internal/ads/SA0;->n0:J

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    iget-object v4, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v4, v4, Lcom/google/android/gms/internal/ads/sB0;->s:J

    iget-wide v6, v11, Lcom/google/android/gms/internal/ads/SA0;->O:J

    sub-long/2addr v4, v6

    const/4 v6, 0x0

    invoke-interface {v3, v4, v5, v6}, Lcom/google/android/gms/internal/ads/JH0;->j(JZ)V

    move v5, v6

    const/4 v3, 0x1

    const/4 v4, 0x1

    :goto_2e
    iget-object v7, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    if-ge v5, v14, :cond_50

    aget-object v7, v7, v5

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/FB0;->b()I

    move-result v8

    if-nez v8, :cond_4b

    invoke-direct {v11, v5, v6}, Lcom/google/android/gms/internal/ads/SA0;->u(IZ)V

    goto :goto_31

    :cond_4b
    iget-wide v8, v11, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    iget-wide v14, v11, Lcom/google/android/gms/internal/ads/SA0;->n0:J

    invoke-virtual {v7, v8, v9, v14, v15}, Lcom/google/android/gms/internal/ads/FB0;->k(JJ)V

    if-eqz v3, :cond_4c

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/FB0;->y()Z

    move-result v3

    if-eqz v3, :cond_4c

    const/4 v3, 0x1

    goto :goto_2f

    :cond_4c
    const/4 v3, 0x0

    :goto_2f
    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/ads/FB0;->u(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v6

    invoke-direct {v11, v5, v6}, Lcom/google/android/gms/internal/ads/SA0;->u(IZ)V

    if-eqz v4, :cond_4d

    if-eqz v6, :cond_4d

    const/4 v4, 0x1

    goto :goto_30

    :cond_4d
    const/4 v4, 0x0

    :goto_30
    if-nez v6, :cond_4e

    invoke-direct {v11, v5}, Lcom/google/android/gms/internal/ads/SA0;->t(I)V

    :cond_4e
    :goto_31
    add-int/lit8 v5, v5, 0x1

    const/4 v6, 0x0

    const/4 v14, 0x2

    const/4 v15, 0x3

    goto :goto_2e

    :cond_4f
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/JH0;->k()V

    const/4 v3, 0x1

    const/4 v4, 0x1

    :cond_50
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v5, v5, Lcom/google/android/gms/internal/ads/cB0;->e:J

    if-eqz v3, :cond_54

    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-eqz v3, :cond_54

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v5, v7

    if-eqz v3, :cond_51

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-wide v14, v3, Lcom/google/android/gms/internal/ads/sB0;->s:J

    cmp-long v3, v5, v14

    if-gtz v3, :cond_55

    :cond_51
    iget-boolean v3, v11, Lcom/google/android/gms/internal/ads/SA0;->d0:Z

    if-eqz v3, :cond_52

    const/4 v3, 0x0

    iput-boolean v3, v11, Lcom/google/android/gms/internal/ads/SA0;->d0:Z

    iget-object v5, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v5, v5, Lcom/google/android/gms/internal/ads/sB0;->n:I

    const/4 v6, 0x5

    invoke-direct {v11, v3, v5, v3, v6}, Lcom/google/android/gms/internal/ads/SA0;->E(ZIZI)V

    :cond_52
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-boolean v3, v3, Lcom/google/android/gms/internal/ads/cB0;->i:Z

    if-eqz v3, :cond_55

    invoke-direct {v11, v2}, Lcom/google/android/gms/internal/ads/SA0;->F(I)V

    :cond_53
    :goto_32
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->I()V

    goto/16 :goto_3b

    :cond_54
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    :cond_55
    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v5, v3, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/4 v6, 0x2

    if-ne v5, v6, :cond_5c

    iget v5, v11, Lcom/google/android/gms/internal/ads/SA0;->k0:I

    if-nez v5, :cond_56

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->P()Z

    move-result v3

    goto/16 :goto_36

    :cond_56
    if-nez v4, :cond_57

    goto/16 :goto_37

    :cond_57
    iget-boolean v3, v3, Lcom/google/android/gms/internal/ads/sB0;->g:Z

    if-eqz v3, :cond_5b

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v3

    iget-object v5, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v6, v3, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-direct {v11, v5, v6}, Lcom/google/android/gms/internal/ads/SA0;->S(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)Z

    move-result v5

    if-eqz v5, :cond_58

    iget-object v5, v11, Lcom/google/android/gms/internal/ads/SA0;->u0:Lcom/google/android/gms/internal/ads/Jz0;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/Jz0;->b()J

    move-result-wide v5

    move-wide/from16 v36, v5

    goto :goto_33

    :cond_58
    move-wide/from16 v36, v7

    :goto_33
    iget-object v5, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/eB0;->o()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/bB0;->s()Z

    move-result v6

    if-eqz v6, :cond_59

    iget-object v6, v5, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-boolean v6, v6, Lcom/google/android/gms/internal/ads/cB0;->i:Z

    if-eqz v6, :cond_59

    const/4 v6, 0x1

    goto :goto_34

    :cond_59
    const/4 v6, 0x0

    :goto_34
    iget-object v9, v5, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v9, v9, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v9

    if-eqz v9, :cond_5a

    iget-boolean v9, v5, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-nez v9, :cond_5a

    const/4 v9, 0x1

    goto :goto_35

    :cond_5a
    const/4 v9, 0x0

    :goto_35
    if-nez v6, :cond_5b

    if-nez v9, :cond_5b

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/bB0;->c()J

    move-result-wide v5

    invoke-direct {v11, v5, v6}, Lcom/google/android/gms/internal/ads/SA0;->l0(J)J

    move-result-wide v31

    iget-object v5, v11, Lcom/google/android/gms/internal/ads/SA0;->H:Lcom/google/android/gms/internal/ads/WA0;

    new-instance v6, Lcom/google/android/gms/internal/ads/VA0;

    iget-object v9, v11, Lcom/google/android/gms/internal/ads/SA0;->V:Lcom/google/android/gms/internal/ads/bE0;

    iget-object v14, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-object v14, v14, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v15, v3, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v15, v15, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v7, v11, Lcom/google/android/gms/internal/ads/SA0;->m0:J

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v22

    sub-long v29, v7, v22

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Pz0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v3

    iget v3, v3, Lcom/google/android/gms/internal/ads/qg;->a:F

    iget-object v7, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-boolean v7, v7, Lcom/google/android/gms/internal/ads/sB0;->l:Z

    iget-boolean v8, v11, Lcom/google/android/gms/internal/ads/SA0;->e0:Z

    move-object/from16 v25, v6

    move-object/from16 v26, v9

    move-object/from16 v27, v14

    move-object/from16 v28, v15

    move/from16 v33, v3

    move/from16 v34, v7

    move/from16 v35, v8

    invoke-direct/range {v25 .. v37}, Lcom/google/android/gms/internal/ads/VA0;-><init>(Lcom/google/android/gms/internal/ads/bE0;Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJFZZJ)V

    invoke-interface {v5, v6}, Lcom/google/android/gms/internal/ads/WA0;->h(Lcom/google/android/gms/internal/ads/VA0;)Z

    move-result v3

    :goto_36
    if-eqz v3, :cond_5c

    :cond_5b
    const/4 v3, 0x3

    invoke-direct {v11, v3}, Lcom/google/android/gms/internal/ads/SA0;->F(I)V

    const/4 v3, 0x0

    iput-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->q0:Lcom/google/android/gms/internal/ads/Qz0;

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->R()Z

    move-result v3

    if-eqz v3, :cond_60

    const/4 v3, 0x0

    invoke-direct {v11, v3, v3}, Lcom/google/android/gms/internal/ads/SA0;->N(ZZ)V

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->P:Lcom/google/android/gms/internal/ads/Pz0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Pz0;->g()V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->G()V

    goto :goto_3b

    :cond_5c
    :goto_37
    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v3, v3, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/4 v5, 0x3

    if-ne v3, v5, :cond_60

    iget v3, v11, Lcom/google/android/gms/internal/ads/SA0;->k0:I

    if-nez v3, :cond_5d

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->P()Z

    move-result v3

    if-nez v3, :cond_60

    goto :goto_38

    :cond_5d
    if-nez v4, :cond_60

    :goto_38
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->R()Z

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v11, v3, v4}, Lcom/google/android/gms/internal/ads/SA0;->N(ZZ)V

    const/4 v3, 0x2

    invoke-direct {v11, v3}, Lcom/google/android/gms/internal/ads/SA0;->F(I)V

    iget-boolean v3, v11, Lcom/google/android/gms/internal/ads/SA0;->e0:Z

    if-eqz v3, :cond_53

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v3

    :goto_39
    if-eqz v3, :cond_5f

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/bB0;->i()Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object v4

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    array-length v5, v4

    const/4 v6, 0x0

    :goto_3a
    if-ge v6, v5, :cond_5e

    aget-object v7, v4, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_3a

    :cond_5e
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v3

    goto :goto_39

    :cond_5f
    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->u0:Lcom/google/android/gms/internal/ads/Jz0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Jz0;->c()V

    goto/16 :goto_32

    :cond_60
    :goto_3b
    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v3, v3, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_65

    const/4 v3, 0x0

    :goto_3c
    iget-object v5, v11, Lcom/google/android/gms/internal/ads/SA0;->C:[Lcom/google/android/gms/internal/ads/FB0;

    if-ge v3, v4, :cond_62

    aget-object v4, v5, v3

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/FB0;->z(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v4

    if-eqz v4, :cond_61

    invoke-direct {v11, v3}, Lcom/google/android/gms/internal/ads/SA0;->t(I)V

    :cond_61
    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x2

    goto :goto_3c

    :cond_62
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/sB0;->g:Z

    if-nez v3, :cond_65

    iget-wide v3, v1, Lcom/google/android/gms/internal/ads/sB0;->r:J

    const-wide/32 v5, 0x7a120

    cmp-long v1, v3, v5

    if-gez v1, :cond_65

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->o()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/SA0;->V(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v1

    if-eqz v1, :cond_65

    iget-wide v3, v11, Lcom/google/android/gms/internal/ads/SA0;->r0:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v3, v5

    if-nez v1, :cond_63

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    :goto_3d
    iput-wide v3, v11, Lcom/google/android/gms/internal/ads/SA0;->r0:J

    goto :goto_3e

    :cond_63
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-wide v5, v11, Lcom/google/android/gms/internal/ads/SA0;->r0:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0xfa0

    cmp-long v1, v3, v5

    if-gez v1, :cond_64

    goto :goto_3e

    :cond_64
    const-string v1, "Playback stuck buffering and not loading"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_65
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_3d

    :goto_3e
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->R()Z

    move-result v1

    if-eqz v1, :cond_66

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget v1, v1, Lcom/google/android/gms/internal/ads/sB0;->e:I

    const/4 v3, 0x3

    if-ne v1, v3, :cond_66

    const/4 v1, 0x1

    goto :goto_3f

    :cond_66
    const/4 v1, 0x0

    :goto_3f
    iget-object v3, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    iget-boolean v4, v3, Lcom/google/android/gms/internal/ads/sB0;->p:Z

    iget v3, v3, Lcom/google/android/gms/internal/ads/sB0;->e:I

    if-ne v3, v2, :cond_67

    goto :goto_40

    :cond_67
    if-nez v1, :cond_68

    const/4 v1, 0x2

    if-eq v3, v1, :cond_68

    const/4 v1, 0x3

    if-ne v3, v1, :cond_69

    iget v1, v11, Lcom/google/android/gms/internal/ads/SA0;->k0:I

    if-eqz v1, :cond_69

    :cond_68
    invoke-direct {v11, v12, v13}, Lcom/google/android/gms/internal/ads/SA0;->B(J)V

    :cond_69
    :goto_40
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto/16 :goto_14

    :pswitch_1c
    iget v2, v1, Landroid/os/Message;->arg1:I

    if-eqz v2, :cond_6a

    const/4 v2, 0x1

    goto :goto_41

    :cond_6a
    const/4 v2, 0x0

    :goto_41
    iget v1, v1, Landroid/os/Message;->arg2:I

    shr-int/lit8 v4, v1, 0x4

    and-int/2addr v1, v3

    const/4 v3, 0x1

    invoke-direct {v11, v2, v4, v3, v1}, Lcom/google/android/gms/internal/ads/SA0;->E(ZIZI)V
    :try_end_13
    .catch Lcom/google/android/gms/internal/ads/Qz0; {:try_start_13 .. :try_end_13} :catch_5
    .catch Lcom/google/android/gms/internal/ads/PF0; {:try_start_13 .. :try_end_13} :catch_4
    .catch Lcom/google/android/gms/internal/ads/of; {:try_start_13 .. :try_end_13} :catch_3
    .catch Lcom/google/android/gms/internal/ads/Pi0; {:try_start_13 .. :try_end_13} :catch_2
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_0

    goto/16 :goto_14

    :goto_42
    instance-of v2, v1, Ljava/lang/IllegalStateException;

    const/16 v3, 0x3ec

    if-nez v2, :cond_6b

    instance-of v2, v1, Ljava/lang/IllegalArgumentException;

    if-eqz v2, :cond_6c

    :cond_6b
    move v12, v3

    goto :goto_43

    :cond_6c
    const/16 v12, 0x3e8

    :goto_43
    invoke-static {v1, v12}, Lcom/google/android/gms/internal/ads/Qz0;->d(Ljava/lang/RuntimeException;I)Lcom/google/android/gms/internal/ads/Qz0;

    move-result-object v1

    const-string v2, "ExoPlayerImplInternal"

    const-string v3, "Playback error"

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/ads/eM;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v11, v3, v2}, Lcom/google/android/gms/internal/ads/SA0;->H(ZZ)V

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/sB0;->d(Lcom/google/android/gms/internal/ads/Qz0;)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v1

    iput-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    goto/16 :goto_14

    :goto_44
    const/16 v2, 0x7d0

    :goto_45
    invoke-direct {v11, v1, v2}, Lcom/google/android/gms/internal/ads/SA0;->k(Ljava/io/IOException;I)V

    goto/16 :goto_14

    :goto_46
    iget v2, v1, Lcom/google/android/gms/internal/ads/Pi0;->C:I

    goto :goto_45

    :goto_47
    iget v2, v1, Lcom/google/android/gms/internal/ads/of;->D:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_6e

    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/of;->C:Z

    if-eq v3, v2, :cond_6d

    const/16 v12, 0xbbb

    goto :goto_48

    :cond_6d
    const/16 v12, 0xbb9

    goto :goto_48

    :cond_6e
    const/16 v12, 0x3e8

    :goto_48
    invoke-direct {v11, v1, v12}, Lcom/google/android/gms/internal/ads/SA0;->k(Ljava/io/IOException;I)V

    goto/16 :goto_14

    :goto_49
    iget v2, v1, Lcom/google/android/gms/internal/ads/PF0;->C:I

    goto :goto_45

    :goto_4a
    iget v2, v1, Lcom/google/android/gms/internal/ads/Qz0;->E:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_6f

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    if-eqz v2, :cond_6f

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/Qz0;->a(Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/Qz0;

    move-result-object v1

    :cond_6f
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/Qz0;->K:Z

    if-eqz v2, :cond_72

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->q0:Lcom/google/android/gms/internal/ads/Qz0;

    if-eqz v2, :cond_70

    iget v2, v1, Lcom/google/android/gms/internal/ads/Pf;->C:I

    const/16 v3, 0x138c

    if-eq v2, v3, :cond_70

    const/16 v3, 0x138b

    if-ne v2, v3, :cond_72

    :cond_70
    const-string v2, "ExoPlayerImplInternal"

    const-string v3, "Recoverable renderer error"

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/ads/eM;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->q0:Lcom/google/android/gms/internal/ads/Qz0;

    if-eqz v2, :cond_71

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->q0:Lcom/google/android/gms/internal/ads/Qz0;

    goto :goto_4b

    :cond_71
    iput-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->q0:Lcom/google/android/gms/internal/ads/Qz0;

    :goto_4b
    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/16 v3, 0x19

    invoke-interface {v2, v3, v1}, Lcom/google/android/gms/internal/ads/xI;->l(ILjava/lang/Object;)Lcom/google/android/gms/internal/ads/WH;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/xI;->p(Lcom/google/android/gms/internal/ads/WH;)Z

    goto/16 :goto_14

    :cond_72
    iget-object v2, v11, Lcom/google/android/gms/internal/ads/SA0;->q0:Lcom/google/android/gms/internal/ads/Qz0;

    if-eqz v2, :cond_73

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->q0:Lcom/google/android/gms/internal/ads/Qz0;

    :cond_73
    move-object v12, v1

    const-string v1, "ExoPlayerImplInternal"

    const-string v2, "Playback error"

    invoke-static {v1, v2, v12}, Lcom/google/android/gms/internal/ads/eM;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget v1, v12, Lcom/google/android/gms/internal/ads/Qz0;->E:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_76

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    if-eq v2, v1, :cond_75

    :goto_4c
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->s()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    if-eq v2, v1, :cond_74

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->l()Lcom/google/android/gms/internal/ads/bB0;

    goto :goto_4c

    :cond_74
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->S:Lcom/google/android/gms/internal/ads/eB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eB0;->p()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->s()V

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v7, v1, Lcom/google/android/gms/internal/ads/cB0;->b:J

    iget-wide v5, v1, Lcom/google/android/gms/internal/ads/cB0;->c:J

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object/from16 v1, p0

    move-wide v3, v7

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/SA0;->c(Lcom/google/android/gms/internal/ads/LH0;JJJZI)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v1

    iput-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    :cond_75
    const/4 v1, 0x0

    const/4 v2, 0x1

    goto :goto_4d

    :cond_76
    const/4 v1, 0x0

    :goto_4d
    invoke-direct {v11, v2, v1}, Lcom/google/android/gms/internal/ads/SA0;->H(ZZ)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    invoke-virtual {v1, v12}, Lcom/google/android/gms/internal/ads/sB0;->d(Lcom/google/android/gms/internal/ads/Qz0;)Lcom/google/android/gms/internal/ads/sB0;

    move-result-object v1

    iput-object v1, v11, Lcom/google/android/gms/internal/ads/SA0;->Z:Lcom/google/android/gms/internal/ads/sB0;

    :cond_77
    :goto_4e
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/SA0;->s()V

    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final j()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/xI;->K(I)Z

    return-void
.end method

.method public final l(Lcom/google/android/gms/internal/ads/JH0;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SA0;->J:Lcom/google/android/gms/internal/ads/xI;

    const/16 v1, 0x8

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/xI;->l(ILjava/lang/Object;)Lcom/google/android/gms/internal/ads/WH;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/WH;->a()V

    return-void
.end method
