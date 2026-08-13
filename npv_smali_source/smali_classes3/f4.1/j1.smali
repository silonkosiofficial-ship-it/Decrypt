.class public final Lf4/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/S0;


# instance fields
.field private final a:Lf4/W0;

.field private final b:Lf4/W0;


# direct methods
.method public constructor <init>(Lf4/W0;Lf4/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/j1;->a:Lf4/W0;

    iput-object p2, p0, Lf4/j1;->b:Lf4/W0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf4/j1;->b()Lf4/e1;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lf4/e1;
    .locals 3

    iget-object v0, p0, Lf4/j1;->a:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    iget-object v1, p0, Lf4/j1;->b:Lf4/W0;

    invoke-interface {v1}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/q;

    new-instance v2, Lf4/e1;

    invoke-direct {v2, v0, v1}, Lf4/e1;-><init>(Landroid/app/Application;Lf4/q;)V

    return-object v2
.end method
