.class public final Lcom/google/android/gms/internal/ads/go;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/go;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:Landroid/view/View;

.field public final D:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/ho;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ho;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/go;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    invoke-static {p1}, LX3/a$a;->y0(Landroid/os/IBinder;)LX3/a;

    move-result-object p1

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/go;->C:Landroid/view/View;

    invoke-static {p2}, LX3/a$a;->y0(Landroid/os/IBinder;)LX3/a;

    move-result-object p1

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/go;->D:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/go;->C:Landroid/view/View;

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-static {p2}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p2

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, LR3/c;->j(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/go;->D:Ljava/util/Map;

    invoke-static {p2}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p2

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    const/4 v1, 0x2

    invoke-static {p1, v1, p2, v2}, LR3/c;->j(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
