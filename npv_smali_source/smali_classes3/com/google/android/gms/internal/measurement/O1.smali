.class public final Lcom/google/android/gms/internal/measurement/O1;
.super Lcom/google/android/gms/internal/measurement/t4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/c5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/O1$b;,
        Lcom/google/android/gms/internal/measurement/O1$a;
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/O1;

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/h5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/h5;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:Ljava/lang/String;

.field private zzh:Z

.field private zzi:Lcom/google/android/gms/internal/measurement/D4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/D4;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/O1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/O1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/O1;->zzc:Lcom/google/android/gms/internal/measurement/O1;

    const-class v1, Lcom/google/android/gms/internal/measurement/O1;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/t4;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/t4;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/t4;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/O1;->zzg:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/t4;->B()Lcom/google/android/gms/internal/measurement/D4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/O1;->zzi:Lcom/google/android/gms/internal/measurement/D4;

    return-void
.end method

.method static bridge synthetic G()Lcom/google/android/gms/internal/measurement/O1;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/O1;->zzc:Lcom/google/android/gms/internal/measurement/O1;

    return-object v0
.end method

.method public static H()Lcom/google/android/gms/internal/measurement/O1;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/O1;->zzc:Lcom/google/android/gms/internal/measurement/O1;

    return-object v0
.end method


# virtual methods
.method public final F()Lcom/google/android/gms/internal/measurement/O1$b;
    .locals 1

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/measurement/O1;->zzf:I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/O1$b;->e(I)Lcom/google/android/gms/internal/measurement/O1$b;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/O1$b;->D:Lcom/google/android/gms/internal/measurement/O1$b;

    :cond_0
    return-object v0
.end method

.method public final I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/O1;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final J()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/O1;->zzi:Lcom/google/android/gms/internal/measurement/D4;

    return-object v0
.end method

.method public final K()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/O1;->zzh:Z

    return v0
.end method

.method public final L()Z
    .locals 1

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/measurement/O1;->zze:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final M()Z
    .locals 1

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/measurement/O1;->zze:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final N()Z
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/measurement/O1;->zze:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/O1;->zzi:Lcom/google/android/gms/internal/measurement/D4;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method protected final q(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    sget-object p2, Lcom/google/android/gms/internal/measurement/I1;->a:[I

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/O1;->zzd:Lcom/google/android/gms/internal/measurement/h5;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/O1;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/O1;->zzd:Lcom/google/android/gms/internal/measurement/h5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/t4$a;

    sget-object p3, Lcom/google/android/gms/internal/measurement/O1;->zzc:Lcom/google/android/gms/internal/measurement/O1;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/t4$a;-><init>(Lcom/google/android/gms/internal/measurement/t4;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/O1;->zzd:Lcom/google/android/gms/internal/measurement/h5;

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/O1;->zzc:Lcom/google/android/gms/internal/measurement/O1;

    return-object p1

    :pswitch_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/O1$b;->g()Lcom/google/android/gms/internal/measurement/x4;

    move-result-object p1

    const/4 p2, 0x6

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "zze"

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const-string v0, "zzf"

    aput-object v0, p2, p3

    const/4 p3, 0x2

    aput-object p1, p2, p3

    const-string p1, "zzg"

    const/4 p3, 0x3

    aput-object p1, p2, p3

    const-string p1, "zzh"

    const/4 p3, 0x4

    aput-object p1, p2, p3

    const-string p1, "zzi"

    const/4 p3, 0x5

    aput-object p1, p2, p3

    const-string p1, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a"

    sget-object p3, Lcom/google/android/gms/internal/measurement/O1;->zzc:Lcom/google/android/gms/internal/measurement/O1;

    invoke-static {p3, p1, p2}, Lcom/google/android/gms/internal/measurement/t4;->r(Lcom/google/android/gms/internal/measurement/a5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/O1$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/O1$a;-><init>(Lcom/google/android/gms/internal/measurement/a2;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/measurement/O1;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/O1;-><init>()V

    return-object p1

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
