.class public final Ln3/f;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ln3/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final C:Z

.field private final D:Ls3/i0;

.field private final E:Landroid/os/IBinder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln3/n;

    invoke-direct {v0}, Ln3/n;-><init>()V

    sput-object v0, Ln3/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ZLandroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 0

    .prologue
    invoke-direct {p0}, LR3/a;-><init>()V

    iput-boolean p1, p0, Ln3/f;->C:Z

    if-eqz p2, :cond_0

    invoke-static {p2}, Ls3/h0;->o6(Landroid/os/IBinder;)Ls3/i0;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ln3/f;->D:Ls3/i0;

    iput-object p3, p0, Ln3/f;->E:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Ln3/f;->C:Z

    return v0
.end method

.method public final e()Ls3/i0;
    .locals 1

    iget-object v0, p0, Ln3/f;->D:Ls3/i0;

    return-object v0
.end method

.method public final f()Lcom/google/android/gms/internal/ads/fi;
    .locals 1

    .prologue
    iget-object v0, p0, Ln3/f;->E:Landroid/os/IBinder;

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

    .prologue
    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget-boolean v1, p0, Ln3/f;->C:Z

    invoke-static {p1, v0, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Ln3/f;->D:Ls3/i0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, LR3/c;->j(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v0, 0x3

    iget-object v1, p0, Ln3/f;->E:Landroid/os/IBinder;

    invoke-static {p1, v0, v1, v2}, LR3/c;->j(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-static {p1, p2}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
