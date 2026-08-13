.class public final Lcom/google/android/gms/internal/ads/Gd0;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/Gd0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:I

.field private D:Lcom/google/android/gms/internal/ads/Q8;

.field private E:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Hd0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Hd0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Gd0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(I[B)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/Gd0;->C:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Gd0;->D:Lcom/google/android/gms/internal/ads/Q8;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Gd0;->E:[B

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Gd0;->b()V

    return-void
.end method

.method private final b()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Gd0;->D:Lcom/google/android/gms/internal/ads/Q8;

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Gd0;->E:[B

    if-nez v1, :cond_1

    :cond_0
    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Gd0;->E:[B

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Gd0;->E:[B

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid internal representation - full"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Gd0;->E:[B

    if-nez v0, :cond_5

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid internal representation - empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Impossible"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final e()Lcom/google/android/gms/internal/ads/Q8;
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Gd0;->D:Lcom/google/android/gms/internal/ads/Q8;

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Gd0;->E:[B

    invoke-static {}, Lcom/google/android/gms/internal/ads/xv0;->a()Lcom/google/android/gms/internal/ads/xv0;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Q8;->X0([BLcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Q8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Gd0;->D:Lcom/google/android/gms/internal/ads/Q8;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Gd0;->E:[B
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :goto_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Gd0;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Gd0;->D:Lcom/google/android/gms/internal/ads/Q8;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    iget p2, p0, Lcom/google/android/gms/internal/ads/Gd0;->C:I

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, p2}, LR3/c;->k(Landroid/os/Parcel;II)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Gd0;->E:[B

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Gd0;->D:Lcom/google/android/gms/internal/ads/Q8;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Ou0;->l()[B

    move-result-object p2

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, LR3/c;->f(Landroid/os/Parcel;I[BZ)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
