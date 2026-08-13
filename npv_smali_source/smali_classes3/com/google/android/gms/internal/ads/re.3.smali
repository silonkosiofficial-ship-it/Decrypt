.class public final Lcom/google/android/gms/internal/ads/re;
.super Lcom/google/android/gms/internal/ads/Jv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# static fields
.field public static final zza:I = 0x1

.field public static final zzb:I = 0x2

.field public static final zzc:I = 0x3

.field private static final zzd:Lcom/google/android/gms/internal/ads/re;

.field private static volatile zze:Lcom/google/android/gms/internal/ads/tw0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/tw0;"
        }
    .end annotation
.end field


# instance fields
.field private zzf:I

.field private zzg:Z

.field private zzh:Z

.field private zzi:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/re;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/re;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/re;->zzd:Lcom/google/android/gms/internal/ads/re;

    const-class v1, Lcom/google/android/gms/internal/ads/re;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Jv0;->F(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jv0;-><init>()V

    return-void
.end method

.method static bridge synthetic b0(Lcom/google/android/gms/internal/ads/re;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/re;->e0(Z)V

    return-void
.end method

.method static bridge synthetic c0(Lcom/google/android/gms/internal/ads/re;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/re;->f0(Z)V

    return-void
.end method

.method static bridge synthetic d0(Lcom/google/android/gms/internal/ads/re;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/re;->g0(I)V

    return-void
.end method

.method private e0(Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/re;->zzf:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/re;->zzf:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/re;->zzg:Z

    return-void
.end method

.method private f0(Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/re;->zzf:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/re;->zzf:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/re;->zzh:Z

    return-void
.end method

.method private g0(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/re;->zzf:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ads/re;->zzf:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/re;->zzi:I

    return-void
.end method

.method public static h0()Lcom/google/android/gms/internal/ads/qe;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/re;->zzd:Lcom/google/android/gms/internal/ads/re;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->p()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/qe;

    return-object v0
.end method

.method static bridge synthetic i0()Lcom/google/android/gms/internal/ads/re;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/re;->zzd:Lcom/google/android/gms/internal/ads/re;

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

    sget-object p1, Lcom/google/android/gms/internal/ads/re;->zze:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/re;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/re;->zze:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/Gv0;

    sget-object p3, Lcom/google/android/gms/internal/ads/re;->zzd:Lcom/google/android/gms/internal/ads/re;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/Gv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/re;->zze:Lcom/google/android/gms/internal/ads/tw0;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/re;->zzd:Lcom/google/android/gms/internal/ads/re;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/qe;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/qe;-><init>(Lcom/google/android/gms/internal/ads/ff;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/re;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/re;-><init>()V

    return-object p1

    :cond_6
    new-array p1, p3, [Ljava/lang/Object;

    const-string p3, "zzf"

    const/4 v2, 0x0

    aput-object p3, p1, v2

    const-string p3, "zzg"

    aput-object p3, p1, p2

    const-string p2, "zzh"

    aput-object p2, p1, v1

    const-string p2, "zzi"

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/gms/internal/ads/re;->zzd:Lcom/google/android/gms/internal/ads/re;

    const-string p3, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u100b\u0002"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/Jv0;->A(Lcom/google/android/gms/internal/ads/mw0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
