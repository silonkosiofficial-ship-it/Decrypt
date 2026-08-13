.class public final Lcom/google/android/gms/internal/ads/vt0;
.super Lcom/google/android/gms/internal/ads/Jv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/vt0;

.field private static volatile zzb:Lcom/google/android/gms/internal/ads/tw0;


# instance fields
.field private zzc:Ljava/lang/String;

.field private zzd:I

.field private zze:I

.field private zzf:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/vt0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/vt0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/vt0;->zza:Lcom/google/android/gms/internal/ads/vt0;

    const-class v1, Lcom/google/android/gms/internal/ads/vt0;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Jv0;->F(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jv0;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/vt0;->zzc:Ljava/lang/String;

    return-void
.end method

.method public static b0()Lcom/google/android/gms/internal/ads/tt0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/vt0;->zza:Lcom/google/android/gms/internal/ads/vt0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->p()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/tt0;

    return-object v0
.end method

.method static bridge synthetic c0()Lcom/google/android/gms/internal/ads/vt0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/vt0;->zza:Lcom/google/android/gms/internal/ads/vt0;

    return-object v0
.end method

.method static synthetic d0(Lcom/google/android/gms/internal/ads/vt0;I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/vt0;->zze:I

    return-void
.end method

.method static synthetic e0(Lcom/google/android/gms/internal/ads/vt0;Lcom/google/android/gms/internal/ads/Kt0;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Kt0;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/vt0;->zzf:I

    return-void
.end method

.method static synthetic f0(Lcom/google/android/gms/internal/ads/vt0;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vt0;->zzc:Ljava/lang/String;

    return-void
.end method

.method static synthetic g0(Lcom/google/android/gms/internal/ads/vt0;I)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/gt0;->a(I)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/vt0;->zzd:I

    return-void
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

    sget-object p1, Lcom/google/android/gms/internal/ads/vt0;->zzb:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/vt0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/vt0;->zzb:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/Gv0;

    sget-object p3, Lcom/google/android/gms/internal/ads/vt0;->zza:Lcom/google/android/gms/internal/ads/vt0;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/Gv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/vt0;->zzb:Lcom/google/android/gms/internal/ads/tw0;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/vt0;->zza:Lcom/google/android/gms/internal/ads/vt0;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/tt0;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/tt0;-><init>(Lcom/google/android/gms/internal/ads/wt0;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/vt0;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/vt0;-><init>()V

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

    sget-object p2, Lcom/google/android/gms/internal/ads/vt0;->zza:Lcom/google/android/gms/internal/ads/vt0;

    const-string p3, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u000c\u0003\u000b\u0004\u000c"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/Jv0;->A(Lcom/google/android/gms/internal/ads/mw0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
