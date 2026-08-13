.class public final Lcom/google/android/gms/internal/play_billing/a4;
.super Lcom/google/android/gms/internal/play_billing/L2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/j3;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/a4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/a4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/a4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/a4;->zzb:Lcom/google/android/gms/internal/play_billing/a4;

    const-class v1, Lcom/google/android/gms/internal/play_billing/a4;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/L2;->x(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/L2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/L2;-><init>()V

    return-void
.end method

.method public static A()Lcom/google/android/gms/internal/play_billing/a4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a4;->zzb:Lcom/google/android/gms/internal/play_billing/a4;

    return-object v0
.end method

.method static bridge synthetic B()Lcom/google/android/gms/internal/play_billing/a4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a4;->zzb:Lcom/google/android/gms/internal/play_billing/a4;

    return-object v0
.end method


# virtual methods
.method protected final j(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_4

    const/4 p2, 0x2

    const/4 p3, 0x0

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/play_billing/a4;->zzb:Lcom/google/android/gms/internal/play_billing/a4;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/Y3;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/Y3;-><init>(Lcom/google/android/gms/internal/play_billing/Z3;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/a4;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/a4;-><init>()V

    return-object p1

    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/play_billing/a4;->zzb:Lcom/google/android/gms/internal/play_billing/a4;

    const-string p2, "\u0004\u0000"

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/L2;->u(Lcom/google/android/gms/internal/play_billing/i3;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
