.class public LL3/a;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LL3/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final C:I

.field private D:I

.field private E:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL3/d;

    invoke-direct {v0}, LL3/d;-><init>()V

    sput-object v0, LL3/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput p1, p0, LL3/a;->C:I

    iput p2, p0, LL3/a;->D:I

    iput-object p3, p0, LL3/a;->E:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public e()I
    .locals 1

    iget v0, p0, LL3/a;->D:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget v1, p0, LL3/a;->C:I

    invoke-static {p1, v0, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    invoke-virtual {p0}, LL3/a;->e()I

    move-result v1

    invoke-static {p1, v0, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    iget-object v0, p0, LL3/a;->E:Landroid/os/Bundle;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {p1, v2, v0, v1}, LR3/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    invoke-static {p1, p2}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
