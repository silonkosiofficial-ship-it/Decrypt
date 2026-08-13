.class public final Lcom/google/android/gms/internal/ads/Hd;
.super Lcom/google/android/gms/internal/ads/Jv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# static fields
.field public static final zza:I = 0x1

.field public static final zzb:I = 0x2

.field public static final zzc:I = 0x3

.field public static final zzd:I = 0x4

.field public static final zze:I = 0x5

.field public static final zzf:I = 0x6

.field public static final zzg:I = 0x7

.field public static final zzh:I = 0x8

.field public static final zzi:I = 0x9

.field public static final zzj:I = 0xa

.field public static final zzk:I = 0xb

.field public static final zzl:I = 0xc

.field public static final zzm:I = 0xd

.field private static final zzn:Lcom/google/android/gms/internal/ads/Qv0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/Qv0;"
        }
    .end annotation
.end field

.field private static final zzo:Lcom/google/android/gms/internal/ads/Hd;

.field private static volatile zzp:Lcom/google/android/gms/internal/ads/tw0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/tw0;"
        }
    .end annotation
.end field


# instance fields
.field private zzA:Lcom/google/android/gms/internal/ads/Ed;

.field private zzB:I

.field private zzC:I

.field private zzD:I

.field private zzE:I

.field private zzF:I

.field private zzG:I

.field private zzH:J

.field private zzu:I

.field private zzv:J

.field private zzw:I

.field private zzx:J

.field private zzy:J

.field private zzz:Lcom/google/android/gms/internal/ads/Ov0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Hd$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Hd$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Hd;->zzn:Lcom/google/android/gms/internal/ads/Qv0;

    new-instance v0, Lcom/google/android/gms/internal/ads/Hd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Hd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Hd;->zzo:Lcom/google/android/gms/internal/ads/Hd;

    const-class v1, Lcom/google/android/gms/internal/ads/Hd;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Jv0;->F(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jv0;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Jv0;->q()Lcom/google/android/gms/internal/ads/Ov0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzz:Lcom/google/android/gms/internal/ads/Ov0;

    return-void
.end method

.method private A0(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    or-int/lit16 v0, v0, 0x800

    iput v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzH:J

    return-void
.end method

.method private B0(Lcom/google/android/gms/internal/ads/Ve;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ve;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzB:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    return-void
.end method

.method public static E0()Lcom/google/android/gms/internal/ads/Id;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Hd;->zzo:Lcom/google/android/gms/internal/ads/Hd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->p()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Id;

    return-object v0
.end method

.method static bridge synthetic F0()Lcom/google/android/gms/internal/ads/Hd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Hd;->zzo:Lcom/google/android/gms/internal/ads/Hd;

    return-object v0
.end method

.method public static G0([B)Lcom/google/android/gms/internal/ads/Hd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Hd;->zzo:Lcom/google/android/gms/internal/ads/Hd;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/Jv0;->M(Lcom/google/android/gms/internal/ads/Jv0;[B)Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Hd;

    return-object p0
.end method

.method static bridge synthetic b0(Lcom/google/android/gms/internal/ads/Hd;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Hd;->p0(Ljava/lang/Iterable;)V

    return-void
.end method

.method private c0()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzz:Lcom/google/android/gms/internal/ads/Ov0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Sv0;->c()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Jv0;->r(Lcom/google/android/gms/internal/ads/Ov0;)Lcom/google/android/gms/internal/ads/Ov0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzz:Lcom/google/android/gms/internal/ads/Ov0;

    :cond_0
    return-void
.end method

.method static bridge synthetic d0(Lcom/google/android/gms/internal/ads/Hd;Lcom/google/android/gms/internal/ads/Ve;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Hd;->q0(Lcom/google/android/gms/internal/ads/Ve;)V

    return-void
.end method

.method static bridge synthetic e0(Lcom/google/android/gms/internal/ads/Hd;Lcom/google/android/gms/internal/ads/Ve;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Hd;->r0(Lcom/google/android/gms/internal/ads/Ve;)V

    return-void
.end method

.method static bridge synthetic f0(Lcom/google/android/gms/internal/ads/Hd;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Hd;->s0(I)V

    return-void
.end method

.method static bridge synthetic g0(Lcom/google/android/gms/internal/ads/Hd;Lcom/google/android/gms/internal/ads/Kd;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Hd;->t0(Lcom/google/android/gms/internal/ads/Kd;)V

    return-void
.end method

.method static bridge synthetic h0(Lcom/google/android/gms/internal/ads/Hd;Lcom/google/android/gms/internal/ads/Ed;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Hd;->u0(Lcom/google/android/gms/internal/ads/Ed;)V

    return-void
.end method

.method static bridge synthetic i0(Lcom/google/android/gms/internal/ads/Hd;Lcom/google/android/gms/internal/ads/Ve;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Hd;->v0(Lcom/google/android/gms/internal/ads/Ve;)V

    return-void
.end method

.method static bridge synthetic j0(Lcom/google/android/gms/internal/ads/Hd;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/Hd;->w0(J)V

    return-void
.end method

.method static bridge synthetic k0(Lcom/google/android/gms/internal/ads/Hd;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/Hd;->x0(J)V

    return-void
.end method

.method static bridge synthetic l0(Lcom/google/android/gms/internal/ads/Hd;Lcom/google/android/gms/internal/ads/Ve;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Hd;->y0(Lcom/google/android/gms/internal/ads/Ve;)V

    return-void
.end method

.method static bridge synthetic m0(Lcom/google/android/gms/internal/ads/Hd;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/Hd;->z0(J)V

    return-void
.end method

.method static bridge synthetic n0(Lcom/google/android/gms/internal/ads/Hd;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/Hd;->A0(J)V

    return-void
.end method

.method static bridge synthetic o0(Lcom/google/android/gms/internal/ads/Hd;Lcom/google/android/gms/internal/ads/Ve;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Hd;->B0(Lcom/google/android/gms/internal/ads/Ve;)V

    return-void
.end method

.method private p0(Ljava/lang/Iterable;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Hd;->c0()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Fe;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzz:Lcom/google/android/gms/internal/ads/Ov0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fe;->a()I

    move-result v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Ov0;->K(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private q0(Lcom/google/android/gms/internal/ads/Ve;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ve;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzC:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    return-void
.end method

.method private r0(Lcom/google/android/gms/internal/ads/Ve;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ve;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzD:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    or-int/lit16 p1, p1, 0x80

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    return-void
.end method

.method private s0(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzE:I

    return-void
.end method

.method private t0(Lcom/google/android/gms/internal/ads/Kd;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Kd;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzG:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    return-void
.end method

.method private u0(Lcom/google/android/gms/internal/ads/Ed;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzA:Lcom/google/android/gms/internal/ads/Ed;

    iget p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    return-void
.end method

.method private v0(Lcom/google/android/gms/internal/ads/Ve;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ve;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzF:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    return-void
.end method

.method private w0(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzy:J

    return-void
.end method

.method private x0(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzx:J

    return-void
.end method

.method private y0(Lcom/google/android/gms/internal/ads/Ve;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ve;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzw:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    return-void
.end method

.method private z0(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzu:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/Hd;->zzv:J

    return-void
.end method


# virtual methods
.method public C0()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzv:J

    return-wide v0
.end method

.method public D0()Lcom/google/android/gms/internal/ads/Ve;
    .locals 1

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Hd;->zzw:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ve;->e(I)Lcom/google/android/gms/internal/ads/Ve;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/Ve;->D:Lcom/google/android/gms/internal/ads/Ve;

    :cond_0
    return-object v0
.end method

.method protected final W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x6

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_7

    if-eq v6, v5, :cond_6

    if-eq v6, v4, :cond_5

    const/4 v0, 0x0

    if-eq v6, v3, :cond_4

    if-eq v6, v2, :cond_3

    if-ne v6, v1, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/Hd;->zzp:Lcom/google/android/gms/internal/ads/tw0;

    if-nez v0, :cond_1

    const-class v1, Lcom/google/android/gms/internal/ads/Hd;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Hd;->zzp:Lcom/google/android/gms/internal/ads/tw0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/Gv0;

    sget-object v2, Lcom/google/android/gms/internal/ads/Hd;->zzo:Lcom/google/android/gms/internal/ads/Hd;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/Gv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Hd;->zzp:Lcom/google/android/gms/internal/ads/tw0;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    goto :goto_2

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_2
    return-object v0

    :cond_2
    throw v0

    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/ads/Hd;->zzo:Lcom/google/android/gms/internal/ads/Hd;

    return-object v0

    :cond_4
    new-instance v1, Lcom/google/android/gms/internal/ads/Id;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/Id;-><init>(Lcom/google/android/gms/internal/ads/ff;)V

    return-object v1

    :cond_5
    new-instance v0, Lcom/google/android/gms/internal/ads/Hd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Hd;-><init>()V

    return-object v0

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/Ve;->g()Lcom/google/android/gms/internal/ads/Nv0;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/ads/Fe;->g()Lcom/google/android/gms/internal/ads/Nv0;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ve;->g()Lcom/google/android/gms/internal/ads/Nv0;

    move-result-object v8

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ve;->g()Lcom/google/android/gms/internal/ads/Nv0;

    move-result-object v9

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ve;->g()Lcom/google/android/gms/internal/ads/Nv0;

    move-result-object v10

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ve;->g()Lcom/google/android/gms/internal/ads/Nv0;

    move-result-object v11

    invoke-static {}, Lcom/google/android/gms/internal/ads/Kd;->g()Lcom/google/android/gms/internal/ads/Nv0;

    move-result-object v12

    const/16 v13, 0x15

    new-array v13, v13, [Ljava/lang/Object;

    const-string v14, "zzu"

    const/4 v15, 0x0

    aput-object v14, v13, v15

    const-string v14, "zzv"

    aput-object v14, v13, v0

    const-string v0, "zzw"

    aput-object v0, v13, v5

    aput-object v6, v13, v4

    const-string v0, "zzx"

    aput-object v0, v13, v3

    const-string v0, "zzy"

    aput-object v0, v13, v2

    const-string v0, "zzz"

    aput-object v0, v13, v1

    const/4 v0, 0x7

    aput-object v7, v13, v0

    const-string v0, "zzA"

    const/16 v1, 0x8

    aput-object v0, v13, v1

    const-string v0, "zzB"

    const/16 v1, 0x9

    aput-object v0, v13, v1

    const/16 v0, 0xa

    aput-object v8, v13, v0

    const-string v0, "zzC"

    const/16 v1, 0xb

    aput-object v0, v13, v1

    const/16 v0, 0xc

    aput-object v9, v13, v0

    const-string v0, "zzD"

    const/16 v1, 0xd

    aput-object v0, v13, v1

    const/16 v0, 0xe

    aput-object v10, v13, v0

    const-string v0, "zzE"

    const/16 v1, 0xf

    aput-object v0, v13, v1

    const-string v0, "zzF"

    const/16 v1, 0x10

    aput-object v0, v13, v1

    const/16 v0, 0x11

    aput-object v11, v13, v0

    const-string v0, "zzG"

    const/16 v1, 0x12

    aput-object v0, v13, v1

    const/16 v0, 0x13

    aput-object v12, v13, v0

    const-string v0, "zzH"

    const/16 v1, 0x14

    aput-object v0, v13, v1

    sget-object v0, Lcom/google/android/gms/internal/ads/Hd;->zzo:Lcom/google/android/gms/internal/ads/Hd;

    const-string v1, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u180c\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u081e\u0006\u1009\u0004\u0007\u180c\u0005\u0008\u180c\u0006\t\u180c\u0007\n\u1004\u0008\u000b\u180c\t\u000c\u180c\n\r\u1002\u000b"

    invoke-static {v0, v1, v13}, Lcom/google/android/gms/internal/ads/Jv0;->A(Lcom/google/android/gms/internal/ads/mw0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_7
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method
