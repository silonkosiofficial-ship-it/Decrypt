.class LB4/d$a;
.super Landroidx/core/content/res/h$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB4/d;->g(Landroid/content/Context;LB4/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LB4/f;

.field final synthetic b:LB4/d;


# direct methods
.method constructor <init>(LB4/d;LB4/f;)V
    .locals 0

    iput-object p1, p0, LB4/d$a;->b:LB4/d;

    iput-object p2, p0, LB4/d$a;->a:LB4/f;

    invoke-direct {p0}, Landroidx/core/content/res/h$e;-><init>()V

    return-void
.end method


# virtual methods
.method public h(I)V
    .locals 2

    iget-object v0, p0, LB4/d$a;->b:LB4/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LB4/d;->c(LB4/d;Z)Z

    iget-object v0, p0, LB4/d$a;->a:LB4/f;

    invoke-virtual {v0, p1}, LB4/f;->a(I)V

    return-void
.end method

.method public i(Landroid/graphics/Typeface;)V
    .locals 2

    iget-object v0, p0, LB4/d$a;->b:LB4/d;

    iget v1, v0, LB4/d;->e:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-static {v0, p1}, LB4/d;->b(LB4/d;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, LB4/d$a;->b:LB4/d;

    const/4 v0, 0x1

    invoke-static {p1, v0}, LB4/d;->c(LB4/d;Z)Z

    iget-object p1, p0, LB4/d$a;->a:LB4/f;

    iget-object v0, p0, LB4/d$a;->b:LB4/d;

    invoke-static {v0}, LB4/d;->a(LB4/d;)Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, LB4/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
