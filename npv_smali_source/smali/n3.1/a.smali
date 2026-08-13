.class public final Ln3/a;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ln3/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final C:Z

.field private final D:Landroid/os/IBinder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln3/i;

    invoke-direct {v0}, Ln3/i;-><init>()V

    sput-object v0, Ln3/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ZLandroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput-boolean p1, p0, Ln3/a;->C:Z

    iput-object p2, p0, Ln3/a;->D:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public e()Z
    .locals 1

    iget-boolean v0, p0, Ln3/a;->C:Z

    return v0
.end method

.method public final f()Lcom/google/android/gms/internal/ads/fi;
    .locals 1

    .prologue
    iget-object v0, p0, Ln3/a;->D:Landroid/os/IBinder;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ei;->o6(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/fi;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, Ln3/a;->e()Z

    move-result v1

    invoke-static {p1, v0, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Ln3/a;->D:Landroid/os/IBinder;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v2, v0, v1}, LR3/c;->j(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-static {p1, p2}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
