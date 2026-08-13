.class public final Lcom/google/android/gms/internal/ads/c9;
.super Lcom/google/android/gms/internal/ads/Jv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/c9;

.field private static volatile zzb:Lcom/google/android/gms/internal/ads/tw0;


# instance fields
.field private zzc:I

.field private zzd:J

.field private zze:Ljava/lang/String;

.field private zzf:Lcom/google/android/gms/internal/ads/fv0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/c9;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/c9;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/c9;->zza:Lcom/google/android/gms/internal/ads/c9;

    const-class v1, Lcom/google/android/gms/internal/ads/c9;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Jv0;->F(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jv0;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/c9;->zze:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/ads/fv0;->D:Lcom/google/android/gms/internal/ads/fv0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/c9;->zzf:Lcom/google/android/gms/internal/ads/fv0;

    return-void
.end method

.method static bridge synthetic c0()Lcom/google/android/gms/internal/ads/c9;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/c9;->zza:Lcom/google/android/gms/internal/ads/c9;

    return-object v0
.end method

.method public static d0()Lcom/google/android/gms/internal/ads/c9;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/c9;->zza:Lcom/google/android/gms/internal/ads/c9;

    return-object v0
.end method


# virtual methods
.method protected final W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 p2, 0x1

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_7

    if-eq p1, v1, :cond_6

    if-eq p1, v0, :cond_5

    const/4 p2, 0x0

    if-eq p1, p3, :cond_4

    const/4 p3, 0x5

    if-eq p1, p3, :cond_3

    const/4 p3, 0x6

    if-ne p1, p3, :cond_2

    sget-object p1, Lcom/google/android/gms/internal/ads/c9;->zzb:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/c9;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/c9;->zzb:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/Gv0;

    sget-object p3, Lcom/google/android/gms/internal/ads/c9;->zza:Lcom/google/android/gms/internal/ads/c9;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/Gv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/c9;->zzb:Lcom/google/android/gms/internal/ads/tw0;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/c9;->zza:Lcom/google/android/gms/internal/ads/c9;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/b9;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/b9;-><init>(Lcom/google/android/gms/internal/ads/h9;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/c9;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/c9;-><init>()V

    return-object p1

    :cond_6
    new-array p1, p3, [Ljava/lang/Object;

    const-string p3, "zzc"

    const/4 v2, 0x0

    aput-object p3, p1, v2

    const-string p3, "zzd"

    aput-object p3, p1, p2

    const-string p2, "zze"

    aput-object p2, p1, v1

    const-string p2, "zzf"

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/gms/internal/ads/c9;->zza:Lcom/google/android/gms/internal/ads/c9;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0003\u1008\u0001\u0004\u100a\u0002"

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

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/c9;->zzd:J

    return-wide v0
.end method

.method public final e0()Lcom/google/android/gms/internal/ads/fv0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c9;->zzf:Lcom/google/android/gms/internal/ads/fv0;

    return-object v0
.end method

.method public final f0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c9;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final g0()Z
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/c9;->zzc:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
