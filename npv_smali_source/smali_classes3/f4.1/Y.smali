.class public final Lf4/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/S0;


# instance fields
.field private final a:Lf4/W0;

.field private final b:Lf4/W0;


# direct methods
.method public constructor <init>(Lf4/W0;Lf4/W0;Lf4/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/Y;->a:Lf4/W0;

    iput-object p3, p0, Lf4/Y;->b:Lf4/W0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf4/Y;->b()Lf4/X;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lf4/X;
    .locals 4

    iget-object v0, p0, Lf4/Y;->a:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/Z;

    invoke-static {}, Lf4/t;->b()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lf4/Y;->b:Lf4/W0;

    check-cast v2, Lf4/f0;

    invoke-virtual {v2}, Lf4/f0;->b()Lf4/e0;

    move-result-object v2

    new-instance v3, Lf4/X;

    invoke-direct {v3, v0, v1, v2}, Lf4/X;-><init>(Lf4/Z;Landroid/os/Handler;Lf4/e0;)V

    return-object v3
.end method
