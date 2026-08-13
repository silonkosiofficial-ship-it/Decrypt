.class public final Lcom/google/android/gms/internal/measurement/m2;
.super Lcom/google/android/gms/internal/measurement/t4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/c5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/m2$a;
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/m2;

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/h5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/h5;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/m2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/m2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/m2;->zzc:Lcom/google/android/gms/internal/measurement/m2;

    const-class v1, Lcom/google/android/gms/internal/measurement/m2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/t4;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/t4;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/t4;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/m2;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static F()Lcom/google/android/gms/internal/measurement/m2$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/m2;->zzc:Lcom/google/android/gms/internal/measurement/m2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/t4;->w()Lcom/google/android/gms/internal/measurement/t4$b;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/m2$a;

    return-object v0
.end method

.method static synthetic G(Lcom/google/android/gms/internal/measurement/m2;J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/m2;->zze:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/m2;->zze:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/m2;->zzg:J

    return-void
.end method

.method static synthetic H(Lcom/google/android/gms/internal/measurement/m2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/m2;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/m2;->zze:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/m2;->zzf:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic I()Lcom/google/android/gms/internal/measurement/m2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/m2;->zzc:Lcom/google/android/gms/internal/measurement/m2;

    return-object v0
.end method


# virtual methods
.method protected final q(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    sget-object p2, Lcom/google/android/gms/internal/measurement/f2;->a:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/measurement/m2;->zzd:Lcom/google/android/gms/internal/measurement/h5;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/m2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/m2;->zzd:Lcom/google/android/gms/internal/measurement/h5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/t4$a;

    sget-object p3, Lcom/google/android/gms/internal/measurement/m2;->zzc:Lcom/google/android/gms/internal/measurement/m2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/t4$a;-><init>(Lcom/google/android/gms/internal/measurement/t4;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/m2;->zzd:Lcom/google/android/gms/internal/measurement/h5;

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

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/measurement/m2;->zzc:Lcom/google/android/gms/internal/measurement/m2;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zze"

    const/4 v0, 0x0

    aput-object p2, p1, v0

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const-string p2, "zzg"

    const/4 p3, 0x2

    aput-object p2, p1, p3

    const-string p2, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001"

    sget-object p3, Lcom/google/android/gms/internal/measurement/m2;->zzc:Lcom/google/android/gms/internal/measurement/m2;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t4;->r(Lcom/google/android/gms/internal/measurement/a5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/m2$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/m2$a;-><init>(Lcom/google/android/gms/internal/measurement/E2;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/measurement/m2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/m2;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
