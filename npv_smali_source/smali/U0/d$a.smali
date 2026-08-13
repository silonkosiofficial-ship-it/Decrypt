.class final LU0/d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU0/d;-><init>(Ljava/lang/String;LM0/P;Ljava/util/List;Ljava/util/List;LR0/h$b;LY0/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LU0/d;


# direct methods
.method constructor <init>(LU0/d;)V
    .locals 0

    iput-object p1, p0, LU0/d$a;->D:LU0/d;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LR0/h;LR0/q;II)Landroid/graphics/Typeface;
    .locals 1

    .prologue
    iget-object v0, p0, LU0/d$a;->D:LU0/d;

    invoke-virtual {v0}, LU0/d;->g()LR0/h$b;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, LR0/h$b;->a(LR0/h;LR0/q;II)LV/G1;

    move-result-object p1

    instance-of p2, p1, LR0/H$a;

    if-nez p2, :cond_0

    new-instance p2, LU0/s;

    iget-object p3, p0, LU0/d$a;->D:LU0/d;

    invoke-static {p3}, LU0/d;->d(LU0/d;)LU0/s;

    move-result-object p3

    invoke-direct {p2, p1, p3}, LU0/s;-><init>(LV/G1;LU0/s;)V

    iget-object p1, p0, LU0/d$a;->D:LU0/d;

    invoke-static {p1, p2}, LU0/d;->e(LU0/d;LU0/s;)V

    invoke-virtual {p2}, LU0/s;->a()Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.graphics.Typeface"

    invoke-static {p1, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/graphics/Typeface;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR0/h;

    check-cast p2, LR0/q;

    check-cast p3, LR0/o;

    invoke-virtual {p3}, LR0/o;->i()I

    move-result p3

    check-cast p4, LR0/p;

    invoke-virtual {p4}, LR0/p;->k()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LU0/d$a;->a(LR0/h;LR0/q;II)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method
