.class final LM/i$c;
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

    iput-object p1, p0, LM/i$c;->D:LM/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LM0/d;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LM/i$c;->D:LM/i;

    invoke-virtual {p1}, LM0/d;->i()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, LM/i;->Z1(LM/i;Ljava/lang/String;)Z

    iget-object p1, p0, LM/i$c;->D:LM/i;

    invoke-static {p1}, LM/i;->Y1(LM/i;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM0/d;

    invoke-virtual {p0, p1}, LM/i$c;->a(LM0/d;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
