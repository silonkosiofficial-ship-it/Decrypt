.class final LR0/j$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR0/j;-><init>(LR0/w;LR0/y;LR0/G;LR0/m;LR0/v;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LR0/j;


# direct methods
.method constructor <init>(LR0/j;)V
    .locals 0

    iput-object p1, p0, LR0/j$a;->D:LR0/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LR0/F;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LR0/j$a;->D:LR0/j;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, LR0/F;->b(LR0/F;LR0/h;LR0/q;IILjava/lang/Object;ILjava/lang/Object;)LR0/F;

    move-result-object p1

    invoke-static {v0, p1}, LR0/j;->e(LR0/j;LR0/F;)LV/G1;

    move-result-object p1

    invoke-interface {p1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR0/F;

    invoke-virtual {p0, p1}, LR0/j$a;->a(LR0/F;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
