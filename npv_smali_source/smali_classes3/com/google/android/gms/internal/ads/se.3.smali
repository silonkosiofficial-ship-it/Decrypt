.class public final Lcom/google/android/gms/internal/ads/se;
.super Lcom/google/android/gms/internal/ads/Jv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# static fields
.field public static final zza:I = 0x1

.field private static final zzb:Lcom/google/android/gms/internal/ads/se;

.field private static volatile zzc:Lcom/google/android/gms/internal/ads/tw0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/tw0;"
        }
    .end annotation
.end field


# instance fields
.field private zzd:Lcom/google/android/gms/internal/ads/Sv0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/Sv0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/se;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/se;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/se;->zzb:Lcom/google/android/gms/internal/ads/se;

    const-class v1, Lcom/google/android/gms/internal/ads/se;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Jv0;->F(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jv0;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Jv0;->v()Lcom/google/android/gms/internal/ads/Sv0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/se;->zzd:Lcom/google/android/gms/internal/ads/Sv0;

    return-void
.end method

.method private b0(Lcom/google/android/gms/internal/ads/ke;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/se;->c0()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/se;->zzd:Lcom/google/android/gms/internal/ads/Sv0;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private c0()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/se;->zzd:Lcom/google/android/gms/internal/ads/Sv0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Sv0;->c()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Jv0;->w(Lcom/google/android/gms/internal/ads/Sv0;)Lcom/google/android/gms/internal/ads/Sv0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/se;->zzd:Lcom/google/android/gms/internal/ads/Sv0;

    :cond_0
    return-void
.end method

.method public static d0()Lcom/google/android/gms/internal/ads/le;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/se;->zzb:Lcom/google/android/gms/internal/ads/se;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->p()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/le;

    return-object v0
.end method

.method static bridge synthetic e0()Lcom/google/android/gms/internal/ads/se;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/se;->zzb:Lcom/google/android/gms/internal/ads/se;

    return-object v0
.end method

.method static bridge synthetic f0(Lcom/google/android/gms/internal/ads/se;Lcom/google/android/gms/internal/ads/ke;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/se;->b0(Lcom/google/android/gms/internal/ads/ke;)V

    return-void
.end method


# virtual methods
.method protected final W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    const/4 p2, 0x1

    const/4 p3, 0x2

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_7

    if-eq p1, p3, :cond_6

    const/4 p2, 0x3

    if-eq p1, p2, :cond_5

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_4

    const/4 p2, 0x5

    if-eq p1, p2, :cond_3

    const/4 p2, 0x6

    if-ne p1, p2, :cond_2

    sget-object p1, Lcom/google/android/gms/internal/ads/se;->zzc:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/se;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/se;->zzc:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/Gv0;

    sget-object p3, Lcom/google/android/gms/internal/ads/se;->zzb:Lcom/google/android/gms/internal/ads/se;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/Gv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/se;->zzc:Lcom/google/android/gms/internal/ads/tw0;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/se;->zzb:Lcom/google/android/gms/internal/ads/se;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/le;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/le;-><init>(Lcom/google/android/gms/internal/ads/ff;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/se;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/se;-><init>()V

    return-object p1

    :cond_6
    new-array p1, p3, [Ljava/lang/Object;

    const-string p3, "zzd"

    const/4 v0, 0x0

    aput-object p3, p1, v0

    const-class p3, Lcom/google/android/gms/internal/ads/ke;

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/se;->zzb:Lcom/google/android/gms/internal/ads/se;

    const-string p3, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/Jv0;->A(Lcom/google/android/gms/internal/ads/mw0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
