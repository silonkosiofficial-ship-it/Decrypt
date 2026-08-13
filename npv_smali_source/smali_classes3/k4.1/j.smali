.class public final Lk4/j;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lk4/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final C:I

.field final D:LQ3/M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk4/k;

    invoke-direct {v0}, Lk4/k;-><init>()V

    sput-object v0, Lk4/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILQ3/M;)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput p1, p0, Lk4/j;->C:I

    iput-object p2, p0, Lk4/j;->D:LQ3/M;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lk4/j;->C:I

    invoke-static {p1, v1, v2}, LR3/c;->k(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lk4/j;->D:LQ3/M;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, p2, v2}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
