.class public final Lcom/google/android/gms/internal/play_billing/x4;
.super Lcom/google/android/gms/internal/play_billing/L2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/j3;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/x4;


# instance fields
.field private zzd:Lcom/google/android/gms/internal/play_billing/P2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/x4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/x4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/x4;->zzb:Lcom/google/android/gms/internal/play_billing/x4;

    const-class v1, Lcom/google/android/gms/internal/play_billing/x4;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/L2;->x(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/L2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/L2;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/L2;->s()Lcom/google/android/gms/internal/play_billing/P2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/x4;->zzd:Lcom/google/android/gms/internal/play_billing/P2;

    return-void
.end method

.method static bridge synthetic A()Lcom/google/android/gms/internal/play_billing/x4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/x4;->zzb:Lcom/google/android/gms/internal/play_billing/x4;

    return-object v0
.end method


# virtual methods
.method protected final j(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    const/4 p2, 0x1

    const/4 p3, 0x2

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_4

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/play_billing/x4;->zzb:Lcom/google/android/gms/internal/play_billing/x4;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/s4;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/s4;-><init>(Lcom/google/android/gms/internal/play_billing/w4;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/x4;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/x4;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const-string p3, "zzd"

    const/4 v0, 0x0

    aput-object p3, p1, v0

    const-class p3, Lcom/google/android/gms/internal/play_billing/v4;

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/play_billing/x4;->zzb:Lcom/google/android/gms/internal/play_billing/x4;

    const-string p3, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/L2;->u(Lcom/google/android/gms/internal/play_billing/i3;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
