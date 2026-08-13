.class final Lcom/google/android/gms/internal/ads/qI0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/JH0;
.implements Lcom/google/android/gms/internal/ads/w0;
.implements Lcom/google/android/gms/internal/ads/eK0;
.implements Lcom/google/android/gms/internal/ads/iK0;
.implements Lcom/google/android/gms/internal/ads/BI0;


# static fields
.field private static final p0:Ljava/util/Map;

.field private static final q0:Lcom/google/android/gms/internal/ads/D;


# instance fields
.field private final C:Landroid/net/Uri;

.field private final D:Lcom/google/android/gms/internal/ads/pi0;

.field private final E:Lcom/google/android/gms/internal/ads/XF0;

.field private final F:Lcom/google/android/gms/internal/ads/VH0;

.field private final G:Lcom/google/android/gms/internal/ads/SF0;

.field private final H:Lcom/google/android/gms/internal/ads/mI0;

.field private final I:J

.field private final J:J

.field private final K:Lcom/google/android/gms/internal/ads/mK0;

.field private final L:Lcom/google/android/gms/internal/ads/eI0;

.field private final M:Lcom/google/android/gms/internal/ads/QE;

.field private final N:Ljava/lang/Runnable;

.field private final O:Ljava/lang/Runnable;

.field private final P:Landroid/os/Handler;

.field private Q:Lcom/google/android/gms/internal/ads/IH0;

.field private R:Lcom/google/android/gms/internal/ads/a2;

.field private S:[Lcom/google/android/gms/internal/ads/DI0;

.field private T:[Lcom/google/android/gms/internal/ads/oI0;

.field private U:Z

.field private V:Z

.field private W:Z

.field private X:Z

.field private Y:Lcom/google/android/gms/internal/ads/pI0;

.field private Z:Lcom/google/android/gms/internal/ads/T0;

.field private a0:J

.field private b0:Z

.field private c0:I

.field private d0:Z

.field private e0:Z

.field private f0:Z

.field private g0:I

.field private h0:Z

.field private i0:J

.field private j0:J

.field private k0:Z

.field private l0:I

.field private m0:Z

.field private n0:Z

.field private final o0:Lcom/google/android/gms/internal/ads/YJ0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "Icy-MetaData"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/qI0;->p0:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    const-string v1, "icy"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/oK0;->m(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    const-string v1, "application/x-icy"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/qI0;->q0:Lcom/google/android/gms/internal/ads/D;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lcom/google/android/gms/internal/ads/pi0;Lcom/google/android/gms/internal/ads/eI0;Lcom/google/android/gms/internal/ads/XF0;Lcom/google/android/gms/internal/ads/SF0;Lcom/google/android/gms/internal/ads/cK0;Lcom/google/android/gms/internal/ads/VH0;Lcom/google/android/gms/internal/ads/mI0;Lcom/google/android/gms/internal/ads/YJ0;Ljava/lang/String;IZJLcom/google/android/gms/internal/ads/vK0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->C:Landroid/net/Uri;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/qI0;->D:Lcom/google/android/gms/internal/ads/pi0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/qI0;->E:Lcom/google/android/gms/internal/ads/XF0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/qI0;->G:Lcom/google/android/gms/internal/ads/SF0;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/qI0;->F:Lcom/google/android/gms/internal/ads/VH0;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/qI0;->H:Lcom/google/android/gms/internal/ads/mI0;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/qI0;->o0:Lcom/google/android/gms/internal/ads/YJ0;

    int-to-long p1, p11

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/qI0;->I:J

    new-instance p1, Lcom/google/android/gms/internal/ads/mK0;

    const-string p2, "ProgressiveMediaPeriod"

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/mK0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->K:Lcom/google/android/gms/internal/ads/mK0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/qI0;->L:Lcom/google/android/gms/internal/ads/eI0;

    iput-wide p13, p0, Lcom/google/android/gms/internal/ads/qI0;->J:J

    new-instance p1, Lcom/google/android/gms/internal/ads/QE;

    sget-object p2, Lcom/google/android/gms/internal/ads/mD;->a:Lcom/google/android/gms/internal/ads/mD;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/QE;-><init>(Lcom/google/android/gms/internal/ads/mD;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->M:Lcom/google/android/gms/internal/ads/QE;

    new-instance p1, Lcom/google/android/gms/internal/ads/hI0;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/hI0;-><init>(Lcom/google/android/gms/internal/ads/qI0;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->N:Ljava/lang/Runnable;

    new-instance p1, Lcom/google/android/gms/internal/ads/iI0;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/iI0;-><init>(Lcom/google/android/gms/internal/ads/qI0;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->O:Ljava/lang/Runnable;

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/EW;->Q(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->P:Landroid/os/Handler;

    const/4 p1, 0x0

    new-array p2, p1, [Lcom/google/android/gms/internal/ads/oI0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/qI0;->T:[Lcom/google/android/gms/internal/ads/oI0;

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/DI0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/qI0;->j0:J

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/qI0;->c0:I

    return-void
.end method

.method private final B()I
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/DI0;->y()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method private final C(Z)J
    .locals 5

    .prologue
    const/4 v0, 0x0

    const-wide/high16 v1, -0x8000000000000000L

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v4, v3

    if-ge v0, v4, :cond_2

    if-nez p1, :cond_0

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/qI0;->Y:Lcom/google/android/gms/internal/ads/pI0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/pI0;->c:[Z

    aget-boolean v4, v4, v0

    if-eqz v4, :cond_1

    :cond_0
    aget-object v3, v3, v0

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/DI0;->A()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-wide v1
.end method

.method private final D(Lcom/google/android/gms/internal/ads/oI0;)Lcom/google/android/gms/internal/ads/a1;
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/qI0;->T:[Lcom/google/android/gms/internal/ads/oI0;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/oI0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    aget-object p1, p1, v1

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/qI0;->U:Z

    if-eqz v1, :cond_2

    iget p1, p1, Lcom/google/android/gms/internal/ads/oI0;->a:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Extractor added new track (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") after finishing tracks."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ProgressiveMediaPeriod"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/o0;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/o0;-><init>()V

    return-object p1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qI0;->o0:Lcom/google/android/gms/internal/ads/YJ0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/qI0;->E:Lcom/google/android/gms/internal/ads/XF0;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/qI0;->G:Lcom/google/android/gms/internal/ads/SF0;

    new-instance v4, Lcom/google/android/gms/internal/ads/DI0;

    invoke-direct {v4, v1, v2, v3}, Lcom/google/android/gms/internal/ads/DI0;-><init>(Lcom/google/android/gms/internal/ads/YJ0;Lcom/google/android/gms/internal/ads/XF0;Lcom/google/android/gms/internal/ads/SF0;)V

    invoke-virtual {v4, p0}, Lcom/google/android/gms/internal/ads/DI0;->J(Lcom/google/android/gms/internal/ads/BI0;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qI0;->T:[Lcom/google/android/gms/internal/ads/oI0;

    add-int/lit8 v2, v0, 0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/google/android/gms/internal/ads/oI0;

    aput-object p1, v1, v0

    sget p1, Lcom/google/android/gms/internal/ads/EW;->a:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/qI0;->T:[Lcom/google/android/gms/internal/ads/oI0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/gms/internal/ads/DI0;

    aput-object v4, p1, v0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    return-object v4
.end method

.method private final E()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->V:Z

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->Y:Lcom/google/android/gms/internal/ads/pI0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->Z:Lcom/google/android/gms/internal/ads/T0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method private final F()V
    .locals 13

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/qI0;->n0:Z

    if-nez v2, :cond_b

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/qI0;->V:Z

    if-nez v2, :cond_b

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/qI0;->U:Z

    if-eqz v2, :cond_b

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/qI0;->Z:Lcom/google/android/gms/internal/ads/T0;

    if-nez v2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v3, v2

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/DI0;->B()Lcom/google/android/gms/internal/ads/D;

    move-result-object v5

    if-eqz v5, :cond_b

    add-int/2addr v4, v1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/qI0;->M:Lcom/google/android/gms/internal/ads/QE;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/QE;->c()Z

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v2, v2

    new-array v3, v2, [Lcom/google/android/gms/internal/ads/Pm;

    new-array v4, v2, [Z

    move v5, v0

    :goto_1
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v5, v2, :cond_9

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    aget-object v8, v8, v5

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/DI0;->B()Lcom/google/android/gms/internal/ads/D;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v9, v8, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/ed;->g(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/ed;->i(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_3

    :cond_2
    move v11, v1

    goto :goto_2

    :cond_3
    move v11, v0

    :goto_2
    aput-boolean v11, v4, v5

    iget-boolean v12, p0, Lcom/google/android/gms/internal/ads/qI0;->W:Z

    or-int/2addr v11, v12

    iput-boolean v11, p0, Lcom/google/android/gms/internal/ads/qI0;->W:Z

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/ed;->h(Ljava/lang/String;)Z

    move-result v9

    iget-wide v11, p0, Lcom/google/android/gms/internal/ads/qI0;->J:J

    cmp-long v11, v11, v6

    if-eqz v11, :cond_4

    if-ne v2, v1, :cond_4

    if-eqz v9, :cond_4

    move v9, v1

    goto :goto_3

    :cond_4
    move v9, v0

    :goto_3
    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/qI0;->X:Z

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/qI0;->R:Lcom/google/android/gms/internal/ads/a2;

    if-eqz v9, :cond_8

    if-nez v10, :cond_5

    iget-object v11, p0, Lcom/google/android/gms/internal/ads/qI0;->T:[Lcom/google/android/gms/internal/ads/oI0;

    aget-object v11, v11, v5

    iget-boolean v11, v11, Lcom/google/android/gms/internal/ads/oI0;->b:Z

    if-eqz v11, :cond_7

    :cond_5
    iget-object v11, v8, Lcom/google/android/gms/internal/ads/D;->l:Lcom/google/android/gms/internal/ads/Cb;

    if-nez v11, :cond_6

    new-instance v11, Lcom/google/android/gms/internal/ads/Cb;

    new-array v12, v1, [Lcom/google/android/gms/internal/ads/bb;

    aput-object v9, v12, v0

    invoke-direct {v11, v6, v7, v12}, Lcom/google/android/gms/internal/ads/Cb;-><init>(J[Lcom/google/android/gms/internal/ads/bb;)V

    goto :goto_4

    :cond_6
    new-array v6, v1, [Lcom/google/android/gms/internal/ads/bb;

    aput-object v9, v6, v0

    invoke-virtual {v11, v6}, Lcom/google/android/gms/internal/ads/Cb;->c([Lcom/google/android/gms/internal/ads/bb;)Lcom/google/android/gms/internal/ads/Cb;

    move-result-object v11

    :goto_4
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/D;->b()Lcom/google/android/gms/internal/ads/oK0;

    move-result-object v6

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/ads/oK0;->t(Lcom/google/android/gms/internal/ads/Cb;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v8

    :cond_7
    if-eqz v10, :cond_8

    iget v6, v8, Lcom/google/android/gms/internal/ads/D;->h:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_8

    iget v6, v8, Lcom/google/android/gms/internal/ads/D;->i:I

    if-ne v6, v7, :cond_8

    iget v6, v9, Lcom/google/android/gms/internal/ads/a2;->C:I

    if-eq v6, v7, :cond_8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/D;->b()Lcom/google/android/gms/internal/ads/oK0;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/oK0;->q0(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v8

    :cond_8
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/qI0;->E:Lcom/google/android/gms/internal/ads/XF0;

    invoke-interface {v6, v8}, Lcom/google/android/gms/internal/ads/XF0;->a(Lcom/google/android/gms/internal/ads/D;)I

    move-result v6

    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/D;->c(I)Lcom/google/android/gms/internal/ads/D;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/ads/Pm;

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    new-array v9, v1, [Lcom/google/android/gms/internal/ads/D;

    aput-object v6, v9, v0

    invoke-direct {v7, v8, v9}, Lcom/google/android/gms/internal/ads/Pm;-><init>(Ljava/lang/String;[Lcom/google/android/gms/internal/ads/D;)V

    aput-object v7, v3, v5

    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/qI0;->f0:Z

    iget-boolean v6, v6, Lcom/google/android/gms/internal/ads/D;->u:Z

    or-int/2addr v6, v7

    iput-boolean v6, p0, Lcom/google/android/gms/internal/ads/qI0;->f0:Z

    add-int/2addr v5, v1

    goto/16 :goto_1

    :cond_9
    new-instance v0, Lcom/google/android/gms/internal/ads/pI0;

    new-instance v2, Lcom/google/android/gms/internal/ads/PI0;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/PI0;-><init>([Lcom/google/android/gms/internal/ads/Pm;)V

    invoke-direct {v0, v2, v4}, Lcom/google/android/gms/internal/ads/pI0;-><init>(Lcom/google/android/gms/internal/ads/PI0;[Z)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->Y:Lcom/google/android/gms/internal/ads/pI0;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->X:Z

    if-eqz v0, :cond_a

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/qI0;->a0:J

    cmp-long v0, v2, v6

    if-nez v0, :cond_a

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/qI0;->J:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/qI0;->a0:J

    new-instance v0, Lcom/google/android/gms/internal/ads/kI0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/qI0;->Z:Lcom/google/android/gms/internal/ads/T0;

    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/internal/ads/kI0;-><init>(Lcom/google/android/gms/internal/ads/qI0;Lcom/google/android/gms/internal/ads/T0;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->Z:Lcom/google/android/gms/internal/ads/T0;

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->H:Lcom/google/android/gms/internal/ads/mI0;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/qI0;->a0:J

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/qI0;->Z:Lcom/google/android/gms/internal/ads/T0;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/T0;->g()Z

    move-result v4

    iget-boolean v5, p0, Lcom/google/android/gms/internal/ads/qI0;->b0:Z

    invoke-interface {v0, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/mI0;->d(JZZ)V

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/qI0;->V:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->Q:Lcom/google/android/gms/internal/ads/IH0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/IH0;->l(Lcom/google/android/gms/internal/ads/JH0;)V

    :cond_b
    :goto_5
    return-void
.end method

.method private final G(I)V
    .locals 14

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->E()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->Y:Lcom/google/android/gms/internal/ads/pI0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/pI0;->d:[Z

    aget-boolean v2, v1, p1

    if-nez v2, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/pI0;->a:Lcom/google/android/gms/internal/ads/PI0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/PI0;->b(I)Lcom/google/android/gms/internal/ads/Pm;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/Pm;->b(I)Lcom/google/android/gms/internal/ads/D;

    move-result-object v6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->F:Lcom/google/android/gms/internal/ads/VH0;

    iget-object v2, v6, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ed;->b(Ljava/lang/String;)I

    move-result v5

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/qI0;->i0:J

    new-instance v13, Lcom/google/android/gms/internal/ads/HH0;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/EW;->N(J)J

    move-result-wide v9

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v13

    invoke-direct/range {v3 .. v12}, Lcom/google/android/gms/internal/ads/HH0;-><init>(IILcom/google/android/gms/internal/ads/D;ILjava/lang/Object;JJ)V

    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/ads/VH0;->d(Lcom/google/android/gms/internal/ads/HH0;)V

    const/4 v0, 0x1

    aput-boolean v0, v1, p1

    :cond_0
    return-void
.end method

.method private final H(I)V
    .locals 4

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->E()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->Y:Lcom/google/android/gms/internal/ads/pI0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/pI0;->b:[Z

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/qI0;->k0:Z

    if-eqz v1, :cond_2

    aget-boolean v0, v0, p1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    aget-object p1, v0, p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/DI0;->M(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/qI0;->j0:J

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->k0:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/qI0;->e0:Z

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/qI0;->i0:J

    iput v0, p0, Lcom/google/android/gms/internal/ads/qI0;->l0:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v1, p1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/DI0;->H(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->Q:Lcom/google/android/gms/internal/ads/IH0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/FI0;->e(Lcom/google/android/gms/internal/ads/HI0;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private final I()V
    .locals 18

    .prologue
    move-object/from16 v7, p0

    iget-object v2, v7, Lcom/google/android/gms/internal/ads/qI0;->C:Landroid/net/Uri;

    iget-object v3, v7, Lcom/google/android/gms/internal/ads/qI0;->D:Lcom/google/android/gms/internal/ads/pi0;

    new-instance v8, Lcom/google/android/gms/internal/ads/lI0;

    iget-object v4, v7, Lcom/google/android/gms/internal/ads/qI0;->L:Lcom/google/android/gms/internal/ads/eI0;

    iget-object v6, v7, Lcom/google/android/gms/internal/ads/qI0;->M:Lcom/google/android/gms/internal/ads/QE;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v5, p0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/lI0;-><init>(Lcom/google/android/gms/internal/ads/qI0;Landroid/net/Uri;Lcom/google/android/gms/internal/ads/pi0;Lcom/google/android/gms/internal/ads/eI0;Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/QE;)V

    iget-boolean v0, v7, Lcom/google/android/gms/internal/ads/qI0;->V:Z

    if-eqz v0, :cond_3

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/qI0;->J()Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget-wide v0, v7, Lcom/google/android/gms/internal/ads/qI0;->a0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-wide v4, v7, Lcom/google/android/gms/internal/ads/qI0;->j0:J

    cmp-long v0, v4, v0

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, v7, Lcom/google/android/gms/internal/ads/qI0;->m0:Z

    iput-wide v2, v7, Lcom/google/android/gms/internal/ads/qI0;->j0:J

    return-void

    :cond_1
    :goto_0
    iget-object v0, v7, Lcom/google/android/gms/internal/ads/qI0;->Z:Lcom/google/android/gms/internal/ads/T0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v4, v7, Lcom/google/android/gms/internal/ads/qI0;->j0:J

    invoke-interface {v0, v4, v5}, Lcom/google/android/gms/internal/ads/T0;->b(J)Lcom/google/android/gms/internal/ads/R0;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/R0;->a:Lcom/google/android/gms/internal/ads/U0;

    iget-wide v4, v7, Lcom/google/android/gms/internal/ads/qI0;->j0:J

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/U0;->b:J

    invoke-static {v8, v0, v1, v4, v5}, Lcom/google/android/gms/internal/ads/lI0;->f(Lcom/google/android/gms/internal/ads/lI0;JJ)V

    iget-object v0, v7, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v1, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_2

    aget-object v5, v0, v4

    iget-wide v9, v7, Lcom/google/android/gms/internal/ads/qI0;->j0:J

    invoke-virtual {v5, v9, v10}, Lcom/google/android/gms/internal/ads/DI0;->I(J)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    iput-wide v2, v7, Lcom/google/android/gms/internal/ads/qI0;->j0:J

    :cond_3
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/qI0;->B()I

    move-result v0

    iput v0, v7, Lcom/google/android/gms/internal/ads/qI0;->l0:I

    iget-object v0, v7, Lcom/google/android/gms/internal/ads/qI0;->K:Lcom/google/android/gms/internal/ads/mK0;

    iget v1, v7, Lcom/google/android/gms/internal/ads/qI0;->c0:I

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/cK0;->a(I)I

    move-result v1

    invoke-virtual {v0, v8, v7, v1}, Lcom/google/android/gms/internal/ads/mK0;->a(Lcom/google/android/gms/internal/ads/hK0;Lcom/google/android/gms/internal/ads/eK0;I)J

    move-result-wide v13

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/lI0;->d(Lcom/google/android/gms/internal/ads/lI0;)Lcom/google/android/gms/internal/ads/gl0;

    move-result-object v12

    iget-object v0, v7, Lcom/google/android/gms/internal/ads/qI0;->F:Lcom/google/android/gms/internal/ads/VH0;

    new-instance v1, Lcom/google/android/gms/internal/ads/BH0;

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/lI0;->a(Lcom/google/android/gms/internal/ads/lI0;)J

    move-result-wide v10

    move-object v9, v1

    invoke-direct/range {v9 .. v14}, Lcom/google/android/gms/internal/ads/BH0;-><init>(JLcom/google/android/gms/internal/ads/gl0;J)V

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/lI0;->c(Lcom/google/android/gms/internal/ads/lI0;)J

    move-result-wide v2

    iget-wide v4, v7, Lcom/google/android/gms/internal/ads/qI0;->a0:J

    new-instance v6, Lcom/google/android/gms/internal/ads/HH0;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/EW;->N(J)J

    move-result-wide v14

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/EW;->N(J)J

    move-result-wide v16

    const/4 v9, 0x1

    const/4 v10, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v17}, Lcom/google/android/gms/internal/ads/HH0;-><init>(IILcom/google/android/gms/internal/ads/D;ILjava/lang/Object;JJ)V

    invoke-virtual {v0, v1, v6}, Lcom/google/android/gms/internal/ads/VH0;->h(Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V

    return-void
.end method

.method private final J()Z
    .locals 4

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/qI0;->j0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final K()Z
    .locals 1

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->e0:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->J()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method static bridge synthetic N(Lcom/google/android/gms/internal/ads/qI0;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/qI0;->I:J

    return-wide v0
.end method

.method static bridge synthetic O(Lcom/google/android/gms/internal/ads/qI0;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/qI0;->a0:J

    return-wide v0
.end method

.method static bridge synthetic T(Lcom/google/android/gms/internal/ads/qI0;Z)J
    .locals 0

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/qI0;->C(Z)J

    move-result-wide p0

    return-wide p0
.end method

.method static bridge synthetic U(Lcom/google/android/gms/internal/ads/qI0;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/qI0;->P:Landroid/os/Handler;

    return-object p0
.end method

.method static bridge synthetic V()Lcom/google/android/gms/internal/ads/D;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/qI0;->q0:Lcom/google/android/gms/internal/ads/D;

    return-object v0
.end method

.method static bridge synthetic X(Lcom/google/android/gms/internal/ads/qI0;)Lcom/google/android/gms/internal/ads/a2;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/qI0;->R:Lcom/google/android/gms/internal/ads/a2;

    return-object p0
.end method

.method static bridge synthetic Y(Lcom/google/android/gms/internal/ads/qI0;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/qI0;->O:Ljava/lang/Runnable;

    return-object p0
.end method

.method static bridge synthetic Z()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/qI0;->p0:Ljava/util/Map;

    return-object v0
.end method

.method public static synthetic r(Lcom/google/android/gms/internal/ads/qI0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->F()V

    return-void
.end method

.method static bridge synthetic s(Lcom/google/android/gms/internal/ads/qI0;Lcom/google/android/gms/internal/ads/a2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->R:Lcom/google/android/gms/internal/ads/a2;

    return-void
.end method

.method static bridge synthetic t(Lcom/google/android/gms/internal/ads/qI0;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/gI0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/gI0;-><init>(Lcom/google/android/gms/internal/ads/qI0;)V

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/qI0;->P:Landroid/os/Handler;

    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method final A(I)Z
    .locals 1

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->K()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    aget-object p1, v0, p1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->m0:Z

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/DI0;->M(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method final L(ILcom/google/android/gms/internal/ads/UA0;Lcom/google/android/gms/internal/ads/vz0;I)I
    .locals 3

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->K()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/qI0;->G(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    aget-object v0, v0, p1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/qI0;->m0:Z

    invoke-virtual {v0, p2, p3, p4, v2}, Lcom/google/android/gms/internal/ads/DI0;->z(Lcom/google/android/gms/internal/ads/UA0;Lcom/google/android/gms/internal/ads/vz0;IZ)I

    move-result p2

    if-ne p2, v1, :cond_1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/qI0;->H(I)V

    :cond_1
    return p2
.end method

.method final M(IJ)I
    .locals 3

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->K()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/qI0;->G(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    aget-object v0, v0, p1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/qI0;->m0:Z

    invoke-virtual {v0, p2, p3, v2}, Lcom/google/android/gms/internal/ads/DI0;->x(JZ)I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/DI0;->K(I)V

    if-nez p2, :cond_1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/qI0;->H(I)V

    return v1

    :cond_1
    return p2
.end method

.method public final P()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/DI0;->G()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->L:Lcom/google/android/gms/internal/ads/eI0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eI0;->d()V

    return-void
.end method

.method public final Q()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->U:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->P:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qI0;->N:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final R(Lcom/google/android/gms/internal/ads/T0;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/jI0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/jI0;-><init>(Lcom/google/android/gms/internal/ads/qI0;Lcom/google/android/gms/internal/ads/T0;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->P:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final S(II)Lcom/google/android/gms/internal/ads/a1;
    .locals 1

    new-instance p2, Lcom/google/android/gms/internal/ads/oI0;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lcom/google/android/gms/internal/ads/oI0;-><init>(IZ)V

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/qI0;->D(Lcom/google/android/gms/internal/ads/oI0;)Lcom/google/android/gms/internal/ads/a1;

    move-result-object p1

    return-object p1
.end method

.method final W()Lcom/google/android/gms/internal/ads/a1;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/oI0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/oI0;-><init>(IZ)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/qI0;->D(Lcom/google/android/gms/internal/ads/oI0;)Lcom/google/android/gms/internal/ads/a1;

    move-result-object v0

    return-object v0
.end method

.method public final a(J)V
    .locals 0

    return-void
.end method

.method public final b()J
    .locals 11

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->E()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->m0:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-nez v0, :cond_7

    iget v0, p0, Lcom/google/android/gms/internal/ads/qI0;->g0:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->J()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/qI0;->j0:J

    return-wide v0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->W:Z

    const/4 v3, 0x0

    const-wide v4, 0x7fffffffffffffffL

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v0, v0

    move v6, v3

    move-wide v7, v4

    :goto_0
    if-ge v6, v0, :cond_4

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/qI0;->Y:Lcom/google/android/gms/internal/ads/pI0;

    iget-object v10, v9, Lcom/google/android/gms/internal/ads/pI0;->b:[Z

    aget-boolean v10, v10, v6

    if-eqz v10, :cond_2

    iget-object v9, v9, Lcom/google/android/gms/internal/ads/pI0;->c:[Z

    aget-boolean v9, v9, v6

    if-eqz v9, :cond_2

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    aget-object v9, v9, v6

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/DI0;->L()Z

    move-result v9

    if-nez v9, :cond_2

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    aget-object v9, v9, v6

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/DI0;->A()J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    move-wide v7, v4

    :cond_4
    cmp-long v0, v7, v4

    if-nez v0, :cond_5

    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/ads/qI0;->C(Z)J

    move-result-wide v7

    :cond_5
    cmp-long v0, v7, v1

    if-nez v0, :cond_6

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/qI0;->i0:J

    return-wide v0

    :cond_6
    return-wide v7

    :cond_7
    :goto_1
    return-wide v1
.end method

.method public final c()J
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/qI0;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(Lcom/google/android/gms/internal/ads/ZA0;)Z
    .locals 1

    .prologue
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/qI0;->m0:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->K:Lcom/google/android/gms/internal/ads/mK0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/mK0;->k()Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->k0:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->V:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/qI0;->g0:I

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->M:Lcom/google/android/gms/internal/ads/QE;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/QE;->e()Z

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/mK0;->l()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->I()V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/ads/hK0;JJZ)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lcom/google/android/gms/internal/ads/lI0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lI0;->e(Lcom/google/android/gms/internal/ads/lI0;)Lcom/google/android/gms/internal/ads/vv0;

    move-result-object v2

    new-instance v15, Lcom/google/android/gms/internal/ads/BH0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lI0;->a(Lcom/google/android/gms/internal/ads/lI0;)J

    move-result-wide v4

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lI0;->d(Lcom/google/android/gms/internal/ads/lI0;)Lcom/google/android/gms/internal/ads/gl0;

    move-result-object v6

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/vv0;->h()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/vv0;->i()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/vv0;->g()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lcom/google/android/gms/internal/ads/BH0;-><init>(JLcom/google/android/gms/internal/ads/gl0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lI0;->a(Lcom/google/android/gms/internal/ads/lI0;)J

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lI0;->c(Lcom/google/android/gms/internal/ads/lI0;)J

    move-result-wide v1

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/qI0;->a0:J

    new-instance v13, Lcom/google/android/gms/internal/ads/HH0;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/EW;->N(J)J

    move-result-wide v11

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/EW;->N(J)J

    move-result-wide v1

    const/4 v6, 0x1

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v13

    move-object v3, v13

    move-wide v13, v1

    invoke-direct/range {v5 .. v14}, Lcom/google/android/gms/internal/ads/HH0;-><init>(IILcom/google/android/gms/internal/ads/D;ILjava/lang/Object;JJ)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/qI0;->F:Lcom/google/android/gms/internal/ads/VH0;

    invoke-virtual {v1, v15, v3}, Lcom/google/android/gms/internal/ads/VH0;->e(Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V

    if-nez p6, :cond_1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v1, v4

    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/DI0;->H(Z)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget v1, v0, Lcom/google/android/gms/internal/ads/qI0;->g0:I

    if-lez v1, :cond_1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/qI0;->Q:Lcom/google/android/gms/internal/ads/IH0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/FI0;->e(Lcom/google/android/gms/internal/ads/HI0;)V

    :cond_1
    return-void
.end method

.method public final f()J
    .locals 3

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->f0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/qI0;->f0:Z

    :goto_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/qI0;->i0:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->e0:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->m0:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->B()I

    move-result v0

    iget v2, p0, Lcom/google/android/gms/internal/ads/qI0;->l0:I

    if-le v0, v2, :cond_2

    :cond_1
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/qI0;->e0:Z

    goto :goto_0

    :cond_2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final g()Lcom/google/android/gms/internal/ads/PI0;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->E()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->Y:Lcom/google/android/gms/internal/ads/pI0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/pI0;->a:Lcom/google/android/gms/internal/ads/PI0;

    return-object v0
.end method

.method public final h(J)J
    .locals 8

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->E()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->Y:Lcom/google/android/gms/internal/ads/pI0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/pI0;->b:[Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qI0;->Z:Lcom/google/android/gms/internal/ads/T0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/T0;->g()Z

    move-result v1

    const/4 v2, 0x1

    if-eq v2, v1, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/qI0;->e0:Z

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/qI0;->i0:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/qI0;->i0:J

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->J()Z

    move-result v4

    if-eqz v4, :cond_1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/qI0;->j0:J

    return-wide p1

    :cond_1
    iget v4, p0, Lcom/google/android/gms/internal/ads/qI0;->c0:I

    const/4 v5, 0x7

    if-eq v4, v5, :cond_6

    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/qI0;->m0:Z

    if-nez v4, :cond_2

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/qI0;->K:Lcom/google/android/gms/internal/ads/mK0;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/mK0;->l()Z

    move-result v4

    if-eqz v4, :cond_6

    :cond_2
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v4, v4

    move v5, v1

    :goto_0
    if-ge v5, v4, :cond_9

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    aget-object v6, v6, v5

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/DI0;->w()I

    move-result v7

    if-nez v7, :cond_3

    cmp-long v7, v2, p1

    if-nez v7, :cond_3

    goto :goto_2

    :cond_3
    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/qI0;->X:Z

    if-eqz v7, :cond_4

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/DI0;->v()I

    move-result v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/DI0;->N(I)Z

    move-result v6

    goto :goto_1

    :cond_4
    invoke-virtual {v6, p1, p2, v1}, Lcom/google/android/gms/internal/ads/DI0;->h(JZ)Z

    move-result v6

    :goto_1
    if-nez v6, :cond_5

    aget-boolean v6, v0, v5

    if-nez v6, :cond_6

    iget-boolean v6, p0, Lcom/google/android/gms/internal/ads/qI0;->W:Z

    if-nez v6, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_6
    :goto_3
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/qI0;->k0:Z

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/qI0;->j0:J

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/qI0;->m0:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/qI0;->f0:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->K:Lcom/google/android/gms/internal/ads/mK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/mK0;->l()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v2, v0

    :goto_4
    if-ge v1, v2, :cond_7

    aget-object v3, v0, v1

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/DI0;->D()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->K:Lcom/google/android/gms/internal/ads/mK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/mK0;->g()V

    goto :goto_6

    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/mK0;->h()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v2, v0

    move v3, v1

    :goto_5
    if-ge v3, v2, :cond_9

    aget-object v4, v0, v3

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/DI0;->H(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_9
    :goto_6
    return-wide p1
.end method

.method public final i(JLcom/google/android/gms/internal/ads/GB0;)J
    .locals 20

    .prologue
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/qI0;->E()V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/qI0;->Z:Lcom/google/android/gms/internal/ads/T0;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/T0;->g()Z

    move-result v4

    const-wide/16 v5, 0x0

    if-nez v4, :cond_0

    return-wide v5

    :cond_0
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/qI0;->Z:Lcom/google/android/gms/internal/ads/T0;

    invoke-interface {v4, v1, v2}, Lcom/google/android/gms/internal/ads/T0;->b(J)Lcom/google/android/gms/internal/ads/R0;

    move-result-object v4

    iget-object v7, v4, Lcom/google/android/gms/internal/ads/R0;->a:Lcom/google/android/gms/internal/ads/U0;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/R0;->b:Lcom/google/android/gms/internal/ads/U0;

    iget-wide v8, v3, Lcom/google/android/gms/internal/ads/GB0;->a:J

    cmp-long v10, v8, v5

    if-nez v10, :cond_2

    iget-wide v8, v3, Lcom/google/android/gms/internal/ads/GB0;->b:J

    cmp-long v8, v8, v5

    if-nez v8, :cond_1

    goto :goto_3

    :cond_1
    move-wide v8, v5

    :cond_2
    iget-wide v10, v7, Lcom/google/android/gms/internal/ads/U0;->a:J

    sget v7, Lcom/google/android/gms/internal/ads/EW;->a:I

    sub-long v12, v1, v8

    xor-long v7, v1, v8

    xor-long v14, v1, v12

    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/GB0;->b:J

    add-long v16, v1, v5

    xor-long v18, v1, v16

    xor-long v5, v5, v16

    and-long/2addr v7, v14

    const-wide/16 v14, 0x0

    cmp-long v3, v7, v14

    if-gez v3, :cond_3

    const-wide/high16 v12, -0x8000000000000000L

    :cond_3
    and-long v5, v18, v5

    cmp-long v3, v5, v14

    if-gez v3, :cond_4

    const-wide v16, 0x7fffffffffffffffL

    :cond_4
    cmp-long v3, v12, v10

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-gtz v3, :cond_5

    cmp-long v3, v10, v16

    if-gtz v3, :cond_5

    move v3, v5

    goto :goto_0

    :cond_5
    move v3, v6

    :goto_0
    iget-wide v7, v4, Lcom/google/android/gms/internal/ads/U0;->a:J

    cmp-long v4, v12, v7

    if-gtz v4, :cond_6

    cmp-long v4, v7, v16

    if-gtz v4, :cond_6

    goto :goto_1

    :cond_6
    move v5, v6

    :goto_1
    if-eqz v3, :cond_8

    if-eqz v5, :cond_8

    sub-long v3, v10, v1

    sub-long v1, v7, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    cmp-long v1, v3, v1

    if-gtz v1, :cond_7

    goto :goto_2

    :cond_7
    return-wide v7

    :cond_8
    if-eqz v3, :cond_9

    :goto_2
    move-wide v1, v10

    goto :goto_3

    :cond_9
    if-eqz v5, :cond_a

    move-wide v1, v7

    :goto_3
    return-wide v1

    :cond_a
    return-wide v12
.end method

.method public final j(JZ)V
    .locals 5

    .prologue
    iget-boolean p3, p0, Lcom/google/android/gms/internal/ads/qI0;->X:Z

    if-eqz p3, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->E()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->J()Z

    move-result p3

    if-nez p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/qI0;->Y:Lcom/google/android/gms/internal/ads/pI0;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/pI0;->c:[Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    aget-object v3, v3, v2

    aget-boolean v4, p3, v2

    invoke-virtual {v3, p1, p2, v1, v4}, Lcom/google/android/gms/internal/ads/DI0;->C(JZZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final k()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/qI0;->x()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->m0:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->V:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Loading finished before preparation is complete."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final bridge synthetic l(Lcom/google/android/gms/internal/ads/hK0;JJLjava/io/IOException;I)Lcom/google/android/gms/internal/ads/fK0;
    .locals 21

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p6

    const/4 v2, 0x1

    move-object/from16 v3, p1

    check-cast v3, Lcom/google/android/gms/internal/ads/lI0;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/lI0;->e(Lcom/google/android/gms/internal/ads/lI0;)Lcom/google/android/gms/internal/ads/vv0;

    move-result-object v4

    new-instance v15, Lcom/google/android/gms/internal/ads/BH0;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/lI0;->a(Lcom/google/android/gms/internal/ads/lI0;)J

    move-result-wide v6

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/lI0;->d(Lcom/google/android/gms/internal/ads/lI0;)Lcom/google/android/gms/internal/ads/gl0;

    move-result-object v8

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/vv0;->h()Landroid/net/Uri;

    move-result-object v9

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/vv0;->i()Ljava/util/Map;

    move-result-object v10

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/vv0;->g()J

    move-result-wide v16

    move-object v5, v15

    move-wide/from16 v11, p2

    move-wide/from16 v13, p4

    move-object v4, v15

    move-wide/from16 v15, v16

    invoke-direct/range {v5 .. v16}, Lcom/google/android/gms/internal/ads/BH0;-><init>(JLcom/google/android/gms/internal/ads/gl0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/lI0;->c(Lcom/google/android/gms/internal/ads/lI0;)J

    sget v5, Lcom/google/android/gms/internal/ads/EW;->a:I

    instance-of v5, v1, Lcom/google/android/gms/internal/ads/of;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v5, :cond_0

    instance-of v5, v1, Ljava/io/FileNotFoundException;

    if-nez v5, :cond_0

    instance-of v5, v1, Lcom/google/android/gms/internal/ads/Qq0;

    if-nez v5, :cond_0

    instance-of v5, v1, Lcom/google/android/gms/internal/ads/kK0;

    if-nez v5, :cond_0

    move-object v5, v1

    :goto_0
    if-eqz v5, :cond_2

    instance-of v8, v5, Lcom/google/android/gms/internal/ads/Pi0;

    if-eqz v8, :cond_1

    move-object v8, v5

    check-cast v8, Lcom/google/android/gms/internal/ads/Pi0;

    iget v8, v8, Lcom/google/android/gms/internal/ads/Pi0;->C:I

    const/16 v9, 0x7d8

    if-ne v8, v9, :cond_1

    :cond_0
    move-wide v8, v6

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    goto :goto_0

    :cond_2
    add-int/lit8 v5, p7, -0x1

    mul-int/lit16 v5, v5, 0x3e8

    const/16 v8, 0x1388

    invoke-static {v5, v8}, Ljava/lang/Math;->min(II)I

    move-result v5

    int-to-long v8, v5

    :goto_1
    cmp-long v5, v8, v6

    if-nez v5, :cond_3

    sget-object v5, Lcom/google/android/gms/internal/ads/mK0;->e:Lcom/google/android/gms/internal/ads/fK0;

    goto :goto_6

    :cond_3
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/qI0;->B()I

    move-result v5

    iget v10, v0, Lcom/google/android/gms/internal/ads/qI0;->l0:I

    const/4 v11, 0x0

    if-le v5, v10, :cond_4

    move v10, v2

    goto :goto_2

    :cond_4
    move v10, v11

    :goto_2
    iget-boolean v12, v0, Lcom/google/android/gms/internal/ads/qI0;->h0:Z

    if-nez v12, :cond_8

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/qI0;->Z:Lcom/google/android/gms/internal/ads/T0;

    if-eqz v12, :cond_5

    invoke-interface {v12}, Lcom/google/android/gms/internal/ads/T0;->a()J

    move-result-wide v12

    cmp-long v6, v12, v6

    if-eqz v6, :cond_5

    goto :goto_4

    :cond_5
    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/qI0;->V:Z

    if-eqz v5, :cond_6

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/qI0;->K()Z

    move-result v6

    if-nez v6, :cond_6

    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/qI0;->k0:Z

    sget-object v5, Lcom/google/android/gms/internal/ads/mK0;->d:Lcom/google/android/gms/internal/ads/fK0;

    goto :goto_6

    :cond_6
    iput-boolean v5, v0, Lcom/google/android/gms/internal/ads/qI0;->e0:Z

    const-wide/16 v5, 0x0

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/qI0;->i0:J

    iput v11, v0, Lcom/google/android/gms/internal/ads/qI0;->l0:I

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v12, v7

    move v13, v11

    :goto_3
    if-ge v13, v12, :cond_7

    aget-object v14, v7, v13

    invoke-virtual {v14, v11}, Lcom/google/android/gms/internal/ads/DI0;->H(Z)V

    add-int/2addr v13, v2

    goto :goto_3

    :cond_7
    invoke-static {v3, v5, v6, v5, v6}, Lcom/google/android/gms/internal/ads/lI0;->f(Lcom/google/android/gms/internal/ads/lI0;JJ)V

    goto :goto_5

    :cond_8
    :goto_4
    iput v5, v0, Lcom/google/android/gms/internal/ads/qI0;->l0:I

    :goto_5
    invoke-static {v10, v8, v9}, Lcom/google/android/gms/internal/ads/mK0;->b(ZJ)Lcom/google/android/gms/internal/ads/fK0;

    move-result-object v5

    :goto_6
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/fK0;->c()Z

    move-result v6

    xor-int/2addr v2, v6

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/qI0;->F:Lcom/google/android/gms/internal/ads/VH0;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/lI0;->c(Lcom/google/android/gms/internal/ads/lI0;)J

    move-result-wide v7

    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/qI0;->a0:J

    invoke-static {v7, v8}, Lcom/google/android/gms/internal/ads/EW;->N(J)J

    move-result-wide v17

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/ads/EW;->N(J)J

    move-result-wide v19

    new-instance v7, Lcom/google/android/gms/internal/ads/HH0;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v12, 0x1

    const/4 v13, -0x1

    const/4 v14, 0x0

    move-object v11, v7

    invoke-direct/range {v11 .. v20}, Lcom/google/android/gms/internal/ads/HH0;-><init>(IILcom/google/android/gms/internal/ads/D;ILjava/lang/Object;JJ)V

    invoke-virtual {v6, v4, v7, v1, v2}, Lcom/google/android/gms/internal/ads/VH0;->g(Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;Ljava/io/IOException;Z)V

    if-eqz v2, :cond_9

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/lI0;->a(Lcom/google/android/gms/internal/ads/lI0;)J

    :cond_9
    return-object v5
.end method

.method public final bridge synthetic m(Lcom/google/android/gms/internal/ads/hK0;JJ)V
    .locals 19

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lcom/google/android/gms/internal/ads/lI0;

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/qI0;->a0:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v2, v4

    const/4 v3, 0x1

    if-nez v2, :cond_1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/qI0;->Z:Lcom/google/android/gms/internal/ads/T0;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/T0;->g()Z

    move-result v2

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/qI0;->C(Z)J

    move-result-wide v4

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v6, v4, v6

    if-nez v6, :cond_0

    const-wide/16 v4, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v6, 0x2710

    add-long/2addr v4, v6

    :goto_0
    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/qI0;->a0:J

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/qI0;->H:Lcom/google/android/gms/internal/ads/mI0;

    iget-boolean v7, v0, Lcom/google/android/gms/internal/ads/qI0;->b0:Z

    invoke-interface {v6, v4, v5, v2, v7}, Lcom/google/android/gms/internal/ads/mI0;->d(JZZ)V

    :cond_1
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lI0;->e(Lcom/google/android/gms/internal/ads/lI0;)Lcom/google/android/gms/internal/ads/vv0;

    move-result-object v2

    new-instance v14, Lcom/google/android/gms/internal/ads/BH0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lI0;->a(Lcom/google/android/gms/internal/ads/lI0;)J

    move-result-wide v5

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lI0;->d(Lcom/google/android/gms/internal/ads/lI0;)Lcom/google/android/gms/internal/ads/gl0;

    move-result-object v7

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/vv0;->h()Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/vv0;->i()Ljava/util/Map;

    move-result-object v9

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/vv0;->g()J

    move-result-wide v15

    move-object v4, v14

    move-wide/from16 v10, p2

    move-wide/from16 v12, p4

    move-object v2, v14

    move-wide v14, v15

    invoke-direct/range {v4 .. v15}, Lcom/google/android/gms/internal/ads/BH0;-><init>(JLcom/google/android/gms/internal/ads/gl0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lI0;->a(Lcom/google/android/gms/internal/ads/lI0;)J

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/qI0;->F:Lcom/google/android/gms/internal/ads/VH0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lI0;->c(Lcom/google/android/gms/internal/ads/lI0;)J

    move-result-wide v5

    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/qI0;->a0:J

    new-instance v1, Lcom/google/android/gms/internal/ads/HH0;

    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/EW;->N(J)J

    move-result-wide v15

    invoke-static {v7, v8}, Lcom/google/android/gms/internal/ads/EW;->N(J)J

    move-result-wide v17

    const/4 v10, 0x1

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v9, v1

    invoke-direct/range {v9 .. v18}, Lcom/google/android/gms/internal/ads/HH0;-><init>(IILcom/google/android/gms/internal/ads/D;ILjava/lang/Object;JJ)V

    invoke-virtual {v4, v2, v1}, Lcom/google/android/gms/internal/ads/VH0;->f(Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V

    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/qI0;->m0:Z

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/qI0;->Q:Lcom/google/android/gms/internal/ads/IH0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/FI0;->e(Lcom/google/android/gms/internal/ads/HI0;)V

    return-void
.end method

.method public final n(Lcom/google/android/gms/internal/ads/D;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->P:Landroid/os/Handler;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->N:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final o([Lcom/google/android/gms/internal/ads/IJ0;[Z[Lcom/google/android/gms/internal/ads/EI0;[ZJ)J
    .locals 8

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->E()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->Y:Lcom/google/android/gms/internal/ads/pI0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/pI0;->a:Lcom/google/android/gms/internal/ads/PI0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/pI0;->c:[Z

    iget v2, p0, Lcom/google/android/gms/internal/ads/qI0;->g0:I

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    array-length v5, p1

    if-ge v4, v5, :cond_2

    aget-object v5, p3, v4

    if-eqz v5, :cond_1

    aget-object v6, p1, v4

    if-eqz v6, :cond_0

    aget-boolean v6, p2, v4

    if-nez v6, :cond_1

    :cond_0
    check-cast v5, Lcom/google/android/gms/internal/ads/nI0;

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/nI0;->c(Lcom/google/android/gms/internal/ads/nI0;)I

    move-result v5

    aget-boolean v6, v0, v5

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget v6, p0, Lcom/google/android/gms/internal/ads/qI0;->g0:I

    add-int/lit8 v6, v6, -0x1

    iput v6, p0, Lcom/google/android/gms/internal/ads/qI0;->g0:I

    aput-boolean v3, v0, v5

    const/4 v5, 0x0

    aput-object v5, p3, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/qI0;->d0:Z

    const/4 v4, 0x1

    if-eqz p2, :cond_4

    if-nez v2, :cond_3

    :goto_1
    move p2, v4

    goto :goto_2

    :cond_3
    move p2, v3

    goto :goto_2

    :cond_4
    const-wide/16 v5, 0x0

    cmp-long p2, p5, v5

    if-eqz p2, :cond_3

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/qI0;->X:Z

    if-nez p2, :cond_3

    goto :goto_1

    :goto_2
    move v2, v3

    :goto_3
    array-length v5, p1

    if-ge v2, v5, :cond_9

    aget-object v5, p3, v2

    if-nez v5, :cond_8

    aget-object v5, p1, v2

    if-eqz v5, :cond_8

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/MJ0;->f()I

    move-result v6

    if-ne v6, v4, :cond_5

    move v6, v4

    goto :goto_4

    :cond_5
    move v6, v3

    :goto_4
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    invoke-interface {v5, v3}, Lcom/google/android/gms/internal/ads/MJ0;->r(I)I

    move-result v6

    if-nez v6, :cond_6

    move v6, v4

    goto :goto_5

    :cond_6
    move v6, v3

    :goto_5
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/MJ0;->i()Lcom/google/android/gms/internal/ads/Pm;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/PI0;->a(Lcom/google/android/gms/internal/ads/Pm;)I

    move-result v6

    aget-boolean v7, v0, v6

    xor-int/2addr v7, v4

    invoke-static {v7}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget v7, p0, Lcom/google/android/gms/internal/ads/qI0;->g0:I

    add-int/2addr v7, v4

    iput v7, p0, Lcom/google/android/gms/internal/ads/qI0;->g0:I

    aput-boolean v4, v0, v6

    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/qI0;->f0:Z

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/IJ0;->e()Lcom/google/android/gms/internal/ads/D;

    move-result-object v5

    iget-boolean v5, v5, Lcom/google/android/gms/internal/ads/D;->u:Z

    or-int/2addr v5, v7

    iput-boolean v5, p0, Lcom/google/android/gms/internal/ads/qI0;->f0:Z

    new-instance v5, Lcom/google/android/gms/internal/ads/nI0;

    invoke-direct {v5, p0, v6}, Lcom/google/android/gms/internal/ads/nI0;-><init>(Lcom/google/android/gms/internal/ads/qI0;I)V

    aput-object v5, p3, v2

    aput-boolean v4, p4, v2

    if-nez p2, :cond_8

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    aget-object p2, p2, v6

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/DI0;->w()I

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {p2, p5, p6, v4}, Lcom/google/android/gms/internal/ads/DI0;->h(JZ)Z

    move-result p2

    if-nez p2, :cond_7

    move p2, v4

    goto :goto_6

    :cond_7
    move p2, v3

    :cond_8
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_9
    iget p1, p0, Lcom/google/android/gms/internal/ads/qI0;->g0:I

    if-nez p1, :cond_c

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/qI0;->k0:Z

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/qI0;->e0:Z

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/qI0;->f0:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->K:Lcom/google/android/gms/internal/ads/mK0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/mK0;->l()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length p2, p1

    :goto_7
    if-ge v3, p2, :cond_a

    aget-object p3, p1, v3

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/DI0;->D()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_a
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->K:Lcom/google/android/gms/internal/ads/mK0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/mK0;->g()V

    goto :goto_a

    :cond_b
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/qI0;->m0:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length p2, p1

    move p3, v3

    :goto_8
    if-ge p3, p2, :cond_e

    aget-object p4, p1, p3

    invoke-virtual {p4, v3}, Lcom/google/android/gms/internal/ads/DI0;->H(Z)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_8

    :cond_c
    if-eqz p2, :cond_e

    invoke-virtual {p0, p5, p6}, Lcom/google/android/gms/internal/ads/qI0;->h(J)J

    move-result-wide p5

    :goto_9
    array-length p1, p3

    if-ge v3, p1, :cond_e

    aget-object p1, p3, v3

    if-eqz p1, :cond_d

    aput-boolean v4, p4, v3

    :cond_d
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_e
    :goto_a
    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/qI0;->d0:Z

    return-wide p5
.end method

.method public final p(Lcom/google/android/gms/internal/ads/IH0;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->Q:Lcom/google/android/gms/internal/ads/IH0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qI0;->M:Lcom/google/android/gms/internal/ads/QE;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/QE;->e()Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->I()V

    return-void
.end method

.method public final q()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->K:Lcom/google/android/gms/internal/ads/mK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/mK0;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->M:Lcom/google/android/gms/internal/ads/QE;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/QE;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final synthetic u()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->n0:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->Q:Lcom/google/android/gms/internal/ads/IH0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/FI0;->e(Lcom/google/android/gms/internal/ads/HI0;)V

    :cond_0
    return-void
.end method

.method final synthetic v()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->h0:Z

    return-void
.end method

.method final synthetic w(Lcom/google/android/gms/internal/ads/T0;)V
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->R:Lcom/google/android/gms/internal/ads/a2;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/S0;

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/S0;-><init>(JJ)V

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->Z:Lcom/google/android/gms/internal/ads/T0;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/T0;->a()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/qI0;->a0:J

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->h0:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v0, :cond_1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/T0;->a()J

    move-result-wide v5

    cmp-long v0, v5, v1

    if-nez v0, :cond_1

    move v3, v4

    :cond_1
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/qI0;->b0:Z

    if-eq v4, v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x7

    :goto_1
    iput v4, p0, Lcom/google/android/gms/internal/ads/qI0;->c0:I

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->V:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->H:Lcom/google/android/gms/internal/ads/mI0;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/qI0;->a0:J

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/T0;->g()Z

    move-result p1

    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/qI0;->b0:Z

    invoke-interface {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/ads/mI0;->d(JZZ)V

    return-void

    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qI0;->F()V

    return-void
.end method

.method final x()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/qI0;->c0:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/cK0;->a(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qI0;->K:Lcom/google/android/gms/internal/ads/mK0;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/mK0;->i(I)V

    return-void
.end method

.method final y(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/DI0;->E()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/qI0;->x()V

    return-void
.end method

.method public final z()V
    .locals 4

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->V:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->S:[Lcom/google/android/gms/internal/ads/DI0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/DI0;->F()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->K:Lcom/google/android/gms/internal/ads/mK0;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/mK0;->j(Lcom/google/android/gms/internal/ads/iK0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qI0;->P:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/qI0;->Q:Lcom/google/android/gms/internal/ads/IH0;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/qI0;->n0:Z

    return-void
.end method
