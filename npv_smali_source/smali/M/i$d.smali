.class final LM/i$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


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

    iput-object p1, p0, LM/i$d;->D:LM/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Z)Ljava/lang/Boolean;
    .locals 1

    .prologue
    iget-object v0, p0, LM/i$d;->D:LM/i;

    invoke-static {v0}, LM/i;->X1(LM/i;)LM/i$a;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    iget-object v0, p0, LM/i$d;->D:LM/i;

    invoke-static {v0}, LM/i;->X1(LM/i;)LM/i$a;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, LM/i$a;->e(Z)V

    :goto_0
    iget-object p1, p0, LM/i$d;->D:LM/i;

    invoke-static {p1}, LM/i;->Y1(LM/i;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, LM/i$d;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
