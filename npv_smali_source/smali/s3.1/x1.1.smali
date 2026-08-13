.class final Ls3/x1;
.super Ls3/M;
.source "SourceFile"


# instance fields
.field final synthetic C:Ls3/z1;


# direct methods
.method synthetic constructor <init>(Ls3/z1;Ls3/y1;)V
    .locals 0

    iput-object p1, p0, Ls3/x1;->C:Ls3/z1;

    invoke-direct {p0}, Ls3/M;-><init>()V

    return-void
.end method


# virtual methods
.method public final H5(Ls3/X1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ls3/x1;->J2(Ls3/X1;I)V

    return-void
.end method

.method public final J2(Ls3/X1;I)V
    .locals 0

    const-string p1, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    sget-object p1, Lw3/g;->b:Landroid/os/Handler;

    new-instance p2, Ls3/w1;

    invoke-direct {p2, p0}, Ls3/w1;-><init>(Ls3/x1;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
