.class public final Lf4/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/S0;


# instance fields
.field private final a:Lf4/W0;


# direct methods
.method public constructor <init>(Lf4/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/r;->a:Lf4/W0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf4/r;->a:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    new-instance v1, Lf4/q;

    invoke-direct {v1, v0}, Lf4/q;-><init>(Landroid/app/Application;)V

    return-object v1
.end method
