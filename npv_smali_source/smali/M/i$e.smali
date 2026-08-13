.class final LM/i$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/i;->M0(LK0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LM/i;


# direct methods
.method constructor <init>(LM/i;)V
    .locals 0

    iput-object p1, p0, LM/i$e;->D:LM/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LM/i$e;->D:LM/i;

    invoke-static {v0}, LM/i;->T1(LM/i;)V

    iget-object v0, p0, LM/i$e;->D:LM/i;

    invoke-static {v0}, LM/i;->Y1(LM/i;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM/i$e;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
