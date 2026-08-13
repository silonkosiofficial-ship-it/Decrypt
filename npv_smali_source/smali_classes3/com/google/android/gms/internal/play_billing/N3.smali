.class public final Lcom/google/android/gms/internal/play_billing/N3;
.super Lcom/google/android/gms/internal/play_billing/L2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/j3;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/N3;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/Object;

.field private zzg:I

.field private zzh:Lcom/google/android/gms/internal/play_billing/X3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/N3;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/N3;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/N3;->zzb:Lcom/google/android/gms/internal/play_billing/N3;

    const-class v1, Lcom/google/android/gms/internal/play_billing/N3;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/L2;->x(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/L2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/L2;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/N3;->zze:I

    return-void
.end method

.method static bridge synthetic A()Lcom/google/android/gms/internal/play_billing/N3;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/N3;->zzb:Lcom/google/android/gms/internal/play_billing/N3;

    return-object v0
.end method

.method public static B([BLcom/google/android/gms/internal/play_billing/A2;)Lcom/google/android/gms/internal/play_billing/N3;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/N3;->zzb:Lcom/google/android/gms/internal/play_billing/N3;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/play_billing/L2;->q(Lcom/google/android/gms/internal/play_billing/L2;[BLcom/google/android/gms/internal/play_billing/A2;)Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/N3;

    return-object p0
.end method

.method static synthetic C(Lcom/google/android/gms/internal/play_billing/N3;Lcom/google/android/gms/internal/play_billing/X3;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/N3;->zzh:Lcom/google/android/gms/internal/play_billing/X3;

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/N3;->zzd:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/N3;->zzd:I

    return-void
.end method

.method static synthetic D(Lcom/google/android/gms/internal/play_billing/N3;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/N3;->zzg:I

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/N3;->zzd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/N3;->zzd:I

    return-void
.end method

.method public static E()Lcom/google/android/gms/internal/play_billing/L3;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/N3;->zzb:Lcom/google/android/gms/internal/play_billing/N3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/L2;->m()Lcom/google/android/gms/internal/play_billing/J2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/L3;

    return-object v0
.end method


# virtual methods
.method protected final j(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    const/4 p2, 0x1

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_4

    if-eq p1, v2, :cond_3

    if-eq p1, v1, :cond_2

    const/4 p2, 0x0

    if-eq p1, v0, :cond_1

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/play_billing/N3;->zzb:Lcom/google/android/gms/internal/play_billing/N3;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/L3;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/play_billing/L3;-><init>(Lcom/google/android/gms/internal/play_billing/M3;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/N3;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/N3;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const-string v3, "zzf"

    const/4 v4, 0x0

    aput-object v3, p1, v4

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzd"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/P3;->a:Lcom/google/android/gms/internal/play_billing/N2;

    aput-object p2, p1, v0

    const-string p2, "zzh"

    aput-object p2, p1, p3

    const-class p2, Lcom/google/android/gms/internal/play_billing/r4;

    const/4 p3, 0x6

    aput-object p2, p1, p3

    sget-object p2, Lcom/google/android/gms/internal/play_billing/N3;->zzb:Lcom/google/android/gms/internal/play_billing/N3;

    const-string p3, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0004<\u0000"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/L2;->u(Lcom/google/android/gms/internal/play_billing/i3;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
