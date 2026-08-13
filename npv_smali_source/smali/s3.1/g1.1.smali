.class public final synthetic Ls3/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Ls3/i1;

.field public final synthetic D:LX3/a;


# direct methods
.method public synthetic constructor <init>(Ls3/i1;LX3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/g1;->C:Ls3/i1;

    iput-object p2, p0, Ls3/g1;->D:LX3/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls3/g1;->C:Ls3/i1;

    iget-object v1, p0, Ls3/g1;->D:LX3/a;

    invoke-virtual {v0, v1}, Ls3/i1;->l(LX3/a;)V

    return-void
.end method
