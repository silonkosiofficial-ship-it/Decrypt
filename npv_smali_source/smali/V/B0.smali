.class public final LV/B0;
.super LV/q1;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV/B0$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LV/B0;",
            ">;"
        }
    .end annotation
.end field

.field public static final E:LV/B0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LV/B0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LV/B0$b;-><init>(Ly7/k;)V

    sput-object v0, LV/B0;->E:LV/B0$b;

    new-instance v0, LV/B0$a;

    invoke-direct {v0}, LV/B0$a;-><init>()V

    sput-object v0, LV/B0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, LV/q1;-><init>(I)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-virtual {p0}, LV/q1;->d()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
