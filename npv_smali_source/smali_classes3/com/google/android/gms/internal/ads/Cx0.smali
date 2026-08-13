.class public final Lcom/google/android/gms/internal/ads/Cx0;
.super Lcom/google/android/gms/internal/ads/Jv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/Cx0;

.field private static volatile zzb:Lcom/google/android/gms/internal/ads/tw0;


# instance fields
.field private zzc:I

.field private zzd:Lcom/google/android/gms/internal/ads/fv0;

.field private zze:Lcom/google/android/gms/internal/ads/fv0;

.field private zzf:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Cx0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Cx0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Cx0;->zza:Lcom/google/android/gms/internal/ads/Cx0;

    const-class v1, Lcom/google/android/gms/internal/ads/Cx0;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Jv0;->F(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jv0;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/ads/Cx0;->zzf:B

    sget-object v0, Lcom/google/android/gms/internal/ads/fv0;->D:Lcom/google/android/gms/internal/ads/fv0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Cx0;->zzd:Lcom/google/android/gms/internal/ads/fv0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Cx0;->zze:Lcom/google/android/gms/internal/ads/fv0;

    return-void
.end method

.method public static b0()Lcom/google/android/gms/internal/ads/Bx0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Cx0;->zza:Lcom/google/android/gms/internal/ads/Cx0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->p()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Bx0;

    return-object v0
.end method

.method static bridge synthetic c0()Lcom/google/android/gms/internal/ads/Cx0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Cx0;->zza:Lcom/google/android/gms/internal/ads/Cx0;

    return-object v0
.end method

.method static synthetic d0(Lcom/google/android/gms/internal/ads/Cx0;Lcom/google/android/gms/internal/ads/fv0;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Cx0;->zzc:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/Cx0;->zzc:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Cx0;->zzd:Lcom/google/android/gms/internal/ads/fv0;

    return-void
.end method

.method static synthetic e0(Lcom/google/android/gms/internal/ads/Cx0;Lcom/google/android/gms/internal/ads/fv0;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Cx0;->zzc:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/Cx0;->zzc:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Cx0;->zze:Lcom/google/android/gms/internal/ads/fv0;

    return-void
.end method


# virtual methods
.method protected final W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    const/4 p3, 0x1

    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    throw v1

    :pswitch_0
    sget-object p1, Lcom/google/android/gms/internal/ads/Cx0;->zzb:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/Cx0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/Cx0;->zzb:Lcom/google/android/gms/internal/ads/tw0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/Gv0;

    sget-object p3, Lcom/google/android/gms/internal/ads/Cx0;->zza:Lcom/google/android/gms/internal/ads/Cx0;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/Gv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/Cx0;->zzb:Lcom/google/android/gms/internal/ads/tw0;

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

    :pswitch_1
    sget-object p1, Lcom/google/android/gms/internal/ads/Cx0;->zza:Lcom/google/android/gms/internal/ads/Cx0;

    return-object p1

    :pswitch_2
    new-instance p1, Lcom/google/android/gms/internal/ads/Bx0;

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/ads/Bx0;-><init>(Lcom/google/android/gms/internal/ads/Fy0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lcom/google/android/gms/internal/ads/Cx0;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/Cx0;-><init>()V

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzc"

    aput-object p2, p1, v0

    const-string p2, "zzd"

    aput-object p2, p1, p3

    const-string p2, "zze"

    const/4 p3, 0x2

    aput-object p2, p1, p3

    sget-object p2, Lcom/google/android/gms/internal/ads/Cx0;->zza:Lcom/google/android/gms/internal/ads/Cx0;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u150a\u0000\u0002\u100a\u0001"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/Jv0;->A(Lcom/google/android/gms/internal/ads/mw0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    if-nez p2, :cond_2

    move p3, v0

    :cond_2
    iput-byte p3, p0, Lcom/google/android/gms/internal/ads/Cx0;->zzf:B

    return-object v1

    :pswitch_6
    iget-byte p1, p0, Lcom/google/android/gms/internal/ads/Cx0;->zzf:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
