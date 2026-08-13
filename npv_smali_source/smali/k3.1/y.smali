.class public final synthetic Lk3/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lk3/f;

.field public final synthetic D:Ls3/f1;


# direct methods
.method public synthetic constructor <init>(Lk3/f;Ls3/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/y;->C:Lk3/f;

    iput-object p2, p0, Lk3/y;->D:Ls3/f1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk3/y;->C:Lk3/f;

    iget-object v1, p0, Lk3/y;->D:Ls3/f1;

    invoke-virtual {v0, v1}, Lk3/f;->b(Ls3/f1;)V

    return-void
.end method
