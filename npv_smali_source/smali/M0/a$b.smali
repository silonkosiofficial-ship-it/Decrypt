.class final LM0/a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM0/a;->d(Ln0/i;ILM0/I;)J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LM0/I;


# direct methods
.method constructor <init>(LM0/I;)V
    .locals 0

    iput-object p1, p0, LM0/a$b;->D:LM0/I;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/RectF;Landroid/graphics/RectF;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LM0/a$b;->D:LM0/I;

    invoke-static {p1}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object p1

    invoke-static {p2}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object p2

    invoke-interface {v0, p1, p2}, LM0/I;->a(Ln0/i;Ln0/i;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/graphics/RectF;

    check-cast p2, Landroid/graphics/RectF;

    invoke-virtual {p0, p1, p2}, LM0/a$b;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
