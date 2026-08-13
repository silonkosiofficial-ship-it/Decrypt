.class final Landroidx/fragment/app/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/fragment/app/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final C:Ljava/lang/String;

.field final D:Ljava/lang/String;

.field final E:Z

.field final F:I

.field final G:I

.field final H:Ljava/lang/String;

.field final I:Z

.field final J:Z

.field final K:Z

.field final L:Landroid/os/Bundle;

.field final M:Z

.field final N:I

.field O:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/fragment/app/r$a;

    invoke-direct {v0}, Landroidx/fragment/app/r$a;-><init>()V

    sput-object v0, Landroidx/fragment/app/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/r;->C:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/r;->D:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Landroidx/fragment/app/r;->E:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/r;->F:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/r;->G:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/r;->H:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Landroidx/fragment/app/r;->I:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iput-boolean v0, p0, Landroidx/fragment/app/r;->J:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    iput-boolean v0, p0, Landroidx/fragment/app/r;->K:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/r;->L:Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_4

    move v1, v2

    :cond_4
    iput-boolean v1, p0, Landroidx/fragment/app/r;->M:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/r;->O:Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroidx/fragment/app/r;->N:I

    return-void
.end method

.method constructor <init>(Landroidx/fragment/app/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/r;->C:Ljava/lang/String;

    iget-object v0, p1, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/r;->D:Ljava/lang/String;

    iget-boolean v0, p1, Landroidx/fragment/app/f;->Q:Z

    iput-boolean v0, p0, Landroidx/fragment/app/r;->E:Z

    iget v0, p1, Landroidx/fragment/app/f;->Z:I

    iput v0, p0, Landroidx/fragment/app/r;->F:I

    iget v0, p1, Landroidx/fragment/app/f;->a0:I

    iput v0, p0, Landroidx/fragment/app/r;->G:I

    iget-object v0, p1, Landroidx/fragment/app/f;->b0:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/r;->H:Ljava/lang/String;

    iget-boolean v0, p1, Landroidx/fragment/app/f;->e0:Z

    iput-boolean v0, p0, Landroidx/fragment/app/r;->I:Z

    iget-boolean v0, p1, Landroidx/fragment/app/f;->O:Z

    iput-boolean v0, p0, Landroidx/fragment/app/r;->J:Z

    iget-boolean v0, p1, Landroidx/fragment/app/f;->d0:Z

    iput-boolean v0, p0, Landroidx/fragment/app/r;->K:Z

    iget-object v0, p1, Landroidx/fragment/app/f;->I:Landroid/os/Bundle;

    iput-object v0, p0, Landroidx/fragment/app/r;->L:Landroid/os/Bundle;

    iget-boolean v0, p1, Landroidx/fragment/app/f;->c0:Z

    iput-boolean v0, p0, Landroidx/fragment/app/r;->M:Z

    iget-object p1, p1, Landroidx/fragment/app/f;->u0:Landroidx/lifecycle/k$b;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    iput p1, p0, Landroidx/fragment/app/r;->N:I

    return-void
.end method


# virtual methods
.method a(Landroidx/fragment/app/j;Ljava/lang/ClassLoader;)Landroidx/fragment/app/f;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/r;->C:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/j;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/f;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/r;->L:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_0
    iget-object p2, p0, Landroidx/fragment/app/r;->L:Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/f;->v1(Landroid/os/Bundle;)V

    iget-object p2, p0, Landroidx/fragment/app/r;->D:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    iget-boolean p2, p0, Landroidx/fragment/app/r;->E:Z

    iput-boolean p2, p1, Landroidx/fragment/app/f;->Q:Z

    const/4 p2, 0x1

    iput-boolean p2, p1, Landroidx/fragment/app/f;->S:Z

    iget p2, p0, Landroidx/fragment/app/r;->F:I

    iput p2, p1, Landroidx/fragment/app/f;->Z:I

    iget p2, p0, Landroidx/fragment/app/r;->G:I

    iput p2, p1, Landroidx/fragment/app/f;->a0:I

    iget-object p2, p0, Landroidx/fragment/app/r;->H:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/f;->b0:Ljava/lang/String;

    iget-boolean p2, p0, Landroidx/fragment/app/r;->I:Z

    iput-boolean p2, p1, Landroidx/fragment/app/f;->e0:Z

    iget-boolean p2, p0, Landroidx/fragment/app/r;->J:Z

    iput-boolean p2, p1, Landroidx/fragment/app/f;->O:Z

    iget-boolean p2, p0, Landroidx/fragment/app/r;->K:Z

    iput-boolean p2, p1, Landroidx/fragment/app/f;->d0:Z

    iget-boolean p2, p0, Landroidx/fragment/app/r;->M:Z

    iput-boolean p2, p1, Landroidx/fragment/app/f;->c0:Z

    invoke-static {}, Landroidx/lifecycle/k$b;->values()[Landroidx/lifecycle/k$b;

    move-result-object p2

    iget v0, p0, Landroidx/fragment/app/r;->N:I

    aget-object p2, p2, v0

    iput-object p2, p1, Landroidx/fragment/app/f;->u0:Landroidx/lifecycle/k$b;

    iget-object p2, p0, Landroidx/fragment/app/r;->O:Landroid/os/Bundle;

    if-eqz p2, :cond_1

    :goto_0
    iput-object p2, p1, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    goto :goto_1

    :cond_1
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    goto :goto_0

    :goto_1
    return-object p1
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentState{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/r;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/r;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")}:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/fragment/app/r;->E:Z

    if-eqz v1, :cond_0

    const-string v1, " fromLayout"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget v1, p0, Landroidx/fragment/app/r;->G:I

    if-eqz v1, :cond_1

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/r;->G:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/r;->H:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, " tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/r;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-boolean v1, p0, Landroidx/fragment/app/r;->I:Z

    if-eqz v1, :cond_3

    const-string v1, " retainInstance"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-boolean v1, p0, Landroidx/fragment/app/r;->J:Z

    if-eqz v1, :cond_4

    const-string v1, " removing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-boolean v1, p0, Landroidx/fragment/app/r;->K:Z

    if-eqz v1, :cond_5

    const-string v1, " detached"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-boolean v1, p0, Landroidx/fragment/app/r;->M:Z

    if-eqz v1, :cond_6

    const-string v1, " hidden"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Landroidx/fragment/app/r;->C:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/r;->D:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/r;->E:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/fragment/app/r;->F:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/fragment/app/r;->G:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/fragment/app/r;->H:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/r;->I:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/fragment/app/r;->J:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/fragment/app/r;->K:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/fragment/app/r;->L:Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    iget-boolean p2, p0, Landroidx/fragment/app/r;->M:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/fragment/app/r;->O:Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    iget p2, p0, Landroidx/fragment/app/r;->N:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
