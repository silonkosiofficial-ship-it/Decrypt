.class public final Lcom/google/android/gms/internal/ads/Tr0;
.super Lcom/google/android/gms/internal/ads/Jv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/Tr0;

.field private static volatile zzb:Lcom/google/android/gms/internal/ads/tw0;


# instance fields
.field private zzc:I

.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/ads/fv0;

.field private zzf:Lcom/google/android/gms/internal/ads/Zr0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Tr0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Tr0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Tr0;->zza:Lcom/google/android/gms/internal/ads/Tr0;

    const-class v1, Lcom/google/android/gms/internal/ads/Tr0;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Jv0;->F(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jv0;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/ads/fv0;->D:Lcom/google/android/gms/internal/ads/fv0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Tr0;->zze:Lcom/google/android/gms/internal/ads/fv0;

    return-void
.end method

.method public static c0()Lcom/google/android/gms/internal/ads/Rr0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Tr0;->zza:Lcom/google/android/gms/internal/ads/Tr0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->p()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Rr0;

    return-object v0
.end method

.method static bridge synthetic d0()Lcom/google/android/gms/internal/ads/Tr0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Tr0;->zza:Lcom/google/android/gms/internal/ads/Tr0;

    return-object v0
.end method

.method public static e0(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Tr0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Tr0;->zza:Lcom/google/android/gms/internal/ads/Tr0;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Jv0;->N(Lcom/google/android/gms/internal/ads/Jv0;Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Tr0;

    return-object p0
.end method

.method public static h0()Lcom/google/android/gms/internal/ads/tw0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Tr0;->zza:Lcom/google/android/gms/internal/ads/Tr0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->x()Lcom/google/android/gms/internal/ads/tw0;

    move-result-object v0

    return-object v0
.end method

.method static synthetic i0(Lcom/google/android/gms/internal/ads/Tr0;Lcom/google/android/gms/internal/ads/fv0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Tr0;->zze:Lcom/google/android/gms/internal/ads/fv0;

    return-void
.end method

.method static synthetic j0(Lcom/google/android/gms/internal/ads/Tr0;Lcom/google/android/gms/internal/ads/Zr0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Tr0;->zzf:Lcom/google/android/gms/internal/ads/Zr0;

    iget p1, p0, Lcom/google/android/gms/internal/ads/Tr0;->zzc:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Tr0;->zzc:I

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

    sget-object p1, Lcom/google/android/gms/internal/ads/Tr0;->zzb:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/Tr0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/Tr0;->zzb:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/Gv0;

    sget-object p3, Lcom/google/android/gms/internal/ads/Tr0;->zza:Lcom/google/android/gms/internal/ads/Tr0;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/Gv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/Tr0;->zzb:Lcom/google/android/gms/internal/ads/tw0;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/Tr0;->zza:Lcom/google/android/gms/internal/ads/Tr0;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/Rr0;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/Rr0;-><init>(Lcom/google/android/gms/internal/ads/Sr0;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/Tr0;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/Tr0;-><init>()V

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

    sget-object p2, Lcom/google/android/gms/internal/ads/Tr0;->zza:Lcom/google/android/gms/internal/ads/Tr0;

    const-string p3, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\u1009\u0000"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/Jv0;->A(Lcom/google/android/gms/internal/ads/mw0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final b0()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Tr0;->zzd:I

    return v0
.end method

.method public final f0()Lcom/google/android/gms/internal/ads/Zr0;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Tr0;->zzf:Lcom/google/android/gms/internal/ads/Zr0;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zr0;->e0()Lcom/google/android/gms/internal/ads/Zr0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final g0()Lcom/google/android/gms/internal/ads/fv0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Tr0;->zze:Lcom/google/android/gms/internal/ads/fv0;

    return-object v0
.end method
