.class public abstract LL3/q;
.super Lc4/c;
.source "SourceFile"

# interfaces
.implements LL3/r;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.signin.internal.IRevocationService"

    invoke-direct {p0, v0}, Lc4/c;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final q0(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    .prologue
    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p3, 0x2

    if-eq p1, p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {p0}, LL3/r;->g1()V

    goto :goto_0

    :cond_1
    invoke-interface {p0}, LL3/r;->I1()V

    :goto_0
    return p2
.end method
