.class public final Landroidx/lifecycle/V$d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/V$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Landroidx/lifecycle/V$d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/V$d;
    .locals 1

    .prologue
    invoke-static {}, Landroidx/lifecycle/V$d;->d()Landroidx/lifecycle/V$d;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/V$d;

    invoke-direct {v0}, Landroidx/lifecycle/V$d;-><init>()V

    invoke-static {v0}, Landroidx/lifecycle/V$d;->e(Landroidx/lifecycle/V$d;)V

    :cond_0
    invoke-static {}, Landroidx/lifecycle/V$d;->d()Landroidx/lifecycle/V$d;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method
