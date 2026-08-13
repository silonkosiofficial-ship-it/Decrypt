.class public LQ3/f;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LQ3/f;",
            ">;"
        }
    .end annotation
.end field

.field static final Q:[Lcom/google/android/gms/common/api/Scope;

.field static final R:[LN3/d;


# instance fields
.field final C:I

.field final D:I

.field final E:I

.field F:Ljava/lang/String;

.field G:Landroid/os/IBinder;

.field H:[Lcom/google/android/gms/common/api/Scope;

.field I:Landroid/os/Bundle;

.field J:Landroid/accounts/Account;

.field K:[LN3/d;

.field L:[LN3/d;

.field final M:Z

.field final N:I

.field O:Z

.field private final P:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LQ3/k0;

    invoke-direct {v0}, LQ3/k0;-><init>()V

    sput-object v0, LQ3/f;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/google/android/gms/common/api/Scope;

    sput-object v1, LQ3/f;->Q:[Lcom/google/android/gms/common/api/Scope;

    new-array v0, v0, [LN3/d;

    sput-object v0, LQ3/f;->R:[LN3/d;

    return-void
.end method

.method constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[LN3/d;[LN3/d;ZIZLjava/lang/String;)V
    .locals 0

    .prologue
    invoke-direct {p0}, LR3/a;-><init>()V

    if-nez p6, :cond_0

    sget-object p6, LQ3/f;->Q:[Lcom/google/android/gms/common/api/Scope;

    :cond_0
    if-nez p7, :cond_1

    new-instance p7, Landroid/os/Bundle;

    invoke-direct {p7}, Landroid/os/Bundle;-><init>()V

    :cond_1
    if-nez p9, :cond_2

    sget-object p9, LQ3/f;->R:[LN3/d;

    :cond_2
    if-nez p10, :cond_3

    sget-object p10, LQ3/f;->R:[LN3/d;

    :cond_3
    iput p1, p0, LQ3/f;->C:I

    iput p2, p0, LQ3/f;->D:I

    iput p3, p0, LQ3/f;->E:I

    const-string p2, "com.google.android.gms"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    iput-object p2, p0, LQ3/f;->F:Ljava/lang/String;

    goto :goto_0

    :cond_4
    iput-object p4, p0, LQ3/f;->F:Ljava/lang/String;

    :goto_0
    const/4 p2, 0x2

    if-ge p1, p2, :cond_6

    if-eqz p5, :cond_5

    invoke-static {p5}, LQ3/j$a;->y0(Landroid/os/IBinder;)LQ3/j;

    move-result-object p1

    invoke-static {p1}, LQ3/a;->L0(LQ3/j;)Landroid/accounts/Account;

    move-result-object p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, LQ3/f;->J:Landroid/accounts/Account;

    goto :goto_2

    :cond_6
    iput-object p5, p0, LQ3/f;->G:Landroid/os/IBinder;

    iput-object p8, p0, LQ3/f;->J:Landroid/accounts/Account;

    :goto_2
    iput-object p6, p0, LQ3/f;->H:[Lcom/google/android/gms/common/api/Scope;

    iput-object p7, p0, LQ3/f;->I:Landroid/os/Bundle;

    iput-object p9, p0, LQ3/f;->K:[LN3/d;

    iput-object p10, p0, LQ3/f;->L:[LN3/d;

    iput-boolean p11, p0, LQ3/f;->M:Z

    iput p12, p0, LQ3/f;->N:I

    iput-boolean p13, p0, LQ3/f;->O:Z

    iput-object p14, p0, LQ3/f;->P:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LQ3/f;->P:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LQ3/k0;->a(LQ3/f;Landroid/os/Parcel;I)V

    return-void
.end method
