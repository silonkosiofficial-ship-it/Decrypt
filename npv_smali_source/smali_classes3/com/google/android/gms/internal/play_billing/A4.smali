.class public final Lcom/google/android/gms/internal/play_billing/A4;
.super Lcom/google/android/gms/internal/play_billing/L2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/j3;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/A4;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/Object;

.field private zzg:Lcom/google/android/gms/internal/play_billing/j4;

.field private zzh:Lcom/google/android/gms/internal/play_billing/m4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/A4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/A4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/A4;->zzb:Lcom/google/android/gms/internal/play_billing/A4;

    const-class v1, Lcom/google/android/gms/internal/play_billing/A4;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/L2;->x(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/L2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/L2;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/A4;->zze:I

    return-void
.end method

.method static bridge synthetic A()Lcom/google/android/gms/internal/play_billing/A4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/A4;->zzb:Lcom/google/android/gms/internal/play_billing/A4;

    return-object v0
.end method

.method static synthetic B(Lcom/google/android/gms/internal/play_billing/A4;Lcom/google/android/gms/internal/play_billing/N3;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/A4;->zzf:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/A4;->zze:I

    return-void
.end method

.method static synthetic C(Lcom/google/android/gms/internal/play_billing/A4;Lcom/google/android/gms/internal/play_billing/S3;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/A4;->zzf:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/A4;->zze:I

    return-void
.end method

.method static synthetic D(Lcom/google/android/gms/internal/play_billing/A4;Lcom/google/android/gms/internal/play_billing/a4;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/A4;->zzf:Ljava/lang/Object;

    const/4 p1, 0x7

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/A4;->zze:I

    return-void
.end method

.method static synthetic E(Lcom/google/android/gms/internal/play_billing/A4;Lcom/google/android/gms/internal/play_billing/j4;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/A4;->zzg:Lcom/google/android/gms/internal/play_billing/j4;

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/A4;->zzd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/A4;->zzd:I

    return-void
.end method

.method static synthetic F(Lcom/google/android/gms/internal/play_billing/A4;Lcom/google/android/gms/internal/play_billing/G4;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/A4;->zzf:Ljava/lang/Object;

    const/16 p1, 0x8

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/A4;->zze:I

    return-void
.end method

.method static synthetic G(Lcom/google/android/gms/internal/play_billing/A4;Lcom/google/android/gms/internal/play_billing/K4;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/A4;->zzf:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/A4;->zze:I

    return-void
.end method

.method public static I()Lcom/google/android/gms/internal/play_billing/y4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/A4;->zzb:Lcom/google/android/gms/internal/play_billing/A4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/L2;->m()Lcom/google/android/gms/internal/play_billing/J2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/y4;

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
    sget-object p1, Lcom/google/android/gms/internal/play_billing/A4;->zzb:Lcom/google/android/gms/internal/play_billing/A4;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/y4;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/play_billing/y4;-><init>(Lcom/google/android/gms/internal/play_billing/z4;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/A4;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/A4;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xb

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

    const-class p2, Lcom/google/android/gms/internal/play_billing/N3;

    aput-object p2, p1, v0

    const-class p2, Lcom/google/android/gms/internal/play_billing/S3;

    aput-object p2, p1, p3

    const-class p2, Lcom/google/android/gms/internal/play_billing/K4;

    const/4 p3, 0x6

    aput-object p2, p1, p3

    const-class p2, Lcom/google/android/gms/internal/play_billing/g4;

    const/4 p3, 0x7

    aput-object p2, p1, p3

    const-string p2, "zzh"

    const/16 p3, 0x8

    aput-object p2, p1, p3

    const-class p2, Lcom/google/android/gms/internal/play_billing/a4;

    const/16 p3, 0x9

    aput-object p2, p1, p3

    const-class p2, Lcom/google/android/gms/internal/play_billing/G4;

    const/16 p3, 0xa

    aput-object p2, p1, p3

    sget-object p2, Lcom/google/android/gms/internal/play_billing/A4;->zzb:Lcom/google/android/gms/internal/play_billing/A4;

    const-string p3, "\u0004\u0008\u0001\u0001\u0001\u0008\u0008\u0000\u0000\u0000\u0001\u1009\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\u1009\u0001\u0007<\u0000\u0008<\u0000"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/L2;->u(Lcom/google/android/gms/internal/play_billing/i3;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
