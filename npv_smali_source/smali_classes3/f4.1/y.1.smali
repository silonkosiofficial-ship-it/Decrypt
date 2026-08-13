.class public final synthetic Lf4/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lf4/D;


# direct methods
.method public synthetic constructor <init>(Lf4/D;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/y;->C:Lf4/D;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    new-instance v0, Lf4/Z0;

    const/4 v1, 0x4

    const-string v2, "Web view timed out."

    invoke-direct {v0, v1, v2}, Lf4/Z0;-><init>(ILjava/lang/String;)V

    iget-object v1, p0, Lf4/y;->C:Lf4/D;

    invoke-virtual {v1, v0}, Lf4/D;->k(Lf4/Z0;)V

    return-void
.end method
