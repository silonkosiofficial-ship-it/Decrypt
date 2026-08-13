.class public final synthetic Ls3/C1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Ls3/D1;


# direct methods
.method public synthetic constructor <init>(Ls3/D1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/C1;->C:Ls3/D1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ls3/C1;->C:Ls3/D1;

    invoke-virtual {v0}, Ls3/D1;->b()V

    return-void
.end method
