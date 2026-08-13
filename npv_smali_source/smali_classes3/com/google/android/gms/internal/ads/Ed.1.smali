.class public final Lcom/google/android/gms/internal/ads/Ed;
.super Lcom/google/android/gms/internal/ads/Jv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# static fields
.field public static final zza:I = 0x1

.field public static final zzb:I = 0x2

.field private static final zzc:Lcom/google/android/gms/internal/ads/Ed;

.field private static volatile zzd:Lcom/google/android/gms/internal/ads/tw0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/tw0;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Ed;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Ed;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Ed;->zzc:Lcom/google/android/gms/internal/ads/Ed;

    const-class v1, Lcom/google/android/gms/internal/ads/Ed;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Jv0;->F(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jv0;-><init>()V

    return-void
.end method

.method private b0(Lcom/google/android/gms/internal/ads/Ad;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ad;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ed;->zzg:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/Ed;->zze:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ed;->zze:I

    return-void
.end method

.method private c0(Lcom/google/android/gms/internal/ads/Cd;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Cd;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ed;->zzf:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/Ed;->zze:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ed;->zze:I

    return-void
.end method

.method public static d0()Lcom/google/android/gms/internal/ads/zd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Ed;->zzc:Lcom/google/android/gms/internal/ads/Ed;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->p()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zd;

    return-object v0
.end method

.method static bridge synthetic e0()Lcom/google/android/gms/internal/ads/Ed;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Ed;->zzc:Lcom/google/android/gms/internal/ads/Ed;

    return-object v0
.end method

.method static bridge synthetic f0(Lcom/google/android/gms/internal/ads/Ed;Lcom/google/android/gms/internal/ads/Ad;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Ed;->b0(Lcom/google/android/gms/internal/ads/Ad;)V

    return-void
.end method

.method static bridge synthetic g0(Lcom/google/android/gms/internal/ads/Ed;Lcom/google/android/gms/internal/ads/Cd;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Ed;->c0(Lcom/google/android/gms/internal/ads/Cd;)V

    return-void
.end method


# virtual methods
.method protected final W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

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

    sget-object p1, Lcom/google/android/gms/internal/ads/Ed;->zzd:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/Ed;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/Ed;->zzd:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/Gv0;

    sget-object p3, Lcom/google/android/gms/internal/ads/Ed;->zzc:Lcom/google/android/gms/internal/ads/Ed;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/Gv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/Ed;->zzd:Lcom/google/android/gms/internal/ads/tw0;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/Ed;->zzc:Lcom/google/android/gms/internal/ads/Ed;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/zd;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zd;-><init>(Lcom/google/android/gms/internal/ads/ff;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/Ed;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/Ed;-><init>()V

    return-object p1

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/Cd;->g()Lcom/google/android/gms/internal/ads/Nv0;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ad;->g()Lcom/google/android/gms/internal/ads/Nv0;

    move-result-object v3

    new-array p3, p3, [Ljava/lang/Object;

    const-string v4, "zze"

    const/4 v5, 0x0

    aput-object v4, p3, v5

    const-string v4, "zzf"

    aput-object v4, p3, p2

    aput-object p1, p3, v2

    const-string p1, "zzg"

    aput-object p1, p3, v1

    aput-object v3, p3, v0

    sget-object p1, Lcom/google/android/gms/internal/ads/Ed;->zzc:Lcom/google/android/gms/internal/ads/Ed;

    const-string p2, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001"

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Jv0;->A(Lcom/google/android/gms/internal/ads/mw0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
