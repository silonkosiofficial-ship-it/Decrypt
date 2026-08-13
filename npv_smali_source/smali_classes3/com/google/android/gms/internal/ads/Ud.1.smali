.class public final Lcom/google/android/gms/internal/ads/Ud;
.super Lcom/google/android/gms/internal/ads/Jv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# static fields
.field public static final zza:I = 0x1

.field public static final zzb:I = 0x2

.field public static final zzc:I = 0x3

.field private static final zzd:Lcom/google/android/gms/internal/ads/Ud;

.field private static volatile zze:Lcom/google/android/gms/internal/ads/tw0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/tw0;"
        }
    .end annotation
.end field


# instance fields
.field private zzf:I

.field private zzg:Ljava/lang/String;

.field private zzh:I

.field private zzi:Lcom/google/android/gms/internal/ads/Wd;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Ud;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Ud;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Ud;->zzd:Lcom/google/android/gms/internal/ads/Ud;

    const-class v1, Lcom/google/android/gms/internal/ads/Ud;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Jv0;->F(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jv0;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Ud;->zzg:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic b0()Lcom/google/android/gms/internal/ads/Ud;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Ud;->zzd:Lcom/google/android/gms/internal/ads/Ud;

    return-object v0
.end method


# virtual methods
.method protected final W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    const/4 p2, 0x1

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_7

    if-eq p1, v2, :cond_6

    if-eq p1, v1, :cond_5

    const/4 p2, 0x0

    if-eq p1, v0, :cond_4

    if-eq p1, p3, :cond_3

    const/4 p3, 0x6

    if-ne p1, p3, :cond_2

    sget-object p1, Lcom/google/android/gms/internal/ads/Ud;->zze:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/Ud;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/Ud;->zze:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/Gv0;

    sget-object p3, Lcom/google/android/gms/internal/ads/Ud;->zzd:Lcom/google/android/gms/internal/ads/Ud;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/Gv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/Ud;->zze:Lcom/google/android/gms/internal/ads/tw0;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/Ud;->zzd:Lcom/google/android/gms/internal/ads/Ud;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/Td;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/Td;-><init>(Lcom/google/android/gms/internal/ads/ff;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/Ud;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/Ud;-><init>()V

    return-object p1

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/Ve;->g()Lcom/google/android/gms/internal/ads/Nv0;

    move-result-object p1

    new-array p3, p3, [Ljava/lang/Object;

    const-string v3, "zzf"

    const/4 v4, 0x0

    aput-object v3, p3, v4

    const-string v3, "zzg"

    aput-object v3, p3, p2

    const-string p2, "zzh"

    aput-object p2, p3, v2

    aput-object p1, p3, v1

    const-string p1, "zzi"

    aput-object p1, p3, v0

    sget-object p1, Lcom/google/android/gms/internal/ads/Ud;->zzd:Lcom/google/android/gms/internal/ads/Ud;

    const-string p2, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u1009\u0002"

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Jv0;->A(Lcom/google/android/gms/internal/ads/mw0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
