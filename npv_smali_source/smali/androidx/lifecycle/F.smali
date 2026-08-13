.class public Landroidx/lifecycle/F;
.super Landroid/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/F$a;,
        Landroidx/lifecycle/F$b;,
        Landroidx/lifecycle/F$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "X"
    }
    d2 = {
        "Y",
        "Z",
        "[",
        "\\",
        "]",
        "^",
        "_",
        "`",
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "u",
        "v"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final D:Landroidx/lifecycle/F$b;


# instance fields
.field private C:Landroidx/lifecycle/F$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/F$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/F$b;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/lifecycle/F;->D:Landroidx/lifecycle/F$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method private final a(Landroidx/lifecycle/k$a;)V
    .locals 3

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    sget-object v0, Landroidx/lifecycle/F;->D:Landroidx/lifecycle/F$b;

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const-string v2, "activity"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/F$b;->a(Landroid/app/Activity;Landroidx/lifecycle/k$a;)V

    :cond_0
    return-void
.end method

.method private final b(Landroidx/lifecycle/F$a;)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroidx/lifecycle/F$a;->onCreate()V

    :cond_0
    return-void
.end method

.method private final c(Landroidx/lifecycle/F$a;)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroidx/lifecycle/F$a;->onResume()V

    :cond_0
    return-void
.end method

.method private final d(Landroidx/lifecycle/F$a;)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroidx/lifecycle/F$a;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final e(Landroidx/lifecycle/F$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/F;->C:Landroidx/lifecycle/F$a;

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/lifecycle/F;->C:Landroidx/lifecycle/F$a;

    invoke-direct {p0, p1}, Landroidx/lifecycle/F;->b(Landroidx/lifecycle/F$a;)V

    sget-object p1, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    invoke-direct {p0, p1}, Landroidx/lifecycle/F;->a(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    sget-object v0, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    invoke-direct {p0, v0}, Landroidx/lifecycle/F;->a(Landroidx/lifecycle/k$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/lifecycle/F;->C:Landroidx/lifecycle/F$a;

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    sget-object v0, Landroidx/lifecycle/k$a;->ON_PAUSE:Landroidx/lifecycle/k$a;

    invoke-direct {p0, v0}, Landroidx/lifecycle/F;->a(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    iget-object v0, p0, Landroidx/lifecycle/F;->C:Landroidx/lifecycle/F$a;

    invoke-direct {p0, v0}, Landroidx/lifecycle/F;->c(Landroidx/lifecycle/F$a;)V

    sget-object v0, Landroidx/lifecycle/k$a;->ON_RESUME:Landroidx/lifecycle/k$a;

    invoke-direct {p0, v0}, Landroidx/lifecycle/F;->a(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    iget-object v0, p0, Landroidx/lifecycle/F;->C:Landroidx/lifecycle/F$a;

    invoke-direct {p0, v0}, Landroidx/lifecycle/F;->d(Landroidx/lifecycle/F$a;)V

    sget-object v0, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    invoke-direct {p0, v0}, Landroidx/lifecycle/F;->a(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    sget-object v0, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    invoke-direct {p0, v0}, Landroidx/lifecycle/F;->a(Landroidx/lifecycle/k$a;)V

    return-void
.end method
