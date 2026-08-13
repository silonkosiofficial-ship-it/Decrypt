.class public final LQ3/h0;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LQ3/h0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field C:Landroid/os/Bundle;

.field D:[LN3/d;

.field E:I

.field F:LQ3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ3/i0;

    invoke-direct {v0}, LQ3/i0;-><init>()V

    sput-object v0, LQ3/h0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Bundle;[LN3/d;ILQ3/e;)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput-object p1, p0, LQ3/h0;->C:Landroid/os/Bundle;

    iput-object p2, p0, LQ3/h0;->D:[LN3/d;

    iput p3, p0, LQ3/h0;->E:I

    iput-object p4, p0, LQ3/h0;->F:LQ3/e;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, LQ3/h0;->C:Landroid/os/Bundle;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, LR3/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/4 v1, 0x2

    iget-object v2, p0, LQ3/h0;->D:[LN3/d;

    invoke-static {p1, v1, v2, p2, v3}, LR3/c;->t(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget v2, p0, LQ3/h0;->E:I

    invoke-static {p1, v1, v2}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/4 v1, 0x4

    iget-object v2, p0, LQ3/h0;->F:LQ3/e;

    invoke-static {p1, v1, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
