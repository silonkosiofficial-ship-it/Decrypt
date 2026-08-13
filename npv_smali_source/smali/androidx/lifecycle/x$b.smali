.class Landroidx/lifecycle/x$b;
.super Landroidx/lifecycle/x$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic G:Landroidx/lifecycle/x;


# direct methods
.method constructor <init>(Landroidx/lifecycle/x;Landroidx/lifecycle/A;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/x$b;->G:Landroidx/lifecycle/x;

    invoke-direct {p0, p1, p2}, Landroidx/lifecycle/x$d;-><init>(Landroidx/lifecycle/x;Landroidx/lifecycle/A;)V

    return-void
.end method


# virtual methods
.method d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
