.class public final LV/C0;
.super LV/r1;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV/C0$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LV/C0;",
            ">;"
        }
    .end annotation
.end field

.field public static final E:LV/C0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LV/C0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LV/C0$b;-><init>(Ly7/k;)V

    sput-object v0, LV/C0;->E:LV/C0$b;

    new-instance v0, LV/C0$a;

    invoke-direct {v0}, LV/C0$a;-><init>()V

    sput-object v0, LV/C0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LV/r1;-><init>(J)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-virtual {p0}, LV/r1;->a()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
