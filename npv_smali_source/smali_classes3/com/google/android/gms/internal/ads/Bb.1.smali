.class public final Lcom/google/android/gms/internal/ads/Bb;
.super Lcom/google/android/gms/internal/ads/Jv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/Bb;

.field private static volatile zzb:Lcom/google/android/gms/internal/ads/tw0;


# instance fields
.field private zzc:I

.field private zzd:Ljava/lang/String;

.field private zze:Ljava/lang/String;

.field private zzf:J

.field private zzg:J

.field private zzh:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Bb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Bb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Bb;->zza:Lcom/google/android/gms/internal/ads/Bb;

    const-class v1, Lcom/google/android/gms/internal/ads/Bb;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Jv0;->F(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jv0;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzd:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zze:Ljava/lang/String;

    return-void
.end method

.method public static e0()Lcom/google/android/gms/internal/ads/zb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Bb;->zza:Lcom/google/android/gms/internal/ads/Bb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->p()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zb;

    return-object v0
.end method

.method static bridge synthetic f0()Lcom/google/android/gms/internal/ads/Bb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Bb;->zza:Lcom/google/android/gms/internal/ads/Bb;

    return-object v0
.end method

.method public static g0()Lcom/google/android/gms/internal/ads/Bb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Bb;->zza:Lcom/google/android/gms/internal/ads/Bb;

    return-object v0
.end method

.method public static h0(Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/Bb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Bb;->zza:Lcom/google/android/gms/internal/ads/Bb;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/Jv0;->L(Lcom/google/android/gms/internal/ads/Jv0;Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Bb;

    return-object p0
.end method

.method public static i0(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Bb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Bb;->zza:Lcom/google/android/gms/internal/ads/Bb;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Jv0;->N(Lcom/google/android/gms/internal/ads/Jv0;Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Bb;

    return-object p0
.end method

.method static synthetic l0(Lcom/google/android/gms/internal/ads/Bb;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzc:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzc:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Bb;->zze:Ljava/lang/String;

    return-void
.end method

.method static synthetic m0(Lcom/google/android/gms/internal/ads/Bb;J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzc:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzc:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/Bb;->zzg:J

    return-void
.end method

.method static synthetic n0(Lcom/google/android/gms/internal/ads/Bb;J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzc:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzc:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/Bb;->zzf:J

    return-void
.end method

.method static synthetic o0(Lcom/google/android/gms/internal/ads/Bb;J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzc:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzc:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/Bb;->zzh:J

    return-void
.end method

.method static synthetic p0(Lcom/google/android/gms/internal/ads/Bb;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzc:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzc:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Bb;->zzd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    const/4 p2, 0x1

    const/4 p3, 0x6

    const/4 v0, 0x5

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_7

    if-eq p1, v3, :cond_6

    if-eq p1, v2, :cond_5

    const/4 p2, 0x0

    if-eq p1, v1, :cond_4

    if-eq p1, v0, :cond_3

    if-ne p1, p3, :cond_2

    sget-object p1, Lcom/google/android/gms/internal/ads/Bb;->zzb:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/Bb;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/Bb;->zzb:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/Gv0;

    sget-object p3, Lcom/google/android/gms/internal/ads/Bb;->zza:Lcom/google/android/gms/internal/ads/Bb;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/Gv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/Bb;->zzb:Lcom/google/android/gms/internal/ads/tw0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p2

    goto :goto_2

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    return-object p1

    :cond_2
    throw p2

    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/ads/Bb;->zza:Lcom/google/android/gms/internal/ads/Bb;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/zb;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zb;-><init>(Lcom/google/android/gms/internal/ads/Ab;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/Bb;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/Bb;-><init>()V

    return-object p1

    :cond_6
    new-array p1, p3, [Ljava/lang/Object;

    const-string p3, "zzc"

    const/4 v4, 0x0

    aput-object p3, p1, v4

    const-string p3, "zzd"

    aput-object p3, p1, p2

    const-string p2, "zze"

    aput-object p2, p1, v3

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/gms/internal/ads/Bb;->zza:Lcom/google/android/gms/internal/ads/Bb;

    const-string p3, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1003\u0002\u0004\u1003\u0003\u0005\u1003\u0004"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/Jv0;->A(Lcom/google/android/gms/internal/ads/mw0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final b0()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzg:J

    return-wide v0
.end method

.method public final c0()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzf:J

    return-wide v0
.end method

.method public final d0()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzh:J

    return-wide v0
.end method

.method public final j0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final k0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Bb;->zzd:Ljava/lang/String;

    return-object v0
.end method
