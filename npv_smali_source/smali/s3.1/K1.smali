.class public final Ls3/K1;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ls3/K1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:I

.field public final D:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/L1;

    invoke-direct {v0}, Ls3/L1;-><init>()V

    sput-object v0, Ls3/K1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput p1, p0, Ls3/K1;->C:I

    iput p2, p0, Ls3/K1;->D:I

    return-void
.end method

.method public constructor <init>(Lk3/t;)V
    .locals 1

    invoke-direct {p0}, LR3/a;-><init>()V

    invoke-virtual {p1}, Lk3/t;->c()I

    move-result v0

    iput v0, p0, Ls3/K1;->C:I

    invoke-virtual {p1}, Lk3/t;->d()I

    move-result p1

    iput p1, p0, Ls3/K1;->D:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget p2, p0, Ls3/K1;->C:I

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, p2}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/4 p2, 0x2

    iget v1, p0, Ls3/K1;->D:I

    invoke-static {p1, p2, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
