.class public final Ls3/i2;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ls3/i2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/j2;

    invoke-direct {v0}, Ls3/j2;-><init>()V

    sput-object v0, Ls3/i2;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput p1, p0, Ls3/i2;->C:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget p2, p0, Ls3/i2;->C:I

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, p2}, LR3/c;->k(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
