.class public final Lv3/D;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv3/D;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:Ljava/lang/String;

.field public final D:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv3/E;

    invoke-direct {v0}, Lv3/E;-><init>()V

    sput-object v0, Lv3/D;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    invoke-direct {p0}, LR3/a;-><init>()V

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iput-object p1, p0, Lv3/D;->C:Ljava/lang/String;

    iput p2, p0, Lv3/D;->D:I

    return-void
.end method

.method public static f(Ljava/lang/Throwable;)Lv3/D;
    .locals 2

    .prologue
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/P70;->a(Ljava/lang/Throwable;)Ls3/W0;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Sg0;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p0, v0, Ls3/W0;->D:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    :goto_0
    new-instance v1, Lv3/D;

    iget v0, v0, Ls3/W0;->C:I

    invoke-direct {v1, p0, v0}, Lv3/D;-><init>(Ljava/lang/String;I)V

    return-object v1
.end method


# virtual methods
.method public final e()Lv3/C;
    .locals 3

    new-instance v0, Lv3/C;

    iget-object v1, p0, Lv3/D;->C:Ljava/lang/String;

    iget v2, p0, Lv3/D;->D:I

    invoke-direct {v0, v1, v2}, Lv3/C;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, Lv3/D;->C:Ljava/lang/String;

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x2

    iget v1, p0, Lv3/D;->D:I

    invoke-static {p1, p2, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
