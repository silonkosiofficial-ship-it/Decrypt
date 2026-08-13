.class public final Lcom/google/android/gms/internal/ads/rt0;
.super Lcom/google/android/gms/internal/ads/Jv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/rt0;

.field private static volatile zzb:Lcom/google/android/gms/internal/ads/tw0;


# instance fields
.field private zzc:I

.field private zzd:Lcom/google/android/gms/internal/ads/Sv0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/rt0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/rt0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/rt0;->zza:Lcom/google/android/gms/internal/ads/rt0;

    const-class v1, Lcom/google/android/gms/internal/ads/rt0;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Jv0;->F(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jv0;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Jv0;->v()Lcom/google/android/gms/internal/ads/Sv0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rt0;->zzd:Lcom/google/android/gms/internal/ads/Sv0;

    return-void
.end method

.method public static d0()Lcom/google/android/gms/internal/ads/nt0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/rt0;->zza:Lcom/google/android/gms/internal/ads/rt0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->p()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/nt0;

    return-object v0
.end method

.method static bridge synthetic f0()Lcom/google/android/gms/internal/ads/rt0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/rt0;->zza:Lcom/google/android/gms/internal/ads/rt0;

    return-object v0
.end method

.method public static g0(Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/rt0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/rt0;->zza:Lcom/google/android/gms/internal/ads/rt0;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Jv0;->O(Lcom/google/android/gms/internal/ads/Jv0;Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/rt0;

    return-object p0
.end method

.method static synthetic i0(Lcom/google/android/gms/internal/ads/rt0;Lcom/google/android/gms/internal/ads/pt0;)V
    .locals 2

    .prologue
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt0;->zzd:Lcom/google/android/gms/internal/ads/Sv0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Sv0;->c()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Jv0;->w(Lcom/google/android/gms/internal/ads/Sv0;)Lcom/google/android/gms/internal/ads/Sv0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rt0;->zzd:Lcom/google/android/gms/internal/ads/Sv0;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/rt0;->zzd:Lcom/google/android/gms/internal/ads/Sv0;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static synthetic j0(Lcom/google/android/gms/internal/ads/rt0;I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/rt0;->zzc:I

    return-void
.end method


# virtual methods
.method protected final W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    const/4 p2, 0x1

    const/4 p3, 0x3

    const/4 v0, 0x2

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_7

    if-eq p1, v0, :cond_6

    if-eq p1, p3, :cond_5

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_4

    const/4 p2, 0x5

    if-eq p1, p2, :cond_3

    const/4 p2, 0x6

    if-ne p1, p2, :cond_2

    sget-object p1, Lcom/google/android/gms/internal/ads/rt0;->zzb:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/rt0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/rt0;->zzb:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/Gv0;

    sget-object p3, Lcom/google/android/gms/internal/ads/rt0;->zza:Lcom/google/android/gms/internal/ads/rt0;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/Gv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/rt0;->zzb:Lcom/google/android/gms/internal/ads/tw0;

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
    throw p3

    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/ads/rt0;->zza:Lcom/google/android/gms/internal/ads/rt0;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/nt0;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/nt0;-><init>(Lcom/google/android/gms/internal/ads/qt0;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/rt0;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/rt0;-><init>()V

    return-object p1

    :cond_6
    new-array p1, p3, [Ljava/lang/Object;

    const-string p3, "zzc"

    const/4 v1, 0x0

    aput-object p3, p1, v1

    const-string p3, "zzd"

    aput-object p3, p1, p2

    const-class p2, Lcom/google/android/gms/internal/ads/pt0;

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/gms/internal/ads/rt0;->zza:Lcom/google/android/gms/internal/ads/rt0;

    const-string p3, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"

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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt0;->zzd:Lcom/google/android/gms/internal/ads/Sv0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final c0()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/rt0;->zzc:I

    return v0
.end method

.method public final e0(I)Lcom/google/android/gms/internal/ads/pt0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt0;->zzd:Lcom/google/android/gms/internal/ads/Sv0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/pt0;

    return-object p1
.end method

.method public final h0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt0;->zzd:Lcom/google/android/gms/internal/ads/Sv0;

    return-object v0
.end method
