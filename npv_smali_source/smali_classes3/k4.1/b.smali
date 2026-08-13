.class public final Lk4/b;
.super LR3/a;
.source "SourceFile"

# interfaces
.implements LO3/k;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lk4/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final C:I

.field private D:I

.field private E:Landroid/content/Intent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk4/c;

    invoke-direct {v0}, Lk4/c;-><init>()V

    sput-object v0, Lk4/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILandroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput p1, p0, Lk4/b;->C:I

    iput p2, p0, Lk4/b;->D:I

    iput-object p3, p0, Lk4/b;->E:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final d()Lcom/google/android/gms/common/api/Status;
    .locals 1

    .prologue
    iget v0, p0, Lk4/b;->D:I

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/common/api/Status;->H:Lcom/google/android/gms/common/api/Status;

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->L:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget v0, p0, Lk4/b;->C:I

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    invoke-static {p1, v2, v0}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    iget v2, p0, Lk4/b;->D:I

    invoke-static {p1, v0, v2}, LR3/c;->k(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lk4/b;->E:Landroid/content/Intent;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-static {p1, v3, v0, p2, v2}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v1}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
