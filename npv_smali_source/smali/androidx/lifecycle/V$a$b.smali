.class public final Landroidx/lifecycle/V$a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/V$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Landroidx/lifecycle/V$a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Application;)Landroidx/lifecycle/V$a;
    .locals 1

    .prologue
    const-string v0, "application"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/lifecycle/V$a;->f()Landroidx/lifecycle/V$a;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/V$a;

    invoke-direct {v0, p1}, Landroidx/lifecycle/V$a;-><init>(Landroid/app/Application;)V

    invoke-static {v0}, Landroidx/lifecycle/V$a;->g(Landroidx/lifecycle/V$a;)V

    :cond_0
    invoke-static {}, Landroidx/lifecycle/V$a;->f()Landroidx/lifecycle/V$a;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object p1
.end method
