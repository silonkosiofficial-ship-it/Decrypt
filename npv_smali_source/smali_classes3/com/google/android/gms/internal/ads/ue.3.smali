.class public final Lcom/google/android/gms/internal/ads/ue;
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

.field private static final zzf:Lcom/google/android/gms/internal/ads/ue;

.field private static volatile zzg:Lcom/google/android/gms/internal/ads/tw0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/tw0;"
        }
    .end annotation
.end field


# instance fields
.field private zzh:I

.field private zzi:I

.field private zzj:Lcom/google/android/gms/internal/ads/ge;

.field private zzk:I

.field private zzl:I

.field private zzm:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/ue;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ue;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/ue;->zzf:Lcom/google/android/gms/internal/ads/ue;

    const-class v1, Lcom/google/android/gms/internal/ads/ue;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Jv0;->F(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jv0;-><init>()V

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/google/android/gms/internal/ads/ue;->zzi:I

    return-void
.end method

.method static bridge synthetic b0()Lcom/google/android/gms/internal/ads/ue;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/ue;->zzf:Lcom/google/android/gms/internal/ads/ue;

    return-object v0
.end method


# virtual methods
.method protected final W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

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

    sget-object p1, Lcom/google/android/gms/internal/ads/ue;->zzg:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/ue;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/ue;->zzg:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/Gv0;

    sget-object p3, Lcom/google/android/gms/internal/ads/ue;->zzf:Lcom/google/android/gms/internal/ads/ue;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/Gv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/ue;->zzg:Lcom/google/android/gms/internal/ads/tw0;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/ue;->zzf:Lcom/google/android/gms/internal/ads/ue;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/te;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/te;-><init>(Lcom/google/android/gms/internal/ads/ff;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/ue;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/ue;-><init>()V

    return-object p1

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/Ve;->g()Lcom/google/android/gms/internal/ads/Nv0;

    move-result-object p1

    const/4 v4, 0x7

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "zzh"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-string v5, "zzi"

    aput-object v5, v4, p2

    aput-object p1, v4, v3

    const-string p1, "zzj"

    aput-object p1, v4, v2

    const-string p1, "zzk"

    aput-object p1, v4, v1

    const-string p1, "zzl"

    aput-object p1, v4, v0

    const-string p1, "zzm"

    aput-object p1, v4, p3

    sget-object p1, Lcom/google/android/gms/internal/ads/ue;->zzf:Lcom/google/android/gms/internal/ads/ue;

    const-string p2, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004"

    invoke-static {p1, p2, v4}, Lcom/google/android/gms/internal/ads/Jv0;->A(Lcom/google/android/gms/internal/ads/mw0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
